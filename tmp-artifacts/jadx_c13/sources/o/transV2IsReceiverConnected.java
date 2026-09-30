package o;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.teleport.host.PortalHostViewManager;
import com.teleport.portal.PortalViewManager;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.transV2IsReceiverConnected;
import org.jetbrains.annotations.NotNull;
import run.granite.microfrontend.GraniteMicroFrontendRuntimeModule;
import run.granite.microfrontend.NativeGraniteMicroFrontendRuntimeSpec;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class transV2IsReceiverConnected extends BaseReactPackage {
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt__CollectionsKt.listOf((Object[]) new ViewManager[]{new PortalHostViewManager(), new PortalViewManager()});
    }

    public NativeModule getModule(@NotNull String str, @NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        if (Intrinsics.areEqual(str, NativeGraniteMicroFrontendRuntimeSpec.NAME)) {
            return new GraniteMicroFrontendRuntimeModule(reactApplicationContext);
        }
        return null;
    }

    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: run.granite.microfrontend.GraniteMicroFrontendRuntimePackage$$ExternalSyntheticLambda0
            public final Map getReactModuleInfos() {
                return transV2IsReceiverConnected.onExtraCallback();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map onExtraCallback() {
        String name = GraniteMicroFrontendRuntimeModule.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return access8200.IAuthTabCallback(getWrite.IAuthTabCallback(NativeGraniteMicroFrontendRuntimeSpec.NAME, new ReactModuleInfo(NativeGraniteMicroFrontendRuntimeSpec.NAME, name, false, false, false, true)));
    }
}
