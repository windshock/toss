package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.widget.ExpandableListView;
import androidx.core.view.WindowInsetsCompat;
import im.toss.base.BaseActivity;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import im.toss.tosssecurities.features.main.home.ui.view.section.overview.component.overlay.RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$;
import im.toss.tosssecurities.webview.TossSecuritiesWebView;
import im.toss.tosssecurities.webview.WarmUpContainer;
import im.toss.tosssecurities.webview.viewholder.TossSecWebViewHolder$generateWarmUpWebView$1$webViewContentOwner$1;
import im.toss.uikit.base.UIKitBaseFragment;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFi1pSDKAFa1ySDK;
import o.lambdaonInstallReferrerSetupFinished0;
import o.newKnownLengthSink;
import o.w_;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class w_ {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static int ICustomTabsCallbackDefault = 0;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static int[] onActivityLayout = null;
    private static final getBorderRadius<Unit> onExtraCallback;
    public static final int onExtraCallbackWithResult;
    private static int onRelationshipValidationResult = 1;
    private static int onUnminimized;
    private final getBorderRadius<TossSecuritiesWebView> IAuthTabCallback;
    private final Context IAuthTabCallbackDefault;
    private final getBorderRadius<TossSecuritiesWebView> IAuthTabCallbackStub;
    private final decodeRegion IAuthTabCallbackStubProxy;
    private final UIKitBaseFragment IAuthTabCallback_Parcel;
    private final setTopGuideFont ICustomTabsCallback;
    private final onInAppPurchaseValidationError access000;
    private final getSupportedHighSpeedResolutionsFor access100;
    private final findResAndMsg asBinder;
    private final WebViewContentOwner asInterface;
    private final getTileModeX<TossSecuritiesWebView> extraCallback;
    private final getTileModeX<lambdaonInstallReferrerSetupFinished0> extraCallbackWithResult;
    private final ConcurrentHashMap.KeySetView<lambdaonInstallReferrerSetupFinished0, Boolean> getInterfaceDescriptor;
    private final Lazy onActivityResized;
    private final AFi1rSDK onMessageChannelReady;
    private final WarmUpContainer onMinimized;
    private final getBorderRadius<lambdaonInstallReferrerSetupFinished0> onNavigationEvent;
    private final ConcurrentHashMap<lambdaonInstallReferrerSetupFinished0, TossSecuritiesWebView> onPostMessage;
    private final AFi1aSDK4 onTransact;
    private final getBorderRadius<lambdaonInstallReferrerSetupFinished0> onWarmupCompleted;
    private final getTileModeX<lambdaonInstallReferrerSetupFinished0> readTypedObject;
    private final Function1<String, Boolean> writeTypedObject;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        w_ w_Var = (w_) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 3;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDKAccess100 = access100(w_Var);
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return aFi1pSDKAFa1ySDKAccess100;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, im.toss.tosssecurities.webview.TossSecuritiesWebView] */
    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i7 = ~i5;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i4;
        int i11 = i9 | (~(i10 | i));
        int i12 = (~(i | i7)) | (~(i8 | i10));
        int i13 = ~(i5 | i4);
        int i14 = i12 | i13;
        int i15 = i13 | i11;
        int i16 = i5 + i4 + i6 + ((-1585779005) * i3) + (640148872 * i2);
        int i17 = i16 * i16;
        int i18 = (i5 * 308833806) + 153878528 + (308833806 * i4) + ((-448846874) * i11) + ((-224423437) * i14) + (224423437 * i15) + (84410368 * i6) + (1159200768 * i3) + ((-734003200) * i2) + (2089549824 * i17);
        int i19 = (i5 * (-1291220770)) + 263398195 + (i4 * (-1291220770)) + (i11 * (-1802)) + (i14 * (-901)) + (i15 * 901) + (i6 * (-1291221671)) + (i3 * (-1079815989)) + (i2 * 669414472) + (i17 * 145489920);
        switch (i18 + (i19 * i19 * (-1699479552))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                w_ w_Var = (w_) objArr[0];
                int i20 = 2 % 2;
                int i21 = onUnminimized;
                int i22 = i21 + 125;
                onRelationshipValidationResult = i22 % 128;
                int i23 = i22 % 2;
                Function1<String, Boolean> function1 = w_Var.writeTypedObject;
                int i24 = i21 + 69;
                onRelationshipValidationResult = i24 % 128;
                int i25 = i24 % 2;
                return function1;
            case 6:
                return onTransact(objArr);
            case 7:
                w_ w_Var2 = (w_) objArr[0];
                int i26 = 2 % 2;
                ?? OnWarmupCompleted = w_Var2.onWarmupCompleted((Context) objArr[1], (TossSecuritiesWebView.onWarmupCompleted) objArr[2], (lambdaonInstallReferrerSetupFinished0) objArr[3]);
                OnWarmupCompleted.setWarmUpCallback$TossSecuritiesNativeWebview_release(new onExtraCallbackWithResult(OnWarmupCompleted, w_Var2));
                w_Var2.onMinimized.addView(OnWarmupCompleted);
                onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(w_Var2.asInterface), putChannelInfo.onWarmupCompleted(), null, new IAuthTabCallback(OnWarmupCompleted, null), 2, null);
                int i27 = onRelationshipValidationResult + 75;
                onUnminimized = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 8:
                w_ w_Var3 = (w_) objArr[0];
                int i29 = 2 % 2;
                int i30 = onRelationshipValidationResult + 37;
                onUnminimized = i30 % 128;
                int i31 = i30 % 2;
                AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = (AFi1pSDKAFa1ySDK) w_Var3.onActivityResized.getValue();
                int i32 = onRelationshipValidationResult + 15;
                onUnminimized = i32 % 128;
                int i33 = i32 % 2;
                return aFi1pSDKAFa1ySDK;
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(w_ w_Var, TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onUnminimized + 27;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(w_Var, tossSecuritiesWebView);
        int i4 = onRelationshipValidationResult + 73;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(w_ w_Var, lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 81;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(w_Var, lambdaoninstallreferrersetupfinished0, tossSecuritiesWebView);
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        int i5 = onRelationshipValidationResult + 5;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w_(@NotNull Context context, @NotNull WebViewContentOwner webViewContentOwner, @NotNull Function1<? super String, Boolean> function1, @NotNull WarmUpContainer warmUpContainer, @NotNull setTopGuideFont settopguidefont, @NotNull decodeRegion decoderegion, @NotNull AFi1rSDK aFi1rSDK, @NotNull onInAppPurchaseValidationError oninapppurchasevalidationerror, @NotNull UIKitBaseFragment uIKitBaseFragment, @NotNull AFi1aSDK4 aFi1aSDK4) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(warmUpContainer, "");
        Intrinsics.checkNotNullParameter(settopguidefont, "");
        Intrinsics.checkNotNullParameter(decoderegion, "");
        Intrinsics.checkNotNullParameter(aFi1rSDK, "");
        Intrinsics.checkNotNullParameter(oninapppurchasevalidationerror, "");
        Intrinsics.checkNotNullParameter(uIKitBaseFragment, "");
        Intrinsics.checkNotNullParameter(aFi1aSDK4, "");
        this.IAuthTabCallbackDefault = context;
        this.asInterface = webViewContentOwner;
        this.writeTypedObject = function1;
        this.onMinimized = warmUpContainer;
        this.ICustomTabsCallback = settopguidefont;
        this.IAuthTabCallbackStubProxy = decoderegion;
        this.onMessageChannelReady = aFi1rSDK;
        this.access000 = oninapppurchasevalidationerror;
        this.IAuthTabCallback_Parcel = uIKitBaseFragment;
        this.onTransact = aFi1aSDK4;
        this.access100 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(UUID.randomUUID().toString(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.onPostMessage = new ConcurrentHashMap<>();
        findResAndMsg findresandmsgOnWarmupCompleted = findRes.onWarmupCompleted(putChannelInfo.onExtraCallback().onExtraCallback().plus(isNeedUnzip.onExtraCallbackWithResult(null, 1, null)));
        this.asBinder = findresandmsgOnWarmupCompleted;
        getBorderRadius<lambdaonInstallReferrerSetupFinished0> getborderradiusOnWarmupCompleted = getShine.onWarmupCompleted(0, 1, null, 5, null);
        this.onWarmupCompleted = getborderradiusOnWarmupCompleted;
        this.readTypedObject = ycxycx.onExtraCallbackWithResult((getBorderRadius) getborderradiusOnWarmupCompleted);
        this.IAuthTabCallbackStub = getShine.onWarmupCompleted(0, 16, null, 5, null);
        this.onActivityResized = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.webview.viewholder.TossSecWebViewHolder$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 77;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {this.f$0};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = (AFi1pSDKAFa1ySDK) w_.onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 429395115, -429395111, iOnNavigationEvent2);
                int i4 = onWarmupCompleted + 13;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return aFi1pSDKAFa1ySDK;
            }
        });
        getBorderRadius<lambdaonInstallReferrerSetupFinished0> getborderradiusOnWarmupCompleted2 = getShine.onWarmupCompleted(0, 16, null, 5, null);
        this.onNavigationEvent = getborderradiusOnWarmupCompleted2;
        this.extraCallbackWithResult = ycxycx.onExtraCallbackWithResult((getBorderRadius) getborderradiusOnWarmupCompleted2);
        getBorderRadius<TossSecuritiesWebView> getborderradiusOnWarmupCompleted3 = getShine.onWarmupCompleted(0, 16, null, 5, null);
        this.IAuthTabCallback = getborderradiusOnWarmupCompleted3;
        this.extraCallback = ycxycx.onExtraCallbackWithResult((getBorderRadius) getborderradiusOnWarmupCompleted3);
        this.getInterfaceDescriptor = ConcurrentHashMap.newKeySet();
        onLoadStarted.onExtraCallback(findresandmsgOnWarmupCompleted, putChannelInfo.onWarmupCompleted(), null, new AnonymousClass5(null), 2, null);
        onLoadStarted.onExtraCallback(findresandmsgOnWarmupCompleted, putChannelInfo.onExtraCallback().onExtraCallback(), null, new AnonymousClass3(null), 2, null);
    }

    public static final /* synthetic */ AFi1aSDK4 IAuthTabCallback(w_ w_Var) {
        int i = 2 % 2;
        int i2 = onUnminimized + 43;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        AFi1aSDK4 aFi1aSDK4 = w_Var.onTransact;
        if (i3 != 0) {
            return aFi1aSDK4;
        }
        throw null;
    }

    public static final /* synthetic */ getBorderRadius IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 87;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        getBorderRadius<Unit> getborderradius = onExtraCallback;
        int i5 = i2 + 111;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            return getborderradius;
        }
        throw null;
    }

    public static final /* synthetic */ AFi1rSDK IAuthTabCallbackDefault(w_ w_Var) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 101;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        AFi1rSDK aFi1rSDK = w_Var.onMessageChannelReady;
        if (i4 != 0) {
            int i5 = 65 / 0;
        }
        int i6 = i3 + 11;
        onRelationshipValidationResult = i6 % 128;
        int i7 = i6 % 2;
        return aFi1rSDK;
    }

    public static final /* synthetic */ ConcurrentHashMap access000(w_ w_Var) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 51;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        ConcurrentHashMap<lambdaonInstallReferrerSetupFinished0, TossSecuritiesWebView> concurrentHashMap = w_Var.onPostMessage;
        int i5 = i2 + 87;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return concurrentHashMap;
    }

    public static final /* synthetic */ WarmUpContainer asBinder(w_ w_Var) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 27;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        WarmUpContainer warmUpContainer = w_Var.onMinimized;
        if (i4 != 0) {
            int i5 = 65 / 0;
        }
        int i6 = i2 + 91;
        onUnminimized = i6 % 128;
        if (i6 % 2 == 0) {
            return warmUpContainer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ decodeRegion asInterface(w_ w_Var) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 37;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        decodeRegion decoderegion = w_Var.IAuthTabCallbackStubProxy;
        int i5 = i3 + 21;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            return decoderegion;
        }
        throw null;
    }

    public static final /* synthetic */ WebViewContentOwner onExtraCallbackWithResult(w_ w_Var) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 37;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        WebViewContentOwner webViewContentOwner = w_Var.asInterface;
        int i5 = i2 + 67;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return webViewContentOwner;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        w_ w_Var = (w_) objArr[0];
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[1];
        int i = 2 % 2;
        int i2 = onUnminimized + 125;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        w_Var.onExtraCallback(tossSecuritiesWebView);
        int i4 = onRelationshipValidationResult + 103;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return null;
    }

    public static final /* synthetic */ getBorderRadius onNavigationEvent(w_ w_Var) {
        int i = 2 % 2;
        int i2 = onUnminimized + 15;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        int i4 = i2 % 2;
        getBorderRadius<TossSecuritiesWebView> getborderradius = w_Var.IAuthTabCallbackStub;
        int i5 = i3 + 91;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return getborderradius;
    }

    public static final /* synthetic */ void onNavigationEvent(w_ w_Var, TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onUnminimized + 23;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        w_Var.onExtraCallbackWithResult(tossSecuritiesWebView);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        int i5 = onRelationshipValidationResult + 125;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ setTopGuideFont onTransact(w_ w_Var) {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 125;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        setTopGuideFont settopguidefont = w_Var.ICustomTabsCallback;
        int i5 = i2 + 43;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            return settopguidefont;
        }
        throw null;
    }

    public static final /* synthetic */ Context onWarmupCompleted(w_ w_Var) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 69;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        Context context = w_Var.IAuthTabCallbackDefault;
        int i5 = i2 + 111;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        w_ w_Var = (w_) objArr[0];
        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) objArr[1];
        int i = 2 % 2;
        int i2 = onUnminimized + 21;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        w_Var.IAuthTabCallback(tossSecuritiesWebView);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final AFi1pSDKAFa1ySDK access100(w_ w_Var) {
        int i = 2 % 2;
        int i2 = onUnminimized + 3;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        AFi1pSDKAFa1ySDK.onWarmupCompleted onwarmupcompleted = AFi1pSDKAFa1ySDK.Companion;
        Context context = w_Var.IAuthTabCallbackDefault;
        if (i3 != 0) {
            return onwarmupcompleted.onWarmupCompleted(context);
        }
        onwarmupcompleted.onWarmupCompleted(context);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        w_ w_Var = (w_) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 59;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        getTileModeX<lambdaonInstallReferrerSetupFinished0> gettilemodex = w_Var.extraCallbackWithResult;
        int i5 = i2 + 9;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return gettilemodex;
    }

    public final getTileModeX<TossSecuritiesWebView> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onUnminimized + 55;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        getTileModeX<TossSecuritiesWebView> gettilemodex = this.extraCallback;
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return gettilemodex;
    }

    public final boolean onNavigationEvent(@NotNull lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 57;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
        boolean zContains = this.getInterfaceDescriptor.contains(lambdaoninstallreferrersetupfinished0);
        int i4 = onUnminimized + 47;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return zContains;
    }

    public final void IAuthTabCallback(@NotNull lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0) {
        int i = 2 % 2;
        int i2 = onUnminimized + 105;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
        this.getInterfaceDescriptor.remove(lambdaoninstallreferrersetupfinished0);
        int i4 = onUnminimized + 35;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: o.w_$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;

        AnonymousClass5(access13800<? super AnonymousClass5> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass5 anonymousClass5 = w_.this.new AnonymousClass5(access13800Var);
            int i2 = onWarmupCompleted + 41;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg2, access13800Var2);
            }
            onWarmupCompleted(findresandmsg2, access13800Var2);
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            AnonymousClass5 anonymousClass5 = (AnonymousClass5) create(findresandmsg, access13800Var);
            if (i3 == 0) {
                anonymousClass5.invokeSuspend(Unit.INSTANCE);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = anonymousClass5.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 31;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        /* renamed from: o.w_$5$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, access13800<? super Unit>, Object> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            int label;
            final /* synthetic */ w_ this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(w_ w_Var, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = w_Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
                int i2 = onNavigationEvent + 45;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 19 / 0;
                }
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Unit unit, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted(unit, access13800Var);
                int i4 = onNavigationEvent + 53;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }

            public final Object onWarmupCompleted(Unit unit, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 59;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(unit, access13800Var);
                if (i3 == 0) {
                    anonymousClass1.invokeSuspend(Unit.INSTANCE);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass1.invokeSuspend(Unit.INSTANCE);
                int i4 = onNavigationEvent + 71;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 59 / 0;
                }
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnExtraCallback = access14100.onExtraCallback();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    w_ w_Var = this.this$0;
                    this.label = 1;
                    int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                    int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                    int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                    if (w_.onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{w_Var, false, this, 1, null}, iOnNavigationEvent3, -1226858022, 1226858028, iOnNavigationEvent2) == objOnExtraCallback) {
                        int i3 = onNavigationEvent + 15;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        return objOnExtraCallback;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = onNavigationEvent + 107;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        int i6 = 80 / 0;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i7 = onWarmupCompleted + 83;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                return unit;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    int i3 = onNavigationEvent + 43;
                    int i4 = i3 % 128;
                    onWarmupCompleted = i4;
                    int i5 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i4 + 83;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    getBorderRadius getborderradiusIAuthTabCallback = w_.IAuthTabCallback();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(w_.this, null);
                    this.label = 1;
                    if (ycxycx.onWarmupCompleted(getborderradiusIAuthTabCallback, anonymousClass1, this) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: o.w_$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        AnonymousClass3(access13800<? super AnonymousClass3> access13800Var) {
            super(2, access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            AnonymousClass3 anonymousClass3 = w_.this.new AnonymousClass3(access13800Var);
            int i2 = onExtraCallback + 113;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return anonymousClass3;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg2, access13800Var2);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg2, access13800Var2);
            int i3 = onExtraCallback + 71;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((AnonymousClass3) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 34 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 29;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                int i5 = onExtraCallback + 23;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.onNavigationEvent(obj);
                getBorderRadius getborderradiusOnNavigationEvent = w_.onNavigationEvent(w_.this);
                final w_ w_Var = w_.this;
                setRipple setripple = new setRipple() { // from class: o.w_.3.3
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    @Override // o.setRipple
                    public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallbackWithResult + 79;
                        IAuthTabCallback = i8 % 128;
                        Object obj3 = null;
                        TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) obj2;
                        if (i8 % 2 != 0) {
                            IAuthTabCallback(tossSecuritiesWebView, access13800Var);
                            obj3.hashCode();
                            throw null;
                        }
                        Object objIAuthTabCallback = IAuthTabCallback(tossSecuritiesWebView, access13800Var);
                        int i9 = onExtraCallbackWithResult + 115;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            return objIAuthTabCallback;
                        }
                        obj3.hashCode();
                        throw null;
                    }

                    public final Object IAuthTabCallback(TossSecuritiesWebView tossSecuritiesWebView, access13800<? super Unit> access13800Var) {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 57;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        w_.onNavigationEvent(w_Var, tossSecuritiesWebView);
                        Unit unit = Unit.INSTANCE;
                        int i10 = IAuthTabCallback + 109;
                        onExtraCallbackWithResult = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 18 / 0;
                        }
                        return unit;
                    }
                };
                this.label = 1;
                if (getborderradiusOnNavigationEvent.collect(setripple, this) == objOnExtraCallback) {
                    int i7 = onExtraCallback;
                    int i8 = i7 + 91;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    int i9 = i7 + 7;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 != 0) {
                        return objOnExtraCallback;
                    }
                    throw null;
                }
            }
            throw new setWrite();
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onActivityLayout;
        int i4 = -1469660336;
        long j = 0;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 51;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 95;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), View.resolveSize(0, 0) + 72, (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = -1469660336;
                    j = 0;
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
        int[] iArr5 = onActivityLayout;
        if (iArr5 != null) {
            int i11 = $10 + 1;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i13]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 71 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0'), 8848 - Color.argb(i5, i5, i5, i5), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i13++;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i5;
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
            int i14 = $10 + 19;
            $11 = i14 % 128;
            int i15 = 2;
            int i16 = i14 % 2;
            int i17 = 0;
            while (i17 < 16) {
                int i18 = $10 + 25;
                $11 = i18 % 128;
                int i19 = i18 % i15;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i17];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 22253), 38 - ImageFormat.getBitsPerPixel(0), 10301 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i17++;
                i15 = 2;
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4034), 77 - ExpandableListView.getPackedPositionChild(0L), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final void asBinder() throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = 2 % 2;
        if (this.onPostMessage.isEmpty()) {
            int i2 = onUnminimized + Imgproc.COLOR_YUV2RGBA_YVYU;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            if (this.onMessageChannelReady.IAuthTabCallback()) {
                int i4 = onRelationshipValidationResult + 85;
                onUnminimized = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = {this, this.IAuthTabCallbackDefault, TossSecuritiesWebView.onWarmupCompleted.FINTECH, null, 4, null};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 765291558, -765291555, iOnNavigationEvent2);
                Object[] objArr2 = {this, this.IAuthTabCallbackDefault, TossSecuritiesWebView.onWarmupCompleted.MICRO_MTS, null, 4, null};
                int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                onExtraCallback(iOnNavigationEvent3, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 765291558, -765291555, iOnNavigationEvent4);
            }
        }
    }

    private final int onWarmupCompleted(Context context) {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        BaseActivity baseActivityOnNavigationEvent = accesscombine.onNavigationEvent(context);
        if (baseActivityOnNavigationEvent != null) {
            WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = WindowInsetsCompat.onExtraCallbackWithResult(baseActivityOnNavigationEvent.getWindowManager().getCurrentWindowMetrics().getWindowInsets());
            Intrinsics.checkNotNullExpressionValue(windowInsetsCompatOnExtraCallbackWithResult, "");
            int iOnExtraCallback = v_.onExtraCallback(windowInsetsCompatOnExtraCallbackWithResult.onWarmupCompleted(WindowInsetsCompat.onTransact.asInterface()).onExtraCallback, forceDomainCheck.onExtraCallbackWithResult(windowInsetsCompatOnExtraCallbackWithResult), context.getResources().getDisplayMetrics().density);
            int i2 = onRelationshipValidationResult + 79;
            onUnminimized = i2 % 128;
            if (i2 % 2 == 0) {
                return iOnExtraCallback;
            }
            throw null;
        }
        int i3 = onUnminimized + 107;
        onRelationshipValidationResult = i3 % 128;
        return i3 % 2 == 0 ? 1 : 0;
    }

    private final void IAuthTabCallback(final TossSecuritiesWebView tossSecuritiesWebView, final lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0) {
        int i = 2 % 2;
        newKnownLengthSink.IAuthTabCallback.onExtraCallbackWithResult(newKnownLengthSink.Companion, Http1ExchangeCodecAbstractSource.SEAND_4113, new Function0() { // from class: im.toss.tosssecurities.webview.viewholder.TossSecWebViewHolder$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 21;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                w_ w_Var = this.f$0;
                if (i4 != 0) {
                    return w_.onExtraCallback(w_Var, lambdaoninstallreferrersetupfinished0, tossSecuritiesWebView);
                }
                w_.onExtraCallback(w_Var, lambdaoninstallreferrersetupfinished0, tossSecuritiesWebView);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, (Function0) null, (Function1) null, 12, (Object) null);
        int i2 = onRelationshipValidationResult + 57;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(w_ w_Var, lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        Iterator<T> it = v_.onNavigationEvent(w_Var.onWarmupCompleted(w_Var.IAuthTabCallbackDefault), Intrinsics.areEqual(lambdaoninstallreferrersetupfinished0, lambdaonInstallReferrerSetupFinished0.onExtraCallback.IAuthTabCallback)).iterator();
        int i2 = onRelationshipValidationResult + 25;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = onRelationshipValidationResult + 55;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            tossSecuritiesWebView.onExtraCallbackWithResult((setTopGuideFontStyle) it.next());
        }
        return Unit.INSTANCE;
    }

    private final TossSecuritiesWebView onWarmupCompleted(Context context, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = 2 % 2;
        TossBridgeWebView tossSecuritiesWebView = new TossSecuritiesWebView(context);
        tossSecuritiesWebView.setType(onwarmupcompleted);
        tossSecuritiesWebView.setWebId(lambdaoninstallreferrersetupfinished0);
        IAuthTabCallback((TossSecuritiesWebView) tossSecuritiesWebView, lambdaoninstallreferrersetupfinished0);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        layoutParams.width = -1;
        layoutParams.height = -1;
        tossSecuritiesWebView.setLayoutParams(layoutParams);
        TossSecWebViewHolder$generateWarmUpWebView$1$webViewContentOwner$1 tossSecWebViewHolder$generateWarmUpWebView$1$webViewContentOwner$1 = new TossSecWebViewHolder$generateWarmUpWebView$1$webViewContentOwner$1(this, tossSecuritiesWebView, context);
        Response response = Response.onNavigationEvent;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        tossSecuritiesWebView.setTossJavascriptInterface(((AFi1qSDK1) Response.onExtraCallback(applicationContext, AFi1qSDK1.class)).Rbool().onNavigationEvent(tossSecWebViewHolder$generateWarmUpWebView$1$webViewContentOwner$1, tossSecuritiesWebView));
        tossSecuritiesWebView.setWebChromeClient(this.onTransact);
        tossSecuritiesWebView.setRenderProcessRecoveryEnabled(true);
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        tossSecuritiesWebView.setMonitoringTracker$TossSecuritiesNativeWebview_release((AFi1pSDKAFa1ySDK) onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3, -2098560719, 2098560727, iOnNavigationEvent2));
        getBorderRadius<TossSecuritiesWebView> getborderradius = this.IAuthTabCallbackStub;
        int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        tossSecuritiesWebView.setWebViewClient(new AFi1aSDK4ExternalSyntheticLambda0(getborderradius, (AFi1pSDKAFa1ySDK) onExtraCallback(iOnNavigationEvent4, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent6, -2098560719, 2098560727, iOnNavigationEvent5)));
        int i2 = onUnminimized + 125;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            return tossSecuritiesWebView;
        }
        throw null;
    }

    private final void onExtraCallbackWithResult(TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onUnminimized + 37;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0NewAuthTabSession = tossSecuritiesWebView.newAuthTabSession();
        if (lambdaoninstallreferrersetupfinished0NewAuthTabSession != null) {
            this.getInterfaceDescriptor.add(lambdaoninstallreferrersetupfinished0NewAuthTabSession);
            this.onNavigationEvent.onNavigationEvent(lambdaoninstallreferrersetupfinished0NewAuthTabSession);
        } else {
            int i4 = onRelationshipValidationResult + 47;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, ViewParent viewParent) {
        ViewGroup viewGroup;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 69;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
            viewGroup = viewParent instanceof ViewGroup ? (ViewGroup) viewParent : null;
        } else if (viewParent instanceof ViewGroup) {
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.onWarmupCompleted.onNavigationEvent(lambdaoninstallreferrersetupfinished0);
        int i4 = onUnminimized + 49;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        w_ w_Var = (w_) objArr[0];
        Context context = (Context) objArr[1];
        TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted = (TossSecuritiesWebView.onWarmupCompleted) objArr[2];
        Object obj = (lambdaonInstallReferrerSetupFinished0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        Object obj2 = objArr[5];
        int i = 2 % 2;
        Object obj3 = null;
        if ((iIntValue & 4) != 0) {
            int i2 = onUnminimized + 101;
            onRelationshipValidationResult = i2 % 128;
            if (i2 % 2 == 0) {
                lambdaonInstallReferrerSetupFinished0.onNavigationEvent onnavigationevent = lambdaonInstallReferrerSetupFinished0.onNavigationEvent.onNavigationEvent;
                obj3.hashCode();
                throw null;
            }
            obj = lambdaonInstallReferrerSetupFinished0.onNavigationEvent.onNavigationEvent;
        }
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{w_Var, context, onwarmupcompleted, obj}, iOnNavigationEvent3, -974725819, 974725826, iOnNavigationEvent2);
        int i3 = onUnminimized + 9;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final class onExtraCallbackWithResult implements TossSecuritiesWebView.onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ w_ IAuthTabCallback;
        final /* synthetic */ TossSecuritiesWebView onNavigationEvent;

        onExtraCallbackWithResult(TossSecuritiesWebView tossSecuritiesWebView, w_ w_Var) {
            this.onNavigationEvent = tossSecuritiesWebView;
            this.IAuthTabCallback = w_Var;
        }

        @Override // im.toss.tosssecurities.webview.TossSecuritiesWebView.onExtraCallback
        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.onPause();
            w_.asBinder(this.IAuthTabCallback).removeView(this.onNavigationEvent);
            int i4 = onExtraCallback + 5;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // im.toss.tosssecurities.webview.TossSecuritiesWebView.onExtraCallback
        public void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                w_.IAuthTabCallbackDefault(this.IAuthTabCallback).onExtraCallback(this.onNavigationEvent);
                throw null;
            }
            w_.IAuthTabCallbackDefault(this.IAuthTabCallback).onExtraCallback(this.onNavigationEvent);
            int i3 = onWarmupCompleted + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ TossSecuritiesWebView $webView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(TossSecuritiesWebView tossSecuritiesWebView, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$webView = tossSecuritiesWebView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$webView, access13800Var);
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg2 = findresandmsg;
            access13800<? super Unit> access13800Var2 = access13800Var;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            }
            onExtraCallbackWithResult(findresandmsg2, access13800Var2);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 87;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 109;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            this.$webView.prefetch();
            Unit unit = Unit.INSTANCE;
            int i7 = IAuthTabCallback + 79;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }
    }

    public final TossSecuritiesWebView IAuthTabCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 33;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (str == null) {
            int i5 = i2 + 13;
            onUnminimized = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        TossSecuritiesWebView tossSecuritiesWebView = this.onPostMessage.get(new lambdaonInstallReferrerSetupFinished0.onWarmupCompleted(str));
        int i7 = onRelationshipValidationResult + 105;
        onUnminimized = i7 % 128;
        if (i7 % 2 == 0) {
            return tossSecuritiesWebView;
        }
        obj.hashCode();
        throw null;
    }

    public final TossSecuritiesWebView onExtraCallback(@NotNull lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 111;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
            this.onPostMessage.get(lambdaoninstallreferrersetupfinished0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
        TossSecuritiesWebView tossSecuritiesWebView = this.onPostMessage.get(lambdaoninstallreferrersetupfinished0);
        int i3 = onRelationshipValidationResult + 111;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        return tossSecuritiesWebView;
    }

    public final TossSecuritiesWebView onNavigationEvent(@NotNull lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, @NotNull String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 103;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
            Intrinsics.checkNotNullParameter(str, "");
            onNavigationEvent(lambdaoninstallreferrersetupfinished0, onExtraCallbackWithResult(str));
            throw null;
        }
        Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
        Intrinsics.checkNotNullParameter(str, "");
        TossSecuritiesWebView tossSecuritiesWebViewOnNavigationEvent = onNavigationEvent(lambdaoninstallreferrersetupfinished0, onExtraCallbackWithResult(str));
        int i3 = onRelationshipValidationResult + 1;
        onUnminimized = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 62 / 0;
        }
        return tossSecuritiesWebViewOnNavigationEvent;
    }

    public final TossSecuritiesWebView onNavigationEvent(@NotNull lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, @NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 109;
        onUnminimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            this.onPostMessage.get(lambdaoninstallreferrersetupfinished0);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        TossSecuritiesWebView tossSecuritiesWebViewOnExtraCallback = this.onPostMessage.get(lambdaoninstallreferrersetupfinished0);
        if (tossSecuritiesWebViewOnExtraCallback == null) {
            tossSecuritiesWebViewOnExtraCallback = this.onMessageChannelReady.onExtraCallback(onwarmupcompleted, lambdaoninstallreferrersetupfinished0);
            int i3 = onRelationshipValidationResult + 99;
            onUnminimized = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 / 5;
            }
        }
        if (tossSecuritiesWebViewOnExtraCallback == null) {
            TossSecuritiesWebView tossSecuritiesWebViewOnWarmupCompleted = onWarmupCompleted(this.IAuthTabCallbackDefault, onwarmupcompleted, lambdaoninstallreferrersetupfinished0);
            onExtraCallback(lambdaoninstallreferrersetupfinished0, tossSecuritiesWebViewOnWarmupCompleted);
            return tossSecuritiesWebViewOnWarmupCompleted;
        }
        int i5 = onUnminimized + Imgproc.COLOR_YUV2RGBA_YVYU;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(lambdaoninstallreferrersetupfinished0, tossSecuritiesWebViewOnExtraCallback);
        int i7 = onRelationshipValidationResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onUnminimized = i7 % 128;
        if (i7 % 2 == 0) {
            return tossSecuritiesWebViewOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final TossSecuritiesWebView.onWarmupCompleted onExtraCallbackWithResult(String str) {
        String queryParameter;
        int i = 2 % 2;
        Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{str});
        TossSecuritiesWebView.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = null;
        if (uri != null && (queryParameter = uri.getQueryParameter("_type")) != null) {
            int i2 = onUnminimized + 27;
            onRelationshipValidationResult = i2 % 128;
            if (i2 % 2 != 0) {
                onwarmupcompletedOnExtraCallbackWithResult = TossSecuritiesWebView.onWarmupCompleted.Companion.onExtraCallbackWithResult(queryParameter);
            } else {
                TossSecuritiesWebView.onWarmupCompleted.Companion.onExtraCallbackWithResult(queryParameter);
                throw null;
            }
        }
        if (onwarmupcompletedOnExtraCallbackWithResult == null) {
            int i3 = onRelationshipValidationResult + 115;
            onUnminimized = i3 % 128;
            int i4 = i3 % 2;
            return this.access000.IAuthTabCallback(str) ? TossSecuritiesWebView.onWarmupCompleted.MICRO_MTS : TossSecuritiesWebView.onWarmupCompleted.FINTECH;
        }
        int i5 = onUnminimized + 107;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return onwarmupcompletedOnExtraCallbackWithResult;
    }

    private static final Unit IAuthTabCallback(w_ w_Var, TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onUnminimized + 15;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        w_Var.IAuthTabCallback.onNavigationEvent(tossSecuritiesWebView);
        Unit unit = Unit.INSTANCE;
        int i4 = onUnminimized + 99;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void onExtraCallback(lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, final TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        this.onPostMessage.remove(lambdaoninstallreferrersetupfinished0);
        tossSecuritiesWebView.setWebId(lambdaoninstallreferrersetupfinished0);
        tossSecuritiesWebView.setVisitedHistoryListener$TossSecuritiesNativeWebview_release(new Function0() { // from class: im.toss.tosssecurities.webview.viewholder.TossSecWebViewHolder$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = w_.onExtraCallback(this.f$0, tossSecuritiesWebView);
                int i5 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onPostMessage.put(lambdaoninstallreferrersetupfinished0, tossSecuritiesWebView);
        int i2 = onUnminimized + 7;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[PHI: r3
      0x0038: PHI (r3v7 ??) = (r3v15 ??), (r3v16 ??) binds: [B:8:0x0034, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o.AFi1rSDK] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.view.View, im.toss.core.webkit.TossBridgeWebView, im.toss.core.webkit.TossCoreWebView, im.toss.tosssecurities.webview.TossSecuritiesWebView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, @Nullable ViewGroup viewGroup) throws Throwable {
        ?? r3;
        int i = 2 % 2;
        int i2 = onUnminimized + 21;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
            TossSecuritiesWebView tossSecuritiesWebView = this.onPostMessage.get(lambdaoninstallreferrersetupfinished0);
            int i3 = 45 / 0;
            r3 = tossSecuritiesWebView;
            if (tossSecuritiesWebView != null) {
                ViewParent parent = r3.getParent();
                if ((lambdaoninstallreferrersetupfinished0 instanceof lambdaonInstallReferrerSetupFinished0.onWarmupCompleted) && !(!((lambdaonInstallReferrerSetupFinished0.onWarmupCompleted) lambdaoninstallreferrersetupfinished0).onWarmupCompleted())) {
                    AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = (AFi1pSDKAFa1ySDK) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2098560719, 2098560727, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                    Object[] objArr = new Object[1];
                    a(new int[]{-1384800625, -1054408878, -1274261168, -1544110334}, (ViewConfiguration.getLongPressTimeout() >> 16) + 7, objArr);
                    aFi1pSDKAFa1ySDK.onExtraCallback(((String) objArr[0]).intern());
                    Intrinsics.checkNotNull(parent);
                    onExtraCallbackWithResult(lambdaoninstallreferrersetupfinished0, parent);
                    return;
                }
                if (parent == null || viewGroup == null || Intrinsics.areEqual(parent, viewGroup) || Intrinsics.areEqual(parent, this.onMinimized)) {
                    AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK2 = (AFi1pSDKAFa1ySDK) onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2098560719, 2098560727, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                    Object[] objArr2 = new Object[1];
                    a(new int[]{-1384800625, -1054408878, -1274261168, -1544110334}, 7 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                    aFi1pSDKAFa1ySDK2.onExtraCallback(((String) objArr2[0]).intern());
                    ?? r1 = 0;
                    r3.setVisitedHistoryListener$TossSecuritiesNativeWebview_release(null);
                    if (r3.ICustomTabsService()) {
                        int i4 = onUnminimized + 67;
                        onRelationshipValidationResult = i4 % 128;
                        int i5 = i4 % 2;
                        this.onPostMessage.remove(lambdaoninstallreferrersetupfinished0);
                        ?? r12 = parent instanceof ViewGroup ? (ViewGroup) parent : 0;
                        if (r12 != 0) {
                            r12.removeView(r3);
                        }
                        r3.destroy();
                        onExtraCallback(ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, this.IAuthTabCallbackDefault, r3.postMessage(), null, 4, null}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 765291558, -765291555, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent());
                        return;
                    }
                    TossSecuritiesWebView.onExtraCallback((TossSecuritiesWebView) r3, (ValueCallback) null, 1, (Object) null);
                    r3.onPause();
                    r3.setOnTouchListener(null);
                    if (parent instanceof ViewGroup) {
                        int i6 = onRelationshipValidationResult + 91;
                        onUnminimized = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 74 / 0;
                            r1 = (ViewGroup) parent;
                        } else {
                            r1 = (ViewGroup) parent;
                        }
                    }
                    if (r1 != 0) {
                        r1.removeView(r3);
                    }
                    this.onPostMessage.remove(lambdaoninstallreferrersetupfinished0);
                    if (!this.onMessageChannelReady.onExtraCallback(r3)) {
                        r3.destroy();
                        return;
                    }
                    return;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
            TossSecuritiesWebView tossSecuritiesWebView2 = this.onPostMessage.get(lambdaoninstallreferrersetupfinished0);
            r3 = tossSecuritiesWebView2;
            if (tossSecuritiesWebView2 != null) {
            }
        }
        int i8 = onUnminimized + 73;
        onRelationshipValidationResult = i8 % 128;
        int i9 = i8 % 2;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = onUnminimized + 35;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        findRes.onExtraCallbackWithResult(this.asBinder, null, 1, null);
        IAuthTabCallbackDefault();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View, im.toss.core.webkit.TossCoreWebView, im.toss.tosssecurities.webview.TossSecuritiesWebView] */
    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 35;
        onUnminimized = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            ((AFi1pSDKAFa1ySDK) onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2098560719, 2098560727, iOnNavigationEvent2)).onExtraCallback("clear");
            Collection<TossSecuritiesWebView> collectionValues = this.onPostMessage.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            collectionValues.iterator();
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        ((AFi1pSDKAFa1ySDK) onExtraCallback(iOnNavigationEvent3, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -2098560719, 2098560727, iOnNavigationEvent4)).onExtraCallback("clear");
        Collection<TossSecuritiesWebView> collectionValues2 = this.onPostMessage.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues2, "");
        Iterator<T> it = collectionValues2.iterator();
        int i3 = onUnminimized + 87;
        onRelationshipValidationResult = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (!it.hasNext()) {
                this.onPostMessage.clear();
                this.onMessageChannelReady.onWarmupCompleted();
                int i5 = onUnminimized + 49;
                onRelationshipValidationResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            ?? r2 = (TossSecuritiesWebView) it.next();
            r2.setVisitedHistoryListener$TossSecuritiesNativeWebview_release(null);
            ViewParent parent = r2.getParent();
            ViewGroup viewGroup = !((parent instanceof ViewGroup) ^ true) ? (ViewGroup) parent : 0;
            if (viewGroup != 0) {
                int i6 = onRelationshipValidationResult + 45;
                onUnminimized = i6 % 128;
                if (i6 % 2 != 0) {
                    viewGroup.removeView(r2);
                    obj.hashCode();
                    throw null;
                }
                viewGroup.removeView(r2);
            }
            r2.destroy();
            i3 = onRelationshipValidationResult + 71;
            onUnminimized = i3 % 128;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ boolean $excludeVisibleWebView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(boolean z, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$excludeVisibleWebView = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = w_.this.new onExtraCallback(this.$excludeVisibleWebView, access13800Var);
            int i2 = onExtraCallbackWithResult + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i4 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 9 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[PHI: r4
          0x007d: PHI (r4v10 im.toss.core.webkit.TossCoreWebView) = (r4v8 im.toss.core.webkit.TossCoreWebView), (r4v12 im.toss.core.webkit.TossCoreWebView) binds: [B:16:0x007b, B:13:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            TossCoreWebView tossCoreWebView;
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Set<TossSecuritiesWebView> setOnNavigationEvent = w_.IAuthTabCallbackDefault(w_.this).onNavigationEvent();
            Collection collectionValues = w_.access000(w_.this).values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            Set setOnExtraCallback = clearSenderUid.onExtraCallback(setOnNavigationEvent, collectionValues);
            boolean z = this.$excludeVisibleWebView;
            ArrayList arrayList = new ArrayList();
            Iterator it = setOnExtraCallback.iterator();
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            while (!(!it.hasNext())) {
                int i4 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                Object next = it.next();
                TossCoreWebView tossCoreWebView2 = (TossSecuritiesWebView) next;
                if (!z || !tossCoreWebView2.isShown()) {
                    arrayList.add(next);
                }
            }
            w_ w_Var = w_.this;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int i6 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    tossCoreWebView = (TossSecuritiesWebView) it2.next();
                    int i7 = 83 / 0;
                    if (!tossCoreWebView.isAttachedToWindow()) {
                        if (tossCoreWebView.getParent() == null) {
                            int i8 = onNavigationEvent + 37;
                            onExtraCallbackWithResult = i8 % 128;
                            if (i8 % 2 != 0) {
                                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                                int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                                w_.onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{w_Var, tossCoreWebView}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -265327874, 265327876, iOnNavigationEvent2);
                                throw null;
                            }
                            int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                            int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                            w_.onExtraCallback(iOnNavigationEvent3, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{w_Var, tossCoreWebView}, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -265327874, 265327876, iOnNavigationEvent4);
                        }
                    }
                    tossCoreWebView.reload();
                } else {
                    tossCoreWebView = (TossSecuritiesWebView) it2.next();
                    if (!tossCoreWebView.isAttachedToWindow()) {
                    }
                    tossCoreWebView.reload();
                }
            }
            Unit unit = Unit.INSTANCE;
            int i9 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            return unit;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        w_ w_Var = (w_) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        access13800<? super Unit> access13800Var = (access13800) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = onUnminimized + 77;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = w_Var.onExtraCallbackWithResult((iIntValue & 1) == 0 ? zBooleanValue : false, access13800Var);
        int i4 = onRelationshipValidationResult + 61;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final Object onExtraCallbackWithResult(boolean z, @NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.onExtraCallback().onExtraCallback(), new onExtraCallback(z, null), access13800Var);
        if (objOnExtraCallback != access14100.onExtraCallback()) {
            return Unit.INSTANCE;
        }
        int i2 = onUnminimized + 21;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = i3 + 73;
        onUnminimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return objOnExtraCallback;
    }

    public static final class onTransact implements TossSecuritiesWebView.onExtraCallback {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ TossSecuritiesWebView onWarmupCompleted;

        onTransact(TossSecuritiesWebView tossSecuritiesWebView) {
            this.onWarmupCompleted = tossSecuritiesWebView;
        }

        @Override // im.toss.tosssecurities.webview.TossSecuritiesWebView.onExtraCallback
        public void IAuthTabCallback() throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            w_ w_Var = w_.this;
            if (i3 == 0) {
                Object[] objArr = {w_Var, this.onWarmupCompleted};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                w_.onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 462013396, -462013396, iOnNavigationEvent2);
                return;
            }
            Object[] objArr2 = {w_Var, this.onWarmupCompleted};
            int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            w_.onExtraCallback(iOnNavigationEvent3, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 462013396, -462013396, iOnNavigationEvent4);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // im.toss.tosssecurities.webview.TossSecuritiesWebView.onExtraCallback
        public void onExtraCallback() throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = {w_.this, this.onWarmupCompleted};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                w_.onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 462013396, -462013396, iOnNavigationEvent2);
                throw null;
            }
            Object[] objArr2 = {w_.this, this.onWarmupCompleted};
            int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            w_.onExtraCallback(iOnNavigationEvent3, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr2, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 462013396, -462013396, iOnNavigationEvent4);
            int i3 = onExtraCallback + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IAuthTabCallback(TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        this.onMinimized.addView(tossSecuritiesWebView);
        tossSecuritiesWebView.setWarmUpCallback$TossSecuritiesNativeWebview_release(new onTransact(tossSecuritiesWebView));
        tossSecuritiesWebView.reload();
        int i2 = onRelationshipValidationResult + 37;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(TossSecuritiesWebView tossSecuritiesWebView) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 27;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        if (Intrinsics.areEqual(tossSecuritiesWebView.getParent(), this.onMinimized)) {
            int i4 = onRelationshipValidationResult + 21;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            tossSecuritiesWebView.onPause();
            this.onMinimized.removeView(tossSecuritiesWebView);
            int i6 = onRelationshipValidationResult + 41;
            onUnminimized = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = onUnminimized + 101;
        onRelationshipValidationResult = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@Nullable String str) {
        TossSecuritiesWebView.onWarmupCompleted onwarmupcompletedPostMessage;
        int i = 2 % 2;
        if (str != null) {
            int i2 = onRelationshipValidationResult + 69;
            onUnminimized = i2 % 128;
            int i3 = i2 % 2;
            TossSecuritiesWebView tossSecuritiesWebViewIAuthTabCallback = IAuthTabCallback(str);
            if (tossSecuritiesWebViewIAuthTabCallback != null && (onwarmupcompletedPostMessage = tossSecuritiesWebViewIAuthTabCallback.postMessage()) != null) {
                int i4 = onRelationshipValidationResult + 45;
                onUnminimized = i4 % 128;
                int i5 = i4 % 2;
                onNavigationEvent(onwarmupcompletedPostMessage);
                if (i5 != 0) {
                    int i6 = 90 / 0;
                }
            }
        }
        int i7 = onRelationshipValidationResult + 73;
        onUnminimized = i7 % 128;
        int i8 = i7 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ TossSecuritiesWebView.onWarmupCompleted $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$type = onwarmupcompleted;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = w_.this.new onNavigationEvent(this.$type, access13800Var);
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 27 / 0;
            }
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i4 = onNavigationEvent + 29;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (w_.IAuthTabCallbackDefault(w_.this).onExtraCallback(this.$type)) {
                w_ w_Var = w_.this;
                Object[] objArr = {w_Var, w_.onWarmupCompleted(w_Var), this.$type, null, 4, null};
                int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
                w_.onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 765291558, -765291555, iOnNavigationEvent2);
                int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final void onNavigationEvent(@NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = onUnminimized + 95;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        try {
            if (this.onMessageChannelReady.onExtraCallback(onwarmupcompleted)) {
                onLoadStarted.onExtraCallback(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.asInterface), putChannelInfo.onExtraCallback(), null, new onNavigationEvent(onwarmupcompleted, null), 2, null);
            }
        } catch (Throwable th) {
            Object[] objArr = {"WebView", access8000.onExtraCallbackWithResult(AFd1wSDK4.onNavigationEvent(th), access8200.IAuthTabCallback(getWrite.IAuthTabCallback("content", "prepareWarmUp failed"))), false, null, 12, null};
            int iOnExtraCallbackWithResult = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult();
            AFd1mSDK.onExtraCallback(RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), -2050114575, 2050114579, RenameFolderBottomSheetKt$RenameFolderBottomSheet$4$1$invokeSuspend$.inlined.filter.1.2.1.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, iOnExtraCallbackWithResult2);
            int i4 = onUnminimized + 29;
            onRelationshipValidationResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            getBorderRadius getborderradiusIAuthTabCallback = w_.IAuthTabCallback();
            Unit unit = Unit.INSTANCE;
            Object objEmit = getborderradiusIAuthTabCallback.emit(unit, access13800Var);
            if (objEmit != access14100.onExtraCallback()) {
                int i2 = onExtraCallback + 105;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }
            int i4 = onNavigationEvent;
            int i5 = i4 + 87;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 6 / 0;
            }
            int i7 = i4 + 113;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 90 / 0;
            }
            return objEmit;
        }
    }

    static {
        asInterface();
        Companion = new onWarmupCompleted(null);
        onExtraCallbackWithResult = 8;
        onExtraCallback = getShine.onWarmupCompleted(0, 0, null, 7, null);
        int i = ICustomTabsCallbackStubProxy + 83;
        ICustomTabsCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onUnminimized + 57;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.access100.onExtraCallbackWithResult();
        int i4 = onUnminimized + 15;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ AFi1pSDKAFa1ySDK onExtraCallback(w_ w_Var) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (AFi1pSDKAFa1ySDK) onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{w_Var}, iOnNavigationEvent3, 429395115, -429395111, iOnNavigationEvent2);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(w_ w_Var, TossSecuritiesWebView tossSecuritiesWebView) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{w_Var, tossSecuritiesWebView}, iOnNavigationEvent3, 462013396, -462013396, iOnNavigationEvent2);
    }

    public static final /* synthetic */ Function1 IAuthTabCallbackStub(w_ w_Var) {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Function1) onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{w_Var}, iOnNavigationEvent3, 998531608, -998531603, iOnNavigationEvent2);
    }

    public static final /* synthetic */ void onWarmupCompleted(w_ w_Var, TossSecuritiesWebView tossSecuritiesWebView) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{w_Var, tossSecuritiesWebView}, iOnNavigationEvent3, -265327874, 265327876, iOnNavigationEvent2);
    }

    private final AFi1pSDKAFa1ySDK onTransact() {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (AFi1pSDKAFa1ySDK) onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3, -2098560719, 2098560727, iOnNavigationEvent2);
    }

    private final void onExtraCallback(Context context, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this, context, onwarmupcompleted, lambdaoninstallreferrersetupfinished0}, iOnNavigationEvent3, -974725819, 974725826, iOnNavigationEvent2);
    }

    static /* synthetic */ void onWarmupCompleted(w_ w_Var, Context context, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, int i, Object obj) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object[] objArr = {w_Var, context, onwarmupcompleted, lambdaoninstallreferrersetupfinished0, Integer.valueOf(i), obj};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), 765291558, -765291555, iOnNavigationEvent2);
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(w_ w_Var, boolean z, access13800 access13800Var, int i, Object obj) {
        Object[] objArr = {w_Var, Boolean.valueOf(z), access13800Var, Integer.valueOf(i), obj};
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), -1226858022, 1226858028, iOnNavigationEvent2);
    }

    public final getTileModeX<lambdaonInstallReferrerSetupFinished0> onNavigationEvent() {
        int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
        return (getTileModeX) onExtraCallback(iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3, 1157222595, -1157222594, iOnNavigationEvent2);
    }

    static void asInterface() {
        onActivityLayout = new int[]{-1834174826, -1111574826, -837059442, 400632183, 564392203, 1365638764, 579463553, 963704486, -473259929, -92907928, -1173313308, 1737634779, 1192928163, 1830004470, 1820661329, 830111330, -339878318, -1935042330};
    }
}
