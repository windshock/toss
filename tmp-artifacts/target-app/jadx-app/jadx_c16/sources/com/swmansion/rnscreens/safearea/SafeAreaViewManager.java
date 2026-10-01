package com.swmansion.rnscreens.safearea;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSSafeAreaViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSSafeAreaViewManagerInterface;
import com.swmansion.rnscreens.safearea.paper.SafeAreaViewEdges;
import com.swmansion.rnscreens.safearea.paper.SafeAreaViewShadowNode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = SafeAreaViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SafeAreaViewManager extends ViewGroupManager<SafeAreaView> implements RNSSafeAreaViewManagerInterface<SafeAreaView> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSSafeAreaView";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<SafeAreaView> delegate;

    public SafeAreaViewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSSafeAreaViewManagerDelegate(this);
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SafeAreaView createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new SafeAreaView(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<SafeAreaView> getDelegate() {
        return this.delegate;
    }

    /* renamed from: createShadowNodeInstance, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SafeAreaViewShadowNode m20createShadowNodeInstance() {
        return new SafeAreaViewShadowNode();
    }

    public Class<SafeAreaViewShadowNode> getShadowNodeClass() {
        return SafeAreaViewShadowNode.class;
    }

    @ReactProp(IAuthTabCallbackStub = "edges")
    public void setEdges(@NotNull SafeAreaView safeAreaView, @Nullable ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(safeAreaView, "");
        SafeAreaViewEdges safeAreaViewEdgesFromProp = SafeAreaViewEdges.Companion.fromProp(readableMap);
        if (safeAreaViewEdgesFromProp != null) {
            safeAreaView.setEdges(safeAreaViewEdgesFromProp);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationIllegalArgumentException */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r4.equals(com.iap.ac.android.acs.plugin.downgrade.router.BizSceneNavigateManager.KEY_ALL) != false) goto L21;
     */
    @ReactProp(IAuthTabCallbackStub = "insetType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setInsetType(@NotNull SafeAreaView safeAreaView, @Nullable String str) throws JSApplicationIllegalArgumentException {
        InsetType insetType;
        Intrinsics.checkNotNullParameter(safeAreaView, "");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -887328209) {
                if (iHashCode != 96673) {
                    if (iHashCode == 502623545 && str.equals("interface")) {
                        insetType = InsetType.INTERFACE;
                    }
                }
                throw new JSApplicationIllegalArgumentException("Unknown inset type " + str);
            }
            if (str.equals("system")) {
                insetType = InsetType.SYSTEM;
            }
            throw new JSApplicationIllegalArgumentException("Unknown inset type " + str);
        }
        insetType = InsetType.ALL;
        safeAreaView.setInsetType(insetType);
    }

    public Object updateState(@NotNull SafeAreaView safeAreaView, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        Intrinsics.checkNotNullParameter(safeAreaView, "");
        safeAreaView.setStateWrapper(credentialProviderControllermaybeReportErrorFromResultReceiver1);
        return super/*com.facebook.react.uimanager.ViewManager*/.updateState(safeAreaView, reactStylesDiffMap, credentialProviderControllermaybeReportErrorFromResultReceiver1);
    }
}
