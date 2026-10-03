package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getObjects {
    public static final getObjects onWarmupCompleted = new getObjects();

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnExtraCallback = getObjects.this.onExtraCallback(this);
            return objOnExtraCallback == access14300.onWarmupCompleted() ? objOnExtraCallback : Result.IAuthTabCallback(objOnExtraCallback);
        }
    }

    private getObjects() {
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super getButtonColor>, Object> {
        int I$0;
        Object L$0;
        int label;

        public onNavigationEvent(access13800 access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(access13800Var);
        }

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super getButtonColor> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - TextUtils.lastIndexOf("", '0', 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, (ViewConfiguration.getScrollBarSize() >> 8) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback).get(null);
                try {
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971988338);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 29426), TextUtils.getOffsetAfter("", 0) + 22, Color.argb(0, 0, 0, 0) + 24734, -1154144738, false, "access000", new Class[0]);
                    }
                    getMediaViewVideoRendererApi getmediaviewvideorendererapi = (getMediaViewVideoRendererApi) ((Method) objOnExtraCallback2).invoke(obj2, null);
                    this.L$0 = access15400.onNavigationEvent(this);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = getmediaviewvideorendererapi.IAuthTabCallbackStub(this);
                    if (obj == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            BaseApiResponse baseApiResponse = (BaseApiResponse) obj;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue()) {
                try {
                    Object objOnTransact = baseApiResponse.onTransact();
                    if (objOnTransact != null) {
                        return (getButtonColor) objOnTransact;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.account.OpenBankingWithdrawRestrictionResponse");
                } catch (NullPointerException e) {
                    if (Intrinsics.areEqual(getButtonColor.class, Object.class) || Intrinsics.areEqual(getButtonColor.class, Unit.class)) {
                        return Unit.INSTANCE;
                    }
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
            if (apiErrorExtraCallbackWithResult == null) {
                throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
            }
            throw apiErrorExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<? extends o.getObjectAt>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.getObjects.onExtraCallbackWithResult
            if (r0 == 0) goto L13
            r0 = r8
            o.getObjects$onExtraCallbackWithResult r0 = (o.getObjects.onExtraCallbackWithResult) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            o.getObjects$onExtraCallbackWithResult r0 = new o.getObjects$onExtraCallbackWithResult
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = o.access14300.onWarmupCompleted()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            o.access13800 r0 = (o.access13800) r0
            kotlin.ResultKt.onNavigationEvent(r8)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            goto L5a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.onNavigationEvent(r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            o.GeckoHubImp r8 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            o.getObjects$onNavigationEvent r2 = new o.getObjects$onNavigationEvent     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            r4 = 0
            r2.<init>(r4)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            java.lang.Object r4 = o.access15400.onNavigationEvent(r0)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            r4 = 0
            r0.I$0 = r4     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            r0.I$1 = r4     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            r0.I$2 = r4     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            r0.label = r3     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            java.lang.Object r8 = o.maybeUpdateAnimatable.onExtraCallback(r8, r2, r0)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            if (r8 != r1) goto L5a
            return r1
        L5a:
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)     // Catch: java.lang.Exception -> L5f java.util.concurrent.CancellationException -> L6b o.WebResourceResponseModel -> L6d
            goto L78
        L5f:
            r8 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            goto L78
        L6b:
            r8 = move-exception
            throw r8
        L6d:
            r8 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
        L78:
            boolean r0 = kotlin.Result.onNavigationEvent(r8)
            if (r0 == 0) goto L88
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            o.getButtonColor r8 = (o.getButtonColor) r8
            o.getObjectAt$onExtraCallbackWithResult r0 = o.getObjectAt.Companion
            o.getObjectAt r8 = r0.onNavigationEvent(r8)
        L88:
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            java.lang.Throwable r3 = kotlin.Result.exceptionOrNull-impl(r8)
            if (r3 == 0) goto L9f
            o.ConvertFloatArrayToByteArray r0 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
            java.lang.String r1 = "OpenBankingWithdrawRestrictionHelper"
            java.lang.String r2 = "failed to fetch open-banking withdraw restriction"
            r4 = 0
            r5 = 8
            r6 = 0
            o.ConvertFloatArrayToByteArray.IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6)
        L9f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getObjects.onExtraCallback(o.access13800):java.lang.Object");
    }
}
