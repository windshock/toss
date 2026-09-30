package im.toss.uikit.widget.gl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.uikit.widget.gl.AuthPinDotRotationView$;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.M_;
import o.deprecated_certificatePinner;
import o.generateLink;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.readIntokhttp;
import o.setVisitUrl;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AuthPinDotRotationView extends AnimateMaskedImageView {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static long IAuthTabCallbackStub = 3350361045824746326L;
    private static int onTransact = 1;
    private ValueAnimator IAuthTabCallback;
    private final int asInterface;
    private final Lazy onExtraCallback;
    private final String onExtraCallbackWithResult;
    private ValueAnimator onNavigationEvent;
    private boolean onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuthPinDotRotationView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void onExtraCallback(AuthPinDotRotationView authPinDotRotationView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(authPinDotRotationView, valueAnimator);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onTransact + 83;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i | i4));
        int i11 = ~(i7 | i9);
        int i12 = (~i4) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i);
        int i15 = i + i3 + i6 + ((-1261570137) * i2) + (2040842291 * i5);
        int i16 = i15 * i15;
        int i17 = ((i * (-750812765)) - 1471086592) + ((-750812765) * i3) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i6) + ((-1928462336) * i2) + (1629880320 * i5) + (2096168960 * i16);
        int i18 = ((i * 1408203179) - 1033136887) + (i3 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i6 * 1408202841) + (i2 * (-1046847217)) + (i5 * (-121732677)) + (i16 * 1741225984);
        return i17 + ((i18 * i18) * 838795264) != 1 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        AuthPinDotRotationView authPinDotRotationView = (AuthPinDotRotationView) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(authPinDotRotationView, fFloatValue);
        int i4 = IAuthTabCallbackDefault + 73;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        AuthPinDotRotationView authPinDotRotationView = (AuthPinDotRotationView) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 5;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(authPinDotRotationView);
        int i4 = IAuthTabCallbackDefault + 113;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(iOnExtraCallbackWithResult);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(AuthPinDotRotationView authPinDotRotationView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(authPinDotRotationView, valueAnimator);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthPinDotRotationView(@NotNull Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        int iIntValue;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Object[] objArr = new Object[1];
        a(new char[]{13833, 55566, 59427, 64320, 35454, 40412, 44268, 49139, 20170, 20966, 24846, 28732, 844, 4701, 9525, 13440, 51134, 55001, 63988, 35150, 38932, 43835, 47644, 19813, 23697, 28653, 32431, 465, 4347, 8257, 13115, 49741, 54639, 58423, 63379, 34495, 43481, 47275, 18446, 23325, 27178, 32089, 3105, 8088, 11947, 12729}, ExpandableListView.getPackedPositionType(0L) + 61211, objArr);
        this.onExtraCallbackWithResult = ((String) objArr[0]).intern();
        this.asInterface = M_.onExtraCallback.asInterface();
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new AuthPinDotRotationView$.ExternalSyntheticLambda2(this));
        this.onWarmupCompleted = true;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        if (generateLink.IAuthTabCallback(resources)) {
            iIntValue = Color.parseColor("#2C485B");
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            Object[] objArr2 = {new getUrlokhttp(new IAuthTabCallback(configuration))};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            iIntValue = ((Integer) getUrlokhttp.onNavigationEvent(objArr2, -1763178192, 1763178195, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).intValue();
            int i = onTransact + 9;
            IAuthTabCallbackDefault = i % 128;
            if (i % 2 == 0) {
            }
            setDotColor(iIntValue);
            setRenderer(IAuthTabCallbackStub(), false);
            int i2 = onTransact + 77;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = 2 % 2;
        setDotColor(iIntValue);
        setRenderer(IAuthTabCallbackStub(), false);
        int i22 = onTransact + 77;
        IAuthTabCallbackDefault = i22 % 128;
        int i32 = i22 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AuthPinDotRotationView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onTransact + 53;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 51;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 3;
            } else {
                int i7 = 2 % 2;
            }
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    private final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.onExtraCallback.getValue()).intValue();
        int i4 = IAuthTabCallbackDefault + 7;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return iIntValue;
    }

    private static final int onExtraCallbackWithResult(AuthPinDotRotationView authPinDotRotationView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        float f = authPinDotRotationView.asInterface;
        int i5 = (int) (i4 == 0 ? f / 2.5f : f * 2.5f);
        int i6 = i2 + 99;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 14 / 0;
        }
        return i5;
    }

    @Override // im.toss.uikit.widget.gl.AnimateMaskedImageView
    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 93;
        IAuthTabCallbackDefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.onWarmupCompleted;
        int i4 = i2 + 91;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // im.toss.uikit.widget.gl.AnimateMaskedImageView
    public void setOnTop(boolean z) {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 35;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        this.onWarmupCompleted = z;
        int i5 = i2 + 41;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(final float f) {
        int i = 2 % 2;
        setImageUrl(this.onExtraCallbackWithResult, IAuthTabCallbackStub(), IAuthTabCallbackStub());
        post(new Runnable() { // from class: im.toss.uikit.widget.gl.AuthPinDotRotationView$$ExternalSyntheticLambda3
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 33;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    AuthPinDotRotationView.onExtraCallbackWithResult(-60790428, new Object[]{this.f$0, Float.valueOf(f)}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 60790428, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                AuthPinDotRotationView.onExtraCallbackWithResult(-60790428, new Object[]{this.f$0, Float.valueOf(f)}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 60790428, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                int i4 = onExtraCallbackWithResult + 29;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 14 / 0;
                }
            }
        });
        int i2 = IAuthTabCallbackDefault + 71;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void IAuthTabCallback(AuthPinDotRotationView authPinDotRotationView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        authPinDotRotationView.onWarmupCompleted(((Float) animatedValue).floatValue());
        int i4 = onTransact + 1;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r4
      0x003c: PHI (r4v3 android.animation.ValueAnimator) = (r4v2 android.animation.ValueAnimator), (r4v10 android.animation.ValueAnimator) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final AuthPinDotRotationView authPinDotRotationView, float f) {
        ValueAnimator valueAnimator;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            authPinDotRotationView.IAuthTabCallback(0.0f);
            authPinDotRotationView.onExtraCallback(0.0f);
            authPinDotRotationView.onExtraCallbackWithResult(f / (authPinDotRotationView.IAuthTabCallbackStub() - 1.0f));
            valueAnimator = authPinDotRotationView.IAuthTabCallback;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        } else {
            authPinDotRotationView.IAuthTabCallback(0.0f);
            authPinDotRotationView.onExtraCallback(0.0f);
            authPinDotRotationView.onExtraCallbackWithResult(f - (authPinDotRotationView.IAuthTabCallbackStub() / 2.0f));
            valueAnimator = authPinDotRotationView.IAuthTabCallback;
            if (valueAnimator != null) {
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        valueAnimatorOfFloat.setDuration(8000L);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.asInterface());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.gl.AuthPinDotRotationView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i3 = 2 % 2;
                int i4 = onWarmupCompleted + 73;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    AuthPinDotRotationView.onExtraCallback(this.f$0, valueAnimator2);
                    throw null;
                }
                AuthPinDotRotationView.onExtraCallback(this.f$0, valueAnimator2);
                int i5 = IAuthTabCallback + 23;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        valueAnimatorOfFloat.start();
        authPinDotRotationView.IAuthTabCallback = valueAnimatorOfFloat;
        ValueAnimator valueAnimator2 = authPinDotRotationView.onNavigationEvent;
        if (valueAnimator2 != null) {
            int i3 = IAuthTabCallbackDefault + 57;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        deprecated_certificatePinner deprecated_certificatepinner = deprecated_certificatePinner.onExtraCallbackWithResult;
        valueAnimatorOfFloat2.setDuration(deprecated_certificatepinner.IAuthTabCallbackStub().IAuthTabCallback());
        valueAnimatorOfFloat2.setStartDelay(1000L);
        valueAnimatorOfFloat2.setInterpolator(deprecated_certificatepinner.IAuthTabCallbackStub());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.gl.AuthPinDotRotationView$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                AuthPinDotRotationView.onNavigationEvent(this.f$0, valueAnimator3);
                if (i7 == 0) {
                    throw null;
                }
            }
        });
        valueAnimatorOfFloat2.start();
        authPinDotRotationView.onNavigationEvent = valueAnimatorOfFloat2;
    }

    private static final void onWarmupCompleted(AuthPinDotRotationView authPinDotRotationView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            float fFloatValue = ((Float) animatedValue).floatValue();
            authPinDotRotationView.onExtraCallback(fFloatValue);
            authPinDotRotationView.IAuthTabCallback(fFloatValue);
            int i3 = 2 / 0;
        } else {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue2, "");
            float fFloatValue2 = ((Float) animatedValue2).floatValue();
            authPinDotRotationView.onExtraCallback(fFloatValue2);
            authPinDotRotationView.IAuthTabCallback(fFloatValue2);
        }
        int i4 = IAuthTabCallbackDefault + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = onTransact + 43;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        asInterface();
        int i4 = IAuthTabCallbackDefault + 3;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 11;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.IAuthTabCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 47;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    @Override // im.toss.uikit.widget.gl.AnimateMaskedImageView
    public void asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        ValueAnimator valueAnimator = this.IAuthTabCallback;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            int i4 = IAuthTabCallbackDefault + 27;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        ValueAnimator valueAnimator2 = this.onNavigationEvent;
        if (valueAnimator2 != null) {
            int i6 = IAuthTabCallbackDefault + 119;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                valueAnimator2.cancel();
                throw null;
            }
            valueAnimator2.cancel();
        }
        super.asBinder();
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 93;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 24 - (ViewConfiguration.getFadingEdgeLength() >> 16), 19627 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (IAuthTabCallbackStub ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 59 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 57;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 59, 6384 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 123;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            ValueAnimator valueAnimator = this.IAuthTabCallback;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.onNavigationEvent;
            if (valueAnimator2 != null) {
                int i3 = IAuthTabCallbackDefault + 85;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                valueAnimator2.cancel();
                int i5 = onTransact + 47;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        throw null;
    }
}
