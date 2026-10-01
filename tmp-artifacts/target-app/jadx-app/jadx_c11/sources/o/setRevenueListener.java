package o;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setRevenueListener implements r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs {
    private static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 onExtraCallback;
    private final Context onExtraCallbackWithResult;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = setRevenueListener.IAuthTabCallback(setRevenueListener.this, null, this);
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 22 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = setRevenueListener.onExtraCallback(setRevenueListener.this, null, this);
            int i4 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }
    }

    static {
        int i = onWarmupCompleted + 5;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    @Inject
    public setRevenueListener(@NotNull Context context, @NotNull r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0, "");
        this.onExtraCallbackWithResult = context;
        this.onExtraCallback = r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0;
    }

    public static final /* synthetic */ Object IAuthTabCallback(setRevenueListener setrevenuelistener, List list, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = setrevenuelistener.onWarmupCompleted(list, access13800Var);
        int i4 = onNavigationEvent + 109;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List IAuthTabCallback(setRevenueListener setrevenuelistener, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 47;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        List<String> listOnExtraCallbackWithResult = setrevenuelistener.onExtraCallbackWithResult(str);
        int i4 = asInterface + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return listOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Object onExtraCallback(setRevenueListener setrevenuelistener, MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4, access13800 access13800Var) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = setrevenuelistener.onExtraCallbackWithResult(maxAdViewImplExternalSyntheticLambda4, access13800Var);
        int i4 = onNavigationEvent + 123;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return objOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends MaxAdViewImplExternalSyntheticLambda4>>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $regionCode;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ setRevenueListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, setRevenueListener setrevenuelistener, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$regionCode = str;
            this.this$0 = setrevenuelistener;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$regionCode, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super List<MaxAdViewImplExternalSyntheticLambda4>> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onWarmupCompleted(findresandmsg, access13800Var);
            }
            Object objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            int i3 = 0 / 0;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super List<MaxAdViewImplExternalSyntheticLambda4>> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onextracallbackCreate.invokeSuspend(unit);
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        static final /* synthetic */ class onWarmupCompleted extends FunctionReferenceImpl implements Function1<String, List<? extends String>> {
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            onWarmupCompleted(Object obj) {
                super(1, obj, setRevenueListener.class, "readAssetNames", "readAssetNames(Ljava/lang/String;)Ljava/util/List;", 0);
            }

            public /* synthetic */ Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 77;
                onNavigationEvent = i2 % 128;
                Object obj2 = null;
                String str = (String) obj;
                if (i2 % 2 != 0) {
                    onExtraCallback(str);
                    obj2.hashCode();
                    throw null;
                }
                List<String> listOnExtraCallback = onExtraCallback(str);
                int i3 = onNavigationEvent + 101;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return listOnExtraCallback;
                }
                obj2.hashCode();
                throw null;
            }

            public final List<String> onExtraCallback(String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                List<String> listIAuthTabCallback = setRevenueListener.IAuthTabCallback((setRevenueListener) ((CallableReference) this).receiver, str);
                int i4 = onNavigationEvent + 53;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 68 / 0;
                }
                return listIAuthTabCallback;
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = IAuthTabCallback + 39;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            ResultKt.onNavigationEvent(obj);
            String str = this.$regionCode;
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            List listOnExtraCallback = MaxAdViewImplExternalSyntheticLambda4.Companion.onExtraCallback(lowerCase, new onWarmupCompleted(this.this$0));
            setRevenueListener setrevenuelistener = this.this$0;
            this.L$0 = access15400.onNavigationEvent(lowerCase);
            this.L$1 = access15400.onNavigationEvent(listOnExtraCallback);
            this.label = 1;
            Object objIAuthTabCallback = setRevenueListener.IAuthTabCallback(setrevenuelistener, listOnExtraCallback, this);
            if (objIAuthTabCallback != objOnWarmupCompleted) {
                return objIAuthTabCallback;
            }
            int i5 = onWarmupCompleted + 31;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
    }

    @Override // o.r8lambda2MyWpkAcV8n5pTcBFsXGDe7xkJs
    public Object IAuthTabCallback(@NotNull String str, @NotNull access13800<? super List<MaxAdViewImplExternalSyntheticLambda4>> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onExtraCallback(str, this, null), access13800Var);
        int i2 = asInterface + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:26:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onWarmupCompleted(List<MaxAdViewImplExternalSyntheticLambda4> list, access13800<? super List<MaxAdViewImplExternalSyntheticLambda4>> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        Iterator<MaxAdViewImplExternalSyntheticLambda4> it;
        List list2;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i2 - 2147483648;
                int i3 = onNavigationEvent + 77;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        Object obj = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        if (i5 != 0) {
            int i6 = onNavigationEvent + 105;
            asInterface = i6 % 128;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4 = (MaxAdViewImplExternalSyntheticLambda4) iAuthTabCallback.L$3;
            it = (Iterator) iAuthTabCallback.L$2;
            list2 = (List) iAuthTabCallback.L$1;
            List<MaxAdViewImplExternalSyntheticLambda4> list3 = (List) iAuthTabCallback.L$0;
            ResultKt.onNavigationEvent(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(maxAdViewImplExternalSyntheticLambda4);
            }
            list = list3;
            if (it.hasNext()) {
                MaxAdViewImplExternalSyntheticLambda4 next = it.next();
                iAuthTabCallback.L$0 = access15400.onNavigationEvent(list);
                iAuthTabCallback.L$1 = list2;
                iAuthTabCallback.L$2 = it;
                iAuthTabCallback.L$3 = next;
                iAuthTabCallback.label = 1;
                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(next, iAuthTabCallback);
                if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                    int i7 = asInterface + 107;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    return objOnWarmupCompleted;
                }
                list3 = list;
                maxAdViewImplExternalSyntheticLambda4 = next;
                obj = objOnExtraCallbackWithResult;
                if (((Boolean) obj).booleanValue()) {
                }
                list = list3;
                if (it.hasNext()) {
                    return list2;
                }
            }
        } else {
            ResultKt.onNavigationEvent(obj);
            ArrayList arrayList = new ArrayList();
            it = list.iterator();
            list2 = arrayList;
            if (it.hasNext()) {
            }
        }
    }

    private final List<String> onExtraCallbackWithResult(String str) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            String[] list = this.onExtraCallbackWithResult.getAssets().list(str);
            if (list == null) {
                int i2 = onNavigationEvent + 49;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                list = new String[0];
            }
            obj = Result.constructor-impl(ArraysKt.toList(list));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            int i4 = onNavigationEvent + 69;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "builtin_bundle_asset_list_failed", th2, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "AssetBuiltInBundleRegistry"), getWrite.IAuthTabCallback("path", str)}));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.onExtraCallback(obj)) {
            obj = listEmptyList;
        }
        return (List) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda4, access13800<? super Boolean> access13800Var) {
        onNavigationEvent onnavigationevent;
        MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda42;
        Object obj;
        Throwable th;
        int i = 2 % 2;
        if (!(!(access13800Var instanceof onNavigationEvent))) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onNavigationEvent + 1;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                onnavigationevent.label = i2 - 2147483648;
                int i5 = onNavigationEvent + 17;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        onNavigationEvent onnavigationevent2 = onnavigationevent;
        Object obj2 = onnavigationevent2.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onnavigationevent2.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(obj2);
            try {
                Result.Companion companion = Result.Companion;
                r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0 r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0 = this.onExtraCallback;
                String strOnExtraCallbackWithResult = maxAdViewImplExternalSyntheticLambda4.onExtraCallbackWithResult();
                String strAsBinder = maxAdViewImplExternalSyntheticLambda4.asBinder();
                String strOnNavigationEvent = maxAdViewImplExternalSyntheticLambda4.onNavigationEvent();
                maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda4;
                try {
                    onnavigationevent2.L$0 = maxAdViewImplExternalSyntheticLambda42;
                    onnavigationevent2.L$1 = access15400.onNavigationEvent(this);
                    onnavigationevent2.I$0 = 0;
                    onnavigationevent2.label = 1;
                    if (r8lambdaysFZPJSv7EqT6Ozdvb6ZpXd9Qb0.onExtraCallback(r8lambdaysfzpjsv7eqt6ozdvb6zpxd9qb0, strOnExtraCallbackWithResult, strAsBinder, strOnNavigationEvent, null, onnavigationevent2, 8, null) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                    obj = Result.constructor-impl(access14000.onNavigationEvent(true));
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                    th = Result.exceptionOrNull-impl(obj);
                    if (th != null) {
                    }
                    if (!Result.onExtraCallback(obj)) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda4;
                Result.Companion companion22 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
                th = Result.exceptionOrNull-impl(obj);
                if (th != null) {
                }
                if (!Result.onExtraCallback(obj)) {
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = onNavigationEvent + 89;
            asInterface = i8 % 128;
            ?? r3 = i8 % 2;
            try {
                if (r3 == 0) {
                    ResultKt.onNavigationEvent(obj2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                MaxAdViewImplExternalSyntheticLambda4 maxAdViewImplExternalSyntheticLambda43 = (MaxAdViewImplExternalSyntheticLambda4) onnavigationevent2.L$0;
                ResultKt.onNavigationEvent(obj2);
                maxAdViewImplExternalSyntheticLambda42 = maxAdViewImplExternalSyntheticLambda43;
                obj = Result.constructor-impl(access14000.onNavigationEvent(true));
            } catch (Throwable th4) {
                th = th4;
                maxAdViewImplExternalSyntheticLambda42 = r3;
                Result.Companion companion222 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
                th = Result.exceptionOrNull-impl(obj);
                if (th != null) {
                }
                if (!Result.onExtraCallback(obj)) {
                }
            }
        }
        th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            int i9 = asInterface + 35;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "builtin_bundle_asset_rejected", access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", "AssetBuiltInBundleRegistry"), getWrite.IAuthTabCallback("assetName", maxAdViewImplExternalSyntheticLambda42.onWarmupCompleted()), getWrite.IAuthTabCallback("region", maxAdViewImplExternalSyntheticLambda42.asBinder()), getWrite.IAuthTabCallback("company", maxAdViewImplExternalSyntheticLambda42.onNavigationEvent()), getWrite.IAuthTabCallback("bundleName", maxAdViewImplExternalSyntheticLambda42.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("error", th.getMessage())}), (String) null, false, (String) null, 56, (Object) null);
        }
        return !Result.onExtraCallback(obj) ? access14000.onNavigationEvent(false) : obj;
    }

    static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
