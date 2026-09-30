package o;

import android.app.Application;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class downloadAsset implements getIconPaddingBottom {
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private boolean IAuthTabCallback;
    private final onViewDraw onExtraCallback;
    private final Lazy<copyFile> onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;

    @Inject
    public downloadAsset(@NotNull Lazy<copyFile> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "");
        this.onExtraCallbackWithResult = lazy;
        this.onExtraCallback = onViewDraw.Marketing;
    }

    @Override // o.getIconPaddingBottom
    public onViewDraw onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 103;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        onViewDraw onviewdraw = this.onExtraCallback;
        int i5 = i2 + 65;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return onviewdraw;
    }

    @Override // o.getIconPaddingBottom
    public void onExtraCallbackWithResult(@NotNull Application application, @NotNull getIconPaddingTop geticonpaddingtop) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(geticonpaddingtop, "");
            int i = IAuthTabCallback.onExtraCallbackWithResult[geticonpaddingtop.ordinal()];
            if (i == 1) {
                if (!this.IAuthTabCallback) {
                    this.onExtraCallbackWithResult.get().onExtraCallbackWithResult(application);
                    this.IAuthTabCallback = true;
                }
                if (!this.onNavigationEvent) {
                    this.onExtraCallbackWithResult.get().onNavigationEvent(application);
                    this.onNavigationEvent = true;
                    this.onWarmupCompleted = false;
                } else if (this.onWarmupCompleted) {
                    this.onExtraCallbackWithResult.get().onWarmupCompleted(application);
                    this.onWarmupCompleted = false;
                }
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                IAuthTabCallback(application);
            }
        }
    }

    private final void IAuthTabCallback(Application application) {
        int i = 2 % 2;
        if (this.IAuthTabCallback) {
            int i2 = asBinder + 31;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.onWarmupCompleted) {
                return;
            }
            int i4 = i3 + 55;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            this.onExtraCallbackWithResult.get().onExtraCallback(application);
            this.onWarmupCompleted = true;
            int i6 = IAuthTabCallbackDefault + 99;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
    }
}
