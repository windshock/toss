package o;

import android.net.Uri;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import im.toss.rn.toss.core.bridge.module.TossReactBridgeModule;
import im.toss.rn.toss.core.bridge.module.cookie.CookieManagerModule;
import im.toss.rn.toss.core.bridge.module.crypto.TossReactCryptoModule;
import im.toss.rn.toss.core.bridge.module.image.FastImageViewModule;
import im.toss.rn.toss.core.bridge.module.screenshot.ScreenCapturePreventModule;
import im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule;
import im.toss.rn.toss.core.common.webview.TossReactWebViewContentOwner;
import im.toss.rn.toss.core.common.webview.TossReactWebViewManager;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaZ6S5ynORse1Hp60pzEkVw4aqyw4 implements ReactPackage {
    private static int IAuthTabCallbackStub = 0;
    private static int onTransact = 1;
    private final Uri IAuthTabCallback;
    private final Function0<Unit> onExtraCallback;
    private final r8lambdaMJagQRgiktUHA9Hgao4BKiMwco onExtraCallbackWithResult;
    private final calculateMaxTextSize onNavigationEvent;
    private final WeakReference<TossReactWebViewContentOwner> onWarmupCompleted;

    public r8lambdaZ6S5ynORse1Hp60pzEkVw4aqyw4(@NotNull Uri uri, @NotNull WeakReference<TossReactWebViewContentOwner> weakReference, @NotNull r8lambdaMJagQRgiktUHA9Hgao4BKiMwco r8lambdamjagqrgiktuha9hgao4bkimwco, @NotNull calculateMaxTextSize calculatemaxtextsize, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(r8lambdamjagqrgiktuha9hgao4bkimwco, "");
        Intrinsics.checkNotNullParameter(calculatemaxtextsize, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = uri;
        this.onWarmupCompleted = weakReference;
        this.onExtraCallbackWithResult = r8lambdamjagqrgiktuha9hgao4bkimwco;
        this.onNavigationEvent = calculatemaxtextsize;
        this.onExtraCallback = function0;
    }

    public List<ReactContextBaseJavaModule> createNativeModules(@NotNull ReactApplicationContext reactApplicationContext) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        List<ReactContextBaseJavaModule> listMutableListOf = CollectionsKt.mutableListOf(new ReactContextBaseJavaModule[]{new TossReactBridgeModule(new hExternalSyntheticLambda9(reactApplicationContext, this.onWarmupCompleted), this.IAuthTabCallback, this.onWarmupCompleted, this.onNavigationEvent, this.onExtraCallback, reactApplicationContext), new TossReactCryptoModule(reactApplicationContext), new FastImageViewModule(reactApplicationContext), new ScreenCapturePreventModule(reactApplicationContext), new CookieManagerModule(reactApplicationContext), new AsyncStorageModule(reactApplicationContext)});
        int i2 = onTransact + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
        return listMutableListOf;
    }

    public List<TossReactWebViewManager> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        List<TossReactWebViewManager> listListOf = CollectionsKt.listOf(this.onExtraCallbackWithResult.onExtraCallback("TossServiceWebView"));
        int i4 = onTransact + 107;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return listListOf;
    }
}
