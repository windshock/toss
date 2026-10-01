package o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.onTransact;
import com.facebook.react.uimanager.ViewManager;
import com.toss.servicewebview.TossServiceWebViewManager;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.setPanelSlideListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPanelSlideListener extends onTransact {
    public NativeModule getModule(@NotNull String str, @NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return null;
    }

    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.toss.servicewebview.TossServiceWebViewPackage$$ExternalSyntheticLambda0
            public final Map getReactModuleInfos() {
                return setPanelSlideListener.IAuthTabCallback();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map IAuthTabCallback() {
        return access8100.onNavigationEvent();
    }

    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt.listOf(new TossServiceWebViewManager());
    }
}
