package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.gms.internal.ads.zzgc;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.log.NativeAdsLogManager$;
import im.toss.ads_sdk.log.NativeAdsTrackingFlushWorker;
import im.toss.ads_sdk.log.TrackingLogRecord;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import im.toss.state.spec.SessionState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.calculatePageOffsets;
import o.dispatchOnPageScrolled;
import o.findResAndMsg;
import o.getPackageType;
import o.pageScrolled;
import o.unregisterDataSetObserver;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class calculatePageOffsets {
    private static int ICustomTabsCallbackStub = 0;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static int mayLaunchUrl = 1;
    private static int onRelationshipValidationResult;
    private final Context IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final Object IAuthTabCallbackStub;
    private Function1<? super String, Unit> IAuthTabCallbackStubProxy;
    private final Handler IAuthTabCallback_Parcel;
    private Map<String, Function0<Unit>> ICustomTabsCallback;
    private Set<String> ICustomTabsCallbackDefault;
    private final CopyOnWriteArrayList<WeakReference<onExtraCallbackWithResult>> access000;
    private AtomicBoolean access100;
    private final findResAndMsg asBinder;
    private Set<String> asInterface;
    private final Object extraCallback;
    private Set<String> extraCallbackWithResult;
    private final Lazy getInterfaceDescriptor;
    private final pageScrolled onActivityLayout;
    private final Object onActivityResized;
    private final enableLayers onExtraCallback;
    private final onSecondaryPointerUp onExtraCallbackWithResult;
    private Map<String, getPackageType> onMessageChannelReady;
    private final SessionState onMinimized;
    private getPackageType onPostMessage;
    private Set<String> onTransact;
    private final performDrag onUnminimized;
    private final zzad onWarmupCompleted;
    private Set<String> readTypedObject;
    private Map<String, Function0<Unit>> writeTypedObject;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onNavigationEvent = 8;

    static final class IAuthTabCallbackStub extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatePageOffsets.this, null, null, null, null, null, null, this}, -1209902379, 1209902390, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            int i4 = onWarmupCompleted + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static final class asInterface extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = calculatePageOffsets.onWarmupCompleted(calculatePageOffsets.this, (getPageWidth) null, (onExtraCallback) null, (Function1) null, (access13800) this);
            int i4 = IAuthTabCallback + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    public interface onExtraCallbackWithResult {
        default void IAuthTabCallback() {
            int i = 2 % 2;
        }

        default void IAuthTabCallback(@NotNull CharSequence charSequence) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
        }

        default void onEvent(@NotNull NativeAdsEventLogType nativeAdsEventLogType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        }

        default void onExtraCallbackWithResult() {
            int i = 2 % 2;
        }

        default void onNavigationEvent(@NotNull CharSequence charSequence) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(charSequence, "");
        }

        default void onWarmupCompleted() {
            int i = 2 % 2;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            String str2;
            String str3;
            RequestBody requestBody;
            boolean z;
            boolean z2;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            calculatePageOffsets calculatepageoffsets = calculatePageOffsets.this;
            if (i3 == 0) {
                str = null;
                str2 = null;
                str3 = null;
                requestBody = null;
                z = false;
                z2 = true;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                requestBody = null;
                z = false;
                z2 = false;
            }
            return calculatePageOffsets.onExtraCallback(calculatepageoffsets, str, str2, str3, requestBody, z, z2, (access13800) this);
        }
    }

    static final class onTransact extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        onTransact(access13800<? super onTransact> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatePageOffsets.this, null, null, null, null, null, null, null, false, false, this}, 271629036, -271629026, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent());
            int i4 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static {
        int i = ICustomTabsCallbackStub + 5;
        mayLaunchUrl = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 63;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onNavigationEvent(function0);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onRelationshipValidationResult + 53;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        WeakReference weakReference = (WeakReference) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 71;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(weakReference);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(weakReference);
        int i3 = onRelationshipValidationResult + 53;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 97;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[0];
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnNavigationEvent4, objArr2, -1980995850, 1980995859, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
        int i4 = ICustomTabsCallbackStubProxy + 55;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 21;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[0], 2002994953, -2002994935, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
        int i4 = ICustomTabsCallbackStubProxy + 81;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ boolean onExtraCallback(calculatePageOffsets calculatepageoffsets) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 15;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        boolean zBooleanValue = ((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatepageoffsets}, 485201967, -485201965, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent)).booleanValue();
        int i4 = ICustomTabsCallbackStubProxy + 109;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(calculatePageOffsets calculatepageoffsets, String str, getPackageType getpackagetype, Throwable th) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 119;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(calculatepageoffsets, str, getpackagetype, th);
        int i4 = onRelationshipValidationResult + 29;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(calculatePageOffsets calculatepageoffsets, findResAndMsg findresandmsg, getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, Function0 function0, Function0 function02, Function0 function03) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 83;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(calculatepageoffsets, findresandmsg, getpagewidth, dispatchonpagescrolled, str, function0, function02, function03);
        int i4 = onRelationshipValidationResult + 15;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, String str, String str2, String str3, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 121;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, str, str2, str3, i);
        int i5 = onRelationshipValidationResult + 63;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Request onExtraCallbackWithResult(calculatePageOffsets calculatepageoffsets, String str, int i) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 35;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(calculatepageoffsets, str, i);
        }
        onExtraCallback(calculatepageoffsets, str, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        dispatchOnPageScrolled.onWarmupCompleted onWarmupCompleted2;
        String str;
        int i7;
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = ~(i8 | i9);
        int i11 = ~i2;
        int i12 = i10 | (~(i11 | i6));
        int i13 = (~(i6 | i8)) | (~(i9 | i11));
        int i14 = ~(i3 | i2);
        int i15 = i13 | i14;
        int i16 = i14 | i12;
        int i17 = i3 + i2 + i4 + ((-1585779005) * i5) + (640148872 * i);
        int i18 = i17 * i17;
        int i19 = (i3 * (-1291220770)) + 263398195 + (i2 * (-1291220770)) + (i12 * (-1802)) + (i15 * (-901)) + (i16 * 901) + ((-1291221671) * i4) + ((-1079815989) * i5) + (669414472 * i) + (i18 * 145489920);
        switch ((i3 * 308833806) + 153878528 + (308833806 * i2) + ((-448846874) * i12) + ((-224423437) * i15) + (224423437 * i16) + (84410368 * i4) + (1159200768 * i5) + ((-734003200) * i) + (2089549824 * i18) + (i19 * i19 * (-1699479552))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onNavigationEvent(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
                String str2 = (String) objArr[1];
                NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
                Function0 function0 = (Function0) objArr[3];
                int i20 = 2 % 2;
                NativeAdsDto.AdAsset adAssetOnNavigationEvent = dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAsset);
                NativeAdsEventLogType.onWarmupCompleted onwarmupcompleted = NativeAdsEventLogType.onWarmupCompleted.onExtraCallbackWithResult;
                if (!dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAssetOnNavigationEvent, onwarmupcompleted)) {
                    return null;
                }
                int i21 = ICustomTabsCallbackStubProxy + 121;
                onRelationshipValidationResult = i21 % 128;
                int i22 = i21 % 2;
                getPageWidth getpagewidthOnExtraCallback = getPageWidth.Companion.onExtraCallback(str2, adAsset);
                Object[] objArr2 = {calculatepageoffsets, getPageWidth.onWarmupCompleted(getpagewidthOnExtraCallback, onwarmupcompleted, null, 2, null)};
                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                if (!((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr2, 598063969, -598063964, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent)).booleanValue()) {
                    return null;
                }
                int i23 = ICustomTabsCallbackStubProxy + 31;
                onRelationshipValidationResult = i23 % 128;
                if (i23 % 2 != 0) {
                    calculatepageoffsets.onWarmupCompleted(onwarmupcompleted);
                    onWarmupCompleted2 = dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(adAssetOnNavigationEvent);
                    str = null;
                    i7 = 53;
                } else {
                    calculatepageoffsets.onWarmupCompleted(onwarmupcompleted);
                    onWarmupCompleted2 = dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(adAssetOnNavigationEvent);
                    str = null;
                    i7 = 8;
                }
                onNavigationEvent(calculatepageoffsets, getpagewidthOnExtraCallback, onWarmupCompleted2, onwarmupcompleted, str, function0, i7, null);
                return null;
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return onTransact(objArr);
            case 10:
                return asBinder(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return getInterfaceDescriptor(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return access100(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return access000(objArr);
            case 16:
                calculatePageOffsets calculatepageoffsets2 = (calculatePageOffsets) objArr[0];
                String str3 = (String) objArr[1];
                NativeAdsDto.AdAsset adAsset2 = (NativeAdsDto.AdAsset) objArr[2];
                Function0<Unit> function02 = (Function0) objArr[3];
                int i24 = 2 % 2;
                int i25 = onRelationshipValidationResult + 23;
                ICustomTabsCallbackStubProxy = i25 % 128;
                int i26 = i25 % 2;
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(function02, "");
                if (adAsset2 == null) {
                    return null;
                }
                calculatepageoffsets2.IAuthTabCallback(str3, adAsset2, function02);
                int i27 = onRelationshipValidationResult + 11;
                ICustomTabsCallbackStubProxy = i27 % 128;
                int i28 = i27 % 2;
                return null;
            case 17:
                return writeTypedObject(objArr);
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                return extraCallback(objArr);
            case 19:
                return ICustomTabsCallback(objArr);
            case 20:
                return extraCallbackWithResult(objArr);
            default:
                return onExtraCallbackWithResult(objArr);
        }
    }

    public static /* synthetic */ void onNavigationEvent(calculatePageOffsets calculatepageoffsets, String str, Integer num, unregisterDataSetObserver unregisterdatasetobserver, String str2) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 1;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(calculatepageoffsets, str, num, unregisterdatasetobserver, str2);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 67;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(calculatePageOffsets calculatepageoffsets, findResAndMsg findresandmsg, String str, NativeAdsDto.AdAsset adAsset, Function0 function0, Function0 function02, Function1 function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 47;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(calculatepageoffsets, findresandmsg, str, adAsset, function0, function02, function1);
        }
        onNavigationEvent(calculatepageoffsets, findresandmsg, str, adAsset, function0, function02, function1);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(calculatePageOffsets calculatepageoffsets, findResAndMsg findresandmsg, String str, NativeAdsDto.AdAsset adAsset, Function0 function0, Function1 function1) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 119;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            IAuthTabCallback(calculatepageoffsets, findresandmsg, str, adAsset, function0, function1);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(calculatepageoffsets, findresandmsg, str, adAsset, function0, function1);
        int i3 = onRelationshipValidationResult + 67;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 21;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, nativeAdsEventLogType);
        int i4 = onRelationshipValidationResult + 115;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, WeakReference weakReference) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 91;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(onextracallbackwithresult, weakReference);
        int i4 = onRelationshipValidationResult + 9;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallback;
    }

    @Inject
    public calculatePageOffsets(@NotNull Context context, @NotNull performDrag performdrag, @NotNull pageScrolled pagescrolled, @NotNull enableLayers enablelayers, @NotNull SessionState sessionState, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(performdrag, "");
        Intrinsics.checkNotNullParameter(pagescrolled, "");
        Intrinsics.checkNotNullParameter(enablelayers, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.IAuthTabCallback = context;
        this.onUnminimized = performdrag;
        this.onActivityLayout = pagescrolled;
        this.onExtraCallback = enablelayers;
        this.onMinimized = sessionState;
        this.onWarmupCompleted = zzadVar;
        this.getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 97;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Boolean boolValueOf = Boolean.valueOf(calculatePageOffsets.onExtraCallback(this.f$0));
                int i4 = onWarmupCompleted + 25;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return boolValueOf;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.access000 = new CopyOnWriteArrayList<>();
        this.onExtraCallbackWithResult = new onSecondaryPointerUp() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda11
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // o.onSecondaryPointerUp
            public final void onResult(String str, Integer num, unregisterDataSetObserver unregisterdatasetobserver, String str2) throws NoWhenBranchMatchedException {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 5;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    calculatePageOffsets.onNavigationEvent(this.f$0, str, num, unregisterdatasetobserver, str2);
                    throw null;
                }
                calculatePageOffsets.onNavigationEvent(this.f$0, str, num, unregisterdatasetobserver, str2);
                int i3 = IAuthTabCallback + 55;
                onExtraCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        };
        this.access100 = new AtomicBoolean(false);
        this.onTransact = new HashSet();
        this.extraCallbackWithResult = new HashSet();
        this.ICustomTabsCallbackDefault = new HashSet();
        this.asInterface = new HashSet();
        this.readTypedObject = new HashSet();
        this.IAuthTabCallbackStub = new Object();
        this.writeTypedObject = new LinkedHashMap();
        this.extraCallback = new Object();
        this.onMessageChannelReady = new LinkedHashMap();
        this.onActivityResized = new Object();
        this.ICustomTabsCallback = new LinkedHashMap();
        this.IAuthTabCallback_Parcel = new Handler(Looper.getMainLooper());
        this.asBinder = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()).plus(new getInterfaceDescriptor(CoroutineExceptionHandler.extraCallbackWithResult)));
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 7;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        enableLayers enablelayers = calculatepageoffsets.onExtraCallback;
        int i5 = i2 + 93;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return enablelayers;
        }
        throw null;
    }

    public static final /* synthetic */ performDrag IAuthTabCallbackDefault(calculatePageOffsets calculatepageoffsets) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 41;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        performDrag performdrag = calculatepageoffsets.onUnminimized;
        int i5 = i2 + 65;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return performdrag;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        Function1<? super unregisterDataSetObserver, Unit> function1 = (Function1) objArr[6];
        access13800<? super Unit> access13800Var = (access13800) objArr[7];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 11;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            calculatepageoffsets.onExtraCallback(str, str2, str3, str4, str5, function1, access13800Var);
            throw null;
        }
        Object objOnExtraCallback = calculatepageoffsets.onExtraCallback(str, str2, str3, str4, str5, function1, access13800Var);
        int i3 = onRelationshipValidationResult + 89;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackStubProxy(calculatePageOffsets calculatepageoffsets) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 53;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        boolean z = calculatepageoffsets.IAuthTabCallbackDefault;
        int i5 = i3 + 15;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final /* synthetic */ void IAuthTabCallback_Parcel(calculatePageOffsets calculatepageoffsets) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 93;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        calculatepageoffsets.IAuthTabCallbackStubProxy();
        int i4 = ICustomTabsCallbackStubProxy + 15;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws Throwable {
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        RequestBody requestBody = (RequestBody) objArr[4];
        String str4 = (String) objArr[5];
        String str5 = (String) objArr[6];
        String str6 = (String) objArr[7];
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
        access13800<? super onWarmupCompleted> access13800Var = (access13800) objArr[10];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 51;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return calculatepageoffsets.onExtraCallback(str, str2, str3, requestBody, str4, str5, str6, zBooleanValue, zBooleanValue2, access13800Var);
        }
        calculatepageoffsets.onExtraCallback(str, str2, str3, requestBody, str4, str5, str6, zBooleanValue, zBooleanValue2, access13800Var);
        throw null;
    }

    public static final /* synthetic */ Map asBinder(calculatePageOffsets calculatepageoffsets) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 13;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Function0<Unit>> map = calculatepageoffsets.writeTypedObject;
        int i5 = i2 + 27;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public static final /* synthetic */ Map asInterface(calculatePageOffsets calculatepageoffsets) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 107;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Function0<Unit>> map = calculatepageoffsets.ICustomTabsCallback;
        int i5 = i2 + 5;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return map;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 15;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            calculatepageoffsets.onWarmupCompleted(str);
            throw null;
        }
        String strOnWarmupCompleted = calculatepageoffsets.onWarmupCompleted(str);
        int i3 = onRelationshipValidationResult + 89;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 4 / 0;
        }
        return strOnWarmupCompleted;
    }

    public static final /* synthetic */ Object onExtraCallback(calculatePageOffsets calculatepageoffsets, String str, String str2, String str3, RequestBody requestBody, boolean z, boolean z2, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 61;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = calculatepageoffsets.onExtraCallbackWithResult(str, str2, str3, requestBody, z, z2, access13800Var);
        int i4 = ICustomTabsCallbackStubProxy + 87;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onExtraCallback(calculatePageOffsets calculatepageoffsets, String str, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 47;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        calculatepageoffsets.onWarmupCompleted(str, nativeAdsEventLogType);
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 105;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 75;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        Object obj = calculatepageoffsets.extraCallback;
        int i5 = i3 + 113;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(calculatePageOffsets calculatepageoffsets, getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, Function1 function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 101;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = calculatepageoffsets.IAuthTabCallback(getpagewidth, dispatchonpagescrolled, str, function1);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 23;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return zIAuthTabCallback;
    }

    public static final /* synthetic */ String onNavigationEvent(calculatePageOffsets calculatepageoffsets) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 17;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            calculatepageoffsets.asInterface();
            throw null;
        }
        String strAsInterface = calculatepageoffsets.asInterface();
        int i3 = onRelationshipValidationResult + 21;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return strAsInterface;
    }

    public static final /* synthetic */ void onNavigationEvent(calculatePageOffsets calculatepageoffsets, boolean z) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 109;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        calculatepageoffsets.onWarmupCompleted(z);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ pageScrolled onTransact(calculatePageOffsets calculatepageoffsets) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 7;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        pageScrolled pagescrolled = calculatepageoffsets.onActivityLayout;
        int i5 = i2 + 93;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return pagescrolled;
    }

    public static final /* synthetic */ Object onWarmupCompleted(calculatePageOffsets calculatepageoffsets, getPageWidth getpagewidth, onExtraCallback onextracallback, Function1 function1, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 115;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            return calculatepageoffsets.onWarmupCompleted(getpagewidth, onextracallback, (Function1<? super NativeAdsEventLogType, Unit>) function1, (access13800<? super Unit>) access13800Var);
        }
        calculatepageoffsets.onWarmupCompleted(getpagewidth, onextracallback, (Function1<? super NativeAdsEventLogType, Unit>) function1, (access13800<? super Unit>) access13800Var);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 101;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        Handler handler = calculatepageoffsets.IAuthTabCallback_Parcel;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 39;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return handler;
    }

    public static final /* synthetic */ findResAndMsg onWarmupCompleted(calculatePageOffsets calculatepageoffsets) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 65;
        ICustomTabsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        findResAndMsg findresandmsg = calculatepageoffsets.asBinder;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 65;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return findresandmsg;
    }

    public static final class getInterfaceDescriptor extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public getInterfaceDescriptor(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                th.getMessage();
                obj.hashCode();
                throw null;
            }
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray2 = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String message = th.getMessage();
            if (message == null) {
                int i3 = onExtraCallback + 43;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    th.getClass().getSimpleName();
                    obj.hashCode();
                    throw null;
                }
                message = th.getClass().getSimpleName();
            }
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray2, "NativeAdsLogManager", "Native ads tracking coroutine failed", access8100.onNavigationEvent(getWrite.IAuthTabCallback("error", message)), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        }
    }

    private final boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 3;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.getInterfaceDescriptor.getValue()).booleanValue();
        int i4 = ICustomTabsCallbackStubProxy + 69;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 81;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        boolean zMediaMetadataCompat = calculatepageoffsets.onWarmupCompleted.MediaMetadataCompat();
        int i4 = onRelationshipValidationResult + 85;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zMediaMetadataCompat);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 47;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        onExtraCallbackWithResult();
        CopyOnWriteArrayList<WeakReference<onExtraCallbackWithResult>> copyOnWriteArrayList = this.access000;
        if (copyOnWriteArrayList != null) {
            int i4 = ICustomTabsCallbackStubProxy + 7;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (((WeakReference) it.next()).get() == onextracallbackwithresult) {
                        int i6 = ICustomTabsCallbackStubProxy + 59;
                        onRelationshipValidationResult = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    }
                }
            }
        }
        this.access000.add(new WeakReference<>(onextracallbackwithresult));
    }

    private static final boolean onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, WeakReference weakReference) {
        int i = 2 % 2;
        if (weakReference.get() != null) {
            int i2 = ICustomTabsCallbackStubProxy + 55;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            if (weakReference.get() != onextracallbackwithresult) {
                int i4 = onRelationshipValidationResult + 7;
                ICustomTabsCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        int i6 = onRelationshipValidationResult + 107;
        ICustomTabsCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public final void IAuthTabCallback(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        CollectionsKt.removeAll(this.access000, new NativeAdsLogManager$.ExternalSyntheticLambda1(onextracallbackwithresult));
        int i2 = onRelationshipValidationResult + 37;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void onWarmupCompleted(calculatePageOffsets calculatepageoffsets, String str, Integer num, unregisterDataSetObserver unregisterdatasetobserver, String str2) throws NoWhenBranchMatchedException {
        String str3;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 13;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(unregisterdatasetobserver, "");
            calculatepageoffsets.IAuthTabCallbackStub();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(unregisterdatasetobserver, "");
        if (calculatepageoffsets.IAuthTabCallbackStub()) {
            if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback)) {
                str3 = "OnSuccess Log: " + str + " (" + num + ")";
            } else if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
                str3 = "OnServerError Log: " + str + " (" + num + ")";
            } else if (unregisterdatasetobserver instanceof unregisterDataSetObserver.onExtraCallback) {
                str3 = "OnTerminalError Log: " + str + " (" + num + ")";
            } else {
                if (!Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                str3 = "OnFailed Log: " + str + ", error: " + str2;
                int i3 = onRelationshipValidationResult + 15;
                ICustomTabsCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            }
            calculatepageoffsets.onExtraCallbackWithResult();
            Iterator<T> it = calculatepageoffsets.access000.iterator();
            while (it.hasNext()) {
                int i5 = onRelationshipValidationResult + 9;
                ICustomTabsCallbackStubProxy = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) ((WeakReference) it.next()).get();
                if (onextracallbackwithresult != null) {
                    onextracallbackwithresult.onNavigationEvent(str3);
                }
            }
        }
    }

    private final String asInterface() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 69;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = this.onMinimized.onWarmupCompleted();
        if (strOnWarmupCompleted != null) {
            int i4 = onRelationshipValidationResult + 103;
            ICustomTabsCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                StringsKt.isBlank(strOnWarmupCompleted);
                throw null;
            }
            if (!StringsKt.isBlank(strOnWarmupCompleted)) {
                return strOnWarmupCompleted;
            }
        }
        int i5 = ICustomTabsCallbackStubProxy + 31;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(calculatePageOffsets calculatepageoffsets, findResAndMsg findresandmsg, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 33;
        int i4 = i3 % 128;
        onRelationshipValidationResult = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 99;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        calculatepageoffsets.onExtraCallbackWithResult(findresandmsg, z);
    }

    static final class access000 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        int label;

        access000(access13800<? super access000> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access000 access000Var = calculatePageOffsets.this.new access000(access13800Var);
            int i2 = onWarmupCompleted + 85;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return access000Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 43;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 73 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 17;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Object obj2 = null;
            if (!calculatePageOffsets.IAuthTabCallbackStubProxy(calculatePageOffsets.this)) {
                calculatePageOffsets.onNavigationEvent(calculatePageOffsets.this, true);
                maybeUpdateAnimatable.onNavigationEvent(calculatePageOffsets.onWarmupCompleted(calculatePageOffsets.this), (CoroutineContext) null, (setRandomHost) null, new AnonymousClass1(calculatePageOffsets.this, null), 3, (Object) null);
                Unit unit = Unit.INSTANCE;
                int i4 = onWarmupCompleted + 15;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }
            int i6 = onWarmupCompleted + 27;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                Unit unit2 = Unit.INSTANCE;
                obj2.hashCode();
                throw null;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: o.calculatePageOffsets$access000$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ calculatePageOffsets this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(calculatePageOffsets calculatepageoffsets, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.this$0 = calculatepageoffsets;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, access13800Var);
                int i2 = onExtraCallback + 85;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 66 / 0;
                }
                return anonymousClass1;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 5;
                onNavigationEvent = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 != 0) {
                    return onNavigationEvent(findresandmsg, access13800Var);
                }
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 71;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                if (i3 == 0) {
                    int i4 = 2 / 0;
                }
                return objInvokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                Pair pairIAuthTabCallback;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i = this.label;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    Object[] objArr = {this.this$0};
                    int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    Object objOnNavigationEvent = calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -1956944968, 1956944968, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
                    calculatePageOffsets calculatepageoffsets = this.this$0;
                    synchronized (objOnNavigationEvent) {
                        pairIAuthTabCallback = getWrite.IAuthTabCallback(CollectionsKt.toList(calculatePageOffsets.asInterface(calculatepageoffsets).values()), CollectionsKt.toList(calculatePageOffsets.asBinder(calculatepageoffsets).values()));
                    }
                    List list = (List) pairIAuthTabCallback.onExtraCallbackWithResult();
                    List list2 = (List) pairIAuthTabCallback.IAuthTabCallback();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((Function0) it2.next()).invoke();
                    }
                    pageScrolled pagescrolledOnTransact = calculatePageOffsets.onTransact(this.this$0);
                    this.L$0 = access15400.onNavigationEvent(list);
                    this.L$1 = access15400.onNavigationEvent(list2);
                    this.label = 1;
                    if (pagescrolledOnTransact.IAuthTabCallback((access13800<? super pageScrolled.IAuthTabCallback>) this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull findResAndMsg findresandmsg, boolean z) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 45;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            int i3 = 73 / 0;
            if (!(!z)) {
                this.IAuthTabCallbackDefault = false;
                int i4 = onRelationshipValidationResult + 67;
                ICustomTabsCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(findresandmsg, "");
            if (z) {
            }
        }
        this.onPostMessage = maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new access000(null), 3, (Object) null);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(calculatePageOffsets calculatepageoffsets, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult;
        int i4 = i3 + 85;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 41;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        calculatepageoffsets.onExtraCallback(z);
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 121;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        if (z) {
            int i5 = i2 + 59;
            onRelationshipValidationResult = i5 % 128;
            int i6 = i5 % 2;
            this.IAuthTabCallbackDefault = true;
        }
        onWarmupCompleted(false);
        IAuthTabCallbackDefault();
    }

    public final void IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getPackageType getpackagetype = this.onPostMessage;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        this.onPostMessage = null;
        String strOnExtraCallback = recomputeScrollPosition.onExtraCallback(str);
        synchronized (this.extraCallback) {
            Map<String, Function0<Unit>> map = this.ICustomTabsCallback;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Function0<Unit>> entry : map.entrySet()) {
                if (!StringsKt.startsWith$default(entry.getKey(), strOnExtraCallback, false, 2, (Object) null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            this.ICustomTabsCallback = access8100.onWarmupCompleted(linkedHashMap);
            Map<String, Function0<Unit>> map2 = this.writeTypedObject;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, Function0<Unit>> entry2 : map2.entrySet()) {
                if (!StringsKt.startsWith$default(entry2.getKey(), strOnExtraCallback, false, 2, (Object) null)) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            this.writeTypedObject = access8100.onWarmupCompleted(linkedHashMap2);
            Unit unit = Unit.INSTANCE;
        }
        onExtraCallback(str);
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        getPackageType getpackagetype = calculatepageoffsets.onPostMessage;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        calculatepageoffsets.onPostMessage = null;
        synchronized (calculatepageoffsets.extraCallback) {
            calculatepageoffsets.ICustomTabsCallback.clear();
            calculatepageoffsets.writeTypedObject.clear();
            Unit unit = Unit.INSTANCE;
        }
        calculatepageoffsets.IAuthTabCallback();
        return null;
    }

    private final void IAuthTabCallbackDefault() {
        List list;
        synchronized (this.onActivityResized) {
            list = CollectionsKt.toList(this.onMessageChannelReady.values());
            this.onMessageChannelReady.clear();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            getPackageType.onWarmupCompleted.onWarmupCompleted((getPackageType) it.next(), (CancellationException) null, 1, (Object) null);
        }
    }

    public final void onExtraCallback(@NotNull final findResAndMsg findresandmsg, @NotNull final String str, @NotNull final NativeAdsDto.AdAsset adAsset, @NotNull final Function0<Boolean> function0, @Nullable final Function1<? super NativeAdsEventLogType, Unit> function1) {
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(function0, "");
        getPageWidth getpagewidthOnExtraCallback = getPageWidth.Companion.onExtraCallback(str, adAsset);
        if (!this.access100.get()) {
            synchronized (this.extraCallback) {
                this.ICustomTabsCallback.put(getPageWidth.onWarmupCompleted(getpagewidthOnExtraCallback, null, null, 3, null), new Function0() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda6
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 91;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        calculatePageOffsets calculatepageoffsets = this.f$0;
                        findResAndMsg findresandmsg2 = findresandmsg;
                        if (i3 == 0) {
                            return calculatePageOffsets.onWarmupCompleted(calculatepageoffsets, findresandmsg2, str, adAsset, function0, function1);
                        }
                        int i4 = 38 / 0;
                        return calculatePageOffsets.onWarmupCompleted(calculatepageoffsets, findresandmsg2, str, adAsset, function0, function1);
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        if (((Boolean) function0.invoke()).booleanValue()) {
            NativeAdsDto.AdAsset adAssetOnNavigationEvent = dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAsset);
            if (dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAssetOnNavigationEvent, NativeAdsEventLogType.IAuthTabCallbackDefault.IAuthTabCallback)) {
                onNavigationEvent(getpagewidthOnExtraCallback, dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(adAssetOnNavigationEvent), (String) null, function1);
            }
        }
    }

    private static final Unit IAuthTabCallback(calculatePageOffsets calculatepageoffsets, findResAndMsg findresandmsg, String str, NativeAdsDto.AdAsset adAsset, Function0 function0, Function1 function1) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 115;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            calculatepageoffsets.onExtraCallback(findresandmsg, str, adAsset, function0, function1);
            Unit unit = Unit.INSTANCE;
            int i3 = ICustomTabsCallbackStubProxy + 7;
            onRelationshipValidationResult = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        calculatepageoffsets.onExtraCallback(findresandmsg, str, adAsset, function0, function1);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull final findResAndMsg findresandmsg, @NotNull final String str, @NotNull final NativeAdsDto.AdAsset adAsset, @NotNull final Function0<Boolean> function0, @NotNull final Function0<Boolean> function02, @Nullable final Function1<? super NativeAdsEventLogType, Unit> function1) {
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        getPageWidth getpagewidthOnExtraCallback = getPageWidth.Companion.onExtraCallback(str, adAsset);
        if (!this.access100.get()) {
            synchronized (this.extraCallback) {
                this.writeTypedObject.put(getPageWidth.onWarmupCompleted(getpagewidthOnExtraCallback, null, null, 3, null), new Function0() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda7
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 69;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        Unit unitOnWarmupCompleted = calculatePageOffsets.onWarmupCompleted(this.f$0, findresandmsg, str, adAsset, function0, function02, function1);
                        int i4 = onExtraCallback + 39;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                        return unitOnWarmupCompleted;
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        NativeAdsDto.AdAsset adAssetOnNavigationEvent = dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAsset);
        if (((Boolean) function0.invoke()).booleanValue() && dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAssetOnNavigationEvent, NativeAdsEventLogType.asInterface.onExtraCallbackWithResult)) {
            onExtraCallbackWithResult(getpagewidthOnExtraCallback, dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(adAssetOnNavigationEvent), (String) null, function1);
        }
        onExtraCallback(findresandmsg, getpagewidthOnExtraCallback, dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(adAssetOnNavigationEvent), (String) null, function02, function1);
    }

    private static final Unit onNavigationEvent(calculatePageOffsets calculatepageoffsets, findResAndMsg findresandmsg, String str, NativeAdsDto.AdAsset adAsset, Function0 function0, Function0 function02, Function1 function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 13;
        onRelationshipValidationResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            calculatepageoffsets.onExtraCallback(findresandmsg, str, adAsset, (Function0<Boolean>) function0, (Function0<Boolean>) function02, (Function1<? super NativeAdsEventLogType, Unit>) function1);
            Unit unit = Unit.INSTANCE;
            int i3 = ICustomTabsCallbackStubProxy + 65;
            onRelationshipValidationResult = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        calculatepageoffsets.onExtraCallback(findresandmsg, str, adAsset, (Function0<Boolean>) function0, (Function0<Boolean>) function02, (Function1<? super NativeAdsEventLogType, Unit>) function1);
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback(findResAndMsg findresandmsg, getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, Function0<Boolean> function0, Function1<? super NativeAdsEventLogType, Unit> function1) {
        getPackageType getpackagetypeRemove;
        boolean z;
        NativeAdsEventLogType.getInterfaceDescriptor getinterfacedescriptor = NativeAdsEventLogType.getInterfaceDescriptor.onExtraCallbackWithResult;
        final String strOnExtraCallback = getpagewidth.onExtraCallback(getinterfacedescriptor, str);
        if (((Boolean) function0.invoke()).booleanValue() && dispatchonpagescrolled.onExtraCallback(getinterfacedescriptor)) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            if (((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, strOnExtraCallback}, -2035369452, 2035369455, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent)).booleanValue()) {
                return;
            }
            final getPackageType getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, setRandomHost.LAZY, new IAuthTabCallbackStubProxy(function0, this, getpagewidth, dispatchonpagescrolled, str, function1, null), 1, (Object) null);
            synchronized (this.onActivityResized) {
                if (this.onMessageChannelReady.containsKey(strOnExtraCallback)) {
                    z = false;
                } else {
                    this.onMessageChannelReady.put(strOnExtraCallback, getpackagetypeOnNavigationEvent);
                    z = true;
                }
            }
            if (!z) {
                getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeOnNavigationEvent, (CancellationException) null, 1, (Object) null);
                return;
            } else {
                getpackagetypeOnNavigationEvent.onExtraCallback(new Function1() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda13
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i = 2 % 2;
                        int i2 = onNavigationEvent + 23;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        Unit unitOnExtraCallbackWithResult = calculatePageOffsets.onExtraCallbackWithResult(this.f$0, strOnExtraCallback, getpackagetypeOnNavigationEvent, (Throwable) obj);
                        int i4 = onExtraCallbackWithResult + 59;
                        onNavigationEvent = i4 % 128;
                        if (i4 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                });
                getpackagetypeOnNavigationEvent.IAuthTabCallback_Parcel();
                return;
            }
        }
        synchronized (this.onActivityResized) {
            getpackagetypeRemove = this.onMessageChannelReady.remove(strOnExtraCallback);
        }
        if (getpackagetypeRemove != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeRemove, (CancellationException) null, 1, (Object) null);
        }
    }

    static final class IAuthTabCallbackStubProxy extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ dispatchOnPageScrolled $beacons;
        final /* synthetic */ getPageWidth $identity;
        final /* synthetic */ String $itemKey;
        final /* synthetic */ Function1<NativeAdsEventLogType, Unit> $onFire;
        final /* synthetic */ Function0<Boolean> $seenImpressionPredicate;
        int label;
        final /* synthetic */ calculatePageOffsets this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackStubProxy(Function0<Boolean> function0, calculatePageOffsets calculatepageoffsets, getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, Function1<? super NativeAdsEventLogType, Unit> function1, access13800<? super IAuthTabCallbackStubProxy> access13800Var) {
            super(2, access13800Var);
            this.$seenImpressionPredicate = function0;
            this.this$0 = calculatepageoffsets;
            this.$identity = getpagewidth;
            this.$beacons = dispatchonpagescrolled;
            this.$itemKey = str;
            this.$onFire = function1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStubProxy iAuthTabCallbackStubProxy = new IAuthTabCallbackStubProxy(this.$seenImpressionPredicate, this.this$0, this.$identity, this.$beacons, this.$itemKey, this.$onFire, access13800Var);
            int i2 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStubProxy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 85;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(1000L, this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallbackWithResult + 31;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            if (((Boolean) this.$seenImpressionPredicate.invoke()).booleanValue()) {
                int i6 = onWarmupCompleted + 51;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                calculatePageOffsets.onExtraCallbackWithResult(this.this$0, this.$identity, this.$beacons, this.$itemKey, this.$onFire);
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    private static final Unit onNavigationEvent(calculatePageOffsets calculatepageoffsets, String str, getPackageType getpackagetype, Throwable th) {
        Unit unit;
        synchronized (calculatepageoffsets.onActivityResized) {
            if (Intrinsics.areEqual(calculatepageoffsets.onMessageChannelReady.get(str), getpackagetype)) {
                calculatepageoffsets.onMessageChannelReady.remove(str);
            }
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        final calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        final findResAndMsg findresandmsg = (findResAndMsg) objArr[1];
        final getPageWidth getpagewidth = (getPageWidth) objArr[2];
        final dispatchOnPageScrolled dispatchonpagescrolled = (dispatchOnPageScrolled) objArr[3];
        final String str = (String) objArr[4];
        final Function0 function0 = (Function0) objArr[5];
        final Function0 function02 = (Function0) objArr[6];
        final Function0<Boolean> function03 = (Function0) objArr[7];
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(getpagewidth, "");
        Intrinsics.checkNotNullParameter(dispatchonpagescrolled, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        if (!calculatepageoffsets.access100.get()) {
            synchronized (calculatepageoffsets.extraCallback) {
                calculatepageoffsets.writeTypedObject.put(getPageWidth.onWarmupCompleted(getpagewidth, null, str, 1, null), new Function0() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        Unit unitOnExtraCallbackWithResult;
                        int i = 2 % 2;
                        int i2 = onExtraCallback + 57;
                        onNavigationEvent = i2 % 128;
                        if (i2 % 2 == 0) {
                            unitOnExtraCallbackWithResult = calculatePageOffsets.onExtraCallbackWithResult(this.f$0, findresandmsg, getpagewidth, dispatchonpagescrolled, str, function0, function02, function03);
                            int i3 = 88 / 0;
                        } else {
                            unitOnExtraCallbackWithResult = calculatePageOffsets.onExtraCallbackWithResult(this.f$0, findresandmsg, getpagewidth, dispatchonpagescrolled, str, function0, function02, function03);
                        }
                        int i4 = onNavigationEvent + 105;
                        onExtraCallback = i4 % 128;
                        if (i4 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
            return null;
        }
        if (((Boolean) function0.invoke()).booleanValue() && dispatchonpagescrolled.onExtraCallback(NativeAdsEventLogType.IAuthTabCallbackDefault.IAuthTabCallback)) {
            onWarmupCompleted(calculatepageoffsets, getpagewidth, dispatchonpagescrolled, str, (Function1) null, 8, (Object) null);
        }
        if (((Boolean) function02.invoke()).booleanValue() && dispatchonpagescrolled.onExtraCallback(NativeAdsEventLogType.asInterface.onExtraCallbackWithResult)) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            ((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatepageoffsets, getpagewidth, dispatchonpagescrolled, str, null, 8, null}, -912802792, 912802809, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent)).booleanValue();
        }
        calculatepageoffsets.onExtraCallback(findresandmsg, getpagewidth, dispatchonpagescrolled, str, function03, (Function1<? super NativeAdsEventLogType, Unit>) null);
        return null;
    }

    private static final Unit IAuthTabCallback(calculatePageOffsets calculatepageoffsets, findResAndMsg findresandmsg, getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, Function0 function0, Function0 function02, Function0 function03) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 53;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {calculatepageoffsets, findresandmsg, getpagewidth, dispatchonpagescrolled, str, function0, function02, function03};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 13907675, -13907655, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i4 = onRelationshipValidationResult + 83;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull NativeAdsDto.AdAsset adAsset, @NotNull NativeAdsEventLogType nativeAdsEventLogType, @Nullable Function1<? super NativeAdsEventLogType, Unit> function1) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 117;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        NativeAdsDto.AdAsset adAssetOnNavigationEvent = dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAsset);
        if (dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAssetOnNavigationEvent, nativeAdsEventLogType)) {
            getPageWidth getpagewidthOnExtraCallback = getPageWidth.Companion.onExtraCallback(str, adAsset);
            if (IAuthTabCallbackDefault(getPageWidth.onWarmupCompleted(getpagewidthOnExtraCallback, nativeAdsEventLogType, null, 2, null))) {
                int i4 = ICustomTabsCallbackStubProxy + 95;
                onRelationshipValidationResult = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                if (function1 != null) {
                    function1.invoke(nativeAdsEventLogType);
                }
                onWarmupCompleted(nativeAdsEventLogType);
                onNavigationEvent(this, getpagewidthOnExtraCallback, dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(adAssetOnNavigationEvent), nativeAdsEventLogType, null, null, 24, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(calculatePageOffsets calculatepageoffsets, String str, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 53;
        int i4 = i3 % 128;
        onRelationshipValidationResult = i4;
        if (i3 % 2 == 0 ? (i & 8) != 0 : (i & 26) != 0) {
            int i5 = i4 + 93;
            ICustomTabsCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 92 / 0;
            }
            function1 = null;
        }
        calculatepageoffsets.onNavigationEvent(str, adAsset, nativeAdsEventLogType, (Function1<? super NativeAdsEventLogType, Unit>) function1);
        int i7 = onRelationshipValidationResult + 33;
        ICustomTabsCallbackStubProxy = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull NativeAdsDto.AdAsset adAsset, @NotNull NativeAdsEventLogType nativeAdsEventLogType, @Nullable Function1<? super NativeAdsEventLogType, Unit> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 119;
        onRelationshipValidationResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(adAsset, "");
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAsset), nativeAdsEventLogType);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        NativeAdsDto.AdAsset adAssetOnNavigationEvent = dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAsset);
        if (dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAssetOnNavigationEvent, nativeAdsEventLogType)) {
            getPageWidth getpagewidthOnExtraCallback = getPageWidth.Companion.onExtraCallback(str, adAsset);
            if (NativeAdsEventLogType.Companion.onExtraCallback().contains(nativeAdsEventLogType)) {
                int i3 = onRelationshipValidationResult + 71;
                int i4 = i3 % 128;
                ICustomTabsCallbackStubProxy = i4;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                if (function1 != null) {
                    int i5 = i4 + 61;
                    onRelationshipValidationResult = i5 % 128;
                    int i6 = i5 % 2;
                    function1.invoke(nativeAdsEventLogType);
                }
                onWarmupCompleted(nativeAdsEventLogType);
                onNavigationEvent(this, getpagewidthOnExtraCallback, dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(adAssetOnNavigationEvent), nativeAdsEventLogType, null, null, 24, null);
                return;
            }
            Object[] objArr = {this, getPageWidth.onWarmupCompleted(getpagewidthOnExtraCallback, nativeAdsEventLogType, null, 2, null)};
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            if (((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 598063969, -598063964, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent)).booleanValue()) {
                int i7 = onRelationshipValidationResult + 63;
                ICustomTabsCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                if (function1 != null) {
                    function1.invoke(nativeAdsEventLogType);
                }
                onWarmupCompleted(nativeAdsEventLogType);
                onNavigationEvent(this, getpagewidthOnExtraCallback, dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(adAssetOnNavigationEvent), nativeAdsEventLogType, null, null, 24, null);
            }
        }
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws Throwable {
        Iterator it;
        String str;
        getPageWidth getpagewidth;
        onExtraCallback onextracallback;
        ArrayList arrayList;
        long j;
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        String str2 = (String) objArr[1];
        NativeAdsDto.AdAsset adAsset = (NativeAdsDto.AdAsset) objArr[2];
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[3];
        dispatchOnPageScrolled dispatchonpagescrolled = (dispatchOnPageScrolled) objArr[4];
        String str3 = (String) objArr[5];
        Function1 function1 = (Function1) objArr[6];
        Function0 function0 = (Function0) objArr[7];
        int i = 2 % 2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(adAsset, "");
        Intrinsics.checkNotNullParameter(dispatchonpagescrolled, "");
        Intrinsics.checkNotNullParameter(function0, "");
        getPageWidth getpagewidthOnExtraCallback = getPageWidth.Companion.onExtraCallback(str2, adAsset);
        List<NativeAdsEventLogType> listOnExtraCallback = calculatepageoffsets.onExtraCallback(getpagewidthOnExtraCallback, dispatchonpagescrolled, str3, nativeAdsEventLogType);
        String strOnWarmupCompleted = dispatchonpagescrolled.onWarmupCompleted();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listOnExtraCallback.iterator();
        while (true) {
            String strOnNavigationEvent = null;
            if (!it2.hasNext()) {
                break;
            }
            NativeAdsEventLogType nativeAdsEventLogType2 = (NativeAdsEventLogType) it2.next();
            List<String> listOnWarmupCompleted = dispatchonpagescrolled.onWarmupCompleted(nativeAdsEventLogType2);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
            Iterator<T> it3 = listOnWarmupCompleted.iterator();
            while (it3.hasNext()) {
                arrayList3.add(dispatchonpagescrolled.IAuthTabCallback((String) it3.next()));
            }
            if (arrayList3.isEmpty()) {
                int i2 = ICustomTabsCallbackStubProxy + 119;
                onRelationshipValidationResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 93 / 0;
                }
                it = it2;
                str = str4;
                getpagewidth = getpagewidthOnExtraCallback;
                arrayList = arrayList2;
                j = jCurrentTimeMillis;
                onextracallback = null;
            } else {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, str4);
                if (dispatchonpagescrolled.onExtraCallbackWithResult()) {
                    it = it2;
                    str = str4;
                    getpagewidth = getpagewidthOnExtraCallback;
                    strOnNavigationEvent = calculatepageoffsets.onExtraCallback.onNavigationEvent(nativeAdsEventLogType2.toString(), strOnWarmupCompleted, calculatepageoffsets.asInterface(), ViewPager.IAuthTabCallback.IAuthTabCallback(jCurrentTimeMillis));
                } else {
                    it = it2;
                    str = str4;
                    getpagewidth = getpagewidthOnExtraCallback;
                }
                arrayList = arrayList2;
                j = jCurrentTimeMillis;
                onextracallback = new onExtraCallback(string, nativeAdsEventLogType2, arrayList3, strOnNavigationEvent, str3);
            }
            if (onextracallback != null) {
                arrayList.add(onextracallback);
            }
            int i4 = onRelationshipValidationResult + 79;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            it2 = it;
            arrayList2 = arrayList;
            str4 = str;
            getpagewidthOnExtraCallback = getpagewidth;
            jCurrentTimeMillis = j;
        }
        getPageWidth getpagewidth2 = getpagewidthOnExtraCallback;
        ArrayList arrayList4 = arrayList2;
        long j2 = jCurrentTimeMillis;
        if (arrayList4.isEmpty()) {
            function0.invoke();
            return null;
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            int i6 = onRelationshipValidationResult + 83;
            ICustomTabsCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                calculatepageoffsets.onWarmupCompleted(((onExtraCallback) it4.next()).onNavigationEvent());
                int i7 = 90 / 0;
            } else {
                calculatepageoffsets.onWarmupCompleted(((onExtraCallback) it4.next()).onNavigationEvent());
            }
        }
        maybeUpdateAnimatable.onNavigationEvent(calculatepageoffsets.asBinder, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback_Parcel(arrayList4, calculatepageoffsets, str2, strOnWarmupCompleted, j2, str3, dispatchonpagescrolled, getpagewidth2, function0, function1, null), 3, (Object) null);
        return null;
    }

    public static final class IAuthTabCallback_Parcel extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ dispatchOnPageScrolled $beacons;
        final /* synthetic */ List<onExtraCallback> $entries;
        final /* synthetic */ getPageWidth $identity;
        final /* synthetic */ String $itemKey;
        final /* synthetic */ long $now;
        final /* synthetic */ Function1<NativeAdsEventLogType, Unit> $onFire;
        final /* synthetic */ Function0<Unit> $onPersisted;
        final /* synthetic */ String $payload;
        final /* synthetic */ String $requestId;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ calculatePageOffsets this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback_Parcel(List<onExtraCallback> list, calculatePageOffsets calculatepageoffsets, String str, String str2, long j, String str3, dispatchOnPageScrolled dispatchonpagescrolled, getPageWidth getpagewidth, Function0<Unit> function0, Function1<? super NativeAdsEventLogType, Unit> function1, access13800<? super IAuthTabCallback_Parcel> access13800Var) {
            super(2, access13800Var);
            this.$entries = list;
            this.this$0 = calculatepageoffsets;
            this.$requestId = str;
            this.$payload = str2;
            this.$now = j;
            this.$itemKey = str3;
            this.$beacons = dispatchonpagescrolled;
            this.$identity = getpagewidth;
            this.$onPersisted = function0;
            this.$onFire = function1;
        }

        public static /* synthetic */ void onExtraCallback(Function0 function0) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 55;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(function0);
            int i4 = IAuthTabCallback + 5;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_Parcel = new IAuthTabCallback_Parcel(this.$entries, this.this$0, this.$requestId, this.$payload, this.$now, this.$itemKey, this.$beacons, this.$identity, this.$onPersisted, this.$onFire, access13800Var);
            iAuthTabCallback_Parcel.L$0 = obj;
            int i2 = onNavigationEvent + 103;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback_Parcel;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback_Parcel iAuthTabCallback_ParcelCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return iAuthTabCallback_ParcelCreate.invokeSuspend(Unit.INSTANCE);
            }
            iAuthTabCallback_ParcelCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        private static final void IAuthTabCallback(Function0 function0) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            int i4 = onNavigationEvent + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;
            final /* synthetic */ onExtraCallback $entry;
            final /* synthetic */ getPageWidth $identity;
            final /* synthetic */ Function1<NativeAdsEventLogType, Unit> $onFire;
            int label;
            final /* synthetic */ calculatePageOffsets this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            onNavigationEvent(calculatePageOffsets calculatepageoffsets, getPageWidth getpagewidth, onExtraCallback onextracallback, Function1<? super NativeAdsEventLogType, Unit> function1, access13800<? super onNavigationEvent> access13800Var) {
                super(2, access13800Var);
                this.this$0 = calculatepageoffsets;
                this.$identity = getpagewidth;
                this.$entry = onextracallback;
                this.$onFire = function1;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, this.$identity, this.$entry, this.$onFire, access13800Var);
                int i2 = IAuthTabCallback + 19;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 77 / 0;
                }
                return onnavigationevent;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 35;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 99;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 55;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 13;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = IAuthTabCallback + 107;
                    int i4 = i3 % 128;
                    onExtraCallback = i4;
                    int i5 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i4 + 45;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    calculatePageOffsets calculatepageoffsets = this.this$0;
                    getPageWidth getpagewidth = this.$identity;
                    onExtraCallback onextracallback = this.$entry;
                    Function1<NativeAdsEventLogType, Unit> function1 = this.$onFire;
                    this.label = 1;
                    if (calculatePageOffsets.onWarmupCompleted(calculatepageoffsets, getpagewidth, onextracallback, (Function1) function1, (access13800) this) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i8 = onExtraCallback + 73;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                return unit;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0197  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0167 -> B:21:0x0176). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            dispatchOnPageScrolled dispatchonpagescrolled;
            Object obj2;
            getPageWidth getpagewidth;
            Iterator it;
            calculatePageOffsets calculatepageoffsets;
            Collection collection;
            Object obj3;
            long j;
            int i;
            findResAndMsg findresandmsg;
            String str3;
            int i2;
            Object obj4;
            int i3 = 2 % 2;
            int i4 = onNavigationEvent + 125;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            findResAndMsg findresandmsg2 = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            if (i5 != 0) {
                int i6 = IAuthTabCallback + 73;
                int i7 = i6 % 128;
                onNavigationEvent = i7;
                if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i7 + 77;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                int i10 = this.I$1;
                int i11 = this.I$0;
                long j2 = this.J$0;
                Collection collection2 = (Collection) this.L$13;
                onExtraCallback onextracallback = (onExtraCallback) this.L$12;
                Iterator it2 = (Iterator) this.L$10;
                collection = (Collection) this.L$9;
                Object obj5 = (Iterable) this.L$8;
                getPageWidth getpagewidth2 = (getPageWidth) this.L$7;
                dispatchOnPageScrolled dispatchonpagescrolled2 = (dispatchOnPageScrolled) this.L$6;
                String str4 = (String) this.L$5;
                String str5 = (String) this.L$4;
                dispatchOnPageScrolled dispatchonpagescrolled3 = dispatchonpagescrolled2;
                String str6 = (String) this.L$3;
                calculatePageOffsets calculatepageoffsets2 = (calculatePageOffsets) this.L$2;
                Object obj6 = (Iterable) this.L$1;
                ResultKt.onNavigationEvent(obj);
                onExtraCallback onextracallback2 = onextracallback;
                Object objOnNavigationEvent = obj;
                obj4 = obj6;
                findresandmsg = findresandmsg2;
                obj3 = objOnWarmupCompleted;
                i2 = i10;
                str2 = str4;
                i = i11;
                str = str6;
                str3 = str5;
                Object obj7 = obj5;
                it = it2;
                j = j2;
                collection2.add(onExtraCallback.onNavigationEvent(onextracallback2, (String) objOnNavigationEvent, null, null, null, null, 30, null));
                getpagewidth = getpagewidth2;
                dispatchonpagescrolled = dispatchonpagescrolled3;
                obj2 = obj7;
                calculatepageoffsets = calculatepageoffsets2;
                if (it.hasNext()) {
                    Object next = it.next();
                    Object obj8 = obj3;
                    onExtraCallback onextracallback3 = (onExtraCallback) next;
                    int i12 = i2;
                    performDrag performdragIAuthTabCallbackDefault = calculatePageOffsets.IAuthTabCallbackDefault(calculatepageoffsets);
                    TrackingLogRecord trackingLogRecord = new TrackingLogRecord(onextracallback3.onExtraCallback(), str, (List) onextracallback3.IAuthTabCallback(), str3, onextracallback3.onNavigationEvent().toString(), j, onextracallback3.onWarmupCompleted(), 0, str2, dispatchonpagescrolled.onExtraCallback(), getpagewidth.onExtraCallbackWithResult(), getpagewidth.IAuthTabCallback(), false, 4224, (DefaultConstructorMarker) null);
                    this.L$0 = findresandmsg;
                    findResAndMsg findresandmsg3 = findresandmsg;
                    this.L$1 = access15400.onNavigationEvent(obj4);
                    this.L$2 = calculatepageoffsets;
                    this.L$3 = str;
                    this.L$4 = str3;
                    this.L$5 = str2;
                    this.L$6 = dispatchonpagescrolled;
                    getPageWidth getpagewidth3 = getpagewidth;
                    this.L$7 = getpagewidth3;
                    calculatePageOffsets calculatepageoffsets3 = calculatepageoffsets;
                    this.L$8 = access15400.onNavigationEvent(obj2);
                    this.L$9 = collection;
                    this.L$10 = it;
                    this.L$11 = access15400.onNavigationEvent(next);
                    this.L$12 = onextracallback3;
                    this.L$13 = collection;
                    this.J$0 = j;
                    this.I$0 = i;
                    this.I$1 = i12;
                    this.I$2 = 0;
                    this.label = 1;
                    objOnNavigationEvent = performdragIAuthTabCallbackDefault.onNavigationEvent(trackingLogRecord, this);
                    if (objOnNavigationEvent == obj8) {
                        return obj8;
                    }
                    calculatepageoffsets2 = calculatepageoffsets3;
                    onextracallback2 = onextracallback3;
                    obj3 = obj8;
                    dispatchonpagescrolled3 = dispatchonpagescrolled;
                    collection2 = collection;
                    obj7 = obj2;
                    i2 = i12;
                    getpagewidth2 = getpagewidth3;
                    findresandmsg = findresandmsg3;
                    collection2.add(onExtraCallback.onNavigationEvent(onextracallback2, (String) objOnNavigationEvent, null, null, null, null, 30, null));
                    getpagewidth = getpagewidth2;
                    dispatchonpagescrolled = dispatchonpagescrolled3;
                    obj2 = obj7;
                    calculatepageoffsets = calculatepageoffsets2;
                    if (it.hasNext()) {
                        findResAndMsg findresandmsg4 = findresandmsg;
                        calculatePageOffsets.IAuthTabCallback_Parcel(this.this$0);
                        Object[] objArr = {this.this$0};
                        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                        Handler handler = (Handler) calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -1914565215, 1914565219, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
                        final Function0<Unit> function0 = this.$onPersisted;
                        handler.post(new Runnable() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$persistThenFireClickLog$2$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 0;
                            private static int onNavigationEvent = 1;

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i13 = 2 % 2;
                                int i14 = IAuthTabCallback + 113;
                                onNavigationEvent = i14 % 128;
                                int i15 = i14 % 2;
                                calculatePageOffsets.IAuthTabCallback_Parcel.onExtraCallback(function0);
                                int i16 = onNavigationEvent + 41;
                                IAuthTabCallback = i16 % 128;
                                if (i16 % 2 == 0) {
                                    return;
                                }
                                Object obj9 = null;
                                obj9.hashCode();
                                throw null;
                            }
                        });
                        calculatePageOffsets calculatepageoffsets4 = this.this$0;
                        getPageWidth getpagewidth4 = this.$identity;
                        Function1<NativeAdsEventLogType, Unit> function1 = this.$onFire;
                        Iterator it3 = ((List) collection).iterator();
                        while (it3.hasNext()) {
                            maybeUpdateAnimatable.onNavigationEvent(findresandmsg4, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(calculatepageoffsets4, getpagewidth4, (onExtraCallback) it3.next(), function1, null), 3, (Object) null);
                            int i13 = IAuthTabCallback + 29;
                            onNavigationEvent = i13 % 128;
                            int i14 = i13 % 2;
                        }
                        return Unit.INSTANCE;
                    }
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                List<onExtraCallback> list = this.$entries;
                calculatePageOffsets calculatepageoffsets5 = this.this$0;
                str = this.$requestId;
                String str7 = this.$payload;
                long j3 = this.$now;
                str2 = this.$itemKey;
                dispatchonpagescrolled = this.$beacons;
                getPageWidth getpagewidth5 = this.$identity;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                obj2 = list;
                getpagewidth = getpagewidth5;
                it = list.iterator();
                calculatepageoffsets = calculatepageoffsets5;
                collection = arrayList;
                obj3 = objOnWarmupCompleted;
                j = j3;
                i = 0;
                findresandmsg = findresandmsg2;
                str3 = str7;
                i2 = 0;
                obj4 = obj2;
                if (it.hasNext()) {
                }
            }
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j, @Nullable Function1<? super unregisterDataSetObserver, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        maybeUpdateAnimatable.onNavigationEvent(this.asBinder, (CoroutineContext) null, (setRandomHost) null, new access100(str, str2, str5, str4, j, str3, function1, null), 3, (Object) null);
        int i2 = onRelationshipValidationResult + 5;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class access100 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $logType;
        final /* synthetic */ Function1<unregisterDataSetObserver, Unit> $onFireResult;
        final /* synthetic */ String $payload;
        final /* synthetic */ String $requestBodyJson;
        final /* synthetic */ String $requestId;
        final /* synthetic */ long $requestTs;
        final /* synthetic */ String $url;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        access100(String str, String str2, String str3, String str4, long j, String str5, Function1<? super unregisterDataSetObserver, Unit> function1, access13800<? super access100> access13800Var) {
            super(2, access13800Var);
            this.$requestId = str;
            this.$url = str2;
            this.$payload = str3;
            this.$logType = str4;
            this.$requestTs = j;
            this.$requestBodyJson = str5;
            this.$onFireResult = function1;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 97;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            access100 access100Var = calculatePageOffsets.this.new access100(this.$requestId, this.$url, this.$payload, this.$logType, this.$requestTs, this.$requestBodyJson, this.$onFireResult, access13800Var);
            int i2 = onNavigationEvent + 89;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 39 / 0;
            }
            return access100Var;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 31;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 85 / 0;
            }
            return objIAuthTabCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00e0, code lost:
        
            if (o.calculatePageOffsets.onNavigationEvent(im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new java.lang.Object[]{r1, r3, r2, r4, r5, r6, r7, r27}, -1209902379, 1209902390, r15, r16, r17) == r9) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                performDrag performdragIAuthTabCallbackDefault = calculatePageOffsets.IAuthTabCallbackDefault(calculatePageOffsets.this);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                TrackingLogRecord trackingLogRecord = new TrackingLogRecord(string, this.$requestId, CollectionsKt.listOf(this.$url), this.$payload, this.$logType, this.$requestTs, this.$requestBodyJson, 0, (String) null, (String) null, (String) null, (String) null, false, 8064, (DefaultConstructorMarker) null);
                this.label = 1;
                objOnNavigationEvent = performdragIAuthTabCallbackDefault.onNavigationEvent(trackingLogRecord, this);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            int i5 = onWarmupCompleted;
            int i6 = i5 + 121;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0 ? i4 != 1 : i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = i5 + 95;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            ResultKt.onNavigationEvent(obj);
            objOnNavigationEvent = obj;
            String str = (String) objOnNavigationEvent;
            calculatePageOffsets.IAuthTabCallback_Parcel(calculatePageOffsets.this);
            calculatePageOffsets calculatepageoffsets = calculatePageOffsets.this;
            String str2 = this.$requestId;
            String str3 = this.$url;
            String str4 = this.$requestBodyJson;
            String str5 = this.$logType;
            Function1<unregisterDataSetObserver, Unit> function1 = this.$onFireResult;
            this.L$0 = access15400.onNavigationEvent(str);
            this.label = 2;
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0170, code lost:
    
        if (r8.onExtraCallback(r6, r9, r15) == r14) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(String str, String str2, String str3, String str4, String str5, Function1<? super unregisterDataSetObserver, Unit> function1, access13800<? super Unit> access13800Var) {
        IAuthTabCallbackStub iAuthTabCallbackStub;
        Object obj;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Function1<? super unregisterDataSetObserver, Unit> function12;
        RequestBody requestBody;
        List<String> listListOf;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallbackStub) {
            int i2 = onRelationshipValidationResult + 63;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            iAuthTabCallbackStub = (IAuthTabCallbackStub) access13800Var;
            int i4 = iAuthTabCallbackStub.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallbackStub.label = i4 - 2147483648;
            } else {
                iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var);
            }
        }
        IAuthTabCallbackStub iAuthTabCallbackStub2 = iAuthTabCallbackStub;
        Object objOnExtraCallback = iAuthTabCallbackStub2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallbackStub2.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            RequestBody requestBodyOnExtraCallback = this.onExtraCallback.onExtraCallback(str4);
            boolean zAreEqual = Intrinsics.areEqual(str5, "CLICK");
            iAuthTabCallbackStub2.L$0 = access15400.onNavigationEvent(str);
            iAuthTabCallbackStub2.L$1 = str2;
            iAuthTabCallbackStub2.L$2 = str3;
            iAuthTabCallbackStub2.L$3 = access15400.onNavigationEvent(str4);
            iAuthTabCallbackStub2.L$4 = access15400.onNavigationEvent(str5);
            iAuthTabCallbackStub2.L$5 = function1;
            iAuthTabCallbackStub2.L$6 = access15400.onNavigationEvent(requestBodyOnExtraCallback);
            iAuthTabCallbackStub2.label = 1;
            obj = objOnWarmupCompleted;
            objOnExtraCallback = onExtraCallback(this, str, str2, str3, requestBodyOnExtraCallback, "", null, str5, zAreEqual, false, iAuthTabCallbackStub2, 256, null);
            if (objOnExtraCallback != obj) {
                int i6 = onRelationshipValidationResult + 89;
                ICustomTabsCallbackStubProxy = i6 % 128;
                int i7 = i6 % 2;
                str6 = str;
                str7 = str2;
                str8 = str3;
                str9 = str4;
                str10 = str5;
                function12 = function1;
                requestBody = requestBodyOnExtraCallback;
            }
            return obj;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
            Unit unit = Unit.INSTANCE;
            int i8 = onRelationshipValidationResult + 45;
            ICustomTabsCallbackStubProxy = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
        requestBody = (RequestBody) iAuthTabCallbackStub2.L$6;
        function12 = (Function1) iAuthTabCallbackStub2.L$5;
        str10 = (String) iAuthTabCallbackStub2.L$4;
        str9 = (String) iAuthTabCallbackStub2.L$3;
        str8 = (String) iAuthTabCallbackStub2.L$2;
        str7 = (String) iAuthTabCallbackStub2.L$1;
        str6 = (String) iAuthTabCallbackStub2.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallback);
        obj = objOnWarmupCompleted;
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objOnExtraCallback;
        if (function12 != null) {
            function12.invoke(onwarmupcompleted.onExtraCallback());
            int i10 = ICustomTabsCallbackStubProxy + 85;
            onRelationshipValidationResult = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 3;
            }
        }
        performDrag performdrag = this.onUnminimized;
        if (onwarmupcompleted.onWarmupCompleted()) {
            int i12 = onRelationshipValidationResult + 113;
            ICustomTabsCallbackStubProxy = i12 % 128;
            if (i12 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listListOf = CollectionsKt.emptyList();
        } else {
            listListOf = CollectionsKt.listOf(str8);
        }
        iAuthTabCallbackStub2.L$0 = access15400.onNavigationEvent(str6);
        iAuthTabCallbackStub2.L$1 = access15400.onNavigationEvent(str7);
        iAuthTabCallbackStub2.L$2 = access15400.onNavigationEvent(str8);
        iAuthTabCallbackStub2.L$3 = access15400.onNavigationEvent(str9);
        iAuthTabCallbackStub2.L$4 = access15400.onNavigationEvent(str10);
        iAuthTabCallbackStub2.L$5 = access15400.onNavigationEvent(function12);
        iAuthTabCallbackStub2.L$6 = access15400.onNavigationEvent(requestBody);
        iAuthTabCallbackStub2.L$7 = access15400.onNavigationEvent(onwarmupcompleted);
        iAuthTabCallbackStub2.label = 2;
    }

    public static /* synthetic */ void onExtraCallback(calculatePageOffsets calculatepageoffsets, String str, String str2, List list, String str3, long j, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 7;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0 ? (i & 16) != 0 : (i & 117) != 0) {
            j = System.currentTimeMillis();
        }
        calculatepageoffsets.onWarmupCompleted(str, str2, (List<String>) list, str3, j);
        int i4 = onRelationshipValidationResult + 25;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        IAuthTabCallback(r17, r18, null, r20, r19.size());
        o.maybeUpdateAnimatable.onNavigationEvent(r16.asBinder, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new o.calculatePageOffsets.IAuthTabCallbackDefault(r16, r17, r19, r21, r20, r18, (o.access13800) null), 3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0086, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        if (r19.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r19.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r1 = o.calculatePageOffsets.onRelationshipValidationResult + 63;
        o.calculatePageOffsets.ICustomTabsCallbackStubProxy = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull String str3, long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 61;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
            int i3 = 39 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final boolean onWarmupCompleted(String str, String str2, String str3, getPageTitle getpagetitle, boolean z) throws Throwable {
        int i = 2 % 2;
        unregisterDataSetObserver unregisterdatasetobserverOnExtraCallback = getpagetitle.onExtraCallback();
        if (Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback)) {
            if (z) {
                int i2 = onRelationshipValidationResult + 53;
                ICustomTabsCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                determineTargetPage.onExtraCallbackWithResult(determineTargetPage.IAuthTabCallback, str, str2, str3, "fire_succeeded", "click_retry", getpagetitle.onWarmupCompleted(), null, 64, null);
            }
            return false;
        }
        if (unregisterdatasetobserverOnExtraCallback instanceof unregisterDataSetObserver.onExtraCallback) {
            if (z) {
                determineTargetPage.IAuthTabCallback.onExtraCallback(str, str2, str3, "fire_failed", "click_retry", getpagetitle.onWarmupCompleted(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("failure_type", "terminal"), getWrite.IAuthTabCallback("status_code", Integer.valueOf(((unregisterDataSetObserver.onExtraCallback) unregisterdatasetobserverOnExtraCallback).onWarmupCompleted())), getWrite.IAuthTabCallback("will_keep_cache", Boolean.FALSE)}));
            }
            int i4 = ICustomTabsCallbackStubProxy + 87;
            onRelationshipValidationResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 96 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
            if (z) {
                determineTargetPage.IAuthTabCallback.onExtraCallback(str, str2, str3, "fire_failed", "click_retry", getpagetitle.onWarmupCompleted(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("failure_type", "network"), getWrite.IAuthTabCallback("will_keep_cache", Boolean.TRUE)}));
            }
            return true;
        }
        if (!Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            determineTargetPage.IAuthTabCallback.onExtraCallback(str, str2, str3, "fire_failed", "click_retry", getpagetitle.onWarmupCompleted(), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("failure_type", "server"), getWrite.IAuthTabCallback("will_keep_cache", Boolean.TRUE)}));
        }
        return true;
    }

    private final List<NativeAdsEventLogType> onExtraCallback(getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (nativeAdsEventLogType != null) {
            int i2 = onRelationshipValidationResult + 51;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            if (!(!dispatchonpagescrolled.onExtraCallback(nativeAdsEventLogType))) {
                if (((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, getpagewidth.onExtraCallback(nativeAdsEventLogType, str)}, 598063969, -598063964, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).booleanValue()) {
                    int i4 = onRelationshipValidationResult + 79;
                    ICustomTabsCallbackStubProxy = i4 % 128;
                    if (i4 % 2 != 0) {
                        arrayList.add(nativeAdsEventLogType);
                    } else {
                        arrayList.add(nativeAdsEventLogType);
                        throw null;
                    }
                }
            }
        }
        NativeAdsEventLogType.onNavigationEvent onnavigationevent = NativeAdsEventLogType.onNavigationEvent.IAuthTabCallback;
        if (!(!dispatchonpagescrolled.onExtraCallback(onnavigationevent))) {
            if (((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, getpagewidth.onExtraCallback(onnavigationevent, str)}, 598063969, -598063964, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).booleanValue()) {
                arrayList.add(onnavigationevent);
            }
        }
        int i5 = onRelationshipValidationResult + 21;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return arrayList;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 25;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(nativeAdsEventLogType);
        int i4 = ICustomTabsCallbackStubProxy + 65;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x019a -> B:30:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(getPageWidth getpagewidth, onExtraCallback onextracallback, Function1<? super NativeAdsEventLogType, Unit> function1, access13800<? super Unit> access13800Var) {
        asInterface asinterface;
        ArrayList arrayList;
        Iterator it;
        getPageWidth getpagewidth2;
        onExtraCallback onextracallback2;
        Function1<? super NativeAdsEventLogType, Unit> function12;
        NativeAdsEventLogType nativeAdsEventLogType;
        asInterface asinterface2;
        boolean z;
        Object obj;
        Object obj2;
        List<String> list;
        RequestBody requestBody;
        int i;
        int i2;
        final Function1<? super NativeAdsEventLogType, Unit> function13;
        final NativeAdsEventLogType nativeAdsEventLogType2;
        int i3 = 2 % 2;
        if (access13800Var instanceof asInterface) {
            int i4 = ICustomTabsCallbackStubProxy + 101;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
            asinterface = (asInterface) access13800Var;
            int i6 = asinterface.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                asinterface.label = i6 - 2147483648;
            } else {
                asinterface = new asInterface(access13800Var);
            }
        }
        Object objOnExtraCallback = asinterface.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = asinterface.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            NativeAdsEventLogType nativeAdsEventLogTypeOnNavigationEvent = onextracallback.onNavigationEvent();
            List<String> listIAuthTabCallback = onextracallback.IAuthTabCallback();
            String strOnWarmupCompleted = onextracallback.onWarmupCompleted();
            RequestBody requestBodyOnExtraCallback = strOnWarmupCompleted != null ? this.onExtraCallback.onExtraCallback(strOnWarmupCompleted) : null;
            boolean zAreEqual = Intrinsics.areEqual(nativeAdsEventLogTypeOnNavigationEvent, NativeAdsEventLogType.onNavigationEvent.IAuthTabCallback);
            List<String> list2 = listIAuthTabCallback;
            arrayList = new ArrayList();
            it = list2.iterator();
            getpagewidth2 = getpagewidth;
            onextracallback2 = onextracallback;
            function12 = function1;
            nativeAdsEventLogType = nativeAdsEventLogTypeOnNavigationEvent;
            asinterface2 = asinterface;
            z = zAreEqual;
            obj = list2;
            obj2 = obj;
            list = listIAuthTabCallback;
            requestBody = requestBodyOnExtraCallback;
            i = 0;
            i2 = 0;
            if (!(!it.hasNext())) {
            }
            return objOnWarmupCompleted;
        }
        int i8 = onRelationshipValidationResult + 89;
        ICustomTabsCallbackStubProxy = i8 % 128;
        if (i8 % 2 != 0 ? i7 != 1 : i7 != 0) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nativeAdsEventLogType2 = (NativeAdsEventLogType) asinterface.L$3;
            function13 = (Function1) asinterface.L$2;
            ResultKt.onNavigationEvent(objOnExtraCallback);
            if (function13 != null) {
            }
            return Unit.INSTANCE;
        }
        int i9 = asinterface.I$1;
        i2 = asinterface.I$0;
        boolean z2 = asinterface.Z$0;
        Object obj3 = asinterface.L$10;
        Iterator it2 = (Iterator) asinterface.L$9;
        ?? r7 = (Collection) asinterface.L$8;
        Object obj4 = (Iterable) asinterface.L$7;
        Object obj5 = (Iterable) asinterface.L$6;
        RequestBody requestBody2 = (RequestBody) asinterface.L$5;
        List<String> list3 = (List) asinterface.L$4;
        NativeAdsEventLogType nativeAdsEventLogType3 = (NativeAdsEventLogType) asinterface.L$3;
        function12 = (Function1) asinterface.L$2;
        onExtraCallback onextracallback3 = (onExtraCallback) asinterface.L$1;
        getPageWidth getpagewidth3 = (getPageWidth) asinterface.L$0;
        ResultKt.onNavigationEvent(objOnExtraCallback);
        obj = obj4;
        obj2 = obj5;
        RequestBody requestBody3 = requestBody2;
        nativeAdsEventLogType = nativeAdsEventLogType3;
        onextracallback2 = onextracallback3;
        asinterface2 = asinterface;
        z = z2;
        list = list3;
        getpagewidth2 = getpagewidth3;
        i = i9;
        it = it2;
        arrayList = r7;
        if (((onWarmupCompleted) objOnExtraCallback).onWarmupCompleted()) {
            arrayList.add(obj3);
            int i10 = ICustomTabsCallbackStubProxy + 85;
            onRelationshipValidationResult = i10 % 128;
            int i11 = i10 % 2;
        }
        requestBody = requestBody3;
        if (!(!it.hasNext())) {
            Object next = it.next();
            String str = (String) next;
            onWarmupCompleted(str, nativeAdsEventLogType);
            String strOnWarmupCompleted2 = getpagewidth2.onWarmupCompleted();
            String strOnExtraCallback = onextracallback2.onExtraCallback();
            String strOnExtraCallbackWithResult = getpagewidth2.onExtraCallbackWithResult();
            String strOnExtraCallbackWithResult2 = onextracallback2.onExtraCallbackWithResult();
            String string = nativeAdsEventLogType.toString();
            asinterface2.L$0 = getpagewidth2;
            asinterface2.L$1 = onextracallback2;
            asinterface2.L$2 = function12;
            asinterface2.L$3 = nativeAdsEventLogType;
            asinterface2.L$4 = list;
            asinterface2.L$5 = requestBody;
            List<String> list4 = list;
            asinterface2.L$6 = access15400.onNavigationEvent(obj2);
            asinterface2.L$7 = access15400.onNavigationEvent(obj);
            asinterface2.L$8 = arrayList;
            asinterface2.L$9 = it;
            asinterface2.L$10 = next;
            asinterface2.L$11 = access15400.onNavigationEvent(str);
            asinterface2.Z$0 = z;
            asinterface2.I$0 = i2;
            asinterface2.I$1 = i;
            asinterface2.I$2 = 0;
            NativeAdsEventLogType nativeAdsEventLogType4 = nativeAdsEventLogType;
            asinterface2.label = 1;
            int i12 = i;
            int i13 = i2;
            requestBody3 = requestBody;
            ArrayList arrayList2 = arrayList;
            Iterator it3 = it;
            boolean z3 = z;
            asInterface asinterface3 = asinterface2;
            Function1<? super NativeAdsEventLogType, Unit> function14 = function12;
            onExtraCallback onextracallback4 = onextracallback2;
            objOnExtraCallback = onExtraCallback(this, strOnWarmupCompleted2, strOnExtraCallback, str, requestBody, strOnExtraCallbackWithResult, strOnExtraCallbackWithResult2, string, z, false, asinterface2, 256, null);
            if (objOnExtraCallback != objOnWarmupCompleted) {
                z = z3;
                asinterface2 = asinterface3;
                onextracallback2 = onextracallback4;
                i = i12;
                i2 = i13;
                arrayList = arrayList2;
                it = it3;
                list = list4;
                obj3 = next;
                nativeAdsEventLogType = nativeAdsEventLogType4;
                function12 = function14;
                if (((onWarmupCompleted) objOnExtraCallback).onWarmupCompleted()) {
                }
                requestBody = requestBody3;
                if (!(!it.hasNext())) {
                    List<String> list5 = list;
                    onExtraCallback onextracallback5 = onextracallback2;
                    ArrayList arrayList3 = arrayList;
                    performDrag performdrag = this.onUnminimized;
                    String strOnExtraCallback2 = onextracallback5.onExtraCallback();
                    List<String> listMinus = CollectionsKt.minus(list5, CollectionsKt.toSet(arrayList3));
                    asinterface2.L$0 = access15400.onNavigationEvent(getpagewidth2);
                    asinterface2.L$1 = access15400.onNavigationEvent(onextracallback5);
                    asinterface2.L$2 = function12;
                    asinterface2.L$3 = nativeAdsEventLogType;
                    asinterface2.L$4 = access15400.onNavigationEvent(list5);
                    asinterface2.L$5 = access15400.onNavigationEvent(requestBody);
                    asinterface2.L$6 = access15400.onNavigationEvent(arrayList3);
                    asinterface2.L$7 = null;
                    asinterface2.L$8 = null;
                    asinterface2.L$9 = null;
                    asinterface2.L$10 = null;
                    asinterface2.L$11 = null;
                    asinterface2.Z$0 = z;
                    asinterface2.label = 2;
                    if (performdrag.onExtraCallback(strOnExtraCallback2, listMinus, asinterface2) != objOnWarmupCompleted) {
                        nativeAdsEventLogType2 = nativeAdsEventLogType;
                        function13 = function12;
                        if (function13 != null) {
                            this.IAuthTabCallback_Parcel.post(new Runnable() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda4
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i14 = 2 % 2;
                                    int i15 = onExtraCallbackWithResult + 71;
                                    onNavigationEvent = i15 % 128;
                                    int i16 = i15 % 2;
                                    calculatePageOffsets.onWarmupCompleted(function13, nativeAdsEventLogType2);
                                    int i17 = onExtraCallbackWithResult + 51;
                                    onNavigationEvent = i17 % 128;
                                    int i18 = i17 % 2;
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        return objOnWarmupCompleted;
    }

    static /* synthetic */ Object onExtraCallback(calculatePageOffsets calculatepageoffsets, String str, String str2, String str3, RequestBody requestBody, String str4, String str5, String str6, boolean z, boolean z2, access13800 access13800Var, int i, Object obj) {
        boolean z3;
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 7;
        int i4 = i3 % 128;
        onRelationshipValidationResult = i4;
        int i5 = i3 % 2;
        if ((i & 256) != 0) {
            int i6 = i4 + 41;
            int i7 = i6 % 128;
            ICustomTabsCallbackStubProxy = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 21;
            onRelationshipValidationResult = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 / 5;
            }
            z3 = true;
        } else {
            z3 = z2;
        }
        return calculatepageoffsets.onExtraCallback(str, str2, str3, requestBody, str4, str5, str6, z, z3, access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallback(String str, String str2, String str3, RequestBody requestBody, String str4, String str5, String str6, boolean z, boolean z2, access13800<? super onWarmupCompleted> access13800Var) throws Throwable {
        onTransact ontransact;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 77;
        onRelationshipValidationResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            boolean z3 = access13800Var instanceof onTransact;
            obj.hashCode();
            throw null;
        }
        if (access13800Var instanceof onTransact) {
            ontransact = (onTransact) access13800Var;
            int i3 = ontransact.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ontransact.label = i3 - 2147483648;
            } else {
                ontransact = new onTransact(access13800Var);
            }
        }
        onTransact ontransact2 = ontransact;
        Object obj2 = ontransact2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = ontransact2.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj2);
            ontransact2.L$0 = str;
            ontransact2.L$1 = access15400.onNavigationEvent(str2);
            ontransact2.L$2 = str3;
            ontransact2.L$3 = access15400.onNavigationEvent(requestBody);
            ontransact2.L$4 = str4;
            str7 = str5;
            ontransact2.L$5 = str7;
            ontransact2.L$6 = str6;
            ontransact2.Z$0 = z;
            ontransact2.Z$1 = z2;
            ontransact2.label = 1;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, str3, requestBody, z, z2, ontransact2);
            if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            str8 = str6;
            str9 = str;
            obj2 = objOnExtraCallbackWithResult;
            str10 = str3;
            str11 = str4;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str8 = (String) ontransact2.L$6;
            String str12 = (String) ontransact2.L$5;
            str11 = (String) ontransact2.L$4;
            str10 = (String) ontransact2.L$2;
            str9 = (String) ontransact2.L$0;
            ResultKt.onNavigationEvent(obj2);
            str7 = str12;
        }
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj2;
        onNavigationEvent(str9, str11, str7, str8, str10, onwarmupcompleted.onExtraCallback());
        int i5 = onRelationshipValidationResult + 19;
        ICustomTabsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return onwarmupcompleted;
        }
        throw null;
    }

    private final void onNavigationEvent(String str, String str2, String str3, String str4, String str5, unregisterDataSetObserver unregisterdatasetobserver) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 45;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            if (completeScroll.onNavigationEvent.onNavigationEvent() == null) {
                return;
            }
            try {
                Result.Companion companion = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(Unit.INSTANCE);
                int i3 = ICustomTabsCallbackStubProxy + 103;
                onRelationshipValidationResult = i3 % 128;
                int i4 = i3 % 2;
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                return;
            }
        }
        completeScroll.onNavigationEvent.onNavigationEvent();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, "card") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, "card") == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r1 = o.calculatePageOffsets.ICustomTabsCallbackStubProxy + 43;
        o.calculatePageOffsets.onRelationshipValidationResult = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String onWarmupCompleted(String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 3;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
    }

    private final void IAuthTabCallback(String str, String str2, String str3, String str4, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 51;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            if (completeScroll.onNavigationEvent.onNavigationEvent() == null) {
                int i4 = onRelationshipValidationResult + 37;
                ICustomTabsCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 40 / 0;
                    return;
                }
                return;
            }
            try {
                Result.Companion companion = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(Unit.INSTANCE);
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                return;
            }
        }
        completeScroll.onNavigationEvent.onNavigationEvent();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(String str, String str2, String str3, RequestBody requestBody, boolean z, boolean z2, access13800<? super onWarmupCompleted> access13800Var) throws Throwable {
        onNavigationEvent onnavigationevent;
        Object obj;
        onNavigationEvent onnavigationevent2;
        int i;
        Request requestIAuthTabCallback;
        Request request;
        onNavigationEvent onnavigationevent3;
        final boolean z3;
        int i2;
        ?? r9;
        Object obj2;
        RequestBody requestBody2;
        final String str4;
        final String str5;
        final String str6;
        String str7;
        String str8;
        String str9;
        boolean z4;
        getPageTitle getpagetitle;
        boolean z5;
        boolean z6 = z2;
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallbackStubProxy + 105;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i6 = onnavigationevent.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i6 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        onNavigationEvent onnavigationevent4 = onnavigationevent;
        Object objIAuthTabCallback = onnavigationevent4.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onnavigationevent4.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            if (!z) {
                obj = objOnWarmupCompleted;
                onnavigationevent2 = onnavigationevent4;
                i = 2;
            } else {
                obj = objOnWarmupCompleted;
                onnavigationevent2 = onnavigationevent4;
                i = 2;
                determineTargetPage.onExtraCallbackWithResult(determineTargetPage.IAuthTabCallback, str, str2, str3, "fire_requested", "click", 1, null, 64, null);
            }
            try {
                if (z6) {
                    requestIAuthTabCallback = enableLayers.onWarmupCompleted(this.onExtraCallback, str, str3, requestBody, false, 8, (Object) null);
                    int i8 = ICustomTabsCallbackStubProxy + 41;
                    onRelationshipValidationResult = i8 % 128;
                    int i9 = i8 % i;
                } else {
                    requestIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(str3);
                }
                request = requestIAuthTabCallback;
                enableLayers enablelayers = this.onExtraCallback;
                onSecondaryPointerUp onsecondarypointerup = this.onExtraCallbackWithResult;
                onnavigationevent3 = onnavigationevent2;
                onnavigationevent3.L$0 = str;
                onnavigationevent3.L$1 = str2;
                onnavigationevent3.L$2 = str3;
                onnavigationevent3.L$3 = requestBody;
                onnavigationevent3.L$4 = access15400.onNavigationEvent(request);
                z3 = z;
                i2 = i;
                onnavigationevent3.Z$0 = z3;
                onnavigationevent3.Z$1 = z6;
                r9 = 1;
                onnavigationevent3.label = 1;
                objIAuthTabCallback = enablelayers.IAuthTabCallback(request, onsecondarypointerup, onnavigationevent3);
                obj2 = obj;
                if (objIAuthTabCallback != obj2) {
                    requestBody2 = requestBody;
                    str4 = str;
                    str5 = str3;
                    str6 = str2;
                }
                return obj2;
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("request_id", str);
                Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback("entry_id", str2);
                Pair pairIAuthTabCallback3 = getWrite.IAuthTabCallback("log_type", z ? "CLICK" : "other");
                String message = th.getMessage();
                if (message == null) {
                    int i10 = ICustomTabsCallbackStubProxy + 115;
                    onRelationshipValidationResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        th.getClass().getSimpleName();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    message = th.getClass().getSimpleName();
                }
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "NativeAdsLogManager", "Native ads tracking url dropped by unrecoverable request build failure", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, pairIAuthTabCallback3, getWrite.IAuthTabCallback("error", message)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return new onWarmupCompleted(false, new unregisterDataSetObserver.onExtraCallback(-1));
            }
        }
        int i11 = onRelationshipValidationResult + 25;
        ICustomTabsCallbackStubProxy = i11 % 128;
        if (i11 % 2 != 0 ? i7 != 1 : i7 != 1) {
            if (i7 == 2) {
                z4 = onnavigationevent4.Z$0;
                str9 = (String) onnavigationevent4.L$2;
                str8 = (String) onnavigationevent4.L$1;
                str7 = (String) onnavigationevent4.L$0;
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                getpagetitle = (getPageTitle) objIAuthTabCallback;
                return new onWarmupCompleted(onWarmupCompleted(str7, str8, str9, getpagetitle, z4), getpagetitle.onExtraCallback());
            }
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = onnavigationevent4.Z$0;
            str9 = (String) onnavigationevent4.L$2;
            str8 = (String) onnavigationevent4.L$1;
            str7 = (String) onnavigationevent4.L$0;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            getpagetitle = (getPageTitle) objIAuthTabCallback;
            return new onWarmupCompleted(onWarmupCompleted(str7, str8, str9, getpagetitle, z4), getpagetitle.onExtraCallback());
        }
        boolean z7 = onnavigationevent4.Z$1;
        boolean z8 = onnavigationevent4.Z$0;
        request = (Request) onnavigationevent4.L$4;
        RequestBody requestBody3 = (RequestBody) onnavigationevent4.L$3;
        String str10 = (String) onnavigationevent4.L$2;
        String str11 = (String) onnavigationevent4.L$1;
        String str12 = (String) onnavigationevent4.L$0;
        ResultKt.onNavigationEvent(objIAuthTabCallback);
        z6 = z7;
        z3 = z8;
        obj2 = objOnWarmupCompleted;
        i2 = 2;
        str6 = str11;
        str4 = str12;
        r9 = 1;
        str5 = str10;
        requestBody2 = requestBody3;
        onnavigationevent3 = onnavigationevent4;
        unregisterDataSetObserver unregisterdatasetobserver = (unregisterDataSetObserver) objIAuthTabCallback;
        if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback)) {
            int i12 = onRelationshipValidationResult + 33;
            ICustomTabsCallbackStubProxy = i12 % 128;
            int i13 = i12 % i2;
            if (z3) {
                determineTargetPage.onExtraCallbackWithResult(determineTargetPage.IAuthTabCallback, str4, str6, str5, "fire_succeeded", "click", 1, null, 64, null);
            }
            return new onWarmupCompleted(false, unregisterdatasetobserver);
        }
        if (unregisterdatasetobserver instanceof unregisterDataSetObserver.onExtraCallback) {
            if (z3) {
                determineTargetPage determinetargetpage = determineTargetPage.IAuthTabCallback;
                Pair pairIAuthTabCallback4 = getWrite.IAuthTabCallback("failure_type", "terminal");
                Pair pairIAuthTabCallback5 = getWrite.IAuthTabCallback("status_code", access14000.onNavigationEvent(((unregisterDataSetObserver.onExtraCallback) unregisterdatasetobserver).onWarmupCompleted()));
                Pair pairIAuthTabCallback6 = getWrite.IAuthTabCallback("will_keep_cache", access14000.onNavigationEvent(false));
                Pair[] pairArr = new Pair[3];
                pairArr[0] = pairIAuthTabCallback4;
                pairArr[r9] = pairIAuthTabCallback5;
                pairArr[2] = pairIAuthTabCallback6;
                z5 = false;
                determinetargetpage.onExtraCallback(str4, str6, str5, "fire_failed", "click", 1, access8100.onWarmupCompleted(pairArr));
            } else {
                z5 = false;
            }
            return new onWarmupCompleted(z5, unregisterdatasetobserver);
        }
        if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
            int i14 = onRelationshipValidationResult + 21;
            ICustomTabsCallbackStubProxy = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 31 / 0;
                if (z3) {
                    determineTargetPage determinetargetpage2 = determineTargetPage.IAuthTabCallback;
                    Pair pairIAuthTabCallback7 = getWrite.IAuthTabCallback("failure_type", "network");
                    Pair pairIAuthTabCallback8 = getWrite.IAuthTabCallback("will_keep_cache", access14000.onNavigationEvent((boolean) r9));
                    Pair[] pairArr2 = new Pair[2];
                    pairArr2[0] = pairIAuthTabCallback7;
                    pairArr2[r9] = pairIAuthTabCallback8;
                    determinetargetpage2.onExtraCallback(str4, str6, str5, "fire_failed", "click", 1, access8100.onWarmupCompleted(pairArr2));
                }
            } else if (z3) {
            }
            return new onWarmupCompleted(r9, unregisterdatasetobserver);
        }
        if (!Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        Function1<? super Integer, Unit> function1 = new Function1() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj4) throws Throwable {
                int i16 = 2 % 2;
                int i17 = onExtraCallback + 39;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                Unit unitOnExtraCallbackWithResult = calculatePageOffsets.onExtraCallbackWithResult(z3, str4, str6, str5, ((Integer) obj4).intValue());
                int i19 = onExtraCallback + 53;
                onWarmupCompleted = i19 % 128;
                if (i19 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
        };
        if (z6) {
            enableLayers enablelayers2 = this.onExtraCallback;
            onSecondaryPointerUp onsecondarypointerup2 = this.onExtraCallbackWithResult;
            onnavigationevent3.L$0 = str4;
            onnavigationevent3.L$1 = str6;
            onnavigationevent3.L$2 = str5;
            onnavigationevent3.L$3 = access15400.onNavigationEvent(requestBody2);
            onnavigationevent3.L$4 = access15400.onNavigationEvent(request);
            onnavigationevent3.L$5 = access15400.onNavigationEvent(unregisterdatasetobserver);
            onnavigationevent3.L$6 = access15400.onNavigationEvent(function1);
            onnavigationevent3.Z$0 = z3;
            onnavigationevent3.Z$1 = z6;
            onnavigationevent3.label = 2;
            objIAuthTabCallback = enableLayers.onWarmupCompleted(enablelayers2, str4, str5, requestBody2, function1, onsecondarypointerup2, false, onnavigationevent3, 32, null);
            if (objIAuthTabCallback != obj2) {
                str8 = str6;
                str9 = str5;
                z4 = z3;
                str7 = str4;
                getpagetitle = (getPageTitle) objIAuthTabCallback;
                return new onWarmupCompleted(onWarmupCompleted(str7, str8, str9, getpagetitle, z4), getpagetitle.onExtraCallback());
            }
        } else {
            enableLayers enablelayers3 = this.onExtraCallback;
            onSecondaryPointerUp onsecondarypointerup3 = this.onExtraCallbackWithResult;
            Function1<? super Integer, Request> function12 = new Function1() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj4) {
                    int i16 = 2 % 2;
                    int i17 = IAuthTabCallback + 3;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    Request requestOnExtraCallbackWithResult = calculatePageOffsets.onExtraCallbackWithResult(this.f$0, str5, ((Integer) obj4).intValue());
                    int i19 = onNavigationEvent + 91;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    return requestOnExtraCallbackWithResult;
                }
            };
            onnavigationevent3.L$0 = str4;
            onnavigationevent3.L$1 = str6;
            onnavigationevent3.L$2 = str5;
            onnavigationevent3.L$3 = access15400.onNavigationEvent(requestBody2);
            onnavigationevent3.L$4 = access15400.onNavigationEvent(request);
            onnavigationevent3.L$5 = access15400.onNavigationEvent(unregisterdatasetobserver);
            onnavigationevent3.L$6 = access15400.onNavigationEvent(function1);
            onnavigationevent3.Z$0 = z3;
            onnavigationevent3.Z$1 = z6;
            onnavigationevent3.label = 3;
            objIAuthTabCallback = enablelayers3.IAuthTabCallback(function1, onsecondarypointerup3, function12, (access13800<? super getPageTitle>) onnavigationevent3);
            if (objIAuthTabCallback != obj2) {
                str8 = str6;
                str9 = str5;
                z4 = z3;
                str7 = str4;
                getpagetitle = (getPageTitle) objIAuthTabCallback;
                return new onWarmupCompleted(onWarmupCompleted(str7, str8, str9, getpagetitle, z4), getpagetitle.onExtraCallback());
            }
        }
        return obj2;
    }

    private static final Unit onNavigationEvent(boolean z, String str, String str2, String str3, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 117;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (z) {
            determineTargetPage.onExtraCallbackWithResult(determineTargetPage.IAuthTabCallback, str, str2, str3, "fire_requested", "click_retry", i, null, 64, null);
            int i4 = onRelationshipValidationResult + 107;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = ICustomTabsCallbackStubProxy + 97;
        onRelationshipValidationResult = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Request onExtraCallback(calculatePageOffsets calculatepageoffsets, String str, int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 65;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        Request requestIAuthTabCallback = calculatepageoffsets.onExtraCallback.IAuthTabCallback(str);
        if (i4 != 0) {
            int i5 = 85 / 0;
        }
        return requestIAuthTabCallback;
    }

    static final class onExtraCallback {
        private static int IAuthTabCallbackStub = 0;
        private static int onTransact = 1;
        private final List<String> IAuthTabCallback;
        private final String onExtraCallback;
        private final NativeAdsEventLogType onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public static /* synthetic */ onExtraCallback onNavigationEvent(onExtraCallback onextracallback, String str, NativeAdsEventLogType nativeAdsEventLogType, List list, String str2, String str3, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = IAuthTabCallbackStub + 73;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    String str4 = onextracallback.onWarmupCompleted;
                    throw null;
                }
                str = onextracallback.onWarmupCompleted;
            }
            String str5 = str;
            if ((i & 2) != 0) {
                int i4 = onTransact + 17;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                nativeAdsEventLogType = onextracallback.onExtraCallbackWithResult;
                if (i5 != 0) {
                    int i6 = 90 / 0;
                }
            }
            NativeAdsEventLogType nativeAdsEventLogType2 = nativeAdsEventLogType;
            if ((i & 4) != 0) {
                list = onextracallback.IAuthTabCallback;
            }
            List list2 = list;
            if ((i & 8) != 0) {
                str2 = onextracallback.onExtraCallback;
            }
            String str6 = str2;
            if ((i & 16) != 0) {
                str3 = onextracallback.onNavigationEvent;
                int i7 = onTransact + 101;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 3;
                }
            }
            return onextracallback.onWarmupCompleted(str5, nativeAdsEventLogType2, list2, str6, str3);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 25;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == obj) {
                int i4 = i2 + 55;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallback.onWarmupCompleted)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) {
                int i5 = IAuthTabCallbackStub + 57;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallback, onextracallback.IAuthTabCallback) || !Intrinsics.areEqual(this.onExtraCallback, onextracallback.onExtraCallback)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.onNavigationEvent, onextracallback.onNavigationEvent))) {
                return true;
            }
            int i7 = onTransact + 67;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[PHI: r1 r3 r4 r5
          0x003e: PHI (r1v16 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x003e: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x003e: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x003e: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[PHI: r1 r3 r4
          0x003c: PHI (r1v6 int) = (r1v5 int), (r1v18 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x003c: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x003c: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003a, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            String str;
            int iHashCode4;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 119;
            onTransact = i2 % 128;
            int iHashCode5 = 0;
            if (i2 % 2 == 0) {
                iHashCode = this.onWarmupCompleted.hashCode();
                iHashCode2 = this.onExtraCallbackWithResult.hashCode();
                iHashCode3 = this.IAuthTabCallback.hashCode();
                str = this.onExtraCallback;
                iHashCode4 = str == null ? 0 : str.hashCode();
            } else {
                iHashCode = this.onWarmupCompleted.hashCode();
                iHashCode2 = this.onExtraCallbackWithResult.hashCode();
                iHashCode3 = this.IAuthTabCallback.hashCode();
                str = this.onExtraCallback;
                if (str == null) {
                }
            }
            String str2 = this.onNavigationEvent;
            if (str2 != null) {
                iHashCode5 = str2.hashCode();
                int i3 = IAuthTabCallbackStub + 13;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
            }
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5;
        }

        public final onExtraCallback onWarmupCompleted(@NotNull String str, @NotNull NativeAdsEventLogType nativeAdsEventLogType, @NotNull List<String> list, @Nullable String str2, @Nullable String str3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            Intrinsics.checkNotNullParameter(list, "");
            onExtraCallback onextracallback = new onExtraCallback(str, nativeAdsEventLogType, list, str2, str3);
            int i2 = IAuthTabCallbackStub + 103;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ClickLogEntry(id=" + this.onWarmupCompleted + ", logType=" + this.onExtraCallbackWithResult + ", urls=" + this.IAuthTabCallback + ", requestBodyJson=" + this.onExtraCallback + ", itemKey=" + this.onNavigationEvent + ")";
            int i2 = onTransact + 69;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallback(@NotNull String str, @NotNull NativeAdsEventLogType nativeAdsEventLogType, @NotNull List<String> list, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = nativeAdsEventLogType;
            this.IAuthTabCallback = list;
            this.onExtraCallback = str2;
            this.onNavigationEvent = str3;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 101;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onWarmupCompleted;
            int i5 = i2 + 21;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final NativeAdsEventLogType onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact + 119;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final List<String> IAuthTabCallback() {
            List<String> list;
            int i = 2 % 2;
            int i2 = onTransact + 125;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                list = this.IAuthTabCallback;
                int i4 = 53 / 0;
            } else {
                list = this.IAuthTabCallback;
            }
            int i5 = i3 + 103;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final String onWarmupCompleted() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 93;
            int i3 = i2 % 128;
            onTransact = i3;
            if (i2 % 2 == 0) {
                str = this.onExtraCallback;
                int i4 = 84 / 0;
            } else {
                str = this.onExtraCallback;
            }
            int i5 = i3 + 53;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onTransact + 5;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.onNavigationEvent;
            int i4 = i3 + 91;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private final unregisterDataSetObserver onNavigationEvent;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 5;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i6 = i2 + 95;
                onExtraCallback = i6 % 128;
                return i6 % 2 != 0;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (this.onWarmupCompleted == onwarmupcompleted.onWarmupCompleted) {
                return Intrinsics.areEqual(this.onNavigationEvent, onwarmupcompleted.onNavigationEvent);
            }
            int i7 = i4 + 91;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = Boolean.hashCode(this.onWarmupCompleted);
            return i3 == 0 ? (iHashCode / 108) >> this.onNavigationEvent.hashCode() : (iHashCode * 31) + this.onNavigationEvent.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PersistedFireResult(shouldKeepCache=" + this.onWarmupCompleted + ", fireResult=" + this.onNavigationEvent + ")";
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onWarmupCompleted(boolean z, @NotNull unregisterDataSetObserver unregisterdatasetobserver) {
            Intrinsics.checkNotNullParameter(unregisterdatasetobserver, "");
            this.onWarmupCompleted = z;
            this.onNavigationEvent = unregisterdatasetobserver;
        }

        public final boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 87;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onWarmupCompleted;
            int i5 = i2 + 49;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final unregisterDataSetObserver onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            unregisterDataSetObserver unregisterdatasetobserver = this.onNavigationEvent;
            int i5 = i3 + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return unregisterdatasetobserver;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(calculatePageOffsets calculatepageoffsets, String str, NativeAdsDto.AdAsset adAsset, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 53;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 67;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        calculatePageOffsets.onExtraCallback();
                        throw null;
                    }
                    Unit unitOnExtraCallback = calculatePageOffsets.onExtraCallback();
                    int i7 = onExtraCallbackWithResult + 89;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 83 / 0;
                    }
                    return unitOnExtraCallback;
                }
            };
            int i5 = ICustomTabsCallbackStubProxy + 123;
            onRelationshipValidationResult = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 5;
            }
        }
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatepageoffsets, str, adAsset, function0}, -901033966, 901033982, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 89;
        ICustomTabsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = ICustomTabsCallbackStubProxy + 105;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(calculatePageOffsets calculatepageoffsets, String str, NativeAdsDto.AdAsset adAsset, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 125;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda12
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 115;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                        return (Unit) calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[0], 1078112656, -1078112655, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
                    }
                    int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    int iOnNavigationEvent5 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    int iOnNavigationEvent6 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    int i7 = 55 / 0;
                    return (Unit) calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[0], 1078112656, -1078112655, iOnNavigationEvent5, iOnNavigationEvent6, iOnNavigationEvent4);
                }
            };
        }
        calculatepageoffsets.onWarmupCompleted(str, adAsset, function0);
        int i5 = ICustomTabsCallbackStubProxy + 5;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 17;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return unit;
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable NativeAdsDto.AdAsset adAsset, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 35;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (adAsset == null) {
            int i4 = onRelationshipValidationResult + 3;
            ICustomTabsCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, str, adAsset, function0}, 1316952674, -1316952668, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
        int i5 = ICustomTabsCallbackStubProxy + 59;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        getPageWidth getpagewidth = (getPageWidth) objArr[1];
        dispatchOnPageScrolled dispatchonpagescrolled = (dispatchOnPageScrolled) objArr[2];
        String str = (String) objArr[3];
        Function1<? super NativeAdsEventLogType, Unit> function1 = (Function1) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        if ((iIntValue & 8) != 0) {
            int i2 = ICustomTabsCallbackStubProxy + 49;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            function1 = null;
        }
        boolean zOnExtraCallbackWithResult = calculatepageoffsets.onExtraCallbackWithResult(getpagewidth, dispatchonpagescrolled, str, function1);
        int i4 = onRelationshipValidationResult + 91;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        throw null;
    }

    private final boolean onExtraCallbackWithResult(getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, Function1<? super NativeAdsEventLogType, Unit> function1) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 29;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsEventLogType.asInterface asinterface = NativeAdsEventLogType.asInterface.onExtraCallbackWithResult;
        if (!asBinder(getpagewidth.onExtraCallback(asinterface, str))) {
            return false;
        }
        int i4 = ICustomTabsCallbackStubProxy + 41;
        int i5 = i4 % 128;
        onRelationshipValidationResult = i5;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (function1 != null) {
            int i6 = i5 + 27;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            function1.invoke(asinterface);
        }
        onWarmupCompleted(asinterface);
        onExtraCallbackWithResult();
        Iterator<T> it = this.access000.iterator();
        int i8 = ICustomTabsCallbackStubProxy + 49;
        onRelationshipValidationResult = i8 % 128;
        int i9 = i8 % 2;
        while (it.hasNext()) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) ((WeakReference) it.next()).get();
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.onWarmupCompleted();
            }
        }
        onNavigationEvent(this, getpagewidth, dispatchonpagescrolled, NativeAdsEventLogType.asInterface.onExtraCallbackWithResult, str, null, 16, null);
        return true;
    }

    private final boolean IAuthTabCallback(getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, Function1<? super NativeAdsEventLogType, Unit> function1) {
        int i = 2 % 2;
        NativeAdsEventLogType.getInterfaceDescriptor getinterfacedescriptor = NativeAdsEventLogType.getInterfaceDescriptor.onExtraCallbackWithResult;
        if (!asInterface(getpagewidth.onExtraCallback(getinterfacedescriptor, str))) {
            return false;
        }
        int i2 = ICustomTabsCallbackStubProxy + 87;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        if (function1 != null) {
            function1.invoke(getinterfacedescriptor);
        }
        onWarmupCompleted(getinterfacedescriptor);
        onExtraCallbackWithResult();
        Iterator<T> it = this.access000.iterator();
        int i4 = ICustomTabsCallbackStubProxy + 3;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) ((WeakReference) it.next()).get();
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.onExtraCallbackWithResult();
            }
        }
        onNavigationEvent(this, getpagewidth, dispatchonpagescrolled, NativeAdsEventLogType.getInterfaceDescriptor.onExtraCallbackWithResult, str, null, 16, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean onWarmupCompleted(calculatePageOffsets calculatepageoffsets, getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 55;
        int i4 = i3 % 128;
        onRelationshipValidationResult = i4;
        int i5 = i3 % 2;
        if ((i & 8) != 0) {
            int i6 = i4 + 109;
            ICustomTabsCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            function1 = null;
        }
        return calculatepageoffsets.onNavigationEvent(getpagewidth, dispatchonpagescrolled, str, (Function1<? super NativeAdsEventLogType, Unit>) function1);
    }

    private final boolean onNavigationEvent(getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, Function1<? super NativeAdsEventLogType, Unit> function1) {
        int i = 2 % 2;
        NativeAdsEventLogType.IAuthTabCallbackDefault iAuthTabCallbackDefault = NativeAdsEventLogType.IAuthTabCallbackDefault.IAuthTabCallback;
        Object[] objArr = {this, getpagewidth.onExtraCallback(iAuthTabCallbackDefault, str)};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        if (!((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 1663016311, -1663016304, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent)).booleanValue()) {
            return false;
        }
        if (function1 != null) {
            function1.invoke(iAuthTabCallbackDefault);
        }
        onWarmupCompleted(iAuthTabCallbackDefault);
        onExtraCallbackWithResult();
        Iterator<T> it = this.access000.iterator();
        while (it.hasNext()) {
            int i2 = ICustomTabsCallbackStubProxy + 117;
            onRelationshipValidationResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) ((WeakReference) it.next()).get();
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.IAuthTabCallback();
            }
        }
        onNavigationEvent(this, getpagewidth, dispatchonpagescrolled, NativeAdsEventLogType.IAuthTabCallbackDefault.IAuthTabCallback, str, null, 16, null);
        Function1<? super String, Unit> function12 = this.IAuthTabCallbackStubProxy;
        if (function12 == null) {
            return true;
        }
        int i3 = ICustomTabsCallbackStubProxy + 75;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        function12.invoke(getpagewidth.onWarmupCompleted());
        int i5 = ICustomTabsCallbackStubProxy + 31;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0051 A[PHI: r0
      0x0051: PHI (r0v7 o.getPageWidth) = (r0v6 o.getPageWidth), (r0v12 o.getPageWidth) binds: [B:10:0x0081, B:7:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(String str, NativeAdsDto.AdAsset adAsset, Function0<Unit> function0) {
        getPageWidth getpagewidthOnExtraCallback;
        dispatchOnPageScrolled.onWarmupCompleted onWarmupCompleted2;
        String str2;
        int i;
        int i2 = 2 % 2;
        NativeAdsDto.AdAsset adAssetOnNavigationEvent = dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAsset);
        NativeAdsEventLogType.onExtraCallbackWithResult onextracallbackwithresult = NativeAdsEventLogType.onExtraCallbackWithResult.onExtraCallbackWithResult;
        if (dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(adAssetOnNavigationEvent, onextracallbackwithresult)) {
            int i3 = onRelationshipValidationResult + 21;
            ICustomTabsCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                getpagewidthOnExtraCallback = getPageWidth.Companion.onExtraCallback(str, adAsset);
                Object[] objArr = {this, getPageWidth.onWarmupCompleted(getpagewidthOnExtraCallback, onextracallbackwithresult, null, 2, null)};
                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                if (((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 598063969, -598063964, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent)).booleanValue()) {
                    getPageWidth getpagewidth = getpagewidthOnExtraCallback;
                    int i4 = ICustomTabsCallbackStubProxy + 93;
                    onRelationshipValidationResult = i4 % 128;
                    if (i4 % 2 != 0) {
                        onWarmupCompleted(onextracallbackwithresult);
                        onWarmupCompleted2 = dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(adAssetOnNavigationEvent);
                        str2 = null;
                        i = 37;
                    } else {
                        onWarmupCompleted(onextracallbackwithresult);
                        onWarmupCompleted2 = dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(adAssetOnNavigationEvent);
                        str2 = null;
                        i = 8;
                    }
                    onNavigationEvent(this, getpagewidth, onWarmupCompleted2, onextracallbackwithresult, str2, function0, i, null);
                }
            } else {
                getpagewidthOnExtraCallback = getPageWidth.Companion.onExtraCallback(str, adAsset);
                Object[] objArr2 = {this, getPageWidth.onWarmupCompleted(getpagewidthOnExtraCallback, onextracallbackwithresult, null, 2, null)};
                int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                if (((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr2, 598063969, -598063964, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent2)).booleanValue()) {
                }
            }
        }
        int i5 = ICustomTabsCallbackStubProxy + 9;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
    }

    private final void onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 109;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.access100.set(z);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
    }

    private final void IAuthTabCallback() {
        synchronized (this.IAuthTabCallbackStub) {
            this.onTransact.clear();
            this.extraCallbackWithResult.clear();
            this.asInterface.clear();
            this.ICustomTabsCallbackDefault.clear();
            this.readTypedObject.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void onExtraCallback(String str) {
        String strOnExtraCallback = recomputeScrollPosition.onExtraCallback(str);
        synchronized (this.IAuthTabCallbackStub) {
            this.onTransact = IAuthTabCallback(this.onTransact, strOnExtraCallback);
            this.extraCallbackWithResult = IAuthTabCallback(this.extraCallbackWithResult, strOnExtraCallback);
            this.asInterface = IAuthTabCallback(this.asInterface, strOnExtraCallback);
            this.ICustomTabsCallbackDefault = IAuthTabCallback(this.ICustomTabsCallbackDefault, strOnExtraCallback);
            this.readTypedObject = IAuthTabCallback(this.readTypedObject, strOnExtraCallback);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final Set<String> IAuthTabCallback(Set<String> set, String str) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = ICustomTabsCallbackStubProxy + 113;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        for (Object obj : set) {
            if (!StringsKt.startsWith$default((String) obj, str, false, 2, (Object) null)) {
                int i4 = ICustomTabsCallbackStubProxy + 23;
                onRelationshipValidationResult = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(obj);
                    throw null;
                }
                arrayList.add(obj);
                int i5 = onRelationshipValidationResult + 79;
                ICustomTabsCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return CollectionsKt.toMutableSet(arrayList);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        boolean zContains;
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        String str = (String) objArr[1];
        synchronized (calculatepageoffsets.IAuthTabCallbackStub) {
            zContains = calculatepageoffsets.extraCallbackWithResult.contains(str);
        }
        return Boolean.valueOf(zContains);
    }

    private final boolean asBinder(String str) {
        boolean zAdd;
        synchronized (this.IAuthTabCallbackStub) {
            zAdd = this.onTransact.add(str);
        }
        return zAdd;
    }

    private final boolean asInterface(String str) {
        boolean zAdd;
        synchronized (this.IAuthTabCallbackStub) {
            zAdd = this.extraCallbackWithResult.add(str);
        }
        return zAdd;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        boolean zAdd;
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        String str = (String) objArr[1];
        synchronized (calculatepageoffsets.IAuthTabCallbackStub) {
            zAdd = calculatepageoffsets.asInterface.add(str);
        }
        return Boolean.valueOf(zAdd);
    }

    private final boolean IAuthTabCallbackDefault(String str) {
        boolean zAdd;
        synchronized (this.IAuthTabCallbackStub) {
            zAdd = this.ICustomTabsCallbackDefault.add(str);
        }
        return zAdd;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean zAdd;
        calculatePageOffsets calculatepageoffsets = (calculatePageOffsets) objArr[0];
        String str = (String) objArr[1];
        synchronized (calculatepageoffsets.IAuthTabCallbackStub) {
            zAdd = calculatepageoffsets.readTypedObject.add(str);
        }
        return Boolean.valueOf(zAdd);
    }

    static /* synthetic */ void onNavigationEvent(calculatePageOffsets calculatepageoffsets, getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, NativeAdsEventLogType nativeAdsEventLogType, String str, Function0 function0, int i, Object obj) {
        String str2;
        Function0 function02;
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 85;
        int i4 = i3 % 128;
        ICustomTabsCallbackStubProxy = i4;
        if (i3 % 2 != 0 ? (i & 8) == 0 : (i & 41) == 0) {
            str2 = str;
        } else {
            int i5 = i4 + 47;
            onRelationshipValidationResult = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        if ((i & 16) != 0) {
            int i7 = onRelationshipValidationResult + 91;
            ICustomTabsCallbackStubProxy = i7 % 128;
            int i8 = i7 % 2;
            function02 = null;
        } else {
            function02 = function0;
        }
        calculatepageoffsets.onWarmupCompleted(getpagewidth, dispatchonpagescrolled, nativeAdsEventLogType, str2, (Function0<Unit>) function02);
    }

    private static final void onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 35;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        if (i3 == 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, NativeAdsEventLogType nativeAdsEventLogType, String str, final Function0<Unit> function0) {
        int i = 2 % 2;
        List<String> listOnWarmupCompleted = dispatchonpagescrolled.onWarmupCompleted(nativeAdsEventLogType);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOnWarmupCompleted, 10));
        Iterator<T> it = listOnWarmupCompleted.iterator();
        while (it.hasNext()) {
            int i2 = onRelationshipValidationResult + 5;
            ICustomTabsCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                arrayList.add(dispatchonpagescrolled.IAuthTabCallback((String) it.next()));
                throw null;
            }
            arrayList.add(dispatchonpagescrolled.IAuthTabCallback((String) it.next()));
        }
        IAuthTabCallback(getpagewidth.onWarmupCompleted(), getpagewidth.onExtraCallbackWithResult(), onWarmupCompleted(str), nativeAdsEventLogType.toString(), arrayList.size());
        if (!arrayList.isEmpty()) {
            maybeUpdateAnimatable.onNavigationEvent(this.asBinder, (CoroutineContext) null, (setRandomHost) null, new asBinder(dispatchonpagescrolled, this, nativeAdsEventLogType, dispatchonpagescrolled.onWarmupCompleted(), System.currentTimeMillis(), getpagewidth, arrayList, str, function0, null), 3, (Object) null);
            return;
        }
        int i3 = ICustomTabsCallbackStubProxy + 65;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
            if (function0 == null) {
                return;
            }
        } else if (function0 == null) {
            return;
        }
        this.IAuthTabCallback_Parcel.post(new Runnable() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda9
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = 2 % 2;
                int i6 = onNavigationEvent + 123;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = {function0};
                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 1612888017, -1612887998, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
                int i8 = onNavigationEvent + 105;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 8 / 0;
                }
            }
        });
    }

    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ dispatchOnPageScrolled $beacons;
        final /* synthetic */ List<String> $finalUrls;
        final /* synthetic */ getPageWidth $identity;
        final /* synthetic */ String $itemKey;
        final /* synthetic */ NativeAdsEventLogType $logType;
        final /* synthetic */ Function0<Unit> $onDone;
        final /* synthetic */ String $payload;
        final /* synthetic */ long $requestTs;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ calculatePageOffsets this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(dispatchOnPageScrolled dispatchonpagescrolled, calculatePageOffsets calculatepageoffsets, NativeAdsEventLogType nativeAdsEventLogType, String str, long j, getPageWidth getpagewidth, List<String> list, String str2, Function0<Unit> function0, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$beacons = dispatchonpagescrolled;
            this.this$0 = calculatepageoffsets;
            this.$logType = nativeAdsEventLogType;
            this.$payload = str;
            this.$requestTs = j;
            this.$identity = getpagewidth;
            this.$finalUrls = list;
            this.$itemKey = str2;
            this.$onDone = function0;
        }

        public static /* synthetic */ void onWarmupCompleted(Function0 function0) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(function0);
            int i4 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$beacons, this.this$0, this.$logType, this.$payload, this.$requestTs, this.$identity, this.$finalUrls, this.$itemKey, this.$onDone, access13800Var);
            asbinder.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            asBinder asbinderCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return asbinderCreate.invokeSuspend(unit);
            }
            asbinderCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final void onExtraCallbackWithResult(Function0 function0) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            function0.invoke();
            int i4 = onExtraCallbackWithResult + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }

        static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends Boolean>>, Object> {
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;
            final /* synthetic */ String $entryId;
            final /* synthetic */ String $finalUrl;
            final /* synthetic */ getPageWidth $identity;
            final /* synthetic */ String $itemKey;
            final /* synthetic */ NativeAdsEventLogType $logType;
            final /* synthetic */ RequestBody $requestBody;
            Object L$0;
            int label;
            final /* synthetic */ calculatePageOffsets this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallbackWithResult(calculatePageOffsets calculatepageoffsets, String str, NativeAdsEventLogType nativeAdsEventLogType, getPageWidth getpagewidth, String str2, RequestBody requestBody, String str3, access13800<? super onExtraCallbackWithResult> access13800Var) {
                super(2, access13800Var);
                this.this$0 = calculatepageoffsets;
                this.$finalUrl = str;
                this.$logType = nativeAdsEventLogType;
                this.$identity = getpagewidth;
                this.$entryId = str2;
                this.$requestBody = requestBody;
                this.$itemKey = str3;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.this$0, this.$finalUrl, this.$logType, this.$identity, this.$entryId, this.$requestBody, this.$itemKey, access13800Var);
                int i2 = onNavigationEvent + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 9;
                onNavigationEvent = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Pair<String, Boolean>> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    return onExtraCallbackWithResult(findresandmsg, access13800Var);
                }
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }

            public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Pair<String, Boolean>> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
                }
                int i4 = 36 / 0;
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object objOnExtraCallback;
                String str;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    calculatePageOffsets.onExtraCallback(this.this$0, this.$finalUrl, this.$logType);
                    String str2 = this.$finalUrl;
                    calculatePageOffsets calculatepageoffsets = this.this$0;
                    String strOnWarmupCompleted = this.$identity.onWarmupCompleted();
                    String str3 = this.$entryId;
                    String str4 = this.$finalUrl;
                    RequestBody requestBody = this.$requestBody;
                    String strOnExtraCallbackWithResult = this.$identity.onExtraCallbackWithResult();
                    Object[] objArr = {this.this$0, this.$itemKey};
                    int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    String str5 = (String) calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -959499313, 959499325, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
                    String string = this.$logType.toString();
                    boolean zAreEqual = Intrinsics.areEqual(this.$logType, NativeAdsEventLogType.onNavigationEvent.IAuthTabCallback);
                    this.L$0 = str2;
                    this.label = 1;
                    objOnExtraCallback = calculatePageOffsets.onExtraCallback(calculatepageoffsets, strOnWarmupCompleted, str3, str4, requestBody, strOnExtraCallbackWithResult, str5, string, zAreEqual, false, this, 256, null);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        int i3 = onExtraCallback + 39;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 == 0) {
                            return objOnWarmupCompleted;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    str = str2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str6 = (String) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    int i4 = onExtraCallback + 31;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    str = str6;
                    objOnExtraCallback = obj;
                }
                return getWrite.IAuthTabCallback(str, access14000.onNavigationEvent(((onWarmupCompleted) objOnExtraCallback).onWarmupCompleted()));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x02cb, code lost:
        
            if (r1.onExtraCallback(r3, r6, r31) != r10) goto L55;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0264  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strOnNavigationEvent;
            Object objOnNavigationEvent;
            String str;
            Object objIAuthTabCallback;
            RequestBody requestBody;
            String str2;
            Iterator it;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                access14300.onWarmupCompleted();
                requestBodyOnExtraCallback.hashCode();
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!(!this.$beacons.onExtraCallbackWithResult())) {
                    int i4 = onExtraCallbackWithResult + 115;
                    onNavigationEvent = i4 % 128;
                    int i5 = i4 % 2;
                    strOnNavigationEvent = ((enableLayers) calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this.this$0}, 1275593579, -1275593571, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).onNavigationEvent(this.$logType.toString(), this.$payload, calculatePageOffsets.onNavigationEvent(this.this$0), ViewPager.IAuthTabCallback.IAuthTabCallback(this.$requestTs));
                } else {
                    strOnNavigationEvent = null;
                }
                requestBodyOnExtraCallback = strOnNavigationEvent != null ? ((enableLayers) calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this.this$0}, 1275593579, -1275593571, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).onExtraCallback(strOnNavigationEvent) : null;
                performDrag performdragIAuthTabCallbackDefault = calculatePageOffsets.IAuthTabCallbackDefault(this.this$0);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                TrackingLogRecord trackingLogRecord = new TrackingLogRecord(string, this.$identity.onWarmupCompleted(), (List) this.$finalUrls, this.$payload, this.$logType.toString(), this.$requestTs, strOnNavigationEvent, 0, this.$itemKey, this.$beacons.onExtraCallback(), this.$identity.onExtraCallbackWithResult(), this.$identity.IAuthTabCallback(), false, 4224, (DefaultConstructorMarker) null);
                this.L$0 = findresandmsg;
                this.L$1 = access15400.onNavigationEvent(strOnNavigationEvent);
                this.L$2 = requestBodyOnExtraCallback;
                this.label = 1;
                objOnNavigationEvent = performdragIAuthTabCallbackDefault.onNavigationEvent(trackingLogRecord, this);
                if (objOnNavigationEvent != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            if (i3 == 1) {
                requestBodyOnExtraCallback = (RequestBody) this.L$2;
                strOnNavigationEvent = (String) this.L$1;
                ResultKt.onNavigationEvent(obj);
                objOnNavigationEvent = obj;
            } else {
                if (i3 != 2) {
                    int i6 = onNavigationEvent + 19;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0 ? i3 != 3 : i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                str2 = (String) this.L$3;
                RequestBody requestBody2 = (RequestBody) this.L$2;
                String str3 = (String) this.L$1;
                ResultKt.onNavigationEvent(obj);
                str = str3;
                requestBody = requestBody2;
                objIAuthTabCallback = obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) objIAuthTabCallback) {
                    if (((Boolean) ((Pair) obj2).IAuthTabCallback()).booleanValue()) {
                        arrayList.add(obj2);
                        int i7 = onNavigationEvent + 9;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    int i9 = onExtraCallbackWithResult + 1;
                    onNavigationEvent = i9 % 128;
                    if (i9 % 2 == 0) {
                        arrayList2.add((String) ((Pair) it.next()).onExtraCallbackWithResult());
                        int i10 = 98 / 0;
                    } else {
                        arrayList2.add((String) ((Pair) it.next()).onExtraCallbackWithResult());
                    }
                }
                performDrag performdragIAuthTabCallbackDefault2 = calculatePageOffsets.IAuthTabCallbackDefault(this.this$0);
                List<String> listMinus = CollectionsKt.minus(this.$finalUrls, CollectionsKt.toSet(arrayList2));
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(str);
                this.L$2 = access15400.onNavigationEvent(requestBody);
                this.L$3 = access15400.onNavigationEvent(str2);
                this.L$4 = access15400.onNavigationEvent(arrayList2);
                this.label = 3;
            }
            str = strOnNavigationEvent;
            String str4 = (String) objOnNavigationEvent;
            calculatePageOffsets.IAuthTabCallback_Parcel(this.this$0);
            final Function0<Unit> function0 = this.$onDone;
            if (function0 != null) {
                ((Handler) calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this.this$0}, -1914565215, 1914565219, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent())).post(new Runnable() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$fireTrackingUrls$2$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = 2 % 2;
                        int i12 = onNavigationEvent + 53;
                        onWarmupCompleted = i12 % 128;
                        if (i12 % 2 != 0) {
                            calculatePageOffsets.asBinder.onWarmupCompleted(function0);
                            int i13 = 21 / 0;
                        } else {
                            calculatePageOffsets.asBinder.onWarmupCompleted(function0);
                        }
                        int i14 = onWarmupCompleted + 39;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                    }
                });
            }
            List<String> list = this.$finalUrls;
            calculatePageOffsets calculatepageoffsets = this.this$0;
            NativeAdsEventLogType nativeAdsEventLogType = this.$logType;
            getPageWidth getpagewidth = this.$identity;
            String str5 = this.$itemKey;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ArrayList arrayList4 = arrayList3;
                getPageWidth getpagewidth2 = getpagewidth;
                arrayList4.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(calculatepageoffsets, (String) it2.next(), nativeAdsEventLogType, getpagewidth2, str4, requestBodyOnExtraCallback, str5, null), 3, (Object) null));
                arrayList3 = arrayList4;
                str4 = str4;
                str5 = str5;
                getpagewidth = getpagewidth2;
                nativeAdsEventLogType = nativeAdsEventLogType;
                calculatepageoffsets = calculatepageoffsets;
            }
            String str6 = str4;
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.L$1 = access15400.onNavigationEvent(str);
            this.L$2 = access15400.onNavigationEvent(requestBodyOnExtraCallback);
            this.L$3 = str6;
            this.label = 2;
            objIAuthTabCallback = ResourceCallback.IAuthTabCallback(arrayList3, this);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                int i11 = onNavigationEvent + 35;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                requestBody = requestBodyOnExtraCallback;
                str2 = str6;
                ArrayList arrayList5 = new ArrayList();
                while (r4.hasNext()) {
                }
                ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                it = arrayList5.iterator();
                while (it.hasNext()) {
                }
                performDrag performdragIAuthTabCallbackDefault22 = calculatePageOffsets.IAuthTabCallbackDefault(this.this$0);
                List<String> listMinus2 = CollectionsKt.minus(this.$finalUrls, CollectionsKt.toSet(arrayList22));
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.L$1 = access15400.onNavigationEvent(str);
                this.L$2 = access15400.onNavigationEvent(requestBody);
                this.L$3 = access15400.onNavigationEvent(str2);
                this.L$4 = access15400.onNavigationEvent(arrayList22);
                this.label = 3;
            }
            return objOnWarmupCompleted;
        }
    }

    private final void IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 51;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        NativeAdsTrackingFlushWorker.onExtraCallbackWithResult onextracallbackwithresult = NativeAdsTrackingFlushWorker.Companion;
        if (i3 != 0) {
            onextracallbackwithresult.onExtraCallback(this.IAuthTabCallback);
        } else {
            onextracallbackwithresult.onExtraCallback(this.IAuthTabCallback);
            throw null;
        }
    }

    private final void onWarmupCompleted(String str, NativeAdsEventLogType nativeAdsEventLogType) {
        Iterator it;
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 93;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            it = this.access000.iterator();
            int i3 = 91 / 0;
        } else {
            onExtraCallbackWithResult();
            it = this.access000.iterator();
        }
        while (it.hasNext()) {
            int i4 = ICustomTabsCallbackStubProxy + 95;
            onRelationshipValidationResult = i4 % 128;
            if (i4 % 2 != 0) {
                onextracallbackwithresult = (onExtraCallbackWithResult) ((WeakReference) it.next()).get();
                int i5 = 97 / 0;
                if (onextracallbackwithresult != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "Firing tracking urls (");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(-16776961), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) ") for logType: ");
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) nativeAdsEventLogType.toString());
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(-65536), length2, spannableStringBuilder.length(), 33);
                    onextracallbackwithresult.IAuthTabCallback(spannableStringBuilder);
                }
            } else {
                onextracallbackwithresult = (onExtraCallbackWithResult) ((WeakReference) it.next()).get();
                if (onextracallbackwithresult != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) "Firing tracking urls (");
                    int length3 = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) str);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(-16776961), length3, spannableStringBuilder2.length(), 33);
                    spannableStringBuilder2.append((CharSequence) ") for logType: ");
                    int length22 = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) nativeAdsEventLogType.toString());
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(-65536), length22, spannableStringBuilder2.length(), 33);
                    onextracallbackwithresult.IAuthTabCallback(spannableStringBuilder2);
                }
            }
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public final void onWarmupCompleted(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        onExtraCallbackWithResult();
        Iterator<T> it = this.access000.iterator();
        while (!(!it.hasNext())) {
            int i2 = onRelationshipValidationResult + 59;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) ((WeakReference) it.next()).get();
            if (onextracallbackwithresult != null) {
                onextracallbackwithresult.IAuthTabCallback(charSequence);
            }
        }
        int i4 = onRelationshipValidationResult + 41;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 119;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        onExtraCallbackWithResult();
        Iterator<T> it = this.access000.iterator();
        while (it.hasNext()) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) ((WeakReference) it.next()).get();
            if (onextracallbackwithresult != null) {
                int i4 = onRelationshipValidationResult + 55;
                ICustomTabsCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                onextracallbackwithresult.onNavigationEvent(charSequence);
            }
        }
    }

    private final void onWarmupCompleted(NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 25;
        onRelationshipValidationResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult();
            Iterator<T> it = this.access000.iterator();
            while (it.hasNext()) {
                int i3 = onRelationshipValidationResult + 47;
                ICustomTabsCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) ((WeakReference) it.next()).get();
                if (onextracallbackwithresult != null) {
                    onextracallbackwithresult.onEvent(nativeAdsEventLogType);
                }
            }
            int i5 = ICustomTabsCallbackStubProxy + 91;
            onRelationshipValidationResult = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        onExtraCallbackWithResult();
        this.access000.iterator();
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        CollectionsKt.removeAll(this.access000, new Function1() { // from class: im.toss.ads_sdk.log.NativeAdsLogManager$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 93;
                onExtraCallback = i3 % 128;
                WeakReference weakReference = (WeakReference) obj;
                if (i3 % 2 != 0) {
                    int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    Boolean.valueOf(((Boolean) calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{weakReference}, -712791130, 712791145, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent)).booleanValue());
                    throw null;
                }
                int iOnNavigationEvent4 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                int iOnNavigationEvent5 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                int iOnNavigationEvent6 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                Boolean boolValueOf = Boolean.valueOf(((Boolean) calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{weakReference}, -712791130, 712791145, iOnNavigationEvent5, iOnNavigationEvent6, iOnNavigationEvent4)).booleanValue());
                int i4 = onExtraCallback + 63;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return boolValueOf;
            }
        });
        int i2 = ICustomTabsCallbackStubProxy + 61;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final boolean onExtraCallbackWithResult(WeakReference weakReference) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 61;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            weakReference.get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (weakReference.get() == null) {
            int i3 = ICustomTabsCallbackStubProxy + 59;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        int i5 = ICustomTabsCallbackStubProxy + 31;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function0 function0) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{function0}, 1612888017, -1612887998, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    public static /* synthetic */ boolean onExtraCallback(WeakReference weakReference) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{weakReference}, -712791130, 712791145, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent)).booleanValue();
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[0], 1078112656, -1078112655, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    public static final /* synthetic */ String IAuthTabCallback(calculatePageOffsets calculatepageoffsets, String str) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (String) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatepageoffsets, str}, -959499313, 959499325, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    public static final /* synthetic */ Object onExtraCallback(calculatePageOffsets calculatepageoffsets, String str, String str2, String str3, String str4, String str5, Function1 function1, access13800 access13800Var) {
        Object[] objArr = {calculatepageoffsets, str, str2, str3, str4, str5, function1, access13800Var};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -1209902379, 1209902390, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
    }

    public static final /* synthetic */ Object onExtraCallback(calculatePageOffsets calculatepageoffsets, String str, String str2, String str3, RequestBody requestBody, String str4, String str5, String str6, boolean z, boolean z2, access13800 access13800Var) {
        Object[] objArr = {calculatepageoffsets, str, str2, str3, requestBody, str4, str5, str6, Boolean.valueOf(z), Boolean.valueOf(z2), access13800Var};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 271629036, -271629026, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
    }

    public static final /* synthetic */ enableLayers onExtraCallbackWithResult(calculatePageOffsets calculatepageoffsets) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (enableLayers) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatepageoffsets}, 1275593579, -1275593571, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    public static final /* synthetic */ Handler IAuthTabCallback(calculatePageOffsets calculatepageoffsets) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Handler) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatepageoffsets}, -1914565215, 1914565219, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    public static final /* synthetic */ Object IAuthTabCallbackStub(calculatePageOffsets calculatepageoffsets) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatepageoffsets}, -1956944968, 1956944968, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    private static final Unit asBinder() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[0], -1980995850, 1980995859, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    private static final Unit onTransact() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[0], 2002994953, -2002994935, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    private final boolean onNavigationEvent(String str) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, str}, -2035369452, 2035369455, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent)).booleanValue();
    }

    private static final boolean access100(calculatePageOffsets calculatepageoffsets) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{calculatepageoffsets}, 485201967, -485201965, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent)).booleanValue();
    }

    private final void onExtraCallback(String str, NativeAdsDto.AdAsset adAsset, Function0<Unit> function0) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, str, adAsset, function0}, 1316952674, -1316952668, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    static /* synthetic */ boolean IAuthTabCallback(calculatePageOffsets calculatepageoffsets, getPageWidth getpagewidth, dispatchOnPageScrolled dispatchonpagescrolled, String str, Function1 function1, int i, Object obj) {
        Object[] objArr = {calculatepageoffsets, getpagewidth, dispatchonpagescrolled, str, function1, Integer.valueOf(i), obj};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -912802792, 912802809, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent)).booleanValue();
    }

    private final boolean onExtraCallbackWithResult(String str) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, str}, 1663016311, -1663016304, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent)).booleanValue();
    }

    private final boolean IAuthTabCallbackStub(String str) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Boolean) onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, str}, 598063969, -598063964, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent)).booleanValue();
    }

    public final void onWarmupCompleted() {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this}, 2131831744, -2131831730, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    public final void onNavigationEvent(@NotNull String str, @Nullable NativeAdsDto.AdAsset adAsset, @NotNull Function0<Unit> function0) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        int iOnNavigationEvent3 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), new Object[]{this, str, adAsset, function0}, -901033966, 901033982, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent);
    }

    public final void onWarmupCompleted(@NotNull findResAndMsg findresandmsg, @NotNull getPageWidth getpagewidth, @NotNull dispatchOnPageScrolled dispatchonpagescrolled, @NotNull String str, @NotNull Function0<Boolean> function0, @NotNull Function0<Boolean> function02, @NotNull Function0<Boolean> function03) {
        Object[] objArr = {this, findresandmsg, getpagewidth, dispatchonpagescrolled, str, function0, function02, function03};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 13907675, -13907655, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull NativeAdsDto.AdAsset adAsset, @Nullable NativeAdsEventLogType nativeAdsEventLogType, @NotNull dispatchOnPageScrolled dispatchonpagescrolled, @Nullable String str2, @Nullable Function1<? super NativeAdsEventLogType, Unit> function1, @NotNull Function0<Unit> function0) {
        Object[] objArr = {this, str, adAsset, nativeAdsEventLogType, dispatchonpagescrolled, str2, function1, function0};
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, -25815037, 25815050, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
    }
}
