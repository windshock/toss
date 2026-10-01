package im.toss.webview;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.core.webkit.TossCoreWebView;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConstraintsSizeResolverExternalSyntheticLambda0;
import o.LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0;
import o.Response;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access13800;
import o.convertDeviceWithStatebugsnag_android_core_release;
import o.convertErrorInternalbugsnag_android_core_release;
import o.convertToEventbugsnag_android_core_release;
import o.convertUserbugsnag_android_core_release;
import o.doGetChildCpuTime;
import o.drawTopText;
import o.exitApp;
import o.findApp;
import o.findAppByAppId;
import o.findAppByToken;
import o.getAppStack;
import o.getStartTimeMillis;
import o.getTextProgressSize;
import o.onIconClick;
import o.setTextProgressColor;
import o.setTopGuideFontStyle;
import o.surfaceChanged;
import o.zzaj;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TossWebView extends TossCoreWebView {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static findApp IAuthTabCallback = null;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int access000 = 1;
    private static int asInterface;
    private static int getInterfaceDescriptor;
    private static getAppStack onExtraCallback;
    private static findAppByToken onExtraCallbackWithResult;
    private static int[] onTransact;
    private static Function0<? extends List<? extends surfaceChanged>> onWarmupCompleted;
    private ConstraintsSizeResolverExternalSyntheticLambda0 IAuthTabCallbackDefault;
    private getTextProgressSize IAuthTabCallbackStub;
    private setTextProgressColor asBinder;
    private getStartTimeMillis onNavigationEvent;

    public static /* synthetic */ List ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        List listOnWarmupCompleted = onWarmupCompleted();
        int i4 = access000 + 37;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return listOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(findAppByToken findappbytoken) {
        int i = 2 % 2;
        int i2 = asInterface + 61;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult = findappbytoken;
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getAppStack getappstack) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 123;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback = getappstack;
        int i5 = i2 + 65;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted = function0;
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(findApp findapp) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 101;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallback = findapp;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 89;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossWebView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossWebView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TossWebView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<setTopGuideFontStyle> onNavigationEvent() throws Throwable {
        int i = 2 % 2;
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        listCreateListBuilder.addAll(super/*im.toss.core.webkit.TossBridgeWebView*/.onNavigationEvent());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        String strOnExtraCallback = onIconClick.onExtraCallback(context);
        Object[] objArr = new Object[1];
        d(new int[]{-1697621383, 1858490085}, 2 - ImageFormat.getBitsPerPixel(0), objArr);
        listCreateListBuilder.add(new setTopGuideFontStyle.IAuthTabCallback(strOnExtraCallback, (String) null, ((String) objArr[0]).intern(), 2, (DefaultConstructorMarker) null));
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0 = this.IAuthTabCallbackDefault;
        getStartTimeMillis getstarttimemillis = null;
        if (constraintsSizeResolverExternalSyntheticLambda0 == null) {
            int i2 = access000 + 91;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            constraintsSizeResolverExternalSyntheticLambda0 = null;
        }
        listCreateListBuilder.add(new setTopGuideFontStyle.IAuthTabCallbackStubProxy(constraintsSizeResolverExternalSyntheticLambda0.onExtraCallback()));
        getStartTimeMillis getstarttimemillis2 = this.onNavigationEvent;
        if (getstarttimemillis2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            getstarttimemillis = getstarttimemillis2;
        }
        listCreateListBuilder.add(new setTopGuideFontStyle.access100(getstarttimemillis.onExtraCallback()));
        List<setTopGuideFontStyle> listBuild = CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
        int i4 = access000 + 99;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return listBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<surfaceChanged> ICustomTabsCallbackDefault() {
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda0;
        getTextProgressSize gettextprogresssize;
        setTextProgressColor settextprogresscolor;
        int i = 2 % 2;
        Response response = Response.onNavigationEvent;
        Context applicationContext = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.IAuthTabCallbackDefault = ((LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0) Response.onExtraCallback(applicationContext, LocalAsyncImageModelEqualityDelegateKtExternalSyntheticLambda0.class)).IAuthTabCallback_Parcel();
        Context applicationContext2 = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        this.onNavigationEvent = ((getStartTimeMillis.onExtraCallback) Response.onExtraCallback(applicationContext2, getStartTimeMillis.onExtraCallback.class)).addOnMultiWindowModeChangedListener();
        Context applicationContext3 = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
        this.IAuthTabCallbackStub = ((doGetChildCpuTime) Response.onExtraCallback(applicationContext3, doGetChildCpuTime.class)).getLifecycle();
        Context applicationContext4 = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext4, "");
        this.asBinder = ((doGetChildCpuTime) Response.onExtraCallback(applicationContext4, doGetChildCpuTime.class)).initializeViewTreeOwners();
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Object obj = null;
        listCreateListBuilder.add(new findAppByAppId(convertErrorInternalbugsnag_android_core_release.onNavigationEvent(context), (String) null, 2, (DefaultConstructorMarker) null));
        listCreateListBuilder.add(new convertDeviceWithStatebugsnag_android_core_release());
        getStartTimeMillis getstarttimemillis = this.onNavigationEvent;
        if (getstarttimemillis == null) {
            int i2 = asInterface + 33;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            getstarttimemillis = null;
        }
        listCreateListBuilder.add(new convertToEventbugsnag_android_core_release(getstarttimemillis));
        listCreateListBuilder.addAll(onWarmupCompleted.invoke());
        ConstraintsSizeResolverExternalSyntheticLambda0 constraintsSizeResolverExternalSyntheticLambda02 = this.IAuthTabCallbackDefault;
        if (constraintsSizeResolverExternalSyntheticLambda02 == null) {
            int i4 = access000 + 13;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i5 = 44 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            constraintsSizeResolverExternalSyntheticLambda0 = null;
        } else {
            constraintsSizeResolverExternalSyntheticLambda0 = constraintsSizeResolverExternalSyntheticLambda02;
        }
        getTextProgressSize gettextprogresssize2 = this.IAuthTabCallbackStub;
        if (gettextprogresssize2 == null) {
            int i6 = asInterface + 23;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            gettextprogresssize = null;
        } else {
            gettextprogresssize = gettextprogresssize2;
        }
        setTextProgressColor settextprogresscolor2 = this.asBinder;
        if (settextprogresscolor2 == null) {
            int i7 = asInterface + 109;
            access000 = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            settextprogresscolor = null;
        } else {
            settextprogresscolor = settextprogresscolor2;
        }
        listCreateListBuilder.add(new convertUserbugsnag_android_core_release(constraintsSizeResolverExternalSyntheticLambda0, gettextprogresssize, settextprogresscolor, onExtraCallbackWithResult, IAuthTabCallback, onExtraCallback));
        listCreateListBuilder.add(new exitApp(zzaj.onNavigationEvent().onUnminimized()));
        listCreateListBuilder.addAll(drawTopText.Companion.onExtraCallbackWithResult());
        return CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reload() {
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult != null) {
            int i2 = asInterface + 115;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            if (onExtraCallback.IAuthTabCallback(strOnExtraCallbackWithResult)) {
                loadUrl(strOnExtraCallbackWithResult);
                return;
            }
        }
        super/*android.webkit.WebView*/.reload();
        int i4 = access000 + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final void onExtraCallback(@NotNull findAppByToken findappbytoken) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(findappbytoken, "");
            TossWebView.IAuthTabCallback(findappbytoken);
            int i4 = onExtraCallback + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final void onWarmupCompleted(@NotNull findApp findapp) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(findapp, "");
            TossWebView.onWarmupCompleted(findapp);
            int i4 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final void onNavigationEvent(@NotNull getAppStack getappstack) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(getappstack, "");
            TossWebView.onExtraCallbackWithResult(getappstack);
            int i4 = IAuthTabCallback + 63;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public final void onExtraCallback(@NotNull Function0<? extends List<? extends surfaceChanged>> function0) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(function0, "");
                TossWebView.onNavigationEvent(function0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(function0, "");
            TossWebView.onNavigationEvent(function0);
            int i3 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static final class onNavigationEvent implements findAppByToken {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public boolean onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 17;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 6 / 0;
            }
            return false;
        }

        onNavigationEvent() {
        }

        public Object onNavigationEvent(access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        extraCommand();
        Companion = new onExtraCallbackWithResult(null);
        onExtraCallbackWithResult = new onNavigationEvent();
        IAuthTabCallback = new onWarmupCompleted();
        onExtraCallback = new onExtraCallback();
        onWarmupCompleted = new Function0() { // from class: im.toss.webview.TossWebView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 25;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                List listICustomTabsCallback_Parcel = TossWebView.ICustomTabsCallback_Parcel();
                int i4 = onExtraCallback + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return listICustomTabsCallback_Parcel;
            }
        };
        int i = IAuthTabCallbackStubProxy + 63;
        getInterfaceDescriptor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final class onWarmupCompleted implements findApp {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            int i3 = 58 / 0;
            return null;
        }

        onWarmupCompleted() {
        }
    }

    public static final class onExtraCallback implements getAppStack {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public boolean onExtraCallback(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            boolean z = i3 != 0;
            int i4 = IAuthTabCallback + 39;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 73 / 0;
            }
            return z;
        }

        public boolean onExtraCallbackWithResult(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            return false;
        }

        onExtraCallback() {
        }

        public /* bridge */ boolean IAuthTabCallback(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = super.IAuthTabCallback(str);
            if (i3 != 0) {
                int i4 = 49 / 0;
            }
            return zIAuthTabCallback;
        }
    }

    private static final List onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access000 + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        int i4 = access000 + 101;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return listEmptyList;
        }
        throw null;
    }

    private static void d(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onTransact;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 7;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 72 - View.MeasureSpec.getMode(0), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = 2;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onTransact;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = $11 + Imgproc.COLOR_YUV2RGB_YVYU;
            $10 = i10 % 128;
            int i11 = 2;
            int i12 = i10 % 2;
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 109;
                $10 = i14 % 128;
                if (i14 % i11 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i13]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), 72 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i13 <<= 1;
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 73 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 8849 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    i13++;
                }
                i11 = 2;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i15 = 0; i15 < 16; i15++) {
                int i16 = $10 + Imgproc.COLOR_YUV2RGB_YVYU;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i15];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 22252), 38 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), 10302 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i18;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 77 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void extraCommand() {
        onTransact = new int[]{-671485811, -2024348790, 707133000, -1898812606, -1361356179, 2044047214, 1874405491, -921942703, 356543545, 1440650440, 1614199653, -1950978339, -214073990, 2024514386, -1962071880, -1140331252, -1767386398, 1406725655};
    }
}
