package o;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import run.granite.lottie.GraniteLottieViewManager;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class transV2Finalize implements ReactPackage {
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GraniteLottieViewManager());
        return arrayList;
    }

    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
