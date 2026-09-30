package im.toss.uikit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class SafePlayerView extends StyledPlayerView {
    private static int asInterface = 1;
    private static int onWarmupCompleted;
    private final boolean IAuthTabCallback;
    private onExtraCallbackWithResult<Boolean> onExtraCallback;
    private onExtraCallbackWithResult<Integer> onExtraCallbackWithResult;
    private final SafePlayerView$playerStateControlObserver$1 onNavigationEvent;

    public static final /* synthetic */ SafePlayerView$playerStateControlObserver$1 IAuthTabCallback(SafePlayerView safePlayerView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 5;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        SafePlayerView$playerStateControlObserver$1 safePlayerView$playerStateControlObserver$1 = safePlayerView.onNavigationEvent;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 61;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return safePlayerView$playerStateControlObserver$1;
    }

    public static final /* synthetic */ onExtraCallbackWithResult onExtraCallback(SafePlayerView safePlayerView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 113;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult<Integer> onextracallbackwithresult = safePlayerView.onExtraCallbackWithResult;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 103;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return onextracallbackwithresult;
    }

    public static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(SafePlayerView safePlayerView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult<Boolean> onextracallbackwithresult = safePlayerView.onExtraCallback;
        if (i3 != 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    public static final /* synthetic */ boolean onNavigationEvent(SafePlayerView safePlayerView) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        boolean z = safePlayerView.IAuthTabCallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Type inference failed for: r5v3, types: [im.toss.uikit.widget.SafePlayerView$playerStateControlObserver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SafePlayerView(@NotNull Context context) {
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new onExtraCallbackWithResult<>(Boolean.FALSE);
        this.onExtraCallbackWithResult = new onExtraCallbackWithResult<>(0);
        this.onNavigationEvent = new DefaultLifecycleObserver() { // from class: im.toss.uikit.widget.SafePlayerView$playerStateControlObserver$1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                if (i3 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 75;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                if (i3 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = onNavigationEvent + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 109;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 93;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                if (i3 == 0) {
                    throw null;
                }
                int i4 = onNavigationEvent + 111;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Player player = this.onExtraCallback.getPlayer();
                if (player != null) {
                    int i4 = onNavigationEvent + 19;
                    onWarmupCompleted = i4 % 128;
                    Object obj = null;
                    try {
                        if (i4 % 2 == 0) {
                            SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).onExtraCallback();
                            obj.hashCode();
                            throw null;
                        }
                        if (SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).onExtraCallback() && ((Boolean) SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).IAuthTabCallback()).booleanValue()) {
                            player.play();
                        }
                        if (SafePlayerView.onExtraCallback(this.onExtraCallback).onExtraCallback()) {
                            player.setRepeatMode(((Number) SafePlayerView.onExtraCallback(this.onExtraCallback).IAuthTabCallback()).intValue());
                        }
                    } catch (Exception e) {
                        if (!SafePlayerView.onNavigationEvent(this.onExtraCallback)) {
                            return;
                        }
                        int i5 = onNavigationEvent + 33;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        e.getMessage();
                        if (i6 == 0) {
                            throw null;
                        }
                        int i7 = onWarmupCompleted + 17;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Player player = this.onExtraCallback.getPlayer();
                if (player != null) {
                    Object obj = null;
                    try {
                        SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).onExtraCallbackWithResult(Boolean.valueOf(player.isPlaying()));
                        if (player.isPlaying()) {
                            int i4 = onWarmupCompleted + 81;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 != 0) {
                                player.pause();
                                throw null;
                            }
                            player.pause();
                        }
                        SafePlayerView.onExtraCallback(this.onExtraCallback).onExtraCallbackWithResult(Integer.valueOf(player.getRepeatMode()));
                        player.setRepeatMode(0);
                        int i5 = onWarmupCompleted + 97;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                    } catch (Exception e) {
                        if (SafePlayerView.onNavigationEvent(this.onExtraCallback)) {
                            int i6 = onWarmupCompleted + 119;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 == 0) {
                                e.getMessage();
                            } else {
                                e.getMessage();
                                obj.hashCode();
                                throw null;
                            }
                        }
                    }
                }
            }
        };
        if (isAttachedToWindow()) {
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                int i = onWarmupCompleted + 31;
                asInterface = i % 128;
                int i2 = i % 2;
                TextFieldKeyInputExternalSyntheticLambda9 lifecycle2 = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
                if (lifecycle2 != null) {
                    lifecycle2.IAuthTabCallback(IAuthTabCallback(this));
                    int i3 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
                    asInterface = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            if (!isAttachedToWindow()) {
                addOnAttachStateChangeListener(new IAuthTabCallback(this, this));
                return;
            }
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2 != null) {
                int i5 = onWarmupCompleted + 69;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2.getLifecycle();
                    int i6 = 36 / 0;
                    if (lifecycle == null) {
                        return;
                    }
                } else {
                    lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2.getLifecycle();
                    if (lifecycle == null) {
                        return;
                    }
                }
                int i7 = asInterface + 95;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 == 0) {
                    lifecycle.onExtraCallbackWithResult(IAuthTabCallback(this));
                    int i8 = 2 % 2;
                    return;
                } else {
                    lifecycle.onExtraCallbackWithResult(IAuthTabCallback(this));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            return;
        }
        addOnAttachStateChangeListener(new onNavigationEvent(this, this));
        int i9 = 2 % 2;
        if (!isAttachedToWindow()) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [im.toss.uikit.widget.SafePlayerView$playerStateControlObserver$1] */
    public SafePlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new onExtraCallbackWithResult<>(Boolean.FALSE);
        this.onExtraCallbackWithResult = new onExtraCallbackWithResult<>(0);
        this.onNavigationEvent = new DefaultLifecycleObserver() { // from class: im.toss.uikit.widget.SafePlayerView$playerStateControlObserver$1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                if (i3 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 75;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                if (i3 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = onNavigationEvent + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 109;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 93;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                if (i3 == 0) {
                    throw null;
                }
                int i4 = onNavigationEvent + 111;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 53;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Player player = this.onExtraCallback.getPlayer();
                if (player != null) {
                    int i4 = onNavigationEvent + 19;
                    onWarmupCompleted = i4 % 128;
                    Object obj = null;
                    try {
                        if (i4 % 2 == 0) {
                            SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).onExtraCallback();
                            obj.hashCode();
                            throw null;
                        }
                        if (SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).onExtraCallback() && ((Boolean) SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).IAuthTabCallback()).booleanValue()) {
                            player.play();
                        }
                        if (SafePlayerView.onExtraCallback(this.onExtraCallback).onExtraCallback()) {
                            player.setRepeatMode(((Number) SafePlayerView.onExtraCallback(this.onExtraCallback).IAuthTabCallback()).intValue());
                        }
                    } catch (Exception e) {
                        if (!SafePlayerView.onNavigationEvent(this.onExtraCallback)) {
                            return;
                        }
                        int i5 = onNavigationEvent + 33;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        e.getMessage();
                        if (i6 == 0) {
                            throw null;
                        }
                        int i7 = onWarmupCompleted + 17;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Player player = this.onExtraCallback.getPlayer();
                if (player != null) {
                    Object obj = null;
                    try {
                        SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).onExtraCallbackWithResult(Boolean.valueOf(player.isPlaying()));
                        if (player.isPlaying()) {
                            int i4 = onWarmupCompleted + 81;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 != 0) {
                                player.pause();
                                throw null;
                            }
                            player.pause();
                        }
                        SafePlayerView.onExtraCallback(this.onExtraCallback).onExtraCallbackWithResult(Integer.valueOf(player.getRepeatMode()));
                        player.setRepeatMode(0);
                        int i5 = onWarmupCompleted + 97;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                    } catch (Exception e) {
                        if (SafePlayerView.onNavigationEvent(this.onExtraCallback)) {
                            int i6 = onWarmupCompleted + 119;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 == 0) {
                                e.getMessage();
                            } else {
                                e.getMessage();
                                obj.hashCode();
                                throw null;
                            }
                        }
                    }
                }
            }
        };
        if (isAttachedToWindow()) {
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                int i = asInterface + 65;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                TextFieldKeyInputExternalSyntheticLambda9 lifecycle2 = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
                if (lifecycle2 != null) {
                    lifecycle2.IAuthTabCallback(IAuthTabCallback(this));
                    int i3 = 2 % 2;
                }
            }
        } else {
            addOnAttachStateChangeListener(new onWarmupCompleted(this, this));
        }
        if (isAttachedToWindow()) {
            addOnAttachStateChangeListener(new onTransact(this, this));
            return;
        }
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2 != null) {
            int i4 = asInterface + 119;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2.getLifecycle();
                int i5 = 38 / 0;
                if (lifecycle == null) {
                    return;
                }
            } else {
                lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2.getLifecycle();
                if (lifecycle == null) {
                    return;
                }
            }
            int i6 = asInterface + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                lifecycle.onExtraCallbackWithResult(IAuthTabCallback(this));
                int i7 = 29 / 0;
            } else {
                lifecycle.onExtraCallbackWithResult(IAuthTabCallback(this));
            }
            int i8 = asInterface + 75;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[PHI: r4
      0x006f: PHI (r4v13 o.TextFieldKeyInputExternalSyntheticLambda9) = (r4v12 o.TextFieldKeyInputExternalSyntheticLambda9), (r4v18 o.TextFieldKeyInputExternalSyntheticLambda9) binds: [B:20:0x006d, B:17:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v3, types: [im.toss.uikit.widget.SafePlayerView$playerStateControlObserver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SafePlayerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new onExtraCallbackWithResult<>(Boolean.FALSE);
        this.onExtraCallbackWithResult = new onExtraCallbackWithResult<>(0);
        this.onNavigationEvent = new DefaultLifecycleObserver() { // from class: im.toss.uikit.widget.SafePlayerView$playerStateControlObserver$1
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i22 = onWarmupCompleted + 51;
                onNavigationEvent = i22 % 128;
                int i3 = i22 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                if (i3 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i22 = onWarmupCompleted + 75;
                onNavigationEvent = i22 % 128;
                int i3 = i22 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda0);
                if (i3 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = onNavigationEvent + 97;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i22 = onNavigationEvent + 109;
                onWarmupCompleted = i22 % 128;
                int i3 = i22 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 93;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i22 = onNavigationEvent + 43;
                onWarmupCompleted = i22 % 128;
                int i3 = i22 % 2;
                super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                if (i3 == 0) {
                    throw null;
                }
                int i4 = onNavigationEvent + 111;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i22 = onNavigationEvent + 53;
                onWarmupCompleted = i22 % 128;
                int i3 = i22 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Player player = this.onExtraCallback.getPlayer();
                if (player != null) {
                    int i4 = onNavigationEvent + 19;
                    onWarmupCompleted = i4 % 128;
                    Object obj = null;
                    try {
                        if (i4 % 2 == 0) {
                            SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).onExtraCallback();
                            obj.hashCode();
                            throw null;
                        }
                        if (SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).onExtraCallback() && ((Boolean) SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).IAuthTabCallback()).booleanValue()) {
                            player.play();
                        }
                        if (SafePlayerView.onExtraCallback(this.onExtraCallback).onExtraCallback()) {
                            player.setRepeatMode(((Number) SafePlayerView.onExtraCallback(this.onExtraCallback).IAuthTabCallback()).intValue());
                        }
                    } catch (Exception e) {
                        if (!SafePlayerView.onNavigationEvent(this.onExtraCallback)) {
                            return;
                        }
                        int i5 = onNavigationEvent + 33;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        e.getMessage();
                        if (i6 == 0) {
                            throw null;
                        }
                        int i7 = onWarmupCompleted + 17;
                        onNavigationEvent = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                int i2 = 2 % 2;
                int i22 = onWarmupCompleted + 35;
                onNavigationEvent = i22 % 128;
                int i3 = i22 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Player player = this.onExtraCallback.getPlayer();
                if (player != null) {
                    Object obj = null;
                    try {
                        SafePlayerView.onExtraCallbackWithResult(this.onExtraCallback).onExtraCallbackWithResult(Boolean.valueOf(player.isPlaying()));
                        if (player.isPlaying()) {
                            int i4 = onWarmupCompleted + 81;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 != 0) {
                                player.pause();
                                throw null;
                            }
                            player.pause();
                        }
                        SafePlayerView.onExtraCallback(this.onExtraCallback).onExtraCallbackWithResult(Integer.valueOf(player.getRepeatMode()));
                        player.setRepeatMode(0);
                        int i5 = onWarmupCompleted + 97;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw null;
                        }
                    } catch (Exception e) {
                        if (SafePlayerView.onNavigationEvent(this.onExtraCallback)) {
                            int i6 = onWarmupCompleted + 119;
                            onNavigationEvent = i6 % 128;
                            if (i6 % 2 == 0) {
                                e.getMessage();
                            } else {
                                e.getMessage();
                                obj.hashCode();
                                throw null;
                            }
                        }
                    }
                }
            }
        };
        if (isAttachedToWindow()) {
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (lifecycle2 = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle()) != null) {
                lifecycle2.IAuthTabCallback(IAuthTabCallback(this));
            }
        } else {
            addOnAttachStateChangeListener(new onExtraCallback(this, this));
        }
        if (!isAttachedToWindow()) {
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2 = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2 != null) {
                int i2 = asInterface + 67;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2.getLifecycle();
                    int i3 = 41 / 0;
                    if (lifecycle != null) {
                        lifecycle.onExtraCallbackWithResult(IAuthTabCallback(this));
                        int i4 = onWarmupCompleted + 125;
                        asInterface = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = 2 % 2;
                    }
                } else {
                    lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult2.getLifecycle();
                    if (lifecycle != null) {
                    }
                }
            }
            int i7 = asInterface + 5;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 67 / 0;
                return;
            }
            return;
        }
        addOnAttachStateChangeListener(new IAuthTabCallbackStub(this, this));
    }

    static final class onExtraCallbackWithResult<T> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private T onExtraCallbackWithResult;
        private final T onWarmupCompleted;

        public onExtraCallbackWithResult(T t) {
            this.onWarmupCompleted = t;
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            if (this.onExtraCallbackWithResult == null) {
                return false;
            }
            int i5 = i3 + 51;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        public final void onExtraCallbackWithResult(T t) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            this.onExtraCallbackWithResult = t;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 5;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 58 / 0;
            }
        }

        public final T IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            int i4 = i2 % 2;
            T t = this.onExtraCallbackWithResult;
            if (t == null) {
                t = this.onWarmupCompleted;
            }
            int i5 = i3 + 87;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return t;
            }
            throw null;
        }
    }

    public static final class onExtraCallback implements View.OnAttachStateChangeListener {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ SafePlayerView onExtraCallbackWithResult;
        final /* synthetic */ View onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public onExtraCallback(View view, SafePlayerView safePlayerView) {
            this.onWarmupCompleted = view;
            this.onExtraCallbackWithResult = safePlayerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 109;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.removeOnAttachStateChangeListener(this);
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                int i4 = onExtraCallback + 37;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.IAuthTabCallback(SafePlayerView.IAuthTabCallback(this.onExtraCallbackWithResult));
                }
            }
        }
    }

    public static final class onNavigationEvent implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ View onExtraCallback;
        final /* synthetic */ SafePlayerView onWarmupCompleted;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public onNavigationEvent(View view, SafePlayerView safePlayerView) {
            this.onExtraCallback = view;
            this.onWarmupCompleted = safePlayerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            this.onExtraCallback.removeOnAttachStateChangeListener(this);
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this.onWarmupCompleted);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                int i2 = IAuthTabCallback + 103;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.IAuthTabCallback(SafePlayerView.IAuthTabCallback(this.onWarmupCompleted));
                }
            }
            int i4 = IAuthTabCallback + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static final class onWarmupCompleted implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ SafePlayerView onExtraCallbackWithResult;
        final /* synthetic */ View onNavigationEvent;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        public onWarmupCompleted(View view, SafePlayerView safePlayerView) {
            this.onNavigationEvent = view;
            this.onExtraCallbackWithResult = safePlayerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.removeOnAttachStateChangeListener(this);
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                int i4 = IAuthTabCallback + 67;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.IAuthTabCallback(SafePlayerView.IAuthTabCallback(this.onExtraCallbackWithResult));
                    int i5 = onWarmupCompleted + 119;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
        }
    }

    public static final class IAuthTabCallback implements View.OnAttachStateChangeListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ SafePlayerView onExtraCallback;
        final /* synthetic */ View onExtraCallbackWithResult;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public IAuthTabCallback(View view, SafePlayerView safePlayerView) {
            this.onExtraCallbackWithResult = view;
            this.onExtraCallback = safePlayerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallbackWithResult.removeOnAttachStateChangeListener(this);
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this.onExtraCallback);
                if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                    int i3 = IAuthTabCallback + 89;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
                    if (lifecycle != null) {
                        int i5 = IAuthTabCallback + 67;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        lifecycle.onExtraCallbackWithResult(SafePlayerView.IAuthTabCallback(this.onExtraCallback));
                        return;
                    }
                    return;
                }
                return;
            }
            this.onExtraCallbackWithResult.removeOnAttachStateChangeListener(this);
            AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements View.OnAttachStateChangeListener {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ SafePlayerView onExtraCallback;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        public IAuthTabCallbackStub(View view, SafePlayerView safePlayerView) {
            this.IAuthTabCallback = view;
            this.onExtraCallback = safePlayerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            this.IAuthTabCallback.removeOnAttachStateChangeListener(this);
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this.onExtraCallback);
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null) {
                int i2 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.onExtraCallbackWithResult(SafePlayerView.IAuthTabCallback(this.onExtraCallback));
                    int i4 = onWarmupCompleted + 17;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        }
    }

    public static final class onTransact implements View.OnAttachStateChangeListener {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ SafePlayerView onExtraCallbackWithResult;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onTransact(View view, SafePlayerView safePlayerView) {
            this.IAuthTabCallback = view;
            this.onExtraCallbackWithResult = safePlayerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallback.removeOnAttachStateChangeListener(this);
                textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                int i3 = 98 / 0;
                if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
                    return;
                }
            } else {
                this.IAuthTabCallback.removeOnAttachStateChangeListener(this);
                textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this.onExtraCallbackWithResult);
                if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null) {
                    return;
                }
            }
            int i4 = onNavigationEvent + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            TextFieldKeyInputExternalSyntheticLambda9 lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle();
            if (lifecycle != null) {
                lifecycle.onExtraCallbackWithResult(SafePlayerView.IAuthTabCallback(this.onExtraCallbackWithResult));
                int i6 = onNavigationEvent + 39;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }
}
