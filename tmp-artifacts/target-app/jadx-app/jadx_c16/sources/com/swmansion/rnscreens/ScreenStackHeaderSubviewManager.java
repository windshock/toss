package com.swmansion.rnscreens;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = ScreenStackHeaderSubviewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<ScreenStackHeaderSubview> implements RNSScreenStackHeaderSubviewManagerInterface<ScreenStackHeaderSubview> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";
    private final r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenStackHeaderSubview> delegate;

    @ReactProp(IAuthTabCallbackStub = "hidesSharedBackground")
    public void setHidesSharedBackground(@NotNull ScreenStackHeaderSubview screenStackHeaderSubview, boolean z) {
        Intrinsics.checkNotNullParameter(screenStackHeaderSubview, "");
    }

    public void setSynchronousShadowStateUpdatesEnabled(@Nullable ScreenStackHeaderSubview screenStackHeaderSubview, boolean z) {
    }

    public ScreenStackHeaderSubviewManager() {
        super((ReactApplicationContext) null, 1, (DefaultConstructorMarker) null);
        this.delegate = new RNSScreenStackHeaderSubviewManagerDelegate(this);
    }

    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ScreenStackHeaderSubview createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new ScreenStackHeaderSubview(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.react.bridge.JSApplicationIllegalArgumentException */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @ReactProp(IAuthTabCallbackStub = "type")
    public void setType(@NotNull ScreenStackHeaderSubview screenStackHeaderSubview, @Nullable String str) throws JSApplicationIllegalArgumentException {
        ScreenStackHeaderSubview.Type type;
        Intrinsics.checkNotNullParameter(screenStackHeaderSubview, "");
        if (str != null) {
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        type = ScreenStackHeaderSubview.Type.CENTER;
                        screenStackHeaderSubview.setType(type);
                        return;
                    }
                    break;
                case 3015911:
                    if (str.equals("back")) {
                        type = ScreenStackHeaderSubview.Type.BACK;
                        screenStackHeaderSubview.setType(type);
                        return;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        type = ScreenStackHeaderSubview.Type.LEFT;
                        screenStackHeaderSubview.setType(type);
                        return;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        type = ScreenStackHeaderSubview.Type.RIGHT;
                        screenStackHeaderSubview.setType(type);
                        return;
                    }
                    break;
                case 1778179403:
                    if (str.equals("searchBar")) {
                        type = ScreenStackHeaderSubview.Type.SEARCH_BAR;
                        screenStackHeaderSubview.setType(type);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown type " + str);
    }

    public Object updateState(@NotNull ScreenStackHeaderSubview screenStackHeaderSubview, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        Intrinsics.checkNotNullParameter(screenStackHeaderSubview, "");
        screenStackHeaderSubview.setStateWrapper(credentialProviderControllermaybeReportErrorFromResultReceiver1);
        return super/*com.facebook.react.uimanager.ViewManager*/.updateState(screenStackHeaderSubview, reactStylesDiffMap, credentialProviderControllermaybeReportErrorFromResultReceiver1);
    }

    public r8lambdafAbcsqIuOdZ2NkxqDAx2SRi9DDQ<ScreenStackHeaderSubview> getDelegate() {
        return this.delegate;
    }
}
