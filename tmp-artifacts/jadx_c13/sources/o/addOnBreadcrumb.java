package o;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.webkit.TossCoreWebView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.Breadcrumb;
import o.addOnBreadcrumb;
import o.getObserversbugsnag_android_core_release;
import o.setByType;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addOnBreadcrumb implements surfaceChanged {
    private final setAttachUserData onExtraCallback;
    private final BreadcrumbInternal<Unit, String> onExtraCallbackWithResult;
    private static final byte[] $$a = {94, -53, 28, -60};
    private static final int $$b = 231;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asInterface = 1;
    private static long IAuthTabCallback = 7798559133331975163L;
    private static int onWarmupCompleted = 653630730;
    private static char onNavigationEvent = 27643;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = addOnBreadcrumb.this.onNavigationEvent(null, this);
            if (i3 == 0) {
                int i4 = 15 / 0;
            }
            return objOnNavigationEvent;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, byte b) {
        int i;
        int i2;
        int i3 = s + 109;
        int i4 = 1 - (b * 3);
        int i5 = s2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3 += -i5;
            i5 = i6;
            i = i2;
            int i7 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i5 = bArr[i7];
            i3 += -i5;
            i5 = i6;
            i = i2;
            int i72 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            int i722 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    public static /* synthetic */ String onExtraCallback(String str, String str2, getObserversbugsnag_android_core_release getobserversbugsnag_android_core_release, Unit unit) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, getobserversbugsnag_android_core_release, unit);
        int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return strOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(Breadcrumb breadcrumb) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(breadcrumb);
        int i4 = asInterface + 19;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public addOnBreadcrumb(@NotNull setAttachUserData setattachuserdata) {
        Intrinsics.checkNotNullParameter(setattachuserdata, "");
        this.onExtraCallback = setattachuserdata;
        this.onExtraCallbackWithResult = getStringTimestamp.onWarmupCompleted(new Function1() { // from class: im.toss.webkit.MtlsUrlRewritePlugin$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 99;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnNavigationEvent = addOnBreadcrumb.onNavigationEvent((Breadcrumb) obj);
                if (i3 == 0) {
                    int i4 = 66 / 0;
                }
                return unitOnNavigationEvent;
            }
        });
    }

    public /* bridge */ void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback();
        int i4 = asInterface + 29;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void IAuthTabCallback(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.IAuthTabCallback(tossCoreWebView);
        int i4 = IAuthTabCallbackDefault + 43;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onExtraCallbackWithResult(@NotNull setLensFacing setlensfacing) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onExtraCallbackWithResult(setlensfacing);
        int i4 = IAuthTabCallbackDefault + 93;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onWarmupCompleted(tossCoreWebView);
        int i4 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final String onExtraCallbackWithResult(String str, String str2, getObserversbugsnag_android_core_release getobserversbugsnag_android_core_release, Unit unit) {
        String strReplaceFirst$default;
        int i = 2 % 2;
        int i2 = asInterface + 41;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getobserversbugsnag_android_core_release, "");
            Intrinsics.checkNotNullParameter(unit, "");
            strReplaceFirst$default = StringsKt__StringsJVMKt.replaceFirst$default(getobserversbugsnag_android_core_release.onNavigationEvent(), str, str2, false, 3, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(getobserversbugsnag_android_core_release, "");
            Intrinsics.checkNotNullParameter(unit, "");
            strReplaceFirst$default = StringsKt__StringsJVMKt.replaceFirst$default(getobserversbugsnag_android_core_release.onNavigationEvent(), str, str2, false, 4, (Object) null);
        }
        int i3 = asInterface + 33;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            return strReplaceFirst$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Breadcrumb breadcrumb) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(breadcrumb, "");
        for (Pair pair : b2.onExtraCallbackWithResult.onNavigationEvent()) {
            final String str = (String) pair.onExtraCallbackWithResult();
            final String str2 = (String) pair.IAuthTabCallback();
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            a((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0) + 1), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0') + 1, new char[]{17947, 47545, 64433, 57994, 60815, 15429, 12724, 48464}, new char[]{0, 0, 0, 0}, new char[]{46087, 27337, 56002, 60088}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(str);
            sb.append("/**");
            Breadcrumb.onExtraCallback(breadcrumb, sb.toString(), null, new Function2() { // from class: im.toss.webkit.MtlsUrlRewritePlugin$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 69;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    String strOnExtraCallback = addOnBreadcrumb.onExtraCallback(str, str2, (getObserversbugsnag_android_core_release) obj, (Unit) obj2);
                    int i7 = IAuthTabCallback + 41;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return strOnExtraCallback;
                }
            }, 2, null);
            int i4 = asInterface + 81;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onNavigationEvent(@NotNull setByType setbytype, @NotNull access13800<? super setByType.onWarmupCompleted> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        if (!(!(access13800Var instanceof IAuthTabCallback))) {
            int i2 = asInterface + 119;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i4 = iAuthTabCallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i4 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object objIAuthTabCallback = iAuthTabCallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i5 = iAuthTabCallback.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            setAttachUserData setattachuserdata = this.onExtraCallback;
            iAuthTabCallback.L$0 = setbytype;
            iAuthTabCallback.label = 1;
            objIAuthTabCallback = setattachuserdata.IAuthTabCallback(iAuthTabCallback);
            if (objIAuthTabCallback == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = IAuthTabCallbackDefault + 79;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            setbytype = (setByType) iAuthTabCallback.L$0;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        if (!((Boolean) objIAuthTabCallback).booleanValue()) {
            return setByType.onNavigationEvent(setbytype, (String) null, (Map) null, 3, (Object) null);
        }
        String str = (String) getStringTimestamp.IAuthTabCallback(this.onExtraCallbackWithResult, setbytype.onExtraCallback());
        if (str != null) {
            return setByType.onNavigationEvent(setbytype, str, (Map) null, 2, (Object) null);
        }
        setByType.onWarmupCompleted onwarmupcompletedOnNavigationEvent = setByType.onNavigationEvent(setbytype, (String) null, (Map) null, 3, (Object) null);
        int i8 = asInterface + 63;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 == 0) {
            return onwarmupcompletedOnNavigationEvent;
        }
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 61;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 57;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    int mode = 43 - View.MeasureSpec.getMode(0);
                    int minimumFlingVelocity = 1451 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    byte b = (byte) ($$b & 1);
                    byte b2 = (byte) (-b);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), mode, minimumFlingVelocity, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 49124), ExpandableListView.getPackedPositionChild(0L) + 45, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1493, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, 22939 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onWarmupCompleted ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
