package o;

import java.io.IOException;
import java.util.Objects;
import o.DrawerKtExternalSyntheticLambda28;
import o.DrawerStateCompanionExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ListItemKtExternalSyntheticLambda2 extends DrawerKtExternalSyntheticLambda28 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKtExternalSyntheticLambda2(final DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1, int i2, long j, long j2) {
        super(new DrawerKtExternalSyntheticLambda28.onExtraCallback() { // from class: androidx.media3.extractor.flac.FlacBinarySearchSeeker$$ExternalSyntheticLambda0
            @Override // o.DrawerKtExternalSyntheticLambda28.onExtraCallback
            public final long timeUsToTargetTime(long j3) {
                return drawerStateCompanionExternalSyntheticLambda1.onExtraCallback(j3);
            }
        }, new onExtraCallbackWithResult(drawerStateCompanionExternalSyntheticLambda1, i2), drawerStateCompanionExternalSyntheticLambda1.onWarmupCompleted(), 0L, drawerStateCompanionExternalSyntheticLambda1.access100, j, j2, drawerStateCompanionExternalSyntheticLambda1.IAuthTabCallback(), Math.max(6, drawerStateCompanionExternalSyntheticLambda1.asBinder));
        Objects.requireNonNull(drawerStateCompanionExternalSyntheticLambda1);
    }

    static final class onExtraCallbackWithResult implements DrawerKtExternalSyntheticLambda28.onTransact {
        private final DrawerStateCompanionExternalSyntheticLambda1 IAuthTabCallback;
        private final DrawerStateCompanionExternalSyntheticLambda0.onExtraCallback onExtraCallback;
        private final int onNavigationEvent;

        private onExtraCallbackWithResult(DrawerStateCompanionExternalSyntheticLambda1 drawerStateCompanionExternalSyntheticLambda1, int i2) {
            this.IAuthTabCallback = drawerStateCompanionExternalSyntheticLambda1;
            this.onNavigationEvent = i2;
            this.onExtraCallback = new DrawerStateCompanionExternalSyntheticLambda0.onExtraCallback();
        }

        @Override // o.DrawerKtExternalSyntheticLambda28.onTransact
        public DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, long j) throws IOException {
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
            long jOnNavigationEvent = onNavigationEvent(drawerKtExternalSyntheticLambda9);
            long jOnWarmupCompleted = drawerKtExternalSyntheticLambda9.onWarmupCompleted();
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(Math.max(6, this.IAuthTabCallback.asBinder));
            long jOnNavigationEvent2 = onNavigationEvent(drawerKtExternalSyntheticLambda9);
            long jOnWarmupCompleted2 = drawerKtExternalSyntheticLambda9.onWarmupCompleted();
            if (jOnNavigationEvent <= j && jOnNavigationEvent2 > j) {
                return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onWarmupCompleted(jOnWarmupCompleted);
            }
            if (jOnNavigationEvent2 <= j) {
                return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onExtraCallbackWithResult(jOnNavigationEvent2, jOnWarmupCompleted2);
            }
            return DrawerKtExternalSyntheticLambda28.onExtraCallbackWithResult.onWarmupCompleted(jOnNavigationEvent, jIAuthTabCallback);
        }

        private long onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
            while (drawerKtExternalSyntheticLambda9.onWarmupCompleted() < drawerKtExternalSyntheticLambda9.onExtraCallback() - 6 && !DrawerStateCompanionExternalSyntheticLambda0.onNavigationEvent(drawerKtExternalSyntheticLambda9, this.IAuthTabCallback, this.onNavigationEvent, this.onExtraCallback)) {
                drawerKtExternalSyntheticLambda9.IAuthTabCallback(1);
            }
            if (drawerKtExternalSyntheticLambda9.onWarmupCompleted() >= drawerKtExternalSyntheticLambda9.onExtraCallback() - 6) {
                drawerKtExternalSyntheticLambda9.IAuthTabCallback((int) (drawerKtExternalSyntheticLambda9.onExtraCallback() - drawerKtExternalSyntheticLambda9.onWarmupCompleted()));
                return this.IAuthTabCallback.access100;
            }
            return this.onExtraCallback.onNavigationEvent;
        }
    }
}
