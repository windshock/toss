package o;

import android.net.Uri;
import com.google.android.gms.internal.ads.zziea;
import im.toss.tosssecurities.webview.TossSecuritiesWebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.lambdaonInstallReferrerSetupFinished0;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1rSDK {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final HashSet<TossSecuritiesWebView> onExtraCallback = new HashSet<>();
    private final HashSet<TossSecuritiesWebView> onNavigationEvent = new HashSet<>();

    public static final /* synthetic */ class onExtraCallback {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[TossSecuritiesWebView.onWarmupCompleted.values().length];
            try {
                iArr[TossSecuritiesWebView.onWarmupCompleted.MICRO_MTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TossSecuritiesWebView.onWarmupCompleted.FINTECH.ordinal()] = 2;
                int i = onNavigationEvent + 63;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
            int i4 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        Iterator<T> it = this.onExtraCallback.iterator();
        while (!(!it.hasNext())) {
            int i2 = onExtraCallbackWithResult + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ((TossSecuritiesWebView) it.next()).destroy();
        }
        Iterator<T> it2 = this.onNavigationEvent.iterator();
        while (!(!it2.hasNext())) {
            int i4 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            ((TossSecuritiesWebView) it2.next()).destroy();
        }
        this.onExtraCallback.clear();
        this.onNavigationEvent.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback(@NotNull TossSecuritiesWebView tossSecuritiesWebView) {
        HashSet<TossSecuritiesWebView> hashSet;
        Object next;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(tossSecuritiesWebView, "");
            tossSecuritiesWebView.requestPostMessageChannelWithExtras();
            int i3 = 25 / 0;
            hashSet = tossSecuritiesWebView.postMessage() == TossSecuritiesWebView.onWarmupCompleted.MICRO_MTS ? this.onNavigationEvent : this.onExtraCallback;
        } else {
            Intrinsics.checkNotNullParameter(tossSecuritiesWebView, "");
            tossSecuritiesWebView.requestPostMessageChannelWithExtras();
            if (tossSecuritiesWebView.postMessage() == TossSecuritiesWebView.onWarmupCompleted.MICRO_MTS) {
            }
        }
        lambdaonInstallReferrerSetupFinished0.onNavigationEvent onnavigationevent = lambdaonInstallReferrerSetupFinished0.onNavigationEvent.onNavigationEvent;
        if (!CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf(onnavigationevent), (Iterable) lambdaonInstallReferrerSetupFinished0.Companion.onExtraCallback()).contains(tossSecuritiesWebView.newAuthTabSession())) {
            tossSecuritiesWebView.setWebId(onnavigationevent);
            int i4 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        TossSecuritiesWebView tossSecuritiesWebView2 = ((Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{tossSecuritiesWebView.newAuthTabSession().IAuthTabCallback()})) != null ? tossSecuritiesWebView : null;
        if (tossSecuritiesWebView2 != null) {
            Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new HashSet[]{this.onNavigationEvent, this.onExtraCallback}).iterator();
            while (it.hasNext()) {
                ((HashSet) it.next()).remove(tossSecuritiesWebView2);
            }
        }
        hashSet.add(tossSecuritiesWebView);
        for (HashSet hashSet2 : CollectionsKt__CollectionsKt.listOf((Object[]) new HashSet[]{this.onExtraCallback, this.onNavigationEvent})) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : hashSet2) {
                int i6 = onExtraCallbackWithResult + 109;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (Intrinsics.areEqual(((TossSecuritiesWebView) obj).newAuthTabSession(), lambdaonInstallReferrerSetupFinished0.onNavigationEvent.onNavigationEvent)) {
                    int i8 = IAuthTabCallback + 27;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() > tossSecuritiesWebView.newAuthTabSession().onExtraCallback()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    int i10 = onExtraCallbackWithResult + 61;
                    IAuthTabCallback = i10 % 128;
                    if (i10 % 2 != 0) {
                        next = it2.next();
                        if (((Long) TossSecuritiesWebView.onNavigationEvent(zziea.IAuthTabCallback(), -774193604, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{(TossSecuritiesWebView) next}, 774193610)).longValue() / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS <= System.currentTimeMillis()) {
                            arrayList2.add(next);
                        }
                    } else {
                        next = it2.next();
                        if (((Long) TossSecuritiesWebView.onNavigationEvent(zziea.IAuthTabCallback(), -774193604, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{(TossSecuritiesWebView) next}, 774193610)).longValue() + RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS <= System.currentTimeMillis()) {
                            arrayList2.add(next);
                        }
                    }
                }
                Iterator it3 = CollectionsKt___CollectionsKt.take(arrayList2, arrayList.size() - tossSecuritiesWebView.newAuthTabSession().onExtraCallback()).iterator();
                while (it3.hasNext()) {
                    int i11 = IAuthTabCallback + 37;
                    onExtraCallbackWithResult = i11 % 128;
                    if (i11 % 2 == 0) {
                        TossSecuritiesWebView tossSecuritiesWebView3 = (TossSecuritiesWebView) it3.next();
                        hashSet2.remove(tossSecuritiesWebView3);
                        tossSecuritiesWebView3.destroy();
                        int i12 = 17 / 0;
                    } else {
                        TossSecuritiesWebView tossSecuritiesWebView4 = (TossSecuritiesWebView) it3.next();
                        hashSet2.remove(tossSecuritiesWebView4);
                        tossSecuritiesWebView4.destroy();
                    }
                }
            }
        }
        return true;
    }

    public final TossSecuritiesWebView onExtraCallback(@NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, @NotNull lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
            onNavigationEvent(lambdaoninstallreferrersetupfinished0, onwarmupcompleted);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(lambdaoninstallreferrersetupfinished0, "");
        TossSecuritiesWebView tossSecuritiesWebViewOnNavigationEvent = onNavigationEvent(lambdaoninstallreferrersetupfinished0, onwarmupcompleted);
        if (tossSecuritiesWebViewOnNavigationEvent != null) {
            this.onExtraCallback.remove(tossSecuritiesWebViewOnNavigationEvent);
            this.onNavigationEvent.remove(tossSecuritiesWebViewOnNavigationEvent);
        }
        int i3 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return tossSecuritiesWebViewOnNavigationEvent;
        }
        throw null;
    }

    private static final boolean onWarmupCompleted(lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished02) {
        Class<?> cls;
        int i = 2 % 2;
        if (lambdaoninstallreferrersetupfinished0 != null) {
            int i2 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            cls = lambdaoninstallreferrersetupfinished0.getClass();
            int i4 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        } else {
            cls = null;
        }
        boolean zAreEqual = Intrinsics.areEqual(cls, lambdaoninstallreferrersetupfinished02.getClass());
        int i6 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return zAreEqual;
    }

    private final TossSecuritiesWebView onNavigationEvent(lambdaonInstallReferrerSetupFinished0 lambdaoninstallreferrersetupfinished0, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted) {
        Object next;
        Iterator it;
        Object next2;
        int i = 2 % 2;
        Object obj = null;
        if (onExtraCallback.IAuthTabCallback[onwarmupcompleted.ordinal()] == 1) {
            int i2 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                it = this.onNavigationEvent.iterator();
                int i3 = 32 / 0;
            } else {
                it = this.onNavigationEvent.iterator();
            }
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (!(!onWarmupCompleted(((TossSecuritiesWebView) next2).newAuthTabSession(), lambdaoninstallreferrersetupfinished0))) {
                    break;
                }
            }
            TossSecuritiesWebView tossSecuritiesWebView = (TossSecuritiesWebView) next2;
            if (tossSecuritiesWebView != null) {
                return tossSecuritiesWebView;
            }
            Iterator<T> it2 = this.onNavigationEvent.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (Intrinsics.areEqual(((TossSecuritiesWebView) next3).newAuthTabSession(), lambdaonInstallReferrerSetupFinished0.onNavigationEvent.onNavigationEvent)) {
                    obj = next3;
                    break;
                }
            }
            return (TossSecuritiesWebView) obj;
        }
        Iterator<T> it3 = this.onExtraCallback.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (onWarmupCompleted(((TossSecuritiesWebView) next).newAuthTabSession(), lambdaoninstallreferrersetupfinished0)) {
                break;
            }
        }
        TossSecuritiesWebView tossSecuritiesWebView2 = (TossSecuritiesWebView) next;
        if (tossSecuritiesWebView2 != null) {
            return tossSecuritiesWebView2;
        }
        Iterator<T> it4 = this.onExtraCallback.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            int i4 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Object next4 = it4.next();
            if (Intrinsics.areEqual(((TossSecuritiesWebView) next4).newAuthTabSession(), lambdaonInstallReferrerSetupFinished0.onNavigationEvent.onNavigationEvent)) {
                obj = next4;
                break;
            }
        }
        TossSecuritiesWebView tossSecuritiesWebView3 = (TossSecuritiesWebView) obj;
        int i6 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return tossSecuritiesWebView3;
    }

    public final Set<TossSecuritiesWebView> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HashSet<TossSecuritiesWebView> hashSet = this.onExtraCallback;
        if (i3 != 0) {
            return clearSenderUid.onExtraCallback(hashSet, this.onNavigationEvent);
        }
        clearSenderUid.onExtraCallback(hashSet, this.onNavigationEvent);
        throw null;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onExtraCallback.isEmpty()) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return this.onNavigationEvent.isEmpty();
    }

    public final boolean onExtraCallback(@NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        int i2 = onExtraCallback.IAuthTabCallback[onwarmupcompleted.ordinal()];
        Object obj = null;
        if (i2 == 1) {
            HashSet<TossSecuritiesWebView> hashSet = this.onNavigationEvent;
            if (hashSet != null && hashSet.isEmpty()) {
                int i3 = IAuthTabCallback + 35;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return true;
            }
            Iterator<T> it = hashSet.iterator();
            while (it.hasNext()) {
                if (((TossSecuritiesWebView) it.next()).newAuthTabSession() instanceof lambdaonInstallReferrerSetupFinished0.onNavigationEvent) {
                    return false;
                }
            }
            int i5 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        HashSet<TossSecuritiesWebView> hashSet2 = this.onExtraCallback;
        if (hashSet2 != null && hashSet2.isEmpty()) {
            int i7 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                return true;
            }
            throw null;
        }
        Iterator<T> it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            int i8 = IAuthTabCallback + 125;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                boolean z = ((TossSecuritiesWebView) it2.next()).newAuthTabSession() instanceof lambdaonInstallReferrerSetupFinished0.onNavigationEvent;
                obj.hashCode();
                throw null;
            }
            if (!(!(((TossSecuritiesWebView) it2.next()).newAuthTabSession() instanceof lambdaonInstallReferrerSetupFinished0.onNavigationEvent))) {
                return false;
            }
        }
        return true;
    }
}
