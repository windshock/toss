package o;

import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import o.setLogBuffers;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class doGet {

    static final class onExtraCallback<T> extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return doGet.onWarmupCompleted(0L, null, this);
        }
    }

    public static final <T> Object onNavigationEvent(long j, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        if (j <= 0) {
            throw new WebResourceResponseModel("Timed out immediately");
        }
        Object objIAuthTabCallback = IAuthTabCallback(new setDeleteOldPackageBeforeDownload(j, access13800Var), function2);
        if (objIAuthTabCallback == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objIAuthTabCallback;
    }

    public static final <T> Object onExtraCallbackWithResult(long j, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        return onNavigationEvent(formatMsgs.IAuthTabCallback(j), function2, access13800Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, o.setDeleteOldPackageBeforeDownload] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object onWarmupCompleted(long j, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        onExtraCallback onextracallback;
        WebResourceResponseModel e;
        Ref.ObjectRef objectRef;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i = onextracallback.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onextracallback.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (j <= 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                onextracallback.L$0 = function2;
                onextracallback.L$1 = objectRef2;
                onextracallback.J$0 = j;
                onextracallback.label = 1;
                ?? r2 = (T) new setDeleteOldPackageBeforeDownload(j, onextracallback);
                objectRef2.element = r2;
                Object objIAuthTabCallback = IAuthTabCallback(r2, function2);
                if (objIAuthTabCallback == access14100.onExtraCallback()) {
                    access14600.IAuthTabCallback(onextracallback);
                }
                return objIAuthTabCallback == objOnExtraCallback ? objOnExtraCallback : objIAuthTabCallback;
            } catch (WebResourceResponseModel e2) {
                e = e2;
                objectRef = objectRef2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) onextracallback.L$1;
            try {
                ResultKt.onNavigationEvent(obj);
                return obj;
            } catch (WebResourceResponseModel e3) {
                e = e3;
            }
        }
        if (e.onWarmupCompleted == objectRef.element) {
            return null;
        }
        throw e;
    }

    public static final <T> Object IAuthTabCallback(long j, @NotNull Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2, @NotNull access13800<? super T> access13800Var) {
        return onWarmupCompleted(formatMsgs.IAuthTabCallback(j), function2, access13800Var);
    }

    private static final <U, T extends U> Object IAuthTabCallback(setDeleteOldPackageBeforeDownload<U, ? super T> setdeleteoldpackagebeforedownload, Function2<? super findResAndMsg, ? super access13800<? super T>, ? extends Object> function2) {
        getFullPackage.IAuthTabCallback(setdeleteoldpackagebeforedownload, formatMsgs.onExtraCallback(setdeleteoldpackagebeforedownload.IAuthTabCallback.getContext()).onWarmupCompleted(setdeleteoldpackagebeforedownload.onWarmupCompleted, setdeleteoldpackagebeforedownload, setdeleteoldpackagebeforedownload.getContext()));
        return fromInt.IAuthTabCallback((ycx4) setdeleteoldpackagebeforedownload, setdeleteoldpackagebeforedownload, (Function2<? super setDeleteOldPackageBeforeDownload<U, ? super T>, ? super access13800<? super T>, ? extends Object>) function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final WebResourceResponseModel IAuthTabCallback(long j, @NotNull BufferOutputStream bufferOutputStream, @NotNull getPackageType getpackagetype) {
        String strOnNavigationEvent;
        cc ccVar = bufferOutputStream instanceof cc ? (cc) bufferOutputStream : null;
        if (ccVar != null) {
            setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
            strOnNavigationEvent = ccVar.onNavigationEvent(setCommandLine.IAuthTabCallback(j, setRevision.MILLISECONDS));
            if (strOnNavigationEvent == null) {
                strOnNavigationEvent = "Timed out waiting for " + j + " ms";
            }
        }
        return new WebResourceResponseModel(strOnNavigationEvent, getpackagetype);
    }
}
