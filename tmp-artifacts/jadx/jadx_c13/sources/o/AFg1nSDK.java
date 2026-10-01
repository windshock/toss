package o;

import androidx.compose.ui.geometry.Rect;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class AFg1nSDK extends QuirksExternalSyntheticBackport0.onWarmupCompleted implements StreamSpecQueryResult {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private AFg1oSDK onExtraCallback;
    private Futures3 onExtraCallbackWithResult;
    private AFg1qSDK onNavigationEvent;
    private Object onWarmupCompleted;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult;

        static {
            int[] iArr = new int[AFg1oSDK.values().length];
            try {
                iArr[AFg1oSDK.Item.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFg1oSDK.Handle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFg1oSDK.Region.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFg1oSDK.DropTarget.ordinal()] = 4;
                int i = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFg1oSDK.Exclusion.ordinal()] = 5;
                int i4 = onExtraCallbackWithResult + 51;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            onExtraCallback = iArr;
        }
    }

    public AFg1nSDK(@NotNull AFg1qSDK aFg1qSDK, @NotNull Object obj, @NotNull AFg1oSDK aFg1oSDK) {
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(aFg1oSDK, "");
        this.onNavigationEvent = aFg1qSDK;
        this.onWarmupCompleted = obj;
        this.onExtraCallback = aFg1oSDK;
    }

    public final void onNavigationEvent(@NotNull AFg1qSDK aFg1qSDK, @NotNull Object obj, @NotNull AFg1oSDK aFg1oSDK) {
        Rect rectIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(aFg1oSDK, "");
        if (this.onNavigationEvent == aFg1qSDK) {
            int i2 = asInterface + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(this.onWarmupCompleted, obj)) {
                int i4 = IAuthTabCallback + 105;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                if (this.onExtraCallback == aFg1oSDK) {
                    return;
                }
            }
        }
        IAuthTabCallbackDefault();
        this.onNavigationEvent = aFg1qSDK;
        this.onWarmupCompleted = obj;
        this.onExtraCallback = aFg1oSDK;
        Futures3 futures3 = this.onExtraCallbackWithResult;
        if (futures3 != null && (rectIAuthTabCallback = AFg1sSDK.IAuthTabCallback(futures3)) != null) {
            onNavigationEvent(rectIAuthTabCallback);
        }
        int i6 = IAuthTabCallback + 49;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public void IAuthTabCallback(@NotNull Futures3 futures3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        this.onExtraCallbackWithResult = futures3;
        Rect rectIAuthTabCallback = AFg1sSDK.IAuthTabCallback(futures3);
        if (rectIAuthTabCallback != null) {
            onNavigationEvent(rectIAuthTabCallback);
            int i2 = IAuthTabCallback + 61;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = IAuthTabCallback + 77;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    public void asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 85;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult = null;
            IAuthTabCallbackDefault();
            super.asInterface();
            int i3 = asInterface + 73;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.onExtraCallbackWithResult = null;
        IAuthTabCallbackDefault();
        super.asInterface();
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(Rect rect) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult.onExtraCallback[this.onExtraCallback.ordinal()];
        if (i2 != 1) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 15;
            asInterface = i4 % 128;
            if (i4 % 2 != 0 ? i2 == 2 : i2 == 3) {
                this.onNavigationEvent.onNavigationEvent(this.onWarmupCompleted, rect);
                return;
            }
            int i5 = i3 + 51;
            int i6 = i5 % 128;
            asInterface = i6;
            if (i5 % 2 != 0 ? i2 == 3 : i2 == 5) {
                this.onNavigationEvent.onExtraCallback(this.onWarmupCompleted, rect);
                return;
            }
            if (i2 == 4) {
                this.onNavigationEvent.onWarmupCompleted(this.onWarmupCompleted, rect);
                return;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = i6 + 105;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                this.onNavigationEvent.IAuthTabCallback(this.onWarmupCompleted, rect);
                return;
            }
        }
        this.onNavigationEvent.onExtraCallbackWithResult(this.onWarmupCompleted, rect);
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onExtraCallbackWithResult.onExtraCallback[this.onExtraCallback.ordinal()];
        if (i4 != 1) {
            int i5 = asInterface + 101;
            int i6 = i5 % 128;
            IAuthTabCallback = i6;
            if (i5 % 2 == 0 ? i4 == 2 : i4 == 5) {
                this.onNavigationEvent.IAuthTabCallback(this.onWarmupCompleted);
                return;
            }
            if (i4 == 3) {
                this.onNavigationEvent.IAuthTabCallbackStub(this.onWarmupCompleted);
                return;
            }
            if (i4 == 4) {
                this.onNavigationEvent.onExtraCallback(this.onWarmupCompleted);
                return;
            }
            int i7 = i6 + 101;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            if (i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            this.onNavigationEvent.onExtraCallbackWithResult(this.onWarmupCompleted);
            return;
        }
        this.onNavigationEvent.asInterface(this.onWarmupCompleted);
    }
}
