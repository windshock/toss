package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import dagger.Lazy;
import im.toss.state.impl.session.SessionStateImpl$;
import im.toss.state.spec.SessionState;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.N0;
import o.findSnapView;
import o.getMediationProvider;
import o.isExceptionHandlerEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class N0 implements SessionState {
    public static final onNavigationEvent Companion;
    private static long IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static int extraCallback;
    private static char getInterfaceDescriptor;
    private final setTid<Boolean> IAuthTabCallback;
    private Long IAuthTabCallbackDefault;
    private final Lazy<Q0> IAuthTabCallbackStub;
    private final zzag access000;
    private final access27100<SessionState.State> access100;
    private final AppSetIdAndScope1 asBinder;
    private final Lazy<isWifiEnabled> asInterface;
    private final findSnapView<SessionState.State, SessionState.Event, Object> onExtraCallback;
    private long onExtraCallbackWithResult;
    private String onNavigationEvent;
    private String onTransact;
    private final getAppEnteredBackgroundTimeMillis onWarmupCompleted;
    private static final byte[] $$a = {89, 120, -98, -110};
    private static final int $$b = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static int writeTypedObject = 1;

    private static String $$c(int i, short s, short s2) {
        int i2 = i + 109;
        int i3 = (s * 3) + 4;
        byte[] bArr = $$a;
        int i4 = s2 * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = (-i2) + i3;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i2 = (-bArr[i3]) + i2;
            i3++;
            i6 = i7;
        }
    }

    static {
        extraCallback = 0;
        access000();
        Companion = new onNavigationEvent(null);
        int i = ICustomTabsCallback + 43;
        extraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 47;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStub(function1, obj);
        }
        IAuthTabCallbackStub(function1, obj);
        throw null;
    }

    public static /* synthetic */ Boolean IAuthTabCallback(N0 n0, SessionState.State state) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallback = onExtraCallback(n0, state);
        int i4 = extraCallbackWithResult + 1;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return boolOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 19;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(bool);
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallback = onExtraCallback(bool);
        int i3 = writeTypedObject + 67;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(zOnExtraCallback);
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.LoginSession loginSession, SessionState.Event.OnUserLogOut onUserLogOut) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 59;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onWarmupCompleted(1360847745, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{onextracallback, loginSession, onUserLogOut}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1360847739, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.SessionFinished sessionFinished, SessionState.Event.OnAppStart onAppStart) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 105;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(onextracallback, sessionFinished, onAppStart);
        int i4 = extraCallbackWithResult + 13;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        N0 n0 = (N0) objArr[0];
        findSnapView.IAuthTabCallback iAuthTabCallback = (findSnapView.IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(n0, iAuthTabCallback);
        int i4 = writeTypedObject + 121;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        N0 n0 = (N0) objArr[0];
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 109;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(n0, onextracallback);
        int i4 = writeTypedObject + 97;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(N0 n0, SessionState.State.LoginSession loginSession, SessionState.Event event) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(n0, loginSession, event);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(n0, loginSession, event);
        int i3 = writeTypedObject + 47;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(N0 n0, SessionState.State.SessionFinished sessionFinished, SessionState.Event event) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(n0, sessionFinished, event);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        int i5 = extraCallbackWithResult + 29;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallback(N0 n0) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 25;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(n0);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 73;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return ((Boolean) onWarmupCompleted(1393745163, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1393745160, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).booleanValue();
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(1393745163, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1393745160, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).booleanValue();
        int i3 = 96 / 0;
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(N0 n0, SessionState.State.EmptySession emptySession, SessionState.Event event) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(n0, emptySession, event);
        int i4 = writeTypedObject + 119;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(N0 n0, SessionState.State state) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(n0, state);
        int i4 = writeTypedObject + 117;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(N0 n0, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(n0, onextracallback);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.EmptySession emptySession, SessionState.Event.OnInitialize onInitialize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 13;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(onextracallback, emptySession, onInitialize);
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallback = onExtraCallback(onextracallback, emptySession, onInitialize);
        int i3 = writeTypedObject + 9;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventOnExtraCallback;
    }

    public static /* synthetic */ Boolean onNavigationEvent(SessionState.State state) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolOnExtraCallback = onExtraCallback(state);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = extraCallbackWithResult + 117;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return boolOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(N0 n0, SessionState.State.GuestSession guestSession, SessionState.Event event) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onWarmupCompleted(-1136292011, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0, guestSession, event}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1136292020, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(N0 n0, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(n0, onextracallback);
        }
        asInterface(n0, onextracallback);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 23;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Boolean bool = (Boolean) onWarmupCompleted(-478038138, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 478038145, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i4 = writeTypedObject + 113;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = (~(i7 | i8)) | (~(i5 | i3)) | (~(i | i3));
        int i10 = ~i;
        int i11 = (~(i10 | i3)) | i5;
        int i12 = (~(i3 | i5 | i)) | (~(i8 | i10));
        int i13 = i5 + i + i2 + ((-373584967) * i4) + ((-1711780345) * i6);
        int i14 = i13 * i13;
        int i15 = (i5 * 1075882953) + 1902575616 + (1075882953 * i) + ((-462509112) * i9) + (925018224 * i11) + (462509112 * i12) + (1538392064 * i2) + ((-375259136) * i4) + ((-1109524480) * i6) + (585564160 * i14);
        int i16 = ((i5 * 235012993) - 778813113) + (i * 235012993) + (i9 * (-632)) + (i11 * 1264) + (i12 * 632) + (i2 * 235013625) + (i4 * 915899377) + (i6 * (-1709701169)) + (i14 * 1974403072);
        switch (i15 + (i16 * i16 * (-848756736))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i17 = 2 % 2;
                int i18 = extraCallbackWithResult + 43;
                writeTypedObject = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(obj, "");
                boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
                int i20 = writeTypedObject + 83;
                extraCallbackWithResult = i20 % 128;
                int i21 = i20 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return asInterface(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        SessionState.State.GuestSession guestSession = (SessionState.State.GuestSession) objArr[1];
        SessionState.Event.OnAppFinish onAppFinish = (SessionState.Event.OnAppFinish) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onWarmupCompleted(-1489092512, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{onextracallback, guestSession, onAppFinish}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1489092512, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(N0 n0, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 21;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(n0, onextracallback);
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        int i5 = extraCallbackWithResult + 69;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(N0 n0, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 107;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onWarmupCompleted(1088206436, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0, onextracallbackwithresult}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1088206431, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.EmptySession emptySession, SessionState.Event.OnAppFinish onAppFinish) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 5;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(onextracallback, emptySession, onAppFinish);
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, emptySession, onAppFinish);
        int i3 = extraCallbackWithResult + 25;
        writeTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return onnavigationeventIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.GuestSession guestSession, SessionState.Event.OnUserLogIn onUserLogIn) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 13;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(onextracallback, guestSession, onUserLogIn);
        int i4 = extraCallbackWithResult + 95;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return onnavigationeventOnExtraCallbackWithResult;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.LoginSession loginSession, SessionState.Event.OnAppFinish onAppFinish) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(onextracallback, loginSession, onAppFinish);
            obj.hashCode();
            throw null;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = IAuthTabCallback(onextracallback, loginSession, onAppFinish);
        int i3 = writeTypedObject + 41;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onnavigationeventIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.SessionFinished sessionFinished, SessionState.Event.OnActivityCreate onActivityCreate) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(onextracallback, sessionFinished, onActivityCreate);
        }
        IAuthTabCallback(onextracallback, sessionFinished, onActivityCreate);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public N0(@NotNull Lazy<isWifiEnabled> lazy, @NotNull getAppEnteredBackgroundTimeMillis getappenteredbackgroundtimemillis, @NotNull Lazy<Q0> lazy2, @NotNull zzag zzagVar) {
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(getappenteredbackgroundtimemillis, "");
        Intrinsics.checkNotNullParameter(lazy2, "");
        Intrinsics.checkNotNullParameter(zzagVar, "");
        this.asInterface = lazy;
        this.onWarmupCompleted = getappenteredbackgroundtimemillis;
        this.IAuthTabCallbackStub = lazy2;
        this.access000 = zzagVar;
        this.asBinder = ea10.onExtraCallbackWithResult(N0.class.getSimpleName());
        this.onExtraCallback = findSnapView.Companion.onNavigationEvent(new Function1() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda17
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 23;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    N0.onWarmupCompleted(this.f$0, (findSnapView.onExtraCallbackWithResult) obj);
                    throw null;
                }
                Unit unitOnWarmupCompleted = N0.onWarmupCompleted(this.f$0, (findSnapView.onExtraCallbackWithResult) obj);
                int i3 = onWarmupCompleted + 105;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return unitOnWarmupCompleted;
            }
        });
        setTid<Boolean> settidIAuthTabCallbackDefault = setTid.IAuthTabCallbackDefault(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(settidIAuthTabCallbackDefault, "");
        this.IAuthTabCallback = settidIAuthTabCallbackDefault;
        this.onTransact = "";
        access27100<SessionState.State> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(asInterface());
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.access100 = access27100VarIAuthTabCallback;
        JsonReaderUnknownNumberParsing<SessionState.State> jsonReaderUnknownNumberParsingOnExtraCallbackWithResult = onExtraCallbackWithResult(true);
        final Function1 function1 = new Function1() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda18
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                Unit unitOnExtraCallbackWithResult;
                int i = 2 % 2;
                int i2 = onNavigationEvent + 45;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    unitOnExtraCallbackWithResult = N0.onExtraCallbackWithResult(this.f$0, (SessionState.State) obj);
                    int i3 = 88 / 0;
                } else {
                    unitOnExtraCallbackWithResult = N0.onExtraCallbackWithResult(this.f$0, (SessionState.State) obj);
                }
                int i4 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }
        };
        jsonReaderUnknownNumberParsingOnExtraCallbackWithResult.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda19
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final void accept(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    N0.onNavigationEvent(function1, obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                N0.onNavigationEvent(function1, obj);
                int i3 = IAuthTabCallback + 91;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 77 / 0;
                }
            }
        });
    }

    private static final void onWarmupCompleted(N0 n0) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 35;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (n0.onNavigationEvent().length() == 0) {
            int i4 = writeTypedObject + 65;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            n0.IAuthTabCallback(n0.access100());
            if (i5 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final void IAuthTabCallback(N0 n0) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        n0.onExtraCallbackWithResult("sessionFinish");
        int i4 = extraCallbackWithResult + 75;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        final N0 n0 = (N0) objArr[0];
        int i = 2 % 2;
        n0.IAuthTabCallback("");
        n0.onExtraCallback((String) null);
        isExceptionHandlerEnabled.Companion.onExtraCallbackWithResult().onWarmupCompleted(isExceptionHandlerEnabled.IAuthTabCallback.onWarmupCompleted.IAuthTabCallback);
        NetConverter3.onExtraCallback().onExtraCallback(new Runnable() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda13
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 37;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                N0.onExtraCallback(this.f$0);
                int i5 = onExtraCallbackWithResult + 69;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        n0.onWarmupCompleted.IAuthTabCallback(new r8lambdaEK35TGWCjvE5YDlTcJsm53divws(null, null, null, 7, null));
        int i2 = extraCallbackWithResult + 77;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.LoginSession loginSession, SessionState.Event.OnAppFinish onAppFinish) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loginSession, "");
        Intrinsics.checkNotNullParameter(onAppFinish, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, loginSession, SessionState.State.SessionFinished.onExtraCallbackWithResult, (Object) null, 2, (Object) null);
        int i4 = writeTypedObject + 113;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        SessionState.State.EmptySession emptySession;
        Object obj;
        int i;
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        SessionState.State.LoginSession loginSession = (SessionState.State.LoginSession) objArr[1];
        SessionState.Event.OnUserLogOut onUserLogOut = (SessionState.Event.OnUserLogOut) objArr[2];
        int i2 = 2 % 2;
        int i3 = writeTypedObject + 53;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(loginSession, "");
            Intrinsics.checkNotNullParameter(onUserLogOut, "");
            emptySession = SessionState.State.EmptySession.onExtraCallback;
            obj = null;
            i = 4;
        } else {
            Intrinsics.checkNotNullParameter(loginSession, "");
            Intrinsics.checkNotNullParameter(onUserLogOut, "");
            emptySession = SessionState.State.EmptySession.onExtraCallback;
            obj = null;
            i = 2;
        }
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, loginSession, emptySession, obj, i, (Object) null);
    }

    private static final Unit onExtraCallbackWithResult(N0 n0, SessionState.State.LoginSession loginSession, SessionState.Event event) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loginSession, "");
        Intrinsics.checkNotNullParameter(event, "");
        onWarmupCompleted(n0);
        n0.access100.onWarmupCompleted(loginSession);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 115;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(final N0 n0, final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda22
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 13;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = N0.onWarmupCompleted(onextracallback, (SessionState.State.LoginSession) obj, (SessionState.Event.OnAppFinish) obj2);
                int i5 = onNavigationEvent + 37;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnWarmupCompleted;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(SessionState.Event.OnAppFinish.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(SessionState.Event.OnUserLogOut.class), new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda23
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 123;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = N0.IAuthTabCallback(onextracallback, (SessionState.State.LoginSession) obj, (SessionState.Event.OnUserLogOut) obj2);
                int i5 = onWarmupCompleted + 101;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventIAuthTabCallback;
            }
        });
        onextracallback.onNavigationEvent(new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda24
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 41;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = N0.onExtraCallback(this.f$0, (SessionState.State.LoginSession) obj, (SessionState.Event) obj2);
                int i5 = IAuthTabCallback + 85;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedObject + 31;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.EmptySession emptySession, SessionState.Event.OnInitialize onInitialize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(emptySession, "");
            Intrinsics.checkNotNullParameter(onInitialize, "");
            return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, emptySession, SessionState.State.GuestSession.onWarmupCompleted, (Object) null, 3, (Object) null);
        }
        Intrinsics.checkNotNullParameter(emptySession, "");
        Intrinsics.checkNotNullParameter(onInitialize, "");
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, emptySession, SessionState.State.GuestSession.onWarmupCompleted, (Object) null, 2, (Object) null);
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.EmptySession emptySession, SessionState.Event.OnAppFinish onAppFinish) {
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 23;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(emptySession, "");
            Intrinsics.checkNotNullParameter(onAppFinish, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, emptySession, SessionState.State.SessionFinished.onExtraCallbackWithResult, (Object) null, 5, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(emptySession, "");
            Intrinsics.checkNotNullParameter(onAppFinish, "");
            onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, emptySession, SessionState.State.SessionFinished.onExtraCallbackWithResult, (Object) null, 2, (Object) null);
        }
        int i3 = extraCallbackWithResult + 97;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return onnavigationeventOnWarmupCompleted;
    }

    private static final Unit onWarmupCompleted(N0 n0, SessionState.State.EmptySession emptySession, SessionState.Event event) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 21;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(emptySession, "");
            Intrinsics.checkNotNullParameter(event, "");
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            onWarmupCompleted(-474185541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 474185551, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            n0.access100.onWarmupCompleted(emptySession);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(emptySession, "");
        Intrinsics.checkNotNullParameter(event, "");
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-474185541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0}, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 474185551, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        n0.access100.onWarmupCompleted(emptySession);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(final N0 n0, final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 43;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    N0.onExtraCallbackWithResult(onextracallback, (SessionState.State.EmptySession) obj, (SessionState.Event.OnInitialize) obj2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = N0.onExtraCallbackWithResult(onextracallback, (SessionState.State.EmptySession) obj, (SessionState.Event.OnInitialize) obj2);
                int i4 = onExtraCallbackWithResult + 23;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationeventOnExtraCallbackWithResult;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(SessionState.Event.OnInitialize.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(SessionState.Event.OnAppFinish.class), new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 7;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = N0.onWarmupCompleted(onextracallback, (SessionState.State.EmptySession) obj, (SessionState.Event.OnAppFinish) obj2);
                int i5 = IAuthTabCallback + 31;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnWarmupCompleted;
            }
        });
        onextracallback.onNavigationEvent(new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 19;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = N0.onExtraCallbackWithResult(this.f$0, (SessionState.State.EmptySession) obj, (SessionState.Event) obj2);
                int i5 = onWarmupCompleted + 117;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallbackWithResult + 23;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallbackWithResult(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.GuestSession guestSession, SessionState.Event.OnUserLogIn onUserLogIn) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 51;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(guestSession, "");
        Intrinsics.checkNotNullParameter(onUserLogIn, "");
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, guestSession, SessionState.State.LoginSession.onExtraCallbackWithResult, (Object) null, 2, (Object) null);
        int i4 = extraCallbackWithResult + 5;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return onnavigationeventOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        SessionState.State.SessionFinished sessionFinished;
        Object obj;
        int i;
        findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) objArr[0];
        SessionState.State.GuestSession guestSession = (SessionState.State.GuestSession) objArr[1];
        SessionState.Event.OnAppFinish onAppFinish = (SessionState.Event.OnAppFinish) objArr[2];
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 79;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(guestSession, "");
            Intrinsics.checkNotNullParameter(onAppFinish, "");
            sessionFinished = SessionState.State.SessionFinished.onExtraCallbackWithResult;
            obj = null;
            i = 4;
        } else {
            Intrinsics.checkNotNullParameter(guestSession, "");
            Intrinsics.checkNotNullParameter(onAppFinish, "");
            sessionFinished = SessionState.State.SessionFinished.onExtraCallbackWithResult;
            obj = null;
            i = 2;
        }
        findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, guestSession, sessionFinished, obj, i, (Object) null);
        int i4 = writeTypedObject + 33;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return onnavigationeventOnWarmupCompleted;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        N0 n0 = (N0) objArr[0];
        SessionState.State.GuestSession guestSession = (SessionState.State.GuestSession) objArr[1];
        SessionState.Event event = (SessionState.Event) objArr[2];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 111;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(guestSession, "");
        Intrinsics.checkNotNullParameter(event, "");
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-474185541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 474185551, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        n0.access100.onWarmupCompleted(guestSession);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 101;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(final N0 n0, final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda10
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 117;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = N0.onWarmupCompleted(onextracallback, (SessionState.State.GuestSession) obj, (SessionState.Event.OnUserLogIn) obj2);
                int i5 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return onnavigationeventOnWarmupCompleted;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(SessionState.Event.OnUserLogIn.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(SessionState.Event.OnAppFinish.class), new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda11
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 109;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {onextracallback, (SessionState.State.GuestSession) obj, (SessionState.Event.OnAppFinish) obj2};
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                if (i4 == 0) {
                    return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) N0.onWarmupCompleted(-1504968883, iOnExtraCallback2, objArr, iOnExtraCallback, iOnExtraCallback3, 1504968885, iOnExtraCallback4);
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        });
        onextracallback.onNavigationEvent(new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda12
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = N0.onNavigationEvent(this.f$0, (SessionState.State.GuestSession) obj, (SessionState.Event) obj2);
                int i5 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedObject + 93;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if ((r9 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r9 = 59 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        return o.findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(r8, r9, im.toss.state.spec.SessionState.State.LoginSession.onExtraCallbackWithResult, (java.lang.Object) null, 2, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (o.setSegmentCollection.Companion.onWarmupCompleted().onExtraCallbackWithResult() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (o.setSegmentCollection.Companion.onWarmupCompleted().onExtraCallbackWithResult() != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r8 = o.findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(r8, r9, im.toss.state.spec.SessionState.State.EmptySession.onExtraCallback, (java.lang.Object) null, 2, (java.lang.Object) null);
        r9 = o.N0.extraCallbackWithResult + 123;
        o.N0.writeTypedObject = r9 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onExtraCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.SessionFinished sessionFinished, SessionState.Event.OnAppStart onAppStart) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 43;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sessionFinished, "");
            Intrinsics.checkNotNullParameter(onAppStart, "");
            int i3 = 53 / 0;
        } else {
            Intrinsics.checkNotNullParameter(sessionFinished, "");
            Intrinsics.checkNotNullParameter(onAppStart, "");
        }
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.SessionFinished sessionFinished, SessionState.Event.OnActivityCreate onActivityCreate) {
        SessionState.State.LoginSession loginSession;
        Object obj;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionFinished, "");
        Intrinsics.checkNotNullParameter(onActivityCreate, "");
        if (!setSegmentCollection.Companion.onWarmupCompleted().onExtraCallbackWithResult()) {
            findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, sessionFinished, SessionState.State.EmptySession.onExtraCallback, (Object) null, 2, (Object) null);
            int i3 = extraCallbackWithResult + 33;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                return onnavigationeventOnWarmupCompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = writeTypedObject + 75;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            loginSession = SessionState.State.LoginSession.onExtraCallbackWithResult;
            obj = null;
            i = 3;
        } else {
            loginSession = SessionState.State.LoginSession.onExtraCallbackWithResult;
            obj = null;
            i = 2;
        }
        return findSnapView.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted(onextracallback, sessionFinished, loginSession, obj, i, (Object) null);
    }

    private static final Unit IAuthTabCallback(N0 n0, SessionState.State.SessionFinished sessionFinished, SessionState.Event event) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sessionFinished, "");
            Intrinsics.checkNotNullParameter(event, "");
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            onWarmupCompleted(-474185541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 474185551, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
            n0.access100.onWarmupCompleted(sessionFinished);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sessionFinished, "");
        Intrinsics.checkNotNullParameter(event, "");
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-474185541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0}, iOnExtraCallback2, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 474185551, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        n0.access100.onWarmupCompleted(sessionFinished);
        Unit unit2 = Unit.INSTANCE;
        int i3 = extraCallbackWithResult + 63;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit asInterface(final N0 n0, final findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Function2 function2 = new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 47;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    N0.IAuthTabCallback(onextracallback, (SessionState.State.SessionFinished) obj, (SessionState.Event.OnAppStart) obj2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventIAuthTabCallback = N0.IAuthTabCallback(onextracallback, (SessionState.State.SessionFinished) obj, (SessionState.Event.OnAppStart) obj2);
                int i4 = IAuthTabCallback + 79;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return onnavigationeventIAuthTabCallback;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(SessionState.Event.OnAppStart.class), function2);
        onextracallback.onWarmupCompleted(onnavigationevent.onWarmupCompleted(SessionState.Event.OnActivityCreate.class), new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda15
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 87;
                IAuthTabCallback = i3 % 128;
                Object obj3 = null;
                if (i3 % 2 != 0) {
                    N0.onWarmupCompleted(onextracallback, (SessionState.State.SessionFinished) obj, (SessionState.Event.OnActivityCreate) obj2);
                    obj3.hashCode();
                    throw null;
                }
                findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onnavigationeventOnWarmupCompleted = N0.onWarmupCompleted(onextracallback, (SessionState.State.SessionFinished) obj, (SessionState.Event.OnActivityCreate) obj2);
                int i4 = onWarmupCompleted + 35;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return onnavigationeventOnWarmupCompleted;
                }
                throw null;
            }
        });
        onextracallback.onNavigationEvent(new Function2() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda16
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 91;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = N0.onExtraCallback(this.f$0, (SessionState.State.SessionFinished) obj, (SessionState.Event) obj2);
                int i5 = onExtraCallbackWithResult + 93;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 48 / 0;
                }
                return unitOnExtraCallback;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallbackWithResult + 111;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(N0 n0, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 87;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (!(iAuthTabCallback instanceof findSnapView.IAuthTabCallback.onExtraCallback)) {
            AppSetIdAndScope1 appSetIdAndScope1 = n0.asBinder;
            Objects.toString(iAuthTabCallback);
            return Unit.INSTANCE;
        }
        AppSetIdAndScope1 appSetIdAndScope12 = n0.asBinder;
        Objects.toString(iAuthTabCallback);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 47;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final N0 n0 = (N0) objArr[0];
        findSnapView.onExtraCallbackWithResult onextracallbackwithresult = (findSnapView.onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onextracallbackwithresult.onNavigationEvent(SessionState.State.SessionFinished.onExtraCallbackWithResult);
        Function1 function1 = new Function1() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 117;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                N0 n02 = this.f$0;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i4 != 0) {
                    return N0.onExtraCallbackWithResult(n02, onextracallback);
                }
                N0.onExtraCallbackWithResult(n02, onextracallback);
                throw null;
            }
        };
        findSnapView.onWarmupCompleted.onNavigationEvent onnavigationevent = findSnapView.onWarmupCompleted.Companion;
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(SessionState.State.LoginSession.class), function1);
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(SessionState.State.EmptySession.class), new Function1() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda4
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = {this.f$0, (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj};
                int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
                if (i4 != 0) {
                    return (Unit) N0.onWarmupCompleted(400245, iOnExtraCallback2, objArr2, iOnExtraCallback, iOnExtraCallback3, -400241, iOnExtraCallback4);
                }
                throw null;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(SessionState.State.GuestSession.class), new Function1() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = N0.onWarmupCompleted(this.f$0, (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj);
                int i5 = IAuthTabCallback + 43;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        });
        onextracallbackwithresult.onExtraCallbackWithResult(onnavigationevent.onWarmupCompleted(SessionState.State.SessionFinished.class), new Function1() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 9;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                N0 n02 = this.f$0;
                findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback = (findSnapView.onExtraCallbackWithResult.onExtraCallback) obj;
                if (i4 != 0) {
                    return N0.onNavigationEvent(n02, onextracallback);
                }
                Unit unitOnNavigationEvent = N0.onNavigationEvent(n02, onextracallback);
                int i5 = 31 / 0;
                return unitOnNavigationEvent;
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function1() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 103;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unit = (Unit) N0.onWarmupCompleted(973371623, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this.f$0, (findSnapView.IAuthTabCallback) obj}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -973371615, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
                int i4 = IAuthTabCallback + 37;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = extraCallbackWithResult + 9;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    @Override // im.toss.state.spec.SessionState
    public getByteBuffer<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getByteBuffer<Boolean> getbytebufferOnExtraCallbackWithResult = this.IAuthTabCallback.asBinder().onExtraCallbackWithResult(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnExtraCallbackWithResult, "");
        int i4 = writeTypedObject + 109;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return getbytebufferOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 117;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i3, i3) + 1);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 44;
                    int defaultSize = View.getDefaultSize(i3, i3) + 1451;
                    byte b = (byte) ($$b & 3);
                    byte b2 = (byte) (b - 1);
                    String str$$c = $$c(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, iIndexOf, defaultSize, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) i3;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49123), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)) + 1494, 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - TextUtils.lastIndexOf("", '0')), 50 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 45848), 29 - Color.red(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackStubProxy ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback_Parcel ^ 7798559133331975163L))) ^ ((char) (getInterfaceDescriptor ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 91;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    @Override // im.toss.state.spec.SessionState
    public boolean onTransact() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 103;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ((Q0) this.IAuthTabCallbackStub.get()).onExtraCallback();
        if (!IAuthTabCallbackDefault()) {
            int i4 = extraCallbackWithResult + 85;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            if (!((isWifiEnabled) this.asInterface.get()).onWarmupCompleted()) {
                int i6 = writeTypedObject + 25;
                extraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        return true;
    }

    @Override // im.toss.state.spec.SessionState
    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 89;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        String str = this.onTransact;
        int i5 = i3 + 63;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private void IAuthTabCallback(String str) {
        Long lValueOf;
        int i = 2 % 2;
        this.onTransact = str;
        if (str.length() > 0) {
            int i2 = extraCallbackWithResult + 93;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            lValueOf = Long.valueOf(this.access000.onExtraCallbackWithResult());
        } else {
            lValueOf = null;
        }
        this.IAuthTabCallbackDefault = lValueOf;
        int i4 = writeTypedObject + 61;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    @Override // im.toss.state.spec.SessionState
    public Long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.state.spec.SessionState
    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 21;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.onNavigationEvent;
        int i4 = i2 + 109;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override // im.toss.state.spec.SessionState
    public void onExtraCallback(@Nullable String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str == null || str.length() <= 0) {
            str = null;
        }
        this.onNavigationEvent = str;
        int i3 = writeTypedObject + 105;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // im.toss.state.spec.SessionState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            this.onExtraCallbackWithResult = this.access000.IAuthTabCallbackDefault();
            int i3 = 5 / 0;
            if (onTransact()) {
                int i4 = extraCallbackWithResult + 75;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                if (!((isWifiEnabled) this.asInterface.get()).onWarmupCompleted()) {
                    return;
                }
            }
        } else {
            this.onExtraCallbackWithResult = this.access000.IAuthTabCallbackDefault();
            if (onTransact()) {
            }
        }
        ((isWifiEnabled) this.asInterface.get()).IAuthTabCallbackStub();
        getMediationProvider.Companion.onNavigationEvent().onExtraCallback(getMediationProvider.onNavigationEvent.onExtraCallbackWithResult.onExtraCallback);
        this.IAuthTabCallback.onExtraCallback(Boolean.TRUE);
        int i6 = extraCallbackWithResult + 49;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // im.toss.state.spec.SessionState
    public void onExtraCallbackWithResult(@Nullable Object obj) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 58460), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{10895, 21934, 32279, 21833, 21512, 26048}, new char[]{0, 0, 0, 0}, new char[]{14824, 46088, 23798, 23780}, objArr);
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "SessionState", "setUnauthorized", access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), obj)), (String) null, false, (String) null, 56, (Object) null);
        Objects.toString(obj);
        getMediationProvider.Companion.onNavigationEvent().onExtraCallback(getMediationProvider.onNavigationEvent.IAuthTabCallback.onNavigationEvent);
        this.IAuthTabCallback.onExtraCallback(Boolean.FALSE);
        int i2 = extraCallbackWithResult + 55;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.state.spec.SessionState
    public SessionState.State asInterface() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SessionState.State state = (SessionState.State) this.onExtraCallback.onWarmupCompleted();
        int i4 = writeTypedObject + 15;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return state;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.state.spec.SessionState
    public boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean z = !Intrinsics.areEqual(asInterface(), SessionState.State.SessionFinished.onExtraCallbackWithResult);
        int i4 = writeTypedObject + 5;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // im.toss.state.spec.SessionState
    public findSnapView.IAuthTabCallback<SessionState.State, SessionState.Event, Object> onWarmupCompleted(@NotNull SessionState.Event event) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 117;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(event, "");
            this.onExtraCallback.onExtraCallback(event);
            throw null;
        }
        Intrinsics.checkNotNullParameter(event, "");
        findSnapView.IAuthTabCallback<SessionState.State, SessionState.Event, Object> iAuthTabCallbackOnExtraCallback = this.onExtraCallback.onExtraCallback(event);
        int i3 = writeTypedObject + 75;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return iAuthTabCallbackOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private final String access100() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullExpressionValue(UUID.randomUUID().toString(), "");
            throw null;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // im.toss.state.spec.SessionState
    public JsonReaderUnknownNumberParsing<SessionState.State> onExtraCallbackWithResult(boolean z) {
        long j;
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAccess000 = this.access100.IAuthTabCallbackDefault().access000();
        if (!(!z)) {
            int i2 = extraCallbackWithResult + 117;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            j = 0;
        } else {
            j = 1;
        }
        JsonReaderUnknownNumberParsing<SessionState.State> jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingAccess000.onNavigationEvent(j);
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnNavigationEvent, "");
        int i4 = writeTypedObject + 59;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return jsonReaderUnknownNumberParsingOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Boolean bool = (Boolean) function1.invoke(obj);
        int i4 = extraCallbackWithResult + 13;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Boolean onExtraCallback(SessionState.State state) {
        SessionState.State.SessionFinished sessionFinished;
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(state, "");
            sessionFinished = SessionState.State.SessionFinished.onExtraCallbackWithResult;
        } else {
            Intrinsics.checkNotNullParameter(state, "");
            sessionFinished = SessionState.State.SessionFinished.onExtraCallbackWithResult;
        }
        return Boolean.valueOf(!Intrinsics.areEqual(state, sessionFinished));
    }

    @Override // im.toss.state.spec.SessionState
    public JsonReaderUnknownNumberParsing<Boolean> asBinder() {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing<SessionState.State> jsonReaderUnknownNumberParsingOnExtraCallbackWithResult = onExtraCallbackWithResult(true);
        final Function1 function1 = new Function1() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda8
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 57;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolOnNavigationEvent = N0.onNavigationEvent((SessionState.State) obj);
                int i5 = onNavigationEvent + 85;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return boolOnNavigationEvent;
            }
        };
        JsonReaderUnknownNumberParsing<Boolean> jsonReaderUnknownNumberParsingAsInterface = jsonReaderUnknownNumberParsingOnExtraCallbackWithResult.onNavigationEvent(new deserializeIntNullableCollection() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 59;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolOnWarmupCompleted = N0.onWarmupCompleted(function1, obj);
                int i5 = IAuthTabCallback + 123;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    return boolOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }).asInterface();
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingAsInterface, "");
        int i2 = extraCallbackWithResult + 109;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return jsonReaderUnknownNumberParsingAsInterface;
    }

    private static final Boolean IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 83;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Boolean) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    @Override // im.toss.state.spec.SessionState
    public JsonReaderUnknownNumberParsing<Boolean> getInterfaceDescriptor() {
        int i = 2 % 2;
        JsonReaderUnknownNumberParsing<SessionState.State> jsonReaderUnknownNumberParsingOnExtraCallbackWithResult = onExtraCallbackWithResult(true);
        final Function1 function1 = new Function1() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda20
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 111;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolIAuthTabCallback = N0.IAuthTabCallback(this.f$0, (SessionState.State) obj);
                int i5 = IAuthTabCallback + 71;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return boolIAuthTabCallback;
                }
                throw null;
            }
        };
        JsonReaderUnknownNumberParsing<Boolean> jsonReaderUnknownNumberParsingAsInterface = jsonReaderUnknownNumberParsingOnExtraCallbackWithResult.onNavigationEvent(new deserializeIntNullableCollection() { // from class: im.toss.state.impl.session.SessionStateImpl$$ExternalSyntheticLambda21
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object apply(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolIAuthTabCallback = N0.IAuthTabCallback(function1, obj);
                int i5 = onWarmupCompleted + 11;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return boolIAuthTabCallback;
            }
        }).asInterface();
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingAsInterface, "");
        int i2 = writeTypedObject + 79;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 83 / 0;
        }
        return jsonReaderUnknownNumberParsingAsInterface;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Boolean onExtraCallback(N0 n0, SessionState.State state) throws NoWhenBranchMatchedException {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(state, "");
        SessionState.State stateAsInterface = n0.asInterface();
        if (Intrinsics.areEqual(stateAsInterface, SessionState.State.GuestSession.onWarmupCompleted) || Intrinsics.areEqual(stateAsInterface, SessionState.State.LoginSession.onExtraCallbackWithResult)) {
            z = true;
        } else {
            int i2 = extraCallbackWithResult + 21;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            if (!Intrinsics.areEqual(stateAsInterface, SessionState.State.EmptySession.onExtraCallback)) {
                int i4 = extraCallbackWithResult + 11;
                writeTypedObject = i4 % 128;
                int i5 = i4 % 2;
                if (!Intrinsics.areEqual(stateAsInterface, SessionState.State.SessionFinished.onExtraCallbackWithResult)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // im.toss.state.spec.SessionState
    public boolean IAuthTabCallbackDefault() {
        boolean z;
        synchronized (this.IAuthTabCallback) {
            boolean z2 = this.IAuthTabCallback.ICustomTabsCallback() && Intrinsics.areEqual(this.IAuthTabCallback.onWarmupCompleted(), Boolean.TRUE);
            boolean z3 = commonTestFlag.onExtraCallback.onWarmupCompleted(new Date(this.onExtraCallbackWithResult), new Date(this.access000.IAuthTabCallbackDefault()), TimeUnit.SECONDS) <= 3600;
            if (z2) {
                this.onExtraCallbackWithResult = this.access000.IAuthTabCallbackDefault();
            }
            z = z2 && z3;
        }
        return z;
    }

    private static final boolean onExtraCallback(Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 41;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        boolean zBooleanValue = bool.booleanValue();
        int i4 = extraCallbackWithResult + 35;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.state.spec.SessionState
    public Object onNavigationEvent(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        if (!onTransact()) {
            getByteBuffer getbytebufferOnWarmupCompleted = IAuthTabCallback().onWarmupCompleted(new SessionStateImpl$.ExternalSyntheticLambda26(new SessionStateImpl$.ExternalSyntheticLambda25()));
            Intrinsics.checkNotNullExpressionValue(getbytebufferOnWarmupCompleted, "");
            Object objOnWarmupCompleted = RxAwaitKt.onWarmupCompleted(getbytebufferOnWarmupCompleted, access13800Var);
            if (objOnWarmupCompleted != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = writeTypedObject + 117;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return objOnWarmupCompleted;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 31;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return unit;
    }

    @Override // im.toss.state.spec.SessionState
    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(SessionState.Event.OnAppFinish.onExtraCallback);
        int i4 = writeTypedObject + 119;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 33;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(N0 n0, SessionState.State state) {
        int i = 2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = n0.asBinder;
        Objects.toString(state);
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SessionState", "state: " + state, (Map) null, (String) null, false, (String) null, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedObject + 87;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(N0 n0, findSnapView.IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(973371623, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0, iAuthTabCallback}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -973371615, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onWarmupCompleted(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.GuestSession guestSession, SessionState.Event.OnAppFinish onAppFinish) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onWarmupCompleted(-1504968883, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{onextracallback, guestSession, onAppFinish}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1504968885, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(N0 n0, findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(400245, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0, onextracallback}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -400241, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ boolean IAuthTabCallback(Boolean bool) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return ((Boolean) onWarmupCompleted(-265563742, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{bool}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 265563743, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).booleanValue();
    }

    private static final boolean asInterface(Function1 function1, Object obj) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return ((Boolean) onWarmupCompleted(1393745163, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1393745160, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback())).booleanValue();
    }

    private static final Unit IAuthTabCallback(N0 n0, findSnapView.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(1088206436, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0, onextracallbackwithresult}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1088206431, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent onNavigationEvent(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.LoginSession loginSession, SessionState.Event.OnUserLogOut onUserLogOut) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onWarmupCompleted(1360847745, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{onextracallback, loginSession, onUserLogOut}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1360847739, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent IAuthTabCallback(findSnapView.onExtraCallbackWithResult.onExtraCallback onextracallback, SessionState.State.GuestSession guestSession, SessionState.Event.OnAppFinish onAppFinish) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (findSnapView.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent) onWarmupCompleted(-1489092512, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{onextracallback, guestSession, onAppFinish}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1489092512, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onExtraCallback(N0 n0, SessionState.State.GuestSession guestSession, SessionState.Event event) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onWarmupCompleted(-1136292011, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0, guestSession, event}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1136292020, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final void onExtraCallbackWithResult(N0 n0) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onWarmupCompleted(-474185541, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{n0}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 474185551, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Boolean asBinder(Function1 function1, Object obj) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Boolean) onWarmupCompleted(-478038138, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), new Object[]{function1, obj}, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 478038145, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    static void access000() {
        IAuthTabCallbackStubProxy = 7798559133331975163L;
        IAuthTabCallback_Parcel = -1776194565;
        getInterfaceDescriptor = (char) 24705;
    }
}
