package o;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import run.granite.video.GraniteVideoModule;
import run.granite.video.GraniteVideoViewManager;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class encryptForRecoveryKey implements ReactPackage {
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt__CollectionsJVMKt.listOf(new GraniteVideoViewManager((getAppCertList) null, 1, (DefaultConstructorMarker) null));
    }

    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt__CollectionsJVMKt.listOf(new GraniteVideoModule(reactApplicationContext));
    }
}
