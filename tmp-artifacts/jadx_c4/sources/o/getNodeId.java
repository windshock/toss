package o;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import im.toss.features.search.data.model.toseek.ToseekAutoCompleteLogRequestDto;
import im.toss.features.search.data.model.toseek.ToseekLogRequestDto;
import im.toss.network.model.BaseApiResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import o.appConfigIsEnable;
import o.getParamsMap;
import o.onStopJob;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getNodeId implements getParamsMap {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final Context IAuthTabCallback;
    private final setAvailableExpiredTime onWarmupCompleted;

    @Inject
    public getNodeId(@NotNull Context context, @NotNull setAvailableExpiredTime setavailableexpiredtime) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(setavailableexpiredtime, "");
        this.IAuthTabCallback = context;
        this.onWarmupCompleted = setavailableexpiredtime;
    }

    public static final /* synthetic */ ToseekAutoCompleteLogRequestDto.ExposedKeyword IAuthTabCallback(getNodeId getnodeid, getParamsMap.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ToseekAutoCompleteLogRequestDto.ExposedKeyword exposedKeywordOnNavigationEvent = getnodeid.onNavigationEvent(iAuthTabCallback);
        int i4 = onNavigationEvent + 81;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return exposedKeywordOnNavigationEvent;
    }

    public static final /* synthetic */ ToseekLogRequestDto.Result onExtraCallback(getNodeId getnodeid, getParamsMap.onExtraCallback onextracallback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        ToseekLogRequestDto.Result resultOnExtraCallbackWithResult = getnodeid.onExtraCallbackWithResult(onextracallback);
        int i4 = onExtraCallbackWithResult + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return resultOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ setAvailableExpiredTime onNavigationEvent(getNodeId getnodeid) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        setAvailableExpiredTime setavailableexpiredtime = getnodeid.onWarmupCompleted;
        int i5 = i3 + 91;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return setavailableexpiredtime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Date date) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(date, "");
        AppCompatActivity appCompatActivity = this.IAuthTabCallback;
        Intrinsics.checkNotNull(appCompatActivity, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(appCompatActivity), (CoroutineContext) null, (setRandomHost) null, new onNavigationEvent(str, str2, str3, date, null), 3, (Object) null);
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Date $clickedAt;
        final /* synthetic */ String $executionId;
        final /* synthetic */ String $query;
        final /* synthetic */ String $selectQuery;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(String str, String str2, String str3, Date date, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$executionId = str;
            this.$query = str2;
            this.$selectQuery = str3;
            this.$clickedAt = date;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = getNodeId.this.new onNavigationEvent(this.$executionId, this.$query, this.$selectQuery, this.$clickedAt, access13800Var);
            int i2 = onWarmupCompleted + 117;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onnavigationevent;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 73;
            onExtraCallbackWithResult = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 21;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 19 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
                if (i4 != 0) {
                    int i5 = onWarmupCompleted + 85;
                    onExtraCallbackWithResult = i5 % 128;
                    if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                } else {
                    ResultKt.onNavigationEvent(obj);
                    getNodeId getnodeid = getNodeId.this;
                    String str = this.$executionId;
                    String str2 = this.$query;
                    String str3 = this.$selectQuery;
                    Date date = this.$clickedAt;
                    Result.Companion companion = kotlin.Result.Companion;
                    setAvailableExpiredTime setavailableexpiredtimeOnNavigationEvent = getNodeId.onNavigationEvent(getnodeid);
                    String str4 = CommonModule_closeView.onWarmupCompleted.IAuthTabCallbackDefault().format(date);
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                    getConfigUnits getconfigunits = new getConfigUnits(str, str2, str3, str4);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = setavailableexpiredtimeOnNavigationEvent.onExtraCallbackWithResult(getconfigunits, this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                kotlin.Result.constructor-impl(obj);
                int i6 = onExtraCallbackWithResult + 77;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            } catch (WebResourceResponseModel e) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(e));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Exception e3) {
                Result.Companion companion3 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
            }
            return Unit.INSTANCE;
        }
    }

    public void IAuthTabCallback(@NotNull String str, @NotNull appConfigIsEnable appconfigisenable, @NotNull String str2, long j, @NotNull List<Long> list, @NotNull Date date) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appconfigisenable, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(date, "");
        AppCompatActivity appCompatActivity = this.IAuthTabCallback;
        Intrinsics.checkNotNull(appCompatActivity, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(appCompatActivity), (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(str, str2, j, list, date, appconfigisenable, this, null), 3, (Object) null);
        int i2 = onExtraCallbackWithResult + 29;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Date $clickedAt;
        final /* synthetic */ String $executionId;
        final /* synthetic */ long $id;
        final /* synthetic */ List<Long> $ids;
        final /* synthetic */ String $query;
        final /* synthetic */ appConfigIsEnable $type;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ getNodeId this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, String str2, long j, List<Long> list, Date date, appConfigIsEnable appconfigisenable, getNodeId getnodeid, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$executionId = str;
            this.$query = str2;
            this.$id = j;
            this.$ids = list;
            this.$clickedAt = date;
            this.$type = appconfigisenable;
            this.this$0 = getnodeid;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$executionId, this.$query, this.$id, this.$ids, this.$clickedAt, this.$type, this.this$0, access13800Var);
            int i2 = IAuthTabCallback + 95;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 68 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 88 / 0;
            } else {
                objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 25;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 26 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
        
            if (r3 != r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
        
            if (r3 != r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0125, code lost:
        
            if (r3 == r0) goto L50;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            BaseApiResponse baseApiResponse;
            Object objIAuthTabCallback;
            Object objIAuthTabCallback2;
            Object objOnNavigationEvent;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    String str = this.$executionId;
                    String str2 = this.$query;
                    long j = this.$id;
                    List<Long> list = this.$ids;
                    Date date = this.$clickedAt;
                    appConfigIsEnable.onNavigationEvent onnavigationevent = this.$type;
                    getNodeId getnodeid = this.this$0;
                    Result.Companion companion = kotlin.Result.Companion;
                    String str3 = CommonModule_closeView.onWarmupCompleted.IAuthTabCallbackDefault().format(date);
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    getAvailableExpiredTime getavailableexpiredtime = new getAvailableExpiredTime(str, str2, j, list, str3);
                    if (!(onnavigationevent instanceof appConfigIsEnable.onExtraCallbackWithResult)) {
                        if (!(onnavigationevent instanceof appConfigIsEnable.onNavigationEvent)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i3 = IAuthTabCallback + 119;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 != 0) {
                            Intrinsics.areEqual(onnavigationevent.asBinder(), onStopJob.onExtraCallback.onNavigationEvent.onNavigationEvent);
                            obj2.hashCode();
                            throw null;
                        }
                        onStopJob.onExtraCallback onextracallbackAsBinder = onnavigationevent.asBinder();
                        if (Intrinsics.areEqual(onextracallbackAsBinder, onStopJob.onExtraCallback.onNavigationEvent.onNavigationEvent)) {
                            setAvailableExpiredTime setavailableexpiredtimeOnNavigationEvent = getNodeId.onNavigationEvent(getnodeid);
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(getavailableexpiredtime);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.label = 1;
                            objOnNavigationEvent = setavailableexpiredtimeOnNavigationEvent.onNavigationEvent(getavailableexpiredtime, this);
                        } else if (Intrinsics.areEqual(onextracallbackAsBinder, onStopJob.onExtraCallback.onExtraCallback.onNavigationEvent)) {
                            setAvailableExpiredTime setavailableexpiredtimeOnNavigationEvent2 = getNodeId.onNavigationEvent(getnodeid);
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(getavailableexpiredtime);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.label = 2;
                            objIAuthTabCallback2 = setavailableexpiredtimeOnNavigationEvent2.IAuthTabCallback(getavailableexpiredtime, this);
                        } else {
                            setAvailableExpiredTime setavailableexpiredtimeOnNavigationEvent3 = getNodeId.onNavigationEvent(getnodeid);
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(getavailableexpiredtime);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.label = 3;
                            objIAuthTabCallback = setavailableexpiredtimeOnNavigationEvent3.IAuthTabCallback(getavailableexpiredtime, this);
                        }
                        return objOnWarmupCompleted;
                    }
                    int i4 = IAuthTabCallback + 33;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                    baseApiResponse = Unit.INSTANCE;
                } else if (i2 == 1) {
                    ResultKt.onNavigationEvent(obj);
                    objOnNavigationEvent = obj;
                    baseApiResponse = (BaseApiResponse) objOnNavigationEvent;
                } else if (i2 != 2) {
                    int i5 = onNavigationEvent + 71;
                    int i6 = i5 % 128;
                    IAuthTabCallback = i6;
                    if (i5 % 2 != 0 ? i2 != 3 : i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = i6 + 35;
                    onNavigationEvent = i7 % 128;
                    if (i7 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        obj2.hashCode();
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                    objIAuthTabCallback = obj;
                    baseApiResponse = (BaseApiResponse) objIAuthTabCallback;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    objIAuthTabCallback2 = obj;
                    baseApiResponse = (BaseApiResponse) objIAuthTabCallback2;
                }
                kotlin.Result.constructor-impl(baseApiResponse);
            } catch (Exception e) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(e));
                int i8 = onNavigationEvent + 125;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            return Unit.INSTANCE;
        }
    }

    public void onWarmupCompleted(@NotNull String str, long j, @NotNull List<Long> list, @NotNull Date date) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(date, "");
        AppCompatActivity appCompatActivity = this.IAuthTabCallback;
        Intrinsics.checkNotNull(appCompatActivity, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(appCompatActivity), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(str, j, list, date, null), 3, (Object) null);
        int i2 = onExtraCallbackWithResult + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Date $clickedAt;
        final /* synthetic */ String $executionId;
        final /* synthetic */ long $id;
        final /* synthetic */ List<Long> $ids;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(String str, long j, List<Long> list, Date date, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$executionId = str;
            this.$id = j;
            this.$ids = list;
            this.$clickedAt = date;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = getNodeId.this.new onExtraCallbackWithResult(this.$executionId, this.$id, this.$ids, this.$clickedAt, access13800Var);
            int i2 = onWarmupCompleted + 45;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 25;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 80 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            Object objOnExtraCallback;
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 19;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i5 = this.label;
            try {
                if (i5 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    getNodeId getnodeid = getNodeId.this;
                    String str = this.$executionId;
                    long j = this.$id;
                    List<Long> list = this.$ids;
                    Date date = this.$clickedAt;
                    Result.Companion companion = kotlin.Result.Companion;
                    setAvailableExpiredTime setavailableexpiredtimeOnNavigationEvent = getNodeId.onNavigationEvent(getnodeid);
                    String str2 = CommonModule_closeView.onWarmupCompleted.IAuthTabCallbackDefault().format(date);
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    setAppInfoAvailableTime setappinfoavailabletime = new setAppInfoAvailableTime(str, j, list, str2);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                    objOnExtraCallback = setAvailableExpiredTime.onExtraCallback(new Object[]{setavailableexpiredtimeOnNavigationEvent, setappinfoavailabletime, this}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), 337327256, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback, -337327254);
                    Object obj2 = objOnExtraCallback;
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallback = obj;
                }
                kotlin.Result.constructor-impl(objOnExtraCallback);
                i = onExtraCallbackWithResult + 1;
                onWarmupCompleted = i % 128;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
                i = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i % 128;
            }
            int i6 = i % 2;
            return Unit.INSTANCE;
        }
    }

    public void onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<getParamsMap.onExtraCallback> list, long j) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        AppCompatActivity appCompatActivity = this.IAuthTabCallback;
        Intrinsics.checkNotNull(appCompatActivity, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(appCompatActivity), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(str2, str3, str4, str5, list, j, this, str, null), 3, (Object) null);
        int i2 = onNavigationEvent + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ long $clientRquestAtTsMs;
        final /* synthetic */ String $collectionGroupCode;
        final /* synthetic */ String $eventType;
        final /* synthetic */ List<getParamsMap.onExtraCallback> $results;
        final /* synthetic */ String $searchId;
        final /* synthetic */ String $sessionId;
        final /* synthetic */ String $userNo;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ getNodeId this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(String str, String str2, String str3, String str4, List<getParamsMap.onExtraCallback> list, long j, getNodeId getnodeid, String str5, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$sessionId = str;
            this.$searchId = str2;
            this.$userNo = str3;
            this.$eventType = str4;
            this.$results = list;
            this.$clientRquestAtTsMs = j;
            this.this$0 = getnodeid;
            this.$collectionGroupCode = str5;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 35;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$sessionId, this.$searchId, this.$userNo, this.$eventType, this.$results, this.$clientRquestAtTsMs, this.this$0, this.$collectionGroupCode, access13800Var);
            int i2 = onExtraCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objIAuthTabCallback;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 19;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = 7 / 0;
            } else {
                objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallback + 101;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    String str = this.$sessionId;
                    String str2 = this.$searchId;
                    String str3 = this.$userNo;
                    String str4 = this.$eventType;
                    List<getParamsMap.onExtraCallback> list = this.$results;
                    long j = this.$clientRquestAtTsMs;
                    getNodeId getnodeid = this.this$0;
                    String str5 = this.$collectionGroupCode;
                    Result.Companion companion = kotlin.Result.Companion;
                    List<getParamsMap.onExtraCallback> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(getNodeId.onExtraCallback(getnodeid, (getParamsMap.onExtraCallback) it.next()));
                    }
                    ToseekLogRequestDto toseekLogRequestDto = new ToseekLogRequestDto(str, str2, str3, str4, arrayList, j);
                    setAvailableExpiredTime setavailableexpiredtimeOnNavigationEvent = getNodeId.onNavigationEvent(getnodeid);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = access15400.onNavigationEvent(toseekLogRequestDto);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = setavailableexpiredtimeOnNavigationEvent.onExtraCallbackWithResult(str5, toseekLogRequestDto, this);
                    if (obj == objOnWarmupCompleted) {
                        int i3 = onExtraCallbackWithResult + 59;
                        onExtraCallback = i3 % 128;
                        if (i3 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                kotlin.Result.constructor-impl(obj);
            } catch (Exception e) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(e));
            } catch (WebResourceResponseModel e2) {
                Result.Companion companion3 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (CancellationException e3) {
                throw e3;
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public void IAuthTabCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull String str5, int i, @NotNull String str6, @NotNull String str7, @NotNull List<getParamsMap.IAuthTabCallback> list, @Nullable Integer num, @Nullable String str8, long j) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        AppCompatActivity appCompatActivity = this.IAuthTabCallback;
        Intrinsics.checkNotNull(appCompatActivity, "");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(appCompatActivity), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(str2, str3, str4, str5, i, str6, str7, list, num, str8, j, this, str, null), 3, (Object) null);
        int i3 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $autoCompleteId;
        final /* synthetic */ long $clientRquestAtTsMs;
        final /* synthetic */ String $collectionGroupCode;
        final /* synthetic */ String $inputKeyword;
        final /* synthetic */ List<getParamsMap.IAuthTabCallback> $keywords;
        final /* synthetic */ String $referrer;
        final /* synthetic */ String $searchReferrer;
        final /* synthetic */ String $selectedKeyword;
        final /* synthetic */ Integer $selectedRank;
        final /* synthetic */ String $sessionId;
        final /* synthetic */ int $typedCharCount;
        final /* synthetic */ String $userNo;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ getNodeId this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(String str, String str2, String str3, String str4, int i, String str5, String str6, List<getParamsMap.IAuthTabCallback> list, Integer num, String str7, long j, getNodeId getnodeid, String str8, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$sessionId = str;
            this.$userNo = str2;
            this.$autoCompleteId = str3;
            this.$inputKeyword = str4;
            this.$typedCharCount = i;
            this.$referrer = str5;
            this.$searchReferrer = str6;
            this.$keywords = list;
            this.$selectedRank = num;
            this.$selectedKeyword = str7;
            this.$clientRquestAtTsMs = j;
            this.this$0 = getnodeid;
            this.$collectionGroupCode = str8;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$sessionId, this.$userNo, this.$autoCompleteId, this.$inputKeyword, this.$typedCharCount, this.$referrer, this.$searchReferrer, this.$keywords, this.$selectedRank, this.$selectedKeyword, this.$clientRquestAtTsMs, this.this$0, this.$collectionGroupCode, access13800Var);
            int i2 = IAuthTabCallback + 91;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 27;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = 22 / 0;
            } else {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            }
            int i4 = onWarmupCompleted + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = onWarmupCompleted + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            try {
                if (i4 != 0) {
                    int i5 = onWarmupCompleted + 5;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnExtraCallbackWithResult = obj;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    String str = this.$sessionId;
                    String str2 = this.$userNo;
                    String str3 = this.$autoCompleteId;
                    String str4 = this.$inputKeyword;
                    int i7 = this.$typedCharCount;
                    String str5 = this.$referrer;
                    String str6 = this.$searchReferrer;
                    List<getParamsMap.IAuthTabCallback> list = this.$keywords;
                    Integer num = this.$selectedRank;
                    String str7 = this.$selectedKeyword;
                    long j = this.$clientRquestAtTsMs;
                    getNodeId getnodeid = this.this$0;
                    String str8 = this.$collectionGroupCode;
                    Result.Companion companion = kotlin.Result.Companion;
                    List<getParamsMap.IAuthTabCallback> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(getNodeId.IAuthTabCallback(getnodeid, (getParamsMap.IAuthTabCallback) it.next()));
                    }
                    ToseekAutoCompleteLogRequestDto toseekAutoCompleteLogRequestDto = new ToseekAutoCompleteLogRequestDto(str, str2, str3, str4, i7, str5, str6, arrayList, num, str7, j);
                    setAvailableExpiredTime setavailableexpiredtimeOnNavigationEvent = getNodeId.onNavigationEvent(getnodeid);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.L$1 = access15400.onNavigationEvent(toseekAutoCompleteLogRequestDto);
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    objOnExtraCallbackWithResult = setavailableexpiredtimeOnNavigationEvent.onExtraCallbackWithResult(str8, toseekAutoCompleteLogRequestDto, this);
                    if (objOnExtraCallbackWithResult == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                }
                kotlin.Result.constructor-impl(objOnExtraCallbackWithResult);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = kotlin.Result.Companion;
                kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
            }
            Unit unit = Unit.INSTANCE;
            int i8 = IAuthTabCallback + 49;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }
    }

    private final ToseekLogRequestDto.Result onExtraCallbackWithResult(getParamsMap.onExtraCallback onextracallback) {
        int i = 2 % 2;
        long jIAuthTabCallback = onextracallback.IAuthTabCallback();
        long jOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
        double dOnNavigationEvent = onextracallback.onNavigationEvent();
        ToseekLogRequestDto.Result result = new ToseekLogRequestDto.Result(jIAuthTabCallback, jOnExtraCallbackWithResult, Double.valueOf(dOnNavigationEvent), onextracallback.onWarmupCompleted());
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return result;
        }
        throw null;
    }

    private final ToseekAutoCompleteLogRequestDto.ExposedKeyword onNavigationEvent(getParamsMap.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        ToseekAutoCompleteLogRequestDto.ExposedKeyword exposedKeyword = new ToseekAutoCompleteLogRequestDto.ExposedKeyword(iAuthTabCallback.onExtraCallbackWithResult(), iAuthTabCallback.onWarmupCompleted());
        int i2 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return exposedKeyword;
    }
}
