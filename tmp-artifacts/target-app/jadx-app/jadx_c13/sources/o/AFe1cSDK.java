package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import o.getAdvertisingId;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class AFe1cSDK {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public interface IAuthTabCallback {
        AFe1cSDK AppCompatActivity();
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            AFe1cSDK aFe1cSDK = AFe1cSDK.this;
            if (i3 != 0) {
                AFe1cSDK.onExtraCallback(aFe1cSDK, this);
                throw null;
            }
            Object objOnExtraCallback = AFe1cSDK.onExtraCallback(aFe1cSDK, this);
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 20 / 0;
            }
            return objOnExtraCallback;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = AFe1cSDK.this.IAuthTabCallback(false, (access13800<? super Unit>) this);
            int i4 = onNavigationEvent + 99;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }
    }

    static {
        int i = onNavigationEvent + 87;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public abstract <T> Object IAuthTabCallback(@NotNull String str, @NotNull Class<T> cls, T t, @NotNull access13800<? super T> access13800Var);

    protected Object IAuthTabCallback(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback(this, access13800Var);
        int i4 = onWarmupCompleted + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public abstract <T> Object onExtraCallback(@NotNull getAdvertisingId getadvertisingid, @NotNull Class<T> cls, T t, @NotNull access13800<? super T> access13800Var);

    public abstract Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var);

    protected abstract Object onNavigationEvent(boolean z, @NotNull access13800<? super Unit> access13800Var);

    public abstract Object onWarmupCompleted(@NotNull access13800<? super JsonObject> access13800Var);

    public abstract Object onWarmupCompleted(@NotNull getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr, @NotNull access13800<? super Map<String, String>> access13800Var);

    public abstract List<Pair<String, String>> onWarmupCompleted();

    public static final /* synthetic */ Object onExtraCallback(AFe1cSDK aFe1cSDK, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = aFe1cSDK.onNavigationEvent(access13800Var);
        int i4 = onWarmupCompleted + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnNavigationEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (IAuthTabCallback(r1) != r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(boolean z, @NotNull access13800<? super Unit> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z2 = access13800Var instanceof onWarmupCompleted;
            throw null;
        }
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i3 = onwarmupcompleted.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i3 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i4 = onwarmupcompleted.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            onwarmupcompleted.Z$0 = z;
            onwarmupcompleted.label = 1;
            if (onNavigationEvent(z, onwarmupcompleted) != objOnExtraCallback) {
            }
            return objOnExtraCallback;
        }
        int i5 = IAuthTabCallback + 81;
        int i6 = i5 % 128;
        onWarmupCompleted = i6;
        int i7 = i5 % 2;
        if (i4 != 1) {
            int i8 = i6 + 59;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            z = onwarmupcompleted.Z$0;
            ResultKt.onNavigationEvent(obj);
            onwarmupcompleted.Z$0 = z;
            onwarmupcompleted.label = 3;
        } else {
            z = onwarmupcompleted.Z$0;
            ResultKt.onNavigationEvent(obj);
            int i10 = IAuthTabCallback + 29;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        }
        onwarmupcompleted.Z$0 = z;
        onwarmupcompleted.label = 2;
        if (onNavigationEvent(onwarmupcompleted) != objOnExtraCallback) {
            onwarmupcompleted.Z$0 = z;
            onwarmupcompleted.label = 3;
        }
        return objOnExtraCallback;
    }

    static /* synthetic */ Object IAuthTabCallback(AFe1cSDK aFe1cSDK, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(access13800<? super Unit> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        List<AFe1fSDK<?>> list;
        Unit unit;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i2 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i3 = onextracallbackwithresult.label;
        try {
        } catch (WebResourceResponseModel e) {
            Result.Companion companion = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion2 = Result.Companion;
            Result.m31constructorimpl(ResultKt.createFailure(e3));
        }
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            Result.Companion companion3 = Result.Companion;
            List<AFe1fSDK<?>> listOnWarmupCompleted = AFe1jSDK.onExtraCallback.onWarmupCompleted();
            if (listOnWarmupCompleted.isEmpty()) {
                int i4 = IAuthTabCallback + 1;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    Unit unit2 = Unit.INSTANCE;
                    throw null;
                }
                unit = Unit.INSTANCE;
                Result.m31constructorimpl(unit);
                return Unit.INSTANCE;
            }
            List<AFe1fSDK<?>> list2 = listOnWarmupCompleted;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            int i5 = IAuthTabCallback + 35;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                arrayList.add(((AFe1fSDK) it.next()).IAuthTabCallback());
            }
            getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult[] onextracallbackwithresultArr = (getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult[]) arrayList.toArray(new getAdvertisingId.IAuthTabCallback.onExtraCallbackWithResult[0]);
            getAdvertisingId.IAuthTabCallback[] iAuthTabCallbackArr = (getAdvertisingId.IAuthTabCallback[]) Arrays.copyOf(onextracallbackwithresultArr, onextracallbackwithresultArr.length);
            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(onextracallbackwithresult);
            onextracallbackwithresult.L$1 = listOnWarmupCompleted;
            onextracallbackwithresult.L$2 = access15400.onNavigationEvent(onextracallbackwithresultArr);
            onextracallbackwithresult.I$0 = 0;
            onextracallbackwithresult.I$1 = 0;
            onextracallbackwithresult.label = 1;
            Object objOnWarmupCompleted = onWarmupCompleted(iAuthTabCallbackArr, onextracallbackwithresult);
            if (objOnWarmupCompleted == objOnExtraCallback) {
                int i7 = IAuthTabCallback + 77;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return objOnExtraCallback;
            }
            int i9 = IAuthTabCallback + 111;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            list = listOnWarmupCompleted;
            obj = objOnWarmupCompleted;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i11 = onWarmupCompleted + 119;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                ResultKt.onNavigationEvent(obj);
                throw null;
            }
            list = (List) onextracallbackwithresult.L$1;
            ResultKt.onNavigationEvent(obj);
        }
        Map map = (Map) obj;
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            AFe1fSDK aFe1fSDK = (AFe1fSDK) it2.next();
            aFe1fSDK.onWarmupCompleted((String) map.get(aFe1fSDK.IAuthTabCallback().getKey()));
        }
        unit = Unit.INSTANCE;
        Result.m31constructorimpl(unit);
        return Unit.INSTANCE;
    }
}
