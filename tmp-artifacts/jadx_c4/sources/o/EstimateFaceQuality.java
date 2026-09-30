package o;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.EstimateFaceQuality;
import o.RetrofitInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class EstimateFaceQuality implements getRetrofit {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static int onTransact;
    public static final EstimateFaceQuality onWarmupCompleted = new EstimateFaceQuality();
    private static final AppSetIdAndScope1 onExtraCallback = ea10.onExtraCallbackWithResult("LogStoreRegistry");
    private static final ConcurrentHashMap<String, RetrofitInstance> IAuthTabCallback = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Function0<RetrofitInstance>> onNavigationEvent = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Integer> onExtraCallbackWithResult = new ConcurrentHashMap<>();

    public static /* synthetic */ RetrofitInstance onExtraCallback(Function0 function0, String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        RetrofitInstance retrofitInstanceOnWarmupCompleted = onWarmupCompleted(function0, str, str2);
        int i4 = onTransact + 23;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return retrofitInstanceOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ RetrofitInstance onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(function1, obj);
            throw null;
        }
        RetrofitInstance retrofitInstanceOnWarmupCompleted = onWarmupCompleted(function1, obj);
        int i3 = onTransact + 29;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return retrofitInstanceOnWarmupCompleted;
    }

    private EstimateFaceQuality() {
    }

    static {
        int i = asBinder + 19;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public final void onExtraCallback(@NotNull String str, @Nullable String str2, @NotNull Function0<? extends RetrofitInstance> function0, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.areEqual(str, "quarantine");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (Intrinsics.areEqual(str, "quarantine")) {
            throw new IllegalArgumentException("storeId 'quarantine' is reserved for log quarantine");
        }
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        onNavigationEvent.put(strOnExtraCallbackWithResult, function0);
        if (num != null) {
            int i3 = onTransact + 55;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult.put(strOnExtraCallbackWithResult, num);
            } else {
                onExtraCallbackWithResult.put(strOnExtraCallbackWithResult, num);
                obj.hashCode();
                throw null;
            }
        }
    }

    public final void IAuthTabCallback(@NotNull Map<String, ComputeDistances> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.entrySet().iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        Iterator<Map.Entry<String, ComputeDistances>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            int i3 = onTransact + 47;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            ComputeDistances value = it.next().getValue();
            onWarmupCompleted.onExtraCallback(value.onExtraCallback(), value.IAuthTabCallback(), value.onWarmupCompleted(), value.onExtraCallbackWithResult());
        }
        map.size();
    }

    private static final RetrofitInstance onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        RetrofitInstance retrofitInstance = (RetrofitInstance) function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return retrofitInstance;
    }

    private static final RetrofitInstance onWarmupCompleted(Function0 function0, String str, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        RetrofitInstance retrofitInstance = (RetrofitInstance) function0.invoke();
        onNavigationEvent.remove(str);
        int i2 = onTransact + 1;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return retrofitInstance;
        }
        throw null;
    }

    public final RetrofitInstance onExtraCallback(@NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            final String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
            ConcurrentHashMap<String, RetrofitInstance> concurrentHashMap = IAuthTabCallback;
            RetrofitInstance retrofitInstance = concurrentHashMap.get(strOnExtraCallbackWithResult);
            if (retrofitInstance != null) {
                return retrofitInstance;
            }
            final Function0<RetrofitInstance> function0 = onNavigationEvent.get(strOnExtraCallbackWithResult);
            if (function0 != null) {
                final Function1 function1 = new Function1() { // from class: im.toss.core.tracker.api.LogStoreRegistry$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2) {
                        RetrofitInstance retrofitInstanceOnExtraCallback;
                        int i3 = 2 % 2;
                        int i4 = onWarmupCompleted + 9;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 != 0) {
                            retrofitInstanceOnExtraCallback = EstimateFaceQuality.onExtraCallback(function0, strOnExtraCallbackWithResult, (String) obj2);
                            int i5 = 36 / 0;
                        } else {
                            retrofitInstanceOnExtraCallback = EstimateFaceQuality.onExtraCallback(function0, strOnExtraCallbackWithResult, (String) obj2);
                        }
                        int i6 = onExtraCallbackWithResult + 75;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            return retrofitInstanceOnExtraCallback;
                        }
                        throw null;
                    }
                };
                RetrofitInstance retrofitInstanceComputeIfAbsent = concurrentHashMap.computeIfAbsent(strOnExtraCallbackWithResult, new Function() { // from class: im.toss.core.tracker.api.LogStoreRegistry$$ExternalSyntheticLambda1
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 113;
                        onWarmupCompleted = i4 % 128;
                        if (i4 % 2 != 0) {
                            EstimateFaceQuality.onNavigationEvent(function1, obj2);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        RetrofitInstance retrofitInstanceOnNavigationEvent = EstimateFaceQuality.onNavigationEvent(function1, obj2);
                        int i5 = onNavigationEvent + 73;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        return retrofitInstanceOnNavigationEvent;
                    }
                });
                int i3 = onTransact + 59;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                return retrofitInstanceComputeIfAbsent;
            }
            if (str2 == null) {
                return null;
            }
            int i5 = IAuthTabCallbackDefault + 37;
            onTransact = i5 % 128;
            if (i5 % 2 == 0) {
                return onExtraCallback(str, null);
            }
            onExtraCallback(str, null);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        IAuthTabCallback.get(onExtraCallbackWithResult(str, str2));
        obj.hashCode();
        throw null;
    }

    @Override // o.getRetrofit
    public boolean onWarmupCompleted(@NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2);
        ConcurrentHashMap<String, RetrofitInstance> concurrentHashMap = IAuthTabCallback;
        if (!concurrentHashMap.containsKey(strOnExtraCallbackWithResult)) {
            ConcurrentHashMap<String, Function0<RetrofitInstance>> concurrentHashMap2 = onNavigationEvent;
            if (!concurrentHashMap2.containsKey(strOnExtraCallbackWithResult)) {
                int i2 = onTransact;
                int i3 = i2 + 89;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                if (str2 == null) {
                    return false;
                }
                int i5 = i2 + 3;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    concurrentHashMap.containsKey(str);
                    throw null;
                }
                if (concurrentHashMap.containsKey(str) || concurrentHashMap2.containsKey(str)) {
                    return true;
                }
                int i6 = IAuthTabCallbackDefault + 81;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        return true;
    }

    @Override // o.getRetrofit
    public Integer onNavigationEvent(@NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult.get(onExtraCallbackWithResult(str, str2));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Integer num = onExtraCallbackWithResult.get(onExtraCallbackWithResult(str, str2));
        int i3 = IAuthTabCallbackDefault + 45;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return num;
    }

    private final String onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (str2 == null) {
            return str;
        }
        String str3 = str + ":" + str2;
        int i3 = onTransact + 65;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return str3;
    }
}
