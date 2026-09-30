package o;

import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.removeRearDisplayPresentationStatusListener;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class removeRearDisplayPresentationStatusListener {
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 1;
    private static WeakReference<endRearDisplaySession> onExtraCallback = null;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    public static final removeRearDisplayPresentationStatusListener IAuthTabCallback = new removeRearDisplayPresentationStatusListener();
    private static final List<WeakReference<endRearDisplaySession>> onExtraCallbackWithResult = new ArrayList();
    public static final int onNavigationEvent = 8;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i4) | i5);
        int i8 = (~((~i5) | (~i3))) | i7;
        int i9 = i5 | i3;
        int i10 = i5 + i3 + i2 + ((-39394691) * i6) + ((-2104995841) * i);
        int i11 = i10 * i10;
        int i12 = (i5 * (-1880913482)) + 198443008 + ((-1880913482) * i3) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i2) + ((-1529085952) * i6) + ((-319553536) * i) + ((-289079296) * i11);
        int i13 = ((i5 * 1773844906) - 1404835566) + (i3 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i2 * 1773845519) + (i6 * 1055723859) + (i * 1996616689) + (i11 * (-1450508288));
        return i12 + ((i13 * i13) * (-778371072)) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ boolean onExtraCallback(WeakReference weakReference) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(weakReference);
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return zOnNavigationEvent;
    }

    public static /* synthetic */ boolean onNavigationEvent(endRearDisplaySession endreardisplaysession, WeakReference weakReference) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(endreardisplaysession, weakReference);
        int i4 = onWarmupCompleted + 91;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        endRearDisplaySession endreardisplaysession = (endRearDisplaySession) objArr[0];
        WeakReference weakReference = (WeakReference) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        boolean zBooleanValue = ((Boolean) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{endreardisplaysession, weakReference}, -1746088521, iOnWarmupCompleted, 1746088522, iOnWarmupCompleted3)).booleanValue();
        int i4 = onWarmupCompleted + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    private removeRearDisplayPresentationStatusListener() {
    }

    static {
        int i = onTransact + 45;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull endRearDisplaySession endreardisplaysession) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(endreardisplaysession, "");
            WeakReference<endRearDisplaySession> weakReference = onExtraCallback;
            endRearDisplaySession endreardisplaysession2 = weakReference != null ? weakReference.get() : null;
            if (endreardisplaysession2 != endreardisplaysession) {
                if (endreardisplaysession2 != null) {
                    endreardisplaysession2.onWarmupCompleted();
                }
                onExtraCallback = new WeakReference<>(endreardisplaysession);
            }
            onTransact(endreardisplaysession);
            endreardisplaysession.onExtraCallback();
            onWarmupCompleted();
        }
    }

    public final void onWarmupCompleted(@NotNull endRearDisplaySession endreardisplaysession) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(endreardisplaysession, "");
            WeakReference<endRearDisplaySession> weakReference = onExtraCallback;
            if ((weakReference != null ? weakReference.get() : null) == endreardisplaysession) {
                onExtraCallback = null;
            }
            endreardisplaysession.onWarmupCompleted();
            onWarmupCompleted();
        }
    }

    public final void IAuthTabCallback(@NotNull endRearDisplaySession endreardisplaysession) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(endreardisplaysession, "");
            WeakReference<endRearDisplaySession> weakReference = onExtraCallback;
            if ((weakReference != null ? weakReference.get() : null) == endreardisplaysession) {
                onExtraCallback = null;
            }
            onNavigationEvent(endreardisplaysession);
            endreardisplaysession.IAuthTabCallback();
        }
    }

    public final boolean onExtraCallback(@NotNull endRearDisplaySession endreardisplaysession) {
        boolean z;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(endreardisplaysession, "");
            WeakReference<endRearDisplaySession> weakReference = onExtraCallback;
            z = (weakReference != null ? weakReference.get() : null) == endreardisplaysession;
        }
        return z;
    }

    private static final boolean IAuthTabCallback(endRearDisplaySession endreardisplaysession, WeakReference weakReference) {
        int i = 2 % 2;
        int i2 = asBinder + 115;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(weakReference, "");
        if (weakReference.get() == null || weakReference.get() == endreardisplaysession) {
            return true;
        }
        int i4 = onWarmupCompleted + 89;
        int i5 = i4 % 128;
        asBinder = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 43;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    private final void onTransact(final endRearDisplaySession endreardisplaysession) {
        int i = 2 % 2;
        List<WeakReference<endRearDisplaySession>> list = onExtraCallbackWithResult;
        CollectionsKt.removeAll(list, new Function1() { // from class: im.toss.ads_sdk.ui.video.NativeAdsFeedVideoPlaybackManager$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 91;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(removeRearDisplayPresentationStatusListener.onNavigationEvent(endreardisplaysession, (WeakReference) obj));
                int i5 = IAuthTabCallback + 89;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return boolValueOf;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        list.add(new WeakReference<>(endreardisplaysession));
        int i2 = asBinder + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        endRearDisplaySession endreardisplaysession = (endRearDisplaySession) objArr[0];
        WeakReference weakReference = (WeakReference) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(weakReference, "");
        if (weakReference.get() != null) {
            int i2 = asBinder + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (weakReference.get() != endreardisplaysession) {
                return false;
            }
        }
        int i4 = onWarmupCompleted + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final void onNavigationEvent(final endRearDisplaySession endreardisplaysession) {
        int i = 2 % 2;
        CollectionsKt.removeAll(onExtraCallbackWithResult, new Function1() { // from class: im.toss.ads_sdk.ui.video.NativeAdsFeedVideoPlaybackManager$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 11;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = {endreardisplaysession, (WeakReference) obj};
                    int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                    Boolean.valueOf(((Boolean) removeRearDisplayPresentationStatusListener.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr, -1684886358, iOnWarmupCompleted, 1684886358, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted())).booleanValue());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Object[] objArr2 = {endreardisplaysession, (WeakReference) obj};
                int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
                Boolean boolValueOf = Boolean.valueOf(((Boolean) removeRearDisplayPresentationStatusListener.onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), objArr2, -1684886358, iOnWarmupCompleted2, 1684886358, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted())).booleanValue());
                int i4 = onWarmupCompleted + 45;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 65 / 0;
                }
                return boolValueOf;
            }
        });
        int i2 = asBinder + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final boolean onNavigationEvent(WeakReference weakReference) {
        int i = 2 % 2;
        int i2 = asBinder + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(weakReference, "");
        if (weakReference.get() != null) {
            return false;
        }
        int i4 = onWarmupCompleted + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private final void onWarmupCompleted() {
        endRearDisplaySession endreardisplaysession;
        int i = 2 % 2;
        CollectionsKt.removeAll(onExtraCallbackWithResult, new Function1() { // from class: im.toss.ads_sdk.ui.video.NativeAdsFeedVideoPlaybackManager$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 115;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                boolean zOnExtraCallback = removeRearDisplayPresentationStatusListener.onExtraCallback((WeakReference) obj);
                if (i4 != 0) {
                    return Boolean.valueOf(zOnExtraCallback);
                }
                int i5 = 3 / 0;
                return Boolean.valueOf(zOnExtraCallback);
            }
        });
        WeakReference<endRearDisplaySession> weakReference = onExtraCallback;
        endRearDisplaySession endreardisplaysession2 = weakReference != null ? weakReference.get() : null;
        while (true) {
            List<WeakReference<endRearDisplaySession>> list = onExtraCallbackWithResult;
            if (list.size() <= 2) {
                return;
            }
            Iterator<WeakReference<endRearDisplaySession>> it = list.iterator();
            int i2 = onWarmupCompleted + 21;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else if (it.next().get() != endreardisplaysession2) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                return;
            }
            int i5 = asBinder + 55;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                endreardisplaysession = onExtraCallbackWithResult.remove(i4).get();
                int i6 = 29 / 0;
                if (endreardisplaysession != null) {
                    endreardisplaysession.onExtraCallbackWithResult();
                }
            } else {
                endreardisplaysession = onExtraCallbackWithResult.remove(i4).get();
                if (endreardisplaysession != null) {
                    endreardisplaysession.onExtraCallbackWithResult();
                }
            }
        }
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(endRearDisplaySession endreardisplaysession, WeakReference weakReference) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Boolean) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{endreardisplaysession, weakReference}, -1684886358, iOnWarmupCompleted, 1684886358, iOnWarmupCompleted3)).booleanValue();
    }

    private static final boolean onWarmupCompleted(endRearDisplaySession endreardisplaysession, WeakReference weakReference) {
        int iOnWarmupCompleted = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted3 = InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted();
        return ((Boolean) onExtraCallback(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{endreardisplaysession, weakReference}, -1746088521, iOnWarmupCompleted, 1746088522, iOnWarmupCompleted3)).booleanValue();
    }
}
