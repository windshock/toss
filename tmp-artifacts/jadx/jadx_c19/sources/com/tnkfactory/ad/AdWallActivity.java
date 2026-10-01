package com.tnkfactory.ad;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.tnkfactory.ad.AdWallActivity$;
import com.tnkfactory.ad.basic.TnkAdListToolbar_NoTitle;
import com.tnkfactory.ad.rwd.Settings;
import com.tnkfactory.ad.tnkassert.TnkAssert;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o.CameraControllerExternalSyntheticLambda0;
import o.IAuthTabCallbackStubProxy;
import o.ICustomTabsService;
import o.RenderInTransitionOverlayNodeElement;
import o.RepeatableSpec;
import o.SuspendAnimationKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AdWallActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion(null);
    private static boolean useBottomInset = true;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final boolean getUseBottomInset() {
            return AdWallActivity.useBottomInset;
        }

        public final void setUseBottomInset(boolean z) {
            AdWallActivity.useBottomInset = z;
        }

        public final void start(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            Settings.INSTANCE.setAdwallStartTime(context, System.currentTimeMillis());
            context.startActivity(new Intent(context, (Class<?>) AdWallActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat edgtoedg$lambda$3(View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        if (!windowInsetsCompat.IAuthTabCallback(WindowInsetsCompat.onTransact.asInterface())) {
            windowInsetsCompat.IAuthTabCallback(WindowInsetsCompat.onTransact.IAuthTabCallbackDefault());
        }
        return ViewCompat.onNavigationEvent(view, windowInsetsCompat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat onCreate$lambda$0(View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(WindowInsetsCompat.onTransact.asBinder());
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        return windowInsetsCompat;
    }

    private final void setStatusBarLightText(Window window, boolean z) {
        setStatusBarLightTextOldApi(window, z);
        setStatusBarLightTextNewApi(window, z);
    }

    private final void setStatusBarLightTextNewApi(Window window, boolean z) {
        RepeatableSpec.onExtraCallback(window, window.getDecorView()).onNavigationEvent(!z);
    }

    private final void setStatusBarLightTextOldApi(Window window, boolean z) {
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        decorView.setSystemUiVisibility(z ? decorView.getSystemUiVisibility() & (-8193) : decorView.getSystemUiVisibility() | 8192);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void edgtoedg() {
        SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0OnExtraCallback = RepeatableSpec.onExtraCallback(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(suspendAnimationKtExternalSyntheticLambda0OnExtraCallback, "");
        suspendAnimationKtExternalSyntheticLambda0OnExtraCallback.onWarmupCompleted(2);
        ViewCompat.onWarmupCompleted(getWindow().getDecorView(), new AdWallActivity$.ExternalSyntheticLambda1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDarkMode() {
        int i2 = getResources().getConfiguration().uiMode & 48;
        return (i2 == 0 || i2 == 16 || i2 != 32) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        setContentView(R.layout.com_tnk_adwall_activity);
        IAuthTabCallbackStubProxy.onWarmupCompleted(this, (ICustomTabsService) null, (ICustomTabsService) null, 3, (Object) null);
        View viewFindViewById = findViewById(R.id.com_tnk_off_ll_view_root);
        if (viewFindViewById != null) {
            ViewCompat.onWarmupCompleted(viewFindViewById, new RenderInTransitionOverlayNodeElement() { // from class: com.tnkfactory.ad.AdWallActivity$$ExternalSyntheticLambda0
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return AdWallActivity.onCreate$lambda$0(view, windowInsetsCompat);
                }
            });
        }
        TnkAdConfig tnkAdConfig = TnkAdConfig.INSTANCE;
        if (Intrinsics.areEqual(tnkAdConfig.getLayoutConfig().getAdListToolbar(), Reflection.getOrCreateKotlinClass(TnkAdListToolbar_NoTitle.class))) {
            tnkAdConfig.getLayoutConfig().setListHeader(1);
        }
        TnkOfferwall tnkOfferwall = new TnkOfferwall(this);
        tnkOfferwall.showDialog(true);
        tnkOfferwall.load(new AdWallActivity$onCreate$2$1(this, tnkOfferwall));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        super.onDestroy();
        TnkAssert tnkAssert = TnkAssert.INSTANCE;
        tnkAssert.offerwallTabClick();
        tnkAssert.offerwallViewClose(System.currentTimeMillis() - Settings.INSTANCE.getAdwallStartTime(this));
        TnkAdAnalytics tnkAdAnalytics = TnkAdAnalytics.INSTANCE;
        HashMap<String, String> map = new HashMap<>();
        map.put("item_id", Companion.getClass().getSimpleName());
        map.put("item_name", Companion.class.getSimpleName());
        Unit unit = Unit.INSTANCE;
        tnkAdAnalytics.logEvent("activity_finish", map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeSystemStatusBarColor() {
        Window window = getWindow();
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        new SuspendAnimationKtExternalSyntheticLambda0(window, decorView).onNavigationEvent(false);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.color_black));
        Window window2 = getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "");
        setStatusBarLightText(window2, isDarkMode());
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
