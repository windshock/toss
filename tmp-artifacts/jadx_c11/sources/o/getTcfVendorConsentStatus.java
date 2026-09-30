package o;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getTcfVendorConsentStatus extends CacheCacheResponseBody {
    public static final onExtraCallback Companion = onExtraCallback.onExtraCallback;

    clampToInt onExtraCallbackWithResult();

    default maxAge onExtraCallback() {
        int i = 2 % 2;
        return onExtraCallbackWithResult().onExtraCallback();
    }

    default void onWarmupCompleted(@NotNull maxAge maxage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxage, "");
        onExtraCallbackWithResult().onExtraCallback(maxage);
    }

    default float IAuthTabCallback() {
        int i = 2 % 2;
        return onExtraCallbackWithResult().onExtraCallbackWithResult();
    }

    default void onNavigationEvent(float f) {
        int i = 2 % 2;
        onExtraCallbackWithResult().onNavigationEvent(f);
    }

    public static final class onExtraCallback implements getTcfVendorConsentStatus {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        static final /* synthetic */ onExtraCallback onExtraCallback = new onExtraCallback();
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private final /* synthetic */ getPurposeConsentStatus onWarmupCompleted = getPurposeConsentStatus.onWarmupCompleted;

        static {
            int i = IAuthTabCallback + 37;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        @Override // o.getTcfVendorConsentStatus
        public float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 71;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.IAuthTabCallback();
                obj.hashCode();
                throw null;
            }
            float fIAuthTabCallback = this.onWarmupCompleted.IAuthTabCallback();
            int i3 = IAuthTabCallbackStub + 85;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return fIAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.CacheCacheResponseBody
        public Resources IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            getPurposeConsentStatus getpurposeconsentstatus = this.onWarmupCompleted;
            if (i3 != 0) {
                return getpurposeconsentstatus.IAuthTabCallbackDefault();
            }
            getpurposeconsentstatus.IAuthTabCallbackDefault();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public getPins IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.asInterface();
                throw null;
            }
            getPins getpinsAsInterface = this.onWarmupCompleted.asInterface();
            int i3 = onExtraCallbackWithResult + 113;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return getpinsAsInterface;
        }

        @Override // o.CacheCacheResponseBody
        public Context IAuthTabCallbackStubProxy() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Context contextIAuthTabCallbackStubProxy = this.onWarmupCompleted.IAuthTabCallbackStubProxy();
            int i4 = onExtraCallbackWithResult + 91;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
            }
            return contextIAuthTabCallbackStubProxy;
        }

        @Override // o.CacheCacheResponseBody
        public Resources IAuthTabCallback_Parcel() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.IAuthTabCallback_Parcel();
                throw null;
            }
            Resources resourcesIAuthTabCallback_Parcel = this.onWarmupCompleted.IAuthTabCallback_Parcel();
            int i3 = IAuthTabCallbackStub + 113;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return resourcesIAuthTabCallback_Parcel;
        }

        public deprecated_maxAgeSeconds access100() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            deprecated_maxAgeSeconds deprecated_maxagesecondsAccess100 = this.onWarmupCompleted.access100();
            int i4 = IAuthTabCallbackStub + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return deprecated_maxagesecondsAccess100;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public accessinit asBinder() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            accessinit accessinitVarAsBinder = this.onWarmupCompleted.asBinder();
            int i4 = onExtraCallbackWithResult + 111;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 0 / 0;
            }
            return accessinitVarAsBinder;
        }

        public Locale asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Locale localeIAuthTabCallbackStub = this.onWarmupCompleted.IAuthTabCallbackStub();
            int i4 = IAuthTabCallbackStub + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return localeIAuthTabCallbackStub;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public setDone getInterfaceDescriptor() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 53;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            setDone setdoneAccess000 = this.onWarmupCompleted.access000();
            int i4 = onExtraCallbackWithResult + 113;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return setdoneAccess000;
        }

        @Override // o.getTcfVendorConsentStatus
        public maxAge onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 95;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            maxAge maxageOnExtraCallback = this.onWarmupCompleted.onExtraCallback();
            if (i3 == 0) {
                int i4 = 74 / 0;
            }
            return maxageOnExtraCallback;
        }

        @Override // o.getTcfVendorConsentStatus
        public clampToInt onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 117;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getPurposeConsentStatus getpurposeconsentstatus = this.onWarmupCompleted;
            if (i3 == 0) {
                return getpurposeconsentstatus.onExtraCallbackWithResult();
            }
            getpurposeconsentstatus.onExtraCallbackWithResult();
            throw null;
        }

        public isDoNotSellSet onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 99;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            isDoNotSellSet isdonotsellsetOnTransact = this.onWarmupCompleted.onTransact();
            if (i3 == 0) {
                int i4 = 28 / 0;
            }
            return isdonotsellsetOnTransact;
        }

        @Override // o.getTcfVendorConsentStatus
        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            IAuthTabCallbackStub = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.onWarmupCompleted.onNavigationEvent(f);
                throw null;
            }
            this.onWarmupCompleted.onNavigationEvent(f);
            int i3 = IAuthTabCallbackStub + 115;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public void onNavigationEvent(@NotNull Context context) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            this.onWarmupCompleted.onNavigationEvent(context);
            int i4 = onExtraCallbackWithResult + 85;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onNavigationEvent(@NotNull AppLovinPostbackListener appLovinPostbackListener) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 59;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(appLovinPostbackListener, "");
            if (i3 != 0) {
                this.onWarmupCompleted.onExtraCallbackWithResult(appLovinPostbackListener);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.onWarmupCompleted.onExtraCallbackWithResult(appLovinPostbackListener);
            int i4 = onExtraCallbackWithResult + 65;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }

        public isUserConsentSet onTransact() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            isUserConsentSet interfaceDescriptor = this.onWarmupCompleted.getInterfaceDescriptor();
            if (i3 == 0) {
                int i4 = 77 / 0;
            }
            return interfaceDescriptor;
        }

        @Override // o.CacheCacheResponseBody
        public Context onWarmupCompleted() {
            Context contextOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 79;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                contextOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
                int i3 = 20 / 0;
            } else {
                contextOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted();
            }
            int i4 = IAuthTabCallbackStub + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return contextOnWarmupCompleted;
        }

        @Override // o.getTcfVendorConsentStatus
        public void onWarmupCompleted(@NotNull maxAge maxage) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 29;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(maxage, "");
            this.onWarmupCompleted.onWarmupCompleted(maxage);
            int i4 = IAuthTabCallbackStub + 81;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        private onExtraCallback() {
        }
    }
}
