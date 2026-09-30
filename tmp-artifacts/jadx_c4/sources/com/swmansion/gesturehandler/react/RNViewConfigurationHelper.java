package com.swmansion.gesturehandler.react;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1;
import o.isBound;
import o.isRemoved;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNViewConfigurationHelper implements isRemoved {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static long onExtraCallback = 2774352815842308441L;
    private static int onNavigationEvent = 1;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.values().length];
            try {
                iArr[CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.BOX_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.BOX_NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // o.isRemoved
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public isBound onExtraCallbackWithResult(@NotNull View view) throws NoWhenBranchMatchedException {
        CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1 pointerEvents;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int i3 = 40 / 0;
            pointerEvents = view instanceof ReactPointerEventsView ? ((ReactPointerEventsView) view).getPointerEvents() : CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.AUTO;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            if (view instanceof ReactPointerEventsView) {
            }
        }
        if (!view.isEnabled()) {
            if (pointerEvents == CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.AUTO) {
                int i4 = onNavigationEvent + 41;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                isBound isbound = isBound.BOX_NONE;
                int i6 = IAuthTabCallback + 91;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    return isbound;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (pointerEvents == CredentialProviderControllerCompanionmaybeReportErrorResultCodeGet1.BOX_ONLY) {
                return isBound.NONE;
            }
        }
        int i7 = WhenMappings.onNavigationEvent[pointerEvents.ordinal()];
        if (i7 == 1) {
            return isBound.BOX_ONLY;
        }
        if (i7 == 2) {
            return isBound.BOX_NONE;
        }
        int i8 = IAuthTabCallback + 27;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        if (i7 == 3) {
            return isBound.NONE;
        }
        if (i7 == 4) {
            return isBound.AUTO;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // o.isRemoved
    public View onWarmupCompleted(@NotNull ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (!(viewGroup instanceof ReactViewGroup)) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNull(childAt);
            return childAt;
        }
        int i3 = onNavigationEvent + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        View childAt2 = viewGroup.getChildAt(((ReactViewGroup) viewGroup).getZIndexMappedChildIndex(i));
        Intrinsics.checkNotNull(childAt2);
        int i5 = IAuthTabCallback + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return childAt2;
    }

    @Override // o.isRemoved
    public boolean onExtraCallback(@NotNull ViewGroup viewGroup) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (viewGroup.getClipChildren()) {
            int i2 = IAuthTabCallback + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(viewGroup instanceof ReactScrollView)) {
            if (!(viewGroup instanceof ReactHorizontalScrollView)) {
                if (viewGroup instanceof ReactViewGroup) {
                    return Intrinsics.areEqual(((ReactViewGroup) viewGroup).getOverflow(), "hidden");
                }
                return false;
            }
            String overflow = ((ReactHorizontalScrollView) viewGroup).getOverflow();
            Object[] objArr = new Object[1];
            a(new char[]{13336, 29786, 46247, 62736, 13688, 30163, 46629}, 16477 - View.resolveSizeAndState(0, 0, 0), objArr);
            return Intrinsics.areEqual(overflow, ((String) objArr[0]).intern()) ^ true;
        }
        String overflow2 = ((ReactScrollView) viewGroup).getOverflow();
        Object[] objArr2 = new Object[1];
        a(new char[]{13336, 29786, 46247, 62736, 13688, 30163, 46629}, TextUtils.getOffsetBefore("", 0) + 16477, objArr2);
        if (Intrinsics.areEqual(overflow2, ((String) objArr2[0]).intern())) {
            return false;
        }
        int i4 = onNavigationEvent + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            obj = null;
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getEdgeSlop() >> 16) + 24, 19627 - KeyEvent.normalizeMetaState(0), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getMode(0) + 59, 6383 - TextUtils.indexOf("", "", 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i4 = $10 + 55;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $11 + 77;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58, (-16770833) - Color.rgb(0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    obj.hashCode();
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), Color.green(0) + 59, TextUtils.indexOf((CharSequence) "", '0', 0) + 6384, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2);
        int i7 = $11 + 13;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
