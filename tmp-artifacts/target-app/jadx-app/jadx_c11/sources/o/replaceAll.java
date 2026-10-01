package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Authenticator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class replaceAll implements toFullSHA1Hash {
    private static int extraCallback = 1;
    private static int getInterfaceDescriptor;
    private final Function1<Boolean, Unit> IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private final AppLovinSdkSettings IAuthTabCallbackStubProxy;
    private final Authenticator IAuthTabCallback_Parcel;
    private final long access000;
    private final Authenticator access100;
    private final Authenticator asBinder;
    private final Authenticator asInterface;
    private final protocols onExtraCallback;
    private final LiveDataObservableResult<Integer, replace> onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final boolean onTransact;
    private final Function1<Boolean, Unit> onWarmupCompleted;

    public replaceAll() {
        this(null, null, null, null, false, null, null, 0L, 0L, null, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public replaceAll(@NotNull Authenticator authenticator, @NotNull Authenticator authenticator2, @NotNull Authenticator authenticator3, @NotNull Authenticator authenticator4, boolean z, @NotNull protocols protocolsVar, @NotNull AppLovinSdkSettings appLovinSdkSettings, long j, long j2, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function1<? super Boolean, Unit> function12) {
        Intrinsics.checkNotNullParameter(authenticator, "");
        Intrinsics.checkNotNullParameter(authenticator2, "");
        Intrinsics.checkNotNullParameter(authenticator3, "");
        Intrinsics.checkNotNullParameter(authenticator4, "");
        Intrinsics.checkNotNullParameter(protocolsVar, "");
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        this.IAuthTabCallback_Parcel = authenticator;
        this.access100 = authenticator2;
        this.asBinder = authenticator3;
        this.asInterface = authenticator4;
        this.onTransact = z;
        this.onExtraCallback = protocolsVar;
        this.IAuthTabCallbackStubProxy = appLovinSdkSettings;
        this.access000 = j;
        this.onNavigationEvent = j2;
        this.IAuthTabCallback = function1;
        this.onWarmupCompleted = function12;
        this.onExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted();
        this.IAuthTabCallbackStub = ExtensionsManager1.Companion.onNavigationEvent();
    }

    public /* synthetic */ replaceAll(Authenticator authenticator, Authenticator authenticator2, Authenticator authenticator3, Authenticator authenticator4, boolean z, protocols protocolsVar, AppLovinSdkSettings appLovinSdkSettings, long j, long j2, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Authenticator onnavigationevent;
        Authenticator onnavigationevent2;
        protocols protocolsVar2;
        Function1 function13;
        Authenticator onnavigationevent3 = (i & 1) != 0 ? new Authenticator.onNavigationEvent(0, 0) : authenticator;
        if ((i & 2) != 0) {
            onnavigationevent = new Authenticator.onNavigationEvent(1, 0);
            int i2 = getInterfaceDescriptor + 61;
            extraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            onnavigationevent = authenticator2;
        }
        if ((i & 4) != 0) {
            onnavigationevent2 = new Authenticator.onNavigationEvent(1, 0);
            int i4 = 2 % 2;
        } else {
            onnavigationevent2 = authenticator3;
        }
        Authenticator onnavigationevent4 = (i & 8) != 0 ? new Authenticator.onNavigationEvent(0, 0) : authenticator4;
        boolean z2 = (i & 16) == 0 ? z : false;
        if ((i & 32) != 0) {
            int i5 = extraCallback + 55;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            protocolsVar2 = protocols.None;
        } else {
            protocolsVar2 = protocolsVar;
        }
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = (i & 64) != 0 ? AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, null, 24, null) : appLovinSdkSettings;
        long j3 = (i & 128) != 0 ? 80L : j;
        long j4 = (i & 256) != 0 ? 0L : j2;
        Function1 function14 = null;
        if ((i & 512) != 0) {
            int i7 = getInterfaceDescriptor + 3;
            extraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            function13 = null;
        } else {
            function13 = function1;
        }
        if ((i & 1024) != 0) {
            int i9 = getInterfaceDescriptor + 37;
            extraCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            function14 = function12;
        }
        this(onnavigationevent3, onnavigationevent, onnavigationevent2, onnavigationevent4, z2, protocolsVar2, appLovinSdkSettingsIAuthTabCallback, j3, j4, function13, function14);
    }

    @Override // o.toFullSHA1Hash
    public Authenticator IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 31;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        Authenticator authenticator = this.IAuthTabCallback_Parcel;
        int i5 = i2 + 95;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return authenticator;
    }

    @Override // o.toFullSHA1Hash
    public Authenticator getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 5;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Authenticator authenticator = this.access100;
        int i5 = i2 + 45;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return authenticator;
        }
        throw null;
    }

    @Override // o.toFullSHA1Hash
    public Authenticator asBinder() {
        int i = 2 % 2;
        int i2 = extraCallback + 119;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        Authenticator authenticator = this.asBinder;
        int i5 = i3 + 1;
        extraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 46 / 0;
        }
        return authenticator;
    }

    @Override // o.toFullSHA1Hash
    public Authenticator onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        Authenticator authenticator = this.asInterface;
        int i5 = i3 + 123;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return authenticator;
    }

    @Override // o.toFullSHA1Hash
    public AppLovinSdkSettings onTransact() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 73;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        AppLovinSdkSettings appLovinSdkSettings = this.IAuthTabCallbackStubProxy;
        int i5 = i2 + 53;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return appLovinSdkSettings;
        }
        throw null;
    }

    @Override // o.toFullSHA1Hash
    public long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 113;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = this.access000;
        int i5 = i2 + 7;
        extraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.toFullSHA1Hash
    public long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        long j = this.onNavigationEvent;
        if (i4 != 0) {
            int i5 = 29 / 0;
        }
        int i6 = i3 + 95;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 51 / 0;
        }
        return j;
    }

    @Override // o.toFullSHA1Hash
    public Function1<Boolean, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 125;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Function1<Boolean, Unit> function1 = this.IAuthTabCallback;
        int i5 = i2 + 39;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    @Override // o.toFullSHA1Hash
    public Function1<Boolean, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.toFullSHA1Hash
    public LiveDataObservableResult<Integer, replace> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        LiveDataObservableResult<Integer, replace> liveDataObservableResult = this.onExtraCallbackWithResult;
        int i5 = i3 + 95;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return liveDataObservableResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.toFullSHA1Hash
    public long IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallback + 97;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallbackStub;
        }
        int i3 = 35 / 0;
        return this.IAuthTabCallbackStub;
    }

    @Override // o.toFullSHA1Hash
    public void onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub = j;
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
    }

    @Override // o.toFullSHA1Hash
    public int asInterface() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 83;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.IAuthTabCallbackDefault;
        int i5 = i2 + 15;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // o.toFullSHA1Hash
    public void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = extraCallback + 101;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.toFullSHA1Hash
    public void access000() {
        int i = 2 % 2;
        int i2 = extraCallback + 75;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted().clear();
        int i4 = getInterfaceDescriptor + 105;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
