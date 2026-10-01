package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceSDK4ExternalSyntheticLambda1;
import o.ALCFaceSDKExternalSyntheticLambda5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCFaceSDKExternalSyntheticLambda5<T> {
    public static final onExtraCallback Companion;
    private static final Set<String> IAuthTabCallbackStub;
    private static volatile boolean IAuthTabCallbackStubProxy = false;
    private static int ICustomTabsCallback = 1;
    private static long asInterface = 0;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static final boolean onExtraCallbackWithResult = false;
    private static long onTransact;
    private static int readTypedObject;
    private final String IAuthTabCallback_Parcel;
    private final T access000;
    private int access100;
    private static final AppSetIdAndScope1 IAuthTabCallbackDefault = ea10.onExtraCallbackWithResult("TubaVarV1Delegate");
    private static final boolean onExtraCallback = false;
    private static final boolean IAuthTabCallback = false;
    private static final boolean onNavigationEvent = false;
    private static final Lazy<List<ALCFaceSDK4ExternalSyntheticLambda1>> getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.tuba.TubaVarV1Delegate$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 93;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            List listOnNavigationEvent = ALCFaceSDKExternalSyntheticLambda5.onNavigationEvent();
            int i4 = IAuthTabCallback + 57;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return listOnNavigationEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    });
    private static final Lazy<ALCFaceSDK4ExternalSyntheticLambda1> onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.core.tuba.TubaVarV1Delegate$$ExternalSyntheticLambda1
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 29;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1OnWarmupCompleted = ALCFaceSDKExternalSyntheticLambda5.onWarmupCompleted();
            if (i3 == 0) {
                int i4 = 82 / 0;
            }
            return aLCFaceSDK4ExternalSyntheticLambda1OnWarmupCompleted;
        }
    });
    private static final Map<String, Integer> asBinder = new LinkedHashMap();

    public static /* synthetic */ List onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 117;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List listAsInterface = asInterface();
        int i4 = readTypedObject + 71;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return listAsInterface;
    }

    public static /* synthetic */ ALCFaceSDK4ExternalSyntheticLambda1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 37;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1IAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = extraCallbackWithResult + 53;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCFaceSDK4ExternalSyntheticLambda1IAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static final /* synthetic */ List onNavigationEvent(onExtraCallback onextracallback) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            List<ALCFaceSDK4ExternalSyntheticLambda1> listOnNavigationEvent = onextracallback.onNavigationEvent();
            int i4 = IAuthTabCallback + 37;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return listOnNavigationEvent;
        }

        public static final /* synthetic */ ALCFaceSDK4ExternalSyntheticLambda1 onWarmupCompleted(onExtraCallback onextracallback) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 67;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1OnWarmupCompleted = onextracallback.onWarmupCompleted();
            int i4 = IAuthTabCallback + 19;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return aLCFaceSDK4ExternalSyntheticLambda1OnWarmupCompleted;
        }

        private final List<ALCFaceSDK4ExternalSyntheticLambda1> onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 71;
            IAuthTabCallback = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            List<ALCFaceSDK4ExternalSyntheticLambda1> list = (List) ALCFaceSDKExternalSyntheticLambda5.onExtraCallbackWithResult().getValue();
            int i3 = IAuthTabCallback + 113;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return list;
            }
            obj.hashCode();
            throw null;
        }

        private final ALCFaceSDK4ExternalSyntheticLambda1 onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object value = ALCFaceSDKExternalSyntheticLambda5.onExtraCallback().getValue();
            if (i3 == 0) {
                return (ALCFaceSDK4ExternalSyntheticLambda1) value;
            }
            int i4 = 56 / 0;
            return (ALCFaceSDK4ExternalSyntheticLambda1) value;
        }

        public final Set<String> onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 45;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Set setIAuthTabCallback = ALCFaceSDKExternalSyntheticLambda5.IAuthTabCallback();
            if (i3 == 0) {
                return CollectionsKt.toSet(setIAuthTabCallback);
            }
            CollectionsKt.toSet(setIAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public ALCFaceSDKExternalSyntheticLambda5(@NotNull ALCFaceSDK2 aLCFaceSDK2, @NotNull String str, @NotNull T t) {
        Intrinsics.checkNotNullParameter(aLCFaceSDK2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(t, "");
        this.IAuthTabCallback_Parcel = str;
        this.access000 = t;
        aLCFaceSDK2.onWarmupCompleted().put(str, t);
    }

    public static final /* synthetic */ Set IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 109;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Set<String> set = IAuthTabCallbackStub;
        int i5 = i2 + 3;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return set;
    }

    public static final /* synthetic */ Lazy onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 33;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Lazy<ALCFaceSDK4ExternalSyntheticLambda1> lazy = onWarmupCompleted;
        int i4 = i2 + 55;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return lazy;
        }
        throw null;
    }

    public static final /* synthetic */ Lazy onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 99;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Lazy<List<ALCFaceSDK4ExternalSyntheticLambda1>> lazy = getInterfaceDescriptor;
        if (i3 != 0) {
            int i4 = 62 / 0;
        }
        return lazy;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        Intrinsics.checkNotNullExpressionValue(keySetViewNewKeySet, "");
        IAuthTabCallbackStub = keySetViewNewKeySet;
        int i = extraCallback + 35;
        ICustomTabsCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    private static final List asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        List<ALCFaceSDK4ExternalSyntheticLambda1> listOnWarmupCompleted = onResponse.onWarmupCompleted.onWarmupCompleted(true, true);
        int i4 = extraCallbackWithResult + 121;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return listOnWarmupCompleted;
    }

    private static final ALCFaceSDK4ExternalSyntheticLambda1 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 55;
        readTypedObject = i2 % 128;
        return (ALCFaceSDK4ExternalSyntheticLambda1) CollectionsKt.firstOrNull(i2 % 2 != 0 ? onResponse.onWarmupCompleted.onWarmupCompleted(true, true) : onResponse.onWarmupCompleted.onWarmupCompleted(false, true));
    }

    private final r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg onExtraCallback(ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1, T t) {
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (t == null) {
            return r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.DECLARED_DEFAULT;
        }
        if (aLCFaceSDK4ExternalSyntheticLambda1 == onExtraCallback.onWarmupCompleted(Companion)) {
            int i4 = readTypedObject + 25;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.CONFIGURED;
        }
        r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg r8lambdaimi1kkyy494wcpjbjziyxabnqtg = r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.UNKNOWN;
        int i6 = readTypedObject + 1;
        extraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return r8lambdaimi1kkyy494wcpjbjziyxabnqtg;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T onWarmupCompleted(@Nullable Object obj, @NotNull addAllCommandLine<?> addallcommandline) {
        T next;
        T t;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(addallcommandline, "");
        Object objOnNavigationEvent = null;
        if (onExtraCallbackWithResult && IAuthTabCallbackStubProxy) {
            int i2 = extraCallbackWithResult + 47;
            readTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                return this.access000;
            }
            objOnNavigationEvent.hashCode();
            throw null;
        }
        if (!onResponse.onWarmupCompleted.onExtraCallback()) {
            IAuthTabCallbackStub.add(this.IAuthTabCallback_Parcel);
            return this.access000;
        }
        long jNanoTime = System.nanoTime();
        Iterator<T> it = onExtraCallback.onNavigationEvent(Companion).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ALCFaceSDK4ExternalSyntheticLambda1) next).IAuthTabCallback(this.IAuthTabCallback_Parcel)) {
                break;
            }
        }
        ALCFaceSDK4ExternalSyntheticLambda1 aLCFaceSDK4ExternalSyntheticLambda1 = (ALCFaceSDK4ExternalSyntheticLambda1) next;
        if (aLCFaceSDK4ExternalSyntheticLambda1 != null) {
            int i3 = extraCallbackWithResult + 119;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                aLCFaceSDK4ExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback_Parcel, this.access000.getClass(), this.access000);
                objOnNavigationEvent.hashCode();
                throw null;
            }
            objOnNavigationEvent = aLCFaceSDK4ExternalSyntheticLambda1.onNavigationEvent(this.IAuthTabCallback_Parcel, this.access000.getClass(), this.access000);
        }
        if (onExtraCallbackWithResult) {
            if (aLCFaceSDK4ExternalSyntheticLambda1 != null) {
                int i4 = readTypedObject + 123;
                extraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 89 / 0;
                    if (objOnNavigationEvent == null) {
                        addallcommandline.getName();
                        Objects.toString(this.access000);
                        Objects.toString(aLCFaceSDK4ExternalSyntheticLambda1);
                    } else if (onExtraCallback) {
                        addallcommandline.getName();
                        Objects.toString(objOnNavigationEvent);
                        Objects.toString(aLCFaceSDK4ExternalSyntheticLambda1);
                    }
                } else if (objOnNavigationEvent == null) {
                }
            }
            if (onNavigationEvent) {
                int i6 = extraCallbackWithResult + 115;
                readTypedObject = i6 % 128;
                int i7 = i6 % 2;
                int i8 = this.access100 + 1;
                this.access100 = i8;
                if (i8 % 10 == 0) {
                    Map<String, Integer> map = asBinder;
                    map.put(this.IAuthTabCallback_Parcel, Integer.valueOf(i8));
                    CollectionsKt.joinToString$default(CollectionsKt.sortedWith(access8100.onExtraCallback(map), new onNavigationEvent()), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                }
            }
            if (IAuthTabCallback) {
                long jNanoTime2 = System.nanoTime() - jNanoTime;
                long j = asInterface + jNanoTime2;
                asInterface = j;
                long j2 = onTransact + 1;
                onTransact = j2;
                long j3 = (j / j2) / 1000;
                long j4 = jNanoTime2 / 1000;
            }
        }
        if (objOnNavigationEvent == null) {
            int i9 = readTypedObject + 87;
            extraCallbackWithResult = i9 % 128;
            if (i9 % 2 == 0) {
                t = this.access000;
                int i10 = 74 / 0;
            } else {
                t = this.access000;
            }
        } else {
            t = (T) objOnNavigationEvent;
        }
        ALCFaceSDK4 aLCFaceSDK4IAuthTabCallback = r8lambdaxnlsrUWnZSWLAlZCj_icPo2spk0.onExtraCallbackWithResult.IAuthTabCallback();
        if (aLCFaceSDK4IAuthTabCallback != null) {
            try {
                aLCFaceSDK4IAuthTabCallback.IAuthTabCallback(new ALCFaceSDKExternalSyntheticLambda4(ALCFaceSDK3.V1, this.IAuthTabCallback_Parcel, t, this.access000, onExtraCallback(aLCFaceSDK4ExternalSyntheticLambda1, objOnNavigationEvent), System.nanoTime() - jNanoTime, null, null, 192, null));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
        return t;
    }

    public static final class onNavigationEvent<T> implements Comparator {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 61;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int iIAuthTabCallback = getCodeNameBytes.IAuthTabCallback((Integer) ((Pair) t2).getSecond(), (Integer) ((Pair) t).getSecond());
            int i4 = onExtraCallbackWithResult + 59;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iIAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
