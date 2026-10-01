package o;

import im.toss.ads_sdk.model.NativeAdsEventLogType;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class dataSetChanged {
    private static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallbackStub = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    private final findResAndMsg onExtraCallback;
    private final endFakeDrag onNavigationEvent;

    static {
        int i2 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public dataSetChanged(@NotNull endFakeDrag endfakedrag) {
        Intrinsics.checkNotNullParameter(endfakedrag, "");
        this.onNavigationEvent = endfakedrag;
        this.onExtraCallback = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()).plus(new IAuthTabCallback(CoroutineExceptionHandler.extraCallbackWithResult)));
    }

    public static final /* synthetic */ endFakeDrag IAuthTabCallback(dataSetChanged datasetchanged) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 95;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        endFakeDrag endfakedrag = datasetchanged.onNavigationEvent;
        if (i4 == 0) {
            int i5 = 44 / 0;
        }
        return endfakedrag;
    }

    public static /* synthetic */ boolean onExtraCallback(dataSetChanged datasetchanged, getPageMargin getpagemargin, NativeAdsEventLogType nativeAdsEventLogType, executeKeyEvent executekeyevent, clearOnPageChangeListeners clearonpagechangelisteners, findResAndMsg findresandmsg, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub;
        int i5 = i4 + 35;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 16) != 0) {
            int i7 = i4 + 27;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                findResAndMsg findresandmsg2 = datasetchanged.onExtraCallback;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            findresandmsg = datasetchanged.onExtraCallback;
        }
        return datasetchanged.IAuthTabCallback(getpagemargin, nativeAdsEventLogType, executekeyevent, clearonpagechangelisteners, findresandmsg);
    }

    public static final class IAuthTabCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 49;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        public IAuthTabCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ List<String> $firingUrls;
        final /* synthetic */ NativeAdsEventLogType $logType;
        final /* synthetic */ getPageMargin $trackingData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(getPageMargin getpagemargin, List<String> list, NativeAdsEventLogType nativeAdsEventLogType, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$trackingData = getpagemargin;
            this.$firingUrls = list;
            this.$logType = nativeAdsEventLogType;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onNavigationEvent onnavigationevent = dataSetChanged.this.new onNavigationEvent(this.$trackingData, this.$firingUrls, this.$logType, access13800Var);
            int i3 = IAuthTabCallback + 97;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 101;
            IAuthTabCallback = i3 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i3 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i4 = onNavigationEvent + 43;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 3;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i5 = IAuthTabCallback + 23;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 105;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i4 + 13;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            dataSetChanged.IAuthTabCallback(dataSetChanged.this).IAuthTabCallback(this.$trackingData.onWarmupCompleted(), this.$trackingData.IAuthTabCallback(), this.$firingUrls, this.$logType);
            return Unit.INSTANCE;
        }
    }

    public final boolean IAuthTabCallback(@NotNull getPageMargin getpagemargin, @NotNull NativeAdsEventLogType nativeAdsEventLogType, @NotNull executeKeyEvent executekeyevent, @NotNull clearOnPageChangeListeners clearonpagechangelisteners, @NotNull findResAndMsg findresandmsg) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(getpagemargin, "");
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        Intrinsics.checkNotNullParameter(executekeyevent, "");
        Intrinsics.checkNotNullParameter(clearonpagechangelisteners, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        List<getOffscreenPageLimit> listOnNavigationEvent = getpagemargin.onNavigationEvent();
        ArrayList<getOffscreenPageLimit> arrayList = new ArrayList();
        for (Object obj : listOnNavigationEvent) {
            int i3 = IAuthTabCallbackStub + 13;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (Intrinsics.areEqual(NativeAdsEventLogType.Companion.onWarmupCompleted(((getOffscreenPageLimit) obj).IAuthTabCallback()), nativeAdsEventLogType)) {
                int i5 = onTransact + 77;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            int i7 = IAuthTabCallbackStub + 7;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (getOffscreenPageLimit getoffscreenpagelimit : arrayList) {
            String strOnNavigationEvent = getoffscreenpagelimit.onNavigationEvent();
            String str = getoffscreenpagelimit.onWarmupCompleted().get("code");
            String strReplace$default = StringsKt.replace$default(strOnNavigationEvent, "{code}", str == null ? "" : str, false, 4, (Object) null);
            if (!clearonpagechangelisteners.onExtraCallbackWithResult(nativeAdsEventLogType, strReplace$default)) {
                strReplace$default = null;
            }
            if (strReplace$default != null) {
                int i9 = IAuthTabCallbackStub + 1;
                onTransact = i9 % 128;
                if (i9 % 2 == 0) {
                    arrayList2.add(strReplace$default);
                    throw null;
                }
                arrayList2.add(strReplace$default);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(getpagemargin, arrayList2, nativeAdsEventLogType, null), 3, (Object) null);
        executekeyevent.onNavigationEvent(nativeAdsEventLogType);
        return true;
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
