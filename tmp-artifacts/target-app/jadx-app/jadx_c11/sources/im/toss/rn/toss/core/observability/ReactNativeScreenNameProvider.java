package im.toss.rn.toss.core.observability;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.swmansion.rnscreens.Screen;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AppLovinFullscreenActivitya;
import o.FlowMeasureLazyPolicyExternalSyntheticLambda3;
import o.clearRevision;
import o.isHidingNavigationBar;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactNativeScreenNameProvider implements AppLovinFullscreenActivitya {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    @Inject
    public ReactNativeScreenNameProvider() {
    }

    public String onExtraCallback(@NotNull View view) {
        String strIEngagementSignalsCallbackStubProxy;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Screen screenOnExtraCallbackWithResult = onExtraCallbackWithResult(view);
        if (screenOnExtraCallbackWithResult == null) {
            return IAuthTabCallback(view);
        }
        int i2 = onExtraCallback + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ReactNativeScreenServiceHost reactNativeScreenServiceHostIAuthTabCallback = IAuthTabCallback(view, screenOnExtraCallbackWithResult);
        if (reactNativeScreenServiceHostIAuthTabCallback != null) {
            strIEngagementSignalsCallbackStubProxy = reactNativeScreenServiceHostIAuthTabCallback.IEngagementSignalsCallbackStubProxy();
        } else {
            int i4 = onExtraCallback + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            strIEngagementSignalsCallbackStubProxy = null;
        }
        ReactNativeRouteKey reactNativeRouteKey = ReactNativeRouteKey.onExtraCallbackWithResult;
        String strIAuthTabCallback = reactNativeRouteKey.IAuthTabCallback(strIEngagementSignalsCallbackStubProxy, reactNativeRouteKey.onNavigationEvent(screenOnExtraCallbackWithResult.getScreenId()));
        int i6 = onExtraCallback + 111;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
        return strIAuthTabCallback;
    }

    public String onNavigationEvent(@NotNull Activity activity) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        Object obj2 = null;
        if (!(activity instanceof ReactNativeScreenServiceHost)) {
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        isHidingNavigationBar ishidingnavigationbar = activity instanceof isHidingNavigationBar ? (isHidingNavigationBar) activity : null;
        if (ishidingnavigationbar == null) {
            int i4 = onNavigationEvent + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            Object obj3 = ishidingnavigationbar.getScreenMetaData().get("screenName");
            obj = Result.constructor-impl(!(obj3 instanceof String) ? null : (String) obj3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i6 = onExtraCallback + 1;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
        } else {
            obj2 = obj;
        }
        String str = (String) obj2;
        int i7 = onNavigationEvent + 1;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    private final String IAuthTabCallback(View view) {
        Object obj;
        ReactNativeScreenServiceHost reactNativeScreenServiceHost;
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(FlowMeasureLazyPolicyExternalSyntheticLambda3.IAuthTabCallback(view));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (!(!Result.onExtraCallback(obj))) {
            int i4 = onExtraCallback + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            obj = null;
        }
        if (obj instanceof ReactNativeScreenServiceHost) {
            reactNativeScreenServiceHost = (ReactNativeScreenServiceHost) obj;
        } else {
            int i6 = onExtraCallback + 49;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            reactNativeScreenServiceHost = null;
        }
        if (reactNativeScreenServiceHost == null) {
            return null;
        }
        return ReactNativeRouteKey.onExtraCallbackWithResult.IAuthTabCallback(reactNativeScreenServiceHost.IEngagementSignalsCallbackStubProxy(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Screen onExtraCallbackWithResult(View view) {
        Screen screen;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
            screen = (view instanceof Screen) ^ true ? null : (Screen) view;
        } else if (view instanceof Screen) {
        }
        if (screen != null) {
            return screen;
        }
        ViewGroup viewGroup = !((view instanceof ViewGroup) ^ true) ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            int i5 = onExtraCallback + 19;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                boolean z = viewGroup.getChildAt(i4) instanceof Screen;
                obj.hashCode();
                throw null;
            }
            Screen childAt = viewGroup.getChildAt(i4);
            Screen screen2 = childAt instanceof Screen ? childAt : null;
            if (screen2 != null) {
                return screen2;
            }
        }
        return null;
    }

    private final ReactNativeScreenServiceHost IAuthTabCallback(View view, Screen screen) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(FlowMeasureLazyPolicyExternalSyntheticLambda3.IAuthTabCallback(view));
            int i2 = onNavigationEvent + 83;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != null) {
            Sequence sequenceOnWarmupCompleted = clearRevision.onWarmupCompleted(clearRevision.onExtraCallbackWithResult(fragment.getParentFragment(), ReactNativeRouteHostResolverKt$findReactNativeRouteHost$1.onWarmupCompleted), new Function1<Object, Boolean>() { // from class: im.toss.rn.toss.core.observability.ReactNativeScreenNameProvider$findServiceHost$$inlined$findReactNativeRouteHost$1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent = 1;

                static {
                    int i4 = onExtraCallbackWithResult + 3;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                }

                public /* synthetic */ Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 59;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    Boolean boolOnExtraCallback = onExtraCallback(obj2);
                    int i7 = onNavigationEvent + 55;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        return boolOnExtraCallback;
                    }
                    throw null;
                }

                public final Boolean onExtraCallback(Object obj2) {
                    boolean z;
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent;
                    int i6 = i5 + 85;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (obj2 != null) {
                        z = obj2 instanceof ReactNativeScreenServiceHost;
                    } else {
                        int i7 = i5 + 39;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            });
            Intrinsics.checkNotNull(sequenceOnWarmupCompleted, "");
            Object objAsBinder = clearRevision.asBinder(sequenceOnWarmupCompleted);
            if (objAsBinder == null) {
                Object activity = fragment.getActivity();
                objAsBinder = (ReactNativeScreenServiceHost) (activity instanceof ReactNativeScreenServiceHost ? activity : null);
            }
            return (ReactNativeScreenServiceHost) objAsBinder;
        }
        ComponentCallbacks2 currentActivity = screen.getReactContext().getCurrentActivity();
        if (!(currentActivity instanceof ReactNativeScreenServiceHost)) {
            return null;
        }
        int i4 = onNavigationEvent;
        int i5 = i4 + 55;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        ReactNativeScreenServiceHost reactNativeScreenServiceHost = (ReactNativeScreenServiceHost) currentActivity;
        int i7 = i4 + 53;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return reactNativeScreenServiceHost;
    }
}
