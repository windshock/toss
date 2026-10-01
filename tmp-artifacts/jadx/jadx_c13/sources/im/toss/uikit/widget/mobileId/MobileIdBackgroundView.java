package im.toss.uikit.widget.mobileId;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.uikit.widget.mobileId.MobileIdBackgroundView$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GeckoHubImp1;
import o.M_;
import o.ResourceCallback;
import o.access13800;
import o.access14100;
import o.access15300;
import o.access15400;
import o.collectAnrDetailsbugsnag_plugin_android_anr_release;
import o.findResAndMsg;
import o.generateInviteUrl;
import o.generateLink;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.getWrite;
import o.hasVaryAll;
import o.onLoadStarted;
import o.putChannelInfo;
import o.readIntokhttp;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class MobileIdBackgroundView extends GLSurfaceView {
    private static int asInterface = 1;
    private static int onTransact;
    private final Lazy IAuthTabCallback;
    private final Lazy onExtraCallback;
    private final Map<onExtraCallbackWithResult, collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult> onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private collectAnrDetailsbugsnag_plugin_android_anr_release onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MobileIdBackgroundView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ float IAuthTabCallback(Context context) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return fOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i5));
        int i12 = i8 | i2;
        int i13 = ~(i12 | i4);
        int i14 = (~(i5 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i2 + i4 + i + (1650861130 * i6) + ((-924421097) * i3);
        int i16 = i15 * i15;
        int i17 = (i2 * (-405912681)) + 1474035712 + ((-405912681) * i4) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i) + (986710016 * i6) + ((-948436992) * i3) + ((-1864630272) * i16);
        int i18 = ((i2 * (-959335331)) - 587927435) + (i4 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + (i * (-959334869)) + (i6 * 22983790) + (i3 * 637852125) + (i16 * (-1124859904));
        int i19 = i17 + (i18 * i18 * (-1807482880));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(function0);
        }
        onNavigationEvent(function0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(MobileIdBackgroundView mobileIdBackgroundView) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {mobileIdBackgroundView};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback4 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        if (i3 == 0) {
            ((Boolean) IAuthTabCallback(iIAuthTabCallback2, -1998707539, iIAuthTabCallback4, 1998707543, iIAuthTabCallback, objArr, iIAuthTabCallback3)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iIAuthTabCallback2, -1998707539, iIAuthTabCallback4, 1998707543, iIAuthTabCallback, objArr, iIAuthTabCallback3)).booleanValue();
        int i4 = onTransact + 79;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 69;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i3 = asInterface + 33;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onExtraCallback(MobileIdBackgroundView mobileIdBackgroundView) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(mobileIdBackgroundView);
        int i4 = asInterface + 49;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(function0);
        }
        onExtraCallback(function0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface();
        int i4 = asInterface + 71;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float fOnTransact = onTransact();
        int i4 = onTransact + 81;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return fOnTransact;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileIdBackgroundView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new MobileIdBackgroundView$.ExternalSyntheticLambda0(this));
        this.onExtraCallbackWithResult = new LinkedHashMap();
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new MobileIdBackgroundView$.ExternalSyntheticLambda1());
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new MobileIdBackgroundView$.ExternalSyntheticLambda2(context));
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setZOrderMediaOverlay(true);
        getHolder().setFormat(-3);
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (IAuthTabCallbackStub()) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iIntValue = new getUrlokhttp(new onExtraCallback(configuration)).access200();
            int i = asInterface + 123;
            onTransact = i % 128;
            if (i % 2 == 0) {
            }
            collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = new collectAnrDetailsbugsnag_plugin_android_anr_release(this, zIAuthTabCallbackStub, Integer.valueOf(iIntValue));
            this.onWarmupCompleted = collectanrdetailsbugsnag_plugin_android_anr_release;
            setRenderer(collectanrdetailsbugsnag_plugin_android_anr_release);
            setRenderMode(0);
            setPreserveEGLContextOnPause(true);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        Object[] objArr = {new getUrlokhttp(new IAuthTabCallback(configuration2))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        int i2 = asInterface + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 2 % 2;
        collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release2 = new collectAnrDetailsbugsnag_plugin_android_anr_release(this, zIAuthTabCallbackStub, Integer.valueOf(iIntValue));
        this.onWarmupCompleted = collectanrdetailsbugsnag_plugin_android_anr_release2;
        setRenderer(collectanrdetailsbugsnag_plugin_android_anr_release2);
        setRenderMode(0);
        setPreserveEGLContextOnPause(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MobileIdBackgroundView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = asInterface;
            int i3 = i2 + 83;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 59;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        MobileIdBackgroundView mobileIdBackgroundView = (MobileIdBackgroundView) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Map<onExtraCallbackWithResult, collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult> map = mobileIdBackgroundView.onExtraCallbackWithResult;
        if (i3 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(MobileIdBackgroundView mobileIdBackgroundView, List list, Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        IAuthTabCallback(iIAuthTabCallback2, 166965851, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -166965850, iIAuthTabCallback, new Object[]{mobileIdBackgroundView, list, function0}, iIAuthTabCallback3);
        int i4 = asInterface + 83;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MobileIdBackgroundView mobileIdBackgroundView = (MobileIdBackgroundView) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[2];
        Function0<Unit> function0 = (Function0) objArr[3];
        int i = 2 % 2;
        int i2 = onTransact + 51;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        mobileIdBackgroundView.onExtraCallback(bitmap, onextracallbackwithresult, function0);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.onExtraCallback.getValue()).booleanValue();
        int i4 = asInterface + 109;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MobileIdBackgroundView mobileIdBackgroundView = (MobileIdBackgroundView) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = mobileIdBackgroundView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (i3 == 0) {
            generateLink.IAuthTabCallback(resources);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallback = generateLink.IAuthTabCallback(resources);
        int i4 = asInterface + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zIAuthTabCallback);
    }

    private final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.onNavigationEvent.getValue()).floatValue();
        int i4 = asInterface + 41;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static final float onTransact() {
        float fAsInterface;
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            fAsInterface = M_.onExtraCallback.asInterface();
            int i3 = 93 / 0;
        } else {
            fAsInterface = M_.onExtraCallback.asInterface();
        }
        int i4 = onTransact + 35;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return fAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.IAuthTabCallback.getValue()).floatValue();
        int i4 = asInterface + 29;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return fFloatValue;
    }

    private static final float onExtraCallbackWithResult(Context context) throws Resources.NotFoundException {
        WindowManager windowManager;
        int iAccess000;
        int i = 2 % 2;
        Activity activityOnExtraCallback = hasVaryAll.onExtraCallback(context);
        if (activityOnExtraCallback != null) {
            int i2 = asInterface + 119;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                windowManager = activityOnExtraCallback.getWindowManager();
                int i3 = 43 / 0;
            } else {
                windowManager = activityOnExtraCallback.getWindowManager();
            }
        } else {
            windowManager = null;
        }
        if (windowManager != null) {
            int i4 = onTransact + 31;
            asInterface = i4 % 128;
            if (i4 % 2 != 0 ? Build.VERSION.SDK_INT < 30 : Build.VERSION.SDK_INT < 97) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                iAccess000 = displayMetrics.heightPixels;
            } else {
                int i5 = asInterface + 61;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                iAccess000 = windowManager.getCurrentWindowMetrics().getBounds().height();
            }
        } else {
            M_ m_ = M_.onExtraCallback;
            iAccess000 = m_.access000() + m_.IAuthTabCallbackDefault() + m_.onExtraCallbackWithResult();
        }
        float f = iAccess000;
        int i7 = asInterface + 103;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return f;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.mobileId.MobileIdBackgroundView.IAuthTabCallback.onNavigationEvent + 37;
            im.toss.uikit.widget.mobileId.MobileIdBackgroundView.IAuthTabCallback.onExtraCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            if ((r2 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            r0 = 42 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onWarmupCompleted) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 81 / 0;
            }
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public onExtraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallbackWithResult + 99;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return getspecialfeatureoptinstatus;
            }
            throw null;
        }
    }

    private static final Unit asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 39;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 87;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MobileIdBackgroundView mobileIdBackgroundView = (MobileIdBackgroundView) objArr[0];
        findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[2];
        String str = (String) objArr[3];
        Function0 function0 = (Function0) objArr[4];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        onLoadStarted.onExtraCallback(findresandmsg, null, null, mobileIdBackgroundView.new onWarmupCompleted(onextracallbackwithresult, function0, str, null), 3, null);
        int i2 = asInterface + 119;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $backgroundUrl;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ onExtraCallbackWithResult $targetType;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, Function0<Unit> function0, String str, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$targetType = onextracallbackwithresult;
            this.$onComplete = function0;
            this.$backgroundUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = MobileIdBackgroundView.this.new onWarmupCompleted(this.$targetType, this.$onComplete, this.$backgroundUrl, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onWarmupCompleted + 37;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 88 / 0;
            }
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i4 = onWarmupCompleted + 123;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onwarmupcompleted.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompleted.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        /* renamed from: im.toss.uikit.widget.mobileId.MobileIdBackgroundView$onWarmupCompleted$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Bitmap>, Object> {
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ String $backgroundUrl;
            int label;
            final /* synthetic */ MobileIdBackgroundView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(MobileIdBackgroundView mobileIdBackgroundView, String str, access13800<? super AnonymousClass4> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdBackgroundView;
                this.$backgroundUrl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$backgroundUrl, access13800Var);
                int i2 = onWarmupCompleted + 91;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 19;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i4 = onExtraCallback + 85;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Bitmap> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 105;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                if (i3 != 0) {
                    int i4 = 89 / 0;
                }
                int i5 = onExtraCallback + 125;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 86 / 0;
                }
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 103;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    access14100.onExtraCallback();
                    throw null;
                }
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    MobileIdBackgroundView mobileIdBackgroundView = this.this$0;
                    String str = this.$backgroundUrl;
                    this.label = 1;
                    Object objOnExtraCallbackWithResult = generateInviteUrl.onExtraCallbackWithResult(mobileIdBackgroundView, str, null, null, this, 6, null);
                    return objOnExtraCallbackWithResult == objOnExtraCallback ? objOnExtraCallback : objOnExtraCallbackWithResult;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallback + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.onNavigationEvent(obj);
                int i6 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return obj;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objIAuthTabCallback;
            MobileIdBackgroundView mobileIdBackgroundView;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                Object[] objArr = {MobileIdBackgroundView.this};
                int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                if (((Map) MobileIdBackgroundView.IAuthTabCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -781501286, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 781501288, iIAuthTabCallback, objArr, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback())).keySet().contains(this.$targetType)) {
                    this.$onComplete.invoke();
                    return Unit.INSTANCE;
                }
                MobileIdBackgroundView mobileIdBackgroundView2 = MobileIdBackgroundView.this;
                GeckoHubImp1 geckoHubImp1OnWarmupCompleted = onLoadStarted.onWarmupCompleted(findresandmsg, null, null, new AnonymousClass4(mobileIdBackgroundView2, this.$backgroundUrl, null), 3, null);
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = mobileIdBackgroundView2;
                this.label = 1;
                objIAuthTabCallback = geckoHubImp1OnWarmupCompleted.IAuthTabCallback(this);
                if (objIAuthTabCallback == objOnExtraCallback) {
                    int i3 = onWarmupCompleted + 59;
                    int i4 = i3 % 128;
                    onExtraCallback = i4;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    int i5 = i4 + 81;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return objOnExtraCallback;
                }
                mobileIdBackgroundView = mobileIdBackgroundView2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mobileIdBackgroundView = (MobileIdBackgroundView) this.L$1;
                ResultKt.onNavigationEvent(obj);
                objIAuthTabCallback = obj;
            }
            Object[] objArr2 = {mobileIdBackgroundView, (Bitmap) objIAuthTabCallback, this.$targetType, this.$onComplete};
            int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            MobileIdBackgroundView.IAuthTabCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 442113343, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -442113340, iIAuthTabCallback2, objArr2, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(MobileIdBackgroundView mobileIdBackgroundView, findResAndMsg findresandmsg, List list, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: im.toss.uikit.widget.mobileId.MobileIdBackgroundView$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 67;
                    IAuthTabCallback = i6 % 128;
                    Object obj2 = null;
                    if (i6 % 2 == 0) {
                        MobileIdBackgroundView.onExtraCallback();
                        obj2.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = MobileIdBackgroundView.onExtraCallback();
                    int i7 = IAuthTabCallback + 57;
                    onExtraCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    obj2.hashCode();
                    throw null;
                }
            };
            int i5 = asInterface + 59;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        mobileIdBackgroundView.onExtraCallbackWithResult(findresandmsg, list, function0);
    }

    private static final Unit IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 43;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull findResAndMsg findresandmsg, @NotNull List<? extends Pair<? extends onExtraCallbackWithResult, String>> list, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        onLoadStarted.onExtraCallback(findresandmsg, null, null, new onNavigationEvent(list, function0, this, null), 3, null);
        int i2 = onTransact + 67;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0<Unit> $onComplete;
        final /* synthetic */ List<Pair<onExtraCallbackWithResult, String>> $targets;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MobileIdBackgroundView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(List<? extends Pair<? extends onExtraCallbackWithResult, String>> list, Function0<Unit> function0, MobileIdBackgroundView mobileIdBackgroundView, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$targets = list;
            this.$onComplete = function0;
            this.this$0 = mobileIdBackgroundView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$targets, this.$onComplete, this.this$0, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i4 = onExtraCallbackWithResult + 33;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 81 / 0;
            }
            int i5 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends onExtraCallbackWithResult, ? extends Bitmap>>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ onExtraCallbackWithResult $type;
            final /* synthetic */ String $url;
            int label;
            final /* synthetic */ MobileIdBackgroundView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(MobileIdBackgroundView mobileIdBackgroundView, String str, onExtraCallbackWithResult onextracallbackwithresult, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = mobileIdBackgroundView;
                this.$url = str;
                this.$type = onextracallbackwithresult;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Pair<? extends onExtraCallbackWithResult, Bitmap>> access13800Var) {
                Object objInvokeSuspend;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) create(findresandmsg, access13800Var);
                if (i3 != 0) {
                    objInvokeSuspend = onextracallbackwithresult.invokeSuspend(Unit.INSTANCE);
                    int i4 = 75 / 0;
                } else {
                    objInvokeSuspend = onextracallbackwithresult.invokeSuspend(Unit.INSTANCE);
                }
                int i5 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, this.$url, this.$type, access13800Var);
                int i2 = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Pair<? extends onExtraCallbackWithResult, ? extends Bitmap>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 29;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg2 = findresandmsg;
                access13800<? super Pair<? extends onExtraCallbackWithResult, ? extends Bitmap>> access13800Var2 = access13800Var;
                if (i2 % 2 == 0) {
                    return IAuthTabCallback(findresandmsg2, access13800Var2);
                }
                IAuthTabCallback(findresandmsg2, access13800Var2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    MobileIdBackgroundView mobileIdBackgroundView = this.this$0;
                    String str = this.$url;
                    this.label = 1;
                    obj = generateInviteUrl.onExtraCallbackWithResult(mobileIdBackgroundView, str, null, null, this, 6, null);
                    if (obj == objOnExtraCallback) {
                        int i5 = onWarmupCompleted + 37;
                        onExtraCallbackWithResult = i5 % 128;
                        if (i5 % 2 != 0) {
                            return objOnExtraCallback;
                        }
                        throw null;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = onExtraCallbackWithResult + 93;
                    onWarmupCompleted = i6 % 128;
                    if (i6 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i7 = 63 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                }
                return getWrite.IAuthTabCallback(this.$type, (Bitmap) obj);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MobileIdBackgroundView mobileIdBackgroundView;
            Object objIAuthTabCallback;
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                List<Pair<onExtraCallbackWithResult, String>> list = this.$targets;
                MobileIdBackgroundView mobileIdBackgroundView2 = this.this$0;
                ArrayList<Pair> arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                int i3 = onNavigationEvent + 41;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                while (true) {
                    Object obj2 = null;
                    if (it.hasNext()) {
                        int i5 = onNavigationEvent + 11;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        Object next = it.next();
                        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
                        if (!((Map) MobileIdBackgroundView.IAuthTabCallback(iIAuthTabCallback2, -781501286, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 781501288, iIAuthTabCallback, new Object[]{mobileIdBackgroundView2}, iIAuthTabCallback3)).keySet().contains(((Pair) next).getFirst())) {
                            int i7 = onExtraCallbackWithResult + 113;
                            onNavigationEvent = i7 % 128;
                            if (i7 % 2 != 0) {
                                arrayList.add(next);
                                obj2.hashCode();
                                throw null;
                            }
                            arrayList.add(next);
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            this.$onComplete.invoke();
                            return Unit.INSTANCE;
                        }
                        MobileIdBackgroundView mobileIdBackgroundView3 = this.this$0;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        for (Pair pair : arrayList) {
                            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) pair.onExtraCallbackWithResult();
                            arrayList2.add(onLoadStarted.onWarmupCompleted(findresandmsg, putChannelInfo.IAuthTabCallback(), null, new onExtraCallbackWithResult(mobileIdBackgroundView3, (String) pair.IAuthTabCallback(), onextracallbackwithresult, null), 2, null));
                        }
                        mobileIdBackgroundView = this.this$0;
                        this.L$0 = access15400.onNavigationEvent(findresandmsg);
                        this.L$1 = access15400.onNavigationEvent(arrayList);
                        this.L$2 = access15400.onNavigationEvent(arrayList2);
                        this.L$3 = mobileIdBackgroundView;
                        this.label = 1;
                        objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList2, this);
                        if (objIAuthTabCallback == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mobileIdBackgroundView = (MobileIdBackgroundView) this.L$3;
                ResultKt.onNavigationEvent(obj);
                objIAuthTabCallback = obj;
            }
            MobileIdBackgroundView.IAuthTabCallback(mobileIdBackgroundView, (List) objIAuthTabCallback, this.$onComplete);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 37;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(Bitmap bitmap, onExtraCallbackWithResult onextracallbackwithresult, final Function0<Unit> function0) {
        int i = 2 % 2;
        if (bitmap != null) {
            this.onExtraCallbackWithResult.put(onextracallbackwithresult, new collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult(bitmap, (bitmap.getWidth() / bitmap.getHeight()) * onExtraCallbackWithResult(), onExtraCallbackWithResult(), 0.0f, IAuthTabCallback() / 2.0f, onExtraCallbackWithResult() / 2.0f, 0.0f, 0.0f, 0.0f, onextracallbackwithresult.name(), 328, null));
            int i2 = onTransact + 125;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        }
        collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = this.onWarmupCompleted;
        if (collectanrdetailsbugsnag_plugin_android_anr_release != null) {
            Map<onExtraCallbackWithResult, collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult> map = this.onExtraCallbackWithResult;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator<Map.Entry<onExtraCallbackWithResult, collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                int i4 = asInterface + 109;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(it.next().getValue());
                    int i5 = 49 / 0;
                } else {
                    arrayList.add(it.next().getValue());
                }
            }
            collectanrdetailsbugsnag_plugin_android_anr_release.onExtraCallback(arrayList, new Function0() { // from class: im.toss.uikit.widget.mobileId.MobileIdBackgroundView$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = IAuthTabCallback + 85;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unitIAuthTabCallback = MobileIdBackgroundView.IAuthTabCallback(function0);
                    if (i8 == 0) {
                        int i9 = 72 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            });
        }
        function0.invoke();
    }

    private static final Unit onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MobileIdBackgroundView mobileIdBackgroundView = (MobileIdBackgroundView) objArr[0];
        List<Pair> list = (List) objArr[1];
        final Function0 function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 49;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            for (Pair pair : list) {
                int i3 = asInterface + 81;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                Bitmap bitmap = (Bitmap) pair.getSecond();
                if (bitmap != null) {
                    mobileIdBackgroundView.onExtraCallbackWithResult.put(pair.getFirst(), new collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult(bitmap, (bitmap.getWidth() / bitmap.getHeight()) * mobileIdBackgroundView.onExtraCallbackWithResult(), mobileIdBackgroundView.onExtraCallbackWithResult(), 0.0f, mobileIdBackgroundView.IAuthTabCallback() / 2.0f, mobileIdBackgroundView.onExtraCallbackWithResult() / 2.0f, 0.0f, 0.0f, 0.0f, ((onExtraCallbackWithResult) pair.getFirst()).name(), 328, null));
                }
            }
            collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = mobileIdBackgroundView.onWarmupCompleted;
            if (collectanrdetailsbugsnag_plugin_android_anr_release != null) {
                Map<onExtraCallbackWithResult, collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult> map = mobileIdBackgroundView.onExtraCallbackWithResult;
                ArrayList arrayList = new ArrayList(map.size());
                Iterator<Map.Entry<onExtraCallbackWithResult, collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue());
                }
                collectanrdetailsbugsnag_plugin_android_anr_release.onExtraCallback(arrayList, new Function0() { // from class: im.toss.uikit.widget.mobileId.MobileIdBackgroundView$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = IAuthTabCallback + 97;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitOnExtraCallbackWithResult = MobileIdBackgroundView.onExtraCallbackWithResult(function0);
                        int i8 = onNavigationEvent + 89;
                        IAuthTabCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            int i9 = 2 / 0;
                        }
                        return unitOnExtraCallbackWithResult;
                    }
                });
                int i5 = onTransact + 45;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            }
            function0.invoke();
            return null;
        }
        list.iterator();
        throw null;
    }

    public final void onNavigationEvent(@NotNull onExtraCallbackWithResult onextracallbackwithresult, float f) {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = this.onWarmupCompleted;
        if (collectanrdetailsbugsnag_plugin_android_anr_release != null) {
            collectanrdetailsbugsnag_plugin_android_anr_release.onWarmupCompleted(onextracallbackwithresult.name(), f);
            int i4 = onTransact + 27;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void onExtraCallbackWithResult(MobileIdBackgroundView mobileIdBackgroundView) {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = mobileIdBackgroundView.onWarmupCompleted;
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (collectanrdetailsbugsnag_plugin_android_anr_release != null) {
            collectanrdetailsbugsnag_plugin_android_anr_release.onExtraCallback();
        }
        int i4 = asInterface + 81;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult DRIVER = new onExtraCallbackWithResult("DRIVER", 0);
        public static final onExtraCallbackWithResult ID = new onExtraCallbackWithResult("ID", 1);
        public static final onExtraCallbackWithResult NATIONAL = new onExtraCallbackWithResult("NATIONAL", 2);
        public static final onExtraCallbackWithResult FOREIGN = new onExtraCallbackWithResult("FOREIGN", 3);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 47;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {DRIVER, ID, NATIONAL, FOREIGN};
            int i5 = i2 + 85;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 115;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i3 + 87;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = onNavigationEvent + 15;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 85;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i3 = onNavigationEvent + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = IAuthTabCallback + 71;
            onWarmupCompleted = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    public static final /* synthetic */ Map onNavigationEvent(MobileIdBackgroundView mobileIdBackgroundView) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Map) IAuthTabCallback(iIAuthTabCallback2, -781501286, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 781501288, iIAuthTabCallback, new Object[]{mobileIdBackgroundView}, iIAuthTabCallback3);
    }

    public static final /* synthetic */ void onWarmupCompleted(MobileIdBackgroundView mobileIdBackgroundView, Bitmap bitmap, onExtraCallbackWithResult onextracallbackwithresult, Function0 function0) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        IAuthTabCallback(iIAuthTabCallback2, 442113343, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -442113340, iIAuthTabCallback, new Object[]{mobileIdBackgroundView, bitmap, onextracallbackwithresult, function0}, iIAuthTabCallback3);
    }

    private static final boolean onWarmupCompleted(MobileIdBackgroundView mobileIdBackgroundView) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return ((Boolean) IAuthTabCallback(iIAuthTabCallback2, -1998707539, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), 1998707543, iIAuthTabCallback, new Object[]{mobileIdBackgroundView}, iIAuthTabCallback3)).booleanValue();
    }

    private final void onNavigationEvent(List<? extends Pair<? extends onExtraCallbackWithResult, Bitmap>> list, Function0<Unit> function0) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        IAuthTabCallback(iIAuthTabCallback2, 166965851, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -166965850, iIAuthTabCallback, new Object[]{this, list, function0}, iIAuthTabCallback3);
    }

    public final void onExtraCallback(@NotNull findResAndMsg findresandmsg, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull String str, @NotNull Function0<Unit> function0) {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        IAuthTabCallback(iIAuthTabCallback2, 961580568, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), -961580568, iIAuthTabCallback, new Object[]{this, findresandmsg, onextracallbackwithresult, str, function0}, iIAuthTabCallback3);
    }
}
