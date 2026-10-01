package o;

import android.app.Activity;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.loadNextIncentivizedAd;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.core.AppStateManager;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class loadNextIncentivizedAd implements AppLovinError {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private final zzdj onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = onExtraCallbackWithResult + 93;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Activity activity, boolean z, loadNextIncentivizedAd loadnextincentivizedad) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(activity, z, loadnextincentivizedad);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onNavigationEvent + 55;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public loadNextIncentivizedAd(@NotNull zzdj zzdjVar) {
        Intrinsics.checkNotNullParameter(zzdjVar, "");
        this.onWarmupCompleted = zzdjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r3 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r5.onWarmupCompleted.onExtraCallback();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r5.onWarmupCompleted.onExtraCallback();
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        java.lang.Runtime.getRuntime().exit(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r4 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r4 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r3 = o.loadNextIncentivizedAd.onNavigationEvent + 25;
        o.loadNextIncentivizedAd.IAuthTabCallback = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(Activity activity, boolean z, loadNextIncentivizedAd loadnextincentivizedad) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            activity.setResult(0);
            activity.finishAffinity();
        } else {
            activity.setResult(0);
            activity.finishAffinity();
        }
    }

    @Override // o.AppLovinError
    public void IAuthTabCallback(final boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        try {
            final Activity typedObject = AppStateManager.onExtraCallbackWithResult.readTypedObject();
            if (typedObject != null) {
                typedObject.runOnUiThread(new Runnable() { // from class: im.toss.splittarget.impl.core.ApplicationProcessManagerImpl$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = 2 % 2;
                        int i5 = onWarmupCompleted + 109;
                        onNavigationEvent = i5 % 128;
                        if (i5 % 2 == 0) {
                            loadNextIncentivizedAd.onExtraCallbackWithResult(typedObject, z, this);
                            throw null;
                        }
                        loadNextIncentivizedAd.onExtraCallbackWithResult(typedObject, z, this);
                        int i6 = onWarmupCompleted + 33;
                        onNavigationEvent = i6 % 128;
                        if (i6 % 2 == 0) {
                            throw null;
                        }
                    }
                });
                return;
            }
            Runtime.getRuntime().exit(0);
            int i4 = IAuthTabCallback + 111;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Exception e) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ApplicationProcessManager(UserLogin)", "error on exitAppProcess", e, (Map) null, 8, (Object) null);
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
