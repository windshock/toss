package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleEventObserver;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.gson.JsonObject;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tbruyelle.rxpermissions2.RxPermissions;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.extensions.RxPermissionsKt;
import im.toss.splittarget.spec.fsm.AppState;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.text.StringsKt;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.setStartDate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setStartDate implements ALCFaceResult {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallbackWithResult Companion;
    private static final String IAuthTabCallback;
    private static char[] IAuthTabCallbackStubProxy = null;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static long access000 = 0;
    private static int extraCallback = 0;
    private static int getInterfaceDescriptor = 0;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback;
    private static deserializeUriNullableCollection onExtraCallbackWithResult = null;
    public static final int onNavigationEvent;
    private static int readTypedObject = 1;
    private Dialog IAuthTabCallbackDefault;
    private final onWarmupCompleted IAuthTabCallbackStub;
    private final onExtraCallback access100;
    private final ReadWriteProperty asBinder;
    private FusedLocationProviderClient asInterface;
    private LocationRequest onTransact;
    private Float onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;

        static {
            int[] iArr = new int[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.values().length];
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IAuthTabCallback = iArr;
        }
    }

    static {
        IAuthTabCallback();
        Object[] objArr = new Object[1];
        a(new char[]{24022, 65310, 6148, 46351, 54835, 29499, 35883, 10496, 19035, 59206, 'L', 23924, 65137, 7020, 46192, 53654, 29337, 36751, 10384, 17842, 59044, 929, 23760, 63954, 6876}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41718, objArr);
        IAuthTabCallback = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{24042, 33354, 58019, 49934, 9086, 960, 24635, 16541}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 57251, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b((byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10), ((Process.getThreadPriority(0) + 20) >> 6) + 40, new char[]{'%', 11, '+', ',', ' ', 15, '#', '-', 1, 28, 28, ')', '$', '/', ')', 31, 29, '(', 28, 1, '(', 19, '+', 30, 17, '\'', 0, 7, 30, 28, '\b', '/', ' ', 15, '#', '-', 1, 28, 29, 20}, objArr3);
        onExtraCallback = new addAllCommandLine[]{new MutablePropertyReference1Impl<>(setStartDate.class, strIntern, ((String) objArr3[0]).intern(), 0)};
        Companion = new onExtraCallbackWithResult(null);
        onNavigationEvent = 8;
        int i = readTypedObject + 13;
        extraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(fragmentActivity, dialogInterface);
        int i4 = getInterfaceDescriptor + 23;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setStartDate setstartdate, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setstartdate, dialogInterface);
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        int i5 = ICustomTabsCallback + 45;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(settopguidebackgroundcolor, th);
        int i4 = ICustomTabsCallback + 75;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(settopguidebackgroundcolor, pair);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 65;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess000 = access000(function1, obj);
        int i4 = getInterfaceDescriptor + 15;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zAccess000;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 71;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
            onNavigationEvent(2125010851, -2125010841, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{function1, obj}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
            return;
        }
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        onNavigationEvent(2125010851, -2125010841, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent2, new Object[]{function1, obj}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        asInterface(function1, obj);
        int i4 = ICustomTabsCallback + 95;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(2082068729, -2082068724, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{fragmentActivity, dialogInterface}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
        int i4 = getInterfaceDescriptor + 11;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, FragmentActivity fragmentActivity, WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(str, fragmentActivity, webViewContentOwner, settopguidebackgroundcolor, commonModule_setLeftEdgeTouchEnabled);
        }
        onWarmupCompleted(str, fragmentActivity, webViewContentOwner, settopguidebackgroundcolor, commonModule_setLeftEdgeTouchEnabled);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(setStartDate setstartdate, WebViewContentOwner webViewContentOwner, JsonObject jsonObject, setTopGuideBackgroundColor settopguidebackgroundcolor, String str, FragmentActivity fragmentActivity, shouldBeKeptAsChild shouldbekeptaschild) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(setstartdate, webViewContentOwner, jsonObject, settopguidebackgroundcolor, str, fragmentActivity, shouldbekeptaschild);
        int i4 = ICustomTabsCallback + 97;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 25;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        int i4 = ICustomTabsCallback + 35;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(setStartDate setstartdate, FragmentActivity fragmentActivity, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(setstartdate, fragmentActivity, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        int i5 = getInterfaceDescriptor + 115;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallback(setStartDate setstartdate, Function0 function0, WebViewContentOwner webViewContentOwner, Exception exc) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(setstartdate, function0, webViewContentOwner, exc);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
    }

    public static /* synthetic */ boolean onExtraCallback(setStartDate setstartdate, FragmentActivity fragmentActivity, String str, Pair pair) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(setstartdate, fragmentActivity, str, pair);
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        int i5 = getInterfaceDescriptor + 121;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return zOnNavigationEvent;
    }

    public static /* synthetic */ Pair onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 71;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStubProxy(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Pair pairIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1, obj);
        int i3 = getInterfaceDescriptor + 83;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return pairIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Pair onExtraCallbackWithResult(setStartDate setstartdate, Long l) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnNavigationEvent = onNavigationEvent(setstartdate, l);
        int i4 = getInterfaceDescriptor + 21;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return pairOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(-1819015262, 1819015274, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{dialogInterface}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
        int i4 = ICustomTabsCallback + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 43;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(settopguidebackgroundcolor);
        int i4 = ICustomTabsCallback + 23;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(-93972550, 93972559, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{settopguidebackgroundcolor, th}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
        int i4 = ICustomTabsCallback + 67;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = (~i4) | i7;
        int i9 = ~i8;
        int i10 = (~(i7 | i)) | i9;
        int i11 = (~(i7 | (~i) | i4)) | (~(i8 | i)) | (~(i2 | i | i4));
        int i12 = (~(i4 | i2)) | i | i9;
        int i13 = i2 + i + i3 + (5090439 * i6) + ((-1076018391) * i5);
        int i14 = i13 * i13;
        int i15 = ((1425068070 * i2) - 1475346432) + (1088368604 * i) + (i10 * (-168349733)) + ((-168349733) * i11) + (168349733 * i12) + (1256718336 * i3) + (1616379904 * i6) + ((-1222115328) * i5) + (1028194304 * i14);
        int i16 = (i2 * (-1092730454)) + 799718796 + (i * (-1092731068)) + (i10 * (-307)) + (i11 * (-307)) + (i12 * 307) + (i3 * (-1092730761)) + (i6 * 1582232257) + (i5 * 741505039) + (i14 * (-1125187584));
        switch (i15 + (i16 * i16 * (-410583040))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                FragmentActivity fragmentActivity = (FragmentActivity) objArr[0];
                DialogInterface dialogInterface = (DialogInterface) objArr[1];
                int i17 = 2 % 2;
                Intrinsics.checkNotNullParameter(dialogInterface, "");
                Object[] objArr2 = new Object[1];
                b((byte) (106 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 49, new char[]{')', 31, 29, '(', 28, 1, '\"', '!', 2, '\r', 13912, 13912, 6, 28, ')', 4, '!', ' ', 13876, 13876, ',', '0', '-', '\"', '\f', '+', 6, '(', '&', 2, 27, 22, 22, '/', 6, 19, 5, 23, '$', '\r', '&', 23, 22, '\f', '\f', '+', '$', 27, 13875}, objArr2);
                Intent intentAddFlags = new Intent(((String) objArr2[0]).intern()).addFlags(268435456);
                Intrinsics.checkNotNullExpressionValue(intentAddFlags, "");
                fragmentActivity.startActivity(intentAddFlags);
                dialogInterface.dismiss();
                Unit unit = Unit.INSTANCE;
                int i18 = ICustomTabsCallback + 77;
                getInterfaceDescriptor = i18 % 128;
                int i19 = i18 % 2;
                return unit;
            case 6:
                return onWarmupCompleted(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackDefault(objArr);
            case 10:
                return IAuthTabCallbackStub(objArr);
            case 11:
                FragmentActivity fragmentActivity2 = (FragmentActivity) objArr[0];
                WebViewContentOwner webViewContentOwner = (WebViewContentOwner) objArr[1];
                DialogInterface dialogInterface2 = (DialogInterface) objArr[2];
                int i20 = 2 % 2;
                int i21 = getInterfaceDescriptor + 119;
                ICustomTabsCallback = i21 % 128;
                int i22 = i21 % 2;
                Unit unitIAuthTabCallback = IAuthTabCallback(fragmentActivity2, webViewContentOwner, dialogInterface2);
                int i23 = ICustomTabsCallback + 55;
                getInterfaceDescriptor = i23 % 128;
                int i24 = i23 % 2;
                return unitIAuthTabCallback;
            case 12:
                return asBinder(objArr);
            default:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i25 = 2 % 2;
                int i26 = ICustomTabsCallback + 51;
                getInterfaceDescriptor = i26 % 128;
                int i27 = i26 % 2;
                onNavigationEvent(-1508495209, 1508495211, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{function1, obj}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
                int i28 = getInterfaceDescriptor + 103;
                ICustomTabsCallback = i28 % 128;
                int i29 = i28 % 2;
                return null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        setStartDate setstartdate = (setStartDate) objArr[0];
        Location location = (Location) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 45;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(setstartdate, location);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(setstartdate, location);
        int i3 = ICustomTabsCallback + 117;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ boolean onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = access100(function1, obj);
        int i4 = ICustomTabsCallback + 91;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return zAccess100;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[0];
        TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 = (TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0) objArr[1];
        setStartDate setstartdate = (setStartDate) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallbackWithResult(fragmentActivity, textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0, setstartdate);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 123;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, FragmentActivity fragmentActivity, setStartDate setstartdate, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, fragmentActivity, setstartdate, commonModule_setLeftEdgeTouchEnabled);
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        int i5 = ICustomTabsCallback + 57;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(settopguidebackgroundcolor, dialogInterface);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(settopguidebackgroundcolor, dialogInterface);
        int i3 = getInterfaceDescriptor + 51;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 74 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ boolean onWarmupCompleted(Pair pair) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 77;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(pair);
        int i4 = ICustomTabsCallback + 41;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return zIAuthTabCallback;
        }
        throw null;
    }

    public boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 63;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static final class IAuthTabCallback extends ObservableProperty<Location> {
        public IAuthTabCallback(Object obj) {
            super(obj);
        }

        public boolean beforeChange(addAllCommandLine<?> addallcommandline, Location location, Location location2) {
            Intrinsics.checkNotNullParameter(addallcommandline, "");
            Location location3 = location2;
            Location location4 = location;
            return (location4 != null ? location4.getElapsedRealtimeNanos() : -1L) <= (location3 != null ? location3.getElapsedRealtimeNanos() : -1L);
        }
    }

    public setStartDate() {
        getMemoryDumpCount getmemorydumpcount = getMemoryDumpCount.onNavigationEvent;
        this.asBinder = new IAuthTabCallback(null);
        this.access100 = new onExtraCallback();
        this.IAuthTabCallbackStub = new onWarmupCompleted();
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setStartDate setstartdate = (setStartDate) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        setstartdate.onWarmupCompleted = f;
        int i5 = i3 + 57;
        getInterfaceDescriptor = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(setStartDate setstartdate, Location location) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setstartdate.onNavigationEvent(location);
        int i4 = ICustomTabsCallback + 71;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = getInterfaceDescriptor + 75;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return onoutofmemoryOnExtraCallback;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 53;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = getInterfaceDescriptor + 33;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback + 1;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 != 0) {
            throw null;
        }
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = ICustomTabsCallback + 101;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return aLCFaceValidationOnWarmupCompleted;
    }

    private final void onNavigationEvent(Location location) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 83;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.setValue(this, onExtraCallback[0], location);
        int i4 = ICustomTabsCallback + 25;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private final Location onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Location location = (Location) this.asBinder.getValue(this, onExtraCallback[0]);
        int i4 = ICustomTabsCallback + 85;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return location;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback extends DSAParameter {
        onExtraCallback() {
        }

        @Override // o.DSAParameter
        public void onExtraCallbackWithResult(float f, float f2, float f3) throws Throwable {
            Object[] objArr = {setStartDate.this, Float.valueOf(((int) (Math.toDegrees(f) + 360.0d)) % 360.0f)};
            setStartDate.onNavigationEvent(-1729077386, 1729077389, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), objArr, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 19626 - ExpandableListView.getPackedPositionChild(0L), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (access000 ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), 59 - Drawable.resolveOpacity(0, 0), 6383 - Color.red(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $10 + 15;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 59 - Gravity.getAbsoluteGravity(0, 0), 6383 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i6 = $10 + 13;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 125;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(FragmentActivity fragmentActivity, WebViewContentOwner webViewContentOwner, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Object[] objArr = new Object[1];
        a(new char[]{24039, 23535, 20972, 20449, 17909, 17356, 31176, 30617, 28109, 27612, 25012, 8127, 5563, 5043, 2435, 1948, 15832, 15280, 12712, 12115, 9542, 9052, 55647, 55142, 52602, 52064, 49535, 65397, 62749, 62217, 59665, 59147, 40231, 39720, 37156, 36640, 34085, 33494, 47305, 46787, 44234, 43728, 41198, 24300, 21729}, 1543 - ExpandableListView.getPackedPositionType(0L), objArr);
        Intent intent = new Intent(((String) objArr[0]).intern());
        String packageName = fragmentActivity.getPackageName();
        StringBuilder sb = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 74), 8 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{3, '$', 25, 18, '\'', '(', '\n', 7}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(packageName);
        intent.setData(Uri.parse(sb.toString()));
        PageAnimStore.onWarmupCompleted(webViewContentOwner, intent, 5002, (Bundle) null, 4, (Object) null);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 1;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.cancel();
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 1;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, DialogInterface dialogInterface) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 33;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b((byte) (66 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 7 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{30, '\f', 28, 6, '\f', 30}, objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, ((String) objArr[0]).intern(), (String) null, (Map) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 15;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(String str, FragmentActivity fragmentActivity, WebViewContentOwner webViewContentOwner, setTopGuideBackgroundColor settopguidebackgroundcolor, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        String string = fragmentActivity.getString(R.string.app_common_web_message_handlers___2be27d6afb);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new PollingGeolocationHandler$.ExternalSyntheticLambda18(fragmentActivity, webViewContentOwner), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = fragmentActivity.getString(R.string.next_time);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new PollingGeolocationHandler$.ExternalSyntheticLambda19(), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(new PollingGeolocationHandler$.ExternalSyntheticLambda20(settopguidebackgroundcolor));
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 95;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 79;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r6 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r9.length() != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r7 = new java.lang.Object[1];
        b((byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 66), 6 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{30, '\f', 28, 6, '\f', 30}, r7);
        o.setOnOutOfMemeryErrorCallback.onNavigationEvent(r8, ((java.lang.String) r7[0]).intern(), (java.lang.String) null, (java.util.Map) null, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r11.onExtraCallbackWithResult == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r5 = o.setStartDate.getInterfaceDescriptor + 39;
        o.setStartDate.ICustomTabsCallback = r5 % 128;
        r5 = r5 % 2;
        o.onJsBridgeReady.onNavigationEvent(r10, r9, 1);
        r7 = new java.lang.Object[1];
        b((byte) (66 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 6, new char[]{30, '\f', 28, 6, '\f', 30}, r7);
        o.setOnOutOfMemeryErrorCallback.onNavigationEvent(r8, ((java.lang.String) r7[0]).intern(), (java.lang.String) null, (java.util.Map) null, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r10, new viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$.ExternalSyntheticLambda1(r9, r10, r6, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        r5 = kotlin.Unit.INSTANCE;
        r6 = o.setStartDate.ICustomTabsCallback + 109;
        o.setStartDate.getInterfaceDescriptor = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        if ((r6 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r11.onNavigationEvent != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r11.onNavigationEvent != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r5.onExtraCallbackWithResult(r6, r7, r8);
        r5 = kotlin.Unit.INSTANCE;
        r6 = o.setStartDate.getInterfaceDescriptor + 73;
        o.setStartDate.ICustomTabsCallback = r6 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallbackWithResult(o.setStartDate r5, im.toss.core.webkit.WebViewContentOwner r6, com.google.gson.JsonObject r7, o.setTopGuideBackgroundColor r8, java.lang.String r9, androidx.fragment.app.FragmentActivity r10, o.shouldBeKeptAsChild r11) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.setStartDate.getInterfaceDescriptor
            int r1 = r1 + 19
            int r2 = r1 % 128
            o.setStartDate.ICustomTabsCallback = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L18
            boolean r1 = r11.onNavigationEvent
            r4 = 47
            int r4 = r4 / r3
            if (r1 == 0) goto L2e
            goto L1c
        L18:
            boolean r1 = r11.onNavigationEvent
            if (r1 == 0) goto L2e
        L1c:
            r5.onExtraCallbackWithResult(r6, r7, r8)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            int r6 = o.setStartDate.getInterfaceDescriptor
            int r6 = r6 + 73
            int r7 = r6 % 128
            o.setStartDate.ICustomTabsCallback = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L2d
            return r5
        L2d:
            throw r2
        L2e:
            int r5 = r9.length()
            r7 = 1
            r1 = 6
            if (r5 != 0) goto L63
            int r5 = android.view.ViewConfiguration.getFadingEdgeLength()
            int r5 = r5 >> 16
            int r5 = r5 + 66
            byte r5 = (byte) r5
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            int r6 = 6 - r6
            char[] r9 = new char[r1]
            r9 = {x00ba: FILL_ARRAY_DATA , data: [30, 12, 28, 6, 12, 30} // fill-array
            java.lang.Object[] r7 = new java.lang.Object[r7]
            b(r5, r6, r9, r7)
            r5 = r7[r3]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = r5.intern()
            r5 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r8
            r8 = r5
            o.setOnOutOfMemeryErrorCallback.onNavigationEvent(r6, r7, r8, r9, r10, r11)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L63:
            boolean r5 = r11.onExtraCallbackWithResult
            if (r5 == 0) goto L9f
            int r5 = o.setStartDate.getInterfaceDescriptor
            int r5 = r5 + 39
            int r6 = r5 % 128
            o.setStartDate.ICustomTabsCallback = r6
            int r5 = r5 % r0
            o.onJsBridgeReady.onNavigationEvent(r10, r9, r7)
            int r5 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r5 = r5 >> 16
            int r5 = 66 - r5
            byte r5 = (byte) r5
            int r6 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r6 = r6 >> 16
            int r6 = r6 + r1
            char[] r9 = new char[r1]
            r9 = {x00c4: FILL_ARRAY_DATA , data: [30, 12, 28, 6, 12, 30} // fill-array
            java.lang.Object[] r7 = new java.lang.Object[r7]
            b(r5, r6, r9, r7)
            r5 = r7[r3]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = r5.intern()
            r5 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r8
            r8 = r5
            o.setOnOutOfMemeryErrorCallback.onNavigationEvent(r6, r7, r8, r9, r10, r11)
            goto La7
        L9f:
            viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda1 r5 = new viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda1
            r5.<init>(r9, r10, r6, r8)
            o.CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(r10, r5)
        La7:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            int r6 = o.setStartDate.ICustomTabsCallback
            int r6 = r6 + 109
            int r7 = r6 % 128
            o.setStartDate.getInterfaceDescriptor = r7
            int r6 = r6 % r0
            if (r6 != 0) goto Lb5
            return r5
        Lb5:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setStartDate.onExtraCallbackWithResult(o.setStartDate, im.toss.core.webkit.WebViewContentOwner, com.google.gson.JsonObject, o.setTopGuideBackgroundColor, java.lang.String, androidx.fragment.app.FragmentActivity, o.shouldBeKeptAsChild):kotlin.Unit");
    }

    private static final Unit onNavigationEvent(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 37;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, th.getMessage(), (String) null, (Map) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 67;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        FragmentActivity activity;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            activity = webViewContentOwner.getActivity();
            int i3 = 39 / 0;
            if (activity == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jsonObject, "");
            Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
            activity = webViewContentOwner.getActivity();
            if (activity == null) {
                return;
            }
        }
        FragmentActivity fragmentActivity = activity;
        deserializeUriNullableCollection deserializeurinullablecollection = onExtraCallbackWithResult;
        if (deserializeurinullablecollection != null) {
            int i4 = getInterfaceDescriptor + 103;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                zzbr.onWarmupCompleted(deserializeurinullablecollection);
                int i5 = 41 / 0;
            } else {
                zzbr.onWarmupCompleted(deserializeurinullablecollection);
            }
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{24052, 2202, 63237, 23960, 2055, 63144, 23844, 2969, 63019, 23733, 2897, 61916, 23641, 2768, 61809, 24574, 2680, 61634, 24417, 2574, 61569, 24330, 1415, 61500}, 21881 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        b((byte) (6 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 27, new char[]{0, '0', '$', '\b', 15, '\"', 13820, 13820, 6, 28, '$', 25, '\b', 30, '+', 30, 17, '\'', 0, 7, 30, 28, '0', '!', '+', 31}, objArr2);
        if (Intrinsics.areEqual(str, ((String) objArr2[0]).intern())) {
            Object[] objArr3 = new Object[1];
            b((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 102), (ViewConfiguration.getLongPressTimeout() >> 16) + 8, new char[]{28, 5, 0, 2, '\"', 1, '\f', 30}, objArr3);
            ALCFaceBox.onExtraCallback(settopguidebackgroundcolor, ((String) objArr3[0]).intern());
            return;
        }
        RxPermissions rxPermissions = new RxPermissions(fragmentActivity);
        Object[] objArr4 = new Object[1];
        a(new char[]{24039, 11449, 48960, 3591, 39085, 27514, 64004, 17567, 55166, 42554, 12510, 33680, 4643, 40168, 28571, 65104, 18681, 56201, 43546, 13508, 34705, 5728, 57653, 29586, 49741, 19760, 57338, 44612, 14612, 35822, 6823, 58629, 30697, 50868, 20741, 9153, 45739, 15740, 36814}, 29009 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
        Object[] objArr5 = {rxPermissions, fragmentActivity, new String[]{((String) objArr4[0]).intern()}};
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = ((writeRaw) RxPermissionsKt.IAuthTabCallback(1755154931, matches.onExtraCallback(), -1755154927, matches.onExtraCallback(), matches.onExtraCallback(), objArr5, matches.onExtraCallback())).onNavigationEvent(new PollingGeolocationHandler$.ExternalSyntheticLambda22(new PollingGeolocationHandler$.ExternalSyntheticLambda21(this, webViewContentOwner, jsonObject, settopguidebackgroundcolor, strOnNavigationEvent, fragmentActivity)), new PollingGeolocationHandler$.ExternalSyntheticLambda24(new PollingGeolocationHandler$.ExternalSyntheticLambda23(settopguidebackgroundcolor)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, webViewContentOwner);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        r7 = o.setStartDate.getInterfaceDescriptor + 91;
        o.setStartDate.ICustomTabsCallback = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r7, ((java.lang.String) r5[0]).intern()) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0057, code lost:
    
        if (androidx.core.content.ContextCompat.checkSelfPermission(r7, ((java.lang.String) r5[0]).intern()) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean onExtraCallbackWithResult(android.content.Context r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.setStartDate.getInterfaceDescriptor
            int r1 = r1 + 31
            int r2 = r1 % 128
            o.setStartDate.ICustomTabsCallback = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L35
            r1 = 39
            char[] r1 = new char[r1]
            r1 = {x0064: FILL_ARRAY_DATA , data: [24039, 11449, -16576, 3591, -26451, 27514, -1532, 17567, -10370, -22982, 12510, -31856, 4643, -25368, 28571, -432, 18681, -9335, -21990, 13508, -30831, 5728, -7883, 29586, -15795, 19760, -8198, -20924, 14612, -29714, 6823, -6907, 30697, -14668, 20741, 9153, -19797, 15740, -28722} // fill-array
            java.lang.String r4 = ""
            r5 = 25
            int r4 = android.text.TextUtils.lastIndexOf(r4, r5)
            int r4 = r4 + 14811
            java.lang.Object[] r5 = new java.lang.Object[r3]
            a(r1, r4, r5)
            r1 = r5[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            int r7 = androidx.core.content.ContextCompat.checkSelfPermission(r7, r1)
            if (r7 != 0) goto L5a
            goto L59
        L35:
            r1 = 39
            char[] r1 = new char[r1]
            r1 = {x0090: FILL_ARRAY_DATA , data: [24039, 11449, -16576, 3591, -26451, 27514, -1532, 17567, -10370, -22982, 12510, -31856, 4643, -25368, 28571, -432, 18681, -9335, -21990, 13508, -30831, 5728, -7883, 29586, -15795, 19760, -8198, -20924, 14612, -29714, 6823, -6907, 30697, -14668, 20741, 9153, -19797, 15740, -28722} // fill-array
            java.lang.String r4 = ""
            r5 = 48
            int r4 = android.text.TextUtils.lastIndexOf(r4, r5)
            int r4 = r4 + 29010
            java.lang.Object[] r5 = new java.lang.Object[r3]
            a(r1, r4, r5)
            r1 = r5[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            int r7 = androidx.core.content.ContextCompat.checkSelfPermission(r7, r1)
            if (r7 != 0) goto L5a
        L59:
            return r3
        L5a:
            int r7 = o.setStartDate.getInterfaceDescriptor
            int r7 = r7 + 91
            int r1 = r7 % 128
            o.setStartDate.ICustomTabsCallback = r1
            int r7 = r7 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setStartDate.onExtraCallbackWithResult(android.content.Context):boolean");
    }

    private static final Unit onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 93;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        b((byte) (51 - TextUtils.getOffsetBefore("", 0)), KeyEvent.keyCodeFromString("") + 8, new char[]{28, 5, 3, ')', '/', '-', '\f', 30}, objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, ((String) objArr[0]).intern(), (String) null, (Map) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 17;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return unit;
    }

    private final void onExtraCallbackWithResult(WebViewContentOwner webViewContentOwner, JsonObject jsonObject, final setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        final FragmentActivity activity;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 31;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        TossCoreWebView webView = webViewContentOwner.getWebView();
        if (webView == null || (activity = webViewContentOwner.getActivity()) == null) {
            return;
        }
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a(new char[]{24032, 58042, 9047, 25588, 41141, 57639, 8667, 26176, 42763, 59312, 9303, 25880, 42429, 59994}, TextUtils.getTrimmedLength("") + 48989, objArr);
        final String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a(new char[]{24047, 48255, 40668, 63782, 56232, 14851, 5229, 30411}, 57751 - View.MeasureSpec.getSize(0), objArr2);
        Float floatOrNull = StringsKt.toFloatOrNull(settext.onNavigationEvent(((String) objArr2[0]).intern(), ""));
        long jFloatValue = floatOrNull == null ? 200L : (long) (floatOrNull.floatValue() * 1000.0f);
        webView.getSettings().setGeolocationEnabled(true);
        LocationRequest locationRequestBuild = new LocationRequest.Builder(100, jFloatValue).setMinUpdateIntervalMillis(200L).build();
        Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "");
        this.onTransact = locationRequestBuild;
        onNavigationEvent(860129740, -860129733, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, webViewContentOwner, activity, new Function0() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda2
            public final Object invoke() {
                return setStartDate.onExtraCallbackWithResult(settopguidebackgroundcolor);
            }
        }}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
        final TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(activity);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAccess100 = JsonReaderUnknownNumberParsing.IAuthTabCallback(200L, jFloatValue, TimeUnit.MILLISECONDS, NetConverter3.onExtraCallback()).access100();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return setStartDate.onExtraCallbackWithResult(this.f$0, (Long) obj);
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingAccess100.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda6
            public final Object apply(Object obj) {
                return setStartDate.onExtraCallbackWithResult(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda7
            public final Object invoke(Object obj) {
                return Boolean.valueOf(setStartDate.onWarmupCompleted((Pair) obj));
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnNavigationEvent.onWarmupCompleted(new deserializeLongCollection() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda8
            public final boolean test(Object obj) {
                return setStartDate.onNavigationEvent(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda9
            public final Object invoke(Object obj) {
                return Boolean.valueOf(setStartDate.onExtraCallback(this.f$0, activity, strOnNavigationEvent, (Pair) obj));
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsingOnWarmupCompleted.onWarmupCompleted(new deserializeLongCollection() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda10
            public final boolean test(Object obj) {
                return setStartDate.IAuthTabCallback(function13, obj);
            }
        }).IAuthTabCallback(new deserializeDecimalCollection() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda11
            public final void run() throws Throwable {
                Object[] objArr3 = {activity, textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0OnNavigationEvent, this};
                int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
                setStartDate.onNavigationEvent(-1049235640, 1049235646, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, objArr3, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
            }
        });
        final Function1 function14 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda12
            public final Object invoke(Object obj) {
                return setStartDate.IAuthTabCallback(settopguidebackgroundcolor, (Pair) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda13
            public final void accept(Object obj) {
                setStartDate.onExtraCallback(function14, obj);
            }
        };
        final Function1 function15 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return setStartDate.onExtraCallbackWithResult(settopguidebackgroundcolor, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = jsonReaderUnknownNumberParsingIAuthTabCallback.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda4
            public final void accept(Object obj) throws Throwable {
                Object[] objArr3 = {function15, obj};
                int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
                setStartDate.onNavigationEvent(1654655063, -1654655063, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, objArr3, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        onExtraCallbackWithResult = IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnWarmupCompleted, webViewContentOwner);
        int i4 = ICustomTabsCallback + 51;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Pair IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        Pair pair;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 55;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            pair = (Pair) function1.invoke(obj);
            int i3 = 36 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            pair = (Pair) function1.invoke(obj);
        }
        int i4 = getInterfaceDescriptor + 27;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return pair;
    }

    private static final Pair onNavigationEvent(setStartDate setstartdate, Long l) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(l, "");
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(setstartdate.onWarmupCompleted(), setstartdate.onWarmupCompleted);
        int i4 = getInterfaceDescriptor + 55;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return pairIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 123;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = getInterfaceDescriptor + 39;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean IAuthTabCallback(Pair pair) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 47;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Location location = (Location) pair.onExtraCallbackWithResult();
        if (!AppState.Companion.onExtraCallbackWithResult().IAuthTabCallback() || location == null) {
            return false;
        }
        int i4 = getInterfaceDescriptor + 45;
        ICustomTabsCallback = i4 % 128;
        return i4 % 2 != 0;
    }

    private static final boolean access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 27;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            ((Boolean) function1.invoke(obj)).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i3 = getInterfaceDescriptor + 55;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    private static final boolean onNavigationEvent(setStartDate setstartdate, FragmentActivity fragmentActivity, String str, Pair pair) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Location location = (Location) pair.onExtraCallbackWithResult();
        Boolean boolValueOf = null;
        if (Build.VERSION.SDK_INT >= 31) {
            if (location != null) {
                boolValueOf = Boolean.valueOf(location.isMock());
            }
        } else if (location != null) {
            int i2 = getInterfaceDescriptor + 81;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Boolean.valueOf(location.isFromMockProvider());
                boolValueOf.hashCode();
                throw null;
            }
            boolValueOf = Boolean.valueOf(location.isFromMockProvider());
            int i3 = ICustomTabsCallback + 77;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 5;
            }
        }
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        if (zBooleanValue) {
            setstartdate.onExtraCallbackWithResult(fragmentActivity, str);
        } else {
            Dialog dialog = setstartdate.IAuthTabCallbackDefault;
            if (dialog != null) {
                int i5 = ICustomTabsCallback + 75;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                dialog.dismiss();
                if (i6 != 0) {
                    int i7 = 2 / 0;
                }
            }
        }
        return !zBooleanValue;
    }

    private static final void onExtraCallbackWithResult(FragmentActivity fragmentActivity, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0, setStartDate setstartdate) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        fragmentActivity.getLifecycle().onExtraCallbackWithResult(textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        setstartdate.onExtraCallback(fragmentActivity);
        onExtraCallbackWithResult = null;
        int i4 = ICustomTabsCallback + 125;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 79;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = getInterfaceDescriptor + 43;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 23;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, Pair pair) throws Throwable {
        Double dValueOf;
        int i = 2 % 2;
        Location location = (Location) pair.onExtraCallbackWithResult();
        Float f = (Float) pair.IAuthTabCallback();
        JsonObject jsonObject = new JsonObject();
        Double dValueOf2 = null;
        if (location != null) {
            int i2 = ICustomTabsCallback + 5;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                Double.valueOf(location.getLatitude());
                throw null;
            }
            dValueOf = Double.valueOf(location.getLatitude());
        } else {
            dValueOf = null;
        }
        Object[] objArr = new Object[1];
        a(new char[]{24042, 62316, 228}, ((Process.getThreadPriority(0) + 20) >> 6) + 44683, objArr);
        jsonObject.addProperty(((String) objArr[0]).intern(), dValueOf);
        if (location != null) {
            int i3 = getInterfaceDescriptor + 105;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Double.valueOf(location.getLongitude());
                dValueOf2.hashCode();
                throw null;
            }
            dValueOf2 = Double.valueOf(location.getLongitude());
        }
        Object[] objArr2 = new Object[1];
        a(new char[]{24042, 57112, 22538}, Gravity.getAbsoluteGravity(0, 0) + 33521, objArr2);
        jsonObject.addProperty(((String) objArr2[0]).intern(), dValueOf2);
        Object[] objArr3 = new Object[1];
        b((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 44), ExpandableListView.getPackedPositionGroup(0L) + 7, new char[]{30, '\f', '(', '%', 13868, 13868, 13846}, objArr3);
        jsonObject.addProperty(((String) objArr3[0]).intern(), f);
        ALCFaceBox.onWarmupCompleted(settopguidebackgroundcolor, jsonObject);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, th.getMessage(), (String) null, (Map) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 21;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r8 != 5002) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r5 = r4.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r8 = o.setStartDate.ICustomTabsCallback + 85;
        o.setStartDate.getInterfaceDescriptor = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if ((r8 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (onExtraCallbackWithResult(r5) == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r8 = new java.lang.Object[1];
        b((byte) (66 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 6 - android.view.View.MeasureSpec.getSize(0), new char[]{30, '\f', 28, 6, '\f', 30}, r8);
        o.setOnOutOfMemeryErrorCallback.onNavigationEvent(r7, ((java.lang.String) r8[0]).intern(), (java.lang.String) null, (java.util.Map) null, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        onExtraCallbackWithResult(r4, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        onExtraCallbackWithResult(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r9 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        r4 = o.setStartDate.onExtraCallbackWithResult;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        o.zzbr.onWarmupCompleted(r4);
        r4 = o.setStartDate.ICustomTabsCallback + 13;
        o.setStartDate.getInterfaceDescriptor = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        r8 = new java.lang.Object[1];
        b((byte) ((android.os.Process.myTid() >> 22) + 51), android.view.View.getDefaultSize(0, 0) + 8, new char[]{28, 5, 3, ')', '/', '-', '\f', 30}, r8);
        o.setOnOutOfMemeryErrorCallback.onNavigationEvent(r7, ((java.lang.String) r8[0]).intern(), (java.lang.String) null, (java.util.Map) null, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r8 != 7954) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r8 != 5001) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull im.toss.core.webkit.WebViewContentOwner r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull com.google.gson.JsonObject r6, @org.jetbrains.annotations.NotNull o.setTopGuideBackgroundColor r7, int r8, int r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10, @org.jetbrains.annotations.Nullable android.net.Uri r11) throws java.lang.Throwable {
        /*
            r3 = this;
            r10 = 2
            int r11 = r10 % r10
            int r11 = o.setStartDate.ICustomTabsCallback
            int r11 = r11 + 111
            int r0 = r11 % 128
            o.setStartDate.getInterfaceDescriptor = r0
            int r11 = r11 % r10
            r0 = 1
            r1 = 0
            java.lang.String r2 = ""
            if (r11 == 0) goto L23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            r5 = 7954(0x1f12, float:1.1146E-41)
            if (r8 == r5) goto L84
            goto L33
        L23:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            r5 = 5001(0x1389, float:7.008E-42)
            if (r8 == r5) goto L84
        L33:
            r5 = 5002(0x138a, float:7.009E-42)
            if (r8 != r5) goto Lc2
            android.content.Context r5 = r4.getContext()
            if (r5 == 0) goto Lc2
            int r8 = o.setStartDate.ICustomTabsCallback
            int r8 = r8 + 85
            int r9 = r8 % 128
            o.setStartDate.getInterfaceDescriptor = r9
            int r8 = r8 % r10
            if (r8 != 0) goto L7f
            boolean r5 = r3.onExtraCallbackWithResult(r5)
            if (r5 == r0) goto L7b
            r4 = 0
            float r5 = android.graphics.PointF.length(r4, r4)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            int r4 = 66 - r4
            byte r4 = (byte) r4
            int r5 = android.view.View.MeasureSpec.getSize(r1)
            r6 = 6
            int r5 = 6 - r5
            char[] r6 = new char[r6]
            r6 = {x00c4: FILL_ARRAY_DATA , data: [30, 12, 28, 6, 12, 30} // fill-array
            java.lang.Object[] r8 = new java.lang.Object[r0]
            b(r4, r5, r6, r8)
            r4 = r8[r1]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = r4.intern()
            r4 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r7
            r7 = r4
            o.setOnOutOfMemeryErrorCallback.onNavigationEvent(r5, r6, r7, r8, r9, r10)
            return
        L7b:
            r3.onExtraCallbackWithResult(r4, r6, r7)
            return
        L7f:
            r3.onExtraCallbackWithResult(r5)
            r4 = 0
            throw r4
        L84:
            r4 = -1
            if (r9 == r4) goto Lc2
            o.deserializeUriNullableCollection r4 = o.setStartDate.onExtraCallbackWithResult
            if (r4 == 0) goto L97
            o.zzbr.onWarmupCompleted(r4)
            int r4 = o.setStartDate.ICustomTabsCallback
            int r4 = r4 + 13
            int r5 = r4 % 128
            o.setStartDate.getInterfaceDescriptor = r5
            int r4 = r4 % r10
        L97:
            int r4 = android.os.Process.myTid()
            int r4 = r4 >> 22
            int r4 = r4 + 51
            byte r4 = (byte) r4
            int r5 = android.view.View.getDefaultSize(r1, r1)
            r6 = 8
            int r5 = r5 + r6
            char[] r6 = new char[r6]
            r6 = {x00ce: FILL_ARRAY_DATA , data: [28, 5, 3, 41, 47, 45, 12, 30} // fill-array
            java.lang.Object[] r8 = new java.lang.Object[r0]
            b(r4, r5, r6, r8)
            r4 = r8[r1]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = r4.intern()
            r4 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r7
            r7 = r4
            o.setOnOutOfMemeryErrorCallback.onNavigationEvent(r5, r6, r7, r8, r9, r10)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setStartDate.onExtraCallbackWithResult(im.toss.core.webkit.WebViewContentOwner, java.lang.String, com.google.gson.JsonObject, o.setTopGuideBackgroundColor, int, int, android.os.Bundle, android.net.Uri):void");
    }

    private static final void IAuthTabCallback(setStartDate setstartdate, FragmentActivity fragmentActivity, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        int i4 = onNavigationEvent.IAuthTabCallback[onextracallbackwithresult.ordinal()];
        if (i4 == 1) {
            setstartdate.onWarmupCompleted(fragmentActivity);
            return;
        }
        int i5 = ICustomTabsCallback + 105;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            if (i4 != 3) {
                return;
            }
        } else if (i4 != 2) {
            return;
        }
        setstartdate.onExtraCallback(fragmentActivity);
        int i6 = ICustomTabsCallback + 111;
        getInterfaceDescriptor = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private final TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 onNavigationEvent(final FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda0
            public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) throws Throwable {
                setStartDate.onExtraCallback(this.f$0, fragmentActivity, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
            }
        };
        fragmentActivity.getLifecycle().IAuthTabCallback(lifecycleEventObserver);
        int i2 = getInterfaceDescriptor + 87;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return lifecycleEventObserver;
    }

    private static final void IAuthTabCallback(setStartDate setstartdate, Function0 function0, WebViewContentOwner webViewContentOwner, Exception exc) throws Throwable {
        Object obj;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        Object obj2;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        if (!(exc instanceof ResolvableApiException)) {
            function0.invoke();
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{24022, 65310, 6148, 46351, 54835, 29499, 35883, 10496, 19035, 59206, 'L', 23924, 65137, 7020, 46192, 53654, 29337, 36751, 10384, 17842, 59044, 929, 23760, 63954, 6876}, (Process.myPid() >> 22) + 41719, objArr);
            convertFloatArrayToByteArray2.IAuthTabCallback(((String) objArr[0]).intern(), exc);
            return;
        }
        int i4 = getInterfaceDescriptor + 89;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        try {
            Result.Companion companion = Result.Companion;
            IntentSender intentSender = ((ResolvableApiException) exc).getResolution().getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "");
            PageAnimStore.onWarmupCompleted(webViewContentOwner, intentSender, 5001, (Bundle) null, 4, (Object) null);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i6 = getInterfaceDescriptor + 73;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 == 0) {
                function0.invoke();
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr2 = new Object[1];
                a(new char[]{24022, 65310, 6148, 46351, 54835, 29499, 35883, 10496, 19035, 59206, 'L', 23924, 65137, 7020, 46192, 53654, 29337, 36751, 10384, 17842, 59044, 929, 23760, 63954, 6876}, 41719 >> TextUtils.getOffsetBefore("", 0), objArr2);
                obj2 = objArr2[0];
            } else {
                function0.invoke();
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr3 = new Object[1];
                a(new char[]{24022, 65310, 6148, 46351, 54835, 29499, 35883, 10496, 19035, 59206, 'L', 23924, 65137, 7020, 46192, 53654, 29337, 36751, 10384, 17842, 59044, 929, 23760, 63954, 6876}, TextUtils.getOffsetBefore("", 0) + 41719, objArr3);
                obj2 = objArr3[0];
            }
            convertFloatArrayToByteArray.IAuthTabCallback(((String) obj2).intern(), th2);
        }
        Result.IAuthTabCallback(obj);
        int i7 = ICustomTabsCallback + 83;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        Object obj;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray;
        Object obj2;
        final setStartDate setstartdate = (setStartDate) objArr[0];
        final WebViewContentOwner webViewContentOwner = (WebViewContentOwner) objArr[1];
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[2];
        final Function0 function0 = (Function0) objArr[3];
        int i = 2 % 2;
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
        LocationRequest locationRequest = setstartdate.onTransact;
        if (locationRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            locationRequest = null;
        }
        LocationSettingsRequest locationSettingsRequestBuild = builder.addLocationRequest(locationRequest).build();
        Intrinsics.checkNotNullExpressionValue(locationSettingsRequestBuild, "");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(LocationServices.getSettingsClient(fragmentActivity).checkLocationSettings(locationSettingsRequestBuild).addOnFailureListener(new OnFailureListener() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda17
                public final void onFailure(Exception exc) throws Throwable {
                    setStartDate.onExtraCallback(this.f$0, function0, webViewContentOwner, exc);
                }
            }));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i2 = getInterfaceDescriptor + 105;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 == 0) {
                function0.invoke();
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr2 = new Object[1];
                a(new char[]{24022, 65310, 6148, 46351, 54835, 29499, 35883, 10496, 19035, 59206, 'L', 23924, 65137, 7020, 46192, 53654, 29337, 36751, 10384, 17842, 59044, 929, 23760, 63954, 6876}, 41720 - TextUtils.indexOf((CharSequence) "", '*', 1, 1), objArr2);
                obj2 = objArr2[0];
            } else {
                function0.invoke();
                convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Object[] objArr3 = new Object[1];
                a(new char[]{24022, 65310, 6148, 46351, 54835, 29499, 35883, 10496, 19035, 59206, 'L', 23924, 65137, 7020, 46192, 53654, 29337, 36751, 10384, 17842, 59044, 929, 23760, 63954, 6876}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 41720, objArr3);
                obj2 = objArr3[0];
            }
            convertFloatArrayToByteArray.IAuthTabCallback(((String) obj2).intern(), th2);
        }
        int i3 = ICustomTabsCallback + 113;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        long j;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallbackStubProxy;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $11 + 11;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) + 26, (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback_Parcel)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        long j2 = 0;
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + 26, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i7 = $11 + 85;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i9 = $11 + 19;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback * b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >>> b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    j = j2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (Process.myPid() >> 22)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 74, 8089 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            j = 0;
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31, ImageFormat.getBitsPerPixel(0) + 19489, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            j = 0;
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                    } else {
                        j = 0;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            int i15 = $10 + 123;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                j2 = j;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = $10 + 87;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr4[i17] = (char) (cArr4[i17] ^ 3195);
                i17 += 17;
            } else {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private final void onWarmupCompleted(FragmentActivity fragmentActivity) throws Throwable {
        Object obj;
        int i;
        Object obj2;
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 123;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        try {
            Result.Companion companion = Result.Companion;
            FusedLocationProviderClient fusedLocationProviderClient = this.asInterface;
            if (fusedLocationProviderClient == null) {
                fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(fragmentActivity);
                this.asInterface = fusedLocationProviderClient;
                Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "");
            }
            obj = Result.constructor-impl(fusedLocationProviderClient);
            i = ICustomTabsCallback + 73;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
            i = ICustomTabsCallback + 85;
        }
        getInterfaceDescriptor = i % 128;
        int i5 = i % 2;
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr = new Object[1];
            a(new char[]{24022, 65310, 6148, 46351, 54835, 29499, 35883, 10496, 19035, 59206, 'L', 23924, 65137, 7020, 46192, 53654, 29337, 36751, 10384, 17842, 59044, 929, 23760, 63954, 6876}, ExpandableListView.getPackedPositionType(0L) + 41719, objArr);
            convertFloatArrayToByteArray.IAuthTabCallback(((String) objArr[0]).intern(), th2);
            return;
        }
        FusedLocationProviderClient fusedLocationProviderClient2 = (FusedLocationProviderClient) obj;
        try {
            Result.Companion companion3 = Result.Companion;
            Task lastLocation = fusedLocationProviderClient2.getLastLocation();
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda14
                public final Object invoke(Object obj3) {
                    Object[] objArr2 = {this.f$0, (Location) obj3};
                    int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
                    return (Unit) setStartDate.onNavigationEvent(-1613301113, 1613301114, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, objArr2, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
                }
            };
            lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda15
                public final void onSuccess(Object obj3) {
                    setStartDate.asBinder(function1, obj3);
                }
            });
            LocationRequest locationRequest = this.onTransact;
            if (locationRequest == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                locationRequest = null;
            }
            onWarmupCompleted onwarmupcompleted = this.IAuthTabCallbackStub;
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            obj2 = Result.constructor-impl(fusedLocationProviderClient2.requestLocationUpdates(locationRequest, onwarmupcompleted, looperMyLooper));
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
        }
        Throwable th4 = Result.exceptionOrNull-impl(obj2);
        if (th4 != null) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a(new char[]{24022, 65310, 6148, 46351, 54835, 29499, 35883, 10496, 19035, 59206, 'L', 23924, 65137, 7020, 46192, 53654, 29337, 36751, 10384, 17842, 59044, 929, 23760, 63954, 6876}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 41720, objArr2);
            convertFloatArrayToByteArray2.IAuthTabCallback(((String) objArr2[0]).intern(), th4);
            return;
        }
        this.access100.onWarmupCompleted((Context) fragmentActivity);
        int i6 = ICustomTabsCallback + 121;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final Unit IAuthTabCallback(setStartDate setstartdate, Location location) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setstartdate.onNavigationEvent(location);
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 13;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return unit;
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 11;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        int i5 = getInterfaceDescriptor + 69;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
    }

    private final void onExtraCallback(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 49;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        FusedLocationProviderClient fusedLocationProviderClient = this.asInterface;
        if (fusedLocationProviderClient != null) {
            int i5 = i2 + 75;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            fusedLocationProviderClient.removeLocationUpdates(this.IAuthTabCallbackStub);
        }
        this.access100.onNavigationEvent((Context) fragmentActivity);
        int i7 = getInterfaceDescriptor + 19;
        ICustomTabsCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    private final void onExtraCallbackWithResult(final FragmentActivity fragmentActivity, final String str) {
        int i = 2 % 2;
        if (this.IAuthTabCallbackDefault == null) {
            int i2 = getInterfaceDescriptor + 93;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() == 0) {
                return;
            } else {
                this.IAuthTabCallbackDefault = CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(fragmentActivity, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda16
                    public final Object invoke(Object obj) {
                        return setStartDate.onWarmupCompleted(str, fragmentActivity, this, (CommonModule_setLeftEdgeTouchEnabled) obj);
                    }
                });
            }
        }
        int i4 = getInterfaceDescriptor + 35;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(FragmentActivity fragmentActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            fragmentActivity.finish();
            dialogInterface.dismiss();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        fragmentActivity.finish();
        dialogInterface.dismiss();
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallback + 101;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(setStartDate setstartdate, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        setstartdate.IAuthTabCallbackDefault = null;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallback(String str, final FragmentActivity fragmentActivity, final setStartDate setstartdate, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        String string = fragmentActivity.getString(R.string.app_main___526eb45817);
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda25
            public final Object invoke(Object obj) {
                Object[] objArr2 = {fragmentActivity, (DialogInterface) obj};
                int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
                return (Unit) setStartDate.onNavigationEvent(720607035, -720607027, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, objArr2, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        String string2 = fragmentActivity.getString(R.string.next_time);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, string2, (TdsButtonV1View.asInterface) null, false, new Function1() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda26
            public final Object invoke(Object obj) {
                Object[] objArr3 = {fragmentActivity, (DialogInterface) obj};
                int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
                return (Unit) setStartDate.onNavigationEvent(-1666053414, 1666053418, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, objArr3, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
            }
        }, 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1081265451, new Object[]{commonModule_setLeftEdgeTouchEnabled, false}, iOnExtraCallbackWithResult3, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1081265446, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new Function1() { // from class: viva.republica.toss.common.web.message.handlers.PollingGeolocationHandler$$ExternalSyntheticLambda27
            public final Object invoke(Object obj) {
                return setStartDate.IAuthTabCallback(this.f$0, (DialogInterface) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = getInterfaceDescriptor + 81;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 87 / 0;
        }
        return unit;
    }

    public static final class onWarmupCompleted extends LocationCallback {
        onWarmupCompleted() {
        }

        public void onLocationResult(LocationResult locationResult) {
            Intrinsics.checkNotNullParameter(locationResult, "");
            setStartDate.onWarmupCompleted(setStartDate.this, locationResult.getLastLocation());
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(FragmentActivity fragmentActivity, WebViewContentOwner webViewContentOwner, DialogInterface dialogInterface) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) onNavigationEvent(976013301, -976013290, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{fragmentActivity, webViewContentOwner, dialogInterface}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) throws Throwable {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        onNavigationEvent(1654655063, -1654655063, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{function1, obj}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    public static /* synthetic */ void onExtraCallback(FragmentActivity fragmentActivity, TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0, setStartDate setstartdate) throws Throwable {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        onNavigationEvent(-1049235640, 1049235646, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{fragmentActivity, textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0, setstartdate}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FragmentActivity fragmentActivity, DialogInterface dialogInterface) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) onNavigationEvent(720607035, -720607027, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{fragmentActivity, dialogInterface}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setStartDate setstartdate, Location location) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) onNavigationEvent(-1613301113, 1613301114, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{setstartdate, location}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallback(FragmentActivity fragmentActivity, DialogInterface dialogInterface) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) onNavigationEvent(-1666053414, 1666053418, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{fragmentActivity, dialogInterface}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    public static final /* synthetic */ void onExtraCallback(setStartDate setstartdate, Float f) throws Throwable {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        onNavigationEvent(-1729077386, 1729077389, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{setstartdate, f}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    private static final Unit onExtraCallback(DialogInterface dialogInterface) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) onNavigationEvent(-1819015262, 1819015274, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{dialogInterface}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    private static final void onTransact(Function1 function1, Object obj) throws Throwable {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        onNavigationEvent(2125010851, -2125010841, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{function1, obj}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) onNavigationEvent(-93972550, 93972559, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{settopguidebackgroundcolor, th}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) throws Throwable {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        onNavigationEvent(-1508495209, 1508495211, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{function1, obj}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    private final void onWarmupCompleted(WebViewContentOwner webViewContentOwner, FragmentActivity fragmentActivity, Function0<Unit> function0) throws Throwable {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        onNavigationEvent(860129740, -860129733, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{this, webViewContentOwner, fragmentActivity, function0}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(FragmentActivity fragmentActivity, DialogInterface dialogInterface) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (Unit) onNavigationEvent(2082068729, -2082068724, RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent, new Object[]{fragmentActivity, dialogInterface}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent());
    }

    static void IAuthTabCallback() {
        access000 = -2730778277681702735L;
        IAuthTabCallbackStubProxy = new char[]{64986, 64963, 65022, 65015, 65071, 65020, 64960, 65070, 64999, 64982, 65064, 64984, 64924, 64905, 65056, 64904, 64990, 65069, 64976, 65068, 64995, 64997, 65012, 65057, 64992, 65067, 65014, 64979, 65066, 64988, 65065, 65010, 64925, 64983, 64989, 64923, 64961, 65004, 64978, 64980, 64922, 65021, 64967, 65023, 64991, 64981, 64977, 65018, 65008};
        IAuthTabCallback_Parcel = (char) 51246;
    }
}
