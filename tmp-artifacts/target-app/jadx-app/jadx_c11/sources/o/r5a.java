package o;

import android.content.Context;
import android.graphics.Bitmap;
import im.toss.securities.widget.data.model.overview.OverviewItemInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r5a {
    private static int IAuthTabCallback = 0;
    public static final r5a onExtraCallback = new r5a();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnNavigationEvent = r5a.this.onNavigationEvent(null, null, false, this);
            int i4 = onExtraCallback + 107;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 93;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 13 / 0;
        }
    }

    private r5a() {
    }

    public static /* synthetic */ Object onWarmupCompleted(r5a r5aVar, Context context, List list, boolean z, access13800 access13800Var, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 59;
            onWarmupCompleted = i6 % 128;
            z = i6 % 2 != 0;
        }
        return r5aVar.onNavigationEvent(context, list, z, access13800Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull Context context, @NotNull List<? extends OverviewItemInfo> list, boolean z, @NotNull access13800<? super r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent> access13800Var) {
        onWarmupCompleted onwarmupcompleted;
        ArrayList arrayList;
        Map map;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i4 = onwarmupcompleted.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onWarmupCompleted + 65;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                onwarmupcompleted.label = i4 - 2147483648;
                int i7 = onNavigationEvent + 11;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            } else {
                onwarmupcompleted = new onWarmupCompleted(access13800Var);
            }
        }
        Object objIAuthTabCallback = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i9 = onwarmupcompleted.label;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strIAuthTabCallbackStub = ((OverviewItemInfo) it.next()).IAuthTabCallbackStub();
                if (strIAuthTabCallbackStub != null) {
                    arrayList.add(strIAuthTabCallbackStub);
                }
            }
            r2 r2Var = r2.onNavigationEvent;
            List<? extends SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1> listListOf = CollectionsKt.listOf(new r0d(0.0f, 0, 3, null));
            onwarmupcompleted.L$0 = context;
            onwarmupcompleted.L$1 = list;
            onwarmupcompleted.L$2 = access15400.onNavigationEvent(arrayList);
            onwarmupcompleted.Z$0 = z;
            onwarmupcompleted.label = 1;
            objIAuthTabCallback = r2Var.IAuthTabCallback(context, (List<String>) arrayList, z, listListOf, (access13800<? super Map<String, Bitmap>>) onwarmupcompleted);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
            }
            return objOnWarmupCompleted;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = onNavigationEvent + 103;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
            map = (Map) onwarmupcompleted.L$3;
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            return new r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent(map, (Map) objIAuthTabCallback);
        }
        z = onwarmupcompleted.Z$0;
        ?? r12 = (List) onwarmupcompleted.L$2;
        list = (List) onwarmupcompleted.L$1;
        Context context2 = (Context) onwarmupcompleted.L$0;
        ResultKt.onNavigationEvent(objIAuthTabCallback);
        arrayList = r12;
        context = context2;
        Map map2 = (Map) objIAuthTabCallback;
        onwarmupcompleted.L$0 = access15400.onNavigationEvent(context);
        onwarmupcompleted.L$1 = access15400.onNavigationEvent(list);
        onwarmupcompleted.L$2 = access15400.onNavigationEvent(arrayList);
        onwarmupcompleted.L$3 = map2;
        onwarmupcompleted.Z$0 = z;
        onwarmupcompleted.label = 2;
        Object objOnWarmupCompleted2 = r5ExternalSyntheticLambda0.onWarmupCompleted(context, list, z, onwarmupcompleted);
        if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
            objIAuthTabCallback = objOnWarmupCompleted2;
            map = map2;
            return new r8lambdaWfEwuR7NKeTALjNrbTfBZlfUZks.onNavigationEvent(map, (Map) objIAuthTabCallback);
        }
        return objOnWarmupCompleted;
    }
}
