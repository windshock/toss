package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import o.CatalystInstanceImplNativeExceptionHandler;
import o.getPackageType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CatalystInstanceImplNativeExceptionHandler {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long IAuthTabCallback = 0;
    private static getPackageType IAuthTabCallbackDefault = null;
    private static final Lazy IAuthTabCallbackStub;
    private static final ConcurrentHashMap<String, Long> IAuthTabCallbackStubProxy;
    private static Long IAuthTabCallback_Parcel = null;
    private static int[] ICustomTabsCallback = null;
    private static final Object access000;
    private static final LinkedList<Pair<Long, Long>> access100;
    private static Long asBinder = null;
    private static final findResAndMsg asInterface;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static final ConcurrentHashMap<String, onNavigationEvent> getInterfaceDescriptor;
    public static final int onExtraCallback;
    public static final CatalystInstanceImplNativeExceptionHandler onExtraCallbackWithResult;
    private static final List<String> onNavigationEvent;
    private static final AppSetIdAndScope1 onTransact;
    private static long onWarmupCompleted = 0;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 7;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, obj);
        int i4 = writeTypedObject + 119;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ CharSequence onExtraCallbackWithResult(Map.Entry entry) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 65;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(entry);
        }
        onExtraCallback(entry);
        throw null;
    }

    public static /* synthetic */ int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 27;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor();
            throw null;
        }
        int interfaceDescriptor = getInterfaceDescriptor();
        int i3 = extraCallbackWithResult + 75;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ boolean onNavigationEvent(Thread thread) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 97;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(thread);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(thread);
        int i3 = writeTypedObject + 71;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean onWarmupCompleted(long j, long j2, Pair pair) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 99;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(j, j2, pair);
        }
        IAuthTabCallback(j, j2, pair);
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(Thread thread) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(thread);
        int i4 = extraCallbackWithResult + 95;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    private CatalystInstanceImplNativeExceptionHandler() {
    }

    public static final /* synthetic */ long IAuthTabCallback(CatalystInstanceImplNativeExceptionHandler catalystInstanceImplNativeExceptionHandler) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 17;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return catalystInstanceImplNativeExceptionHandler.writeTypedObject();
        }
        catalystInstanceImplNativeExceptionHandler.writeTypedObject();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ConcurrentHashMap IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 17;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        ConcurrentHashMap<String, onNavigationEvent> concurrentHashMap = getInterfaceDescriptor;
        int i5 = i2 + 5;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return concurrentHashMap;
    }

    public static final /* synthetic */ Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 107;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        CatalystInstanceImplNativeExceptionHandler catalystInstanceImplNativeExceptionHandler = (CatalystInstanceImplNativeExceptionHandler) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject + 35;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(C40Encoder.onExtraCallback(), 1706134776, -1706134773, new Object[]{catalystInstanceImplNativeExceptionHandler}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
        int i4 = writeTypedObject + 33;
        extraCallbackWithResult = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ long onExtraCallbackWithResult(CatalystInstanceImplNativeExceptionHandler catalystInstanceImplNativeExceptionHandler) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 21;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            catalystInstanceImplNativeExceptionHandler.IAuthTabCallbackStubProxy();
            throw null;
        }
        long jIAuthTabCallbackStubProxy = catalystInstanceImplNativeExceptionHandler.IAuthTabCallbackStubProxy();
        int i3 = writeTypedObject + 95;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return jIAuthTabCallbackStubProxy;
    }

    public static final /* synthetic */ Long onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 39;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Long l = IAuthTabCallback_Parcel;
        int i5 = i2 + 15;
        writeTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Long l = (Long) objArr[0];
        int i = 2 % 2;
        int i2 = writeTypedObject;
        int i3 = i2 + 109;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        asBinder = l;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 25;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    static {
        onTransact();
        onExtraCallbackWithResult = new CatalystInstanceImplNativeExceptionHandler();
        onTransact = ea10.onExtraCallbackWithResult("TrafficStatsWatcher");
        Object[] objArr = new Object[1];
        a(new int[]{-1218663331, -1381379748, 1210394126, 40814592}, TextUtils.indexOf((CharSequence) "", '0') + 8, objArr);
        onNavigationEvent = CollectionsKt.listOf(new String[]{"okhttp", "http", "exo", "media", "chromium", "cronet", "gms", "admob", ((String) objArr[0]).intern()});
        getInterfaceDescriptor = new ConcurrentHashMap<>();
        IAuthTabCallbackStubProxy = new ConcurrentHashMap<>();
        access100 = new LinkedList<>();
        access000 = new Object();
        asInterface = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
        IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.network.stats.TrafficStatsWatcher$$ExternalSyntheticLambda0
            public final Object invoke() {
                return Integer.valueOf(CatalystInstanceImplNativeExceptionHandler.onNavigationEvent());
            }
        });
        onExtraCallback = 8;
        int i = readTypedObject + 111;
        extraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 58 / 0;
        }
    }

    public static final class onExtraCallback {
        private final long IAuthTabCallback;
        private final long IAuthTabCallbackDefault;
        private final long IAuthTabCallbackStub;
        private final int access100;
        private final String asBinder;
        private final long asInterface;
        private final int onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final long onNavigationEvent;
        private final long onTransact;
        private final long onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                return false;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            return Intrinsics.areEqual(this.asBinder, onextracallback.asBinder) && this.access100 == onextracallback.access100 && this.onNavigationEvent == onextracallback.onNavigationEvent && this.IAuthTabCallbackStub == onextracallback.IAuthTabCallbackStub && this.IAuthTabCallback == onextracallback.IAuthTabCallback && this.onExtraCallback == onextracallback.onExtraCallback && this.onTransact == onextracallback.onTransact && this.asInterface == onextracallback.asInterface && this.IAuthTabCallbackDefault == onextracallback.IAuthTabCallbackDefault && this.onWarmupCompleted == onextracallback.onWarmupCompleted && Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult);
        }

        public int hashCode() {
            return (((((((((((((((((((this.asBinder.hashCode() * 31) + Integer.hashCode(this.access100)) * 31) + Long.hashCode(this.onNavigationEvent)) * 31) + Long.hashCode(this.IAuthTabCallbackStub)) * 31) + Long.hashCode(this.IAuthTabCallback)) * 31) + Integer.hashCode(this.onExtraCallback)) * 31) + Long.hashCode(this.onTransact)) * 31) + Long.hashCode(this.asInterface)) * 31) + Long.hashCode(this.IAuthTabCallbackDefault)) * 31) + Long.hashCode(this.onWarmupCompleted)) * 31) + this.onExtraCallbackWithResult.hashCode();
        }

        public String toString() {
            return "Spike(watchId=" + this.asBinder + ", windowMinutes=" + this.access100 + ", bytesUsed=" + this.onNavigationEvent + ", startElapsedMs=" + this.IAuthTabCallbackStub + ", endElapsedMs=" + this.IAuthTabCallback + ", numberOfEntities=" + this.onExtraCallback + ", rxBytesSinceStart=" + this.onTransact + ", txBytesSinceStart=" + this.asInterface + ", totalBytesSinceBoot=" + this.IAuthTabCallbackDefault + ", ratePerMin=" + this.onWarmupCompleted + ", activeNetThreads=" + this.onExtraCallbackWithResult + ")";
        }

        public onExtraCallback(@NotNull String str, int i, long j, long j2, long j3, int i2, long j4, long j5, long j6, long j7, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.asBinder = str;
            this.access100 = i;
            this.onNavigationEvent = j;
            this.IAuthTabCallbackStub = j2;
            this.IAuthTabCallback = j3;
            this.onExtraCallback = i2;
            this.onTransact = j4;
            this.asInterface = j5;
            this.IAuthTabCallbackDefault = j6;
            this.onWarmupCompleted = j7;
            this.onExtraCallbackWithResult = str2;
        }

        public final int asInterface() {
            return this.access100;
        }

        public final long onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        public final long IAuthTabCallbackStub() {
            return this.IAuthTabCallbackStub;
        }

        public final long IAuthTabCallback() {
            return this.IAuthTabCallback;
        }

        public final int onExtraCallback() {
            return this.onExtraCallback;
        }

        public final long asBinder() {
            return this.onTransact;
        }

        public final long onTransact() {
            return this.asInterface;
        }

        public final long IAuthTabCallbackDefault() {
            return this.IAuthTabCallbackDefault;
        }

        public final long onNavigationEvent() {
            return this.onWarmupCompleted;
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }
    }

    public static final class onNavigationEvent {
        private final int IAuthTabCallback;
        private final String onExtraCallback;
        private final long onNavigationEvent;
        private final Function1<onExtraCallback, Unit> onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onNavigationEvent)) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            return Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback) && this.IAuthTabCallback == onnavigationevent.IAuthTabCallback && this.onNavigationEvent == onnavigationevent.onNavigationEvent && Intrinsics.areEqual(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted);
        }

        public int hashCode() {
            return (((((this.onExtraCallback.hashCode() * 31) + Integer.hashCode(this.IAuthTabCallback)) * 31) + Long.hashCode(this.onNavigationEvent)) * 31) + this.onWarmupCompleted.hashCode();
        }

        public String toString() {
            return "Watch(id=" + this.onExtraCallback + ", windowMinutes=" + this.IAuthTabCallback + ", thresholdBytes=" + this.onNavigationEvent + ", onSpike=" + this.onWarmupCompleted + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(@NotNull String str, int i, long j, @NotNull Function1<? super onExtraCallback, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = str;
            this.IAuthTabCallback = i;
            this.onNavigationEvent = j;
            this.onWarmupCompleted = function1;
        }

        public final String onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public final int onNavigationEvent() {
            return this.IAuthTabCallback;
        }

        public final long onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        public final Function1<onExtraCallback, Unit> onExtraCallback() {
            return this.onWarmupCompleted;
        }
    }

    public final void onExtraCallback(@NotNull onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 53;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        getInterfaceDescriptor.put(onnavigationevent.onExtraCallbackWithResult(), onnavigationevent);
        IAuthTabCallbackStubProxy.put(onnavigationevent.onExtraCallbackWithResult(), Long.valueOf(SystemClock.elapsedRealtime()));
        String strOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
        int iOnNavigationEvent = onnavigationevent.onNavigationEvent();
        new Object[]{strOnExtraCallbackWithResult, Integer.valueOf(iOnNavigationEvent), getLongName.onWarmupCompleted(onnavigationevent.onWarmupCompleted())};
        IAuthTabCallbackDefault();
        int i4 = writeTypedObject + 23;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallbackStubProxy.remove(str);
        ConcurrentHashMap<String, onNavigationEvent> concurrentHashMap = getInterfaceDescriptor;
        if (concurrentHashMap.remove(str) != null) {
            concurrentHashMap.size();
        }
        if (!concurrentHashMap.isEmpty()) {
            return;
        }
        int i2 = extraCallbackWithResult + 57;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        access100();
        int i4 = writeTypedObject + 27;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        getPackageType getpackagetype = IAuthTabCallbackDefault;
        if (getpackagetype != null) {
            int i2 = extraCallbackWithResult + 87;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                if (getpackagetype.onExtraCallback()) {
                    return;
                }
            } else if (getpackagetype.onExtraCallback()) {
                return;
            }
        }
        IAuthTabCallback_Parcel();
        int i3 = writeTypedObject + 7;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void access100() {
        IAuthTabCallback_Parcel = null;
        asBinder = null;
        IAuthTabCallback = 0L;
        onWarmupCompleted = 0L;
        getPackageType getpackagetype = IAuthTabCallbackDefault;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
        }
        IAuthTabCallbackDefault = null;
        synchronized (access000) {
            access100.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final long access000() {
        Integer num;
        int iIntValue;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Collection<onNavigationEvent> collectionValues = getInterfaceDescriptor.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        Iterator<T> it = collectionValues.iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((onNavigationEvent) it.next()).onNavigationEvent());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((onNavigationEvent) it.next()).onNavigationEvent());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    int i4 = extraCallbackWithResult + 47;
                    writeTypedObject = i4 % 128;
                    int i5 = i4 % 2;
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (num != null) {
            iIntValue = num.intValue();
            int i6 = extraCallbackWithResult + 39;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
        } else {
            int i8 = extraCallbackWithResult + 51;
            writeTypedObject = i8 % 128;
            int i9 = i8 % 2;
            iIntValue = 1;
        }
        return iIntValue * 60000;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(access13800Var);
            onwarmupcompleted.L$0 = obj;
            return onwarmupcompleted;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                if (CatalystInstanceImplNativeExceptionHandler.onExtraCallbackWithResult() == null) {
                    Object[] objArr = {access14000.onExtraCallback(CatalystInstanceImplNativeExceptionHandler.IAuthTabCallback(CatalystInstanceImplNativeExceptionHandler.onExtraCallbackWithResult))};
                    CatalystInstanceImplNativeExceptionHandler.onExtraCallback(C40Encoder.onExtraCallback(), 1556133811, -1556133807, objArr, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
                }
                if (CatalystInstanceImplNativeExceptionHandler.onExtraCallback() == null) {
                    Object[] objArr2 = {access14000.onExtraCallback(CatalystInstanceImplNativeExceptionHandler.onExtraCallbackWithResult(CatalystInstanceImplNativeExceptionHandler.onExtraCallbackWithResult))};
                    CatalystInstanceImplNativeExceptionHandler.onExtraCallback(C40Encoder.onExtraCallback(), -296291808, 296291809, objArr2, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
                }
                access14000.onExtraCallback(30000L);
                CatalystInstanceImplNativeExceptionHandler.IAuthTabCallback().keySet();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            while (findRes.onWarmupCompleted(findresandmsg)) {
                Object[] objArr3 = {CatalystInstanceImplNativeExceptionHandler.onExtraCallbackWithResult};
                CatalystInstanceImplNativeExceptionHandler.onExtraCallback(C40Encoder.onExtraCallback(), 379223777, -379223775, objArr3, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
                this.L$0 = findresandmsg;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(30000L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 7;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getPackageType getpackagetype = IAuthTabCallbackDefault;
        if (getpackagetype != null) {
            getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetype, (CancellationException) null, 1, (Object) null);
            int i4 = extraCallbackWithResult + 121;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        IAuthTabCallbackDefault = maybeUpdateAnimatable.onNavigationEvent(asInterface, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i6 = writeTypedObject + 83;
        extraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        synchronized (access000) {
            try {
                CatalystInstanceImplNativeExceptionHandler catalystInstanceImplNativeExceptionHandler = onExtraCallbackWithResult;
                long jIAuthTabCallbackStubProxy = catalystInstanceImplNativeExceptionHandler.IAuthTabCallbackStubProxy();
                long jWriteTypedObject = catalystInstanceImplNativeExceptionHandler.writeTypedObject();
                Long l = asBinder;
                long j = 0;
                try {
                    if (jIAuthTabCallbackStubProxy >= (l != null ? l.longValue() : 0L)) {
                        Long l2 = IAuthTabCallback_Parcel;
                        if (jWriteTypedObject >= (l2 != null ? l2.longValue() : 0L)) {
                            final long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Long l3 = asBinder;
                            long jLongValue = l3 != null ? l3.longValue() : 0L;
                            Long l4 = IAuthTabCallback_Parcel;
                            long jLongValue2 = (jIAuthTabCallbackStubProxy - jLongValue) + (jWriteTypedObject - (l4 != null ? l4.longValue() : 0L));
                            LinkedList<Pair<Long, Long>> linkedList = access100;
                            linkedList.add(getWrite.IAuthTabCallback(Long.valueOf(jElapsedRealtime), Long.valueOf(jLongValue2)));
                            final long jAccess000 = catalystInstanceImplNativeExceptionHandler.access000();
                            final Function1 function1 = new Function1() { // from class: viva.republica.toss.network.stats.TrafficStatsWatcher$$ExternalSyntheticLambda1
                                public final Object invoke(Object obj) {
                                    return Boolean.valueOf(CatalystInstanceImplNativeExceptionHandler.onWarmupCompleted(jElapsedRealtime, jAccess000, (Pair) obj));
                                }
                            };
                            linkedList.removeIf(new Predicate() { // from class: viva.republica.toss.network.stats.TrafficStatsWatcher$$ExternalSyntheticLambda2
                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    return CatalystInstanceImplNativeExceptionHandler.IAuthTabCallback(function1, obj);
                                }
                            });
                            long j2 = onWarmupCompleted;
                            if (j2 > 0 && jElapsedRealtime > j2) {
                                j = ((jLongValue2 - IAuthTabCallback) * 60000) / (jElapsedRealtime - j2);
                            }
                            IAuthTabCallback = jLongValue2;
                            onWarmupCompleted = jElapsedRealtime;
                            getLongName.onWarmupCompleted(jLongValue2);
                            getLongName.onWarmupCompleted(j);
                            Integer.valueOf(linkedList.size());
                            for (Pair pair : (List) onExtraCallback(C40Encoder.onExtraCallback(), 1833209489, -1833209484, new Object[]{catalystInstanceImplNativeExceptionHandler, Long.valueOf(jElapsedRealtime), Long.valueOf(jLongValue2), Long.valueOf(jIAuthTabCallbackStubProxy), Long.valueOf(jWriteTypedObject), Long.valueOf(j)}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback())) {
                                ((onNavigationEvent) pair.onExtraCallbackWithResult()).onExtraCallback().invoke((onExtraCallback) pair.IAuthTabCallback());
                            }
                            return null;
                        }
                    }
                    asBinder = Long.valueOf(jIAuthTabCallbackStubProxy);
                    IAuthTabCallback_Parcel = Long.valueOf(jWriteTypedObject);
                    access100.clear();
                    IAuthTabCallback = 0L;
                    onWarmupCompleted = 0L;
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private static final boolean IAuthTabCallback(long j, long j2, Pair pair) {
        int i = 2 % 2;
        if (j - ((Number) pair.getFirst()).longValue() <= j2) {
            int i2 = extraCallbackWithResult + 111;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = extraCallbackWithResult + 95;
        int i5 = i4 % 128;
        writeTypedObject = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 35;
        extraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    private static final boolean onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 113;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) function1.invoke(obj);
        if (i3 != 0) {
            bool.booleanValue();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = writeTypedObject + 1;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = ICustomTabsCallback;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 25;
            int i8 = i7 % 128;
            $10 = i8;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            int i9 = i8 + 57;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 71, 8848 - TextUtils.getCapsMode("", 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i3++;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ICustomTabsCallback;
        if (iArr5 != null) {
            int i11 = $11;
            int i12 = i11 + 115;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = i11 + 37;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i16]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(i6) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i6) == 0.0d ? 0 : -1)) + 72, 8847 - TextUtils.indexOf((CharSequence) "", '0', i6, i6), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i16] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i16++;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        int i17 = $11 + 15;
        $10 = i17 % 128;
        int i18 = i17 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i19 = 0;
            for (int i20 = 16; i19 < i20; i20 = 16) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i19];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.resolveSize(0, 0)), 38 - MotionEvent.axisFromString(""), 10301 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i19++;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i21;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i23 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16773183) - Color.rgb(0, 0, 0)), (-16777138) - Color.rgb(0, 0, 0), 7397 - ImageFormat.getBitsPerPixel(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i24 = $10 + 73;
        $11 = i24 % 128;
        int i25 = i24 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r47) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CatalystInstanceImplNativeExceptionHandler.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    private static final boolean IAuthTabCallback(Thread thread) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 11;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (thread.getState() != Thread.State.RUNNABLE) {
            return false;
        }
        int i4 = extraCallbackWithResult + 71;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final boolean onExtraCallbackWithResult(Thread thread) {
        int i = 2 % 2;
        List<String> list = onNavigationEvent;
        Object obj = null;
        if ((list instanceof Collection) && list.isEmpty()) {
            int i2 = extraCallbackWithResult + 93;
            writeTypedObject = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        Iterator<T> it = list.iterator();
        while (!(!it.hasNext())) {
            int i3 = writeTypedObject + 31;
            extraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String str = (String) it.next();
            String name = thread.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (StringsKt.contains$default(lowerCase, str, false, 2, (Object) null)) {
                int i5 = writeTypedObject + 95;
                extraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 32 / 0;
                }
                return true;
            }
        }
        return false;
    }

    private static final CharSequence onExtraCallback(Map.Entry entry) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(entry, "");
        String str = entry.getKey() + "×" + entry.getValue();
        int i2 = extraCallbackWithResult + 59;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private final String asInterface() {
        int i = 2 % 2;
        String strTake = StringsKt.take(CollectionsKt.joinToString$default(access7900.IAuthTabCallback(new onExtraCallbackWithResult(clearRevision.onWarmupCompleted(clearRevision.onWarmupCompleted(CollectionsKt.asSequence(Thread.getAllStackTraces().keySet()), new Function1() { // from class: viva.republica.toss.network.stats.TrafficStatsWatcher$$ExternalSyntheticLambda3
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CatalystInstanceImplNativeExceptionHandler.onWarmupCompleted((Thread) obj));
            }
        }), new Function1() { // from class: viva.republica.toss.network.stats.TrafficStatsWatcher$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return Boolean.valueOf(CatalystInstanceImplNativeExceptionHandler.onNavigationEvent((Thread) obj));
            }
        }))).entrySet(), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: viva.republica.toss.network.stats.TrafficStatsWatcher$$ExternalSyntheticLambda5
            public final Object invoke(Object obj) {
                return CatalystInstanceImplNativeExceptionHandler.onExtraCallbackWithResult((Map.Entry) obj);
            }
        }, 30, (Object) null), 400);
        int i2 = extraCallbackWithResult + 67;
        writeTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return strTake;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final int IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 73;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((Number) IAuthTabCallbackStub.getValue()).intValue();
            obj.hashCode();
            throw null;
        }
        int iIntValue = ((Number) IAuthTabCallbackStub.getValue()).intValue();
        int i3 = writeTypedObject + 73;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return iIntValue;
        }
        throw null;
    }

    private static final int getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iMyUid = Process.myUid();
        int i4 = writeTypedObject + 33;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iMyUid;
        }
        throw null;
    }

    private final long IAuthTabCallbackStubProxy() {
        Object objValueOf;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            objValueOf = Result.constructor-impl(Long.valueOf(TrafficStats.getUidRxBytes(IAuthTabCallbackStub())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objValueOf = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(objValueOf) != null) {
            int i2 = writeTypedObject + 65;
            extraCallbackWithResult = i2 % 128;
            objValueOf = Long.valueOf(i2 % 2 != 0 ? 1L : 0L);
        }
        long jLongValue = ((Number) objValueOf).longValue();
        int i3 = writeTypedObject + 13;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return jLongValue;
    }

    private final long writeTypedObject() {
        Object obj;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        writeTypedObject = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Long.valueOf(TrafficStats.getUidTxBytes(IAuthTabCallbackStub())));
                int i3 = 68 / 0;
            } else {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(Long.valueOf(TrafficStats.getUidTxBytes(IAuthTabCallbackStub())));
            }
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            int i4 = extraCallbackWithResult + 33;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            obj = 0L;
            int i6 = writeTypedObject + 107;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
        return ((Number) obj).longValue();
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i);
        int i11 = ~i;
        int i12 = (~(i7 | i3)) | (~(i8 | i11)) | (~(i8 | i2));
        int i13 = ~(i11 | i9);
        int i14 = i2 + i3 + i5 + (1938118820 * i6) + ((-1869228383) * i4);
        int i15 = i14 * i14;
        int i16 = (i2 * (-1046486968)) + 2037645312 + ((-1046486968) * i3) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i5) + ((-1907359744) * i6) + (1374945280 * i4) + (1516044288 * i15);
        int i17 = ((i2 * 647972376) - 1941852458) + (i3 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i5 * 647973227) + (i6 * (-1260466036)) + (i4 * 1557372491) + (i15 * 1239351296);
        int i18 = i16 + (i17 * i17 * 490405888);
        if (i18 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 == 2) {
            return onExtraCallback(objArr);
        }
        if (i18 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 4) {
            Long l = (Long) objArr[0];
            int i19 = 2 % 2;
            int i20 = extraCallbackWithResult + 97;
            int i21 = i20 % 128;
            writeTypedObject = i21;
            int i22 = i20 % 2;
            IAuthTabCallback_Parcel = l;
            int i23 = i21 + 95;
            extraCallbackWithResult = i23 % 128;
            int i24 = i23 % 2;
            return null;
        }
        if (i18 == 5) {
            return onNavigationEvent(objArr);
        }
        int i25 = 2 % 2;
        int i26 = extraCallbackWithResult + 21;
        int i27 = i26 % 128;
        writeTypedObject = i27;
        int i28 = i26 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = onTransact;
        int i29 = i27 + 7;
        extraCallbackWithResult = i29 % 128;
        int i30 = i29 % 2;
        return appSetIdAndScope1;
    }

    public static final class onExtraCallbackWithResult implements access7200<Thread, String> {
        final /* synthetic */ Sequence onExtraCallback;

        public onExtraCallbackWithResult(Sequence sequence) {
            this.onExtraCallback = sequence;
        }

        public Iterator<Thread> sourceIterator() {
            return this.onExtraCallback.IAuthTabCallback();
        }

        public String keyOf(Thread thread) {
            return thread.getName();
        }
    }

    public static final /* synthetic */ AppSetIdAndScope1 onWarmupCompleted() {
        return (AppSetIdAndScope1) onExtraCallback(C40Encoder.onExtraCallback(), -1923878110, 1923878110, new Object[0], C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    private final void asBinder() {
        onExtraCallback(C40Encoder.onExtraCallback(), 1706134776, -1706134773, new Object[]{this}, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    private final List<Pair<onNavigationEvent, onExtraCallback>> IAuthTabCallback(long j, long j2, long j3, long j4, long j5) {
        Object[] objArr = {this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5)};
        return (List) onExtraCallback(C40Encoder.onExtraCallback(), 1833209489, -1833209484, objArr, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback());
    }

    static void onTransact() {
        ICustomTabsCallback = new int[]{-1791453363, -418394316, -365537457, -1132055391, -1976770036, -1284485904, 1994596619, -1517108913, 59295831, 142360069, -1947100193, 886132724, 134243540, 194479706, -2003949358, 649846887, -390191595, -1413469314};
    }
}
