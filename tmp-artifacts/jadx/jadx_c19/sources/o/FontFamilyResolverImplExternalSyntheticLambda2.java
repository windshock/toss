package o;

import android.util.Log;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import o.LayoutIntrinsics_androidKtExternalSyntheticLambda0;
import o.SaversKtExternalSyntheticLambda17;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FontFamilyResolverImplExternalSyntheticLambda2 implements LayoutIntrinsics_androidKtExternalSyntheticLambda0 {
    private SaversKtExternalSyntheticLambda17 IAuthTabCallback;
    private final FontFamilyResolverImplExternalSyntheticLambda4 onExtraCallback = new FontFamilyResolverImplExternalSyntheticLambda4();
    private final ResourceFont onExtraCallbackWithResult = new ResourceFont();
    private final File onNavigationEvent;
    private final long onWarmupCompleted;

    public static LayoutIntrinsics_androidKtExternalSyntheticLambda0 onNavigationEvent(File file, long j) {
        return new FontFamilyResolverImplExternalSyntheticLambda2(file, j);
    }

    @Deprecated
    protected FontFamilyResolverImplExternalSyntheticLambda2(File file, long j) {
        this.onNavigationEvent = file;
        this.onWarmupCompleted = j;
    }

    private SaversKtExternalSyntheticLambda17 onWarmupCompleted() throws IOException {
        SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17;
        synchronized (this) {
            if (this.IAuthTabCallback == null) {
                Object[] objArr = {this.onNavigationEvent, 1, 1, Long.valueOf(this.onWarmupCompleted)};
                int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                this.IAuthTabCallback = (SaversKtExternalSyntheticLambda17) SaversKtExternalSyntheticLambda17.onExtraCallbackWithResult(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1153994921, iOnWarmupCompleted, objArr, 1153994921);
            }
            saversKtExternalSyntheticLambda17 = this.IAuthTabCallback;
        }
        return saversKtExternalSyntheticLambda17;
    }

    @Override // o.LayoutIntrinsics_androidKtExternalSyntheticLambda0
    public File IAuthTabCallback(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26) {
        String strOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(saversKtExternalSyntheticLambda26);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(saversKtExternalSyntheticLambda26);
        }
        try {
            SaversKtExternalSyntheticLambda17.onNavigationEvent onnavigationeventOnWarmupCompleted = onWarmupCompleted().onWarmupCompleted(strOnWarmupCompleted);
            if (onnavigationeventOnWarmupCompleted != null) {
                return onnavigationeventOnWarmupCompleted.onNavigationEvent(0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // o.LayoutIntrinsics_androidKtExternalSyntheticLambda0
    public void IAuthTabCallback(SaversKtExternalSyntheticLambda26 saversKtExternalSyntheticLambda26, LayoutIntrinsics_androidKtExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult) {
        String strOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(saversKtExternalSyntheticLambda26);
        this.onExtraCallback.onWarmupCompleted(strOnWarmupCompleted);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(saversKtExternalSyntheticLambda26);
            }
            try {
                SaversKtExternalSyntheticLambda17 saversKtExternalSyntheticLambda17OnWarmupCompleted = onWarmupCompleted();
                if (saversKtExternalSyntheticLambda17OnWarmupCompleted.onWarmupCompleted(strOnWarmupCompleted) == null) {
                    SaversKtExternalSyntheticLambda17.IAuthTabCallback IAuthTabCallback = saversKtExternalSyntheticLambda17OnWarmupCompleted.IAuthTabCallback(strOnWarmupCompleted);
                    if (IAuthTabCallback == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strOnWarmupCompleted);
                    }
                    try {
                        if (onextracallbackwithresult.onWarmupCompleted(IAuthTabCallback.IAuthTabCallback(0))) {
                            IAuthTabCallback.onExtraCallback();
                        }
                        IAuthTabCallback.onNavigationEvent();
                    } catch (Throwable th) {
                        IAuthTabCallback.onNavigationEvent();
                        throw th;
                    }
                }
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } finally {
            this.onExtraCallback.onExtraCallbackWithResult(strOnWarmupCompleted);
        }
    }
}
