package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceCallback {

    static final class onNavigationEvent extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResourceCallback.onExtraCallbackWithResult(null, this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResourceCallback.onWarmupCompleted(null, this);
        }
    }

    public static final <T> Object onExtraCallback(@NotNull GeckoHubImp1<? extends T>[] geckoHubImp1Arr, @NotNull access13800<? super List<? extends T>> access13800Var) {
        return geckoHubImp1Arr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new RequestFutureTargetWaiter(geckoHubImp1Arr).IAuthTabCallback(access13800Var);
    }

    public static final <T> Object IAuthTabCallback(@NotNull Collection<? extends GeckoHubImp1<? extends T>> collection, @NotNull access13800<? super List<? extends T>> access13800Var) {
        return collection.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : new RequestFutureTargetWaiter((GeckoHubImp1[]) collection.toArray(new GeckoHubImp1[0])).IAuthTabCallback(access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onWarmupCompleted(@NotNull getPackageType[] getpackagetypeArr, @NotNull access13800<? super Unit> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        int i;
        getPackageType[] getpackagetypeArr2;
        int length;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object obj = onwarmupcompleted.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i3 = onwarmupcompleted.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            i = 0;
            getpackagetypeArr2 = getpackagetypeArr;
            length = getpackagetypeArr.length;
            if (i < length) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = onwarmupcompleted.I$1;
            i = onwarmupcompleted.I$0;
            getPackageType[] getpackagetypeArr3 = (getPackageType[]) onwarmupcompleted.L$0;
            ResultKt.onNavigationEvent(obj);
            getpackagetypeArr2 = getpackagetypeArr3;
            i++;
            if (i < length) {
                getPackageType getpackagetype = getpackagetypeArr2[i];
                onwarmupcompleted.L$0 = getpackagetypeArr2;
                onwarmupcompleted.I$0 = i;
                onwarmupcompleted.I$1 = length;
                onwarmupcompleted.label = 1;
                if (getpackagetype.onNavigationEvent(onwarmupcompleted) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
                i++;
                if (i < length) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onExtraCallbackWithResult(@NotNull Collection<? extends getPackageType> collection, @NotNull access13800<? super Unit> access13800Var) {
        onNavigationEvent onnavigationevent;
        Iterator it;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i = onnavigationevent.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onnavigationevent.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            it = collection.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        while (it.hasNext()) {
            getPackageType getpackagetype = (getPackageType) it.next();
            onnavigationevent.L$0 = it;
            onnavigationevent.label = 1;
            if (getpackagetype.onNavigationEvent(onnavigationevent) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        }
        return Unit.INSTANCE;
    }
}
