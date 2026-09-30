package o;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleEventObserver;
import com.google.android.gms.internal.ads.zzgc;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.tmoney.LiveCheckConstants;
import im.toss.core.webkit.TossBridgeWebView;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.TossWebChromeClient$;
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import o.CommonModule_setLeftEdgeTouchEnabled;
import o.IEngagementSignalsCallbackDefault;
import o.IPostMessageService_Parcel;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.setCircleColor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class setCircleColor extends WebChromeClient {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static int onActivityLayout = 1;
    private static final int onExtraCallback;
    private static final FrameLayout.LayoutParams onExtraCallbackWithResult;
    private static int onMinimized;
    private static long onPostMessage;
    private static int onRelationshipValidationResult;
    private static final AtomicInteger onWarmupCompleted;
    private final boolean IAuthTabCallback;
    private WebChromeClient.CustomViewCallback IAuthTabCallbackDefault;
    private Uri IAuthTabCallbackStub;
    private Integer IAuthTabCallbackStubProxy;
    private final WebViewContentOwner IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private final onNavigationEvent access000;
    private final IEngagementSignalsCallback_Parcel<Intent> access100;
    private ValueCallback<Uri[]> asBinder;
    private final IEngagementSignalsCallback_Parcel<WebChromeClient.FileChooserParams> asInterface;
    private final int extraCallback;
    private final String extraCallbackWithResult;
    private final String getInterfaceDescriptor;
    private View onActivityResized;
    private flipCamera onMessageChannelReady;
    private final boolean onNavigationEvent;
    private final Context onTransact;
    private final IEngagementSignalsCallbackStubProxy readTypedObject;
    private Function1<? super Integer, Unit> writeTypedObject;

    public /* synthetic */ setCircleColor(Context context, String str, onNavigationEvent onnavigationevent, WebViewContentOwner webViewContentOwner, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, onnavigationevent, webViewContentOwner, z);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DialogInterface dialogInterface = (DialogInterface) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 17;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(dialogInterface);
        int i4 = onActivityLayout + 17;
        onMinimized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 79;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1037181003, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{function1, obj}, 1037181012);
            int i3 = 68 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            onWarmupCompleted(iOnExtraCallbackWithResult3, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1037181003, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{function1, obj}, 1037181012);
        }
        int i4 = onMinimized + 97;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        setCircleColor setcirclecolor = (setCircleColor) objArr[0];
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) objArr[1];
        TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult = (TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = onMinimized + 37;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(setcirclecolor, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, JsResult jsResult, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onMinimized + 81;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(str, jsResult, commonModule_setLeftEdgeTouchEnabled);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str, jsResult, commonModule_setLeftEdgeTouchEnabled);
        int i3 = onMinimized + 77;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 74 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 43;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = onMinimized + 25;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(FragmentActivity fragmentActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 97;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(fragmentActivity, dialogInterface);
        int i4 = onActivityLayout + 3;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, FragmentActivity fragmentActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 39;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, fragmentActivity, commonModule_setLeftEdgeTouchEnabled);
        int i4 = onMinimized + 19;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setCircleColor setcirclecolor, Throwable th) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 11;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setcirclecolor, th);
        int i4 = onActivityLayout + 53;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 29;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(dialogInterface, i);
        int i5 = onActivityLayout + 73;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 79;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallback(fragmentActivity, dialogInterface, i);
        int i5 = onActivityLayout + 55;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 55;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1522347793, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{function1, obj}, -1522347787);
            return;
        }
        int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult3, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1522347793, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{function1, obj}, -1522347787);
        int i3 = 46 / 0;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setCircleColor setcirclecolor, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 23;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(setcirclecolor, iEngagementSignalsCallbackDefault);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
        int i5 = onActivityLayout + 125;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setCircleColor setcirclecolor, Uri[] uriArr) {
        int i = 2 % 2;
        int i2 = onMinimized + 69;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(setcirclecolor, uriArr);
        int i4 = onActivityLayout + 19;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 125;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(dialogInterface);
        int i4 = onMinimized + 17;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(JsResult jsResult, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 41;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(jsResult, dialogInterface);
        int i4 = onActivityLayout + 29;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, JsResult jsResult, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        int i2 = onMinimized + 29;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, jsResult, commonModule_setLeftEdgeTouchEnabled);
        int i4 = onMinimized + 111;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(setCircleColor setcirclecolor, List list) {
        int i = 2 % 2;
        int i2 = onMinimized + 67;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(setcirclecolor, list);
        }
        IAuthTabCallback(setcirclecolor, list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 113;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = onActivityLayout + 97;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = i3 | i7;
        int i9 = (~(i6 | i)) | i3;
        int i10 = ~i6;
        int i11 = (~(i | i6 | i3)) | (~(i7 | i10)) | (~((~i3) | i10));
        int i12 = i6 + i3 + i5 + (1609234610 * i2) + (1307081305 * i4);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i6) - 1772093440) + (1576585830 * i3) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i5) + ((-2101346304) * i2) + (23068672 * i4) + ((-2103967744) * i13);
        int i15 = (i6 * 273352028) + 245730370 + (i3 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i5 * 273352337) + (i2 * (-770635566)) + (i4 * (-73506199)) + (i13 * (-2011693056));
        switch (i14 + (i15 * i15 * 1080557568)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asInterface(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return onTransact(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                return access100(objArr);
            default:
                JsResult jsResult = (JsResult) objArr[0];
                DialogInterface dialogInterface = (DialogInterface) objArr[1];
                int i16 = 2 % 2;
                int i17 = onMinimized + 11;
                onActivityLayout = i17 % 128;
                int i18 = i17 % 2;
                Unit unit = (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1741930105, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{jsResult, dialogInterface}, -1741930102);
                int i19 = onActivityLayout + 21;
                onMinimized = i19 % 128;
                int i20 = i19 % 2;
                return unit;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 83;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        if (i4 == 0) {
            return (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -2110114699, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, 2110114701);
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(JsResult jsResult, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 27;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(jsResult, dialogInterface);
        }
        onExtraCallbackWithResult(jsResult, dialogInterface);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(FragmentActivity fragmentActivity, setCircleColor setcirclecolor, Throwable th) {
        int i = 2 % 2;
        int i2 = onMinimized + 51;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -315028091, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{fragmentActivity, setcirclecolor, th}, 315028092);
        int i4 = onMinimized + 103;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(FragmentActivity fragmentActivity, setCircleColor setcirclecolor, IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel, shouldBeKeptAsChild shouldbekeptaschild) {
        int i = 2 % 2;
        int i2 = onMinimized + 1;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(fragmentActivity, setcirclecolor, iEngagementSignalsCallback_Parcel, shouldbekeptaschild);
        int i4 = onActivityLayout + 107;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 21;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(th);
        }
        IAuthTabCallback(th);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setCircleColor setcirclecolor, ArrayList arrayList, PermissionRequest permissionRequest, FragmentActivity fragmentActivity, shouldBeKeptAsChild shouldbekeptaschild) {
        int i = 2 % 2;
        int i2 = onMinimized + 41;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setcirclecolor, arrayList, permissionRequest, fragmentActivity, shouldbekeptaschild);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return unitOnNavigationEvent;
    }

    private setCircleColor(Context context, String str, onNavigationEvent onnavigationevent, WebViewContentOwner webViewContentOwner, boolean z) {
        String strOnWarmupCompleted;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_ParcelOnExtraCallback;
        IEngagementSignalsCallback_Parcel<WebChromeClient.FileChooserParams> iEngagementSignalsCallback_ParcelOnExtraCallback2;
        TextFieldKeyInputExternalSyntheticLambda9 lifecycle;
        this.onTransact = context;
        this.extraCallbackWithResult = str;
        this.access000 = onnavigationevent;
        this.IAuthTabCallback_Parcel = webViewContentOwner;
        this.IAuthTabCallback = z;
        this.writeTypedObject = new Function1() { // from class: im.toss.core.webkit.TossWebChromeClient$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 13;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = setCircleColor.onWarmupCompleted(((Integer) obj).intValue());
                if (i3 != 0) {
                    int i4 = 31 / 0;
                }
                int i5 = onNavigationEvent + 79;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        };
        int andIncrement = onWarmupCompleted.getAndIncrement();
        this.extraCallback = andIncrement;
        Integer numValueOf = null;
        IEngagementSignalsCallbackStubProxy iEngagementSignalsCallbackStubProxyOnNavigationEvent = onnavigationevent != null ? onnavigationevent.onNavigationEvent() : null;
        this.readTypedObject = iEngagementSignalsCallbackStubProxyOnNavigationEvent;
        if (onnavigationevent != null) {
            int i = onMinimized + 97;
            onActivityLayout = i % 128;
            int i2 = i % 2;
            strOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
        } else {
            int i3 = 2 % 2;
            strOnWarmupCompleted = null;
        }
        this.getInterfaceDescriptor = strOnWarmupCompleted;
        if (iEngagementSignalsCallbackStubProxyOnNavigationEvent != null) {
            iEngagementSignalsCallback_ParcelOnExtraCallback = iEngagementSignalsCallbackStubProxyOnNavigationEvent.onExtraCallback("toss_web_chrome_image_chooser_" + andIncrement, new IPostMessageService_Parcel.asInterface(), new onSessionEnded() { // from class: im.toss.core.webkit.TossWebChromeClient$$ExternalSyntheticLambda5
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final void onActivityResult(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = onNavigationEvent + 13;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    setCircleColor.onExtraCallbackWithResult(this.f$0, (IEngagementSignalsCallbackDefault) obj);
                    int i7 = onExtraCallback + 49;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 24 / 0;
                    }
                }
            });
            int i4 = 2 % 2;
        } else {
            int i5 = 2 % 2;
            iEngagementSignalsCallback_ParcelOnExtraCallback = null;
        }
        this.access100 = iEngagementSignalsCallback_ParcelOnExtraCallback;
        if (iEngagementSignalsCallbackStubProxyOnNavigationEvent != null) {
            iEngagementSignalsCallback_ParcelOnExtraCallback2 = iEngagementSignalsCallbackStubProxyOnNavigationEvent.onExtraCallback("toss_web_chrome_file_chooser_" + andIncrement, new onExtraCallbackWithResult(), new onSessionEnded() { // from class: im.toss.core.webkit.TossWebChromeClient$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final void onActivityResult(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallback + 55;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    setCircleColor setcirclecolor = this.f$0;
                    Uri[] uriArr = (Uri[]) obj;
                    if (i8 == 0) {
                        setCircleColor.onExtraCallbackWithResult(setcirclecolor, uriArr);
                        return;
                    }
                    setCircleColor.onExtraCallbackWithResult(setcirclecolor, uriArr);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
        } else {
            int i6 = 2 % 2;
            iEngagementSignalsCallback_ParcelOnExtraCallback2 = null;
        }
        this.asInterface = iEngagementSignalsCallback_ParcelOnExtraCallback2;
        if (onnavigationevent != null) {
            int i7 = onMinimized + 27;
            onActivityLayout = i7 % 128;
            if (i7 % 2 == 0) {
                onnavigationevent.onExtraCallbackWithResult();
                numValueOf.hashCode();
                throw null;
            }
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
            if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult != null && (lifecycle = textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult.getLifecycle()) != null) {
                lifecycle.IAuthTabCallback(new LifecycleEventObserver() { // from class: im.toss.core.webkit.TossWebChromeClient$$ExternalSyntheticLambda7
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                        int i8 = 2 % 2;
                        int i9 = onWarmupCompleted + 119;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 == 0) {
                            Object[] objArr = {this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult};
                            setCircleColor.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 636776881, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, -636776873);
                            int i10 = 37 / 0;
                        } else {
                            Object[] objArr2 = {this.f$0, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult};
                            setCircleColor.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 636776881, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr2, -636776873);
                        }
                        int i11 = IAuthTabCallback + 35;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                    }
                });
            }
        }
        FragmentActivity fragmentActivityOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (fragmentActivityOnExtraCallbackWithResult != null) {
            int i8 = onMinimized + 103;
            onActivityLayout = i8 % 128;
            int i9 = i8 % 2;
            numValueOf = Integer.valueOf(fragmentActivityOnExtraCallbackWithResult.getRequestedOrientation());
        }
        this.IAuthTabCallbackStubProxy = numValueOf;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final TextFieldScrollKtExternalSyntheticLambda0 IAuthTabCallback;
        private final String onExtraCallback;
        private final IEngagementSignalsCallbackStubProxy onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = onWarmupCompleted + 93;
                onExtraCallbackWithResult = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(obj instanceof onNavigationEvent)) {
                int i3 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            if (Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                return Intrinsics.areEqual(this.IAuthTabCallback, onnavigationevent.IAuthTabCallback) && Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback);
            }
            int i5 = onExtraCallbackWithResult;
            int i6 = i5 + 109;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 17;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            return i3 != 0 ? (((iHashCode % 127) / this.IAuthTabCallback.hashCode()) * 74) >> this.onExtraCallback.hashCode() : (((iHashCode * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onExtraCallback.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "FileUploadConfig(registry=" + this.onNavigationEvent + ", lifecycleOwner=" + this.IAuthTabCallback + ", fileProviderAuthority=" + this.onExtraCallback + ")";
            int i2 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public onNavigationEvent(@NotNull IEngagementSignalsCallbackStubProxy iEngagementSignalsCallbackStubProxy, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull String str) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackStubProxy, "");
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.onNavigationEvent = iEngagementSignalsCallbackStubProxy;
            this.IAuthTabCallback = textFieldScrollKtExternalSyntheticLambda0;
            this.onExtraCallback = str;
        }

        public final IEngagementSignalsCallbackStubProxy onNavigationEvent() {
            IEngagementSignalsCallbackStubProxy iEngagementSignalsCallbackStubProxy;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 81;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                iEngagementSignalsCallbackStubProxy = this.onNavigationEvent;
                int i4 = 64 / 0;
            } else {
                iEngagementSignalsCallbackStubProxy = this.onNavigationEvent;
            }
            int i5 = i2 + 53;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return iEngagementSignalsCallbackStubProxy;
        }

        public final TextFieldScrollKtExternalSyntheticLambda0 onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.IAuthTabCallback;
            int i5 = i3 + 29;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return textFieldScrollKtExternalSyntheticLambda0;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            int i3 = 2 / 0;
            return this.onExtraCallback;
        }
    }

    public static final class onWarmupCompleted {
        private static int asBinder = 1;
        private static int onTransact;
        private final Context IAuthTabCallback;
        private final WebViewContentOwner onExtraCallback;
        private final onNavigationEvent onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i2 = onTransact + 81;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback) || !Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) || !Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback)) {
                return false;
            }
            if (this.onNavigationEvent == onwarmupcompleted.onNavigationEvent) {
                return true;
            }
            int i4 = asBinder + 83;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.IAuthTabCallback.hashCode();
            int iHashCode3 = this.onWarmupCompleted.hashCode();
            onNavigationEvent onnavigationevent = this.onExtraCallbackWithResult;
            int iHashCode4 = 0;
            if (onnavigationevent == null) {
                int i2 = asBinder + 69;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = onnavigationevent.hashCode();
            }
            WebViewContentOwner webViewContentOwner = this.onExtraCallback;
            if (webViewContentOwner != null) {
                int i4 = asBinder + 23;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    webViewContentOwner.hashCode();
                    throw null;
                }
                iHashCode4 = webViewContentOwner.hashCode();
                int i5 = onTransact + 5;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
            }
            return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + iHashCode4) * 31) + Boolean.hashCode(this.onNavigationEvent);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Config(context=" + this.IAuthTabCallback + ", ownerTag=" + this.onWarmupCompleted + ", fileUploadConfig=" + this.onExtraCallbackWithResult + ", fullScreenOwner=" + this.onExtraCallback + ", autoGrantGeolocationPermission=" + this.onNavigationEvent + ")";
            int i2 = onTransact + 19;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(@NotNull Context context, @NotNull String str, @Nullable onNavigationEvent onnavigationevent, @Nullable WebViewContentOwner webViewContentOwner, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback = context;
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = onnavigationevent;
            this.onExtraCallback = webViewContentOwner;
            this.onNavigationEvent = z;
        }

        public final Context onWarmupCompleted() {
            Context context;
            int i = 2 % 2;
            int i2 = onTransact + 89;
            int i3 = i2 % 128;
            asBinder = i3;
            if (i2 % 2 == 0) {
                context = this.IAuthTabCallback;
                int i4 = 14 / 0;
            } else {
                context = this.IAuthTabCallback;
            }
            int i5 = i3 + 87;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return context;
        }

        public final String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 73;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 55;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return str;
        }

        public final onNavigationEvent onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact + 107;
            int i3 = i2 % 128;
            asBinder = i3;
            int i4 = i2 % 2;
            onNavigationEvent onnavigationevent = this.onExtraCallbackWithResult;
            int i5 = i3 + 91;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final WebViewContentOwner onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 37;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            WebViewContentOwner webViewContentOwner = this.onExtraCallback;
            int i4 = i3 + 25;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return webViewContentOwner;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 15;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i2 + 81;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 22 / 0;
            }
            return z;
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 24, 19627 - ((Process.getThreadPriority(0) + 20) >> 6), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onPostMessage ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 58, KeyEvent.getDeadChar(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        int i4 = $11 + 67;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i6 = $10 + 13;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), View.MeasureSpec.getMode(0) + 59, (ViewConfiguration.getJumpTapTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 59 - KeyEvent.getDeadChar(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setCircleColor(@NotNull onWarmupCompleted onwarmupcompleted) {
        this(onwarmupcompleted.onWarmupCompleted(), onwarmupcompleted.IAuthTabCallback(), onwarmupcompleted.onNavigationEvent(), onwarmupcompleted.onExtraCallback(), onwarmupcompleted.onExtraCallbackWithResult());
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        private WebViewContentOwner IAuthTabCallback;
        private onNavigationEvent onExtraCallback;
        private final Context onExtraCallbackWithResult;
        private boolean onNavigationEvent;
        private final String onWarmupCompleted;

        public onExtraCallback(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = context;
            this.onWarmupCompleted = str;
        }

        public final onExtraCallback onExtraCallbackWithResult(@NotNull IEngagementSignalsCallbackStubProxy iEngagementSignalsCallbackStubProxy, @NotNull TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, @NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackStubProxy, "");
            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallback = new onNavigationEvent(iEngagementSignalsCallbackStubProxy, textFieldScrollKtExternalSyntheticLambda0, str);
            int i2 = IAuthTabCallbackDefault + 21;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 0 / 0;
            }
            return this;
        }

        public final onExtraCallback onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 43;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(webViewContentOwner, "");
            this.IAuthTabCallback = webViewContentOwner;
            int i4 = IAuthTabCallbackDefault + 21;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final onExtraCallback onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 63;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            this.onNavigationEvent = true;
            int i5 = i2 + 65;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final setCircleColor onWarmupCompleted() {
            int i = 2 % 2;
            setCircleColor setcirclecolor = new setCircleColor(this.onExtraCallbackWithResult, this.onWarmupCompleted, this.onExtraCallback, this.IAuthTabCallback, this.onNavigationEvent, null);
            int i2 = asInterface + 39;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return setcirclecolor;
        }

        public final onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.onExtraCallbackWithResult, this.onWarmupCompleted, this.onExtraCallback, this.IAuthTabCallback, this.onNavigationEvent);
            int i2 = IAuthTabCallbackDefault + 115;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        int i2 = onMinimized + 49;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull Function1<? super Integer, Unit> function1) {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.writeTypedObject = function1;
        int i4 = onActivityLayout + 7;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallbackWithResult(@Nullable flipCamera flipcamera) {
        int i = 2 % 2;
        int i2 = onMinimized + 49;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        this.onMessageChannelReady = flipcamera;
        if (i4 == 0) {
            int i5 = 30 / 0;
        }
        int i6 = i3 + 5;
        onMinimized = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 61;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        this.ICustomTabsCallback = z;
        int i5 = i3 + 59;
        onActivityLayout = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 7;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = onMinimized + 97;
        onActivityLayout = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(setCircleColor setcirclecolor, List list) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 89;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(list);
        Object[] objArr = {setcirclecolor, (Uri[]) list.toArray(new Uri[0])};
        onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, 497150923);
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 89;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 93;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onMinimized + 23;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onNavigationEvent(setCircleColor setcirclecolor, Throwable th) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onMinimized + 23;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{setcirclecolor, null}, 497150923);
            unit = Unit.INSTANCE;
            int i3 = 93 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            onWarmupCompleted(iOnExtraCallbackWithResult3, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{setcirclecolor, null}, 497150923);
            unit = Unit.INSTANCE;
        }
        int i4 = onMinimized + 57;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r14 = r14.onExtraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r14 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r14 = r14.getDataString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r14 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r1 = o.setCircleColor.onMinimized + 21;
        o.setCircleColor.onActivityLayout = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        r1 = new android.net.Uri[0];
        r1[0] = android.net.Uri.parse(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r1 = new android.net.Uri[]{android.net.Uri.parse(r14)};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r14 = r13.IAuthTabCallbackStub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r14 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        r1 = o.setCircleColor.onActivityLayout + 103;
        o.setCircleColor.onMinimized = r1 % 128;
        r1 = r1 % 2;
        r1 = new android.net.Uri[]{r14};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        r14 = new o.unzip(r13.onTransact, 0, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        r1 = kotlin.collections.ArraysKt.toList(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        r1 = kotlin.collections.CollectionsKt.emptyList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r2 = o.setCircleColor.onMinimized + 51;
        o.setCircleColor.onActivityLayout = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        r14 = r14.onNavigationEvent(r1);
        r0 = new im.toss.core.webkit.TossWebChromeClient$$ExternalSyntheticLambda16(r13);
        r1 = new im.toss.core.webkit.TossWebChromeClient$$ExternalSyntheticLambda17(r0);
        r0 = new im.toss.core.webkit.TossWebChromeClient$$ExternalSyntheticLambda18(r13);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r14.onNavigationEvent(r1, new im.toss.core.webkit.TossWebChromeClient$$ExternalSyntheticLambda19(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        onWarmupCompleted(im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new java.lang.Object[]{r13, null}, 497150923);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r14.onNavigationEvent() != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r14.onNavigationEvent() != (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        onWarmupCompleted(im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), im.toss.tosssecurities.features.main.ui.TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new java.lang.Object[]{r13, null}, 497150923);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final setCircleColor setcirclecolor, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onMinimized + 105;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
            int i3 = 85 / 0;
        } else {
            Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        }
    }

    private static final void onExtraCallback(setCircleColor setcirclecolor, Uri[] uriArr) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 11;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uriArr, "");
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{setcirclecolor, uriArr}, 497150923);
        int i4 = onActivityLayout + 3;
        onMinimized = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(setCircleColor setcirclecolor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onMinimized + 61;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY) {
            int i4 = onActivityLayout + 97;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            setcirclecolor.onNavigationEvent();
        }
    }

    private final FragmentActivity onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onMinimized + 35;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        WebViewContentOwner webViewContentOwner = this.IAuthTabCallback_Parcel;
        if (webViewContentOwner != null) {
            return webViewContentOwner.getActivity();
        }
        int i5 = i3 + 125;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        setCircleColor setcirclecolor = (setCircleColor) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 105;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        Object obj = null;
        WebViewContentOwner webViewContentOwner = setcirclecolor.IAuthTabCallback_Parcel;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        if (webViewContentOwner != null) {
            return webViewContentOwner.getWebView();
        }
        int i5 = i3 + 75;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(@Nullable WebView webView) throws Throwable {
        int i = 2 % 2;
        int i2 = onActivityLayout + 5;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(this.onTransact);
        if (activityIAuthTabCallback == null) {
            return;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "WebChromeClient", "onCloseWindow", access8100.onNavigationEvent(getWrite.IAuthTabCallback("activity", onVisit.IAuthTabCallback(activityIAuthTabCallback))), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        activityIAuthTabCallback.finish();
        int i4 = onActivityLayout + 63;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        JsResult jsResult = (JsResult) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityLayout + 53;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        jsResult.confirm();
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 63;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(String str, JsResult jsResult, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, (CommonModule_setLeftEdgeTouchEnabled.onExtraCallback) CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 408502489, new Object[]{commonModule_setLeftEdgeTouchEnabled, null, 1, null}, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -408502489, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.asBinder(new TossWebChromeClient$.ExternalSyntheticLambda0(jsResult));
        Unit unit = Unit.INSTANCE;
        int i2 = onActivityLayout + 5;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(@NotNull WebView webView, @NotNull String str, @NotNull String str2, @NotNull JsResult jsResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsResult, "");
        if (webView.getContext() instanceof Activity) {
            int i2 = onActivityLayout + 53;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            Context context = webView.getContext();
            Intrinsics.checkNotNull(context, "");
            if (!((Activity) context).isFinishing()) {
                Context context2 = webView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context2, new TossWebChromeClient$.ExternalSyntheticLambda15(str2, jsResult));
                return true;
            }
        }
        jsResult.confirm();
        int i4 = onMinimized + 43;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(@NotNull WebView webView, @NotNull String str, @NotNull String str2, @NotNull JsResult jsResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(jsResult, "");
        Context context = webView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(context, new TossWebChromeClient$.ExternalSyntheticLambda14(str2, jsResult));
        int i2 = onMinimized + 23;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    private static final Unit onExtraCallbackWithResult(JsResult jsResult, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 49;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            jsResult.confirm();
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        jsResult.confirm();
        Unit unit2 = Unit.INSTANCE;
        int i3 = onMinimized + 99;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onExtraCallbackWithResult(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 1;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.cancel();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        dialogInterface.cancel();
        int i3 = 67 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(JsResult jsResult, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onMinimized + 59;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        jsResult.cancel();
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 111;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, JsResult jsResult, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(new TossWebChromeClient$.ExternalSyntheticLambda22(jsResult))};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, commonModule_setLeftEdgeTouchEnabled.onNavigationEvent(new TossWebChromeClient$.ExternalSyntheticLambda23())};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(new TossWebChromeClient$.ExternalSyntheticLambda24(jsResult));
        Unit unit = Unit.INSTANCE;
        int i2 = onActivityLayout + 81;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(@NotNull WebView webView, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 25;
        onMinimized = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        super.onProgressChanged(webView, i);
        this.writeTypedObject.invoke(Integer.valueOf(i));
        int i5 = onMinimized + 101;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(@NotNull WebView webView, boolean z, boolean z2, @NotNull Message message) {
        WebView.WebViewTransport webViewTransport;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(message, "");
        Object obj = message.obj;
        if (obj instanceof WebView.WebViewTransport) {
            webViewTransport = (WebView.WebViewTransport) obj;
        } else {
            int i2 = onActivityLayout + 87;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            webViewTransport = null;
        }
        if (webViewTransport == null) {
            int i4 = onActivityLayout + 65;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.getSettings().setJavaScriptEnabled(true);
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(@Nullable String str, @Nullable GeolocationPermissions.Callback callback) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 19;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        super.onGeolocationPermissionsShowPrompt(str, callback);
        if (this.IAuthTabCallback && callback != null) {
            callback.invoke(str, true, false);
        }
        int i4 = onActivityLayout + 17;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(@Nullable View view, @Nullable WebChromeClient.CustomViewCallback customViewCallback) {
        View rootView;
        int i = 2 % 2;
        super.onShowCustomView(view, customViewCallback);
        FragmentActivity fragmentActivityOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (fragmentActivityOnExtraCallbackWithResult == null) {
            if (customViewCallback != null) {
                int i2 = onMinimized + 33;
                onActivityLayout = i2 % 128;
                if (i2 % 2 != 0) {
                    customViewCallback.onCustomViewHidden();
                    return;
                } else {
                    customViewCallback.onCustomViewHidden();
                    int i3 = 92 / 0;
                    return;
                }
            }
            return;
        }
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        TossCoreWebView tossCoreWebView = (TossCoreWebView) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 522950350, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -522950346);
        if (tossCoreWebView == null) {
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            return;
        }
        if (this.onActivityResized == null) {
            int i4 = onMinimized + 43;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            if (this.ICustomTabsCallback) {
                this.IAuthTabCallbackStubProxy = Integer.valueOf(fragmentActivityOnExtraCallbackWithResult.getRequestedOrientation());
                this.onActivityResized = view;
                this.IAuthTabCallbackDefault = customViewCallback;
                fragmentActivityOnExtraCallbackWithResult.setRequestedOrientation(-1);
                View view2 = this.onActivityResized;
                if (view2 != null) {
                    view2.setSystemUiVisibility(onExtraCallback);
                }
                fragmentActivityOnExtraCallbackWithResult.getWindow().setFlags(512, 512);
                View view3 = this.onActivityResized;
                if (view3 != null) {
                    int i6 = onMinimized + 75;
                    onActivityLayout = i6 % 128;
                    int i7 = i6 % 2;
                    view3.setBackgroundColor(-16777216);
                }
                int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                ViewGroup viewGroup = (ViewGroup) onWarmupCompleted(iOnExtraCallbackWithResult3, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1132640874, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{this, fragmentActivityOnExtraCallbackWithResult}, -1132640867);
                if (viewGroup != null) {
                    viewGroup.addView(this.onActivityResized, onExtraCallbackWithResult);
                    int i8 = 8;
                    if (Intrinsics.areEqual(viewGroup.getRootView(), tossCoreWebView.getRootView())) {
                        tossCoreWebView.setVisibility(8);
                        return;
                    }
                    int i9 = onActivityLayout + 55;
                    onMinimized = i9 % 128;
                    if (i9 % 2 != 0) {
                        rootView = tossCoreWebView.getRootView();
                        i8 = 89;
                    } else {
                        rootView = tossCoreWebView.getRootView();
                    }
                    rootView.setVisibility(i8);
                    return;
                }
                return;
            }
        }
        if (customViewCallback != null) {
            int i10 = onMinimized + 107;
            onActivityLayout = i10 % 128;
            if (i10 % 2 != 0) {
                customViewCallback.onCustomViewHidden();
            } else {
                customViewCallback.onCustomViewHidden();
                int i11 = 38 / 0;
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        int i = 2 % 2;
        FragmentActivity fragmentActivityOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (fragmentActivityOnExtraCallbackWithResult != null) {
            int i2 = onMinimized + 107;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
            TossCoreWebView tossCoreWebView = (TossCoreWebView) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 522950350, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -522950346);
            if (tossCoreWebView != null) {
                int iOnExtraCallbackWithResult3 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult4 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
                ViewGroup viewGroup = (ViewGroup) onWarmupCompleted(iOnExtraCallbackWithResult3, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1132640874, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{this, fragmentActivityOnExtraCallbackWithResult}, -1132640867);
                if (viewGroup != null && this.onActivityResized != null) {
                    if (Intrinsics.areEqual(viewGroup.getRootView(), tossCoreWebView.getRootView())) {
                        tossCoreWebView.setVisibility(0);
                        int i4 = onMinimized + 53;
                        onActivityLayout = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        tossCoreWebView.getRootView().setVisibility(0);
                    }
                    fragmentActivityOnExtraCallbackWithResult.getWindow().clearFlags(512);
                    viewGroup.removeView(this.onActivityResized);
                    WebChromeClient.CustomViewCallback customViewCallback = this.IAuthTabCallbackDefault;
                    if (customViewCallback != null) {
                        int i6 = onActivityLayout + 37;
                        onMinimized = i6 % 128;
                        if (i6 % 2 != 0) {
                            customViewCallback.onCustomViewHidden();
                            throw null;
                        }
                        customViewCallback.onCustomViewHidden();
                    }
                    this.onActivityResized = null;
                    this.IAuthTabCallbackDefault = null;
                    Integer num = this.IAuthTabCallbackStubProxy;
                    if (num != null) {
                        fragmentActivityOnExtraCallbackWithResult.setRequestedOrientation(num.intValue());
                    }
                }
            }
        }
        int i7 = onMinimized + 87;
        onActivityLayout = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onShowFileChooser(@NotNull WebView webView, @NotNull ValueCallback<Uri[]> valueCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webView, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        Intrinsics.checkNotNullParameter(fileChooserParams, "");
        IEngagementSignalsCallback_Parcel<WebChromeClient.FileChooserParams> iEngagementSignalsCallback_Parcel = this.asInterface;
        if (iEngagementSignalsCallback_Parcel == null) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        ValueCallback<Uri[]> valueCallback2 = this.asBinder;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        this.asBinder = valueCallback;
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        Intrinsics.checkNotNullExpressionValue(acceptTypes, "");
        ArrayList arrayList = new ArrayList();
        int length = acceptTypes.length;
        int i2 = 0;
        while (i2 < length) {
            String strOnWarmupCompleted = acceptTypes[i2];
            Intrinsics.checkNotNull(strOnWarmupCompleted);
            if (StringsKt.startsWith$default(strOnWarmupCompleted, '.', false, 2, (Object) null)) {
                strOnWarmupCompleted = Companion.onWarmupCompleted(strOnWarmupCompleted);
            }
            if (strOnWarmupCompleted != null) {
                arrayList.add(strOnWarmupCompleted);
            }
            i2++;
            int i3 = onActivityLayout + 39;
            onMinimized = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 5;
            }
        }
        if (!arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i5 = onMinimized + 47;
                    onActivityLayout = i5 % 128;
                    if (i5 % 2 == 0) {
                        if (StringsKt.startsWith$default((String) it.next(), "image/", false, 2, (Object) null)) {
                        }
                    } else if (StringsKt.startsWith$default((String) it.next(), "image/", false, 2, (Object) null)) {
                    }
                }
                if (onExtraCallback()) {
                    int i6 = onActivityLayout + 35;
                    onMinimized = i6 % 128;
                    return i6 % 2 == 0;
                }
            } else if (onExtraCallback()) {
            }
        }
        try {
            iEngagementSignalsCallback_Parcel.onNavigationEvent(fileChooserParams);
        } catch (ActivityNotFoundException e) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String[] acceptTypes2 = fileChooserParams.getAcceptTypes();
            Intrinsics.checkNotNullExpressionValue(acceptTypes2, "");
            convertFloatArrayToByteArray.onExtraCallbackWithResult("TossWebChromeClient", "error in onShowFileChooser", e, access8100.onNavigationEvent(getWrite.IAuthTabCallback("acceptTypes", ArraysKt.joinToString$default(acceptTypes2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null))));
            Context context = webView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            onIconClick.onExtraCallbackWithResult(context, "실행 가능한 파일 관리 앱이 없습니다.", 0, 2, null);
            onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{this, null}, 497150923);
        }
        return true;
    }

    private final boolean onExtraCallback() {
        FragmentActivity fragmentActivity;
        int i = 2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.access100;
        if (iEngagementSignalsCallback_Parcel == null) {
            int i2 = onMinimized + 37;
            onActivityLayout = i2 % 128;
            return i2 % 2 == 0;
        }
        FragmentActivity fragmentActivity2 = this.onTransact;
        if (!(fragmentActivity2 instanceof FragmentActivity)) {
            fragmentActivity = null;
        } else {
            int i3 = onMinimized + 13;
            onActivityLayout = i3 % 128;
            int i4 = i3 % 2;
            fragmentActivity = fragmentActivity2;
        }
        if (fragmentActivity == null) {
            return false;
        }
        getByteBuffer<shouldBeKeptAsChild> getbytebufferOnTransact = new RxPermissions(fragmentActivity).onTransact("android.permission.CAMERA");
        Intrinsics.checkNotNullExpressionValue(getbytebufferOnTransact, "");
        setMessageBytes.onExtraCallbackWithResult(getbytebufferOnTransact, new TossWebChromeClient$.ExternalSyntheticLambda2(fragmentActivity, this), (Function0) null, new TossWebChromeClient$.ExternalSyntheticLambda3(fragmentActivity, this, iEngagementSignalsCallback_Parcel), 2, (Object) null);
        return true;
    }

    private static final void onExtraCallback(FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + fragmentActivity.getPackageName()));
        fragmentActivity.startActivity(intent);
        dialogInterface.dismiss();
        int i3 = onMinimized + 15;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void onWarmupCompleted(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = onMinimized + 65;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        dialogInterface.dismiss();
        if (i4 == 0) {
            int i5 = 42 / 0;
        }
        int i6 = onMinimized + 75;
        onActivityLayout = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(FragmentActivity fragmentActivity, setCircleColor setcirclecolor, IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel, shouldBeKeptAsChild shouldbekeptaschild) {
        File fileOnExtraCallback;
        Intent[] intentArr;
        int i = 2 % 2;
        Intent intent = null;
        if (shouldbekeptaschild.onNavigationEvent) {
            Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
            if (intent2.resolveActivity(fragmentActivity.getPackageManager()) != null) {
                try {
                    fileOnExtraCallback = AFj1qSDK.onNavigationEvent.onExtraCallback(fragmentActivity);
                } catch (IOException unused) {
                    boolean z = setcirclecolor.onNavigationEvent;
                    fileOnExtraCallback = null;
                }
                if (fileOnExtraCallback != null) {
                    int i2 = onMinimized + 87;
                    onActivityLayout = i2 % 128;
                    int i3 = i2 % 2;
                    String str = setcirclecolor.getInterfaceDescriptor;
                    if (str != null) {
                        Uri uriForFile = FileProvider.getUriForFile(fragmentActivity, str, fileOnExtraCallback);
                        setcirclecolor.IAuthTabCallbackStub = uriForFile;
                        Intrinsics.checkNotNull(intent2.putExtra("output", uriForFile));
                        int i4 = onActivityLayout + 53;
                        onMinimized = i4 % 128;
                        int i5 = i4 % 2;
                        intent = intent2;
                    }
                }
                Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
                intent3.addCategory("android.intent.category.OPENABLE");
                intent3.setType("image/*");
                if (intent == null) {
                    int i6 = onMinimized + 63;
                    onActivityLayout = i6 % 128;
                    int i7 = i6 % 2;
                    intentArr = new Intent[]{intent};
                } else {
                    intentArr = new Intent[0];
                }
                Intent intent4 = new Intent("android.intent.action.CHOOSER");
                intent4.putExtra("android.intent.extra.INTENT", intent3);
                intent4.putExtra("android.intent.extra.TITLE", "사진 선택");
                intent4.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
                iEngagementSignalsCallback_Parcel.onNavigationEvent(intent4);
                int i8 = onActivityLayout + 81;
                onMinimized = i8 % 128;
                int i9 = i8 % 2;
            } else {
                intent = intent2;
                Intent intent32 = new Intent("android.intent.action.GET_CONTENT");
                intent32.addCategory("android.intent.category.OPENABLE");
                intent32.setType("image/*");
                if (intent == null) {
                }
                Intent intent42 = new Intent("android.intent.action.CHOOSER");
                intent42.putExtra("android.intent.extra.INTENT", intent32);
                intent42.putExtra("android.intent.extra.TITLE", "사진 선택");
                intent42.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
                iEngagementSignalsCallback_Parcel.onNavigationEvent(intent42);
                int i82 = onActivityLayout + 81;
                onMinimized = i82 % 128;
                int i92 = i82 % 2;
            }
        } else if (shouldbekeptaschild.onExtraCallbackWithResult) {
            onIconClick.onExtraCallbackWithResult(fragmentActivity, "카메라 권한이 필요합니다.", 0, 2, null);
            Uri uri = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(uri, "");
            onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{setcirclecolor, new Uri[]{uri}}, 497150923);
        } else {
            ((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), new Object[]{TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback((TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) TdsDialogV1.Companion.onExtraCallback(fragmentActivity).onExtraCallbackWithResult("설정에서 카메라 권한을 수락해주세요."), "설정", new TossWebChromeClient$.ExternalSyntheticLambda20(fragmentActivity), (TdsButtonV1View.asInterface) null, false, 12, (Object) null), "취소", new TossWebChromeClient$.ExternalSyntheticLambda21(), null, false, 12, null}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), -1871975236, 1871975236, JsParamKeys.onExtraCallbackWithResult())).readTypedObject();
            Uri uri2 = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(uri2, "");
            onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{setcirclecolor, new Uri[]{uri2}}, 497150923);
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        FragmentActivity fragmentActivity = (FragmentActivity) objArr[0];
        setCircleColor setcirclecolor = (setCircleColor) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        onIconClick.onExtraCallbackWithResult(fragmentActivity, "카메라 권한을 요청하는 도중 오류가 발생했습니다.", 0, 2, null);
        Uri uri = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(uri, "");
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{setcirclecolor, new Uri[]{uri}}, 497150923);
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 109;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        setCircleColor setcirclecolor = (setCircleColor) objArr[0];
        Uri[] uriArr = (Uri[]) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 23;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        ValueCallback<Uri[]> valueCallback = setcirclecolor.asBinder;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
        }
        setcirclecolor.asBinder = null;
        int i4 = onMinimized + 85;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return null;
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 91;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.access100;
        if (iEngagementSignalsCallback_Parcel != null) {
            iEngagementSignalsCallback_Parcel.onWarmupCompleted();
        }
        IEngagementSignalsCallback_Parcel<WebChromeClient.FileChooserParams> iEngagementSignalsCallback_Parcel2 = this.asInterface;
        if (iEngagementSignalsCallback_Parcel2 != null) {
            int i4 = onMinimized + 105;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            iEngagementSignalsCallback_Parcel2.onWarmupCompleted();
            if (i5 == 0) {
                int i6 = 63 / 0;
            }
            int i7 = onActivityLayout + 35;
            onMinimized = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private final String onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = onMinimized + 117;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = str.hashCode();
        Object obj = null;
        if (iHashCode != 463403621) {
            if (iHashCode != 1069496794) {
                int i4 = onActivityLayout + 95;
                onMinimized = i4 % 128;
                if (i4 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (iHashCode == 1831139720 && str.equals("android.permission.RECORD_AUDIO")) {
                    return "마이크";
                }
            } else if (str.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                int i5 = onMinimized + 65;
                onActivityLayout = i5 % 128;
                if (i5 % 2 != 0) {
                    return "보호된 미디어";
                }
                obj.hashCode();
                throw null;
            }
        } else if (str.equals("android.permission.CAMERA")) {
            return "카메라";
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        setCircleColor setcirclecolor = (setCircleColor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 105;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            String strOnWarmupCompleted = setcirclecolor.onWarmupCompleted(str);
            if (strOnWarmupCompleted != null) {
                return strOnWarmupCompleted + " 사용 권한이 필요합니다.";
            }
            int i3 = onActivityLayout + 3;
            onMinimized = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 94 / 0;
            }
            return null;
        }
        setcirclecolor.onWarmupCompleted(str);
        throw null;
    }

    private final String IAuthTabCallback(List<String> list) {
        String str;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int i2 = onActivityLayout + 85;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            String strOnWarmupCompleted = onWarmupCompleted((String) it.next());
            if (strOnWarmupCompleted != null) {
                arrayList.add(strOnWarmupCompleted);
                int i4 = onActivityLayout + 111;
                onMinimized = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i6 = onMinimized + 75;
        onActivityLayout = i6 % 128;
        if (i6 % 2 == 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("%s 권한이 필요합니다.\n설정에서 권한을 허용해주세요.", Arrays.copyOf(new Object[]{arrayList}, 0));
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format("%s 권한이 필요합니다.\n설정에서 권한을 허용해주세요.", Arrays.copyOf(new Object[]{arrayList}, 1));
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onMinimized + 89;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        int i5 = onActivityLayout + 69;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(@NotNull PermissionRequest permissionRequest) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(permissionRequest, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String[] resources = permissionRequest.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        int length = resources.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                onExtraCallbackWithResult(permissionRequest, arrayList, arrayList2.isEmpty());
                if (arrayList2.isEmpty()) {
                    permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
                    return;
                }
                Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(this.onTransact);
                str = activityIAuthTabCallback instanceof FragmentActivity ? (FragmentActivity) activityIAuthTabCallback : null;
                if (str != null) {
                    RxPermissions rxPermissions = new RxPermissions((FragmentActivity) str);
                    String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                    rxPermissions.onTransact((String[]) Arrays.copyOf(strArr, strArr.length)).onExtraCallbackWithResult(new TossWebChromeClient$.ExternalSyntheticLambda11(new TossWebChromeClient$.ExternalSyntheticLambda10(this, arrayList2, permissionRequest, str)), new TossWebChromeClient$.ExternalSyntheticLambda13(new TossWebChromeClient$.ExternalSyntheticLambda12()));
                    return;
                }
                return;
            }
            String str = resources[i2];
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1660821873) {
                    if (iHashCode != 968612586) {
                        int i3 = onActivityLayout + 11;
                        onMinimized = i3 % 128;
                        int i4 = i3 % 2;
                        if (iHashCode == 1069496794 && str.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                            str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                        }
                    } else if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                        int i5 = onActivityLayout + 29;
                        onMinimized = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 3 / 2;
                        }
                        str = "android.permission.RECORD_AUDIO";
                    }
                } else if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    str = "android.permission.CAMERA";
                } else {
                    int i7 = onMinimized + 89;
                    onActivityLayout = i7 % 128;
                    if (i7 % 2 == 0) {
                        str.hashCode();
                        throw null;
                    }
                }
            }
            if (str != null) {
                if (ContextCompat.checkSelfPermission(this.onTransact, str) == 0) {
                    int i8 = onMinimized + 11;
                    onActivityLayout = i8 % 128;
                    int i9 = i8 % 2;
                    arrayList.add(str);
                } else {
                    arrayList2.add(str);
                    int i10 = onActivityLayout + 35;
                    onMinimized = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
            i2++;
        }
    }

    private static final Unit onWarmupCompleted(FragmentActivity fragmentActivity, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + fragmentActivity.getPackageName()));
        fragmentActivity.startActivity(intent);
        dialogInterface.dismiss();
        Unit unit = Unit.INSTANCE;
        int i2 = onMinimized + 111;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(DialogInterface dialogInterface) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onActivityLayout + 67;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.cancel();
            unit = Unit.INSTANCE;
            int i3 = 12 / 0;
        } else {
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            dialogInterface.cancel();
            unit = Unit.INSTANCE;
        }
        int i4 = onMinimized + 99;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(String str, FragmentActivity fragmentActivity, CommonModule_setLeftEdgeTouchEnabled commonModule_setLeftEdgeTouchEnabled) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonModule_setLeftEdgeTouchEnabled, "");
        commonModule_setLeftEdgeTouchEnabled.IAuthTabCallback(str);
        Object[] objArr = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, "허용하기", (TdsButtonV1View.asInterface) null, false, new TossWebChromeClient$.ExternalSyntheticLambda8(fragmentActivity), 6, (Object) null)};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 675760957, objArr, iOnExtraCallbackWithResult, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -675760947, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Object[] objArr2 = {commonModule_setLeftEdgeTouchEnabled, CommonModule_setLeftEdgeTouchEnabled.onExtraCallbackWithResult(commonModule_setLeftEdgeTouchEnabled, "다음에", (TdsButtonV1View.asInterface) null, false, new TossWebChromeClient$.ExternalSyntheticLambda9(), 6, (Object) null)};
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        CommonModule_setLeftEdgeTouchEnabled.onExtraCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), -1565757672, objArr2, iOnExtraCallbackWithResult2, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1565757675, RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i2 = onMinimized + 37;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(setCircleColor setcirclecolor, ArrayList arrayList, PermissionRequest permissionRequest, FragmentActivity fragmentActivity, shouldBeKeptAsChild shouldbekeptaschild) {
        String str;
        int i = 2 % 2;
        int i2 = onMinimized + 3;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0 ? shouldbekeptaschild.onNavigationEvent : shouldbekeptaschild.onNavigationEvent) {
            String str2 = shouldbekeptaschild.IAuthTabCallback;
            if (str2 == null) {
                str = null;
                if (str != null) {
                    int i3 = onMinimized + 115;
                    onActivityLayout = i3 % 128;
                    int i4 = i3 % 2;
                    String[] resources = permissionRequest.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "");
                    for (String str3 : resources) {
                        if (Intrinsics.areEqual(str3, str)) {
                            int i5 = onMinimized + 17;
                            onActivityLayout = i5 % 128;
                            if (i5 % 2 == 0) {
                                throw null;
                            }
                            if (str3 != null) {
                                permissionRequest.grant(new String[]{str3});
                            }
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            } else {
                int iHashCode = str2.hashCode();
                if (iHashCode != 463403621) {
                    if (iHashCode != 1069496794) {
                        if (iHashCode == 1831139720 && str2.equals("android.permission.RECORD_AUDIO")) {
                            int i6 = onMinimized + 21;
                            onActivityLayout = i6 % 128;
                            if (i6 % 2 == 0) {
                                throw null;
                            }
                            str = "android.webkit.resource.AUDIO_CAPTURE";
                        }
                        if (str != null) {
                        }
                    } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                        str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                        if (str != null) {
                        }
                    } else {
                        int i7 = onActivityLayout + 7;
                        onMinimized = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 13 / 0;
                        }
                        str = null;
                        if (str != null) {
                        }
                    }
                } else if (str2.equals("android.permission.CAMERA")) {
                    str = "android.webkit.resource.VIDEO_CAPTURE";
                    if (str != null) {
                    }
                } else {
                    int i9 = onActivityLayout;
                    int i10 = i9 + 15;
                    onMinimized = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 20 / 0;
                    }
                    int i12 = i9 + 121;
                    onMinimized = i12 % 128;
                    int i13 = i12 % 2;
                    str = null;
                    if (str != null) {
                    }
                }
            }
        } else if (shouldbekeptaschild.onExtraCallbackWithResult) {
            String str4 = shouldbekeptaschild.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(str4, "");
            String str5 = (String) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1432385506, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{setcirclecolor, str4}, -1432385496);
            if (str5 != null) {
                onIconClick.onExtraCallbackWithResult(fragmentActivity, str5, 0, 2, null);
                int i14 = onMinimized + 119;
                onActivityLayout = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 2 / 5;
                }
            }
        } else {
            String strIAuthTabCallback = setcirclecolor.IAuthTabCallback(arrayList);
            if (strIAuthTabCallback != null) {
                CommonModule_setScreenAwakeMode.onExtraCallbackWithResult(fragmentActivity, new TossWebChromeClient$.ExternalSyntheticLambda1(strIAuthTabCallback, fragmentActivity));
            }
        }
        return Unit.INSTANCE;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 19;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onActivityLayout + 113;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit IAuthTabCallback(Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onMinimized + 91;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("onPermissionRequest", th);
        Unit unit = Unit.INSTANCE;
        int i4 = onMinimized + 107;
        onActivityLayout = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(PermissionRequest permissionRequest, List<String> list, boolean z) throws Throwable {
        Uri uri;
        TossBridgeWebView tossBridgeWebView;
        Object obj;
        Activity activityIAuthTabCallback;
        String strIAuthTabCallback;
        String strIAuthTabCallbackStubProxy;
        int i = 2 % 2;
        flipCamera flipcamera = this.onMessageChannelReady;
        Object obj2 = null;
        if (flipcamera != null) {
            int i2 = onMinimized + 25;
            onActivityLayout = i2 % 128;
            if (i2 % 2 == 0) {
                flipcamera.onExtraCallbackWithResult();
                obj2.hashCode();
                throw null;
            }
            String strOnExtraCallbackWithResult = flipcamera.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                int i3 = onMinimized + 111;
                onActivityLayout = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{strOnExtraCallbackWithResult});
            } else {
                uri = null;
            }
        }
        flipCamera flipcamera2 = this.onMessageChannelReady;
        if (flipcamera2 instanceof TossBridgeWebView) {
            int i4 = onMinimized + 97;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            tossBridgeWebView = (TossBridgeWebView) flipcamera2;
        } else {
            tossBridgeWebView = null;
        }
        Uri uri2 = (tossBridgeWebView == null || (strIAuthTabCallbackStubProxy = tossBridgeWebView.IAuthTabCallbackStubProxy()) == null) ? null : (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{strIAuthTabCallbackStubProxy});
        String host = uri != null ? uri.getHost() : null;
        Object obj3 = this.onMessageChannelReady;
        View view = obj3 instanceof View ? (View) obj3 : null;
        if (view != null) {
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(PaddingKtExternalSyntheticLambda0.onExtraCallbackWithResult(view));
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (kotlin.Result.onExtraCallback(obj)) {
                int i6 = onActivityLayout + 41;
                onMinimized = i6 % 128;
                int i7 = i6 % 2;
                obj = null;
            }
            activityIAuthTabCallback = (Fragment) obj;
            if (activityIAuthTabCallback == null) {
                activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(this.onTransact);
            }
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("ownerTag", this.extraCallbackWithResult);
        Uri origin = permissionRequest.getOrigin();
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("origin", origin != null ? origin.toString() : null);
        Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("pageHost", host);
        Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("pagePath", uri != null ? uri.getPath() : null);
        Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("initialHost", uri2 != null ? uri2.getHost() : null);
        Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("initialPath", uri2 != null ? uri2.getPath() : null);
        Uri origin2 = permissionRequest.getOrigin();
        Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("isInTossDomains", Boolean.valueOf(origin2 != null && filterCreatePageParams.onTransact(origin2)));
        String[] resources = permissionRequest.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("requested", ArraysKt.joinToString$default(resources, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        Pair pairIAuthTabCallback9 = getWrite.IAuthTabCallback("alreadyGranted", CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        Pair pairIAuthTabCallback10 = getWrite.IAuthTabCallback("silentGrant", Boolean.valueOf(z));
        if (activityIAuthTabCallback != null) {
            strIAuthTabCallback = onVisit.IAuthTabCallback(activityIAuthTabCallback);
            int i8 = onActivityLayout + 29;
            onMinimized = i8 % 128;
            int i9 = i8 % 2;
        } else {
            strIAuthTabCallback = null;
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, "webview-permission-request", (String) null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, pairIAuthTabCallback4, pairIAuthTabCallback5, pairIAuthTabCallback6, pairIAuthTabCallback7, pairIAuthTabCallback8, pairIAuthTabCallback9, pairIAuthTabCallback10, getWrite.IAuthTabCallback("owner", strIAuthTabCallback)}), (String) null, false, (String) null, 58, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onConsoleMessage(@NotNull ConsoleMessage consoleMessage) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(consoleMessage, "");
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        int i2 = messageLevel == null ? -1 : IAuthTabCallbackStub.onExtraCallback[messageLevel.ordinal()];
        if (i2 != 1) {
            int i3 = onActivityLayout + 83;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
            if (i2 == 2) {
                String strMessage = consoleMessage.message();
                Intrinsics.checkNotNullExpressionValue(strMessage, "");
                Object obj = null;
                if (StringsKt.contains$default(strMessage, "CORS policy", false, 2, (Object) null)) {
                    int i5 = onMinimized + 69;
                    onActivityLayout = i5 % 128;
                    if (i5 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    flipCamera flipcamera = this.onMessageChannelReady;
                    String strOnExtraCallbackWithResult = flipcamera != null ? flipcamera.onExtraCallbackWithResult() : null;
                    Object[] objArr = new Object[1];
                    a(new char[]{20241, 50622, 23110, 53502}, (-16741725) - Color.rgb(0, 0, 0), objArr);
                    Set<String> setOnWarmupCompleted = clearFaultAdjacentMetadata.onWarmupCompleted(new String[]{((String) objArr[0]).intern()});
                    Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{strOnExtraCallbackWithResult});
                    if (uri != null) {
                        int i6 = onActivityLayout + 89;
                        onMinimized = i6 % 128;
                        if (i6 % 2 == 0 ? filterCreatePageParams.onWarmupCompleted(uri) : !filterCreatePageParams.onWarmupCompleted(uri)) {
                            int i7 = onMinimized + 99;
                            onActivityLayout = i7 % 128;
                            if (i7 % 2 == 0) {
                                setOnWarmupCompleted.add("bank");
                                throw null;
                            }
                            setOnWarmupCompleted.add("bank");
                        }
                    }
                    for (String str : setOnWarmupCompleted) {
                        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                        String strMessage2 = consoleMessage.message();
                        Object[] objArr2 = new Object[1];
                        a(new char[]{20231, 14637, 41796}, 30253 - Color.red(0), objArr2);
                        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, "webview-cors-error", strMessage2, null, access8100.onNavigationEvent(getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), strOnExtraCallbackWithResult)), null, str, false, 84, null);
                    }
                }
            }
        }
        return false;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Activity activity = (Activity) objArr[1];
        int i = 2 % 2;
        int i2 = onMinimized + 99;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        View viewFindViewById = activity.findViewById(R.id.content);
        if (i3 == 0) {
            boolean z = viewFindViewById instanceof ViewGroup;
            obj.hashCode();
            throw null;
        }
        if (!(viewFindViewById instanceof ViewGroup)) {
            return null;
        }
        int i4 = onMinimized + 113;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return (ViewGroup) viewFindViewById;
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }

        public final String onWarmupCompleted(@NotNull String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            String lowerCase = StringsKt.removePrefix(str, ".").toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
            int i4 = IAuthTabCallback + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 1 / 0;
            }
            return mimeTypeFromExtension;
        }
    }

    static {
        IAuthTabCallback();
        Companion = new IAuthTabCallback(null);
        onWarmupCompleted = new AtomicInteger(0);
        onExtraCallbackWithResult = new FrameLayout.LayoutParams(-1, -1, 17);
        onExtraCallback = 7942;
        int i = onRelationshipValidationResult + 119;
        ICustomTabsCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public static final class onExtraCallbackWithResult extends ITrustedWebActivityCallbackStub<WebChromeClient.FileChooserParams, Uri[]> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ Object onNavigationEvent(int i, Intent intent) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 7;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Uri[] uriArrOnExtraCallback = onExtraCallback(i, intent);
            int i5 = onExtraCallback + 37;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return uriArrOnExtraCallback;
            }
            throw null;
        }

        public /* bridge */ /* synthetic */ Intent onWarmupCompleted(Context context, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
            if (i2 % 2 == 0) {
                onWarmupCompleted(context, fileChooserParams);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Intent intentOnWarmupCompleted = onWarmupCompleted(context, fileChooserParams);
            int i3 = onExtraCallback + 5;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return intentOnWarmupCompleted;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[PHI: r9
          0x0035: PHI (r9v4 android.content.Intent) = (r9v1 android.content.Intent), (r9v5 android.content.Intent) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r9
          0x0033: PHI (r9v2 android.content.Intent) = (r9v1 android.content.Intent), (r9v5 android.content.Intent) binds: [B:8:0x0031, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Intent onWarmupCompleted(@NotNull Context context, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
            Intent intentCreateIntent;
            boolean z;
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(fileChooserParams, "");
                intentCreateIntent = fileChooserParams.createIntent();
                z = fileChooserParams.getMode() == 0;
            } else {
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(fileChooserParams, "");
                intentCreateIntent = fileChooserParams.createIntent();
                if (fileChooserParams.getMode() == 1) {
                }
            }
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            intentCreateIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
            if (acceptTypes.length > 1) {
                intentCreateIntent.setType("*/*");
                intentCreateIntent.putExtra("android.intent.extra.MIME_TYPES", acceptTypes);
            } else {
                String type = intentCreateIntent.getType();
                if (type != null) {
                    int i3 = onExtraCallbackWithResult + 109;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0 ? !StringsKt.startsWith$default(type, '.', false, 2, (Object) null) : !StringsKt.startsWith$default(type, 'N', true, 3, (Object) null)) {
                        int i4 = onExtraCallback + 27;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 94 / 0;
                        }
                        type = null;
                    }
                    if (type != null) {
                        String strOnWarmupCompleted = setCircleColor.Companion.onWarmupCompleted(type);
                        intentCreateIntent.setType(strOnWarmupCompleted != null ? strOnWarmupCompleted : "*/*");
                    }
                }
            }
            Intrinsics.checkNotNullExpressionValue(intentCreateIntent, "");
            return intentCreateIntent;
        }

        public Uri[] onExtraCallback(int i, @Nullable Intent intent) {
            int i2 = 2 % 2;
            ArrayList arrayList = new ArrayList();
            if (i == -1) {
                int i3 = onExtraCallback;
                int i4 = i3 + 41;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (intent != null) {
                    int i6 = i3 + 31;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                    ClipData clipData = intent.getClipData();
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        int i8 = onExtraCallback + 91;
                        onExtraCallbackWithResult = i8 % 128;
                        int i9 = i8 % 2;
                        for (int i10 = 0; i10 < itemCount; i10++) {
                            arrayList.add(clipData.getItemAt(i10).getUri());
                        }
                    } else {
                        Uri[] result = WebChromeClient.FileChooserParams.parseResult(i, intent);
                        if (result != null) {
                            CollectionsKt.addAll(arrayList, result);
                        }
                    }
                }
            }
            return (Uri[]) arrayList.toArray(new Uri[0]);
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setCircleColor setcirclecolor, TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 636776881, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{setcirclecolor, textFieldScrollKtExternalSyntheticLambda0, onextracallbackwithresult}, -636776873);
    }

    public static /* synthetic */ Unit onExtraCallback(DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1587678065, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{dialogInterface}, -1587678060);
    }

    public static /* synthetic */ Unit onExtraCallback(JsResult jsResult, DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1341545411, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{jsResult, dialogInterface}, 1341545411);
    }

    private final TossCoreWebView onWarmupCompleted() {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (TossCoreWebView) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 522950350, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, -522950346);
    }

    private final ViewGroup IAuthTabCallback(Activity activity) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (ViewGroup) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1132640874, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, activity}, -1132640867);
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1522347793, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{function1, obj}, -1522347787);
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1037181003, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{function1, obj}, 1037181012);
    }

    private static final Unit IAuthTabCallback(JsResult jsResult, DialogInterface dialogInterface) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1741930105, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{jsResult, dialogInterface}, -1741930102);
    }

    private final String onExtraCallback(String str) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), 1432385506, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, str}, -1432385496);
    }

    private static final Unit onNavigationEvent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -2110114699, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, 2110114701);
    }

    private final void onExtraCallback(Uri[] uriArr) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -497150912, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, uriArr}, 497150923);
    }

    private static final Unit onNavigationEvent(FragmentActivity fragmentActivity, setCircleColor setcirclecolor, Throwable th) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(iOnExtraCallbackWithResult, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -315028091, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{fragmentActivity, setcirclecolor, th}, 315028092);
    }

    static void IAuthTabCallback() {
        onPostMessage = 2062770973144369733L;
    }
}
