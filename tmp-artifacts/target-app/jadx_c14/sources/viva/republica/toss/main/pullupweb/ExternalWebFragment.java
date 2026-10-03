package viva.republica.toss.main.pullupweb;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.core.webkit.GenericWebView;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.IconRoundCornerProgressBar1;
import o.RotationProvider1;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.deserializeUriCollection;
import o.deserializeUriNullableCollection;
import o.getOptimalPreviewSize;
import o.getWrite;
import o.roundedRect;
import o.setCircleColor;
import o.zzaj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ExternalWebFragment extends Fragment implements WebViewContentOwner {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static char asBinder = 0;
    private static char asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    public static final int onExtraCallbackWithResult;
    private static char onTransact;
    private TossCoreWebView onExtraCallback;
    private Function1<? super String, Unit> onWarmupCompleted = new Function1() { // from class: viva.republica.toss.main.pullupweb.ExternalWebFragment$$ExternalSyntheticLambda0
        public final Object invoke(Object obj) {
            return ExternalWebFragment.onExtraCallback((String) obj);
        }
    };
    private final SparseArray<Parcelable> onNavigationEvent = new SparseArray<>();
    private final deserializeUriCollection IAuthTabCallback = new deserializeUriCollection();

    static {
        onExtraCallbackWithResult();
        Companion = new IAuthTabCallback(null);
        onExtraCallbackWithResult = 8;
        int i = IAuthTabCallback_Parcel + 101;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = IAuthTabCallbackStub + 15;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean closeWebView(@Nullable String str, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zCloseWebView = super.closeWebView(str, z);
        int i4 = getInterfaceDescriptor + 65;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return zCloseWebView;
    }

    public /* bridge */ ViewGroup getCaWebViewContainer() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ViewGroup caWebViewContainer = super.getCaWebViewContainer();
        int i4 = IAuthTabCallbackStub + 121;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return caWebViewContainer;
    }

    public /* bridge */ Boolean getShouldWebViewPauseOnInvisible() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Boolean shouldWebViewPauseOnInvisible = super.getShouldWebViewPauseOnInvisible();
        int i4 = IAuthTabCallbackStub + 7;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return shouldWebViewPauseOnInvisible;
    }

    public /* bridge */ Intent getSourceIntent() {
        Intent sourceIntent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 61;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            sourceIntent = super.getSourceIntent();
            int i3 = 65 / 0;
        } else {
            sourceIntent = super.getSourceIntent();
        }
        int i4 = getInterfaceDescriptor + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return sourceIntent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ String getSwipeRefreshCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 13;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        String swipeRefreshCallback = super.getSwipeRefreshCallback();
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return swipeRefreshCallback;
    }

    public /* bridge */ boolean handleCaWebViewBackPress(@NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zHandleCaWebViewBackPress = super/*o.startApp*/.handleCaWebViewBackPress(function0);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        int i5 = IAuthTabCallbackStub + 11;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return zHandleCaWebViewBackPress;
    }

    public /* bridge */ boolean isSwipeRefreshEnabled() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            super.isSwipeRefreshEnabled();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIsSwipeRefreshEnabled = super.isSwipeRefreshEnabled();
        int i3 = getInterfaceDescriptor + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return zIsSwipeRefreshEnabled;
    }

    public /* bridge */ void onHistoryCleared() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onHistoryCleared();
        int i4 = IAuthTabCallbackStub + 1;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onPageReady() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.onPageReady();
        int i4 = IAuthTabCallbackStub + 43;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
    }

    public /* bridge */ void onSwipeToRefresh(@Nullable SwipeRefreshLayout swipeRefreshLayout) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super/*o.startApp*/.onSwipeToRefresh(swipeRefreshLayout);
        if (i3 == 0) {
            throw null;
        }
    }

    public /* bridge */ void onUpdateWebHistoryState() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 9;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.onUpdateWebHistoryState();
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 91;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setFullScreenEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.setFullScreenEnabled(z);
        int i4 = getInterfaceDescriptor + 73;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setShouldWebViewPauseOnInvisible(@Nullable Boolean bool) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        super.setShouldWebViewPauseOnInvisible(bool);
        int i4 = IAuthTabCallbackStub + 81;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setSwipeRefreshCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.setSwipeRefreshCallback(str);
        int i4 = getInterfaceDescriptor + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setSwipeRefreshEnabled(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 73;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.setSwipeRefreshEnabled(z);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallbackStub + 75;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public TossCoreWebView getWebView() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TossCoreWebView tossCoreWebView = this.onExtraCallback;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return tossCoreWebView;
    }

    public void onExtraCallback(@Nullable TossCoreWebView tossCoreWebView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        this.onExtraCallback = tossCoreWebView;
        if (i4 == 0) {
            int i5 = 21 / 0;
        }
        int i6 = i3 + 75;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 99;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = getInterfaceDescriptor + 53;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final void IAuthTabCallback(@NotNull Function1<? super String, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onWarmupCompleted = function1;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final Function1<String, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Function1 function1 = this.onWarmupCompleted;
        int i4 = i3 + 65;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return function1;
        }
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TossCoreWebView webView = getWebView();
        if (webView != null) {
            int i4 = getInterfaceDescriptor + 29;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            boolean zIAuthTabCallback = getOptimalPreviewSize.IAuthTabCallback(webView);
            if (i5 == 0 ? zIAuthTabCallback : zIAuthTabCallback) {
                int i6 = IAuthTabCallbackStub + 93;
                int i7 = i6 % 128;
                getInterfaceDescriptor = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 91;
                IAuthTabCallbackStub = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 30 / 0;
                }
                return true;
            }
        }
        return false;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 113;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TossCoreWebView webView = getWebView();
        if (webView != null) {
            int i4 = IAuthTabCallbackStub + 111;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            getOptimalPreviewSize.onNavigationEvent(webView);
            if (i5 == 0) {
                throw null;
            }
        }
        int i6 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 97 / 0;
        }
    }

    public void putInstanceStateData(int i, @Nullable Parcelable parcelable) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 33;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent.put(i, parcelable);
        int i5 = getInterfaceDescriptor + 125;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public Parcelable getInstanceStateData(int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 93;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Parcelable parcelable = this.onNavigationEvent.get(i);
        int i5 = IAuthTabCallbackStub + 105;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return parcelable;
    }

    public void addSubscription(@NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 47;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        this.IAuthTabCallback.onNavigationEvent(deserializeurinullablecollection);
        int i4 = IAuthTabCallbackStub + 123;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void removeSubscription(@NotNull deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 5;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
            this.IAuthTabCallback.onExtraCallbackWithResult(deserializeurinullablecollection);
            throw null;
        }
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        this.IAuthTabCallback.onExtraCallbackWithResult(deserializeurinullablecollection);
        int i3 = getInterfaceDescriptor + 125;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        View viewOnWarmupCompleted = onWarmupCompleted();
        onExtraCallback((TossCoreWebView) viewOnWarmupCompleted);
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.addView(viewOnWarmupCompleted, new FrameLayout.LayoutParams(-1, -1));
        int i2 = getInterfaceDescriptor + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return frameLayout;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 57;
        getInterfaceDescriptor = i2 % 128;
        GenericWebView genericWebView = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            getArguments();
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Object[] objArr = new Object[1];
            a(new char[]{30226, 38069, 64255, 50635}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, objArr);
            string = arguments.getString(((String) objArr[0]).intern());
        } else {
            string = null;
        }
        if (string != null) {
            int i3 = getInterfaceDescriptor + 107;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                StringsKt.isBlank(string);
                throw null;
            }
            if (StringsKt.isBlank(string)) {
                return;
            }
            GenericWebView webView = getWebView();
            if (webView instanceof GenericWebView) {
                int i4 = getInterfaceDescriptor + 63;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 != 0) {
                    genericWebView = webView;
                    int i5 = 30 / 0;
                } else {
                    genericWebView = webView;
                }
            }
            if (genericWebView != null) {
                genericWebView.loadUrl(string);
            }
        }
    }

    public static final class onNavigationEvent extends setCircleColor {
        onNavigationEvent(setCircleColor.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onReceivedTitle(WebView webView, String str) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super/*android.webkit.WebChromeClient*/.onReceivedTitle(webView, str);
        }
    }

    public static final class onExtraCallbackWithResult extends roundedRect {
        onExtraCallbackWithResult() {
            super((IconRoundCornerProgressBar1) null, 1, (DefaultConstructorMarker) null);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageStarted(webView, str, bitmap);
            ExternalWebFragment.this.onNavigationEvent().invoke(str);
        }
    }

    private final GenericWebView onWarmupCompleted() {
        int i = 2 % 2;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        GenericWebView genericWebView = new GenericWebView(fragmentActivityRequireActivity);
        genericWebView.setBackground(null);
        genericWebView.setWebChromeClient(new onNavigationEvent(new setCircleColor.onExtraCallback(fragmentActivityRequireActivity, "external-web-pullup").onExtraCallbackWithResult(fragmentActivityRequireActivity.getActivityResultRegistry(), this, zzaj.onNavigationEvent().onUnminimized()).onExtraCallbackWithResult(this).onExtraCallbackWithResult().IAuthTabCallback()));
        genericWebView.setWebViewClient(new onExtraCallbackWithResult());
        int i2 = getInterfaceDescriptor + 79;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        return genericWebView;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i6 = (c2 + i4) ^ ((c2 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i7 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onTransact);
                    objArr2[2] = Integer.valueOf(i7);
                    objArr2[1] = Integer.valueOf(i6);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), pressedStateDuration, longPressTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (asInterface ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10, 12435 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i8 = $10 + 79;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 15, 19901 - ((Process.getThreadPriority(0) + 20) >> 6), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i10 = $11 + 95;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public void onDestroyView() {
        int i = 2 % 2;
        this.IAuthTabCallback.onExtraCallbackWithResult();
        TossCoreWebView webView = getWebView();
        if (webView != null) {
            int i2 = getInterfaceDescriptor + 3;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                webView.destroy();
                throw null;
            }
            webView.destroy();
            int i3 = getInterfaceDescriptor + 79;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }
        onExtraCallback((TossCoreWebView) null);
        super.onDestroyView();
    }

    static void onExtraCallbackWithResult() {
        asInterface = (char) 9929;
        IAuthTabCallbackDefault = (char) 63791;
        asBinder = (char) 18301;
        onTransact = (char) 20136;
    }

    public static final class IAuthTabCallback {
        private static short[] onNavigationEvent;
        private static final byte[] $$a = {102, 12, 98, 84};
        private static final int $$b = 90;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asBinder = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallbackWithResult = -1144891515;
        private static int onWarmupCompleted = -1538795504;
        private static int IAuthTabCallback = -530381881;
        private static byte[] onExtraCallback = {-29, 82, 85, -27, 85, 84, 103, 81};

        private static String $$c(short s, int i, short s2) {
            int i2 = 3 - (i * 4);
            byte[] bArr = $$a;
            int i3 = (s * 4) + 115;
            int i4 = s2 * 3;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3 = i4 + i2;
                i2 = i2;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i3;
                int i7 = i2 + 1;
                if (i6 == i4) {
                    return new String(bArr2, 0);
                }
                i3 += bArr[i7];
                i2 = i7;
                i5 = i6;
            }
        }

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final ExternalWebFragment onNavigationEvent(@Nullable String str, @Nullable String str2) throws Throwable {
            int i = 2 % 2;
            ExternalWebFragment externalWebFragment = new ExternalWebFragment();
            Object[] objArr = new Object[1];
            a((short) (Process.getGidForName("") - 95), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 528846733, 9430 - AndroidCharacter.getMirror('0'), (-25) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str);
            Object[] objArr2 = new Object[1];
            a((short) ((-100) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (byte) KeyEvent.normalizeMetaState(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 528846731, (-1143266140) - MotionEvent.axisFromString(""), (-25) - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
            externalWebFragment.setArguments(RotationProvider1.onNavigationEvent(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str2)}));
            int i2 = asBinder + 55;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return externalWebFragment;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 43425), TextUtils.getOffsetBefore("", 0) + 42, TextUtils.getOffsetAfter("", 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                int i5 = iIntValue == -1 ? 1 : 0;
                if (i5 == 0) {
                    j = -4629411779493505016L;
                } else {
                    byte[] bArr = onExtraCallback;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i6 = 0; i6 < length; i6++) {
                            int i7 = $11 + 17;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.argb(0, 0, 0, 0) + 12843), 55 - Color.red(0), 2167 - (ViewConfiguration.getTouchSlop() >> 8), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onExtraCallback;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43423), 42 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                            int i9 = $10 + 87;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                            j = -4629411779493505016L;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j)) + i5;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), Color.alpha(0) + 86, 9566 - TextUtils.lastIndexOf("", '0'), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallback;
                    if (bArr4 != null) {
                        int i11 = $11 + 21;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i13 = 0; i13 < length2; i13++) {
                            bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i14 = $11 + 85;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        if (!z) {
                            short[] sArr = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            byte[] bArr6 = onExtraCallback;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }
}
