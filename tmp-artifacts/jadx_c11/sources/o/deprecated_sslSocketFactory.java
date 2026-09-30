package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Authenticator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_sslSocketFactory {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private final boolean IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final socketFactory IAuthTabCallbackStub;
    private final Authenticator access000;
    private final boolean asBinder;
    private final Authenticator asInterface;
    private final Authenticator getInterfaceDescriptor;
    private final protocols onExtraCallback;
    private final Authenticator onExtraCallbackWithResult;
    private final Function2<View, Boolean, Unit> onNavigationEvent;
    private final AppLovinSdkSettings onTransact;
    private final int onWarmupCompleted;

    public deprecated_sslSocketFactory() {
        this(null, null, null, null, false, null, null, false, 0, 0, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public deprecated_sslSocketFactory(@NotNull Authenticator authenticator, @NotNull Authenticator authenticator2, @NotNull Authenticator authenticator3, @NotNull Authenticator authenticator4, boolean z, @NotNull protocols protocolsVar, @NotNull AppLovinSdkSettings appLovinSdkSettings, boolean z2, int i, int i2, @NotNull socketFactory socketfactory, @Nullable Function2<? super View, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(authenticator, "");
        Intrinsics.checkNotNullParameter(authenticator2, "");
        Intrinsics.checkNotNullParameter(authenticator3, "");
        Intrinsics.checkNotNullParameter(authenticator4, "");
        Intrinsics.checkNotNullParameter(protocolsVar, "");
        Intrinsics.checkNotNullParameter(appLovinSdkSettings, "");
        Intrinsics.checkNotNullParameter(socketfactory, "");
        this.access000 = authenticator;
        this.getInterfaceDescriptor = authenticator2;
        this.asInterface = authenticator3;
        this.onExtraCallbackWithResult = authenticator4;
        this.asBinder = z;
        this.onExtraCallback = protocolsVar;
        this.onTransact = appLovinSdkSettings;
        this.IAuthTabCallback = z2;
        this.IAuthTabCallbackDefault = i;
        this.onWarmupCompleted = i2;
        this.IAuthTabCallbackStub = socketfactory;
        this.onNavigationEvent = function2;
    }

    public /* synthetic */ deprecated_sslSocketFactory(Authenticator authenticator, Authenticator authenticator2, Authenticator authenticator3, Authenticator authenticator4, boolean z, protocols protocolsVar, AppLovinSdkSettings appLovinSdkSettings, boolean z2, int i, int i2, socketFactory socketfactory, Function2 function2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Authenticator onnavigationevent;
        boolean z3;
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback;
        int i4;
        int i5 = 0;
        Authenticator onnavigationevent2 = (i3 & 1) != 0 ? new Authenticator.onNavigationEvent(0, 0) : authenticator;
        Authenticator onnavigationevent3 = (i3 & 2) != 0 ? new Authenticator.onNavigationEvent(1, 0) : authenticator2;
        Authenticator onnavigationevent4 = (i3 & 4) != 0 ? new Authenticator.onNavigationEvent(1, 0) : authenticator3;
        if ((i3 & 8) != 0) {
            onnavigationevent = new Authenticator.onNavigationEvent(0, 0);
            int i6 = 2 % 2;
        } else {
            onnavigationevent = authenticator4;
        }
        if ((i3 & 16) != 0) {
            int i7 = access100 + 71;
            IAuthTabCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        protocols protocolsVar2 = (i3 & 32) != 0 ? protocols.None : protocolsVar;
        if ((i3 & 64) != 0) {
            int i10 = access100 + 57;
            IAuthTabCallbackStubProxy = i10 % 128;
            int i11 = i10 % 2;
            appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.FAST, false, null, 24, null);
        } else {
            appLovinSdkSettingsIAuthTabCallback = appLovinSdkSettings;
        }
        boolean z4 = (i3 & 128) != 0 ? false : z2;
        if ((i3 & 256) != 0) {
            int i12 = IAuthTabCallbackStubProxy + 63;
            access100 = i12 % 128;
            i4 = i12 % 2 == 0 ? 121 : 80;
        } else {
            i4 = i;
        }
        if ((i3 & 512) != 0) {
            int i13 = 2 % 2;
        } else {
            i5 = i2;
        }
        Function2 function22 = null;
        socketFactory socketfactory2 = (i3 & 1024) != 0 ? new socketFactory(null, null, 3, null) : socketfactory;
        if ((i3 & 2048) != 0) {
            int i14 = IAuthTabCallbackStubProxy + 87;
            access100 = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            int i15 = 2 % 2;
        } else {
            function22 = function2;
        }
        this(onnavigationevent2, onnavigationevent3, onnavigationevent4, onnavigationevent, z3, protocolsVar2, appLovinSdkSettingsIAuthTabCallback, z4, i4, i5, socketfactory2, function22);
    }
}
