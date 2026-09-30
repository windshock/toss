package im.toss.uikit.widget.gl;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.SurfaceHolder;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.ConvertFloatArrayToByteArray;
import o.M_;
import o.TextFieldPressGestureFilterKtExternalSyntheticLambda0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TimeoutCompanionNONE1;
import o.access13800;
import o.access14000;
import o.access14100;
import o.access15400;
import o.findResAndMsg;
import o.generateInviteUrl;
import o.generateLink;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.onEventListenerRemoved;
import o.onLoadStarted;
import o.readIntokhttp;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class AnimateMaskedImageView extends GLSurfaceView {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private String IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private int asInterface;
    private onEventListenerRemoved onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private float onNavigationEvent;
    private int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateMaskedImageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(AnimateMaskedImageView animateMaskedImageView, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 89;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(animateMaskedImageView, f);
        int i4 = IAuthTabCallbackStub + 37;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(onEventListenerRemoved oneventlistenerremoved, AnimateMaskedImageView animateMaskedImageView) {
        int i = 2 % 2;
        int i2 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(oneventlistenerremoved, animateMaskedImageView);
        int i4 = IAuthTabCallbackStub + 27;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(AnimateMaskedImageView animateMaskedImageView, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(animateMaskedImageView, f);
        }
        onExtraCallbackWithResult(animateMaskedImageView, f);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AnimateMaskedImageView animateMaskedImageView = (AnimateMaskedImageView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(animateMaskedImageView, fFloatValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(animateMaskedImageView, fFloatValue);
        int i3 = IAuthTabCallbackStub + 27;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = (~(i2 | i3)) | i4;
        int i8 = i3 | i2 | i4;
        int i9 = ~i2;
        int i10 = i2 + i4 + i + ((-421447895) * i6) + ((-859425246) * i5);
        int i11 = i10 * i10;
        int i12 = (i2 * (-629045104)) + 1817116672 + ((-629045104) * i4) + (i7 * (-1407420559)) + ((-1407420559) * i8) + (1407420559 * i9) + ((-2036465664) * i) + ((-2125594624) * i6) + (888930304 * i5) + (441384960 * i11);
        int i13 = (i2 * 1303038832) + 2077918271 + (i4 * 1303038832) + (i7 * (-49)) + (i8 * (-49)) + (i9 * 49) + (i * 1303038783) + (i6 * 1583617559) + (i5 * (-1102559138)) + (i11 * 510722048);
        int i14 = i12 + (i13 * i13 * 607191040);
        if (i14 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i14 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i14 != 3) {
            return i14 != 4 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }
        int i15 = 2 % 2;
        DisplayMetrics displayMetrics = ((AnimateMaskedImageView) objArr[0]).getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        if (displayMetrics.widthPixels / displayMetrics.density < 500.0f) {
            return 3;
        }
        int i16 = onTransact;
        int i17 = i16 + 115;
        IAuthTabCallbackStub = i17 % 128;
        int i18 = i17 % 2;
        int i19 = i16 + 83;
        IAuthTabCallbackStub = i19 % 128;
        int i20 = i19 % 2;
        return 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(AnimateMaskedImageView animateMaskedImageView, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(animateMaskedImageView, f);
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        int i5 = IAuthTabCallbackStub + 53;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallback(function0);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 35;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateMaskedImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = true;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Object[] objArr = {new getUrlokhttp(new onExtraCallback(configuration))};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        this.onWarmupCompleted = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        onExtraCallbackWithResult();
        M_ m_ = M_.onExtraCallback;
        int iAsInterface = m_.asInterface();
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        this.IAuthTabCallbackDefault = iAsInterface * ((Integer) onNavigationEvent(iOnWarmupCompleted2, 1135725072, iOnWarmupCompleted, -1135725069, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this})).intValue();
        int iAsInterface2 = m_.asInterface();
        int iOnWarmupCompleted4 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted5 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted6 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        this.asInterface = iAsInterface2 * ((Integer) onNavigationEvent(iOnWarmupCompleted5, 1135725072, iOnWarmupCompleted4, -1135725069, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted6, new Object[]{this})).intValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnimateMaskedImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallbackStub + 119;
            onTransact = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public static final /* synthetic */ onEventListenerRemoved IAuthTabCallback(AnimateMaskedImageView animateMaskedImageView) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        onEventListenerRemoved oneventlistenerremoved = animateMaskedImageView.onExtraCallback;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 35;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return oneventlistenerremoved;
    }

    public static final /* synthetic */ int onExtraCallbackWithResult(AnimateMaskedImageView animateMaskedImageView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = animateMaskedImageView.asInterface;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ int onNavigationEvent(AnimateMaskedImageView animateMaskedImageView) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 61;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = animateMaskedImageView.IAuthTabCallbackDefault;
        int i6 = i2 + 83;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static final /* synthetic */ String onWarmupCompleted(AnimateMaskedImageView animateMaskedImageView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        String str = animateMaskedImageView.IAuthTabCallback;
        int i5 = i2 + 123;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOnTop(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 119;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 43;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 31;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onNavigationEvent;
        int i5 = i2 + 47;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAlphaFactor(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 119;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.onNavigationEvent = f;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 45;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.onWarmupCompleted;
        if (i3 == 0) {
            int i5 = 25 / 0;
        }
        return i4;
    }

    public void setDotColor(int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 109;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult() {
        int iIntValue;
        int i = 2 % 2;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (generateLink.IAuthTabCallback(resources)) {
            int i2 = IAuthTabCallbackStub + 5;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                Color.parseColor("#892C485B");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iIntValue = Color.parseColor("#892C485B");
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Object[] objArr = {new getUrlokhttp(new onWarmupCompleted(configuration))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
        }
        setDotColor(iIntValue);
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        if (!IAuthTabCallback()) {
            setZOrderMediaOverlay(true);
        } else {
            int i3 = onTransact + 35;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            setZOrderOnTop(true);
        }
        getHolder().setFormat(-3);
        setPreserveEGLContextOnPause(true);
    }

    public final void IAuthTabCallback(int i) {
        onEventListenerRemoved oneventlistenerremoved;
        int i2 = 2 % 2;
        int i3 = onTransact + 29;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            oneventlistenerremoved = this.onExtraCallback;
            int i4 = 33 / 0;
            if (oneventlistenerremoved == null) {
                return;
            }
        } else {
            oneventlistenerremoved = this.onExtraCallback;
            if (oneventlistenerremoved == null) {
                return;
            }
        }
        oneventlistenerremoved.onWarmupCompleted(i);
        int i5 = IAuthTabCallbackStub + 37;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void setRenderer$default(AnimateMaskedImageView animateMaskedImageView, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRenderer");
        }
        int i4 = onTransact + 41;
        int i5 = i4 % 128;
        IAuthTabCallbackStub = i5;
        int i6 = i4 % 2;
        if ((i2 & 2) != 0) {
            int i7 = i5 + 33;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        animateMaskedImageView.setRenderer(i, z);
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                int i4 = onExtraCallback + 119;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i6 = onExtraCallback + 97;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                    int i3 = onNavigationEvent + 91;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    return getspecialfeatureoptinstatus;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                int i5 = onNavigationEvent + 29;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return getspecialfeatureoptinstatus2;
                }
                obj.hashCode();
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            obj.hashCode();
            throw null;
        }
    }

    public final void setRenderer(int i, boolean z) {
        int i2 = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        onEventListenerRemoved oneventlistenerremoved = new onEventListenerRemoved(this, context, i, onExtraCallback(), z);
        this.onExtraCallback = oneventlistenerremoved;
        setRenderer(oneventlistenerremoved);
        setRenderMode(0);
        int i3 = IAuthTabCallbackStub + 7;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final AnimateMaskedImageView animateMaskedImageView = (AnimateMaskedImageView) objArr[0];
        final float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        animateMaskedImageView.onExtraCallbackWithResult(new Function0() { // from class: im.toss.uikit.widget.gl.AnimateMaskedImageView$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    AnimateMaskedImageView.onExtraCallback(this.f$0, fFloatValue);
                    throw null;
                }
                Unit unitOnExtraCallback = AnimateMaskedImageView.onExtraCallback(this.f$0, fFloatValue);
                int i4 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallback;
            }
        });
        int i2 = IAuthTabCallbackStub + 99;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(AnimateMaskedImageView animateMaskedImageView, float f) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 101;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        onEventListenerRemoved oneventlistenerremoved = animateMaskedImageView.onExtraCallback;
        if (oneventlistenerremoved != null) {
            int i5 = i2 + 113;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                oneventlistenerremoved.onExtraCallback(f);
                throw null;
            }
            oneventlistenerremoved.onExtraCallback(f);
        }
        animateMaskedImageView.requestRender();
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final AnimateMaskedImageView animateMaskedImageView = (AnimateMaskedImageView) objArr[0];
        final float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        animateMaskedImageView.onExtraCallbackWithResult(new Function0() { // from class: im.toss.uikit.widget.gl.AnimateMaskedImageView$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 105;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = AnimateMaskedImageView.IAuthTabCallback(this.f$0, fFloatValue);
                int i5 = onExtraCallback + 83;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackStub + 69;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(AnimateMaskedImageView animateMaskedImageView, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onEventListenerRemoved oneventlistenerremoved = animateMaskedImageView.onExtraCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onEventListenerRemoved oneventlistenerremoved2 = animateMaskedImageView.onExtraCallback;
        if (oneventlistenerremoved2 != null) {
            oneventlistenerremoved2.onNavigationEvent(f);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStub + 125;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public final void onExtraCallbackWithResult(final float f) {
        int i = 2 % 2;
        onExtraCallbackWithResult(new Function0() { // from class: im.toss.uikit.widget.gl.AnimateMaskedImageView$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unitOnNavigationEvent;
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 61;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    unitOnNavigationEvent = AnimateMaskedImageView.onNavigationEvent(this.f$0, f);
                    int i4 = 86 / 0;
                } else {
                    unitOnNavigationEvent = AnimateMaskedImageView.onNavigationEvent(this.f$0, f);
                }
                int i5 = onWarmupCompleted + 43;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = onTransact + 39;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallbackDefault(AnimateMaskedImageView animateMaskedImageView, float f) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onEventListenerRemoved oneventlistenerremoved = animateMaskedImageView.onExtraCallback;
            if (oneventlistenerremoved != null) {
                Object[] objArr = {oneventlistenerremoved, Float.valueOf(f)};
                int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                onEventListenerRemoved.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), -882169453, objArr, iOnWarmupCompleted2, iOnWarmupCompleted, 882169453);
                int i3 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
            return Unit.INSTANCE;
        }
        onEventListenerRemoved oneventlistenerremoved2 = animateMaskedImageView.onExtraCallback;
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $imageUrl;
        final /* synthetic */ int $targetHeight;
        final /* synthetic */ int $targetWidth;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, int i, int i2, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$imageUrl = str;
            this.$targetWidth = i;
            this.$targetHeight = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = AnimateMaskedImageView.this.new onExtraCallbackWithResult(this.$imageUrl, this.$targetWidth, this.$targetHeight, access13800Var);
            int i2 = onWarmupCompleted + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onExtraCallback(findresandmsg2, access13800Var2);
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg2, access13800Var2);
            int i3 = 42 / 0;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onextracallbackwithresult.invokeSuspend(unit);
            }
            onextracallbackwithresult.invokeSuspend(unit);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objIAuthTabCallback;
            onEventListenerRemoved oneventlistenerremovedIAuthTabCallback;
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                AnimateMaskedImageView animateMaskedImageView = AnimateMaskedImageView.this;
                String str = this.$imageUrl;
                Integer numOnNavigationEvent = access14000.onNavigationEvent(this.$targetWidth);
                Integer numOnNavigationEvent2 = access14000.onNavigationEvent(this.$targetHeight);
                this.label = 1;
                objIAuthTabCallback = generateInviteUrl.IAuthTabCallback(animateMaskedImageView, str, numOnNavigationEvent, numOnNavigationEvent2, this);
                if (objIAuthTabCallback == objOnExtraCallback) {
                    int i3 = IAuthTabCallback + 115;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = IAuthTabCallback + 81;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                objIAuthTabCallback = obj;
            }
            Bitmap bitmap = (Bitmap) objIAuthTabCallback;
            if (bitmap != null && (oneventlistenerremovedIAuthTabCallback = AnimateMaskedImageView.IAuthTabCallback(AnimateMaskedImageView.this)) != null) {
                int i7 = IAuthTabCallback + 43;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    onEventListenerRemoved.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1639897735, new Object[]{oneventlistenerremovedIAuthTabCallback, bitmap}, iOnWarmupCompleted2, iOnWarmupCompleted, -1639897734);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                int iOnWarmupCompleted4 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                onEventListenerRemoved.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), 1639897735, new Object[]{oneventlistenerremovedIAuthTabCallback, bitmap}, iOnWarmupCompleted4, iOnWarmupCompleted3, -1639897734);
            }
            return Unit.INSTANCE;
        }
    }

    public final void setImageUrl(@NotNull String str, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallbackDefault = i;
        this.asInterface = i2;
        if (!isAttachedToWindow()) {
            this.IAuthTabCallback = str;
            return;
        }
        int i4 = onTransact + 91;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
            int i6 = IAuthTabCallbackStub + 39;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
                throw null;
            }
            TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult);
            if (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent != null) {
                onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new onExtraCallbackWithResult(str, i, i2, null), 3, null);
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        final AnimateMaskedImageView animateMaskedImageView = (AnimateMaskedImageView) objArr[0];
        final float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        animateMaskedImageView.onNavigationEvent = fFloatValue;
        animateMaskedImageView.onExtraCallbackWithResult(new Function0() { // from class: im.toss.uikit.widget.gl.AnimateMaskedImageView$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 19;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr2 = {this.f$0, Float.valueOf(fFloatValue)};
                    throw null;
                }
                Object[] objArr3 = {this.f$0, Float.valueOf(fFloatValue)};
                Unit unit = (Unit) AnimateMaskedImageView.onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1321424824, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1321424824, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr3);
                int i4 = onExtraCallbackWithResult + 99;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        int i2 = onTransact + 5;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final Unit onTransact(AnimateMaskedImageView animateMaskedImageView, float f) {
        int i = 2 % 2;
        onEventListenerRemoved oneventlistenerremoved = animateMaskedImageView.onExtraCallback;
        if (oneventlistenerremoved != null) {
            int i2 = IAuthTabCallbackStub + 51;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            oneventlistenerremoved.IAuthTabCallback(f);
            int i4 = IAuthTabCallbackStub + 53;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        animateMaskedImageView.requestRender();
        return Unit.INSTANCE;
    }

    private static final void onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        int i4 = IAuthTabCallbackStub + 19;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull final Function0<Unit> function0) {
        Surface surface;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        if (isAttachedToWindow()) {
            int i2 = onTransact + 63;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                getHolder();
                throw null;
            }
            SurfaceHolder holder = getHolder();
            if (holder != null && (surface = holder.getSurface()) != null && surface.isValid()) {
                try {
                    queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.AnimateMaskedImageView$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = 2 % 2;
                            int i4 = onExtraCallback + 91;
                            onWarmupCompleted = i4 % 128;
                            int i5 = i4 % 2;
                            AnimateMaskedImageView.onWarmupCompleted(function0);
                            if (i5 != 0) {
                                return;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    });
                    return;
                } catch (Exception e) {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "PinLoadingView", "Failed to queueEvent :: " + e, (Throwable) null, (Map) null, 12, (Object) null);
                }
            }
        }
        int i3 = onTransact + 41;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
    }

    public void asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 89;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        final onEventListenerRemoved oneventlistenerremoved = this.onExtraCallback;
        if (oneventlistenerremoved == null) {
            return;
        }
        this.onExtraCallback = null;
        onExtraCallbackWithResult(new Function0() { // from class: im.toss.uikit.widget.gl.AnimateMaskedImageView$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 51;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                onEventListenerRemoved oneventlistenerremoved2 = oneventlistenerremoved;
                if (i5 == 0) {
                    return AnimateMaskedImageView.IAuthTabCallback(oneventlistenerremoved2, this);
                }
                AnimateMaskedImageView.IAuthTabCallback(oneventlistenerremoved2, this);
                throw null;
            }
        });
        int i3 = onTransact + 27;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(onEventListenerRemoved oneventlistenerremoved, AnimateMaskedImageView animateMaskedImageView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        oneventlistenerremoved.onExtraCallback();
        animateMaskedImageView.requestRender();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 43;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        TextFieldPressGestureFilterKtExternalSyntheticLambda0 textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent;
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onAttachedToWindow();
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null || (textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent = TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult)) == null) {
                return;
            }
            onLoadStarted.onExtraCallback(textFieldPressGestureFilterKtExternalSyntheticLambda0OnNavigationEvent, null, null, new onNavigationEvent(null), 3, null);
            int i3 = IAuthTabCallbackStub + 39;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onAttachedToWindow();
        AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = AnimateMaskedImageView.this.new onNavigationEvent(access13800Var);
            int i2 = onNavigationEvent + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 19;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
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
            AnimateMaskedImageView animateMaskedImageView;
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                String strOnWarmupCompleted = AnimateMaskedImageView.onWarmupCompleted(AnimateMaskedImageView.this);
                if (strOnWarmupCompleted != null) {
                    AnimateMaskedImageView animateMaskedImageView2 = AnimateMaskedImageView.this;
                    Integer numOnNavigationEvent = access14000.onNavigationEvent(AnimateMaskedImageView.onNavigationEvent(animateMaskedImageView2));
                    Integer numOnNavigationEvent2 = access14000.onNavigationEvent(AnimateMaskedImageView.onExtraCallbackWithResult(animateMaskedImageView2));
                    this.L$0 = animateMaskedImageView2;
                    this.L$1 = access15400.onNavigationEvent(strOnWarmupCompleted);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = generateInviteUrl.IAuthTabCallback(animateMaskedImageView2, strOnWarmupCompleted, numOnNavigationEvent, numOnNavigationEvent2, this);
                    if (obj == objOnExtraCallback) {
                        int i3 = onExtraCallback + 41;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 == 0) {
                            return objOnExtraCallback;
                        }
                        throw null;
                    }
                    animateMaskedImageView = animateMaskedImageView2;
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            animateMaskedImageView = (AnimateMaskedImageView) this.L$0;
            ResultKt.onNavigationEvent(obj);
            int i4 = onNavigationEvent + 7;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                int i6 = onExtraCallback + 47;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                onEventListenerRemoved oneventlistenerremovedIAuthTabCallback = AnimateMaskedImageView.IAuthTabCallback(animateMaskedImageView);
                if (oneventlistenerremovedIAuthTabCallback != null) {
                    int iOnWarmupCompleted = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    int iOnWarmupCompleted2 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    int iOnWarmupCompleted3 = TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted();
                    onEventListenerRemoved.onNavigationEvent(TimeoutCompanionNONE1.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted3, 1639897735, new Object[]{oneventlistenerremovedIAuthTabCallback, bitmap}, iOnWarmupCompleted2, iOnWarmupCompleted, -1639897734);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(AnimateMaskedImageView animateMaskedImageView, float f) {
        Object[] objArr = {animateMaskedImageView, Float.valueOf(f)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1321424824, iOnWarmupCompleted, -1321424824, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
    }

    public final int onWarmupCompleted() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return ((Integer) onNavigationEvent(iOnWarmupCompleted2, 1135725072, iOnWarmupCompleted, -1135725069, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted3, new Object[]{this})).intValue();
    }

    public final void onWarmupCompleted(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -992799876, iOnWarmupCompleted, 992799878, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
    }

    public final void onExtraCallback(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1410514566, iOnWarmupCompleted, 1410514570, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
    }

    public final void IAuthTabCallback(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        onNavigationEvent(TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 263438331, iOnWarmupCompleted, -263438330, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr);
    }
}
