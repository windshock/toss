package o;

import im.toss.securities.core.router.spec.TossSecRoute;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import o.onConsentInfoUpdateSuccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class onConsentInfoUpdateSuccess implements qExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final LiveDataObservableExternalSyntheticLambda1<setTermsOfServiceUri> onExtraCallbackWithResult;
    private final IAnimation<TossSecRoute> onWarmupCompleted;

    /* JADX WARN: Illegal instructions before constructor call */
    public onConsentInfoUpdateSuccess() {
        TossSecRoute tossSecRoute = null;
        this(tossSecRoute, 1, tossSecRoute);
    }

    public static /* synthetic */ TossSecRoute onExtraCallbackWithResult(onConsentInfoUpdateSuccess onconsentinfoupdatesuccess) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TossSecRoute tossSecRouteIAuthTabCallback = IAuthTabCallback(onconsentinfoupdatesuccess);
        int i4 = IAuthTabCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return tossSecRouteIAuthTabCallback;
    }

    public onConsentInfoUpdateSuccess(@NotNull TossSecRoute tossSecRoute) {
        Intrinsics.checkNotNullParameter(tossSecRoute, "");
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onNavigationEvent(new setTermsOfServiceUri[]{new setTermsOfServiceUri(tossSecRoute, null, null, null, 14, null)});
        this.onWarmupCompleted = ycxycx.onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Function0() { // from class: im.toss.securities.core.router.impl.TossSecNavigationStateImpl$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    onConsentInfoUpdateSuccess.onExtraCallbackWithResult(this.f$0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TossSecRoute tossSecRouteOnExtraCallbackWithResult = onConsentInfoUpdateSuccess.onExtraCallbackWithResult(this.f$0);
                int i3 = IAuthTabCallback + 107;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return tossSecRouteOnExtraCallbackWithResult;
            }
        }));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ onConsentInfoUpdateSuccess(TossSecRoute tossSecRoute, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 75;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                tossSecRoute = TossSecRoute.Loading.INSTANCE;
                int i3 = onNavigationEvent + 73;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } else {
                TossSecRoute.Loading loading = TossSecRoute.Loading.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this(tossSecRoute);
    }

    @Override // o.qExternalSyntheticLambda0
    public /* bridge */ TossSecRoute IAuthTabCallbackStub() {
        TossSecRoute tossSecRouteIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            tossSecRouteIAuthTabCallbackStub = super.IAuthTabCallbackStub();
            int i3 = 63 / 0;
        } else {
            tossSecRouteIAuthTabCallbackStub = super.IAuthTabCallbackStub();
        }
        int i4 = onNavigationEvent + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return tossSecRouteIAuthTabCallbackStub;
    }

    @Override // o.qExternalSyntheticLambda0
    public /* bridge */ String asBinder() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strAsBinder = super.asBinder();
        int i4 = IAuthTabCallback + 69;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return strAsBinder;
        }
        throw null;
    }

    @Override // o.qExternalSyntheticLambda0
    public /* bridge */ TossSecRoute onExtraCallback() {
        TossSecRoute tossSecRouteOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            tossSecRouteOnExtraCallback = super.onExtraCallback();
            int i3 = 44 / 0;
        } else {
            tossSecRouteOnExtraCallback = super.onExtraCallback();
        }
        int i4 = IAuthTabCallback + 37;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return tossSecRouteOnExtraCallback;
    }

    @Override // o.qExternalSyntheticLambda0
    public /* bridge */ String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = super.onExtraCallbackWithResult();
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return strOnExtraCallbackWithResult;
    }

    @Override // o.qExternalSyntheticLambda0
    public /* bridge */ boolean onExtraCallbackWithResult(@NotNull KClass<? extends TossSecRoute> kClass) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super.onExtraCallbackWithResult(kClass);
        int i4 = onNavigationEvent + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    @Override // o.qExternalSyntheticLambda0
    public /* bridge */ setTermsOfServiceUri onNavigationEvent() {
        setTermsOfServiceUri settermsofserviceuriOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            settermsofserviceuriOnNavigationEvent = super.onNavigationEvent();
            int i3 = 96 / 0;
        } else {
            settermsofserviceuriOnNavigationEvent = super.onNavigationEvent();
        }
        int i4 = onNavigationEvent + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return settermsofserviceuriOnNavigationEvent;
    }

    @Override // o.qExternalSyntheticLambda0
    public /* bridge */ setTermsOfServiceUri onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        setTermsOfServiceUri settermsofserviceuriOnTransact = super.onTransact();
        int i4 = onNavigationEvent + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return settermsofserviceuriOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.qExternalSyntheticLambda0
    public LiveDataObservableExternalSyntheticLambda1<setTermsOfServiceUri> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        LiveDataObservableExternalSyntheticLambda1<setTermsOfServiceUri> liveDataObservableExternalSyntheticLambda1 = this.onExtraCallbackWithResult;
        int i5 = i2 + 71;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return liveDataObservableExternalSyntheticLambda1;
        }
        throw null;
    }

    private static final TossSecRoute IAuthTabCallback(onConsentInfoUpdateSuccess onconsentinfoupdatesuccess) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setTermsOfServiceUri settermsofserviceuri = (setTermsOfServiceUri) CollectionsKt.lastOrNull(onconsentinfoupdatesuccess.IAuthTabCallback());
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        if (settermsofserviceuri != null) {
            return settermsofserviceuri.IAuthTabCallback();
        }
        int i4 = IAuthTabCallback + 27;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // o.qExternalSyntheticLambda0
    public String onExtraCallback(@NotNull TossSecRoute tossSecRoute, @NotNull List<Pair<String, String>> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tossSecRoute, "");
        Intrinsics.checkNotNullParameter(list, "");
        setTermsOfServiceUri settermsofserviceuri = new setTermsOfServiceUri(tossSecRoute, null, list, null, 10, null);
        IAuthTabCallback().add(settermsofserviceuri);
        String strOnExtraCallback = settermsofserviceuri.onExtraCallback();
        int i2 = IAuthTabCallback + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return strOnExtraCallback;
    }

    @Override // o.qExternalSyntheticLambda0
    public String onExtraCallbackWithResult(@NotNull TossSecRoute tossSecRoute, @Nullable KClass<? extends TossSecRoute> kClass, boolean z, @NotNull List<Pair<String, String>> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(tossSecRoute, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (kClass != null) {
            IAuthTabCallback(kClass, z);
        }
        setTermsOfServiceUri settermsofserviceuri = (setTermsOfServiceUri) CollectionsKt.lastOrNull(IAuthTabCallback());
        if (settermsofserviceuri != null) {
            int i4 = IAuthTabCallback + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (settermsofserviceuri.IAuthTabCallback().getClass() == tossSecRoute.getClass()) {
                setTermsOfServiceUri settermsofserviceuri2 = new setTermsOfServiceUri(tossSecRoute, settermsofserviceuri.onExtraCallback(), list, null, 8, null);
                IAuthTabCallback().set(CollectionsKt.getLastIndex(IAuthTabCallback()), settermsofserviceuri2);
                String strOnExtraCallback = settermsofserviceuri2.onExtraCallback();
                int i6 = IAuthTabCallback + 45;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 15 / 0;
                }
                return strOnExtraCallback;
            }
        }
        return onExtraCallback(tossSecRoute, list);
    }

    @Override // o.qExternalSyntheticLambda0
    public boolean IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0 ? IAuthTabCallback().size() > 1 : IAuthTabCallback().size() > 1) {
            IAuthTabCallback().remove(CollectionsKt.getLastIndex(IAuthTabCallback()));
            return true;
        }
        int i3 = onNavigationEvent + 27;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.qExternalSyntheticLambda0
    public boolean IAuthTabCallback(@NotNull KClass<? extends TossSecRoute> kClass, boolean z) {
        int iNextIndex;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(kClass, "");
        LiveDataObservableExternalSyntheticLambda1<setTermsOfServiceUri> liveDataObservableExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback();
        ListIterator listIterator = liveDataObservableExternalSyntheticLambda1IAuthTabCallback.listIterator(liveDataObservableExternalSyntheticLambda1IAuthTabCallback.size());
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if (!listIterator.hasPrevious()) {
                int i4 = onNavigationEvent + 67;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                iNextIndex = -1;
                break;
            }
            if (kClass.isInstance(((setTermsOfServiceUri) listIterator.previous()).IAuthTabCallback())) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex < 0) {
            return false;
        }
        if (!z) {
            int i6 = onNavigationEvent + 7;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iNextIndex++;
        }
        while (IAuthTabCallback().size() > iNextIndex) {
            int i8 = IAuthTabCallback + 105;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                IAuthTabCallback().remove(CollectionsKt.getLastIndex(IAuthTabCallback()));
                int i9 = 52 / 0;
            } else {
                IAuthTabCallback().remove(CollectionsKt.getLastIndex(IAuthTabCallback()));
            }
        }
        return true;
    }

    @Override // o.qExternalSyntheticLambda0
    public void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback().clear();
        int i4 = IAuthTabCallback + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
    }
}
