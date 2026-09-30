package o;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.th3rdwave.safeareacontext.SafeAreaContextModule;
import com.th3rdwave.safeareacontext.SafeAreaProviderManager;
import com.th3rdwave.safeareacontext.SafeAreaViewManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.RecyclerViewAccessibilityDelegateItemDelegate;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RecyclerViewAccessibilityDelegateItemDelegate extends BaseReactPackage {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map IAuthTabCallback(Map map) {
        return map;
    }

    public NativeModule getModule(@NotNull String str, @NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        if (Intrinsics.areEqual(str, "RNCSafeAreaContext")) {
            return new SafeAreaContextModule(reactApplicationContext);
        }
        return null;
    }

    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        final HashMap map = new HashMap();
        Class cls = new Class[]{SafeAreaContextModule.class}[0];
        ReactModule annotation = cls.getAnnotation(ReactModule.class);
        if (annotation != null) {
            String strIAuthTabCallback = annotation.IAuthTabCallback();
            String strIAuthTabCallback2 = annotation.IAuthTabCallback();
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            map.put(strIAuthTabCallback, new ReactModuleInfo(strIAuthTabCallback2, name, true, annotation.onExtraCallback(), annotation.onNavigationEvent(), true));
        }
        return new ReactModuleInfoProvider() { // from class: com.th3rdwave.safeareacontext.SafeAreaContextPackage$$ExternalSyntheticLambda0
            public final Map getReactModuleInfos() {
                return RecyclerViewAccessibilityDelegateItemDelegate.IAuthTabCallback(map);
            }
        };
    }

    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt.listOf(new ViewManager[]{new SafeAreaProviderManager(), new SafeAreaViewManager()});
    }
}
