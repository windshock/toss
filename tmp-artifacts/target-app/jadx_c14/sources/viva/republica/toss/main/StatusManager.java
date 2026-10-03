package viva.republica.toss.main;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleEventObserver;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.define.TossAffiliate;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.TdsResultV0View;
import im.toss.utils.RxUtils;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.rx2.RxSingleKt;
import o.AdSettingsIntegrationErrorMode;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.DERSet;
import o.DERString;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.IPostMessageServiceStubProxy;
import o.IconRoundCornerProgressBarSavedState;
import o.JsonReaderErrorInfo;
import o.JsonReaderUnknownNumberParsing;
import o.NetConverter3;
import o.ParamUtils;
import o.SkiaImageRegionDecoder;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.UST_CERT_GetPublicKeyInfo;
import o.WebResourceResponseModel;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access14600;
import o.access15300;
import o.access15400;
import o.access27100;
import o.access27600;
import o.access4102;
import o.access4302;
import o.access8100;
import o.clearMessage;
import o.clearRevision;
import o.clearTid;
import o.deserializeDecimalCollection;
import o.deserializeFloat;
import o.deserializeFloatNullableCollection;
import o.deserializeInt;
import o.deserializeIntNullableCollection;
import o.deserializeIp;
import o.deserializeLongCollection;
import o.deserializeUriCollection;
import o.deserializeUriNullableCollection;
import o.enableIOSViewClipToPaddingBox;
import o.findRes;
import o.findResAndMsg;
import o.getAdService;
import o.getAdSizeApi;
import o.getByteBuffer;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getKekid;
import o.getPackageType;
import o.getPluginVersion;
import o.getSdkKey;
import o.getSpecialFeatureOptInStatus;
import o.getWrite;
import o.maybeRemoveAttachStateListener;
import o.maybeUpdateAnimatable;
import o.mergeParams;
import o.nSetPosition;
import o.onTextViewSizeChanged;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.readIntokhttp;
import o.setBaseDeeplink;
import o.setRandomHost;
import o.setResourceInternal;
import o.wasLastName;
import o.wasNull;
import o.writeRaw;
import o.zzaj;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.core.AppStateManager;
import viva.republica.toss.main.StatusManager;
import viva.republica.toss.service.PillarLabFragment;
import viva.republica.toss.util.RetryWithDelay;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class StatusManager {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int ICustomTabsCallback = 1;
    private static char[] extraCallback = null;
    private static int extraCallbackWithResult = 0;
    private static int onActivityLayout = 1;
    public static final int onExtraCallback;
    private static final Regex onExtraCallbackWithResult;
    private static final Set<WeakReference<StatusManager>> onNavigationEvent;
    private static char readTypedObject;
    private static int writeTypedObject;
    private final r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private deserializeUriCollection IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private final access27100<IAuthTabCallback> IAuthTabCallback_Parcel;
    private final boolean access000;
    private final onExtraCallback access100;
    private final String asBinder;
    private long asInterface;
    private final access27100<String> getInterfaceDescriptor;
    private String onTransact;
    private final TossAffiliate[] onWarmupCompleted;

    static final class getInterfaceDescriptor extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        getInterfaceDescriptor(access13800<? super getInterfaceDescriptor> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StatusManager.IAuthTabCallback(null, null, null, null, this);
        }
    }

    public interface onExtraCallback {
        void onRetry();
    }

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[access4102.values().length];
            try {
                iArr[access4102.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[access4102.NO_AFFILIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[access4102.KR_MAIN_HOME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[access4102.KR_SERVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[access4102.SKIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            onWarmupCompleted = iArr;
        }
    }

    public /* synthetic */ StatusManager(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onExtraCallback onextracallback, TossAffiliate[] tossAffiliateArr, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onextracallback, tossAffiliateArr, z);
    }

    public static /* synthetic */ Pair IAuthTabCallback(Function2 function2, Pair pair, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 33;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnExtraCallbackWithResult = onExtraCallbackWithResult(function2, pair, obj);
        int i4 = writeTypedObject + 49;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return pairOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(StatusManager statusManager, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(statusManager, bool);
        int i4 = ICustomTabsCallback + 73;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(StatusManager statusManager, Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 59;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(statusManager, pair);
        int i4 = writeTypedObject + 123;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(StatusManager statusManager, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(statusManager, deserializeurinullablecollection);
        int i4 = ICustomTabsCallback + 13;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 13;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -684058544, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), 684058562, iIAuthTabCallback2);
        int i4 = ICustomTabsCallback + 75;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        postMessage(function1, obj);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnWarmupCompleted = onWarmupCompleted(str);
        int i4 = ICustomTabsCallback + 119;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return pairOnWarmupCompleted;
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 1;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onUnminimized(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(th);
        int i4 = writeTypedObject + 67;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ boolean IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnRelationshipValidationResult = onRelationshipValidationResult(function1, obj);
        int i4 = writeTypedObject + 61;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return zOnRelationshipValidationResult;
    }

    public static /* synthetic */ void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 119;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1397873744, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), 1397873745, iIAuthTabCallback2);
        int i4 = ICustomTabsCallback + 109;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {th};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iIAuthTabCallback3, iIAuthTabCallback, -1330650354, objArr2, iIAuthTabCallback4, 1330650376, iIAuthTabCallback2);
        int i4 = ICustomTabsCallback + 51;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ void ICustomTabsCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1083609868, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), 1083609889, iIAuthTabCallback2);
        int i4 = ICustomTabsCallback + 33;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(bool);
        int i4 = ICustomTabsCallback + 119;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return Boolean.valueOf(zOnExtraCallbackWithResult);
    }

    public static /* synthetic */ JsonReaderErrorInfo access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        JsonReaderErrorInfo jsonReaderErrorInfoExtraCallback = extraCallback(function1, obj);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        int i5 = writeTypedObject + 57;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return jsonReaderErrorInfoExtraCallback;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 113;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallbackStub(function1, obj);
        int i4 = ICustomTabsCallback + 85;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        mayLaunchUrl(function1, obj);
        int i4 = writeTypedObject + 105;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
    }

    public static /* synthetic */ void extraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 73;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onActivityLayout(function1, obj);
        int i4 = writeTypedObject + 79;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 77;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallbackStubProxy(function1, obj);
        }
        ICustomTabsCallbackStubProxy(function1, obj);
        throw null;
    }

    public static /* synthetic */ Boolean onExtraCallback() {
        Boolean boolAsInterface;
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            boolAsInterface = asInterface();
            int i3 = 80 / 0;
        } else {
            boolAsInterface = asInterface();
        }
        int i4 = ICustomTabsCallback + 43;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return boolAsInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1560610031, new Object[]{statusManager, iAuthTabCallback}, R.drawable.IAuthTabCallback(), -1560610019, iIAuthTabCallback2);
        int i4 = writeTypedObject + 19;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Pair onExtraCallback(Pair pair, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 55;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(pair, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Pair pairIAuthTabCallback = IAuthTabCallback(pair, str);
        int i3 = ICustomTabsCallback + 89;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return pairIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(StatusManager statusManager, Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 59;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(statusManager, th);
        int i4 = ICustomTabsCallback + 43;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 85;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsCallback_Parcel(function1, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Pair pair = (Pair) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return Boolean.valueOf(onNavigationEvent(pair));
        }
        onNavigationEvent(pair);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(StatusManager statusManager, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 115;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            IAuthTabCallbackStub(statusManager, view);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(statusManager, view);
        int i3 = ICustomTabsCallback + 11;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(StatusManager statusManager, Pair pair) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1627433929, new Object[]{statusManager, pair}, R.drawable.IAuthTabCallback(), -1627433903, iIAuthTabCallback2);
        }
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(StatusManager statusManager, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -366757617, new Object[]{statusManager, onextracallbackwithresult}, R.drawable.IAuthTabCallback(), 366757636, iIAuthTabCallback2);
        int i4 = writeTypedObject + 53;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ deserializeIp onExtraCallbackWithResult(StatusManager statusManager, Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            return (deserializeIp) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1199042718, new Object[]{statusManager, th}, R.drawable.IAuthTabCallback(), -1199042712, iIAuthTabCallback2);
        }
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        deserializeIp deserializeip = (deserializeIp) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback3, 1199042718, new Object[]{statusManager, th}, R.drawable.IAuthTabCallback(), -1199042712, iIAuthTabCallback4);
        int i3 = 57 / 0;
        return deserializeip;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 63;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnActivityResized = onActivityResized(function1, obj);
        int i4 = ICustomTabsCallback + 85;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return zOnActivityResized;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        asInterface(statusManager, view);
        if (i3 != 0) {
            return null;
        }
        int i4 = 73 / 0;
        return null;
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 117;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(statusManager, view);
        int i4 = writeTypedObject + 49;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i3) | i7 | i2);
        int i9 = (~i2) | i7;
        int i10 = i8 | (~(i9 | i3)) | (~(i5 | i3 | i2));
        int i11 = ~i9;
        int i12 = (~(i2 | i5)) | i3 | i11;
        int i13 = (~(i7 | i3)) | i11;
        int i14 = i5 + i3 + i6 + (933655473 * i) + ((-1037598838) * i4);
        int i15 = i14 * i14;
        int i16 = (((-1556109539) * i5) - 925892608) + (470833381 * i3) + (i10 * (-1134012188)) + (1134012188 * i12) + ((-1134012188) * i13) + (1604845568 * i6) + ((-1691877376) * i) + ((-393216000) * i4) + ((-1633878016) * i15);
        int i17 = ((i5 * (-727610197)) - 1081761860) + (i3 * (-727608285)) + (i10 * 956) + (i12 * (-956)) + (i13 * 956) + (i6 * (-727609241)) + (i * 1532828727) + (i4 * (-747900794)) + (i15 * 556466176);
        switch (i16 + (i17 * i17 * (-1911357440))) {
            case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                return IAuthTabCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return onTransact(objArr);
            case 8:
                return asBinder(objArr);
            case 9:
                Function1 function1 = (Function1) objArr[0];
                Object obj = objArr[1];
                int i18 = 2 % 2;
                int i19 = ICustomTabsCallback + 37;
                writeTypedObject = i19 % 128;
                int i20 = i19 % 2;
                Intrinsics.checkNotNullParameter(obj, "");
                deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
                int i21 = writeTypedObject + 27;
                ICustomTabsCallback = i21 % 128;
                int i22 = i21 % 2;
                return deserializeip;
            case 10:
                return asInterface(objArr);
            case 11:
                return access100(objArr);
            case 12:
                return access000(objArr);
            case 13:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                return IAuthTabCallback_Parcel(objArr);
            case 16:
                return writeTypedObject(objArr);
            case 17:
                return ICustomTabsCallback(objArr);
            case 18:
                return readTypedObject(objArr);
            case 19:
                return extraCallback(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            case 21:
                return onActivityResized(objArr);
            case 22:
                return onPostMessage(objArr);
            case 23:
                return onActivityLayout(objArr);
            case 24:
                return onMessageChannelReady(objArr);
            case 25:
                return onMinimized(objArr);
            case 26:
                return ICustomTabsCallbackStubProxy(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ JsonReaderErrorInfo onNavigationEvent(StatusManager statusManager, Boolean bool) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(statusManager, bool);
        }
        onWarmupCompleted(statusManager, bool);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(StatusManager statusManager, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 41;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1690604496, new Object[]{statusManager, view}, R.drawable.IAuthTabCallback(), -1690604476, iIAuthTabCallback2);
        int i4 = writeTypedObject + 113;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 121;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(statusManager, view);
            throw null;
        }
        Unit unitOnTransact = onTransact(statusManager, view);
        int i3 = ICustomTabsCallback + 71;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ deserializeIp onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 101;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        deserializeIp deserializeip = (deserializeIp) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1430363707, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), 1430363716, iIAuthTabCallback2);
        int i4 = writeTypedObject + 91;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deserializeip;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 101;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ICustomTabsService(function1, obj);
        int i4 = ICustomTabsCallback + 91;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 115;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(th);
        int i4 = ICustomTabsCallback + 17;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(StatusManager statusManager, Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 53;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(statusManager, th);
        int i4 = ICustomTabsCallback + 75;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(StatusManager statusManager, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(statusManager, onextracallbackwithresult);
        int i4 = writeTypedObject + 63;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        isEngagementSignalsApiAvailable(function1, obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = writeTypedObject + 17;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(Boolean bool) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(bool);
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        int i5 = ICustomTabsCallback + 87;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return zOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Pair readTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            extraCommand(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Pair pairExtraCommand = extraCommand(function1, obj);
        int i3 = ICustomTabsCallback + 55;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return pairExtraCommand;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 91;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallback_Parcel<T1, T2, T3, T4, R> implements deserializeInt<T1, T2, T3, T4, R> {
        /* JADX WARN: Multi-variable type inference failed */
        public final R onWarmupCompleted(@NotNull T1 t1, @NotNull T2 t2, @NotNull T3 t3, @NotNull T4 t4) {
            Intrinsics.checkParameterIsNotNull(t1, "");
            Intrinsics.checkParameterIsNotNull(t2, "");
            Intrinsics.checkParameterIsNotNull(t3, "");
            Intrinsics.checkParameterIsNotNull(t4, "");
            PillarLabFragment.IAuthTabCallback.onExtraCallback onextracallback = (PillarLabFragment.IAuthTabCallback) t4;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) t3;
            return (R) new onExtraCallbackWithResult(!((Boolean) t1).booleanValue() || iAuthTabCallback == IAuthTabCallback.NETWORK_DISCONNECTED, Intrinsics.areEqual((getPluginVersion.onExtraCallbackWithResult) t2, getPluginVersion.onExtraCallbackWithResult.onExtraCallbackWithResult.onExtraCallback), iAuthTabCallback == IAuthTabCallback.ERROR, onextracallback instanceof PillarLabFragment.IAuthTabCallback.onExtraCallback ? onextracallback : null);
        }
    }

    private StatusManager(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onExtraCallback onextracallback, TossAffiliate[] tossAffiliateArr, boolean z) throws Throwable {
        this.IAuthTabCallback = r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        this.access100 = onextracallback;
        this.onWarmupCompleted = tossAffiliateArr;
        this.access000 = z;
        access27100<IAuthTabCallback> access27100VarIAuthTabCallback = access27100.IAuthTabCallback(IAuthTabCallback.NORMAL);
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback, "");
        this.IAuthTabCallback_Parcel = access27100VarIAuthTabCallback;
        this.IAuthTabCallbackStub = new deserializeUriCollection();
        access27100<String> access27100VarIAuthTabCallback2 = access27100.IAuthTabCallback("");
        Intrinsics.checkNotNullExpressionValue(access27100VarIAuthTabCallback2, "");
        this.getInterfaceDescriptor = access27100VarIAuthTabCallback2;
        this.IAuthTabCallbackDefault = TimeUnit.MINUTES.toMillis(2L);
        this.onTransact = "";
        Object[] objArr = new Object[1];
        a(new char[]{11, 22, '\b', 6, 19, 22, 14, '\r', '\r', 7, 13785, 13785, '\n', 7, 1, 23, 18, 15, 4, 24, 7, '\n', 16, 18, '\b', 15, 7, 15, 15, 7, 18, 22, 23, 14, 13837, 13837, '\b', 18, 15, 7, 17, 19, 4, 17, 23, '\n', 0, 6, 13836}, (byte) (36 - TextUtils.getCapsMode("", 0, 0)), TextUtils.getOffsetBefore("", 0) + 49, objArr);
        this.asBinder = ((String) objArr[0]).intern();
        DERSet dERSet = DERSet.onExtraCallback;
        if (!dERSet.requestPostMessageChannelWithExtras() && !dERSet.prefetchWithMultipleUrls() && !dERSet.newSession()) {
            int i = ICustomTabsCallback + 13;
            writeTypedObject = i % 128;
            if (i % 2 != 0) {
                int i2 = 57 / 0;
                if (!dERSet.receiveFile()) {
                    return;
                }
            } else if (!dERSet.receiveFile()) {
                return;
            }
        }
        r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getLifecycle().IAuthTabCallback(new LifecycleEventObserver() { // from class: viva.republica.toss.main.StatusManager.1
            public void onStateChanged(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult onextracallbackwithresult) {
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Object[] objArr2 = {StatusManager.this};
                if (!((Boolean) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1946129558, objArr2, R.drawable.IAuthTabCallback(), -1946129544, R.drawable.IAuthTabCallback())).booleanValue() && setBaseDeeplink.IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda0)) {
                    StatusManager.IAuthTabCallback(StatusManager.this, true);
                    Object[] objArr3 = {StatusManager.this};
                    StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -789718411, objArr3, R.drawable.IAuthTabCallback(), 789718434, R.drawable.IAuthTabCallback());
                    StatusManager.access000(StatusManager.this);
                }
                if (onextracallbackwithresult == TextFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult.ON_DESTROY) {
                    Object[] objArr4 = {StatusManager.this};
                    ((r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -2012029697, objArr4, R.drawable.IAuthTabCallback(), 2012029699, R.drawable.IAuthTabCallback())).getLifecycle().onExtraCallbackWithResult(this);
                }
            }
        });
        int i3 = writeTypedObject + 57;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
    }

    public static final /* synthetic */ int IAuthTabCallback(StatusManager statusManager) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int iAsBinder = statusManager.asBinder();
        int i4 = writeTypedObject + 83;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return iAsBinder;
    }

    public static final /* synthetic */ Object IAuthTabCallback(access4102 access4102Var, Context context, StatusManager statusManager, String str, access13800 access13800Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 97;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = onNavigationEvent(access4102Var, context, statusManager, str, access13800Var);
        int i4 = writeTypedObject + 1;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    public static final /* synthetic */ Set IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 71;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Set<WeakReference<StatusManager>> set = onNavigationEvent;
        int i5 = i2 + 71;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return set;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(StatusManager statusManager, String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 115;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        statusManager.onTransact = str;
        int i5 = i2 + 55;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void IAuthTabCallback(StatusManager statusManager, boolean z) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 75;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        statusManager.IAuthTabCallbackStubProxy = z;
        int i5 = i2 + 117;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ ViewGroup IAuthTabCallbackDefault(StatusManager statusManager) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return statusManager.access100();
        }
        statusManager.access100();
        throw null;
    }

    public static final /* synthetic */ void access000(StatusManager statusManager) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        statusManager.IAuthTabCallbackStubProxy();
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ access27100 asBinder(StatusManager statusManager) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        access27100<String> access27100Var = statusManager.getInterfaceDescriptor;
        int i5 = i3 + 43;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return access27100Var;
        }
        throw null;
    }

    public static final /* synthetic */ long asInterface(StatusManager statusManager) {
        long j;
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 121;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            j = statusManager.asInterface;
            int i4 = 39 / 0;
        } else {
            j = statusManager.asInterface;
        }
        int i5 = i2 + 43;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        statusManager.IAuthTabCallbackDefault();
        if (i3 == 0) {
            int i4 = 0 / 0;
        }
        int i5 = ICustomTabsCallback + 9;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 9;
        int i3 = i2 % 128;
        writeTypedObject = i3;
        int i4 = i2 % 2;
        Object obj = null;
        boolean z = statusManager.IAuthTabCallbackStubProxy;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 15;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 97;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        statusManager.access000();
        int i4 = ICustomTabsCallback + 39;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final /* synthetic */ long onExtraCallback(StatusManager statusManager) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 39;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        long j = statusManager.IAuthTabCallbackDefault;
        int i5 = i2 + 7;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(StatusManager statusManager) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 69;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = statusManager.onTransact;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(StatusManager statusManager, ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = statusManager.onWarmupCompleted(viewGroup);
        int i4 = writeTypedObject + 57;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return strOnWarmupCompleted;
        }
        throw null;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(StatusManager statusManager, String str, String str2, Map map) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 1;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        statusManager.onExtraCallback(str, str2, map);
        int i4 = writeTypedObject + 39;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = statusManager.IAuthTabCallback;
        if (i3 != 0) {
            return r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        }
        throw null;
    }

    public static final /* synthetic */ Regex onNavigationEvent() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        int i3 = i2 % 128;
        ICustomTabsCallback = i3;
        int i4 = i2 % 2;
        Regex regex = onExtraCallbackWithResult;
        int i5 = i3 + 15;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return regex;
    }

    public static final /* synthetic */ void onNavigationEvent(StatusManager statusManager, long j) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 65;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        statusManager.asInterface = j;
        int i5 = i2 + 15;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ deserializeUriCollection onTransact(StatusManager statusManager) {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 113;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        deserializeUriCollection deserializeuricollection = statusManager.IAuthTabCallbackStub;
        int i5 = i2 + 103;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        return deserializeuricollection;
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = i2 + 69;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.access000;
        int i5 = i2 + 109;
        writeTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(Boolean bool) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 41;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        boolean zBooleanValue = bool.booleanValue();
        int i4 = writeTypedObject + 103;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return zBooleanValue;
    }

    private static final boolean onRelationshipValidationResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i3 = 51 / 0;
        return zBooleanValue;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IAuthTabCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IAuthTabCallback[] $VALUES;
        public static final IAuthTabCallback ERROR;
        private static long IAuthTabCallback;
        public static final IAuthTabCallback NETWORK_DISCONNECTED;
        public static final IAuthTabCallback NORMAL;
        public static final IAuthTabCallback UNKNOWN;
        private static int asBinder;
        private static char onExtraCallback;
        private static int onWarmupCompleted;
        private static final byte[] $$a = {51, -39, 98, -44};
        private static final int $$b = 114;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r6, int r7, int r8) {
            /*
                byte[] r0 = viva.republica.toss.main.StatusManager.IAuthTabCallback.$$a
                int r6 = r6 * 4
                int r6 = 4 - r6
                int r8 = 110 - r8
                int r7 = r7 * 3
                int r1 = 1 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r6 = r6 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.StatusManager.IAuthTabCallback.$$c(byte, int, int):java.lang.String");
        }

        private static final /* synthetic */ IAuthTabCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 15;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = {NORMAL, ERROR, NETWORK_DISCONNECTED, UNKNOWN};
            int i5 = i2 + 119;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return iAuthTabCallbackArr;
        }

        public static EnumEntries<IAuthTabCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 29;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<IAuthTabCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 41;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static IAuthTabCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) Enum.valueOf(IAuthTabCallback.class, str);
            int i4 = onNavigationEvent + 43;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
            return iAuthTabCallback;
        }

        public static IAuthTabCallback[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 113;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback[] iAuthTabCallbackArr = $VALUES;
            if (i3 != 0) {
                return (IAuthTabCallback[]) iAuthTabCallbackArr.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            Object obj;
            int i2 = 2;
            int i3 = 2 % 2;
            TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
            while (true) {
                obj = null;
                if (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult >= length3) {
                    break;
                }
                int i4 = $11 + 59;
                $10 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 43, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1450, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 49123), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1493, 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        try {
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23971), Color.blue(0) + 50, 22939 - Gravity.getAbsoluteGravity(0, 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 45848), 30 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallback ^ 7798559133331975163L)) ^ ((int) (onWarmupCompleted ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            String str = new String(cArr6);
            int i6 = $10 + 113;
            $11 = i6 % 128;
            if (i6 % 2 != 0) {
                objArr[0] = str;
            } else {
                obj.hashCode();
                throw null;
            }
        }

        private IAuthTabCallback(String str, int i) {
        }

        static {
            asBinder = 0;
            IAuthTabCallback();
            NORMAL = new IAuthTabCallback("NORMAL", 0);
            ERROR = new IAuthTabCallback("ERROR", 1);
            NETWORK_DISCONNECTED = new IAuthTabCallback("NETWORK_DISCONNECTED", 2);
            Object[] objArr = new Object[1];
            a((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (-218512975) + KeyEvent.keyCodeFromString(""), new char[]{38779, 50243, 51294, 22790, 12323, 22509, 4645}, new char[]{18410, 55395, 54104, 5162}, new char[]{45367, 63937, 61938, 40462}, objArr);
            UNKNOWN = new IAuthTabCallback(((String) objArr[0]).intern(), 3);
            IAuthTabCallback[] iAuthTabCallbackArr$values = $values();
            $VALUES = iAuthTabCallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(iAuthTabCallbackArr$values);
            int i = IAuthTabCallbackStub + 79;
            asBinder = i % 128;
            int i2 = i % 2;
        }

        static void IAuthTabCallback() {
            IAuthTabCallback = 8651660549031078929L;
            onWarmupCompleted = -1776194565;
            onExtraCallback = (char) 27643;
        }
    }

    private static final void ICustomTabsCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(StatusManager statusManager, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            statusManager.IAuthTabCallbackDefault();
            return Unit.INSTANCE;
        }
        statusManager.IAuthTabCallbackDefault();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final void mayLaunchUrl(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 57;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final void ICustomTabsCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 29;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 95;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) throws Throwable {
        StatusManager statusManager = (StatusManager) objArr[0];
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 109;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            if (onextracallbackwithresult.IAuthTabCallback()) {
                statusManager.extraCallback();
            } else if (!onextracallbackwithresult.onWarmupCompleted()) {
                if (onextracallbackwithresult.onExtraCallbackWithResult()) {
                    int i3 = ICustomTabsCallback + 105;
                    writeTypedObject = i3 % 128;
                    if (i3 % 2 != 0) {
                        statusManager.extraCallbackWithResult();
                        int i4 = 33 / 0;
                    } else {
                        statusManager.extraCallbackWithResult();
                    }
                } else if (onextracallbackwithresult.onExtraCallback() != null) {
                    statusManager.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback());
                }
            } else {
                statusManager.readTypedObject();
                int i5 = writeTypedObject + 79;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
        onextracallbackwithresult.IAuthTabCallback();
        throw null;
    }

    private static final Unit onNavigationEvent(StatusManager statusManager, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 83;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(th);
        onExtraCallbackWithResult(statusManager, "StatusManager", "StatusObserverError", th, null, 8, null);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 43;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Pair onExtraCallbackWithResult(Function2 function2, Pair pair, Object obj) {
        Pair pair2;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 31;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(obj, "");
            pair2 = (Pair) function2.invoke(pair, obj);
            int i3 = 21 / 0;
        } else {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(obj, "");
            pair2 = (Pair) function2.invoke(pair, obj);
        }
        int i4 = ICustomTabsCallback + 11;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return pair2;
        }
        throw null;
    }

    private static final Pair IAuthTabCallback(Pair pair, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str, "");
        Pair pair2 = new Pair(pair.getSecond(), str);
        int i2 = writeTypedObject + 77;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return pair2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean ICustomTabsCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 123;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i4 = ICustomTabsCallback + 97;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final boolean onNavigationEvent(Pair pair) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        if (((CharSequence) pair.getFirst()).length() > 0) {
            return true;
        }
        int i2 = writeTypedObject + 27;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (((CharSequence) pair.getSecond()).length() > 0) {
            return true;
        }
        int i4 = ICustomTabsCallback + 45;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 39;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        Pair pair = (Pair) objArr[1];
        int i = 2 % 2;
        CharSequence charSequence = (CharSequence) pair.getFirst();
        CharSequence charSequence2 = "normal";
        if (charSequence.length() == 0) {
            int i2 = writeTypedObject + 91;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            charSequence = "normal";
        }
        String str = (String) charSequence;
        CharSequence charSequence3 = (CharSequence) pair.getSecond();
        if (charSequence3.length() == 0) {
            int i4 = writeTypedObject + 31;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            charSequence2 = charSequence3;
        }
        statusManager.onExtraCallback("StatusManager", "error_view_status", access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("before", str), getWrite.IAuthTabCallback("current", (String) charSequence2)}));
        return Unit.INSTANCE;
    }

    private static final void onUnminimized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 67;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 43;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void access000() {
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent;
        PillarLabFragment pillarLabFragment;
        int i = 2 % 2;
        DERSet dERSet = DERSet.onExtraCallback;
        if (dERSet.requestPostMessageChannelWithExtras()) {
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = IAuthTabCallback_Parcel().IAuthTabCallback(wasNull.LATEST);
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda5
                public final Object invoke(Object obj) {
                    int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                    int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                    return Boolean.valueOf(((Boolean) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 2067780994, new Object[]{(Boolean) obj}, R.drawable.IAuthTabCallback(), -2067780983, iIAuthTabCallback2)).booleanValue());
                }
            };
            jsonReaderUnknownNumberParsingOnExtraCallback = jsonReaderUnknownNumberParsingIAuthTabCallback.IAuthTabCallback(new deserializeLongCollection() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda12
                public final boolean test(Object obj) {
                    return StatusManager.IAuthTabCallbackStubProxy(function1, obj);
                }
            });
            Intrinsics.checkNotNull(jsonReaderUnknownNumberParsingOnExtraCallback);
        } else {
            jsonReaderUnknownNumberParsingOnExtraCallback = JsonReaderUnknownNumberParsing.onExtraCallback(Boolean.TRUE);
            Intrinsics.checkNotNull(jsonReaderUnknownNumberParsingOnExtraCallback);
        }
        if (!dERSet.prefetchWithMultipleUrls()) {
            jsonReaderUnknownNumberParsingOnNavigationEvent = JsonReaderUnknownNumberParsing.onExtraCallback(getPluginVersion.onExtraCallbackWithResult.onExtraCallback.onWarmupCompleted);
            Intrinsics.checkNotNull(jsonReaderUnknownNumberParsingOnNavigationEvent);
            int i2 = ICustomTabsCallback + 125;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
        } else {
            jsonReaderUnknownNumberParsingOnNavigationEvent = AppStateManager.onExtraCallbackWithResult.writeTypedObject().onNavigationEvent();
        }
        PillarLabFragment pillarLabFragment2 = this.IAuthTabCallback;
        if (!(pillarLabFragment2 instanceof PillarLabFragment)) {
            pillarLabFragment = null;
        } else {
            int i4 = ICustomTabsCallback + 99;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            pillarLabFragment = pillarLabFragment2;
        }
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback2 = (pillarLabFragment == null || !dERSet.receiveFile()) ? JsonReaderUnknownNumberParsing.onExtraCallback(PillarLabFragment.IAuthTabCallback.IAuthTabCallback.IAuthTabCallback) : pillarLabFragment.postMessage().IAuthTabCallback(wasNull.LATEST);
        clearMessage clearmessage = clearMessage.onWarmupCompleted;
        access27100<IAuthTabCallback> access27100Var = this.IAuthTabCallback_Parcel;
        Intrinsics.checkNotNull(jsonReaderUnknownNumberParsingOnExtraCallback2);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback2 = JsonReaderUnknownNumberParsing.IAuthTabCallback(jsonReaderUnknownNumberParsingOnExtraCallback, jsonReaderUnknownNumberParsingOnNavigationEvent, access27100Var, jsonReaderUnknownNumberParsingOnExtraCallback2, new IAuthTabCallback_Parcel());
        Intrinsics.checkExpressionValueIsNotNull(jsonReaderUnknownNumberParsingIAuthTabCallback2, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAsInterface = jsonReaderUnknownNumberParsingIAuthTabCallback2.asInterface();
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingAsInterface, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingAsInterface.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda13
            public final Object invoke(Object obj) {
                return StatusManager.onWarmupCompleted(this.f$0, (StatusManager.onExtraCallbackWithResult) obj);
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent2 = jsonReaderUnknownNumberParsingOnWarmupCompleted.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda14
            public final void accept(Object obj) {
                StatusManager.asBinder(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda15
            public final Object invoke(Object obj) {
                return StatusManager.onExtraCallbackWithResult(this.f$0, (StatusManager.onExtraCallbackWithResult) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda16
            public final void accept(Object obj) {
                StatusManager.asInterface(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda17
            public final Object invoke(Object obj) {
                return StatusManager.onExtraCallback(this.f$0, (Throwable) obj);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = jsonReaderUnknownNumberParsingOnNavigationEvent2.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda18
            public final void accept(Object obj) {
                StatusManager.onExtraCallback(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnWarmupCompleted, this.IAuthTabCallback);
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAsInterface2 = this.getInterfaceDescriptor.onExtraCallbackWithResult(500L, TimeUnit.MILLISECONDS).asInterface();
        Pair pair = new Pair("", "");
        final Function2 function2 = new Function2() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda19
            public final Object invoke(Object obj, Object obj2) {
                return StatusManager.onExtraCallback((Pair) obj, (String) obj2);
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback3 = jsonReaderUnknownNumberParsingAsInterface2.IAuthTabCallback(pair, new deserializeFloatNullableCollection() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda20
            public final Object apply(Object obj, Object obj2) {
                return StatusManager.IAuthTabCallback(function2, (Pair) obj, obj2);
            }
        });
        final Function1 function15 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda6
            public final Object invoke(Object obj) {
                int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                return Boolean.valueOf(((Boolean) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1549112347, new Object[]{(Pair) obj}, R.drawable.IAuthTabCallback(), -1549112347, iIAuthTabCallback2)).booleanValue());
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted2 = jsonReaderUnknownNumberParsingIAuthTabCallback3.onWarmupCompleted(new deserializeLongCollection() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda7
            public final boolean test(Object obj) {
                return StatusManager.getInterfaceDescriptor(function15, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted2, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted3 = jsonReaderUnknownNumberParsingOnWarmupCompleted2.onWarmupCompleted(RxUtils.IAuthTabCallback((Object) null));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted3, "");
        final Function1 function16 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return StatusManager.onExtraCallbackWithResult(this.f$0, (Pair) obj);
            }
        };
        deserializeFloat deserializefloat2 = new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda9
            public final void accept(Object obj) {
                StatusManager.IAuthTabCallback(function16, obj);
            }
        };
        final Function1 function17 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda10
            public final Object invoke(Object obj) {
                int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                return (Unit) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -2109634892, new Object[]{(Throwable) obj}, R.drawable.IAuthTabCallback(), 2109634905, iIAuthTabCallback2);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted2 = jsonReaderUnknownNumberParsingOnWarmupCompleted3.onWarmupCompleted(deserializefloat2, new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda11
            public final void accept(Object obj) {
                StatusManager.IAuthTabCallbackStub(function17, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted2, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnWarmupCompleted2, this.IAuthTabCallback);
    }

    private static final boolean onActivityResized(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 45;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return ((Boolean) function1.invoke(obj)).booleanValue();
        }
        Intrinsics.checkNotNullParameter(obj, "");
        ((Boolean) function1.invoke(obj)).booleanValue();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final boolean onExtraCallback(Boolean bool) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bool, "");
        boolean zBooleanValue = bool.booleanValue();
        int i4 = ICustomTabsCallback + 25;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 23;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private static final void onActivityLayout(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = writeTypedObject + 99;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(StatusManager statusManager, Boolean bool) throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            statusManager.onNavigationEvent("resurrection");
            if (!(AppStateManager.onExtraCallbackWithResult.extraCallbackWithResult().onWarmupCompleted() instanceof getSdkKey.onNavigationEvent.IAuthTabCallback)) {
                UST_CERT_GetPublicKeyInfo.onExtraCallbackWithResult(new Object[]{UST_CERT_GetPublicKeyInfo.onWarmupCompleted, "networkResurrection"}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -901952901, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 901952942);
                int i3 = ICustomTabsCallback + 19;
                writeTypedObject = i3 % 128;
                int i4 = i3 % 2;
            }
            return Unit.INSTANCE;
        }
        statusManager.onNavigationEvent("resurrection");
        boolean z = AppStateManager.onExtraCallbackWithResult.extraCallbackWithResult().onWarmupCompleted() instanceof getSdkKey.onNavigationEvent.IAuthTabCallback;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 33;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private final void getInterfaceDescriptor() {
        int i = 2 % 2;
        getByteBuffer<Boolean> getbytebufferIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda21
            public final Object invoke(Object obj) {
                return Boolean.valueOf(StatusManager.onWarmupCompleted((Boolean) obj));
            }
        };
        getByteBuffer getbytebufferOnExtraCallbackWithResult = getbytebufferIAuthTabCallback_Parcel.onWarmupCompleted(new deserializeLongCollection() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda22
            public final boolean test(Object obj) {
                return StatusManager.onExtraCallbackWithResult(function1, obj);
            }
        }).onExtraCallback(1L).onExtraCallbackWithResult(NetConverter3.onExtraCallback());
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda23
            public final Object invoke(Object obj) {
                return StatusManager.IAuthTabCallback(this.f$0, (Boolean) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda24
            public final void accept(Object obj) {
                StatusManager.IAuthTabCallback_Parcel(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda25
            public final Object invoke(Object obj) {
                int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                return (Unit) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 18161297, new Object[]{(Throwable) obj}, R.drawable.IAuthTabCallback(), -18161280, iIAuthTabCallback2);
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = getbytebufferOnExtraCallbackWithResult.onExtraCallbackWithResult(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda26
            public final void accept(Object obj) {
                StatusManager.extraCallbackWithResult(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult, this.IAuthTabCallback);
        int i2 = writeTypedObject + 39;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private final getByteBuffer<Boolean> IAuthTabCallback_Parcel() {
        Object objIAuthTabCallback;
        int i = 2 % 2;
        int i2 = writeTypedObject + 23;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            objIAuthTabCallback = onTextViewSizeChanged.IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 773290631, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{onTextViewSizeChanged.onExtraCallbackWithResult, true, 1, null}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -773290631);
        } else {
            objIAuthTabCallback = onTextViewSizeChanged.IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), 773290631, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{onTextViewSizeChanged.onExtraCallbackWithResult, false, 1, null}, ComposableSingletons$TdsTopV1Kt$.ExternalSyntheticLambda0.onExtraCallback(), -773290631);
        }
        getByteBuffer<Boolean> getbytebuffer = (getByteBuffer) objIAuthTabCallback;
        int i3 = writeTypedObject + 53;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return getbytebuffer;
        }
        throw null;
    }

    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        this.IAuthTabCallbackStub.onExtraCallbackWithResult();
        deserializeUriCollection deserializeuricollection = this.IAuthTabCallbackStub;
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        writeRaw writerawIAuthTabCallback = ((writeRaw) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -613548562, new Object[]{this}, R.drawable.IAuthTabCallback(), 613548577, iIAuthTabCallback2)).IAuthTabCallback(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda36
            public final Object invoke(Object obj) {
                return StatusManager.IAuthTabCallback(this.f$0, (deserializeUriNullableCollection) obj);
            }
        };
        writeRaw writerawOnExtraCallback = writerawIAuthTabCallback.onExtraCallback(new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda37
            public final void accept(Object obj) {
                StatusManager.onWarmupCompleted(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(writerawOnExtraCallback, "StatusManager#onHealthCheck");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult, this.IAuthTabCallback);
        access27600.onExtraCallback(deserializeuricollection, deserializeurinullablecollectionOnExtraCallbackWithResult);
        int i2 = ICustomTabsCallback + 29;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void isEngagementSignalsApiAvailable(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 63;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = writeTypedObject + 121;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(StatusManager statusManager, deserializeUriNullableCollection deserializeurinullablecollection) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        statusManager.IAuthTabCallback_Parcel.onWarmupCompleted(IAuthTabCallback.NORMAL);
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 5;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Boolean asInterface() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 121;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallback();
        if (i3 != 0) {
            return Boolean.valueOf(zIAuthTabCallback);
        }
        Boolean.valueOf(zIAuthTabCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final JsonReaderErrorInfo extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        JsonReaderErrorInfo jsonReaderErrorInfo = (JsonReaderErrorInfo) function1.invoke(obj);
        int i4 = ICustomTabsCallback + 125;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return jsonReaderErrorInfo;
    }

    private static final JsonReaderErrorInfo onWarmupCompleted(StatusManager statusManager, Boolean bool) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 91;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bool, "");
            bool.booleanValue();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bool, "");
        if (!bool.booleanValue()) {
            throw new NetworkDisconnectedException();
        }
        int i3 = ICustomTabsCallback + 69;
        writeTypedObject = i3 % 128;
        if (i3 % 2 == 0) {
            return statusManager.IAuthTabCallbackStub();
        }
        statusManager.IAuthTabCallbackStub();
        throw null;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 73;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(Throwable th) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        getAdSizeApi.IAuthTabCallback.IAuthTabCallback();
        Unit unit = Unit.INSTANCE;
        int i4 = ICustomTabsCallback + 71;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super IAuthTabCallback>, Object> {
        final /* synthetic */ Throwable $error;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ StatusManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallbackStub(Throwable th, StatusManager statusManager, access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
            this.$error = th;
            this.this$0 = statusManager;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(this.$error, this.this$0, access13800Var);
            iAuthTabCallbackStub.L$0 = obj;
            return iAuthTabCallbackStub;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super IAuthTabCallback> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v17, types: [int] */
        public final Object invokeSuspend(Object obj) {
            String strOnNavigationEvent;
            boolean z;
            Object objOnExtraCallbackWithResult;
            int i;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Unit unit = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                onNavigationEvent onnavigationevent = StatusManager.Companion;
                Throwable th = this.$error;
                Intrinsics.checkNotNull(th);
                strOnNavigationEvent = onnavigationevent.onNavigationEvent(th);
                if (strOnNavigationEvent == null) {
                    Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{zzaj.onNavigationEvent().IAuthTabCallbackStub()});
                    strOnNavigationEvent = uri != null ? uri.getHost() : null;
                    if (strOnNavigationEvent == null) {
                        strOnNavigationEvent = "api-gateway.toss.im";
                    }
                }
                Throwable th2 = this.$error;
                boolean z2 = th2 instanceof NetworkDisconnectedException;
                z = th2 instanceof UnknownHostException;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(strOnNavigationEvent, null);
                this.L$0 = findresandmsg;
                this.L$1 = strOnNavigationEvent;
                this.I$0 = z2 ? 1 : 0;
                this.I$1 = z ? 1 : 0;
                this.label = 1;
                objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(anonymousClass1, this);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
                i = z2 ? 1 : 0;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r0 = this.I$1;
                i = this.I$0;
                strOnNavigationEvent = (String) this.L$1;
                ResultKt.onNavigationEvent(obj);
                z = r0;
                objOnExtraCallbackWithResult = obj;
            }
            Triple triple = (Triple) objOnExtraCallbackWithResult;
            boolean zBooleanValue = ((Boolean) triple.onExtraCallbackWithResult()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) triple.onExtraCallback()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) triple.IAuthTabCallback()).booleanValue();
            StatusManager statusManager = this.this$0;
            Throwable th3 = this.$error;
            try {
                Result.Companion companion = Result.Companion;
                Map mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("publicDnsAvailable", access14000.onNavigationEvent(zBooleanValue3)), getWrite.IAuthTabCallback("networkDisconnected", access14000.onNavigationEvent(i != 0)), getWrite.IAuthTabCallback("dnsDiagnosticsHost", strOnNavigationEvent), getWrite.IAuthTabCallback("systemDnsResolved", access14000.onNavigationEvent(zBooleanValue)), getWrite.IAuthTabCallback("publicDnsResolved", access14000.onNavigationEvent(zBooleanValue2))});
                Context context = ((r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -2012029697, new Object[]{statusManager}, R.drawable.IAuthTabCallback(), 2012029699, R.drawable.IAuthTabCallback())).getContext();
                if (context != null) {
                    mapIAuthTabCallback.putAll(onTextViewSizeChanged.onExtraCallbackWithResult.IAuthTabCallback(context));
                }
                Intrinsics.checkNotNull(th3);
                StatusManager.onExtraCallbackWithResult(statusManager, "HealthCheckError", null, th3, mapIAuthTabCallback, 2, null);
                Context context2 = ((r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -2012029697, new Object[]{statusManager}, R.drawable.IAuthTabCallback(), 2012029699, R.drawable.IAuthTabCallback())).getContext();
                if (context2 != null) {
                    if (zBooleanValue3) {
                        onTextViewSizeChanged.onExtraCallbackWithResult.onTransact(context2);
                    }
                    unit = Unit.INSTANCE;
                }
                Result.constructor-impl(unit);
            } catch (Throwable th4) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th4));
            }
            if (i == 0 && !z && zBooleanValue3) {
                return IAuthTabCallback.ERROR;
            }
            if (z) {
                return IAuthTabCallback.UNKNOWN;
            }
            return IAuthTabCallback.NETWORK_DISCONNECTED;
        }

        /* renamed from: viva.republica.toss.main.StatusManager$IAuthTabCallbackStub$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>>, Object> {
            final /* synthetic */ String $host;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$host = str;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$host, access13800Var);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Triple<Boolean, Boolean, Boolean>> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* renamed from: viva.republica.toss.main.StatusManager$IAuthTabCallbackStub$1$onNavigationEvent */
            static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
                final /* synthetic */ String $host;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                onNavigationEvent(String str, access13800<? super onNavigationEvent> access13800Var) {
                    super(2, access13800Var);
                    this.$host = str;
                }

                /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
                    return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new onNavigationEvent(this.$host, access13800Var);
                }

                public final Object invokeSuspend(Object obj) {
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        return obj;
                    }
                    ResultKt.onNavigationEvent(obj);
                    onTextViewSizeChanged ontextviewsizechanged = onTextViewSizeChanged.onExtraCallbackWithResult;
                    String str = this.$host;
                    this.label = 1;
                    Object objIAuthTabCallback = ontextviewsizechanged.IAuthTabCallback(str, this);
                    return objIAuthTabCallback == objOnWarmupCompleted ? objOnWarmupCompleted : objIAuthTabCallback;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 236
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.StatusManager.IAuthTabCallbackStub.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* renamed from: viva.republica.toss.main.StatusManager$IAuthTabCallbackStub$1$IAuthTabCallback */
            static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
                final /* synthetic */ String $host;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                IAuthTabCallback(String str, access13800<? super IAuthTabCallback> access13800Var) {
                    super(2, access13800Var);
                    this.$host = str;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new IAuthTabCallback(this.$host, access13800Var);
                }

                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
                    return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        return obj;
                    }
                    ResultKt.onNavigationEvent(obj);
                    onTextViewSizeChanged ontextviewsizechanged = onTextViewSizeChanged.onExtraCallbackWithResult;
                    String str = this.$host;
                    this.label = 1;
                    Object objOnWarmupCompleted2 = ontextviewsizechanged.onWarmupCompleted(str, this);
                    return objOnWarmupCompleted2 == objOnWarmupCompleted ? objOnWarmupCompleted : objOnWarmupCompleted2;
                }
            }

            /* renamed from: viva.republica.toss.main.StatusManager$IAuthTabCallbackStub$1$onExtraCallbackWithResult */
            static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
                int label;

                onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
                    super(2, access13800Var);
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    return new onExtraCallbackWithResult(access13800Var);
                }

                /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
                public final Object invoke(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
                    return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        return obj;
                    }
                    ResultKt.onNavigationEvent(obj);
                    onTextViewSizeChanged ontextviewsizechanged = onTextViewSizeChanged.onExtraCallbackWithResult;
                    this.label = 1;
                    Object objOnNavigationEvent = ontextviewsizechanged.onNavigationEvent(this);
                    return objOnNavigationEvent == objOnWarmupCompleted ? objOnWarmupCompleted : objOnNavigationEvent;
                }
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        statusManager.ICustomTabsCallback();
        getAdSizeApi.IAuthTabCallback.IAuthTabCallback();
        Object obj = null;
        writeRaw writerawIAuthTabCallback = RxSingleKt.IAuthTabCallback((CoroutineContext) null, new IAuthTabCallbackStub(th, statusManager, null), 1, (Object) null);
        int i2 = writeTypedObject + 69;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return writerawIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = extraCallback;
        if (cArr2 != null) {
            int i4 = $10 + 99;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 26, 23139 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(readTypedObject)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i7 = $11 + 45;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    i2 = i + 114;
                    cArr4[i2] = (char) (cArr[i2] << b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                int i8 = $11 + 25;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - TextUtils.indexOf((CharSequence) "", '0')), 74 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 8089 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i10 = $11 + 97;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 29 - Process.getGidForName(""), 19487 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        } else {
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                }
            }
            for (int i17 = 0; i17 < i; i17++) {
                int i18 = $11 + 115;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
            }
            String str = new String(cArr4);
            int i20 = $10 + 125;
            $11 = i20 % 128;
            int i21 = i20 % 2;
            objArr[0] = str;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        final StatusManager statusManager = (StatusManager) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (!DERSet.onExtraCallback.newSession()) {
            int i4 = writeTypedObject + 111;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            writeRaw writerawOnExtraCallback = writeRaw.onExtraCallback(IAuthTabCallback.NORMAL);
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallback, "");
            int i6 = ICustomTabsCallback + 5;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
            return writerawOnExtraCallback;
        }
        writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new Callable() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda27
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return StatusManager.onExtraCallback();
            }
        });
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda28
            public final Object invoke(Object obj) {
                return StatusManager.onNavigationEvent(this.f$0, (Boolean) obj);
            }
        };
        wasLastName waslastnameOnNavigationEvent = writerawOnNavigationEvent.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda29
            public final Object apply(Object obj) {
                return StatusManager.access100(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda30
            public final Object invoke(Object obj) {
                return StatusManager.onWarmupCompleted((Throwable) obj);
            }
        };
        writeRaw writerawOnExtraCallbackWithResult = waslastnameOnNavigationEvent.onExtraCallbackWithResult(new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda31
            public final void accept(Object obj) {
                Object[] objArr2 = {function12, obj};
                StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -1445879515, objArr2, R.drawable.IAuthTabCallback(), 1445879531, R.drawable.IAuthTabCallback());
            }
        }).onNavigationEvent(RetryWithDelay.Companion.onWarmupCompleted()).onExtraCallbackWithResult(writeRaw.onExtraCallback(IAuthTabCallback.NORMAL));
        final Function1 function13 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda32
            public final Object invoke(Object obj) {
                return StatusManager.onExtraCallbackWithResult(this.f$0, (Throwable) obj);
            }
        };
        writeRaw writerawAsBinder = writerawOnExtraCallbackWithResult.asBinder(new deserializeIntNullableCollection() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda33
            public final Object apply(Object obj) {
                return StatusManager.onTransact(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda34
            public final Object invoke(Object obj) {
                Object[] objArr2 = {this.f$0, (StatusManager.IAuthTabCallback) obj};
                return (Unit) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 551628022, objArr2, R.drawable.IAuthTabCallback(), -551628018, R.drawable.IAuthTabCallback());
            }
        };
        writeRaw writerawOnNavigationEvent2 = writerawAsBinder.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda35
            public final void accept(Object obj) {
                StatusManager.ICustomTabsCallback(function14, obj);
            }
        }).onNavigationEvent(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent2, "");
        return writerawOnNavigationEvent2;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 29;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 105;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            statusManager.IAuthTabCallback_Parcel.onWarmupCompleted(iAuthTabCallback);
            int i3 = 56 / 0;
            return Unit.INSTANCE;
        }
        statusManager.IAuthTabCallback_Parcel.onWarmupCompleted(iAuthTabCallback);
        return Unit.INSTANCE;
    }

    private static final Pair extraCommand(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 47;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Pair pair = (Pair) function1.invoke(obj);
        int i4 = ICustomTabsCallback + 87;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return pair;
    }

    private static final Pair onWarmupCompleted(String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().build();
        Request requestBuild = new Request.Builder().url(str).build();
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(requestBuild, okHttpClientBuild.newCall(requestBuild).execute().networkResponse());
        int i2 = ICustomTabsCallback + 117;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 96 / 0;
        }
        return pairIAuthTabCallback;
    }

    private static final void ICustomTabsService(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 51;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onExtraCallback(viva.republica.toss.main.StatusManager r12, kotlin.Pair r13) throws java.lang.Throwable {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2 = 3
            char[] r3 = new char[r2]
            r3 = {x00e6: FILL_ARRAY_DATA , data: [22, 16, 13856} // fill-array
            int r4 = android.os.Process.myTid()
            int r4 = r4 >> 22
            int r4 = 42 - r4
            byte r4 = (byte) r4
            java.lang.String r5 = ""
            int r6 = android.view.KeyEvent.keyCodeFromString(r5)
            int r6 = r6 + r2
            r2 = 1
            java.lang.Object[] r7 = new java.lang.Object[r2]
            a(r3, r4, r6, r7)
            r3 = 0
            r4 = r7[r3]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            java.lang.Object r6 = r13.getFirst()
            okhttp3.Request r6 = (okhttp3.Request) r6
            okhttp3.HttpUrl r6 = r6.url()
            java.lang.String r6 = r6.toString()
            r1.put(r4, r6)
            java.lang.Object r4 = r13.getSecond()
            okhttp3.Response r4 = (okhttp3.Response) r4
            if (r4 == 0) goto L59
            boolean r4 = r4.isSuccessful()
            if (r4 != r2) goto L59
            int r4 = viva.republica.toss.main.StatusManager.ICustomTabsCallback
            int r4 = r4 + r2
            int r6 = r4 % 128
            viva.republica.toss.main.StatusManager.writeTypedObject = r6
            int r4 = r4 % r0
            if (r4 == 0) goto L57
            goto L59
        L57:
            r4 = r2
            goto L5a
        L59:
            r4 = r3
        L5a:
            r6 = 6
            char[] r7 = new char[r6]
            r7 = {x00ee: FILL_ARRAY_DATA , data: [15, 7, 11, 22, 21, 20} // fill-array
            long r8 = android.os.SystemClock.currentThreadTimeMillis()
            r10 = -1
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            int r8 = r8 + 108
            byte r8 = (byte) r8
            int r9 = android.view.ViewConfiguration.getTouchSlop()
            int r9 = r9 >> 8
            int r6 = r6 - r9
            java.lang.Object[] r9 = new java.lang.Object[r2]
            a(r7, r8, r6, r9)
            r6 = r9[r3]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r6, r4)
            java.lang.Object r4 = r13.getSecond()
            okhttp3.Response r4 = (okhttp3.Response) r4
            if (r4 == 0) goto L9c
            int r4 = r4.code()
            int r6 = viva.republica.toss.main.StatusManager.ICustomTabsCallback
            int r6 = r6 + 87
            int r7 = r6 % 128
            viva.republica.toss.main.StatusManager.writeTypedObject = r7
            int r6 = r6 % r0
            goto L9d
        L9c:
            r4 = -1
        L9d:
            java.lang.String r0 = "code"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r0, r4)
            java.lang.Object r13 = r13.getSecond()
            okhttp3.Response r13 = (okhttp3.Response) r13
            if (r13 == 0) goto Lb4
            java.lang.String r13 = r13.message()
            if (r13 != 0) goto Lb5
        Lb4:
            r13 = r5
        Lb5:
            r0 = 7
            char[] r4 = new char[r0]
            r4 = {x00f8: FILL_ARRAY_DATA , data: [15, 10, 13824, 13824, 7, 2, 13846} // fill-array
            r6 = 48
            int r5 = android.text.TextUtils.lastIndexOf(r5, r6)
            int r5 = 22 - r5
            byte r5 = (byte) r5
            int r6 = android.view.ViewConfiguration.getEdgeSlop()
            int r6 = r6 >> 16
            int r0 = r0 - r6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            a(r4, r5, r0, r2)
            r0 = r2[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r1.put(r0, r13)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            java.lang.String r0 = "StatusManager"
            java.lang.String r2 = "NetworkChecker"
            r12.onExtraCallback(r0, r2, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.StatusManager.onExtraCallback(viva.republica.toss.main.StatusManager, kotlin.Pair):kotlin.Unit");
    }

    private static final void postMessage(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 75;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = ICustomTabsCallback + 25;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }

    private static final Unit IAuthTabCallbackDefault(StatusManager statusManager, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(th);
            onExtraCallbackWithResult(statusManager, "StatusManager", "NetworkCheckerError", th, null, 96, null);
        } else {
            Intrinsics.checkNotNull(th);
            onExtraCallbackWithResult(statusManager, "StatusManager", "NetworkCheckerError", th, null, 8, null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = writeTypedObject + 27;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 77;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        DERSet dERSet = DERSet.onExtraCallback;
        if (dERSet.requestPostMessageChannel()) {
            int iOnExtraCallback = getKekid.onExtraCallback();
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallbackWithResult = JsonReaderUnknownNumberParsing.onWarmupCompleted(StringsKt.split$default((String) DERSet.onExtraCallback(-2043966744, new Object[]{dERSet}, 2043966746, getKekid.onExtraCallback(), getKekid.onExtraCallback(), getKekid.onExtraCallback(), iOnExtraCallback), new String[]{","}, false, 0, 6, (Object) null)).onExtraCallback(clearTid.onExtraCallback()).onExtraCallbackWithResult(5L);
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda38
                public final Object invoke(Object obj) {
                    int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                    int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                    return (Pair) StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1028367274, new Object[]{(String) obj}, R.drawable.IAuthTabCallback(), 1028367279, iIAuthTabCallback2);
                }
            };
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = jsonReaderUnknownNumberParsingOnExtraCallbackWithResult.onNavigationEvent(new deserializeIntNullableCollection() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda39
                public final Object apply(Object obj) {
                    return StatusManager.readTypedObject(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda40
                public final Object invoke(Object obj) {
                    return StatusManager.IAuthTabCallback(this.f$0, (Pair) obj);
                }
            };
            deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda41
                public final void accept(Object obj) {
                    Object[] objArr = {function12, obj};
                    StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 429385983, objArr, R.drawable.IAuthTabCallback(), -429385980, R.drawable.IAuthTabCallback());
                }
            };
            final Function1 function13 = new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda42
                public final Object invoke(Object obj) {
                    return StatusManager.onWarmupCompleted(this.f$0, (Throwable) obj);
                }
            };
            deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = jsonReaderUnknownNumberParsingOnNavigationEvent.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda43
                public final void accept(Object obj) {
                    StatusManager.IAuthTabCallbackDefault(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnWarmupCompleted, this.IAuthTabCallback);
            int i4 = ICustomTabsCallback + 103;
            writeTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
        }
    }

    private final wasLastName IAuthTabCallbackStub() {
        wasLastName waslastnameIAuthTabCallback;
        int i = 2 % 2;
        if (onWarmupCompleted(this.onWarmupCompleted, TossAffiliate.BANK)) {
            if (!onExtraCallback(this.onWarmupCompleted)) {
                if (DERSet.onExtraCallback.onPictureInPictureModeChanged()) {
                    waslastnameIAuthTabCallback = wasLastName.onNavigationEvent(new ForceFailureException("뱅크 Tuba 변수에 의해 토스 코어 헬스체크 강제 실패"));
                } else {
                    waslastnameIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.extraCallbackWithResult().onExtraCallback();
                }
            } else {
                int i2 = ICustomTabsCallback + 11;
                writeTypedObject = i2 % 128;
                if (i2 % 2 != 0) {
                    AdSettingsIntegrationErrorMode.onNavigationEvent.ICustomTabsCallbackStubProxy().onNavigationEvent();
                    throw null;
                }
                waslastnameIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.ICustomTabsCallbackStubProxy().onNavigationEvent();
            }
        } else if (onWarmupCompleted(this.onWarmupCompleted, TossAffiliate.SECURITIES)) {
            waslastnameIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.ICustomTabsCallback_Parcel().onNavigationEvent();
        } else if (onWarmupCompleted(this.onWarmupCompleted, TossAffiliate.CORE)) {
            int i3 = ICustomTabsCallback + 103;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                waslastnameIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.extraCallbackWithResult().onExtraCallback();
                int i4 = 91 / 0;
            } else {
                waslastnameIAuthTabCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.extraCallbackWithResult().onExtraCallback();
            }
        } else {
            waslastnameIAuthTabCallback = wasLastName.IAuthTabCallback();
        }
        wasLastName waslastnameOnWarmupCompleted = waslastnameIAuthTabCallback.onWarmupCompleted(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(waslastnameOnWarmupCompleted, "");
        return waslastnameOnWarmupCompleted;
    }

    private final void onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this, "error_view_retry", null, access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("from", str)}), 2, null);
        IAuthTabCallbackStubProxy();
        this.access100.onRetry();
        int i4 = ICustomTabsCallback + 15;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void extraCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(this, "StatusManager", "onNetworkDisconnected", null, 4, null);
        Context context = this.IAuthTabCallback.getContext();
        if (context != null) {
            onExtraCallbackWithResult(context, SkiaImageRegionDecoder.NETWORK, "network_disconnected");
            getInterfaceDescriptor();
        } else {
            int i4 = ICustomTabsCallback + 75;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void extraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        int i2 = writeTypedObject + 47;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!(!DERSet.onExtraCallback.postMessage())) {
            int i4 = ICustomTabsCallback + 19;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallback("StatusManager", "onHealthCheckFailed", access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("affiliates", String.valueOf(this.onWarmupCompleted))}));
            Context context = this.IAuthTabCallback.getContext();
            if (context != null) {
                onExtraCallbackWithResult(context, SkiaImageRegionDecoder.HEALTH_CHECK, "health check failed");
                return;
            }
        }
        int i6 = writeTypedObject + 111;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class asInterface implements Function1<Throwable, Unit> {
        final /* synthetic */ String onExtraCallback;
        final /* synthetic */ maybeRemoveAttachStateListener<String> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        asInterface(String str, maybeRemoveAttachStateListener<? super String> mayberemoveattachstatelistener) {
            this.onExtraCallback = str;
            this.onNavigationEvent = mayberemoveattachstatelistener;
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(Throwable th) {
            StatusManager.onExtraCallbackWithResult(StatusManager.this, "StatusManager", "bank_health_check_failure", access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("requestedReason", this.onExtraCallback)}));
            maybeRemoveAttachStateListener<String> mayberemoveattachstatelistener = this.onNavigationEvent;
            Result.Companion companion = Result.Companion;
            mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(""));
        }
    }

    static final class onTransact implements deserializeDecimalCollection {
        final /* synthetic */ maybeRemoveAttachStateListener<String> IAuthTabCallback;
        final /* synthetic */ Ref.ObjectRef<getPackageType> onExtraCallbackWithResult;
        final /* synthetic */ StatusManager onNavigationEvent;
        final /* synthetic */ String onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onTransact(Ref.ObjectRef<getPackageType> objectRef, maybeRemoveAttachStateListener<? super String> mayberemoveattachstatelistener, StatusManager statusManager, String str) {
            this.onExtraCallbackWithResult = objectRef;
            this.IAuthTabCallback = mayberemoveattachstatelistener;
            this.onNavigationEvent = statusManager;
            this.onWarmupCompleted = str;
        }

        /* renamed from: viva.republica.toss.main.StatusManager$onTransact$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            final /* synthetic */ maybeRemoveAttachStateListener<String> $cont;
            final /* synthetic */ String $requestedReason;
            int I$0;
            int I$1;
            int I$2;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ StatusManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(StatusManager statusManager, String str, maybeRemoveAttachStateListener<? super String> mayberemoveattachstatelistener, access13800<? super AnonymousClass2> access13800Var) {
                super(2, access13800Var);
                this.this$0 = statusManager;
                this.$requestedReason = str;
                this.$cont = mayberemoveattachstatelistener;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                return new AnonymousClass2(this.this$0, this.$requestedReason, this.$cont, access13800Var);
            }

            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) throws im.toss.network.throwable.TossApiCallException.ApiError {
                /*
                    Method dump skipped, instructions count: 326
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.StatusManager.onTransact.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public final void run() {
            this.onExtraCallbackWithResult.element = maybeUpdateAnimatable.onNavigationEvent(findRes.onWarmupCompleted(this.IAuthTabCallback.getContext()), (CoroutineContext) null, (setRandomHost) null, new AnonymousClass2(this.onNavigationEvent, this.onWarmupCompleted, this.IAuthTabCallback, null), 3, (Object) null);
        }
    }

    static final class asBinder implements Function1<Throwable, Unit> {
        final /* synthetic */ Ref.ObjectRef<getPackageType> onExtraCallback;

        asBinder(Ref.ObjectRef<getPackageType> objectRef) {
            this.onExtraCallback = objectRef;
        }

        public /* synthetic */ Object invoke(Object obj) {
            onExtraCallbackWithResult((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(Throwable th) {
            getPackageType getpackagetype = (getPackageType) this.onExtraCallback.element;
            if (getpackagetype != null) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    private final void readTypedObject() throws Throwable {
        Context context;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Pair[] pairArr = new Pair[0];
            pairArr[1] = getWrite.IAuthTabCallback("affiliates", String.valueOf(this.onWarmupCompleted));
            onExtraCallback("StatusManager", "onParkingMode", access8100.IAuthTabCallback(pairArr));
            context = this.IAuthTabCallback.getContext();
            if (context == null) {
                return;
            }
        } else {
            onExtraCallback("StatusManager", "onParkingMode", access8100.IAuthTabCallback(new Pair[]{getWrite.IAuthTabCallback("affiliates", String.valueOf(this.onWarmupCompleted))}));
            context = this.IAuthTabCallback.getContext();
            if (context == null) {
                return;
            }
        }
        onExtraCallbackWithResult(context, SkiaImageRegionDecoder.PARKING_MODE, "parking_mode");
        int i3 = writeTypedObject + 25;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onExtraCallbackWithResult(viva.republica.toss.service.PillarLabFragment.IAuthTabCallback.onExtraCallback r18) {
        /*
            r17 = this;
            r6 = r17
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.main.StatusManager.ICustomTabsCallback
            int r1 = r1 + 123
            int r2 = r1 % 128
            viva.republica.toss.main.StatusManager.writeTypedObject = r2
            int r1 = r1 % r0
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L1e
            o.DERSet r1 = o.DERSet.onExtraCallback
            boolean r1 = r1.receiveFile()
            r3 = 37
            int r3 = r3 / r7
            if (r1 == 0) goto Lb6
            goto L28
        L1e:
            o.DERSet r1 = o.DERSet.onExtraCallback
            boolean r1 = r1.receiveFile()
            if (r1 == r2) goto L28
            goto Lb6
        L28:
            int r1 = viva.republica.toss.main.StatusManager.writeTypedObject
            int r1 = r1 + 29
            int r3 = r1 % 128
            viva.republica.toss.main.StatusManager.ICustomTabsCallback = r3
            int r1 = r1 % r0
            im.toss.define.TossAffiliate[] r1 = r6.onWarmupCompleted
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "affiliates"
            kotlin.Pair r1 = o.getWrite.IAuthTabCallback(r3, r1)
            kotlin.Pair[] r3 = new kotlin.Pair[r2]
            r3[r7] = r1
            java.lang.String r1 = "onWebViewError"
            java.util.Map r3 = o.access8100.IAuthTabCallback(r3)
            java.lang.String r4 = "StatusManager"
            r6.onExtraCallback(r4, r1, r3)
            r17.IAuthTabCallbackDefault()
            o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r1 = r6.IAuthTabCallback
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto Lb6
            android.view.ViewGroup r8 = r17.access100()
            if (r8 != 0) goto L5e
            goto Lb6
        L5e:
            java.lang.String r3 = r18.onExtraCallbackWithResult()
            java.lang.String r4 = r18.IAuthTabCallback()
            int r0 = r18.onNavigationEvent()
            java.lang.String r5 = r1.getString(r0)
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            r0 = r17
            r2 = r3
            r3 = r4
            r4 = r9
            java.lang.Object[] r13 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5}
            int r11 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            int r16 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            int r10 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            int r14 = im.toss.features.tosscert.ui.R.drawable.IAuthTabCallback()
            r15 = -2144827536(0xffffffff80288770, float:-3.722006E-39)
            r12 = 2144827544(0x7fd77898, float:NaN)
            java.lang.Object r0 = onNavigationEvent(r10, r11, r12, r13, r14, r15, r16)
            im.toss.uikit.widget.TdsResultV0View r0 = (im.toss.uikit.widget.TdsResultV0View) r0
            java.lang.String r1 = r6.onWarmupCompleted(r8)
            r0.setTag(r1)
            boolean r1 = r8 instanceof android.widget.LinearLayout
            if (r1 == 0) goto Lab
            r8.addView(r0, r7)
            goto Lae
        Lab:
            r8.addView(r0)
        Lae:
            o.access27100<java.lang.String> r0 = r6.getInterfaceDescriptor
            java.lang.String r1 = "web_view_error"
            r0.onWarmupCompleted(r1)
            return
        Lb6:
            int r1 = viva.republica.toss.main.StatusManager.ICustomTabsCallback
            int r1 = r1 + 51
            int r2 = r1 % 128
            viva.republica.toss.main.StatusManager.writeTypedObject = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.StatusManager.onExtraCallbackWithResult(viva.republica.toss.service.PillarLabFragment$IAuthTabCallback$onExtraCallback):void");
    }

    private final ViewGroup access100() {
        View childAt;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 87;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        View view = this.IAuthTabCallback.getView();
        Object obj = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return viewGroup;
        }
        int i4 = ICustomTabsCallback + 51;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            this.IAuthTabCallback.getActivity();
            obj.hashCode();
            throw null;
        }
        FragmentActivity activity = this.IAuthTabCallback.getActivity();
        ViewGroup viewGroup2 = activity != null ? (ViewGroup) activity.findViewById(android.R.id.content) : null;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        if (viewGroup2 != null) {
            int i5 = ICustomTabsCallback + 103;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            childAt = viewGroup2.getChildAt(0);
        } else {
            childAt = null;
        }
        if (childAt instanceof ViewGroup) {
            return (ViewGroup) childAt;
        }
        return null;
    }

    private final int asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        writeTypedObject = i2 % 128;
        AppCompatActivity appCompatActivity = null;
        if (i2 % 2 != 0) {
            boolean z = this.IAuthTabCallback.getActivity() instanceof AppCompatActivity;
            appCompatActivity.hashCode();
            throw null;
        }
        FragmentActivity activity = this.IAuthTabCallback.getActivity();
        if (activity instanceof AppCompatActivity) {
            appCompatActivity = (AppCompatActivity) activity;
            int i3 = ICustomTabsCallback + 57;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
        }
        if (appCompatActivity == null) {
            return 0;
        }
        int i5 = ICustomTabsCallback + 93;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        IPostMessageServiceStubProxy supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            return supportActionBar.onExtraCallbackWithResult();
        }
        return 0;
    }

    private static final void asInterface(StatusManager statusManager, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 53;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        statusManager.onNavigationEvent("click");
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = ICustomTabsCallback + 113;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onTransact(final StatusManager statusManager, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        enableIOSViewClipToPaddingBox.IAuthTabCallback.onNavigationEvent(view, ParamUtils.LONG.getDelay(), new View.OnClickListener() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr = {this.f$0, view2};
                StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1369004216, objArr, R.drawable.IAuthTabCallback(), -1369004192, R.drawable.IAuthTabCallback());
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = ICustomTabsCallback + 37;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        StatusManager statusManager = (StatusManager) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 17;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        statusManager.onNavigationEvent("click");
        if (i3 != 0) {
            throw null;
        }
        int i4 = ICustomTabsCallback + 71;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit IAuthTabCallbackDefault(final StatusManager statusManager, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        enableIOSViewClipToPaddingBox.IAuthTabCallback.onNavigationEvent(view, ParamUtils.LONG.getDelay(), new View.OnClickListener() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StatusManager.onNavigationEvent(this.f$0, view2);
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = writeTypedObject + 49;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object onNavigationEvent(o.access4102 r6, android.content.Context r7, final viva.republica.toss.main.StatusManager r8, java.lang.String r9, o.access13800<? super android.view.View> r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.StatusManager.onNavigationEvent(o.access4102, android.content.Context, viva.republica.toss.main.StatusManager, java.lang.String, o.access13800):java.lang.Object");
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ access4102 $kind;
        final /* synthetic */ String $reason;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        access100(String str, access4102 access4102Var, Context context, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$reason = str;
            this.$kind = access4102Var;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return StatusManager.this.new access100(this.$reason, this.$kind, this.$context, access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object obj2;
            StatusManager statusManager;
            String str;
            View view;
            ViewGroup viewGroupIAuthTabCallbackDefault;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    statusManager = StatusManager.this;
                    String str2 = this.$reason;
                    access4102 access4102Var = this.$kind;
                    Context context = this.$context;
                    Result.Companion companion = Result.Companion;
                    int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                    int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                    StatusManager.onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 344022326, new Object[]{statusManager}, R.drawable.IAuthTabCallback(), -344022316, iIAuthTabCallback2);
                    this.L$0 = statusManager;
                    this.L$1 = str2;
                    this.L$2 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    Object objIAuthTabCallback = StatusManager.IAuthTabCallback(access4102Var, context, statusManager, str2, this);
                    if (objIAuthTabCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    str = str2;
                    obj = objIAuthTabCallback;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.L$1;
                    statusManager = (StatusManager) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                }
                view = (View) obj;
                viewGroupIAuthTabCallbackDefault = StatusManager.IAuthTabCallbackDefault(statusManager);
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            if (viewGroupIAuthTabCallbackDefault == null) {
                throw new IllegalStateException("Failed to find root view group");
            }
            view.setTag(StatusManager.onExtraCallbackWithResult(statusManager, viewGroupIAuthTabCallbackDefault));
            if (viewGroupIAuthTabCallbackDefault instanceof LinearLayout) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                StatusManager.IAuthTabCallback(statusManager);
                Unit unit = Unit.INSTANCE;
                viewGroupIAuthTabCallbackDefault.addView(view, 0, marginLayoutParams);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -1);
                StatusManager.IAuthTabCallback(statusManager);
                Unit unit2 = Unit.INSTANCE;
                viewGroupIAuthTabCallbackDefault.addView(view, marginLayoutParams2);
            }
            StatusManager.asBinder(statusManager).onWarmupCompleted(str);
            obj2 = Result.constructor-impl(Unit.INSTANCE);
            StatusManager statusManager2 = StatusManager.this;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                StatusManager.onExtraCallbackWithResult(statusManager2, "StatusManager", null, th, null, 10, null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void onExtraCallbackWithResult(Context context, SkiaImageRegionDecoder skiaImageRegionDecoder, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 43;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zAudioAttributesImplApi21Parcelizer = zzaj.onNavigationEvent().AudioAttributesImplApi21Parcelizer();
        access4102 access4102VarOnNavigationEvent = access4302.onNavigationEvent(zAudioAttributesImplApi21Parcelizer, skiaImageRegionDecoder, ArraysKt.toSet(this.onWarmupCompleted), this.access000);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("affiliates", this.onWarmupCompleted);
        Object[] objArr = new Object[1];
        a(new char[]{15, 7, 7, 17, 14, '\b'}, (byte) (74 - (KeyEvent.getMaxKeyCode() >> 16)), 6 - TextUtils.getOffsetBefore("", 0), objArr);
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str), getWrite.IAuthTabCallback("failoverKind", access4102VarOnNavigationEvent.name()), getWrite.IAuthTabCallback("isKrRegion", Boolean.valueOf(zAudioAttributesImplApi21Parcelizer))});
        if (access4102VarOnNavigationEvent == access4102.SKIP) {
            onExtraCallback("StatusManager", "showErrorView is skipped, not core domain", mapIAuthTabCallback);
            return;
        }
        onExtraCallback("StatusManager", "showErrorView", mapIAuthTabCallback);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback), (CoroutineContext) null, (setRandomHost) null, new access100(str, access4102VarOnNavigationEvent, context, null), 3, (Object) null);
        int i4 = ICustomTabsCallback + 121;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 0;
        final StatusManager statusManager = (StatusManager) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        String str3 = (String) objArr[5];
        int i2 = 2 % 2;
        TdsResultV0View tdsResultV0View = new TdsResultV0View(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        tdsResultV0View.setId(View.generateViewId());
        tdsResultV0View.setFocusable(true);
        tdsResultV0View.setClickable(true);
        Class cls = Integer.TYPE;
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = (ViewGroup.LayoutParams) ConstraintLayout.onExtraCallbackWithResult.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(onextracallbackwithresult);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).width = -1;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).height = -1;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).topMargin = statusManager.asBinder();
        tdsResultV0View.setLayoutParams(onextracallbackwithresult);
        tdsResultV0View.setPadding(tdsResultV0View.getPaddingLeft(), tdsResultV0View.getPaddingTop(), tdsResultV0View.getPaddingRight(), statusManager.asBinder());
        Context context2 = tdsResultV0View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsResultV0View.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallbackDefault(configuration)).onWarmupCompleted());
        tdsResultV0View.setLottieImageFromAsset("lottie/spot-error.json");
        tdsResultV0View.setTitle(str);
        tdsResultV0View.setSubtitle(str2);
        TdsButtonV1View tdsButtonV1ViewAsInterface = tdsResultV0View.asInterface();
        if (!(!zBooleanValue)) {
            int i3 = ICustomTabsCallback + 21;
            int i4 = i3 % 128;
            writeTypedObject = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 107;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            i = 8;
        }
        tdsButtonV1ViewAsInterface.setVisibility(i);
        tdsButtonV1ViewAsInterface.setText(str3);
        Object[] objArr2 = {tdsButtonV1ViewAsInterface, ParamUtils.LONG, new Function1() { // from class: viva.republica.toss.main.StatusManager$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return StatusManager.onExtraCallbackWithResult(this.f$0, (View) obj);
            }
        }};
        return tdsResultV0View;
    }

    private static final Unit IAuthTabCallbackStub(StatusManager statusManager, View view) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 77;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        statusManager.onNavigationEvent("click");
        Unit unit = Unit.INSTANCE;
        int i4 = writeTypedObject + 99;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final void IAuthTabCallbackDefault() {
        View viewFindViewWithTag;
        int i = 2 % 2;
        ViewGroup viewGroupAccess100 = access100();
        if (viewGroupAccess100 == null || (viewFindViewWithTag = viewGroupAccess100.findViewWithTag(onWarmupCompleted(viewGroupAccess100))) == null) {
            int i2 = ICustomTabsCallback + 49;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (viewFindViewWithTag instanceof WebView) {
            int i3 = writeTypedObject + 59;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 == 0) {
                ((WebView) viewFindViewWithTag).destroy();
                int i4 = 68 / 0;
            } else {
                ((WebView) viewFindViewWithTag).destroy();
            }
        }
        viewGroupAccess100.removeView(viewFindViewWithTag);
        this.getInterfaceDescriptor.onWarmupCompleted("");
        int i5 = ICustomTabsCallback + 17;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final String onWarmupCompleted(ViewGroup viewGroup) {
        int iHashCode;
        int i = 2 % 2;
        Integer numValueOf = Integer.valueOf(viewGroup.getId());
        if (numValueOf.intValue() == -1) {
            int i2 = ICustomTabsCallback + 1;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            iHashCode = numValueOf.intValue();
        } else {
            iHashCode = viewGroup.hashCode();
            int i3 = writeTypedObject + 69;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return iHashCode + "StatusManagerErrorView";
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallback(StatusManager statusManager, String str, String str2, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i3 = ICustomTabsCallback;
            int i4 = i3 + 49;
            writeTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            int i5 = i3 + 13;
            writeTypedObject = i5 % 128;
            int i6 = i5 % 2;
            map = null;
        }
        statusManager.onExtraCallback(str, str2, map);
    }

    private final void onExtraCallback(String str, String str2, Map<String, Object> map) {
        Map<String, Object> map2;
        int i = 2 % 2;
        int i2 = writeTypedObject + 9;
        ICustomTabsCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            throw null;
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        if (map != null) {
            int i3 = ICustomTabsCallback + 97;
            writeTypedObject = i3 % 128;
            if (i3 % 2 == 0) {
                map.putAll(writeTypedObject());
                Unit unit = Unit.INSTANCE;
                map2 = map;
            } else {
                map.putAll(writeTypedObject());
                Unit unit2 = Unit.INSTANCE;
                obj.hashCode();
                throw null;
            }
        } else {
            int i4 = writeTypedObject + 65;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            map2 = null;
        }
        ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray2, str, str2, map2, (String) null, false, (String) null, 56, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onExtraCallbackWithResult(StatusManager statusManager, String str, String str2, Throwable th, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = writeTypedObject + 55;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            str2 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        statusManager.onNavigationEvent(str, str2, th, map);
        int i5 = ICustomTabsCallback + 11;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final void onNavigationEvent(String str, String str2, Throwable th, Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 125;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        String message = th.getMessage();
        if (map != null) {
            map.putAll(writeTypedObject());
            Unit unit = Unit.INSTANCE;
            int i4 = ICustomTabsCallback + 77;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        } else {
            map = null;
        }
        convertFloatArrayToByteArray.onExtraCallbackWithResult(str, message, th, map);
        int i6 = writeTypedObject + 93;
        ICustomTabsCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 92 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.Object> writeTypedObject() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.main.StatusManager.writeTypedObject():java.util.Map");
    }

    private final boolean onExtraCallback(TossAffiliate[] tossAffiliateArr) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 13;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        for (TossAffiliate tossAffiliate : tossAffiliateArr) {
            if (!tossAffiliate.isBank()) {
                return false;
            }
        }
        int i4 = writeTypedObject + 75;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return true;
    }

    private final boolean onWarmupCompleted(TossAffiliate[] tossAffiliateArr, TossAffiliate tossAffiliate) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 47;
        writeTypedObject = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ArraysKt.contains(tossAffiliateArr, tossAffiliate);
            obj.hashCode();
            throw null;
        }
        boolean zContains = ArraysKt.contains(tossAffiliateArr, tossAffiliate);
        int i3 = writeTypedObject + 67;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return zContains;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult {
        private final boolean onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private final PillarLabFragment.IAuthTabCallback.onExtraCallback onNavigationEvent;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return this.onWarmupCompleted == onextracallbackwithresult.onWarmupCompleted && this.onExtraCallback == onextracallbackwithresult.onExtraCallback && this.onExtraCallbackWithResult == onextracallbackwithresult.onExtraCallbackWithResult && Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.onWarmupCompleted);
            int iHashCode2 = Boolean.hashCode(this.onExtraCallback);
            int iHashCode3 = Boolean.hashCode(this.onExtraCallbackWithResult);
            PillarLabFragment.IAuthTabCallback.onExtraCallback onextracallback = this.onNavigationEvent;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (onextracallback == null ? 0 : onextracallback.hashCode());
        }

        public String toString() {
            return "StatusResult(isNetworkDisconnected=" + this.onWarmupCompleted + ", isParkingMode=" + this.onExtraCallback + ", isHealthCheckFailed=" + this.onExtraCallbackWithResult + ", webViewError=" + this.onNavigationEvent + ")";
        }

        public onExtraCallbackWithResult(boolean z, boolean z2, boolean z3, @Nullable PillarLabFragment.IAuthTabCallback.onExtraCallback onextracallback) {
            this.onWarmupCompleted = z;
            this.onExtraCallback = z2;
            this.onExtraCallbackWithResult = z3;
            this.onNavigationEvent = onextracallback;
        }

        public final boolean IAuthTabCallback() {
            return this.onWarmupCompleted;
        }

        public final boolean onWarmupCompleted() {
            return this.onExtraCallback;
        }

        public final boolean onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public final PillarLabFragment.IAuthTabCallback.onExtraCallback onExtraCallback() {
            return this.onNavigationEvent;
        }
    }

    static final class ForceFailureException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForceFailureException(@NotNull String str) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    static final class NetworkDisconnectedException extends RuntimeException {
        public NetworkDisconnectedException() {
            super("Network is disconnected");
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String onNavigationEvent(Throwable th) {
            String message;
            Object obj = null;
            UnknownHostException unknownHostException = th instanceof UnknownHostException ? (UnknownHostException) th : null;
            if (unknownHostException == null || (message = unknownHostException.getMessage()) == null) {
                return null;
            }
            Iterator itIAuthTabCallback = clearRevision.asBinder(Regex.onExtraCallbackWithResult(StatusManager.onNavigationEvent(), message, 0, 2, (Object) null), new Function1() { // from class: viva.republica.toss.main.StatusManager$Companion$$ExternalSyntheticLambda0
                public final Object invoke(Object obj2) {
                    return StatusManager.onNavigationEvent.onWarmupCompleted((MatchResult) obj2);
                }
            }).IAuthTabCallback();
            while (true) {
                if (!itIAuthTabCallback.hasNext()) {
                    break;
                }
                Object next = itIAuthTabCallback.next();
                if (Patterns.DOMAIN_NAME.matcher((String) next).matches()) {
                    obj = next;
                    break;
                }
            }
            return (String) obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onWarmupCompleted(MatchResult matchResult) {
            Intrinsics.checkNotNullParameter(matchResult, "");
            return (String) matchResult.getGroupValues().get(1);
        }

        public final Set<WeakReference<StatusManager>> IAuthTabCallback() {
            return StatusManager.IAuthTabCallback();
        }

        public final void IAuthTabCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
            Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
            Annotation[] annotations = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getClass().getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "");
            DERString dERString = (DERString) CollectionsKt.firstOrNull(ArraysKt.filterIsInstance(annotations, DERString.class));
            if (dERString != null) {
                onExtraCallback onextracallback = r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof onExtraCallback ? (onExtraCallback) r8lambdakrhaimf1bm5cgjbilhp45vln_xq : null;
                if (onextracallback == null) {
                    if (zzaj.onNavigationEvent().onActivityLayout()) {
                        throw new RuntimeException("If you want to use StatusManager, ContentOwner must implement StatusManager.RetryListener");
                    }
                } else {
                    final WeakReference<StatusManager> weakReference = new WeakReference<>(new StatusManager(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, onextracallback, dERString.onExtraCallback(), dERString.IAuthTabCallback(), null));
                    StatusManager.Companion.IAuthTabCallback().add(weakReference);
                    r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getLifecycle().IAuthTabCallback(new DefaultLifecycleObserver() { // from class: viva.republica.toss.main.StatusManager$Companion$init$1$1
                        public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            super.onCreate(textFieldScrollKtExternalSyntheticLambda0);
                        }

                        public /* bridge */ void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            super.onPause(textFieldScrollKtExternalSyntheticLambda0);
                        }

                        public /* bridge */ void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            super.onResume(textFieldScrollKtExternalSyntheticLambda0);
                        }

                        public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            super.onStart(textFieldScrollKtExternalSyntheticLambda0);
                        }

                        public /* bridge */ void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            super.onStop(textFieldScrollKtExternalSyntheticLambda0);
                        }

                        public void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0) {
                            Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda0, "");
                            StatusManager.Companion.IAuthTabCallback().remove(weakReference);
                        }
                    });
                }
            }
        }
    }

    static {
        onTransact();
        Companion = new onNavigationEvent(null);
        onExtraCallback = 8;
        onExtraCallbackWithResult = new Regex("\"([^\"]+)\"");
        onNavigationEvent = new LinkedHashSet();
        int i = onActivityLayout + 13;
        extraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 81 / 0;
        }
    }

    private final Object onExtraCallbackWithResult(String str, access13800<? super String> access13800Var) {
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
        setresourceinternal.onTransact();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        deserializeUriCollection deserializeuricollectionOnTransact = onTransact(this);
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = AdSettingsIntegrationErrorMode.onNavigationEvent.ICustomTabsCallbackStubProxy().onNavigationEvent().onWarmupCompleted(clearTid.onExtraCallback()).onNavigationEvent(NetConverter3.onExtraCallback()).onWarmupCompleted(new onTransact(objectRef, setresourceinternal, this, str), new deserializeFloat(new asInterface(str, setresourceinternal)) { // from class: viva.republica.toss.main.StatusManager.IAuthTabCallbackStubProxy
            private final /* synthetic */ Function1 onExtraCallback;

            {
                Intrinsics.checkNotNullParameter(function1, "");
                this.onExtraCallback = function1;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.onExtraCallback.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        access27600.onExtraCallback(deserializeuricollectionOnTransact, IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnWarmupCompleted, (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -2012029697, new Object[]{this}, R.drawable.IAuthTabCallback(), 2012029699, iIAuthTabCallback2)));
        setresourceinternal.IAuthTabCallback(new asBinder(objectRef));
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
            int i2 = ICustomTabsCallback + 111;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            access14600.IAuthTabCallback(access13800Var);
            if (i3 != 0) {
                throw null;
            }
        }
        return objIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(Throwable th) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 18161297, new Object[]{th}, R.drawable.IAuthTabCallback(), -18161280, iIAuthTabCallback2);
    }

    public static /* synthetic */ Unit onExtraCallback(StatusManager statusManager, IAuthTabCallback iAuthTabCallback) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 551628022, new Object[]{statusManager, iAuthTabCallback}, R.drawable.IAuthTabCallback(), -551628018, iIAuthTabCallback2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(StatusManager statusManager, View view) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -334889185, new Object[]{statusManager, view}, R.drawable.IAuthTabCallback(), 334889192, iIAuthTabCallback2);
    }

    public static /* synthetic */ Unit onExtraCallback(StatusManager statusManager, View view) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1110708197, new Object[]{statusManager, view}, R.drawable.IAuthTabCallback(), -1110708172, iIAuthTabCallback2);
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1445879515, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), 1445879531, iIAuthTabCallback2);
    }

    public static /* synthetic */ void onWarmupCompleted(StatusManager statusManager, View view) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1369004216, new Object[]{statusManager, view}, R.drawable.IAuthTabCallback(), -1369004192, iIAuthTabCallback2);
    }

    public static /* synthetic */ void access000(Function1 function1, Object obj) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 429385983, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), -429385980, iIAuthTabCallback2);
    }

    public static /* synthetic */ boolean onNavigationEvent(Boolean bool) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 2067780994, new Object[]{bool}, R.drawable.IAuthTabCallback(), -2067780983, iIAuthTabCallback2)).booleanValue();
    }

    public static /* synthetic */ boolean IAuthTabCallback(Pair pair) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1549112347, new Object[]{pair}, R.drawable.IAuthTabCallback(), -1549112347, iIAuthTabCallback2)).booleanValue();
    }

    public static /* synthetic */ Pair onExtraCallbackWithResult(String str) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Pair) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1028367274, new Object[]{str}, R.drawable.IAuthTabCallback(), 1028367279, iIAuthTabCallback2);
    }

    public static /* synthetic */ Unit onExtraCallback(Throwable th) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -2109634892, new Object[]{th}, R.drawable.IAuthTabCallback(), 2109634905, iIAuthTabCallback2);
    }

    public static final /* synthetic */ void onWarmupCompleted(StatusManager statusManager) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 344022326, new Object[]{statusManager}, R.drawable.IAuthTabCallback(), -344022316, iIAuthTabCallback2);
    }

    public static final /* synthetic */ r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ onNavigationEvent(StatusManager statusManager) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -2012029697, new Object[]{statusManager}, R.drawable.IAuthTabCallback(), 2012029699, iIAuthTabCallback2);
    }

    public static final /* synthetic */ void IAuthTabCallbackStub(StatusManager statusManager) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -789718411, new Object[]{statusManager}, R.drawable.IAuthTabCallback(), 789718434, iIAuthTabCallback2);
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStubProxy(StatusManager statusManager) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return ((Boolean) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1946129558, new Object[]{statusManager}, R.drawable.IAuthTabCallback(), -1946129544, iIAuthTabCallback2)).booleanValue();
    }

    private final TdsResultV0View onWarmupCompleted(Context context, String str, String str2, boolean z, String str3) {
        Object[] objArr = {this, context, str, str2, Boolean.valueOf(z), str3};
        return (TdsResultV0View) onNavigationEvent(R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 2144827544, objArr, R.drawable.IAuthTabCallback(), -2144827536, R.drawable.IAuthTabCallback());
    }

    private static final deserializeIp IAuthTabCallback(StatusManager statusManager, Throwable th) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (deserializeIp) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1199042718, new Object[]{statusManager, th}, R.drawable.IAuthTabCallback(), -1199042712, iIAuthTabCallback2);
    }

    private static final deserializeIp onMessageChannelReady(Function1 function1, Object obj) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (deserializeIp) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1430363707, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), 1430363716, iIAuthTabCallback2);
    }

    private static final Unit onExtraCallbackWithResult(StatusManager statusManager, IAuthTabCallback iAuthTabCallback) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1560610031, new Object[]{statusManager, iAuthTabCallback}, R.drawable.IAuthTabCallback(), -1560610019, iIAuthTabCallback2);
    }

    private static final void onPostMessage(Function1 function1, Object obj) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1083609868, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), 1083609889, iIAuthTabCallback2);
    }

    private static final void onMinimized(Function1 function1, Object obj) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1397873744, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), 1397873745, iIAuthTabCallback2);
    }

    private static final Unit IAuthTabCallback(Throwable th) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1330650354, new Object[]{th}, R.drawable.IAuthTabCallback(), 1330650376, iIAuthTabCallback2);
    }

    private static final Unit onNavigationEvent(StatusManager statusManager, Pair pair) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1627433929, new Object[]{statusManager, pair}, R.drawable.IAuthTabCallback(), -1627433903, iIAuthTabCallback2);
    }

    private static final void ICustomTabsCallbackDefault(Function1 function1, Object obj) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -684058544, new Object[]{function1, obj}, R.drawable.IAuthTabCallback(), 684058562, iIAuthTabCallback2);
    }

    private static final Unit onNavigationEvent(StatusManager statusManager, onExtraCallbackWithResult onextracallbackwithresult) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -366757617, new Object[]{statusManager, onextracallbackwithresult}, R.drawable.IAuthTabCallback(), 366757636, iIAuthTabCallback2);
    }

    private static final void asBinder(StatusManager statusManager, View view) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, 1690604496, new Object[]{statusManager, view}, R.drawable.IAuthTabCallback(), -1690604476, iIAuthTabCallback2);
    }

    public final writeRaw<IAuthTabCallback> onWarmupCompleted() {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (writeRaw) onNavigationEvent(R.drawable.IAuthTabCallback(), iIAuthTabCallback, -613548562, new Object[]{this}, R.drawable.IAuthTabCallback(), 613548577, iIAuthTabCallback2);
    }

    static void onTransact() {
        extraCallback = new char[]{51245, 64965, 64978, 64976, 64924, 64982, 51240, 64963, 64905, 64989, 64990, 51243, 64960, 64988, 51242, 64908, 65004, 64961, 64981, 64986, 64991, 64966, 64980, 64910, 64967};
        readTypedObject = (char) 51244;
    }
}
