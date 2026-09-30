package o;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import run.granite.navermap.GraniteNaverMapViewManager;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getExpiredType implements ReactPackage {
    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt__CollectionsJVMKt.listOf(new GraniteNaverMapViewManager());
    }
}
