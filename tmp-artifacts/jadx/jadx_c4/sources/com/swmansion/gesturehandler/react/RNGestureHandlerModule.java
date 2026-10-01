package com.swmansion.gesturehandler.react;

import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.isTmpDetached;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = "RNGestureHandlerModule")
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerModule extends NativeRNGestureHandlerModuleSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RNGestureHandlerModule";
    private final RNGestureHandlerEventDispatcher eventDispatcher;
    private final RNGestureHandlerInteractionManager interactionManager;
    private final RNGestureHandlerRegistry registry;
    private final List<RNGestureHandlerRootHelper> roots;

    private final native void decorateRuntime(long j);

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void flushOperations() {
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleClearJSResponder() {
    }

    public RNGestureHandlerModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.registry = new RNGestureHandlerRegistry();
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "");
        this.eventDispatcher = new RNGestureHandlerEventDispatcher(reactApplicationContext2);
        this.interactionManager = new RNGestureHandlerInteractionManager();
        this.roots = new ArrayList();
    }

    public final RNGestureHandlerRegistry getRegistry() {
        return this.registry;
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    public String getName() {
        return "RNGestureHandlerModule";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationIllegalArgumentException */
    private final <T extends addChangePayload> void createGestureHandlerHelper(String str, int i, ReadableMap readableMap) throws JSApplicationIllegalArgumentException {
        if (this.registry.onNavigationEvent(i) != null) {
            throw new IllegalStateException("Handler with tag " + i + " already exists. Please ensure that no Gesture instance is used across multiple GestureDetectors.");
        }
        addChangePayload.IAuthTabCallback<addChangePayload> iAuthTabCallbackOnExtraCallback = RNGestureHandlerFactoryUtil.onExtraCallback.onExtraCallback(str);
        if (iAuthTabCallbackOnExtraCallback == null) {
            throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
        }
        addChangePayload addchangepayloadOnExtraCallback = iAuthTabCallbackOnExtraCallback.onExtraCallback(getReactApplicationContext(), i);
        addchangepayloadOnExtraCallback.onWarmupCompleted(this.eventDispatcher);
        this.registry.onWarmupCompleted(addchangepayloadOnExtraCallback);
        this.interactionManager.onNavigationEvent(addchangepayloadOnExtraCallback, readableMap);
        iAuthTabCallbackOnExtraCallback.onNavigationEvent(addchangepayloadOnExtraCallback, readableMap);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void createGestureHandler(@NotNull String str, double d, @NotNull ReadableMap readableMap) throws JSApplicationIllegalArgumentException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(readableMap, "");
        createGestureHandlerHelper(str, (int) d, readableMap);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationIllegalArgumentException */
    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void attachGestureHandler(double d, double d2, double d3) throws JSApplicationIllegalArgumentException {
        int i = (int) d;
        if (this.registry.onExtraCallbackWithResult(i, (int) d2, (int) d3)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i + " does not exists");
    }

    private final <T extends addChangePayload> void updateGestureHandlerHelper(int i, ReadableMap readableMap) {
        addChangePayload.IAuthTabCallback<addChangePayload> iAuthTabCallbackOnExtraCallback;
        addChangePayload addchangepayloadOnNavigationEvent = this.registry.onNavigationEvent(i);
        if (addchangepayloadOnNavigationEvent == null || (iAuthTabCallbackOnExtraCallback = RNGestureHandlerFactoryUtil.onExtraCallback.onExtraCallback(addchangepayloadOnNavigationEvent)) == null) {
            return;
        }
        this.interactionManager.IAuthTabCallback(i);
        this.interactionManager.onNavigationEvent(addchangepayloadOnNavigationEvent, readableMap);
        iAuthTabCallbackOnExtraCallback.onNavigationEvent(addchangepayloadOnNavigationEvent, readableMap);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void updateGestureHandler(double d, @NotNull ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(readableMap, "");
        updateGestureHandlerHelper((int) d, readableMap);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void dropGestureHandler(double d) {
        int i = (int) d;
        this.interactionManager.IAuthTabCallback(i);
        this.registry.onWarmupCompleted(i);
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod
    public void handleSetJSResponder(double d, boolean z) {
        int i = (int) d;
        RNGestureHandlerRootHelper rNGestureHandlerRootHelperFindRootHelperForViewAncestor = findRootHelperForViewAncestor(i);
        if (rNGestureHandlerRootHelperFindRootHelperForViewAncestor != null) {
            rNGestureHandlerRootHelperFindRootHelperForViewAncestor.onNavigationEvent(i, z);
        }
    }

    public void setGestureHandlerState(int i, int i2) {
        addChangePayload addchangepayloadOnNavigationEvent = this.registry.onNavigationEvent(i);
        if (addchangepayloadOnNavigationEvent != null) {
            if (i2 == 1) {
                addchangepayloadOnNavigationEvent.access000();
                return;
            }
            if (i2 == 2) {
                addchangepayloadOnNavigationEvent.IAuthTabCallbackStub();
                return;
            }
            if (i2 == 3) {
                addchangepayloadOnNavigationEvent.onTransact();
            } else if (i2 == 4) {
                addchangepayloadOnNavigationEvent.onExtraCallback(true);
            } else if (i2 == 5) {
                addchangepayloadOnNavigationEvent.getInterfaceDescriptor();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.NativeRNGestureHandlerModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean install() {
        getReactApplicationContext().runOnJSQueueThread(new RNGestureHandlerModule$.ExternalSyntheticLambda0(this));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$0(RNGestureHandlerModule rNGestureHandlerModule) {
        try {
            SoLoader.IAuthTabCallback("gesturehandler");
            JavaScriptContextHolder javaScriptContextHolder = rNGestureHandlerModule.getReactApplicationContext().getJavaScriptContextHolder();
            Intrinsics.checkNotNull(javaScriptContextHolder);
            rNGestureHandlerModule.decorateRuntime(javaScriptContextHolder.get());
        } catch (Exception unused) {
        }
    }

    public void invalidate() {
        this.registry.onNavigationEvent();
        this.interactionManager.onWarmupCompleted();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                this.roots.size();
                this.roots.get(0).onNavigationEvent();
                this.roots.size();
            }
            Unit unit = Unit.INSTANCE;
        }
        super/*com.facebook.react.bridge.BaseJavaModule*/.invalidate();
    }

    public final void registerRootHelper(@NotNull RNGestureHandlerRootHelper rNGestureHandlerRootHelper) {
        Intrinsics.checkNotNullParameter(rNGestureHandlerRootHelper, "");
        synchronized (this.roots) {
            this.roots.contains(rNGestureHandlerRootHelper);
            this.roots.add(rNGestureHandlerRootHelper);
        }
    }

    public final void unregisterRootHelper(@NotNull RNGestureHandlerRootHelper rNGestureHandlerRootHelper) {
        Intrinsics.checkNotNullParameter(rNGestureHandlerRootHelper, "");
        synchronized (this.roots) {
            this.roots.remove(rNGestureHandlerRootHelper);
        }
    }

    private final RNGestureHandlerRootHelper findRootHelperForViewAncestor(int i) {
        RNGestureHandlerRootHelper rNGestureHandlerRootHelper;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "");
        int iResolveRootTagFromReactTag = isTmpDetached.onExtraCallbackWithResult((ReactContext) reactApplicationContext).resolveRootTagFromReactTag(i);
        Object obj = null;
        if (iResolveRootTagFromReactTag <= 0) {
            return null;
        }
        synchronized (this.roots) {
            Iterator<T> it = this.roots.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                RNGestureHandlerRootHelper rNGestureHandlerRootHelper2 = (RNGestureHandlerRootHelper) next;
                if ((rNGestureHandlerRootHelper2.onWarmupCompleted() instanceof ReactRootView) && rNGestureHandlerRootHelper2.onWarmupCompleted().IAuthTabCallbackDefault() == iResolveRootTagFromReactTag) {
                    obj = next;
                    break;
                }
            }
            rNGestureHandlerRootHelper = (RNGestureHandlerRootHelper) obj;
        }
        return rNGestureHandlerRootHelper;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
