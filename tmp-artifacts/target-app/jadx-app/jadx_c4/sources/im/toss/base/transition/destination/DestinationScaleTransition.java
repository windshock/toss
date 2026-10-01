package im.toss.base.transition.destination;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Address;
import o.AppLovinSdkSettings;
import o.CameraControllerExternalSyntheticLambda0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.RenderInTransitionOverlayNodeElement;
import o.RepeatableSpec;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.access8100;
import o.attachAppLovinSdk;
import o.getExtraParameters;
import o.getWrite;
import o.handleRemoveKey;
import o.isFireOS;
import o.isMuted;
import o.onStopped;
import o.pxToDp;
import o.runOnUiThreadDelayed;
import o.setForeground;
import o.startWork;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DestinationScaleTransition implements DefaultLifecycleObserver {
    private static int IAuthTabCallback = 0;
    private static int onTransact = 1;
    private final String onExtraCallback;
    private View onExtraCallbackWithResult;
    private runOnUiThreadDelayed onNavigationEvent;
    private final ComponentActivity onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(attachapplovinsdk);
        int i4 = onTransact + 3;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(DestinationScaleTransition destinationScaleTransition) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(destinationScaleTransition);
        int i4 = onTransact + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i4 | i2);
        int i11 = i9 | i10 | (~(i4 | i5));
        int i12 = i8 | i4;
        int i13 = (~((~i5) | i4)) | i10;
        int i14 = i4 + i2 + i6 + (111814883 * i) + (1975835455 * i3);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i4) - 1583611904) + (47848387 * i2) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i6) + ((-648806400) * i) + (1432616960 * i3) + (442957824 * i15);
        int i17 = ((i4 * 961080817) - 60187382) + (i2 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i6 * 961079685) + (i * 1618335983) + (i3 * 193609403) + (i15 * 1988296704);
        return i16 + ((i17 * i17) * 176226304) != 1 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DestinationScaleTransition destinationScaleTransition) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(destinationScaleTransition);
        int i4 = onTransact + 3;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ WindowInsetsCompat onWarmupCompleted(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatIAuthTabCallback = IAuthTabCallback(view, windowInsetsCompat);
        int i4 = IAuthTabCallback + 73;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return windowInsetsCompatIAuthTabCallback;
        }
        throw null;
    }

    public DestinationScaleTransition(@NotNull ComponentActivity componentActivity, @Nullable String str) throws Throwable {
        View childAt;
        String str2;
        Intrinsics.checkNotNullParameter(componentActivity, "");
        this.onWarmupCompleted = componentActivity;
        this.onExtraCallback = str;
        setForeground setforeground = setForeground.onExtraCallback;
        if (!setforeground.asBinder()) {
            setforeground.onExtraCallback("destination_init_skipped", "not_available", onNavigationEvent(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", componentActivity.getClass().getSimpleName()), getWrite.IAuthTabCallback("session_id", str)}));
            return;
        }
        setForeground.onExtraCallback(setforeground, "destination_init_requested", null, onNavigationEvent(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", componentActivity.getClass().getSimpleName()), getWrite.IAuthTabCallback("session_id", str)}), 2, null);
        componentActivity.getLifecycle().IAuthTabCallback(this);
        FrameLayout frameLayout = (FrameLayout) componentActivity.findViewById(R.id.content);
        Object obj = null;
        if (frameLayout != null) {
            int i = IAuthTabCallback + 117;
            onTransact = i % 128;
            int i2 = i % 2;
            childAt = frameLayout.getChildAt(0);
        } else {
            int i3 = IAuthTabCallback + 17;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            childAt = null;
        }
        if (childAt == null) {
            if (frameLayout == null) {
                int i5 = 2 % 2;
                str2 = "content_container_missing";
            } else {
                int i6 = 2 % 2;
                str2 = "root_container_missing";
            }
            setforeground.onExtraCallback("destination_init_skipped", str2, onNavigationEvent(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", componentActivity.getClass().getSimpleName()), getWrite.IAuthTabCallback("session_id", str)}));
            int i7 = 2 % 2;
        }
        if (childAt != null) {
            int i8 = IAuthTabCallback + 77;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            this.onExtraCallbackWithResult = childAt;
            onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), -669286645, handleRemoveKey.onExtraCallbackWithResult(), 669286646, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this});
            onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), 849444244, handleRemoveKey.onExtraCallbackWithResult(), -849444244, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), new Object[]{this});
        }
        componentActivity.getOnBackPressedDispatcher().onExtraCallbackWithResult(componentActivity, new OnBackPressedCallback() { // from class: im.toss.base.transition.destination.DestinationScaleTransition.1
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            {
                super(true);
            }

            public void handleOnBackPressed() {
                int i10 = 2 % 2;
                int i11 = onWarmupCompleted + 41;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    onStopped.onWarmupCompleted((Activity) DestinationScaleTransition.IAuthTabCallback(DestinationScaleTransition.this), DestinationScaleTransition.onWarmupCompleted(DestinationScaleTransition.this));
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                onStopped.onWarmupCompleted((Activity) DestinationScaleTransition.IAuthTabCallback(DestinationScaleTransition.this), DestinationScaleTransition.onWarmupCompleted(DestinationScaleTransition.this));
                int i12 = IAuthTabCallback + 1;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
            }
        });
        int i10 = onTransact + 41;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ComponentActivity IAuthTabCallback(DestinationScaleTransition destinationScaleTransition) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        ComponentActivity componentActivity = destinationScaleTransition.onWarmupCompleted;
        int i5 = i3 + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return componentActivity;
    }

    public static final /* synthetic */ String onWarmupCompleted(DestinationScaleTransition destinationScaleTransition) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        String str = destinationScaleTransition.onExtraCallback;
        int i5 = i3 + 3;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public /* bridge */ void onCreate(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onTransact + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
    }

    public /* bridge */ void onPause(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onPause(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onTransact + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onResume(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onResume(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onTransact + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onStart(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super.onStart(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = IAuthTabCallback + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void onStop(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        super.onStop(textFieldScrollKtExternalSyntheticLambda0);
        int i4 = onTransact + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private final startWork onNavigationEvent() {
        int i = 2 % 2;
        String str = this.onExtraCallback;
        if (str == null) {
            return setForeground.onExtraCallback.onExtraCallbackWithResult();
        }
        int i2 = onTransact + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        startWork startworkOnExtraCallback = setForeground.onExtraCallback.onExtraCallback(str);
        int i4 = IAuthTabCallback + 73;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return startworkOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        boolean z;
        DestinationScaleTransition destinationScaleTransition = (DestinationScaleTransition) objArr[0];
        int i = 2 % 2;
        startWork startworkOnNavigationEvent = destinationScaleTransition.onNavigationEvent();
        if (startworkOnNavigationEvent == null) {
            int i2 = IAuthTabCallback + 43;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            setForeground.onExtraCallback(setForeground.onExtraCallback, "destination_setup_views_skipped", "entry_missing", null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", destinationScaleTransition.onWarmupCompleted.getClass().getSimpleName()), getWrite.IAuthTabCallback("session_id", destinationScaleTransition.onExtraCallback)}), 4, null);
            return null;
        }
        int iICustomTabsCallbackStub = startworkOnNavigationEvent.ICustomTabsCallbackStub();
        int typedObject = startworkOnNavigationEvent.readTypedObject();
        if (iICustomTabsCallbackStub == -1 || typedObject == -1) {
            int i4 = IAuthTabCallback + 7;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            setForeground.onExtraCallback.onExtraCallback("destination_setup_views_skipped", "invalid_icon_size", startworkOnNavigationEvent, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", destinationScaleTransition.onWarmupCompleted.getClass().getSimpleName())));
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            int i6 = IAuthTabCallback + 21;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                destinationScaleTransition.onWarmupCompleted.getWindow().getDecorView().getFitsSystemWindows();
                throw null;
            }
            if (destinationScaleTransition.onWarmupCompleted.getWindow().getDecorView().getFitsSystemWindows()) {
                int i7 = IAuthTabCallback + 93;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                z = false;
            } else {
                z = true;
            }
        } else if ((destinationScaleTransition.onWarmupCompleted.getWindow().getDecorView().getSystemUiVisibility() & 1024) != 0) {
        }
        if (!z) {
            RepeatableSpec.onExtraCallbackWithResult(destinationScaleTransition.onWarmupCompleted.getWindow(), false);
            View view = destinationScaleTransition.onExtraCallbackWithResult;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                view = null;
            }
            ViewCompat.onWarmupCompleted(view, new RenderInTransitionOverlayNodeElement() { // from class: im.toss.base.transition.destination.DestinationScaleTransition$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    int i9 = 2 % 2;
                    int i10 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    WindowInsetsCompat windowInsetsCompatOnWarmupCompleted = DestinationScaleTransition.onWarmupCompleted(view2, windowInsetsCompat);
                    int i12 = onExtraCallbackWithResult + 15;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        return windowInsetsCompatOnWarmupCompleted;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
        }
        View view2 = destinationScaleTransition.onExtraCallbackWithResult;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view2 = null;
        }
        view2.setAlpha(0.0f);
        setForeground.onExtraCallback(setForeground.onExtraCallback, "destination_setup_views_success", null, startworkOnNavigationEvent, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("activity", destinationScaleTransition.onWarmupCompleted.getClass().getSimpleName()), getWrite.IAuthTabCallback("already_edge_to_edge", Boolean.valueOf(z))}), 2, null);
        int i9 = IAuthTabCallback + 109;
        onTransact = i9 % 128;
        if (i9 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final WindowInsetsCompat IAuthTabCallback(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        int iAsBinder = WindowInsetsCompat.onTransact.asBinder();
        CameraControllerExternalSyntheticLambda0 cameraControllerExternalSyntheticLambda0OnWarmupCompleted = windowInsetsCompat.onWarmupCompleted(iAsBinder);
        Intrinsics.checkNotNullExpressionValue(cameraControllerExternalSyntheticLambda0OnWarmupCompleted, "");
        view.setPadding(cameraControllerExternalSyntheticLambda0OnWarmupCompleted.IAuthTabCallback, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult, cameraControllerExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback);
        WindowInsetsCompat windowInsetsCompatOnExtraCallbackWithResult = new WindowInsetsCompat.onWarmupCompleted(windowInsetsCompat).onNavigationEvent(iAsBinder, CameraControllerExternalSyntheticLambda0.onNavigationEvent).onExtraCallbackWithResult();
        int i2 = IAuthTabCallback + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return windowInsetsCompatOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted;
        runOnUiThreadDelayed runonuithreaddelayedOnExtraCallback;
        final DestinationScaleTransition destinationScaleTransition = (DestinationScaleTransition) objArr[0];
        int i = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = destinationScaleTransition.onNavigationEvent;
        if (runonuithreaddelayed != null) {
            int i2 = IAuthTabCallback + 79;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (runonuithreaddelayed.postMessage()) {
                setForeground.onExtraCallback.onExtraCallback("destination_open_skipped", "start_timeline_running", destinationScaleTransition.onNavigationEvent(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", destinationScaleTransition.onWarmupCompleted.getClass().getSimpleName())));
                return null;
            }
        }
        pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
        View view = destinationScaleTransition.onExtraCallbackWithResult;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            view = null;
        }
        Interpolator interpolatorAsBinder = Address.onNavigationEvent.asBinder();
        AppLovinSdkSettings appLovinSdkSettingsOnExtraCallback = isMuted.onExtraCallback(new AppLovinSdkSettings(), Float.valueOf(0.0f), Float.valueOf(1.0f), new Function1() { // from class: im.toss.base.transition.destination.DestinationScaleTransition$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i5 % 128;
                attachAppLovinSdk attachapplovinsdk = (attachAppLovinSdk) obj;
                if (i5 % 2 != 0) {
                    DestinationScaleTransition.IAuthTabCallback(attachapplovinsdk);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = DestinationScaleTransition.IAuthTabCallback(attachapplovinsdk);
                int i6 = onExtraCallbackWithResult + 13;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                return unitIAuthTabCallback;
            }
        });
        Boolean bool = Boolean.FALSE;
        runOnUiThreadDelayed runonuithreaddelayedOnWarmupCompleted2 = RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt.listOf((Rally) RallysKt.onWarmupCompleted(new Object[]{view, appLovinSdkSettingsOnExtraCallback, 0, null, 0, interpolatorAsBinder, null, bool, 0, 0L, false, 1884, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, bool, 0, 0L, false, 3833, (Object) null);
        destinationScaleTransition.onNavigationEvent = runonuithreaddelayedOnWarmupCompleted2;
        if (runonuithreaddelayedOnWarmupCompleted2 != null && (runonuithreaddelayedOnWarmupCompleted = runOnUiThreadDelayed.onWarmupCompleted(runonuithreaddelayedOnWarmupCompleted2, (Object) null, new Function0() { // from class: im.toss.base.transition.destination.DestinationScaleTransition$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() throws Throwable {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 73;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnExtraCallback = DestinationScaleTransition.onExtraCallback(this.f$0);
                int i7 = IAuthTabCallback + 59;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 15 / 0;
                }
                return unitOnExtraCallback;
            }
        }, 1, (Object) null)) != null && (runonuithreaddelayedOnExtraCallback = runOnUiThreadDelayed.onExtraCallback(runonuithreaddelayedOnWarmupCompleted, (Object) null, new Function0() { // from class: im.toss.base.transition.destination.DestinationScaleTransition$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() throws Throwable {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 113;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Unit unitOnExtraCallbackWithResult = DestinationScaleTransition.onExtraCallbackWithResult(this.f$0);
                int i7 = onWarmupCompleted + 95;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 13 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        }, 1, (Object) null)) != null) {
            isFireOS.onExtraCallbackWithResult(runonuithreaddelayedOnExtraCallback, false, 1, (Object) null);
            int i4 = onTransact + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        setForeground.onExtraCallback(setForeground.onExtraCallback, "destination_open_timeline_play_requested", null, destinationScaleTransition.onNavigationEvent(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", destinationScaleTransition.onWarmupCompleted.getClass().getSimpleName())), 2, null);
        return null;
    }

    private static final Unit onExtraCallback(attachAppLovinSdk attachapplovinsdk) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(attachapplovinsdk, "");
        attachapplovinsdk.IAuthTabCallback(300);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 15;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(DestinationScaleTransition destinationScaleTransition) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 21;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            setForeground.onExtraCallback(setForeground.onExtraCallback, "destination_open_timeline_ended", null, destinationScaleTransition.onNavigationEvent(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", destinationScaleTransition.onWarmupCompleted.getClass().getSimpleName())), 5, null);
        } else {
            setForeground.onExtraCallback(setForeground.onExtraCallback, "destination_open_timeline_ended", null, destinationScaleTransition.onNavigationEvent(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", destinationScaleTransition.onWarmupCompleted.getClass().getSimpleName())), 2, null);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStub(DestinationScaleTransition destinationScaleTransition) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setForeground.onExtraCallback(setForeground.onExtraCallback, "destination_open_timeline_cancelled", null, destinationScaleTransition.onNavigationEvent(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", destinationScaleTransition.onWarmupCompleted.getClass().getSimpleName())), 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDestroy(@NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) throws Throwable {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        setForeground setforeground = setForeground.onExtraCallback;
        if (!setforeground.asBinder()) {
            setforeground.onExtraCallback("destination_destroy_skipped", "not_available", onNavigationEvent(), access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", this.onWarmupCompleted.getClass().getSimpleName())));
            return;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.onNavigationEvent;
        if (runonuithreaddelayed != null) {
            int i2 = onTransact + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            runonuithreaddelayed.onNavigationEvent();
        }
        this.onNavigationEvent = null;
        startWork startworkOnNavigationEvent = onNavigationEvent();
        if (startworkOnNavigationEvent != null) {
            int i4 = onTransact + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            if (!((Boolean) startWork.onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{startworkOnNavigationEvent}, iOnExtraCallback2, 796467999)).booleanValue()) {
                int i6 = onTransact + 57;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    setForeground.onExtraCallback(setforeground, "destination_destroy_clear_entry", null, startworkOnNavigationEvent, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", this.onWarmupCompleted.getClass().getSimpleName())), 3, null);
                    int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
                    setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, iOnNavigationEvent, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startworkOnNavigationEvent, true, false, 5, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                } else {
                    setForeground.onExtraCallback(setforeground, "destination_destroy_clear_entry", null, startworkOnNavigationEvent, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", this.onWarmupCompleted.getClass().getSimpleName())), 2, null);
                    int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
                    setForeground.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -283765271, iOnNavigationEvent2, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 283765271, new Object[]{setforeground, startworkOnNavigationEvent, false, false, 4, null}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent());
                }
            } else {
                if (startworkOnNavigationEvent == null) {
                    int i7 = IAuthTabCallback + 121;
                    onTransact = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 78 / 0;
                    }
                    str = "entry_missing";
                } else {
                    str = "pending_end";
                }
                setforeground.onExtraCallback("destination_destroy_keep_entry", str, startworkOnNavigationEvent, access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", this.onWarmupCompleted.getClass().getSimpleName())));
            }
        }
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().onExtraCallbackWithResult(this);
    }

    private final void IAuthTabCallback() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), -669286645, handleRemoveKey.onExtraCallbackWithResult(), 669286646, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this});
    }

    private final void onExtraCallback() {
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
        onExtraCallbackWithResult(handleRemoveKey.onExtraCallbackWithResult(), 849444244, handleRemoveKey.onExtraCallbackWithResult(), -849444244, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2, new Object[]{this});
    }
}
