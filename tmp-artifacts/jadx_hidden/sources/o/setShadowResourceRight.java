package o;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.tosscore.androidprofilewebview.AndroidProfileCookieManagerModule;
import com.tosscore.androidprofilewebview.AndroidProfileWebViewManager;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class setShadowResourceRight implements ReactPackage {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(setShadowResourceRight.class);

    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactApplicationContext) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        List<NativeModule> listListOf = CollectionsKt.listOf(new AndroidProfileCookieManagerModule(reactApplicationContext));
        if ((((onWarmupCompleted ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(737)) >> 2) & 1) == 0) {
            return listListOf;
        }
        throw null;
    }

    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        List<ViewManager<?, ?>> listListOf = CollectionsKt.listOf(new AndroidProfileWebViewManager());
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2947);
        return listListOf;
    }
}
