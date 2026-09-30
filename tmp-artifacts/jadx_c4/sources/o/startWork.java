package o;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.tmoney.LiveCheckConstants;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.handleNativeAdClick;
import o.startWork;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class startWork {
    private static int ICustomTabsService = 0;
    private static int prefetch = 1;
    private long IAuthTabCallback;
    private WeakReference<View> IAuthTabCallbackDefault;
    private Function0<Unit> IAuthTabCallbackStub;
    private Function0<Unit> IAuthTabCallbackStubProxy;
    private Function1<? super Float, Unit> IAuthTabCallback_Parcel;
    private ListenableWorker ICustomTabsCallback;
    private getJobwork_runtime_ktx_release ICustomTabsCallbackDefault;
    private WeakReference<View> ICustomTabsCallbackStub;
    private WeakReference<TdsRoundLayout> ICustomTabsCallbackStubProxy;
    private int ICustomTabsCallback_Parcel;
    private Function0<Unit> access000;
    private WeakReference<FrameLayout> access100;
    private boolean asBinder;
    private Function0<Unit> asInterface;
    private boolean extraCallback;
    private final String extraCallbackWithResult;
    private int extraCommand;
    private Function0<Unit> getInterfaceDescriptor;
    private int isEngagementSignalsApiAvailable;
    private Integer mayLaunchUrl;
    private boolean onActivityLayout;
    private Bitmap onActivityResized;
    private float onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private handleNativeAdClick.onExtraCallback.asInterface onMessageChannelReady;
    private int onMinimized;
    private runOnUiThreadDelayed onNavigationEvent;
    private runOnUiThreadDelayed onPostMessage;
    private getFuturework_runtime_ktx_release onRelationshipValidationResult;
    private boolean onTransact;
    private Integer onUnminimized;
    private WeakReference<ViewGroup> onWarmupCompleted;
    private int readTypedObject;
    private WeakReference<FrameLayout> writeTypedObject;

    /* JADX WARN: Illegal instructions before constructor call */
    public startWork() {
        String str = null;
        this(str, 1, str);
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = i6 | i2;
        int i8 = ~((~i2) | i6);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i4 | i2));
        int i11 = (~(i2 | i9)) | i4;
        int i12 = i6 + i4 + i5 + (2127773517 * i) + (1026174006 * i3);
        int i13 = i12 * i12;
        int i14 = (i6 * (-484454144)) + 743702528 + ((-484454144) * i4) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i5) + (367263744 * i) + ((-1434976256) * i3) + (1105526784 * i13);
        int i15 = (i6 * 21308160) + 1622758390 + (i4 * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i5 * 21309107) + (i * 1708896471) + (i3 * 664464834) + (i13 * 287244288);
        switch (i14 + (i15 * i15 * 966983680)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return access100(objArr);
            case 11:
                startWork startwork = (startWork) objArr[0];
                int i16 = 2 % 2;
                int i17 = ICustomTabsService;
                int i18 = i17 + 67;
                prefetch = i18 % 128;
                int i19 = i18 % 2;
                Function0<Unit> function0 = startwork.getInterfaceDescriptor;
                int i20 = i17 + 105;
                prefetch = i20 % 128;
                int i21 = i20 % 2;
                return function0;
            case LiveCheckConstants.SVC_U1 /* 12 */:
                final FrameLayout frameLayout = (FrameLayout) objArr[0];
                final Function0 function02 = (Function0) objArr[1];
                int i22 = 2 % 2;
                frameLayout.postOnAnimation(new Runnable() { // from class: im.toss.base.transition.ScaleTransitionEntry$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i23 = 2 % 2;
                        int i24 = onExtraCallbackWithResult + 107;
                        onWarmupCompleted = i24 % 128;
                        int i25 = i24 % 2;
                        FrameLayout frameLayout2 = frameLayout;
                        if (i25 != 0) {
                            startWork.onExtraCallback(frameLayout2, function02);
                        } else {
                            startWork.onExtraCallback(frameLayout2, function02);
                            throw null;
                        }
                    }
                });
                int i23 = ICustomTabsService + 85;
                prefetch = i23 % 128;
                int i24 = i23 % 2;
                return null;
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ void onExtraCallback(FrameLayout frameLayout, Function0 function0) {
        int i = 2 % 2;
        int i2 = prefetch + 109;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1484618276, new Object[]{frameLayout, function0}, iOnExtraCallback2, -1484618271);
        int i4 = prefetch + 75;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = prefetch + 15;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(bitmap);
        int i4 = prefetch + 103;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(FrameLayout frameLayout, Function0 function0) {
        int i = 2 % 2;
        int i2 = prefetch + 87;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 946000811, new Object[]{frameLayout, function0}, iOnExtraCallback2, -946000799);
        int i4 = prefetch + 57;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    public startWork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extraCallbackWithResult = str;
        this.ICustomTabsCallback_Parcel = -1;
        this.extraCommand = -1;
        this.isEngagementSignalsApiAvailable = -1;
        this.onMinimized = -1;
        this.onTransact = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ startWork(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ICustomTabsService + 93;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "");
            int i4 = ICustomTabsService + 3;
            prefetch = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 3;
            } else {
                int i6 = 2 % 2;
            }
        }
        this(str);
    }

    public final String access100() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 95;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        String str = this.extraCallbackWithResult;
        int i5 = i3 + 19;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function1<Float, Unit> asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 59;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        Function1 function1 = this.IAuthTabCallback_Parcel;
        int i5 = i3 + 105;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public final void onWarmupCompleted(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 61;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackStubProxy = function0;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 73;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        startWork startwork = (startWork) objArr[0];
        Function0<Unit> function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 123;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        startwork.getInterfaceDescriptor = function0;
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
        int i6 = i2 + 5;
        prefetch = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        startWork startwork = (startWork) objArr[0];
        Function0<Unit> function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 51;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        startwork.access000 = function0;
        int i5 = i3 + 57;
        ICustomTabsService = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final Function0<Unit> onTransact() {
        int i = 2 % 2;
        int i2 = prefetch + 49;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        Function0<Unit> function0 = this.access000;
        int i5 = i3 + 13;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return function0;
    }

    public final Function0<Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 41;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = this.IAuthTabCallbackStub;
        int i5 = i2 + 1;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return function0;
        }
        throw null;
    }

    public final void onExtraCallback(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 25;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallbackStub = function0;
        int i5 = i3 + 83;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        startWork startwork = (startWork) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 45;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = startwork.asInterface;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return function0;
    }

    public final void onExtraCallbackWithResult(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 79;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        this.asInterface = function0;
        int i5 = i2 + 109;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Bitmap extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 103;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onActivityResized;
        }
        throw null;
    }

    public final getFuturework_runtime_ktx_release onPostMessage() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 85;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release = this.onRelationshipValidationResult;
        int i5 = i3 + 105;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return getfuturework_runtime_ktx_release;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getJobwork_runtime_ktx_release onActivityLayout() {
        getJobwork_runtime_ktx_release getjobwork_runtime_ktx_release;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 5;
        int i3 = i2 % 128;
        prefetch = i3;
        if (i2 % 2 == 0) {
            getjobwork_runtime_ktx_release = this.ICustomTabsCallbackDefault;
            int i4 = 99 / 0;
        } else {
            getjobwork_runtime_ktx_release = this.ICustomTabsCallbackDefault;
        }
        int i5 = i3 + 103;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return getjobwork_runtime_ktx_release;
    }

    public final int ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 79;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        int i5 = this.ICustomTabsCallback_Parcel;
        int i6 = i3 + 29;
        ICustomTabsService = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 45;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.extraCommand;
        int i6 = i2 + 105;
        prefetch = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 29;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        int i5 = this.isEngagementSignalsApiAvailable;
        int i6 = i3 + 125;
        ICustomTabsService = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
        return i5;
    }

    public final int readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 103;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        int i5 = this.onMinimized;
        int i6 = i3 + 33;
        ICustomTabsService = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Integer ICustomTabsCallbackDefault() {
        Integer num;
        int i = 2 % 2;
        int i2 = ICustomTabsService + 67;
        int i3 = i2 % 128;
        prefetch = i3;
        if (i2 % 2 == 0) {
            num = this.mayLaunchUrl;
            int i4 = 43 / 0;
        } else {
            num = this.mayLaunchUrl;
        }
        int i5 = i3 + 69;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final handleNativeAdClick.onExtraCallback.asInterface extraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 113;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        handleNativeAdClick.onExtraCallback.asInterface asinterface = this.onMessageChannelReady;
        int i5 = i2 + 41;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return asinterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        startWork startwork = (startWork) objArr[0];
        Integer num = (Integer) objArr[1];
        int i = 2 % 2;
        int i2 = prefetch + 111;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        startwork.onUnminimized = num;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 65;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final Integer onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = prefetch + 49;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onUnminimized;
        }
        throw null;
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 105;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        this.onActivityLayout = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 39;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 59;
        ICustomTabsService = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.onActivityLayout;
        int i4 = i2 + 23;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        startWork startwork = (startWork) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 41;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        boolean z = startwork.extraCallback;
        if (i4 != 0) {
            int i5 = 93 / 0;
        }
        int i6 = i2 + 95;
        ICustomTabsService = i6 % 128;
        int i7 = i6 % 2;
        return Boolean.valueOf(z);
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 5;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallback = z;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
    }

    public final void onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 45;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback = j;
        int i5 = i3 + 33;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 103;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        long j = this.IAuthTabCallback;
        int i5 = i2 + 119;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        startWork startwork = (startWork) objArr[0];
        int i = 2 % 2;
        int i2 = prefetch + 75;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        boolean z = startwork.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        return Boolean.valueOf(z);
    }

    public final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = prefetch + 77;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        this.onExtraCallbackWithResult = z;
        if (i4 != 0) {
            int i5 = 68 / 0;
        }
        int i6 = i3 + 115;
        prefetch = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        startWork startwork = (startWork) objArr[0];
        WeakReference<FrameLayout> weakReference = (WeakReference) objArr[1];
        int i = 2 % 2;
        int i2 = prefetch + 37;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        startwork.access100 = weakReference;
        int i5 = i3 + 25;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public final WeakReference<FrameLayout> getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 95;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        WeakReference<FrameLayout> weakReference = this.access100;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return weakReference;
    }

    public final WeakReference<FrameLayout> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = prefetch + 73;
        ICustomTabsService = i2 % 128;
        if (i2 % 2 == 0) {
            return this.writeTypedObject;
        }
        throw null;
    }

    public final void onNavigationEvent(@Nullable WeakReference<FrameLayout> weakReference) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 17;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        this.writeTypedObject = weakReference;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 73;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallbackDefault(@Nullable WeakReference<TdsRoundLayout> weakReference) {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 63;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        this.ICustomTabsCallbackStubProxy = weakReference;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 43;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
    }

    public final WeakReference<TdsRoundLayout> onMinimized() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 49;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        WeakReference<TdsRoundLayout> weakReference = this.ICustomTabsCallbackStubProxy;
        int i5 = i3 + 115;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return weakReference;
    }

    public final WeakReference<View> onActivityResized() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 97;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ICustomTabsCallbackStub;
        }
        throw null;
    }

    public final void onExtraCallback(@Nullable WeakReference<View> weakReference) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 73;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallbackStub = weakReference;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
    }

    public final void IAuthTabCallback(@Nullable WeakReference<View> weakReference) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 1;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault = weakReference;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
    }

    public final WeakReference<View> onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 3;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        WeakReference<View> weakReference = this.IAuthTabCallbackDefault;
        int i5 = i3 + 115;
        ICustomTabsService = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return weakReference;
    }

    public final WeakReference<ViewGroup> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = prefetch + 1;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        WeakReference<ViewGroup> weakReference = this.onWarmupCompleted;
        int i5 = i3 + 35;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return weakReference;
        }
        throw null;
    }

    public final void onWarmupCompleted(@Nullable WeakReference<ViewGroup> weakReference) {
        int i = 2 % 2;
        int i2 = prefetch + 109;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = weakReference;
        int i5 = i3 + 7;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
    }

    public final ListenableWorker IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 125;
        int i3 = i2 % 128;
        prefetch = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ListenableWorker listenableWorker = this.ICustomTabsCallback;
        int i4 = i3 + 113;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        return listenableWorker;
    }

    public final void onExtraCallback(@Nullable ListenableWorker listenableWorker) {
        int i = 2 % 2;
        int i2 = prefetch + 105;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        this.ICustomTabsCallback = listenableWorker;
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
    }

    public final void onNavigationEvent(@Nullable runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = prefetch + 69;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        this.onPostMessage = runonuithreaddelayed;
        int i5 = i3 + 31;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
    }

    public final runOnUiThreadDelayed writeTypedObject() {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 43;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = this.onPostMessage;
        int i5 = i2 + 95;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
        return runonuithreaddelayed;
    }

    public final runOnUiThreadDelayed onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 77;
        int i3 = i2 % 128;
        prefetch = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.onNavigationEvent;
        int i4 = i3 + 35;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return runonuithreaddelayed;
        }
        throw null;
    }

    public final void onWarmupCompleted(@Nullable runOnUiThreadDelayed runonuithreaddelayed) {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 17;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        this.onNavigationEvent = runonuithreaddelayed;
        int i5 = i2 + 119;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 107;
        ICustomTabsService = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback = f;
        int i5 = i2 + 101;
        ICustomTabsService = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 111;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.asBinder;
        int i5 = i2 + 83;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = prefetch + 45;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder = z;
        if (i3 != 0) {
            throw null;
        }
    }

    public final boolean onUnminimized() {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 19;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onTransact;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull getJobwork_runtime_ktx_release getjobwork_runtime_ktx_release, int i, int i2, int i3, int i4, @Nullable Integer num, @Nullable handleNativeAdClick.onExtraCallback.asInterface asinterface, int i5, @Nullable getFuturework_runtime_ktx_release getfuturework_runtime_ktx_release, @Nullable Bitmap bitmap) {
        int i6 = 2 % 2;
        int i7 = ICustomTabsService + 113;
        prefetch = i7 % 128;
        Object obj = null;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getjobwork_runtime_ktx_release, "");
            this.mayLaunchUrl = num;
            this.onMessageChannelReady = asinterface;
            this.readTypedObject = i5;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(getjobwork_runtime_ktx_release, "");
        this.mayLaunchUrl = num;
        this.onMessageChannelReady = asinterface;
        this.readTypedObject = i5;
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = null;
        }
        this.onActivityResized = bitmap;
        if (getfuturework_runtime_ktx_release != null) {
            int i8 = ICustomTabsService + 35;
            prefetch = i8 % 128;
            if (i8 % 2 == 0) {
                StringsKt.isBlank(getfuturework_runtime_ktx_release.onNavigationEvent());
                throw null;
            }
            if (StringsKt.isBlank(getfuturework_runtime_ktx_release.onNavigationEvent())) {
                getfuturework_runtime_ktx_release = null;
            }
        }
        this.onRelationshipValidationResult = getfuturework_runtime_ktx_release;
        this.ICustomTabsCallbackDefault = getjobwork_runtime_ktx_release;
        this.ICustomTabsCallback_Parcel = i;
        this.extraCommand = i2;
        this.isEngagementSignalsApiAvailable = i3;
        this.onMinimized = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r6
      0x003a: PHI (r6v3 int) = (r6v2 int), (r6v5 int) binds: [B:8:0x0038, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        startWork startwork = (startWork) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = prefetch;
        int i4 = i3 + 71;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 != 0) {
            i = startwork.isEngagementSignalsApiAvailable;
            int i5 = 49 / 0;
            if (i > 0) {
                int i6 = i3 + 63;
                ICustomTabsService = i6 % 128;
                int i7 = i6 % 2;
                int i8 = startwork.onMinimized;
                if (i8 > 0) {
                    int i9 = i3 + 119;
                    ICustomTabsService = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                    if (!zBooleanValue) {
                        startwork.onTransact = zBooleanValue;
                        startwork.ICustomTabsCallback_Parcel = (iIntValue / 2) - (i / 2);
                        startwork.extraCommand = (iIntValue2 / 2) - (i8 / 2);
                    }
                }
            }
        } else {
            i = startwork.isEngagementSignalsApiAvailable;
            if (i > 0) {
            }
        }
        return null;
    }

    public final boolean ICustomTabsService() {
        int i = 2 % 2;
        int i2 = ICustomTabsService;
        int i3 = i2 + 105;
        prefetch = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (this.onActivityResized == null && this.onRelationshipValidationResult == null) {
                int i4 = i2 + 91;
                prefetch = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                if (this.ICustomTabsCallbackDefault == null) {
                    return false;
                }
            }
            if (this.ICustomTabsCallback_Parcel == -1) {
                return false;
            }
            int i5 = prefetch;
            int i6 = i5 + 93;
            ICustomTabsService = i6 % 128;
            if (i6 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this.extraCommand == -1 || this.isEngagementSignalsApiAvailable == -1 || this.onMinimized == -1) {
                return false;
            }
            int i7 = i5 + 67;
            ICustomTabsService = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        FrameLayout frameLayout;
        startWork startwork = (startWork) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Function0<Unit> function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = ICustomTabsService + 75;
        int i3 = i2 % 128;
        prefetch = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            WeakReference<FrameLayout> weakReference = startwork.access100;
            obj.hashCode();
            throw null;
        }
        WeakReference<FrameLayout> weakReference2 = startwork.access100;
        if (weakReference2 != null) {
            int i4 = i3 + 59;
            ICustomTabsService = i4 % 128;
            if (i4 % 2 != 0) {
                weakReference2.get();
                obj.hashCode();
                throw null;
            }
            frameLayout = weakReference2.get();
        } else {
            frameLayout = null;
        }
        startwork.access100 = null;
        startwork.writeTypedObject = null;
        startwork.onNavigationEvent(frameLayout, zBooleanValue, function0);
        startwork.ICustomTabsCallbackStubProxy = null;
        startwork.ICustomTabsCallbackStub = null;
        startwork.IAuthTabCallbackDefault = null;
        startwork.onWarmupCompleted = null;
        startwork.ICustomTabsCallback = null;
        return null;
    }

    public final void ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = prefetch + 33;
        int i3 = i2 % 128;
        ICustomTabsService = i3;
        int i4 = i2 % 2;
        Function1<? super Float, Unit> function1 = this.IAuthTabCallback_Parcel;
        if (function1 != null) {
            int i5 = i3 + 55;
            prefetch = i5 % 128;
            if (i5 % 2 == 0) {
                function1.invoke(Float.valueOf(1.0f));
            } else {
                function1.invoke(Float.valueOf(1.0f));
            }
            int i6 = prefetch + 43;
            ICustomTabsService = i6 % 128;
            int i7 = i6 % 2;
        }
        Function0<Unit> function0 = this.IAuthTabCallbackStubProxy;
        if (function0 != null) {
            int i8 = prefetch + 117;
            ICustomTabsService = i8 % 128;
            int i9 = i8 % 2;
            function0.invoke();
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(startWork startwork, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = prefetch;
        int i4 = i3 + 101;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 79;
            ICustomTabsService = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        Object[] objArr = {startwork, Boolean.valueOf(z)};
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2115563899, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2115563909);
        int i8 = ICustomTabsService + 71;
        prefetch = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallback(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 87;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
            if (bitmap == null) {
                return;
            }
        } else if (bitmap == null) {
            return;
        }
        bitmap.recycle();
        int i4 = ICustomTabsService + 91;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(Bitmap bitmap) {
        int i = 2 % 2;
        int i2 = ICustomTabsService + 9;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(bitmap);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object access100(Object[] objArr) {
        FrameLayout frameLayout;
        startWork startwork = (startWork) objArr[0];
        boolean z = true;
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        runOnUiThreadDelayed runonuithreaddelayed = startwork.onPostMessage;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        startwork.onPostMessage = null;
        runOnUiThreadDelayed runonuithreaddelayed2 = startwork.onNavigationEvent;
        if (runonuithreaddelayed2 != null) {
            int i2 = prefetch + 25;
            ICustomTabsService = i2 % 128;
            int i3 = i2 % 2;
            runonuithreaddelayed2.onNavigationEvent();
        }
        startwork.onNavigationEvent = null;
        startwork.asBinder = false;
        startwork.extraCallback = false;
        startwork.IAuthTabCallback = 0L;
        startwork.onExtraCallbackWithResult = false;
        WeakReference<FrameLayout> weakReference = startwork.access100;
        if (weakReference != null) {
            int i4 = prefetch + 89;
            ICustomTabsService = i4 % 128;
            int i5 = i4 % 2;
            frameLayout = weakReference.get();
        } else {
            frameLayout = null;
        }
        boolean z2 = frameLayout != null;
        if (zBooleanValue) {
            int i6 = prefetch + 25;
            int i7 = i6 % 128;
            ICustomTabsService = i7;
            if (i6 % 2 != 0) {
                throw null;
            }
            if (z2) {
                int i8 = i7 + 99;
                prefetch = i8 % 128;
                int i9 = i8 % 2;
            } else {
                z = false;
            }
        }
        final Bitmap bitmap = startwork.onActivityResized;
        startwork.onActivityResized = null;
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2031073409, new Object[]{startwork, Boolean.valueOf(zBooleanValue), z ? new Function0() { // from class: im.toss.base.transition.ScaleTransitionEntry$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i10 = 2 % 2;
                int i11 = onExtraCallbackWithResult + 15;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                Unit unitOnExtraCallbackWithResult = startWork.onExtraCallbackWithResult(bitmap);
                if (i12 == 0) {
                    int i13 = 99 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        } : null}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2031073415);
        startwork.IAuthTabCallback_Parcel = null;
        startwork.IAuthTabCallbackStubProxy = null;
        startwork.access000 = null;
        startwork.getInterfaceDescriptor = null;
        startwork.asInterface = null;
        startwork.IAuthTabCallbackStub = null;
        if (!z) {
            IAuthTabCallback(bitmap);
        }
        startwork.onRelationshipValidationResult = null;
        startwork.ICustomTabsCallbackDefault = null;
        startwork.ICustomTabsCallback_Parcel = -1;
        startwork.extraCommand = -1;
        startwork.isEngagementSignalsApiAvailable = -1;
        startwork.onMinimized = -1;
        startwork.mayLaunchUrl = null;
        startwork.onUnminimized = null;
        startwork.onActivityLayout = false;
        startwork.extraCallback = false;
        startwork.ICustomTabsCallback = null;
        return null;
    }

    private static final void onNavigationEvent(FrameLayout frameLayout, Function0<Unit> function0) {
        ViewGroup viewGroup;
        int i = 2 % 2;
        frameLayout.setVisibility(8);
        ViewParent parent = frameLayout.getParent();
        Object obj = null;
        if (parent instanceof ViewGroup) {
            int i2 = ICustomTabsService + 117;
            int i3 = i2 % 128;
            prefetch = i3;
            int i4 = i2 % 2;
            viewGroup = (ViewGroup) parent;
            int i5 = i3 + 1;
            ICustomTabsService = i5 % 128;
            int i6 = i5 % 2;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(frameLayout);
        }
        if (function0 != null) {
            int i7 = ICustomTabsService + 3;
            prefetch = i7 % 128;
            int i8 = i7 % 2;
            function0.invoke();
            if (i8 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private final void onNavigationEvent(final FrameLayout frameLayout, boolean z, final Function0<Unit> function0) {
        int i = 2 % 2;
        if (frameLayout == null) {
            int i2 = ICustomTabsService + 61;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (getTaskExecutor.onWarmupCompleted.IAuthTabCallback(frameLayout, z, function0)) {
            return;
        }
        if (z) {
            frameLayout.setOnTouchListener(null);
            frameLayout.setClickable(false);
            frameLayout.setEnabled(false);
            frameLayout.postOnAnimation(new Runnable() { // from class: im.toss.base.transition.ScaleTransitionEntry$$ExternalSyntheticLambda2
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallback + 33;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    startWork.onExtraCallbackWithResult(frameLayout, function0);
                    int i7 = onExtraCallback + 7;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                }
            });
            return;
        }
        int i4 = prefetch + 101;
        ICustomTabsService = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(frameLayout, function0);
        int i6 = prefetch + 91;
        ICustomTabsService = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = prefetch + 87;
        ICustomTabsService = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(frameLayout, function0);
        if (i3 != 0) {
            throw null;
        }
        int i4 = prefetch + 123;
        ICustomTabsService = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final void onWarmupCompleted(FrameLayout frameLayout, Function0 function0) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 946000811, new Object[]{frameLayout, function0}, iOnExtraCallback2, -946000799);
    }

    private static final void IAuthTabCallback(FrameLayout frameLayout, Function0 function0) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1484618276, new Object[]{frameLayout, function0}, iOnExtraCallback2, -1484618271);
    }

    public final void onNavigationEvent(boolean z, int i, int i2) {
        Object[] objArr = {this, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2)};
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -102710934, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 102710934);
    }

    public final void onNavigationEvent(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2115563899, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2115563909);
    }

    public final void onWarmupCompleted(boolean z, @Nullable Function0<Unit> function0) {
        Object[] objArr = {this, Boolean.valueOf(z), function0};
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -2031073409, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 2031073415);
    }

    public final boolean onExtraCallbackWithResult() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return ((Boolean) onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 173212765, new Object[]{this}, iOnExtraCallback2, -173212764)).booleanValue();
    }

    public final Function0<Unit> asInterface() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Function0) onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1666755791, new Object[]{this}, iOnExtraCallback2, -1666755789);
    }

    public final Function0<Unit> IAuthTabCallbackStub() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Function0) onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1525916084, new Object[]{this}, iOnExtraCallback2, -1525916073);
    }

    public final boolean access000() {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return ((Boolean) onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -796467992, new Object[]{this}, iOnExtraCallback2, 796467999)).booleanValue();
    }

    public final void IAuthTabCallback(@Nullable Function0<Unit> function0) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1623774966, new Object[]{this, function0}, iOnExtraCallback2, -1623774962);
    }

    public final void onNavigationEvent(@Nullable Function0<Unit> function0) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1120842593, new Object[]{this, function0}, iOnExtraCallback2, -1120842590);
    }

    public final void onExtraCallbackWithResult(@Nullable WeakReference<FrameLayout> weakReference) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1950767050, new Object[]{this, weakReference}, iOnExtraCallback2, -1950767042);
    }

    public final void IAuthTabCallback(@Nullable Integer num) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onExtraCallback(CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -845680777, new Object[]{this, num}, iOnExtraCallback2, 845680786);
    }
}
