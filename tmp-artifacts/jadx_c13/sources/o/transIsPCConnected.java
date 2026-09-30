package o;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import run.granite.image.GraniteImageManager;
import run.granite.image.GraniteImageModule;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class transIsPCConnected implements ReactPackage {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static boolean onExtraCallbackWithResult;

    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactApplicationContext) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        Companion.onExtraCallback();
        return CollectionsKt__CollectionsJVMKt.listOf(new GraniteImageModule(reactApplicationContext, null, null, 6, null));
    }

    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        Companion.onExtraCallback();
        return CollectionsKt__CollectionsJVMKt.listOf(new GraniteImageManager());
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final void onExtraCallback() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            if (transIsPCConnected.onExtraCallbackWithResult) {
                return;
            }
            Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"run.granite.image.providers.OkHttpImageProvider", "run.granite.image.providers.GlideImageProvider", "run.granite.image.providers.CoilImageProvider"}).iterator();
            while (it.hasNext()) {
                try {
                    Object objNewInstance = Class.forName((String) it.next()).getDeclaredConstructor(null).newInstance(null);
                    Intrinsics.checkNotNull(objNewInstance, "");
                    CertToolkitMgrRevokeReason.onExtraCallback.onExtraCallbackWithResult((getKey7) objNewInstance);
                    transIsPCConnected.onExtraCallbackWithResult = true;
                    break;
                } catch (ClassNotFoundException unused) {
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            boolean unused2 = transIsPCConnected.onExtraCallbackWithResult;
        }
    }
}
