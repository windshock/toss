package o;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.core.workerservice.WorkerService$Companion$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AudienceNetworkAds;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.core.AppStateManager;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AudienceNetworkAds {
    private static long IAuthTabCallback;
    public static final AudienceNetworkAds onExtraCallbackWithResult;
    private static int onTransact;
    private static char[] onWarmupCompleted;
    private static final byte[] $$a = {119, -40, 16, 123};
    private static final int $$b = 9;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r6 = 97 - r6
            int r5 = r5 * 3
            int r5 = r5 + 4
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = o.AudienceNetworkAds.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AudienceNetworkAds.$$c(int, int, byte):java.lang.String");
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i3);
        int i11 = ~i3;
        int i12 = (~(i7 | i4)) | (~(i8 | i11)) | (~(i8 | i));
        int i13 = ~(i11 | i9);
        int i14 = i + i4 + i5 + (1938118820 * i2) + ((-1869228383) * i6);
        int i15 = i14 * i14;
        int i16 = (i * (-1046486968)) + 2037645312 + ((-1046486968) * i4) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i5) + ((-1907359744) * i2) + (1374945280 * i6) + (1516044288 * i15);
        int i17 = ((i * 647972376) - 1941852458) + (i4 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i5 * 647973227) + (i2 * (-1260466036)) + (i6 * 1557372491) + (i15 * 1239351296);
        return i16 + ((i17 * i17) * 490405888) != 1 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        int i4 = onExtraCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private AudienceNetworkAds() {
    }

    public static final /* synthetic */ void onWarmupCompleted(AudienceNetworkAds audienceNetworkAds, BaseApiResponse baseApiResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        audienceNetworkAds.onNavigationEvent(baseApiResponse);
        int i4 = onNavigationEvent + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    /* renamed from: o.AudienceNetworkAds$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<BaseApiResponse<?>, Unit> {
        AnonymousClass5(Object obj) {
            super(1, obj, AudienceNetworkAds.class, "onValidResponse", "onValidResponse(Lim/toss/network/model/BaseApiResponse;)V", 0);
        }

        public /* synthetic */ Object invoke(Object obj) {
            onWarmupCompleted((BaseApiResponse) obj);
            return Unit.INSTANCE;
        }

        public final void onWarmupCompleted(BaseApiResponse<?> baseApiResponse) {
            Intrinsics.checkNotNullParameter(baseApiResponse, "");
            AudienceNetworkAds.onWarmupCompleted((AudienceNetworkAds) ((CallableReference) this).receiver, baseApiResponse);
        }
    }

    static {
        onTransact = 0;
        onExtraCallbackWithResult();
        AudienceNetworkAds audienceNetworkAds = new AudienceNetworkAds();
        onExtraCallbackWithResult = audienceNetworkAds;
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = withAdListener.onNavigationEvent.onWarmupCompleted();
        final AnonymousClass5 anonymousClass5 = new AnonymousClass5(audienceNetworkAds);
        jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallback(new deserializeFloat() { // from class: viva.republica.toss.network.ServerParkingModeManager$$ExternalSyntheticLambda0
            public final void accept(Object obj) {
                AudienceNetworkAds.onNavigationEvent(anonymousClass5, obj);
            }
        });
        int i = IAuthTabCallbackStub + 55;
        onTransact = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = onNavigationEvent + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            AppStateManager.onExtraCallbackWithResult.writeTypedObject().onExtraCallbackWithResult();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = AppStateManager.onExtraCallbackWithResult.writeTypedObject().onExtraCallbackWithResult();
        int i3 = onNavigationEvent + 45;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return Boolean.valueOf(zOnExtraCallbackWithResult);
        }
        int i4 = 56 / 0;
        return Boolean.valueOf(zOnExtraCallbackWithResult);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[PHI: r2
      0x0042: PHI (r2v8 o.getPluginVersion) = (r2v5 o.getPluginVersion), (r2v10 o.getPluginVersion) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r2
      0x002d: PHI (r2v6 o.getPluginVersion) = (r2v5 o.getPluginVersion), (r2v10 o.getPluginVersion) binds: [B:8:0x002b, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r4) throws kotlin.NoWhenBranchMatchedException {
        /*
            r0 = 0
            r0 = r4[r0]
            o.AudienceNetworkAds r0 = (o.AudienceNetworkAds) r0
            r0 = 1
            r4 = r4[r0]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.AudienceNetworkAds.onExtraCallback
            int r2 = r2 + 31
            int r3 = r2 % 128
            o.AudienceNetworkAds.onNavigationEvent = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L25
            viva.republica.toss.core.AppStateManager r2 = viva.republica.toss.core.AppStateManager.onExtraCallbackWithResult
            o.getPluginVersion r2 = r2.writeTypedObject()
            if (r4 != 0) goto L42
            goto L2d
        L25:
            viva.republica.toss.core.AppStateManager r2 = viva.republica.toss.core.AppStateManager.onExtraCallbackWithResult
            o.getPluginVersion r2 = r2.writeTypedObject()
            if (r4 != r0) goto L42
        L2d:
            int r4 = o.AudienceNetworkAds.onExtraCallback
            int r4 = r4 + 29
            int r0 = r4 % 128
            o.AudienceNetworkAds.onNavigationEvent = r0
            int r4 = r4 % r1
            o.getPluginVersion$onNavigationEvent$onNavigationEvent r4 = o.getPluginVersion.onNavigationEvent.onNavigationEvent.onWarmupCompleted
            int r0 = o.AudienceNetworkAds.onNavigationEvent
            int r0 = r0 + 51
            int r3 = r0 % 128
            o.AudienceNetworkAds.onExtraCallback = r3
            int r0 = r0 % r1
            goto L4f
        L42:
            if (r4 == r0) goto L54
            int r4 = o.AudienceNetworkAds.onNavigationEvent
            int r4 = r4 + 9
            int r0 = r4 % 128
            o.AudienceNetworkAds.onExtraCallback = r0
            int r4 = r4 % r1
            o.getPluginVersion$onNavigationEvent$onExtraCallback r4 = o.getPluginVersion.onNavigationEvent.onExtraCallback.onWarmupCompleted
        L4f:
            r2.IAuthTabCallback(r4)
            r4 = 0
            return r4
        L54:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AudienceNetworkAds.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    public final void onExtraCallback(@NotNull JsonElement jsonElement) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (!(!((Boolean) onExtraCallbackWithResult(-418930714, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{this}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), 418930715, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback())).booleanValue())) {
            return;
        }
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (!(jsonElement instanceof JsonObject)) {
            return;
        }
        JsonObject jsonObject = (JsonObject) jsonElement;
        Object[] objArr = new Object[1];
        a(View.MeasureSpec.getSize(0), View.MeasureSpec.getSize(0) + 6, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 53441), objArr);
        if (!jsonObject.containsKey(((String) objArr[0]).intern())) {
            return;
        }
        int i4 = onExtraCallback + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr2 = new Object[1];
        a(ViewConfiguration.getMaximumFlingVelocity() >> 16, 6 - Color.blue(0), (char) (53441 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr2);
        Object obj = jsonObject.get(((String) objArr2[0]).intern());
        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        Integer numAsInterface = jsonPrimitive != null ? initRenderFinish.asInterface(jsonPrimitive) : null;
        if (numAsInterface != null) {
            int i6 = onExtraCallback + 5;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (numAsInterface.intValue() == -999) {
                onExtraCallbackWithResult(1614655860, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{this, true}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1614655860, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
            }
        }
    }

    public final void onWarmupCompleted(@NotNull TossApiCallException.ApiError apiError) {
        String str;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(apiError, "");
            int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            ((Boolean) onExtraCallbackWithResult(-418930714, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback, 418930715, iIAuthTabCallback2, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback())).booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(apiError, "");
        int iIAuthTabCallback3 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback4 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (((Boolean) onExtraCallbackWithResult(-418930714, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback3, 418930715, iIAuthTabCallback4, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback())).booleanValue()) {
            return;
        }
        int i3 = onNavigationEvent + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            str = (String) TossApiCallException.onExtraCallbackWithResult(814865993, new Object[]{apiError}, -814865993, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult());
            int i4 = 31 / 0;
            if (str == null) {
                return;
            }
        } else {
            str = (String) TossApiCallException.onExtraCallbackWithResult(814865993, new Object[]{apiError}, -814865993, handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult());
            if (str == null) {
                return;
            }
        }
        if (IAuthTabCallback(str)) {
            int iIAuthTabCallback5 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            int iIAuthTabCallback6 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
            onExtraCallbackWithResult(1614655860, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{this, true}, iIAuthTabCallback5, -1614655860, iIAuthTabCallback6, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
        }
    }

    private final void onNavigationEvent(BaseApiResponse<?> baseApiResponse) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        if (!((Boolean) onExtraCallbackWithResult(-418930714, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback, 418930715, iIAuthTabCallback2, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback())).booleanValue()) {
            return;
        }
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue()) {
            int i4 = onExtraCallback + 37;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                IAuthTabCallback(baseApiResponse);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!IAuthTabCallback(baseApiResponse)) {
                return;
            }
            onExtraCallbackWithResult(1614655860, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{this, false}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1614655860, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r5 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r1 = o.AudienceNetworkAds.onNavigationEvent + 37;
        o.AudienceNetworkAds.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return IAuthTabCallback(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r5 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean IAuthTabCallback(im.toss.network.model.BaseApiResponse<?> r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            okhttp3.HttpUrl r5 = r5.access100()
            r1 = 0
            if (r5 == 0) goto L32
            int r2 = o.AudienceNetworkAds.onNavigationEvent
            int r2 = r2 + 11
            int r3 = r2 % 128
            o.AudienceNetworkAds.onExtraCallback = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1e
            java.lang.String r5 = r5.toString()
            r2 = 7
            int r2 = r2 / r1
            if (r5 == 0) goto L32
            goto L24
        L1e:
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L32
        L24:
            int r1 = o.AudienceNetworkAds.onNavigationEvent
            int r1 = r1 + 37
            int r2 = r1 % 128
            o.AudienceNetworkAds.onExtraCallback = r2
            int r1 = r1 % r0
            boolean r5 = r4.IAuthTabCallback(r5)
            return r5
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AudienceNetworkAds.IAuthTabCallback(im.toss.network.model.BaseApiResponse):boolean");
    }

    private final boolean IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!StringsKt.startsWith$default(str, zzaj.onNavigationEvent().IAuthTabCallbackDefault(), false, 2, (Object) null)) {
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.startsWith$default(str, zzaj.onNavigationEvent().IAuthTabCallbackStub(), false, 2, (Object) null)) {
                int i6 = onNavigationEvent + 61;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r29, int r30, char r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AudienceNetworkAds.a(int, int, char, java.lang.Object[]):void");
    }

    private final boolean onWarmupCompleted() {
        int iIAuthTabCallback = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        int iIAuthTabCallback2 = WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback();
        return ((Boolean) onExtraCallbackWithResult(-418930714, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback, 418930715, iIAuthTabCallback2, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback())).booleanValue();
    }

    private final void onExtraCallback(boolean z) {
        onExtraCallbackWithResult(1614655860, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), new Object[]{this, Boolean.valueOf(z)}, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), -1614655860, WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback(), WorkerService$Companion$.ExternalSyntheticLambda9.IAuthTabCallback());
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = new char[]{15719, 14452, 14190, 12908, 10601, 9333};
        IAuthTabCallback = -6552007078123935536L;
    }
}
