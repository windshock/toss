package o;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.tossjni.RequiredBridge;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class shouldDelayChildPressed {
    public static RequiredBridge IAuthTabCallback;
    public static final shouldDelayChildPressed onNavigationEvent = new shouldDelayChildPressed();
    private static PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2 onExtraCallback = PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2.Companion.onExtraCallbackWithResult();

    private shouldDelayChildPressed() {
    }

    public final RequiredBridge onWarmupCompleted() {
        RequiredBridge requiredBridge = IAuthTabCallback;
        if (requiredBridge != null) {
            return requiredBridge;
        }
        Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
        return null;
    }

    public final void onWarmupCompleted(@NotNull RequiredBridge requiredBridge) {
        Intrinsics.checkNotNullParameter(requiredBridge, BuildConfig.FLAVOR);
        IAuthTabCallback = requiredBridge;
    }

    public final void onExtraCallback(@NotNull PausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2 pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2) {
        Intrinsics.checkNotNullParameter(pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2, BuildConfig.FLAVOR);
        onExtraCallback = pausedInDebuggerOverlayDialogManagerExternalSyntheticLambda2;
    }

    @JvmStatic
    public static final String onConnected() {
        return onExtraCallback.onExtraCallbackWithResult();
    }

    @JvmStatic
    public static final int getSize() {
        return onExtraCallback.onWarmupCompleted();
    }

    @JvmStatic
    public static final String onConnectionFailed(@Nullable Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return onExtraCallback.onNavigationEvent(context, str);
    }

    @JvmStatic
    public static final void setDefaultImpl(@Nullable Context context, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        onExtraCallback.IAuthTabCallback(context, str, str2);
    }

    @JvmStatic
    public static final void onTransact(@Nullable Context context, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        onExtraCallback.onWarmupCompleted(context, str, str2);
    }

    @JvmStatic
    public static final String asBinder(@Nullable Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return onExtraCallback.onExtraCallbackWithResult(context, str);
    }

    @JvmStatic
    public static final void invoke() {
        onExtraCallback.IAuthTabCallback();
    }

    @JvmStatic
    public static final String asInterface(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return onExtraCallback.onNavigationEvent(str);
    }

    @JvmStatic
    public static final String write(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        return onExtraCallback.onExtraCallback(str);
    }

    @JvmStatic
    public static final String onDisconnected() {
        return onExtraCallback.onExtraCallback();
    }

    @JvmStatic
    public static final void setInternalConnectionCallback() {
        onExtraCallback.onNavigationEvent();
    }

    @JvmStatic
    public static final void setInternalConnectionCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        onExtraCallback.IAuthTabCallback(str);
    }

    @JvmStatic
    public static final void setSelfDimensionBehaviour(@Nullable String str, @Nullable String str2) {
        onExtraCallback.onNavigationEvent(str, str2);
    }

    @JvmStatic
    public static final void requestLayout(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        onNavigationEvent.onWarmupCompleted().onExtraCallbackWithResult(str, str2);
    }

    @JvmStatic
    public static final boolean yield() {
        return onNavigationEvent.onWarmupCompleted().onNavigationEvent();
    }

    @JvmStatic
    public static final void isOnScrollbarThumb(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        onNavigationEvent.onWarmupCompleted().onNavigationEvent(str);
    }

    @JvmStatic
    public static final void isInScrollbarThumb(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter(str2, BuildConfig.FLAVOR);
        onNavigationEvent.onWarmupCompleted().onNavigationEvent(str, str2);
    }

    @JvmStatic
    public static final void isOnScrollbarMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BuildConfig.FLAVOR);
        onNavigationEvent.onWarmupCompleted().onExtraCallback(str);
    }

    @JvmStatic
    public static final String resolveMethod(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        return onExtraCallback.onExtraCallbackWithResult(context);
    }

    @JvmStatic
    public static final String initScrollCache(@Nullable byte[] bArr) {
        return onExtraCallback.onExtraCallback(bArr);
    }

    @JvmStatic
    public static final byte[] buildDrawingCacheImpl(@Nullable String str) {
        return onExtraCallback.onWarmupCompleted(str);
    }
}
