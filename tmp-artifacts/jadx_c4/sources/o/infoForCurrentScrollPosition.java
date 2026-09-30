package o;

import android.content.Context;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.ads_sdk.log.NativeAdsWebEventLogManager$;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.serialization.json.JsonObject;
import o.WebSocketFactory;
import o.isDecorView;
import o.unregisterDataSetObserver;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class infoForCurrentScrollPosition {
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onTransact;
    private final enableLayers IAuthTabCallback;
    private final findResAndMsg onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private final performDrag onNavigationEvent;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onWarmupCompleted = 8;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = infoForCurrentScrollPosition.onWarmupCompleted(infoForCurrentScrollPosition.this, null, null, null, this);
            if (i3 != 0) {
                int i4 = 62 / 0;
            }
            int i5 = onExtraCallback + 117;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            throw null;
        }
    }

    public interface onExtraCallbackWithResult {
        infoForCurrentScrollPosition onExtraCallbackWithResult();
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            infoForCurrentScrollPosition infoforcurrentscrollposition = infoForCurrentScrollPosition.this;
            if (i3 != 0) {
                infoForCurrentScrollPosition.onNavigationEvent(infoforcurrentscrollposition, null, null, this);
                throw null;
            }
            Object objOnNavigationEvent = infoForCurrentScrollPosition.onNavigationEvent(infoforcurrentscrollposition, null, null, this);
            int i4 = onExtraCallback + 57;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }
    }

    static {
        int i = IAuthTabCallbackStub + 9;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~((~i4) | i8)) | i9;
        int i11 = i5 | i6;
        int i12 = (~(i4 | i8)) | i9;
        int i13 = i5 + i6 + i + (1258674323 * i3) + ((-126594725) * i2);
        int i14 = i13 * i13;
        int i15 = ((-1449289074) * i5) + 1954676736 + ((-212912869) * i6) + (i10 * (-1236376205)) + (i11 * (-1236376205)) + ((-1236376205) * i12) + (1609302016 * i) + (881065984 * i3) + ((-991690752) * i2) + ((-541982720) * i14);
        int i16 = ((i5 * (-1656160718)) - 817430035) + (i6 * (-1656161339)) + (i10 * 621) + (i11 * 621) + (i12 * 621) + (i * (-1656160097)) + (i3 * (-2121497779)) + (i2 * 1378977669) + (i14 * (-275906560));
        int i17 = i15 + (i16 * i16 * (-372375552));
        if (i17 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i17 != 2) {
            return onNavigationEvent(objArr);
        }
        infoForCurrentScrollPosition infoforcurrentscrollposition = (infoForCurrentScrollPosition) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i18 = 2 % 2;
        int i19 = asBinder + 1;
        asInterface = i19 % 128;
        int i20 = i19 % 2;
        String strOnExtraCallbackWithResult = infoforcurrentscrollposition.onExtraCallbackWithResult(str, jLongValue);
        int i21 = asBinder + 125;
        asInterface = i21 % 128;
        int i22 = i21 % 2;
        return strOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        isDecorView.IAuthTabCallback iAuthTabCallback = (isDecorView.IAuthTabCallback) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Integer num = (Integer) objArr[3];
        unregisterDataSetObserver unregisterdatasetobserver = (unregisterDataSetObserver) objArr[4];
        String str3 = (String) objArr[5];
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        IAuthTabCallback(iAuthTabCallback, str, str2, num, unregisterdatasetobserver, str3);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 63;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Request onNavigationEvent(infoForCurrentScrollPosition infoforcurrentscrollposition, String str, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 11;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(i);
        if (i4 != 0) {
            int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback5 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback6 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        Request request = (Request) onExtraCallbackWithResult(iIAuthTabCallback5, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{infoforcurrentscrollposition, str, numValueOf}, iIAuthTabCallback6, iIAuthTabCallback4, 1149170123, -1149170122);
        int i5 = asBinder + 101;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return request;
    }

    @Inject
    public infoForCurrentScrollPosition(@NotNull Context context, @NotNull performDrag performdrag, @NotNull enableLayers enablelayers) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(performdrag, "");
        Intrinsics.checkNotNullParameter(enablelayers, "");
        this.onExtraCallbackWithResult = context;
        this.onNavigationEvent = performdrag;
        this.IAuthTabCallback = enablelayers;
        this.onExtraCallback = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()).plus(new onExtraCallback(CoroutineExceptionHandler.extraCallbackWithResult)));
    }

    public static final /* synthetic */ enableLayers IAuthTabCallback(infoForCurrentScrollPosition infoforcurrentscrollposition) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 73;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        enableLayers enablelayers = infoforcurrentscrollposition.IAuthTabCallback;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 1;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return enablelayers;
        }
        throw null;
    }

    public static final /* synthetic */ Context onExtraCallback(infoForCurrentScrollPosition infoforcurrentscrollposition) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Context context = infoforcurrentscrollposition.onExtraCallbackWithResult;
        int i5 = i3 + 7;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return context;
    }

    public static final /* synthetic */ performDrag onExtraCallbackWithResult(infoForCurrentScrollPosition infoforcurrentscrollposition) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        performDrag performdrag = infoforcurrentscrollposition.onNavigationEvent;
        if (i3 != 0) {
            return performdrag;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object onNavigationEvent(infoForCurrentScrollPosition infoforcurrentscrollposition, String str, String str2, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objOnNavigationEvent = infoforcurrentscrollposition.onNavigationEvent(str, str2, (access13800<? super Boolean>) access13800Var);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = asBinder + 77;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return objOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ Object onWarmupCompleted(infoForCurrentScrollPosition infoforcurrentscrollposition, String str, String str2, RequestBody requestBody, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = infoforcurrentscrollposition.IAuthTabCallback(str, str2, requestBody, access13800Var);
        int i4 = asBinder + 75;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return objIAuthTabCallback;
    }

    public static final class onExtraCallback extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public onExtraCallback(CoroutineExceptionHandler.onWarmupCompleted onwarmupcompleted) {
            super(onwarmupcompleted);
        }

        public void handleException(CoroutineContext coroutineContext, Throwable th) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 13;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            String message = th.getMessage();
            if (message == null) {
                int i4 = onWarmupCompleted + 89;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    message = th.getClass().getSimpleName();
                    int i5 = 79 / 0;
                } else {
                    message = th.getClass().getSimpleName();
                }
            }
            ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "NativeAdsWebEventLog", "Web ad event tracking coroutine failed", access8100.onNavigationEvent(getWrite.IAuthTabCallback("error", message)), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            int i6 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull List<String> list, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        maybeUpdateAnimatable.onNavigationEvent(this.onExtraCallback, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallbackStub(this, str2, System.currentTimeMillis(), str, list, (access13800) null), 3, (Object) null);
        int i2 = asInterface + 59;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if ((r13 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        o.maybeUpdateAnimatable.onNavigationEvent(r12.onExtraCallback, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new o.infoForCurrentScrollPosition.IAuthTabCallbackDefault(r12, r13, r14, java.lang.System.currentTimeMillis(), (o.access13800) null), 3, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r14.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r14.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r13 = o.infoForCurrentScrollPosition.asBinder + 25;
        o.infoForCurrentScrollPosition.asInterface = r13 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull String str, @NotNull List<String> list) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            int i3 = 15 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
    
        if (r0 == r6) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(String str, String str2, access13800<? super Boolean> access13800Var) throws Throwable {
        onNavigationEvent onnavigationevent;
        Object obj;
        Request request;
        int i;
        String str3 = str;
        String str4 = str2;
        int i2 = 2 % 2;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i3 = onnavigationevent.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i3 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
                int i4 = asInterface + 65;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        Object objIAuthTabCallback = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i6 = onnavigationevent.label;
        Object obj2 = null;
        boolean z = true;
        if (i6 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(IAuthTabCallback(this).IAuthTabCallback(str4));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
            }
            Throwable th = kotlin.Result.exceptionOrNull-impl(obj);
            if (th != null) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("request_id", str3);
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getSimpleName();
                }
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "NativeAdsWebEventLog", "Web ad event GET tracking url dropped by unrecoverable request build failure", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("error", message)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return access14000.onNavigationEvent(false);
            }
            Request request2 = (Request) obj;
            enableLayers enablelayers = this.IAuthTabCallback;
            onSecondaryPointerUp onsecondarypointerupOnWarmupCompleted = onWarmupCompleted(str);
            onnavigationevent.L$0 = str3;
            onnavigationevent.L$1 = str4;
            onnavigationevent.L$2 = access15400.onNavigationEvent(request2);
            onnavigationevent.label = 1;
            Object objIAuthTabCallback2 = enablelayers.IAuthTabCallback(request2, onsecondarypointerupOnWarmupCompleted, onnavigationevent);
            if (objIAuthTabCallback2 != objOnWarmupCompleted) {
                int i7 = asBinder + 95;
                asInterface = i7 % 128;
                if (i7 % 2 == 0) {
                    obj2.hashCode();
                    throw null;
                }
                request = request2;
                objIAuthTabCallback = objIAuthTabCallback2;
            }
            return objOnWarmupCompleted;
        }
        int i8 = asBinder + 87;
        asInterface = i8 % 128;
        int i9 = i8 % 2;
        if (i6 != 1) {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            unregisterDataSetObserver unregisterdatasetobserverOnExtraCallback = ((getPageTitle) objIAuthTabCallback).onExtraCallback();
            if (!(!Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback))) {
                z = false;
            } else if (unregisterdatasetobserverOnExtraCallback instanceof unregisterDataSetObserver.onExtraCallback) {
                i = asBinder + 47;
                asInterface = i % 128;
                int i10 = i % 2;
                z = false;
            } else if (!Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
                int i11 = asInterface + 41;
                asBinder = i11 % 128;
                if (i11 % 2 != 0) {
                    Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent);
                    obj2.hashCode();
                    throw null;
                }
                if (!Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return access14000.onNavigationEvent(z);
        }
        Request request3 = (Request) onnavigationevent.L$2;
        str4 = (String) onnavigationevent.L$1;
        String str5 = (String) onnavigationevent.L$0;
        ResultKt.onNavigationEvent(objIAuthTabCallback);
        request = request3;
        str3 = str5;
        unregisterDataSetObserver unregisterdatasetobserver = (unregisterDataSetObserver) objIAuthTabCallback;
        if (!Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback)) {
            if (unregisterdatasetobserver instanceof unregisterDataSetObserver.onExtraCallback) {
                i = asInterface + 117;
                asBinder = i % 128;
                int i102 = i % 2;
                z = false;
            } else if (!Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
                if (!Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                enableLayers enablelayers2 = this.IAuthTabCallback;
                onSecondaryPointerUp onsecondarypointerupOnWarmupCompleted2 = onWarmupCompleted(str3);
                NativeAdsWebEventLogManager$.ExternalSyntheticLambda1 externalSyntheticLambda1 = new NativeAdsWebEventLogManager$.ExternalSyntheticLambda1(this, str4);
                onnavigationevent.L$0 = access15400.onNavigationEvent(str3);
                onnavigationevent.L$1 = access15400.onNavigationEvent(str4);
                onnavigationevent.L$2 = access15400.onNavigationEvent(request);
                onnavigationevent.label = 2;
                objIAuthTabCallback = enablelayers2.IAuthTabCallback((Function1<? super Integer, Unit>) null, onsecondarypointerupOnWarmupCompleted2, (Function1<? super Integer, Request>) externalSyntheticLambda1, (access13800<? super getPageTitle>) onnavigationevent);
            }
        }
        return access14000.onNavigationEvent(z);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        infoForCurrentScrollPosition infoforcurrentscrollposition = (infoForCurrentScrollPosition) objArr[0];
        String str = (String) objArr[1];
        ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 13;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Request requestIAuthTabCallback = infoforcurrentscrollposition.IAuthTabCallback.IAuthTabCallback(str);
        int i4 = asBinder + 75;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return requestIAuthTabCallback;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        if (r0 == r6) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object IAuthTabCallback(String str, String str2, RequestBody requestBody, access13800<? super Boolean> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        Object obj;
        String str3;
        String str4;
        RequestBody requestBody2;
        Request request;
        boolean z;
        boolean z2;
        boolean z3;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object objOnWarmupCompleted = iAuthTabCallback2.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i3 = iAuthTabCallback2.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            try {
                Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(IAuthTabCallback(this).onNavigationEvent(str, str2, requestBody, false));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
                int i4 = asBinder + 81;
                asInterface = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 3;
                }
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
            }
            Throwable th = kotlin.Result.exceptionOrNull-impl(obj);
            if (th != null) {
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("request_id", str);
                String message = th.getMessage();
                if (message == null) {
                    message = th.getClass().getSimpleName();
                }
                ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{convertFloatArrayToByteArray, "NativeAdsWebEventLog", "Web ad event tracking url dropped by unrecoverable request build failure", access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("error", message)}), null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return access14000.onNavigationEvent(false);
            }
            Request request2 = (Request) obj;
            enableLayers enablelayers = this.IAuthTabCallback;
            onSecondaryPointerUp onsecondarypointerupOnWarmupCompleted = onWarmupCompleted(str);
            iAuthTabCallback2.L$0 = str;
            iAuthTabCallback2.L$1 = str2;
            iAuthTabCallback2.L$2 = requestBody;
            iAuthTabCallback2.L$3 = access15400.onNavigationEvent(request2);
            iAuthTabCallback2.label = 1;
            Object objIAuthTabCallback = enablelayers.IAuthTabCallback(request2, onsecondarypointerupOnWarmupCompleted, iAuthTabCallback2);
            if (objIAuthTabCallback != objOnWarmupCompleted2) {
                str3 = str;
                str4 = str2;
                requestBody2 = requestBody;
                request = request2;
                objOnWarmupCompleted = objIAuthTabCallback;
            }
            return objOnWarmupCompleted2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = asInterface + 109;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            z = false;
            z2 = true;
            unregisterDataSetObserver unregisterdatasetobserverOnExtraCallback = ((getPageTitle) objOnWarmupCompleted).onExtraCallback();
            if (!Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback) && !(unregisterdatasetobserverOnExtraCallback instanceof unregisterDataSetObserver.onExtraCallback)) {
                if (!Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback) && !Intrinsics.areEqual(unregisterdatasetobserverOnExtraCallback, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = z2;
                return access14000.onNavigationEvent(z3);
            }
            z3 = z;
            return access14000.onNavigationEvent(z3);
        }
        request = (Request) iAuthTabCallback2.L$3;
        RequestBody requestBody3 = (RequestBody) iAuthTabCallback2.L$2;
        String str5 = (String) iAuthTabCallback2.L$1;
        String str6 = (String) iAuthTabCallback2.L$0;
        ResultKt.onNavigationEvent(objOnWarmupCompleted);
        requestBody2 = requestBody3;
        str4 = str5;
        str3 = str6;
        unregisterDataSetObserver unregisterdatasetobserver = (unregisterDataSetObserver) objOnWarmupCompleted;
        if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback) || (unregisterdatasetobserver instanceof unregisterDataSetObserver.onExtraCallback)) {
            z = false;
            z3 = z;
            return access14000.onNavigationEvent(z3);
        }
        int i8 = asBinder + 37;
        asInterface = i8 % 128;
        if (i8 % 2 == 0) {
            Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback);
            throw null;
        }
        if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
            z2 = true;
            z3 = z2;
            return access14000.onNavigationEvent(z3);
        }
        if (!Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent)) {
            throw new NoWhenBranchMatchedException();
        }
        enableLayers enablelayers2 = this.IAuthTabCallback;
        onSecondaryPointerUp onsecondarypointerupOnWarmupCompleted2 = onWarmupCompleted(str3);
        iAuthTabCallback2.L$0 = access15400.onNavigationEvent(str3);
        iAuthTabCallback2.L$1 = access15400.onNavigationEvent(str4);
        iAuthTabCallback2.L$2 = access15400.onNavigationEvent(requestBody2);
        iAuthTabCallback2.L$3 = access15400.onNavigationEvent(request);
        iAuthTabCallback2.label = 2;
        z = false;
        z2 = true;
        objOnWarmupCompleted = enableLayers.onWarmupCompleted(enablelayers2, str3, str4, requestBody2, null, onsecondarypointerupOnWarmupCompleted2, false, iAuthTabCallback2, 8, null);
    }

    private final onSecondaryPointerUp onWarmupCompleted(String str) {
        int i = 2 % 2;
        isDecorView.IAuthTabCallback iAuthTabCallbackOnExtraCallback = isDecorView.onNavigationEvent.onExtraCallback();
        if (iAuthTabCallbackOnExtraCallback != null) {
            return new NativeAdsWebEventLogManager$.ExternalSyntheticLambda0(iAuthTabCallbackOnExtraCallback, str);
        }
        int i2 = asInterface;
        int i3 = i2 + 81;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final void IAuthTabCallback(isDecorView.IAuthTabCallback iAuthTabCallback, String str, String str2, Integer num, unregisterDataSetObserver unregisterdatasetobserver, String str3) {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(unregisterdatasetobserver, "");
        } else {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(unregisterdatasetobserver, "");
            int i3 = 58 / 0;
        }
    }

    private final String onExtraCallbackWithResult(String str, long j) {
        int i = 2 % 2;
        String string = new JsonObject(access8100.IAuthTabCallback(initRenderFinish.onExtraCallbackWithResult(wie2.Default.onExtraCallback(str)), getWrite.IAuthTabCallback("eventTs", initRenderFinish.onNavigationEvent(ViewPager.IAuthTabCallback.IAuthTabCallback(j))))).toString();
        int i2 = asInterface + 53;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(isDecorView.IAuthTabCallback iAuthTabCallback, String str, String str2, Integer num, unregisterDataSetObserver unregisterdatasetobserver, String str3) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        onExtraCallbackWithResult(iIAuthTabCallback2, WebSocketFactory.onExtraCallback.IAuthTabCallback(), new Object[]{iAuthTabCallback, str, str2, num, unregisterdatasetobserver, str3}, iIAuthTabCallback3, iIAuthTabCallback, 800910374, -800910374);
    }

    public static final /* synthetic */ String IAuthTabCallback(infoForCurrentScrollPosition infoforcurrentscrollposition, String str, long j) {
        Object[] objArr = {infoforcurrentscrollposition, str, Long.valueOf(j)};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (String) onExtraCallbackWithResult(WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, 124323409, -124323407);
    }

    private static final Request onWarmupCompleted(infoForCurrentScrollPosition infoforcurrentscrollposition, String str, int i) {
        Object[] objArr = {infoforcurrentscrollposition, str, Integer.valueOf(i)};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (Request) onExtraCallbackWithResult(WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), objArr, WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, 1149170123, -1149170122);
    }
}
