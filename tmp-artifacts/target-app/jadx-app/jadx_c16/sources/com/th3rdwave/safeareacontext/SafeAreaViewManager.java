package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderControllermaybeReportErrorFromResultReceiver1;
import o.CredentialProviderGetSignInIntentControllerhandleResponse2;
import o.attachToRecyclerView;
import o.calculateDistanceToFinalSnap;
import o.calculateScrollDistance;
import o.findTargetSnapPosition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(IAuthTabCallback = SafeAreaViewManager.REACT_CLASS)
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class SafeAreaViewManager extends ReactViewManager {
    public static final onNavigationEvent Companion = new onNavigationEvent((DefaultConstructorMarker) null);
    public static final String REACT_CLASS = "RNCSafeAreaView";

    public String getName() {
        return REACT_CLASS;
    }

    /* renamed from: createViewInstance, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SafeAreaView m28createViewInstance(@NotNull CredentialProviderGetSignInIntentControllerhandleResponse2 credentialProviderGetSignInIntentControllerhandleResponse2) {
        Intrinsics.checkNotNullParameter(credentialProviderGetSignInIntentControllerhandleResponse2, "");
        return new SafeAreaView(credentialProviderGetSignInIntentControllerhandleResponse2);
    }

    /* renamed from: createShadowNodeInstance, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public findTargetSnapPosition m26createShadowNodeInstance() {
        return new findTargetSnapPosition();
    }

    public Class<findTargetSnapPosition> getShadowNodeClass() {
        return findTargetSnapPosition.class;
    }

    @ReactProp(IAuthTabCallbackStub = "mode")
    public final void setMode(@NotNull SafeAreaView safeAreaView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(safeAreaView, "");
        if (Intrinsics.areEqual(str, "padding")) {
            safeAreaView.setMode(calculateDistanceToFinalSnap.PADDING);
        } else if (Intrinsics.areEqual(str, "margin")) {
            safeAreaView.setMode(calculateDistanceToFinalSnap.MARGIN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @ReactProp(IAuthTabCallbackStub = "edges")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setEdges(@NotNull SafeAreaView safeAreaView, @Nullable ReadableMap readableMap) {
        attachToRecyclerView attachtorecyclerviewValueOf;
        attachToRecyclerView attachtorecyclerviewValueOf2;
        attachToRecyclerView attachtorecyclerviewValueOf3;
        attachToRecyclerView attachtorecyclerviewValueOf4;
        Intrinsics.checkNotNullParameter(safeAreaView, "");
        if (readableMap != null) {
            String string = readableMap.getString("top");
            if (string != null) {
                String upperCase = string.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                attachtorecyclerviewValueOf = attachToRecyclerView.valueOf(upperCase);
                if (attachtorecyclerviewValueOf == null) {
                    attachtorecyclerviewValueOf = attachToRecyclerView.OFF;
                }
            }
            String string2 = readableMap.getString("right");
            if (string2 != null) {
                String upperCase2 = string2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                attachtorecyclerviewValueOf2 = attachToRecyclerView.valueOf(upperCase2);
                if (attachtorecyclerviewValueOf2 == null) {
                    attachtorecyclerviewValueOf2 = attachToRecyclerView.OFF;
                }
            }
            String string3 = readableMap.getString("bottom");
            if (string3 != null) {
                String upperCase3 = string3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                attachtorecyclerviewValueOf3 = attachToRecyclerView.valueOf(upperCase3);
                if (attachtorecyclerviewValueOf3 == null) {
                    attachtorecyclerviewValueOf3 = attachToRecyclerView.OFF;
                }
            }
            String string4 = readableMap.getString("left");
            if (string4 != null) {
                String upperCase4 = string4.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                attachtorecyclerviewValueOf4 = attachToRecyclerView.valueOf(upperCase4);
                if (attachtorecyclerviewValueOf4 == null) {
                    attachtorecyclerviewValueOf4 = attachToRecyclerView.OFF;
                }
            }
            safeAreaView.setEdges(new calculateScrollDistance(attachtorecyclerviewValueOf, attachtorecyclerviewValueOf2, attachtorecyclerviewValueOf3, attachtorecyclerviewValueOf4));
        }
    }

    public Object updateState(@NotNull ReactViewGroup reactViewGroup, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable CredentialProviderControllermaybeReportErrorFromResultReceiver1 credentialProviderControllermaybeReportErrorFromResultReceiver1) {
        Intrinsics.checkNotNullParameter(reactViewGroup, "");
        ((SafeAreaView) reactViewGroup).setStateWrapper(credentialProviderControllermaybeReportErrorFromResultReceiver1);
        return null;
    }
}
