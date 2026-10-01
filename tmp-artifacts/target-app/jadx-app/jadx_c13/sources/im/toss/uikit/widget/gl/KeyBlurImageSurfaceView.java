package im.toss.uikit.widget.gl;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLSurfaceView;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ExpandableListView;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.uikit.widget.gl.KeyBlurImageSurfaceView$;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AnrDetailsCollectorcollectAnrErrorDetails1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14100;
import o.findResAndMsg;
import o.generateInviteUrl;
import o.nSetPosition;
import o.onLoadStarted;
import o.readIntokhttp;
import o.setTagsokhttp;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class KeyBlurImageSurfaceView extends GLSurfaceView {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallbackDefault = {1542026862, 359405974, 860940991, -40044763, 592509761, 514784275, -1252594529, -1066425045, 929572273, -1153767438, 299126102, 1449818051, -810533833, 1192827275, -2092036760, 1120903515, -696122773, 1067793411};
    private static int IAuthTabCallbackStub = 0;
    private static int access100 = 1;
    private final Lazy IAuthTabCallback;
    private final Lazy asBinder;
    private AnrDetailsCollectorcollectAnrErrorDetails1 asInterface;
    private final Lazy onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private final Lazy onNavigationEvent;
    private final Lazy onTransact;
    private float onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KeyBlurImageSurfaceView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Interpolator IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 125;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackDefault();
        }
        IAuthTabCallbackDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = i7 | i;
        int i11 = (~i10) | i9;
        int i12 = ~i;
        int i13 = (~(i4 | i10)) | (~(i8 | i12)) | (~(i12 | i5));
        int i14 = i5 + i + i3 + ((-1017789379) * i6) + (461141949 * i2);
        int i15 = i14 * i14;
        int i16 = ((-551480932) * i5) + 431816704 + ((-1613042074) * i) + ((-1061561142) * i11) + (i13 * (-1616703077)) + ((-1616703077) * i9) + (1065222144 * i3) + ((-1727660032) * i6) + (1912995840 * i2) + ((-1005256704) * i15);
        int i17 = ((i5 * (-1063000396)) - 360994079) + (i * (-1063001374)) + (i11 * (-978)) + (i13 * 489) + (i9 * 489) + (i3 * (-1063000885)) + (i6 * (-90181537)) + (i2 * (-1548859681)) + (i15 * 816250880);
        int i18 = i16 + (i17 * i17 * 1493368832);
        if (i18 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i18 != 2) {
            return i18 != 3 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
        }
        int i19 = 2 % 2;
        Random random = new Random();
        int i20 = access100 + 77;
        IAuthTabCallbackStub = i20 % 128;
        int i21 = i20 % 2;
        return random;
    }

    public static /* synthetic */ void onExtraCallback(KeyBlurImageSurfaceView keyBlurImageSurfaceView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {keyBlurImageSurfaceView};
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        if (i3 == 0) {
            onExtraCallback(objArr, 553930151, iOnExtraCallback4, iOnExtraCallback2, iOnExtraCallback, -553930148, iOnExtraCallback3);
            obj.hashCode();
            throw null;
        }
        onExtraCallback(objArr, 553930151, iOnExtraCallback4, iOnExtraCallback2, iOnExtraCallback, -553930148, iOnExtraCallback3);
        int i4 = access100 + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(KeyBlurImageSurfaceView keyBlurImageSurfaceView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub(keyBlurImageSurfaceView);
        int i4 = IAuthTabCallbackStub + 105;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return zIAuthTabCallbackStub;
    }

    public static /* synthetic */ String onNavigationEvent(KeyBlurImageSurfaceView keyBlurImageSurfaceView) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 65;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(keyBlurImageSurfaceView);
            throw null;
        }
        String strOnTransact = onTransact(keyBlurImageSurfaceView);
        int i3 = IAuthTabCallbackStub + 53;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return strOnTransact;
    }

    public static /* synthetic */ Random onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[0];
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        if (i3 != 0) {
            throw null;
        }
        Random random = (Random) onExtraCallback(objArr, 1223568986, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -1223568984, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
        int i4 = access100 + 67;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return random;
    }

    public static /* synthetic */ float onWarmupCompleted(KeyBlurImageSurfaceView keyBlurImageSurfaceView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 55;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(keyBlurImageSurfaceView);
        int i4 = access100 + 51;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return fIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ void onWarmupCompleted(ValueAnimator valueAnimator, KeyBlurImageSurfaceView keyBlurImageSurfaceView, float f, float f2, String str, float f3, ValueAnimator valueAnimator2) {
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(valueAnimator, keyBlurImageSurfaceView, f, f2, str, f3, valueAnimator2);
        int i4 = access100 + 13;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyBlurImageSurfaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onTransact = LazyKt__LazyJVMKt.lazy(new KeyBlurImageSurfaceView$.ExternalSyntheticLambda0(this));
        this.onWarmupCompleted = 1.0f;
        this.asBinder = LazyKt__LazyJVMKt.lazy(new KeyBlurImageSurfaceView$.ExternalSyntheticLambda1());
        this.IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new KeyBlurImageSurfaceView$.ExternalSyntheticLambda2());
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new KeyBlurImageSurfaceView$.ExternalSyntheticLambda3(this));
        this.onNavigationEvent = LazyKt__LazyJVMKt.lazy(new KeyBlurImageSurfaceView$.ExternalSyntheticLambda4(this));
        setEGLContextClientVersion(3);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        setZOrderMediaOverlay(true);
        getHolder().setFormat(-3);
        AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1 = new AnrDetailsCollectorcollectAnrErrorDetails1(this, asInterface());
        this.asInterface = anrDetailsCollectorcollectAnrErrorDetails1;
        setRenderer(anrDetailsCollectorcollectAnrErrorDetails1);
        setRenderMode(0);
        setPreserveEGLContextOnPause(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyBlurImageSurfaceView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 21;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 85;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public static final /* synthetic */ String IAuthTabCallback(KeyBlurImageSurfaceView keyBlurImageSurfaceView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
            return (String) onExtraCallback(new Object[]{keyBlurImageSurfaceView}, 72314280, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -72314279, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
        }
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        throw null;
    }

    public static final /* synthetic */ float IAuthTabCallbackDefault(KeyBlurImageSurfaceView keyBlurImageSurfaceView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            keyBlurImageSurfaceView.IAuthTabCallbackStub();
            throw null;
        }
        float fIAuthTabCallbackStub = keyBlurImageSurfaceView.IAuthTabCallbackStub();
        int i3 = IAuthTabCallbackStub + 95;
        access100 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
        }
        return fIAuthTabCallbackStub;
    }

    public static final /* synthetic */ AnrDetailsCollectorcollectAnrErrorDetails1 asBinder(KeyBlurImageSurfaceView keyBlurImageSurfaceView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 81;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1 = keyBlurImageSurfaceView.asInterface;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 9;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return anrDetailsCollectorcollectAnrErrorDetails1;
    }

    private final float IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) this.onTransact.getValue()).floatValue();
        int i4 = access100 + 5;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 27 / 0;
        }
        return fFloatValue;
    }

    private static final float IAuthTabCallback_Parcel(KeyBlurImageSurfaceView keyBlurImageSurfaceView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        float fOnExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(keyBlurImageSurfaceView, 214);
        int i4 = IAuthTabCallbackStub + 95;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return fOnExtraCallbackWithResult;
    }

    private static final Interpolator IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) Address.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -1041671130, new Object[]{Address.onNavigationEvent, Float.valueOf(0.18f), Float.valueOf(0.91f), Float.valueOf(0.68f), Float.valueOf(1.0f)}, nSetPosition.onExtraCallbackWithResult(), 1041671131);
        int i4 = IAuthTabCallbackStub + 107;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return interpolator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Interpolator asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolator = (Interpolator) this.asBinder.getValue();
        int i4 = IAuthTabCallbackStub + 37;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return interpolator;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        KeyBlurImageSurfaceView keyBlurImageSurfaceView = (KeyBlurImageSurfaceView) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Random random = (Random) keyBlurImageSurfaceView.IAuthTabCallback.getValue();
        int i4 = access100 + 21;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return random;
    }

    private final boolean asInterface() {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = access100 + 83;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            zBooleanValue = ((Boolean) this.onExtraCallback.getValue()).booleanValue();
            int i3 = 81 / 0;
        } else {
            zBooleanValue = ((Boolean) this.onExtraCallback.getValue()).booleanValue();
        }
        int i4 = access100 + 109;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        KeyBlurImageSurfaceView keyBlurImageSurfaceView = (KeyBlurImageSurfaceView) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object value = keyBlurImageSurfaceView.onNavigationEvent.getValue();
        if (i3 != 0) {
            throw null;
        }
        String str = (String) value;
        int i4 = access100 + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String onTransact(KeyBlurImageSurfaceView keyBlurImageSurfaceView) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = access100 + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (keyBlurImageSurfaceView.asInterface()) {
            int i4 = access100 + 11;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{868140447, -871799540, 975343568, 1268490712, -1115717081, -1563552864, 192711138, -337381601, 1240542423, 473400422, -1851469446, 1064574664, 1973889226, 1220487533, 590825535, -1626604030, 1547833754, -1841163912, -1522094332, 1370117627, -1573544802, 2129428849, -1312359022, -638840723}, 7 % View.MeasureSpec.makeMeasureSpec(1, 1), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new int[]{868140447, -871799540, 975343568, 1268490712, -1115717081, -1563552864, 192711138, -337381601, 1240542423, 473400422, -1851469446, 1064574664, 1973889226, 1220487533, 590825535, -1626604030, 1547833754, -1841163912, -1522094332, 1370117627, -1573544802, 2129428849, -1312359022, -638840723}, 48 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }
        Object[] objArr3 = new Object[1];
        a(new int[]{868140447, -871799540, 975343568, 1268490712, -1115717081, -1563552864, 192711138, -337381601, 1240542423, 473400422, -1851469446, 1064574664, 1973889226, 1220487533, -1673576149, -1286561995, 1135432475, 541859115, -1832260955, 1611130387, 1870905537, 772846537, 142910575, -59905624, 1319162915, 1154064410}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 50, objArr3);
        String strIntern = ((String) objArr3[0]).intern();
        int i5 = IAuthTabCallbackStub + 101;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return strIntern;
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = true;
        AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1 = this.asInterface;
        if (anrDetailsCollectorcollectAnrErrorDetails1 != null) {
            int i5 = i3 + 41;
            IAuthTabCallbackStub = i5 % 128;
            AnrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback(anrDetailsCollectorcollectAnrErrorDetails1, (String) null, i5 % 2 != 0 ? 0 : 1, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(ValueAnimator valueAnimator, KeyBlurImageSurfaceView keyBlurImageSurfaceView, float f, float f2, String str, float f3, ValueAnimator valueAnimator2) {
        int i = 2 % 2;
        int i2 = access100 + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator2, "");
            valueAnimator.setDuration((long) (3000.0f - keyBlurImageSurfaceView.onWarmupCompleted));
            if (keyBlurImageSurfaceView.isAttachedToWindow()) {
                if (!keyBlurImageSurfaceView.onExtraCallbackWithResult) {
                    int i3 = IAuthTabCallbackStub + 111;
                    access100 = i3 % 128;
                    int i4 = i3 % 2;
                    Object animatedValue = valueAnimator2.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "");
                    float fFloatValue = ((Float) animatedValue).floatValue();
                    float interpolation = keyBlurImageSurfaceView.asBinder().getInterpolation(fFloatValue);
                    float interpolation2 = keyBlurImageSurfaceView.asBinder().getInterpolation(Math.min(Math.max(fFloatValue - f, 0.0f) * f2, 1.0f));
                    AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1 = keyBlurImageSurfaceView.asInterface;
                    if (anrDetailsCollectorcollectAnrErrorDetails1 != null) {
                        int i5 = IAuthTabCallbackStub + 37;
                        access100 = i5 % 128;
                        int i6 = i5 % 2;
                        anrDetailsCollectorcollectAnrErrorDetails1.onWarmupCompleted(str, interpolation * 2.0f, 1.0f - interpolation2, f3 * 360.0f);
                        int i7 = IAuthTabCallbackStub + 85;
                        access100 = i7 % 128;
                        if (i7 % 2 == 0) {
                            int i8 = 30 / 0;
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(valueAnimator2, "");
            valueAnimator.setDuration((long) (3000.0f / keyBlurImageSurfaceView.onWarmupCompleted));
            if (keyBlurImageSurfaceView.isAttachedToWindow()) {
            }
        }
        AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails12 = keyBlurImageSurfaceView.asInterface;
        if (anrDetailsCollectorcollectAnrErrorDetails12 != null) {
            AnrDetailsCollectorcollectAnrErrorDetails1.IAuthTabCallback(anrDetailsCollectorcollectAnrErrorDetails12, (String) null, 1, (Object) null);
            int i9 = access100 + 37;
            IAuthTabCallbackStub = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public static final class onNavigationEvent implements Animator.AnimatorListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ String IAuthTabCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 84 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        public onNavigationEvent(String str) {
            this.IAuthTabCallback = str;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                KeyBlurImageSurfaceView.asBinder(KeyBlurImageSurfaceView.this);
                throw null;
            }
            AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1AsBinder = KeyBlurImageSurfaceView.asBinder(KeyBlurImageSurfaceView.this);
            if (anrDetailsCollectorcollectAnrErrorDetails1AsBinder != null) {
                anrDetailsCollectorcollectAnrErrorDetails1AsBinder.onNavigationEvent(this.IAuthTabCallback);
            }
            int i3 = onNavigationEvent + 63;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final class onExtraCallbackWithResult implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ View onExtraCallback;
        final /* synthetic */ findResAndMsg onExtraCallbackWithResult;
        final /* synthetic */ KeyBlurImageSurfaceView onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public onExtraCallbackWithResult(View view, findResAndMsg findresandmsg, KeyBlurImageSurfaceView keyBlurImageSurfaceView) {
            this.onExtraCallback = view;
            this.onExtraCallbackWithResult = findresandmsg;
            this.onWarmupCompleted = keyBlurImageSurfaceView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            this.onExtraCallback.removeOnAttachStateChangeListener(this);
            onLoadStarted.onExtraCallback(this.onExtraCallbackWithResult, null, null, this.onWarmupCompleted.new IAuthTabCallback(null), 3, null);
            int i2 = onNavigationEvent + 25;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
      0x002d: PHI (r1v7 o.AnrDetailsCollectorcollectAnrErrorDetails1) = (r1v6 o.AnrDetailsCollectorcollectAnrErrorDetails1), (r1v12 o.AnrDetailsCollectorcollectAnrErrorDetails1) binds: [B:8:0x002b, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTouchPoint(@NotNull final String str, float f, float f2) {
        AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = true;
            this.onWarmupCompleted = 2.0f;
            anrDetailsCollectorcollectAnrErrorDetails1 = this.asInterface;
            if (anrDetailsCollectorcollectAnrErrorDetails1 != null) {
                anrDetailsCollectorcollectAnrErrorDetails1.onNavigationEvent(str, f, f2);
                int i3 = access100 + 97;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = false;
            this.onWarmupCompleted = 1.0f;
            anrDetailsCollectorcollectAnrErrorDetails1 = this.asInterface;
            if (anrDetailsCollectorcollectAnrErrorDetails1 != null) {
            }
        }
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        final float fNextFloat = ((Random) onExtraCallback(new Object[]{this}, 915029362, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -915029362, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback())).nextFloat();
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(3000L);
        ValueAnimator.setFrameDelay(16L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        final float f3 = 0.23333333f;
        final float f4 = 1.5f;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.gl.KeyBlurImageSurfaceView$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 59;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                KeyBlurImageSurfaceView.onWarmupCompleted(valueAnimatorOfFloat, this, f3, f4, str, fNextFloat, valueAnimator);
                if (i7 != 0) {
                    throw null;
                }
                int i8 = onExtraCallback + 107;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new onNavigationEvent(str));
        valueAnimatorOfFloat.start();
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        int label;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = KeyBlurImageSurfaceView.this.new IAuthTabCallback(access13800Var);
            int i2 = onNavigationEvent + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                return IAuthTabCallback(findresandmsg2, access13800Var2);
            }
            IAuthTabCallback(findresandmsg2, access13800Var2);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KeyBlurImageSurfaceView keyBlurImageSurfaceView;
            AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1AsBinder;
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                KeyBlurImageSurfaceView keyBlurImageSurfaceView2 = KeyBlurImageSurfaceView.this;
                String strIAuthTabCallback = KeyBlurImageSurfaceView.IAuthTabCallback(keyBlurImageSurfaceView2);
                Integer numOnNavigationEvent = access14000.onNavigationEvent((int) KeyBlurImageSurfaceView.IAuthTabCallbackDefault(KeyBlurImageSurfaceView.this));
                Integer numOnNavigationEvent2 = access14000.onNavigationEvent((int) KeyBlurImageSurfaceView.IAuthTabCallbackDefault(KeyBlurImageSurfaceView.this));
                this.label = 1;
                obj = generateInviteUrl.IAuthTabCallback(keyBlurImageSurfaceView2, strIAuthTabCallback, numOnNavigationEvent, numOnNavigationEvent2, this);
                if (obj == objOnExtraCallback) {
                    int i3 = IAuthTabCallback + 113;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnExtraCallback;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null && (anrDetailsCollectorcollectAnrErrorDetails1AsBinder = KeyBlurImageSurfaceView.asBinder((keyBlurImageSurfaceView = KeyBlurImageSurfaceView.this))) != null) {
                int i5 = IAuthTabCallback + 73;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                anrDetailsCollectorcollectAnrErrorDetails1AsBinder.onNavigationEvent(bitmap, KeyBlurImageSurfaceView.IAuthTabCallbackDefault(keyBlurImageSurfaceView), KeyBlurImageSurfaceView.IAuthTabCallbackDefault(keyBlurImageSurfaceView));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        KeyBlurImageSurfaceView keyBlurImageSurfaceView = (KeyBlurImageSurfaceView) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        AnrDetailsCollectorcollectAnrErrorDetails1 anrDetailsCollectorcollectAnrErrorDetails1 = keyBlurImageSurfaceView.asInterface;
        if (i3 == 0) {
            int i4 = 50 / 0;
            if (anrDetailsCollectorcollectAnrErrorDetails1 != null) {
                anrDetailsCollectorcollectAnrErrorDetails1.onExtraCallbackWithResult();
            }
        } else if (anrDetailsCollectorcollectAnrErrorDetails1 != null) {
        }
        int i5 = access100 + 77;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return null;
    }

    public final void onExtraCallback(@NotNull findResAndMsg findresandmsg) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new onExtraCallbackWithResult(this, findresandmsg, this));
            int i2 = access100 + 125;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        onLoadStarted.onExtraCallback(findresandmsg, null, null, new IAuthTabCallback(null), 3, null);
        int i4 = IAuthTabCallbackStub + 89;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallbackDefault;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $10 + 47;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 33;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), Color.rgb(0, 0, 0) + 16777288, 8848 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 72, Color.red(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackDefault;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 71;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr4 = new Object[1];
                    objArr4[i5] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', i5, i5)), KeyEvent.normalizeMetaState(i5) + 72, 8848 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i10])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 71, View.resolveSize(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    i10++;
                }
                i4 = -1469660336;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i12 = i5;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i12;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i12] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 22252), View.resolveSize(0, 0) + 39, 10301 - View.resolveSizeAndState(0, 0, 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i13++;
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 4033), 78 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i18 = $11 + 47;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            i12 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static final boolean IAuthTabCallbackStub(KeyBlurImageSurfaceView keyBlurImageSurfaceView) {
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Resources resources = keyBlurImageSurfaceView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        boolean zOnExtraCallback = readIntokhttp.onExtraCallback(configuration);
        int i4 = IAuthTabCallbackStub + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    private final String onExtraCallbackWithResult() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (String) onExtraCallback(new Object[]{this}, 72314280, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -72314279, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private final Random onExtraCallback() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Random) onExtraCallback(new Object[]{this}, 915029362, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -915029362, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Random onTransact() {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        return (Random) onExtraCallback(new Object[0], 1223568986, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -1223568984, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final void asInterface(KeyBlurImageSurfaceView keyBlurImageSurfaceView) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(new Object[]{keyBlurImageSurfaceView}, 553930151, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, -553930148, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback());
    }
}
