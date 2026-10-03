package viva.republica.toss.account.notification.join;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import im.toss.base.BaseFragment;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.webview.TossWebView;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import o.ASN1OutputStream;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CertificatePolicies;
import o.ConvertFloatArrayToByteArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.FlowRowOverflowScopeImplExternalSyntheticLambda1;
import o.GetTSAHashValue;
import o.PageContext;
import o.PermissionUtil;
import o.RippleNode;
import o.S2SRewardedVideoAdExtendedListener;
import o.SearchBarKtExternalSyntheticLambda5;
import o.addAllCommandLine;
import o.attachAdComponentViewApi;
import o.getDigest;
import o.getDistributionPoint;
import o.getKekid;
import o.getParamImp;
import o.getTextProgressSize;
import o.initMiniApp;
import o.preFillDefault;
import o.setCircleColor;
import o.setCircleStrokeWidth;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.widget.TouchSlopSwipeRefreshLayout;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AccountNotificationBankWebFragment extends BaseFragment implements WebViewContentOwner {
    private getDistributionPoint IAuthTabCallbackDefault;
    static final /* synthetic */ addAllCommandLine<Object>[] onNavigationEvent = {new PropertyReference1Impl<>(AccountNotificationBankWebFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentAccountNotificationBankWebBinding;", 0)};
    public static final int IAuthTabCallback = 8;
    private final PageContext onExtraCallbackWithResult = preFillDefault.onExtraCallbackWithResult(this, onNavigationEvent.onNavigationEvent);
    private final String onWarmupCompleted = AccountNotificationBankWebFragment.class.getSimpleName();
    private final Lazy onExtraCallback = FlowRowOverflowScopeImplExternalSyntheticLambda1.onNavigationEvent(this, Reflection.getOrCreateKotlinClass(ASN1OutputStream.class), new asInterface(this), new asBinder(null, this), new access100(this));

    public long getScreenId() {
        return -1L;
    }

    public /* bridge */ boolean closeWebView(@Nullable String str, boolean z) {
        return super.closeWebView(str, z);
    }

    public /* bridge */ ViewGroup getCaWebViewContainer() {
        return super.getCaWebViewContainer();
    }

    public /* bridge */ Boolean getShouldWebViewPauseOnInvisible() {
        return super.getShouldWebViewPauseOnInvisible();
    }

    public /* bridge */ Intent getSourceIntent() {
        return super.getSourceIntent();
    }

    public /* bridge */ String getSwipeRefreshCallback() {
        return super.getSwipeRefreshCallback();
    }

    public /* bridge */ boolean handleCaWebViewBackPress(@NotNull Function0<Unit> function0) {
        return super/*o.startApp*/.handleCaWebViewBackPress(function0);
    }

    public /* bridge */ boolean isSwipeRefreshEnabled() {
        return super.isSwipeRefreshEnabled();
    }

    public /* bridge */ void onHistoryCleared() {
        super.onHistoryCleared();
    }

    public /* bridge */ void onPageReady() {
        super.onPageReady();
    }

    public /* bridge */ void onSwipeToRefresh(@Nullable SwipeRefreshLayout swipeRefreshLayout) {
        super/*o.startApp*/.onSwipeToRefresh(swipeRefreshLayout);
    }

    public /* bridge */ void onUpdateWebHistoryState() {
        super.onUpdateWebHistoryState();
    }

    public /* bridge */ void setFullScreenEnabled(boolean z) {
        super.setFullScreenEnabled(z);
    }

    public /* bridge */ void setShouldWebViewPauseOnInvisible(@Nullable Boolean bool) {
        super.setShouldWebViewPauseOnInvisible(bool);
    }

    public /* bridge */ void setSwipeRefreshCallback(@Nullable String str) {
        super.setSwipeRefreshCallback(str);
    }

    public /* bridge */ void setSwipeRefreshEnabled(boolean z) {
        super.setSwipeRefreshEnabled(z);
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, GetTSAHashValue> {
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        onNavigationEvent() {
            super(1, GetTSAHashValue.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentAccountNotificationBankWebBinding;", 0);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final GetTSAHashValue invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return GetTSAHashValue.IAuthTabCallback(view);
        }
    }

    private final GetTSAHashValue onWarmupCompleted() {
        SearchBarKtExternalSyntheticLambda5 searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(this, onNavigationEvent[0]);
        Intrinsics.checkNotNullExpressionValue(searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult, "");
        return (GetTSAHashValue) searchBarKtExternalSyntheticLambda5OnExtraCallbackWithResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TossWebView asBinder() {
        TossWebView tossWebView = onWarmupCompleted().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tossWebView, "");
        return tossWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout onExtraCallbackWithResult() {
        FrameLayout root = onWarmupCompleted().IAuthTabCallback.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private final TouchSlopSwipeRefreshLayout onExtraCallback() {
        TouchSlopSwipeRefreshLayout touchSlopSwipeRefreshLayout = onWarmupCompleted().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(touchSlopSwipeRefreshLayout, "");
        return touchSlopSwipeRefreshLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ASN1OutputStream IAuthTabCallback() {
        return (ASN1OutputStream) this.onExtraCallback.getValue();
    }

    public TossCoreWebView getWebView() {
        return onWarmupCompleted().onNavigationEvent;
    }

    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(R.layout.fragment_account_notification_bank_web, viewGroup, false);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        onTransact();
        asInterface();
        if (IAuthTabCallback().asBinder()) {
            getDistributionPoint getdistributionpoint = this.IAuthTabCallbackDefault;
            String str = null;
            if (getdistributionpoint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                getdistributionpoint = null;
            }
            S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListenerOnExtraCallback = IAuthTabCallback().onExtraCallback();
            if (s2SRewardedVideoAdExtendedListenerOnExtraCallback != null) {
                str = (String) S2SRewardedVideoAdExtendedListener.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), -1068057786, getKekid.onExtraCallback(), 1068057787, new Object[]{s2SRewardedVideoAdExtendedListenerOnExtraCallback});
            }
            Intrinsics.checkNotNull(str);
            getdistributionpoint.IAuthTabCallback(str);
            return;
        }
        IAuthTabCallback().ICustomTabsCallback();
    }

    public static final class IAuthTabCallback implements getDigest {
        @Override // o.getDigest
        public void onNavigationEvent() {
        }

        IAuthTabCallback() {
        }
    }

    private final void onTransact() {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
        onExtraCallback().setEnabled(false);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.IAuthTabCallbackDefault = new getDistributionPoint(contextRequireContext, asBinder(), iAuthTabCallback, null);
        asBinder().setWebChromeClient(onNavigationEvent());
        asBinder().setWebViewClient(IAuthTabCallbackStub());
        asBinder().getSettings().setJavaScriptEnabled(true);
        asBinder().setTossJavascriptInterface(new setCircleStrokeWidth(this, asBinder(), new onExtraCallback(this), (getTextProgressSize) null, 8, (DefaultConstructorMarker) null));
    }

    private final void asInterface() {
        ASN1OutputStream aSN1OutputStreamIAuthTabCallback = IAuthTabCallback();
        aSN1OutputStreamIAuthTabCallback.access100().observe(getViewLifecycleOwner(), new BaseFragment.ICustomTabsCallback_Parcel(new onTransact()));
        aSN1OutputStreamIAuthTabCallback.IAuthTabCallbackStub().observe(getViewLifecycleOwner(), new BaseFragment.ICustomTabsCallback_Parcel(new IAuthTabCallbackDefault()));
        aSN1OutputStreamIAuthTabCallback.readTypedObject().observe(getViewLifecycleOwner(), new BaseFragment.ICustomTabsCallback_Parcel(new IAuthTabCallbackStub(aSN1OutputStreamIAuthTabCallback)));
    }

    public static final class onWarmupCompleted extends setCircleColor {
        onWarmupCompleted(setCircleColor.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }

        public void onProgressChanged(WebView webView, int i) {
            Intrinsics.checkNotNullParameter(webView, "");
            AccountNotificationBankWebFragment.this.IAuthTabCallback().access100().setValue(Boolean.FALSE);
        }
    }

    private final setCircleColor onNavigationEvent() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new onWarmupCompleted(new setCircleColor.onExtraCallback(contextRequireContext, "account-notification-bank").IAuthTabCallback());
    }

    public static final class onExtraCallbackWithResult extends CertificatePolicies {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;
        private static char[] onNavigationEvent = {32767, 32758, 32765, 32761, 32744, 32722, 32753, 32751, 32750, 32747, 32737};
        private static int onExtraCallbackWithResult = -1184333926;
        private static boolean IAuthTabCallback = true;
        private static boolean onWarmupCompleted = true;

        private static void c(byte[] bArr, char[] cArr, int[] iArr, int i, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr3 = onNavigationEvent;
            char c = '0';
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i3 = 0;
                while (i3 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 76 - TextUtils.lastIndexOf("", c), 20952 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3++;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            try {
                Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 75, 16038 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i4 = 1052772399;
                if (onWarmupCompleted) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        int i5 = $10 + 19;
                        $11 = i5 % 128;
                        int i6 = i5 % 2;
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-16777153) - Color.rgb(0, 0, 0), TextUtils.indexOf("", "", 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i4 = 1052772399;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                if (!IAuthTabCallback) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                    char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                    }
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i7 = $11 + 29;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i8 = $11 + 111;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 63 - Color.argb(0, 0, 0, 0), 12214 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        onExtraCallbackWithResult() {
        }

        public void onPageFinished(WebView webView, String str) throws Throwable {
            Object obj;
            AccountNotificationBankWebFragment accountNotificationBankWebFragment;
            String queryParameter;
            TossCoreWebView webView2;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 77;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(webView, "");
            Intrinsics.checkNotNullParameter(str, "");
            super.onPageFinished(webView, str);
            AccountNotificationBankWebFragment.this.IAuthTabCallback().access100().setValue(Boolean.FALSE);
            PermissionUtil.onWarmupCompleted(webView, false, 1, (Object) null);
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Uri.parse(str));
                int i4 = onTransact + 7;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.onExtraCallback(obj)) {
                obj = null;
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                int i6 = onTransact + 117;
                IAuthTabCallbackDefault = i6 % 128;
                if (i6 % 2 != 0) {
                    accountNotificationBankWebFragment = AccountNotificationBankWebFragment.this;
                    Object[] objArr = new Object[1];
                    c(new byte[]{-117, -123, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, null, 23 / KeyEvent.normalizeMetaState(1), objArr);
                    queryParameter = uri.getQueryParameter(((String) objArr[0]).intern());
                    if (queryParameter == null) {
                        return;
                    }
                } else {
                    accountNotificationBankWebFragment = AccountNotificationBankWebFragment.this;
                    Object[] objArr2 = new Object[1];
                    c(new byte[]{-117, -123, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, null, 127 - KeyEvent.normalizeMetaState(0), objArr2);
                    queryParameter = uri.getQueryParameter(((String) objArr2[0]).intern());
                    if (queryParameter == null) {
                        return;
                    }
                }
                if (!Boolean.parseBoolean(queryParameter) || (webView2 = accountNotificationBankWebFragment.getWebView()) == null) {
                    return;
                }
                int i7 = onTransact + 39;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                webView2.clearHistory();
                if (i8 != 0) {
                    throw null;
                }
            }
        }
    }

    public static final class asInterface extends Lambda implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asInterface(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 invoke() {
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore = this.$this_activityViewModels.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
            return viewModelStore;
        }
    }

    public static final class asBinder extends Lambda implements Function0<AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2> {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Function0 function0, Fragment fragment) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 invoke() {
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            Function0 function0 = this.$extrasProducer;
            if (function0 != null && (androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 = (AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2) function0.invoke()) != null) {
                return androidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2;
            }
            AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda2 defaultViewModelCreationExtras = this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
            return defaultViewModelCreationExtras;
        }
    }

    private final WebViewClient IAuthTabCallbackStub() {
        return new onExtraCallbackWithResult();
    }

    public static final class access100 extends Lambda implements Function0<ViewModelProvider.onWarmupCompleted> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public access100(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.onWarmupCompleted invoke() {
            ViewModelProvider.onWarmupCompleted defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            return defaultViewModelProviderFactory;
        }
    }

    public boolean onBackPressed() {
        TossCoreWebView webView = getWebView();
        if (webView != null && TossBridgeWebView.onWarmupCompleted(webView, (Function1) null, 1, (Object) null)) {
            return true;
        }
        TossCoreWebView webView2 = getWebView();
        if (webView2 == null || !webView2.canGoBack()) {
            return false;
        }
        TossCoreWebView webView3 = getWebView();
        if (webView3 != null) {
            webView3.goBack();
        }
        return true;
    }

    public static final class IAuthTabCallbackDefault implements Function1<Throwable, Unit> {
        public IAuthTabCallbackDefault() {
        }

        public final void IAuthTabCallback(Throwable th) {
            Throwable th2 = th;
            Intrinsics.checkNotNull(th2);
            getParamImp.onWarmupCompleted(th2, AccountNotificationBankWebFragment.this.requireContext(), false, (initMiniApp) null, (Function0) null, (Function1) null, 30, (Object) null);
        }

        public /* synthetic */ Object invoke(Object obj) {
            IAuthTabCallback(obj);
            return Unit.INSTANCE;
        }
    }

    public static final class IAuthTabCallbackStub implements Function1<attachAdComponentViewApi, Unit> {
        final /* synthetic */ ASN1OutputStream onExtraCallback;

        public IAuthTabCallbackStub(ASN1OutputStream aSN1OutputStream) {
            this.onExtraCallback = aSN1OutputStream;
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted(obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(attachAdComponentViewApi attachadcomponentviewapi) {
            Object obj;
            if (AccountNotificationBankWebFragment.this.onExtraCallbackWithResult().getVisibility() == 0) {
                AccountNotificationBankWebFragment.this.onExtraCallbackWithResult().setVisibility(8);
            }
            try {
                Result.Companion companion = Result.Companion;
                RippleNode.onNavigationEvent(AccountNotificationBankWebFragment.this).onNavigationEvent(R.id.action_accountNotificationBankWebFragment_to_accountNotificationJoinCompleteFragment);
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("AccountNotificationBankWebFragment::navigate", th2);
            }
        }
    }

    public static final class onTransact implements Function1<Boolean, Unit> {
        public onTransact() {
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallback(obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallback(Boolean bool) {
            if (bool.booleanValue()) {
                AccountNotificationBankWebFragment.this.onExtraCallbackWithResult().setVisibility(0);
            } else {
                AccountNotificationBankWebFragment.this.onExtraCallbackWithResult().setVisibility(8);
            }
        }
    }
}
