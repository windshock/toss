package im.toss.ads_sdk;

import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ResourceCallback;
import o.access13800;
import o.access14300;
import o.access15400;
import o.access8100;
import o.findResAndMsg;
import o.getWrite;
import o.maybeUpdateAnimatable;
import o.setRandomHost;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class NativeAdsManager$extraCommand extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Map<String, ? extends NativeAdsDto>>, Object> {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    final /* synthetic */ List<String> $slotIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NativeAdsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeAdsManager$extraCommand(List<String> list, NativeAdsManager nativeAdsManager, access13800<? super NativeAdsManager$extraCommand> access13800Var) {
        super(2, access13800Var);
        this.$slotIds = list;
        this.this$0 = nativeAdsManager;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i2 = 2 % 2;
        NativeAdsManager$extraCommand nativeAdsManager$extraCommand = new NativeAdsManager$extraCommand(this.$slotIds, this.this$0, access13800Var);
        nativeAdsManager$extraCommand.L$0 = obj;
        int i3 = onExtraCallbackWithResult + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return nativeAdsManager$extraCommand;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        onExtraCallbackWithResult = i3 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Map<String, NativeAdsDto>> access13800Var = (access13800) obj2;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
        int i4 = onExtraCallbackWithResult + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Map<String, NativeAdsDto>> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i5 = onExtraCallbackWithResult + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Pair<? extends String, ? extends NativeAdsDto>>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ String $id;
        Object L$0;
        int label;
        final /* synthetic */ NativeAdsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, NativeAdsManager nativeAdsManager, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$id = str;
            this.this$0 = nativeAdsManager;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i2 = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$id, this.this$0, access13800Var);
            int i3 = onExtraCallbackWithResult + 111;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                return onextracallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i5 = onExtraCallbackWithResult + 83;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Pair<String, NativeAdsDto>> access13800Var) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 57;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i4 != 0) {
                int i5 = 96 / 0;
            }
            int i6 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                String str2 = this.$id;
                NativeAdsManager nativeAdsManager = this.this$0;
                this.L$0 = str2;
                this.label = 1;
                Object objOnExtraCallbackWithResult = NativeAdsManager.onExtraCallbackWithResult(nativeAdsManager, str2, (GetNativeAdsRequestBody.AdRequestOption) null, false, this, 6, (Object) null);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    int i5 = onWarmupCompleted + 125;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
                str = str2;
                obj = objOnExtraCallbackWithResult;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                str = (String) this.L$0;
                ResultKt.onNavigationEvent(obj);
            }
            return getWrite.IAuthTabCallback(str, obj);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i2 = 2 % 2;
        findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 != 0) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 81;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = i4 + 99;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            ResultKt.onNavigationEvent(obj);
        } else {
            ResultKt.onNavigationEvent(obj);
            List<String> list = this.$slotIds;
            NativeAdsManager nativeAdsManager = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback((String) it.next(), nativeAdsManager, null), 3, (Object) null));
            }
            this.L$0 = access15400.onNavigationEvent(findresandmsg);
            this.label = 1;
            obj = ResourceCallback.IAuthTabCallback(arrayList, this);
            if (obj == objOnWarmupCompleted) {
                int i9 = onExtraCallbackWithResult + 39;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 50 / 0;
                }
                return objOnWarmupCompleted;
            }
        }
        return access8100.onExtraCallbackWithResult((Iterable) obj);
    }
}
