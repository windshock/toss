package com.swmansion.gesturehandler;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.IAuthTabCallbackStub;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.access8100;
import o.getWrite;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerPackage extends BaseReactPackage implements IAuthTabCallbackStub {
    private final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: com.swmansion.gesturehandler.RNGestureHandlerPackage$$ExternalSyntheticLambda0
        public final Object invoke() {
            return RNGestureHandlerPackage.asBinder();
        }
    });

    private final Map<String, ModuleSpec> IAuthTabCallbackStub() {
        return (Map) this.IAuthTabCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map asBinder() {
        ModuleSpec.Companion companion = ModuleSpec.Companion;
        return access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback(RNGestureHandlerRootViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: com.swmansion.gesturehandler.RNGestureHandlerPackage$$ExternalSyntheticLambda1
            public final Object get() {
                return RNGestureHandlerPackage.onTransact();
            }
        })), getWrite.IAuthTabCallback(RNGestureHandlerButtonViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: com.swmansion.gesturehandler.RNGestureHandlerPackage$$ExternalSyntheticLambda2
            public final Object get() {
                return RNGestureHandlerPackage.asInterface();
            }
        }))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule onTransact() {
        return new RNGestureHandlerRootViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule asInterface() {
        return new RNGestureHandlerButtonViewManager();
    }

    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt.listOf(new ViewManager[]{new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager()});
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public List<String> getViewManagerNames(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt.toList(IAuthTabCallbackStub().keySet());
    }

    public List<ModuleSpec> getViewManagers(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        return CollectionsKt.toMutableList(IAuthTabCallbackStub().values());
    }

    public ViewManager<?, ?> createViewManager(@NotNull ReactApplicationContext reactApplicationContext, @NotNull String str) {
        Provider provider;
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        ModuleSpec moduleSpec = IAuthTabCallbackStub().get(str);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    public NativeModule getModule(@NotNull String str, @NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        if (Intrinsics.areEqual(str, "RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactApplicationContext);
        }
        return null;
    }

    public ReactModuleInfoProvider getReactModuleInfoProvider() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, "");
            return (ReactModuleInfoProvider) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return new ReactModuleInfoProvider() { // from class: com.swmansion.gesturehandler.RNGestureHandlerPackage$$ExternalSyntheticLambda3
                public final Map getReactModuleInfos() {
                    return RNGestureHandlerPackage.onExtraCallback();
                }
            };
        } catch (IllegalAccessException e) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map onExtraCallback() {
        ReactModule annotation = RNGestureHandlerModule.class.getAnnotation(ReactModule.class);
        Intrinsics.checkNotNull(annotation);
        ReactModule reactModule = annotation;
        String strIAuthTabCallback = reactModule.IAuthTabCallback();
        String name = RNGestureHandlerModule.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("RNGestureHandlerModule", new ReactModuleInfo(strIAuthTabCallback, name, reactModule.onExtraCallbackWithResult(), reactModule.onExtraCallback(), reactModule.onNavigationEvent(), true))});
    }
}
