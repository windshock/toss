package o;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.AUTextView;
import o.MaxFullscreenAdImplExternalSyntheticLambda5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxFullscreenAdImplExternalSyntheticLambda5 {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int ICustomTabsCallback = 1;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 1;
    private static int readTypedObject;
    private getPackageType IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final Function0<Function2<String, Map<String, ? extends Object>, Unit>> IAuthTabCallbackStub;
    private final Function0<ReactContext> IAuthTabCallbackStubProxy;
    private final Function1<Function2<? super String, ? super Map<String, ? extends Object>, Unit>, Unit> IAuthTabCallback_Parcel;
    private final Object access000;
    private final Function0<findResAndMsg> access100;
    private final Function0<Boolean> asBinder;
    private final Function0<Boolean> asInterface;
    private final access6900<onWarmupCompleted> getInterfaceDescriptor;
    private final Object onExtraCallback;
    private Method onExtraCallbackWithResult;
    private final Function1<Map<String, ? extends Object>, Unit> onNavigationEvent;
    private Object onTransact;
    private final AtomicBoolean onWarmupCompleted;

    static {
        int i = extraCallback + 119;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(function0);
            throw null;
        }
        boolean zOnWarmupCompleted = onWarmupCompleted(function0);
        int i3 = readTypedObject + 31;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(zOnWarmupCompleted);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Class[] clsArr, MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5, Method method, Object obj, String str, Map map) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(clsArr, maxFullscreenAdImplExternalSyntheticLambda5, method, obj, str, map);
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 97;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted();
        int i4 = extraCallbackWithResult + 53;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = i | i7;
        int i9 = (~(i4 | i2)) | i;
        int i10 = ~i4;
        int i11 = (~(i2 | i4 | i)) | (~(i7 | i10)) | (~((~i) | i10));
        int i12 = i4 + i + i5 + (1609234610 * i3) + (1307081305 * i6);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i4) - 1772093440) + (1576585830 * i) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i5) + ((-2101346304) * i3) + (23068672 * i6) + ((-2103967744) * i13);
        int i15 = (i4 * 273352028) + 245730370 + (i * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i5 * 273352337) + (i3 * (-770635566)) + (i6 * (-73506199)) + (i13 * (-2011693056));
        int i16 = i14 + (i15 * i15 * 1080557568);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult;
        int i3 = i2 + 83;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 3;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaxFullscreenAdImplExternalSyntheticLambda5(@NotNull String str, @NotNull Function0<? extends ReactContext> function0, @NotNull Function0<? extends findResAndMsg> function02, @NotNull Function1<? super Map<String, ? extends Object>, Unit> function1, @NotNull Function0<? extends Function2<? super String, ? super Map<String, ? extends Object>, Unit>> function03, @NotNull Function1<? super Function2<? super String, ? super Map<String, ? extends Object>, Unit>, Unit> function12, @NotNull Function0<Boolean> function04, @NotNull Function0<Boolean> function05) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function04, "");
        Intrinsics.checkNotNullParameter(function05, "");
        this.IAuthTabCallbackDefault = str;
        this.IAuthTabCallbackStubProxy = function0;
        this.access100 = function02;
        this.onNavigationEvent = function1;
        this.IAuthTabCallbackStub = function03;
        this.IAuthTabCallback_Parcel = function12;
        this.asInterface = function04;
        this.asBinder = function05;
        this.onWarmupCompleted = new AtomicBoolean(false);
        this.onExtraCallback = new Object();
        this.access000 = new Object();
        this.getInterfaceDescriptor = new access6900<>();
    }

    public static final /* synthetic */ Function0 IAuthTabCallback(MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Function0<ReactContext> function0 = maxFullscreenAdImplExternalSyntheticLambda5.IAuthTabCallbackStubProxy;
        if (i3 == 0) {
            return function0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AtomicBoolean onExtraCallback(MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 89;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        AtomicBoolean atomicBoolean = maxFullscreenAdImplExternalSyntheticLambda5.onWarmupCompleted;
        int i5 = i3 + 13;
        extraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return atomicBoolean;
        }
        throw null;
    }

    public static final /* synthetic */ boolean onNavigationEvent(MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 61;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            maxFullscreenAdImplExternalSyntheticLambda5.onTransact();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnTransact = maxFullscreenAdImplExternalSyntheticLambda5.onTransact();
        int i3 = readTypedObject + 15;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return zOnTransact;
    }

    private static final boolean onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
        int i4 = readTypedObject + 9;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = readTypedObject + 63;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        onWarmupCompleted(this, str, map, false, false, false, 24, null);
        int i4 = extraCallbackWithResult + 113;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 93;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            z = true;
            z2 = false;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            z = false;
            z2 = true;
        }
        IAuthTabCallback(str, (Object) map, z, z2, false);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 35;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        onWarmupCompleted(this, str, obj, false, false, false, 24, null);
        int i4 = readTypedObject + 5;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 35;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            z = false;
            z2 = true;
            z3 = false;
            i = 14;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            z = true;
            z2 = false;
            z3 = false;
            i = 24;
        }
        onWarmupCompleted(this, str, map, z, z2, z3, i, null);
        int i4 = extraCallbackWithResult + 97;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void onWarmupCompleted(MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5, String str, Object obj, boolean z, boolean z2, boolean z3, int i, Object obj2) {
        boolean z4;
        boolean z5;
        int i2 = 2 % 2;
        if ((i & 8) != 0) {
            int i3 = extraCallbackWithResult + 111;
            readTypedObject = i3 % 128;
            int i4 = i3 % 2;
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & 16) != 0) {
            int i5 = extraCallbackWithResult + 113;
            readTypedObject = i5 % 128;
            if (i5 % 2 != 0) {
                z5 = false;
            } else {
                z3 = true;
                z5 = z3;
            }
        } else {
            z5 = z3;
        }
        maxFullscreenAdImplExternalSyntheticLambda5.IAuthTabCallback(str, obj, z, z4, z5);
        int i6 = extraCallbackWithResult + 79;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void IAuthTabCallback(String str, Object obj, boolean z, boolean z2, boolean z3) {
        Set setKeySet;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (IAuthTabCallback(str, z2)) {
            int i4 = readTypedObject + 103;
            extraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (((ReactContext) this.IAuthTabCallbackStubProxy.invoke()).hasActiveReactInstance()) {
                if (!this.onWarmupCompleted.get()) {
                    int i6 = extraCallbackWithResult + 61;
                    readTypedObject = i6 % 128;
                    int i7 = i6 % 2;
                    if (!z3 || !onTransact()) {
                        if (z) {
                            onNavigationEvent(str, obj);
                            IAuthTabCallbackStub();
                            int i8 = extraCallbackWithResult + 81;
                            readTypedObject = i8 % 128;
                            int i9 = i8 % 2;
                            return;
                        }
                        return;
                    }
                }
                if (IAuthTabCallback(str, z2)) {
                    try {
                        Map map = obj instanceof Map ? (Map) obj : null;
                        if (map == null || (setKeySet = map.keySet()) == null || CollectionsKt.joinToString$default(setKeySet, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) == null) {
                            obj.getClass().getSimpleName();
                        }
                        this.onNavigationEvent.invoke(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("eventName", str), getWrite.IAuthTabCallback("body", obj)}));
                    } catch (Throwable unused) {
                        onNavigationEvent(482234420, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -482234416, new Object[]{this}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
                        if (z) {
                            int i10 = extraCallbackWithResult + 111;
                            readTypedObject = i10 % 128;
                            int i11 = i10 % 2;
                            onNavigationEvent(str, obj);
                        }
                        if (z3) {
                            IAuthTabCallbackStub();
                        }
                    }
                }
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5 = (MaxFullscreenAdImplExternalSyntheticLambda5) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        maxFullscreenAdImplExternalSyntheticLambda5.IAuthTabCallbackStub();
        int i4 = readTypedObject + 103;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 33;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            onNavigationEvent(482234420, iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback(), -482234416, new Object[]{this}, iOnExtraCallback2, AUTextView.onExtraCallbackWithResult.onExtraCallback());
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            onNavigationEvent(1655388706, iOnExtraCallback3, AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1655388705, new Object[]{this}, iOnExtraCallback4, AUTextView.onExtraCallbackWithResult.onExtraCallback());
            int i3 = 27 / 0;
            return;
        }
        int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        onNavigationEvent(482234420, iOnExtraCallback5, AUTextView.onExtraCallbackWithResult.onExtraCallback(), -482234416, new Object[]{this}, iOnExtraCallback6, AUTextView.onExtraCallbackWithResult.onExtraCallback());
        int iOnExtraCallback7 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback8 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        onNavigationEvent(1655388706, iOnExtraCallback7, AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1655388705, new Object[]{this}, iOnExtraCallback8, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5 = (MaxFullscreenAdImplExternalSyntheticLambda5) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 29;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        maxFullscreenAdImplExternalSyntheticLambda5.onWarmupCompleted.set(false);
        maxFullscreenAdImplExternalSyntheticLambda5.IAuthTabCallback_Parcel.invoke((Object) null);
        maxFullscreenAdImplExternalSyntheticLambda5.onTransact = null;
        maxFullscreenAdImplExternalSyntheticLambda5.onExtraCallbackWithResult = null;
        return null;
    }

    private final void IAuthTabCallbackStub() {
        findResAndMsg findresandmsg = (findResAndMsg) this.access100.invoke();
        if (findresandmsg == null) {
            return;
        }
        synchronized (this.onExtraCallback) {
            if (this.onWarmupCompleted.get()) {
                return;
            }
            getPackageType getpackagetype = this.IAuthTabCallback;
            if (getpackagetype == null || !getpackagetype.onExtraCallback()) {
                this.IAuthTabCallback = maybeUpdateAnimatable.onNavigationEvent(findresandmsg, putChannelInfo.onExtraCallback().onExtraCallback(), (setRandomHost) null, new onNavigationEvent(null), 2, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        long J$0;
        int label;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = MaxFullscreenAdImplExternalSyntheticLambda5.this.new onNavigationEvent(access13800Var);
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onExtraCallback(findresandmsg, access13800Var);
            }
            onExtraCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 13;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        
            if (o.formatMsgs.onWarmupCompleted(r7, r10) == r1) goto L32;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0092 -> B:33:0x0095). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long jCoerceAtMost;
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                jCoerceAtMost = 16;
            } else if (i3 == 1) {
                long j = this.J$0;
                ResultKt.onNavigationEvent(obj);
                jCoerceAtMost = RangesKt.coerceAtMost(j << 1, 500L);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = onExtraCallbackWithResult + 37;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                jCoerceAtMost = this.J$0;
                ResultKt.onNavigationEvent(obj);
                jCoerceAtMost = RangesKt.coerceAtMost(jCoerceAtMost << 1, 500L);
            }
            while (!MaxFullscreenAdImplExternalSyntheticLambda5.onExtraCallback(MaxFullscreenAdImplExternalSyntheticLambda5.this).get() && MaxFullscreenAdImplExternalSyntheticLambda5.IAuthTabCallback(MaxFullscreenAdImplExternalSyntheticLambda5.this, "__tossEventEmitterReadyProbe", false, 2, (Object) null)) {
                if (!((ReactContext) MaxFullscreenAdImplExternalSyntheticLambda5.IAuthTabCallback(MaxFullscreenAdImplExternalSyntheticLambda5.this).invoke()).hasActiveReactInstance()) {
                    this.J$0 = jCoerceAtMost;
                    this.label = 1;
                    if (formatMsgs.onWarmupCompleted(jCoerceAtMost, this) != objOnWarmupCompleted) {
                        jCoerceAtMost = RangesKt.coerceAtMost(jCoerceAtMost << 1, 500L);
                    }
                } else {
                    if (MaxFullscreenAdImplExternalSyntheticLambda5.onNavigationEvent(MaxFullscreenAdImplExternalSyntheticLambda5.this)) {
                        return Unit.INSTANCE;
                    }
                    this.J$0 = jCoerceAtMost;
                    this.label = 2;
                }
                return objOnWarmupCompleted;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((r0 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (IAuthTabCallback(r7, "__tossEventEmitterReadyProbe", false, 2, (java.lang.Object) null) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        r0 = o.MaxFullscreenAdImplExternalSyntheticLambda5.readTypedObject + 85;
        o.MaxFullscreenAdImplExternalSyntheticLambda5.extraCallbackWithResult = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (onNavigationEvent() == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        r0 = o.MaxFullscreenAdImplExternalSyntheticLambda5.extraCallbackWithResult + 85;
        o.MaxFullscreenAdImplExternalSyntheticLambda5.readTypedObject = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r7.onNavigationEvent.invoke(o.access8100.onWarmupCompleted(new kotlin.Pair[]{o.getWrite.IAuthTabCallback("eventName", "__tossEventEmitterReadyProbe"), o.getWrite.IAuthTabCallback("body", o.access8100.onNavigationEvent())}));
        r7.onWarmupCompleted.set(true);
        asInterface();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r7.onWarmupCompleted.get() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r7.onWarmupCompleted.get() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r0 = o.MaxFullscreenAdImplExternalSyntheticLambda5.extraCallbackWithResult + 57;
        o.MaxFullscreenAdImplExternalSyntheticLambda5.readTypedObject = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean onTransact() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 19;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
    }

    private final void onNavigationEvent(String str, Object obj) {
        synchronized (this.access000) {
            if (this.getInterfaceDescriptor.size() >= 3) {
                this.getInterfaceDescriptor.removeFirst();
            }
            this.getInterfaceDescriptor.addLast(new onWarmupCompleted(str, obj));
            this.getInterfaceDescriptor.size();
        }
    }

    private final void asInterface() {
        List listBuild;
        Object obj;
        synchronized (this.access000) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            while (!this.getInterfaceDescriptor.isEmpty()) {
                listCreateListBuilder.add(this.getInterfaceDescriptor.removeFirst());
            }
            listBuild = CollectionsKt.build(listCreateListBuilder);
        }
        List list = listBuild;
        int i = 0;
        for (Object obj2 : list) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj2;
            if (!this.onWarmupCompleted.get()) {
                onNavigationEvent(1193403828, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1193403828, new Object[]{this, CollectionsKt.drop(list, i)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
                return;
            }
            if (!IAuthTabCallback(this, onwarmupcompleted.onExtraCallbackWithResult(), false, 2, (Object) null)) {
                onNavigationEvent(1655388706, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1655388705, new Object[]{this}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
                return;
            }
            try {
                Result.Companion companion = Result.Companion;
                onwarmupcompleted.onExtraCallbackWithResult();
                listBuild.size();
                this.onNavigationEvent.invoke(access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("eventName", onwarmupcompleted.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("body", onwarmupcompleted.onExtraCallback())}));
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.exceptionOrNull-impl(obj) != null) {
                onwarmupcompleted.onExtraCallbackWithResult();
                onNavigationEvent(482234420, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -482234416, new Object[]{this}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
                onNavigationEvent(1193403828, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1193403828, new Object[]{this, CollectionsKt.drop(list, i)}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
                IAuthTabCallbackStub();
                return;
            }
            i++;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5 = (MaxFullscreenAdImplExternalSyntheticLambda5) objArr[0];
        List list = (List) objArr[1];
        synchronized (maxFullscreenAdImplExternalSyntheticLambda5.access000) {
            for (onWarmupCompleted onwarmupcompleted : CollectionsKt.asReversed(list)) {
                if (maxFullscreenAdImplExternalSyntheticLambda5.getInterfaceDescriptor.size() >= 3) {
                    maxFullscreenAdImplExternalSyntheticLambda5.getInterfaceDescriptor.removeLast();
                }
                maxFullscreenAdImplExternalSyntheticLambda5.getInterfaceDescriptor.addFirst(onwarmupcompleted);
            }
            Unit unit = Unit.INSTANCE;
        }
        return null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5 = (MaxFullscreenAdImplExternalSyntheticLambda5) objArr[0];
        synchronized (maxFullscreenAdImplExternalSyntheticLambda5.access000) {
            maxFullscreenAdImplExternalSyntheticLambda5.getInterfaceDescriptor.clear();
            Unit unit = Unit.INSTANCE;
        }
        return null;
    }

    private final boolean onNavigationEvent() {
        if (!((Boolean) this.asInterface.invoke()).booleanValue()) {
            onNavigationEvent(482234420, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -482234416, new Object[]{this}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
            return false;
        }
        if (this.IAuthTabCallbackStub.invoke() != null) {
            return true;
        }
        synchronized (this.onExtraCallback) {
            if (!((Boolean) this.asInterface.invoke()).booleanValue()) {
                onNavigationEvent(482234420, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), -482234416, new Object[]{this}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
                return false;
            }
            if (this.IAuthTabCallbackStub.invoke() != null) {
                return true;
            }
            ReactContext reactContext = (ReactContext) this.IAuthTabCallbackStubProxy.invoke();
            final Object nativeModule = this.onTransact;
            if (nativeModule == null && (nativeModule = reactContext.getNativeModule("BrickModule")) == null) {
                return false;
            }
            final Method method = this.onExtraCallbackWithResult;
            if (method == null) {
                Method[] methods = nativeModule.getClass().getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "");
                int length = methods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        method = null;
                        break;
                    }
                    Method method2 = methods[i];
                    if (Intrinsics.areEqual(method2.getName(), "emitEventForModule")) {
                        method = method2;
                        break;
                    }
                    i++;
                }
                if (method == null) {
                    nativeModule.getClass().getName();
                    return false;
                }
            }
            final Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length != 2 && parameterTypes.length != 3) {
                int length2 = parameterTypes.length;
                return false;
            }
            this.onTransact = nativeModule;
            this.onExtraCallbackWithResult = method;
            this.IAuthTabCallback_Parcel.invoke(new Function2() { // from class: im.toss.rn.toss.core.TossEventEmitter$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 55;
                    onExtraCallback = i3 % 128;
                    if (i3 % 2 == 0) {
                        return MaxFullscreenAdImplExternalSyntheticLambda5.IAuthTabCallback(parameterTypes, this, method, nativeModule, (String) obj, (Map) obj2);
                    }
                    MaxFullscreenAdImplExternalSyntheticLambda5.IAuthTabCallback(parameterTypes, this, method, nativeModule, (String) obj, (Map) obj2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            int length3 = parameterTypes.length;
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onNavigationEvent(Class[] clsArr, MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5, Method method, Object obj, String str, Map map) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object[] objArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Class cls = clsArr[clsArr.length - 1];
        Intrinsics.checkNotNullExpressionValue(cls, "");
        Object objOnExtraCallbackWithResult = maxFullscreenAdImplExternalSyntheticLambda5.onExtraCallbackWithResult((Class<?>) cls, (Map<String, ? extends Object>) map);
        if (clsArr.length == 3) {
            int i2 = readTypedObject + 33;
            extraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            objArr = new Object[]{maxFullscreenAdImplExternalSyntheticLambda5.IAuthTabCallbackDefault, str, objOnExtraCallbackWithResult};
        } else {
            objArr = new Object[]{str, objOnExtraCallbackWithResult};
        }
        method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 51;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static /* synthetic */ boolean IAuthTabCallback(MaxFullscreenAdImplExternalSyntheticLambda5 maxFullscreenAdImplExternalSyntheticLambda5, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = extraCallbackWithResult + 111;
        int i4 = i3 % 128;
        readTypedObject = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 67;
            extraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        return maxFullscreenAdImplExternalSyntheticLambda5.IAuthTabCallback(str, z);
    }

    private final boolean IAuthTabCallback(String str, boolean z) {
        int i = 2 % 2;
        int i2 = readTypedObject + 39;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (((Boolean) this.asInterface.invoke()).booleanValue() || (z && ((Boolean) this.asBinder.invoke()).booleanValue())) {
            return true;
        }
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        onNavigationEvent(482234420, iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback(), -482234416, new Object[]{this}, iOnExtraCallback2, AUTextView.onExtraCallbackWithResult.onExtraCallback());
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        onNavigationEvent(1655388706, iOnExtraCallback3, AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1655388705, new Object[]{this}, iOnExtraCallback4, AUTextView.onExtraCallbackWithResult.onExtraCallback());
        int i4 = readTypedObject + 61;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (com.facebook.react.bridge.WritableMap.class.isAssignableFrom(r5) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(Class<?> cls, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = readTypedObject + 27;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (!Map.class.isAssignableFrom(cls)) {
                int i3 = readTypedObject + 5;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (!ReadableMap.class.isAssignableFrom(cls)) {
                    int i5 = readTypedObject + 49;
                    extraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0) {
                        WritableMap.class.isAssignableFrom(cls);
                        obj.hashCode();
                        throw null;
                    }
                }
                Object objIAuthTabCallback = RoleCompanion.onExtraCallback.IAuthTabCallback(map);
                int i6 = extraCallbackWithResult + 33;
                readTypedObject = i6 % 128;
                if (i6 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                throw null;
            }
            return map;
        }
        Map.class.isAssignableFrom(cls);
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final Object onExtraCallback;
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback + 39;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i4 = IAuthTabCallback + 111;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, ((onWarmupCompleted) obj).onExtraCallbackWithResult)) {
                int i6 = IAuthTabCallback + 113;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!(!Intrinsics.areEqual(this.onExtraCallback, r6.onExtraCallback))) {
                return true;
            }
            int i7 = IAuthTabCallback + 125;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.onExtraCallbackWithResult.hashCode() * 31) + this.onExtraCallback.hashCode();
            int i4 = IAuthTabCallback + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "PendingEvent(eventName=" + this.onExtraCallbackWithResult + ", body=" + this.onExtraCallback + ")";
            int i2 = onWarmupCompleted + 89;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onWarmupCompleted(@NotNull String str, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(obj, "");
            this.onExtraCallbackWithResult = str;
            this.onExtraCallback = obj;
        }

        public final Object onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 123;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.onExtraCallbackWithResult;
            int i4 = i3 + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
    }

    public static /* synthetic */ boolean onExtraCallback(Function0 function0) {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        return ((Boolean) onNavigationEvent(1020521611, iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1020521608, new Object[]{function0}, iOnExtraCallback2, AUTextView.onExtraCallbackWithResult.onExtraCallback())).booleanValue();
    }

    private final void asBinder() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        onNavigationEvent(1655388706, iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1655388705, new Object[]{this}, iOnExtraCallback2, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    private final void onExtraCallback(List<onWarmupCompleted> list) {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        onNavigationEvent(1193403828, iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback(), -1193403828, new Object[]{this, list}, iOnExtraCallback2, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    private final void IAuthTabCallbackDefault() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        onNavigationEvent(482234420, iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback(), -482234416, new Object[]{this}, iOnExtraCallback2, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }

    public final void onExtraCallbackWithResult() {
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        onNavigationEvent(-1578547521, iOnExtraCallback, AUTextView.onExtraCallbackWithResult.onExtraCallback(), 1578547523, new Object[]{this}, iOnExtraCallback2, AUTextView.onExtraCallbackWithResult.onExtraCallback());
    }
}
