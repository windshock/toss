package run.granite;

import android.content.Context;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.defaults.DefaultReactHostDelegate;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.getWrite;
import o.pkcs5PBKDF2;
import o.transGetKmCert;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ReactHostFactory {
    public static final ReactHostFactory IAuthTabCallback = new ReactHostFactory();

    private ReactHostFactory() {
    }

    public static final class Result {
        private final ReactHost onExtraCallbackWithResult;
        private final ComponentFactory onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, result.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, result.onNavigationEvent);
        }

        public int hashCode() {
            int iHashCode = this.onExtraCallbackWithResult.hashCode();
            ComponentFactory componentFactory = this.onNavigationEvent;
            return (iHashCode * 31) + (componentFactory == null ? 0 : componentFactory.hashCode());
        }

        public String toString() {
            return "Result(reactHost=" + this.onExtraCallbackWithResult + ", componentFactory=" + this.onNavigationEvent + ")";
        }

        public Result(@NotNull ReactHost reactHost, @Nullable ComponentFactory componentFactory) {
            Intrinsics.checkNotNullParameter(reactHost, "");
            this.onExtraCallbackWithResult = reactHost;
            this.onNavigationEvent = componentFactory;
        }

        public final ReactHost IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        public final ComponentFactory onExtraCallback() {
            return this.onNavigationEvent;
        }
    }

    public final Result onExtraCallback(@NotNull Context context, @NotNull transGetKmCert transgetkmcert, @NotNull List<? extends ReactPackage> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(transgetkmcert, "");
        Intrinsics.checkNotNullParameter(list, "");
        Objects.toString(transgetkmcert);
        Pair<JSBundleLoader, Boolean> pairOnNavigationEvent = onNavigationEvent(context, transgetkmcert);
        JSBundleLoader jSBundleLoaderOnExtraCallbackWithResult = pairOnNavigationEvent.onExtraCallbackWithResult();
        boolean zBooleanValue = pairOnNavigationEvent.IAuthTabCallback().booleanValue();
        DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate("index", jSBundleLoaderOnExtraCallbackWithResult, list, new HermesInstance(), (BindingsInstaller) null, new Function1() { // from class: run.granite.ReactHostFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostFactory.onExtraCallbackWithResult((Exception) obj);
            }
        }, new DefaultTurboModuleManagerDelegate.onExtraCallbackWithResult());
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        return new Result(new ReactHostImpl(context, defaultReactHostDelegate, componentFactory, zBooleanValue, zBooleanValue), componentFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        return Unit.INSTANCE;
    }

    private final Pair<JSBundleLoader, Boolean> onNavigationEvent(Context context, transGetKmCert transgetkmcert) {
        if (transgetkmcert instanceof transGetKmCert.onNavigationEvent) {
            return getWrite.IAuthTabCallback(JSBundleLoader.Companion.createAssetLoader(context, "assets://index.android.bundle", true), Boolean.TRUE);
        }
        if (!(transgetkmcert instanceof transGetKmCert.onWarmupCompleted)) {
            throw new NoWhenBranchMatchedException();
        }
        transGetKmCert.onWarmupCompleted onwarmupcompleted = (transGetKmCert.onWarmupCompleted) transgetkmcert;
        pkcs5PBKDF2 pkcs5pbkdf2OnExtraCallback = onwarmupcompleted.onExtraCallback();
        if (pkcs5pbkdf2OnExtraCallback instanceof pkcs5PBKDF2.onExtraCallbackWithResult) {
            String strOnExtraCallbackWithResult = ((pkcs5PBKDF2.onExtraCallbackWithResult) onwarmupcompleted.onExtraCallback()).onExtraCallbackWithResult();
            if (StringsKt__StringsJVMKt.startsWith$default(strOnExtraCallbackWithResult, "assets://", false, 2, null)) {
                return getWrite.IAuthTabCallback(JSBundleLoader.Companion.createAssetLoader(context, strOnExtraCallbackWithResult, false), Boolean.FALSE);
            }
            return getWrite.IAuthTabCallback(JSBundleLoader.Companion.createFileLoader(strOnExtraCallbackWithResult), Boolean.FALSE);
        }
        if (!(pkcs5pbkdf2OnExtraCallback instanceof pkcs5PBKDF2.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        return getWrite.IAuthTabCallback(JSBundleLoader.Companion.createAssetLoader(context, "assets://index.android.bundle", true), Boolean.FALSE);
    }
}
