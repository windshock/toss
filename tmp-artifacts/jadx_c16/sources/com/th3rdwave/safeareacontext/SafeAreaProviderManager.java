package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.RNCSafeAreaProviderManagerDelegate;
import com.facebook.react.viewmanagers.RNCSafeAreaProviderManagerInterface;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.access8100;
import o.destroyCallbacks;
import o.getBacktraceNote;
import o.getWrite;
import o.setupCallbacks;
import org.jetbrains.annotations.NotNull;

@ReactModule(IAuthTabCallback = SafeAreaProviderManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SafeAreaProviderManager extends ViewGroupManager<SafeAreaProvider> implements RNCSafeAreaProviderManagerInterface<SafeAreaProvider> {
    public static final onExtraCallback Companion = new onExtraCallback((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNCSafeAreaProvider";
    private final RNCSafeAreaProviderManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> mDelegate;

    public SafeAreaProviderManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.mDelegate = new RNCSafeAreaProviderManagerDelegate<>(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getDelegate, reason: merged with bridge method [inline-methods] */
    public RNCSafeAreaProviderManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> m25getDelegate() {
        return this.mDelegate;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public SafeAreaProvider createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new SafeAreaProvider(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("topInsetsChange", access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("registrationName", "onInsetsChange")}))});
    }

    static final /* synthetic */ class IAuthTabCallback extends FunctionReferenceImpl implements getBacktraceNote<SafeAreaProvider, destroyCallbacks, Rect, Unit> {
        public static final IAuthTabCallback onExtraCallbackWithResult = new IAuthTabCallback();

        IAuthTabCallback() {
            super(3, setupCallbacks.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);
        }

        public final void IAuthTabCallback(SafeAreaProvider safeAreaProvider, destroyCallbacks destroycallbacks, Rect rect) {
            Intrinsics.checkNotNullParameter(safeAreaProvider, "");
            Intrinsics.checkNotNullParameter(destroycallbacks, "");
            Intrinsics.checkNotNullParameter(rect, "");
            setupCallbacks.IAuthTabCallback(safeAreaProvider, destroycallbacks, rect);
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            IAuthTabCallback((SafeAreaProvider) obj, (destroyCallbacks) obj2, (Rect) obj3);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addEventEmitters(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2, @NotNull SafeAreaProvider safeAreaProvider) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        Intrinsics.checkNotNullParameter(safeAreaProvider, "");
        super/*com.facebook.react.uimanager.BaseViewManager*/.addEventEmitters(credentialProviderGetSignInIntentControllerhandleResponse2, safeAreaProvider);
        safeAreaProvider.setOnInsetsChangeHandler(IAuthTabCallback.onExtraCallbackWithResult);
    }
}
