package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_hostnameVerifier;
import o.deprecated_proxyAuthenticator;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_proxyAuthenticator {
    private static int asBinder = 1;
    private static int asInterface;
    private double IAuthTabCallbackDefault;
    private final List<Double> IAuthTabCallbackStub;
    private final double onExtraCallback;
    private final double onExtraCallbackWithResult;
    private final double onTransact;
    private final double onWarmupCompleted;
    private final double IAuthTabCallback = 0.01d;
    private final deprecated_hostnameVerifier onNavigationEvent = new deprecated_hostnameVerifier(new Function1() { // from class: im.toss.tds.foundation.anim.rally.easing.spring.SpringRK4Animator$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 63;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Double.valueOf(deprecated_proxyAuthenticator.onExtraCallbackWithResult(this.f$0, (deprecated_hostnameVerifier.onExtraCallback) obj));
                throw null;
            }
            Double dValueOf = Double.valueOf(deprecated_proxyAuthenticator.onExtraCallbackWithResult(this.f$0, (deprecated_hostnameVerifier.onExtraCallback) obj));
            int i3 = onWarmupCompleted + 5;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return dValueOf;
            }
            throw null;
        }
    });

    public static /* synthetic */ double onExtraCallbackWithResult(deprecated_proxyAuthenticator deprecated_proxyauthenticator, deprecated_hostnameVerifier.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asInterface + 95;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(deprecated_proxyauthenticator, onextracallback);
        }
        onExtraCallback(deprecated_proxyauthenticator, onextracallback);
        throw null;
    }

    public deprecated_proxyAuthenticator(double d, double d2) {
        this.onExtraCallback = d;
        this.onExtraCallbackWithResult = d2;
        ArrayList arrayList = new ArrayList();
        this.IAuthTabCallbackStub = arrayList;
        double d3 = this.IAuthTabCallbackDefault;
        double d4 = this.onTransact;
        arrayList.clear();
        double d5 = 0.0d;
        arrayList.add(Double.valueOf(0.0d));
        int i = 2 % 2;
        boolean zIAuthTabCallback = false;
        double dOnExtraCallback = d3;
        double dOnNavigationEvent = d4;
        while (!zIAuthTabCallback) {
            int i2 = asBinder + 109;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            d5 += 0.016666666666666666d;
            IAuthTabCallback IAuthTabCallback2 = IAuthTabCallback(dOnExtraCallback, dOnNavigationEvent, 0.016666666666666666d);
            dOnExtraCallback = IAuthTabCallback2.onExtraCallback();
            dOnNavigationEvent = IAuthTabCallback2.onNavigationEvent();
            zIAuthTabCallback = IAuthTabCallback2.IAuthTabCallback();
            if (IAuthTabCallback2.IAuthTabCallback()) {
                this.IAuthTabCallbackStub.add(Double.valueOf(1.0d));
            } else {
                this.IAuthTabCallbackStub.add(Double.valueOf(dOnExtraCallback));
            }
        }
        this.onWarmupCompleted = d5;
        int i4 = asBinder + 31;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final double onExtraCallback(deprecated_proxyAuthenticator deprecated_proxyauthenticator, deprecated_hostnameVerifier.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        double dOnExtraCallbackWithResult = ((-deprecated_proxyauthenticator.onExtraCallback) * onextracallback.onExtraCallbackWithResult()) - (deprecated_proxyauthenticator.onExtraCallbackWithResult * onextracallback.onNavigationEvent());
        int i4 = asInterface + 93;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return dOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Double> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        List<Double> list = this.IAuthTabCallbackStub;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return list;
    }

    public final double onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        double d = this.onWarmupCompleted;
        int i5 = i3 + 69;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    private final IAuthTabCallback IAuthTabCallback(double d, double d2, double d3) {
        int i = 2 % 2;
        deprecated_hostnameVerifier.onExtraCallback onextracallback = new deprecated_hostnameVerifier.onExtraCallback(d - 1.0d, d2);
        deprecated_hostnameVerifier.onExtraCallback onextracallbackOnExtraCallbackWithResult = this.onNavigationEvent.onExtraCallbackWithResult(new deprecated_hostnameVerifier.onExtraCallback(onextracallback.onExtraCallbackWithResult(), onextracallback.onNavigationEvent()), d3);
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallbackOnExtraCallbackWithResult.onExtraCallbackWithResult(), onextracallbackOnExtraCallbackWithResult.onNavigationEvent());
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(1.0d + onextracallbackOnExtraCallbackWithResult.onExtraCallbackWithResult(), onextracallbackOnExtraCallbackWithResult.onNavigationEvent(), zOnExtraCallbackWithResult);
        int i2 = asInterface + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private final boolean onExtraCallbackWithResult(double d, double d2) {
        boolean z;
        int i = 2 % 2;
        int i2 = asBinder + 103;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean z2 = Math.abs(d) < this.IAuthTabCallback;
        if (Math.abs(d2) < this.IAuthTabCallback) {
            int i4 = asInterface + 99;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!z2 || !z) {
            return false;
        }
        int i6 = asInterface + 87;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static final class IAuthTabCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        private final double onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final double onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onExtraCallback + 83;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (Double.compare(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult) == 0) {
                return Double.compare(this.onWarmupCompleted, iAuthTabCallback.onWarmupCompleted) == 0 && this.onNavigationEvent == iAuthTabCallback.onNavigationEvent;
            }
            int i4 = IAuthTabCallback + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((Double.hashCode(this.onExtraCallbackWithResult) * 31) + Double.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onNavigationEvent);
            int i4 = onExtraCallback + 63;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SimulateNextResult(simulatedValue=" + this.onExtraCallbackWithResult + ", simulatedVelocity=" + this.onWarmupCompleted + ", finished=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallback + 111;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public IAuthTabCallback(double d, double d2, boolean z) {
            this.onExtraCallbackWithResult = d;
            this.onWarmupCompleted = d2;
            this.onNavigationEvent = z;
        }

        public final double onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 53;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            double d = this.onExtraCallbackWithResult;
            int i4 = i3 + 109;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return d;
        }

        public final double onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 73;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            double d = this.onWarmupCompleted;
            int i5 = i2 + 7;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return d;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 41;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 91;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    }
}
