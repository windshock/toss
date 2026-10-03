package viva.republica.toss.guest;

import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.ViewModel;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.define.MobileCarrier;
import im.toss.network.throwable.TossApiCallException;
import im.toss.state.spec.SessionState;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.PlayerErrorCode;
import o.ProcessTextApi23ImplExternalSyntheticLambda0;
import o.Rmipmap;
import o.TextLinkScopeExternalSyntheticLambda7;
import o.TrackGroupExternalSyntheticLambda0;
import o.access13800;
import o.asset;
import o.createPaints;
import o.findResAndMsg;
import o.maybeUpdateAnimatable;
import o.setAdUnitIds;
import o.setRandomHost;
import o.setSegmentCollection;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;
import viva.republica.toss.network.model.init.v2.CheckoutResult;
import viva.republica.toss.network.model.verify.guest.DevSupportSuperLoginResponse;
import viva.republica.toss.network.model.verify.guest.SignInResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DevSupportSuperLoginViewModel extends ViewModel {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static char[] asBinder = null;
    private static int asInterface = 1;
    public static final int onNavigationEvent;
    private static int onTransact = 1;
    private final setAdUnitIds IAuthTabCallback;
    private final Rmipmap<asset> onExtraCallback;
    private final setSegmentCollection onExtraCallbackWithResult;
    private final SessionState onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DevSupportSuperLoginViewModel.IAuthTabCallback(DevSupportSuperLoginViewModel.this, null, this);
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DevSupportSuperLoginViewModel.IAuthTabCallback(DevSupportSuperLoginViewModel.this, (access13800) this);
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DevSupportSuperLoginViewModel.onNavigationEvent(DevSupportSuperLoginViewModel.this, null, this);
        }
    }

    static {
        onExtraCallbackWithResult();
        Companion = new onNavigationEvent(null);
        onNavigationEvent = 8;
        int i = IAuthTabCallbackDefault + 35;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = (~(i7 | i)) | i2;
        int i9 = ~i2;
        int i10 = ~(i9 | i | i5);
        int i11 = (~(i5 | i9)) | i | (~(i7 | i2));
        int i12 = i + i2 + i4 + ((-381402339) * i3) + ((-2062754392) * i6);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i) + 1063714816 + (1288888451 * i2) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i4) + (1454768128 * i3) + (808452096 * i6) + ((-1790509056) * i13);
        int i15 = ((i * (-1355236691)) - 921838429) + (i2 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i4 * (-1355236397)) + (i3 * (-1583251481)) + (i6 * 1682205048) + (i13 * (-427491328));
        return i14 + ((i15 * i15) * 844169216) != 1 ? onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    @Inject
    public DevSupportSuperLoginViewModel(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @NotNull setSegmentCollection setsegmentcollection, @NotNull setAdUnitIds setadunitids, @NotNull SessionState sessionState) {
        Uri uri;
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        Intrinsics.checkNotNullParameter(setsegmentcollection, "");
        Intrinsics.checkNotNullParameter(setadunitids, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        this.onExtraCallbackWithResult = setsegmentcollection;
        this.IAuthTabCallback = setadunitids;
        this.onWarmupCompleted = sessionState;
        this.onExtraCallback = new Rmipmap<>();
        String str = (String) textLinkScopeExternalSyntheticLambda7.onExtraCallback("EXTRA_URI");
        if (str != null) {
            uri = Uri.parse(str);
            int i = IAuthTabCallbackStub + 119;
            onTransact = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        } else {
            int i3 = 2 % 2;
            uri = null;
        }
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(uri, null), 3, (Object) null);
        int i4 = onTransact + 31;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Object IAuthTabCallback(DevSupportSuperLoginViewModel devSupportSuperLoginViewModel, String str, access13800 access13800Var) throws TossApiCallException.ApiError {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            devSupportSuperLoginViewModel.IAuthTabCallback(str, (access13800<? super DevSupportSuperLoginResponse>) access13800Var);
            throw null;
        }
        Object objIAuthTabCallback = devSupportSuperLoginViewModel.IAuthTabCallback(str, (access13800<? super DevSupportSuperLoginResponse>) access13800Var);
        int i3 = onTransact + 47;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return objIAuthTabCallback;
    }

    public static final /* synthetic */ Object IAuthTabCallback(DevSupportSuperLoginViewModel devSupportSuperLoginViewModel, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = devSupportSuperLoginViewModel.onExtraCallbackWithResult((access13800<? super Unit>) access13800Var);
        int i4 = onTransact + 123;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Object onNavigationEvent(DevSupportSuperLoginViewModel devSupportSuperLoginViewModel, Uri uri, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return devSupportSuperLoginViewModel.onNavigationEvent(uri, access13800Var);
        }
        devSupportSuperLoginViewModel.onNavigationEvent(uri, access13800Var);
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        DevSupportSuperLoginViewModel devSupportSuperLoginViewModel = (DevSupportSuperLoginViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 23;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Rmipmap<asset> rmipmap = devSupportSuperLoginViewModel.onExtraCallback;
        int i5 = i2 + 59;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return rmipmap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: viva.republica.toss.guest.DevSupportSuperLoginViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ Uri $uri;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Uri uri, access13800<? super AnonymousClass5> access13800Var) {
            super(2, access13800Var);
            this.$uri = uri;
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return DevSupportSuperLoginViewModel.this.new AnonymousClass5(this.$uri, access13800Var);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        
            if (r11 == r0) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L32
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r10.L$0
                o.access13800 r0 = (o.access13800) r0
                kotlin.ResultKt.onNavigationEvent(r11)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                goto L6d
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                int r1 = r10.I$1
                int r3 = r10.I$0
                java.lang.Object r4 = r10.L$2
                o.access13800 r4 = (o.access13800) r4
                java.lang.Object r5 = r10.L$1
                android.net.Uri r5 = (android.net.Uri) r5
                java.lang.Object r6 = r10.L$0
                viva.republica.toss.guest.DevSupportSuperLoginViewModel r6 = (viva.republica.toss.guest.DevSupportSuperLoginViewModel) r6
                kotlin.ResultKt.onNavigationEvent(r11)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                goto L55
            L32:
                kotlin.ResultKt.onNavigationEvent(r11)
                viva.republica.toss.guest.DevSupportSuperLoginViewModel r6 = viva.republica.toss.guest.DevSupportSuperLoginViewModel.this
                android.net.Uri r5 = r10.$uri
                kotlin.Result$Companion r11 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r10.L$0 = r6     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r10.L$1 = r5     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                java.lang.Object r11 = o.access15400.onNavigationEvent(r10)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r10.L$2 = r11     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r1 = 0
                r10.I$0 = r1     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r10.I$1 = r1     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r10.label = r3     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                java.lang.Object r11 = viva.republica.toss.guest.DevSupportSuperLoginViewModel.IAuthTabCallback(r6, r10)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                if (r11 != r0) goto L53
                goto L6c
            L53:
                r4 = r10
                r3 = r1
            L55:
                java.lang.Object r11 = o.access15400.onNavigationEvent(r4)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r10.L$0 = r11     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r11 = 0
                r10.L$1 = r11     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r10.L$2 = r11     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r10.I$0 = r3     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r10.I$1 = r1     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                r10.label = r2     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                java.lang.Object r11 = viva.republica.toss.guest.DevSupportSuperLoginViewModel.onNavigationEvent(r6, r5, r10)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                if (r11 != r0) goto L6d
            L6c:
                return r0
            L6d:
                java.lang.Object r11 = kotlin.Result.constructor-impl(r11)     // Catch: java.lang.Exception -> L72 java.util.concurrent.CancellationException -> L7e o.WebResourceResponseModel -> L80
                goto L8b
            L72:
                r11 = move-exception
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
                java.lang.Object r11 = kotlin.Result.constructor-impl(r11)
                goto L8b
            L7e:
                r11 = move-exception
                throw r11
            L80:
                r11 = move-exception
                kotlin.Result$Companion r0 = kotlin.Result.Companion
                java.lang.Object r11 = kotlin.ResultKt.createFailure(r11)
                java.lang.Object r11 = kotlin.Result.constructor-impl(r11)
            L8b:
                viva.republica.toss.guest.DevSupportSuperLoginViewModel r0 = viva.republica.toss.guest.DevSupportSuperLoginViewModel.this
                boolean r1 = kotlin.Result.onNavigationEvent(r11)
                if (r1 == 0) goto Lb9
                r1 = r11
                o.asset r1 = (o.asset) r1
                java.lang.Object[] r7 = new java.lang.Object[]{r0}
                int r6 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
                int r5 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
                int r4 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
                int r8 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
                r2 = 516619973(0x1ecafec5, float:2.1492952E-20)
                r3 = -516619973(0xffffffffe135013b, float:-2.0868433E20)
                java.lang.Object r0 = viva.republica.toss.guest.DevSupportSuperLoginViewModel.IAuthTabCallback(r2, r3, r4, r5, r6, r7, r8)
                o.Rmipmap r0 = (o.Rmipmap) r0
                r0.setValue(r1)
            Lb9:
                viva.republica.toss.guest.DevSupportSuperLoginViewModel r0 = viva.republica.toss.guest.DevSupportSuperLoginViewModel.this
                java.lang.Throwable r11 = kotlin.Result.exceptionOrNull-impl(r11)
                if (r11 == 0) goto Led
                o.ConvertFloatArrayToByteArray r1 = o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult
                java.lang.String r2 = "DevSupportSuperLogin"
                r1.IAuthTabCallback(r2, r11)
                java.lang.Object[] r8 = new java.lang.Object[]{r0}
                int r7 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
                int r6 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
                int r5 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
                int r9 = com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.onExtraCallbackWithResult()
                r3 = 516619973(0x1ecafec5, float:2.1492952E-20)
                r4 = -516619973(0xffffffffe135013b, float:-2.0868433E20)
                java.lang.Object r11 = viva.republica.toss.guest.DevSupportSuperLoginViewModel.IAuthTabCallback(r3, r4, r5, r6, r7, r8, r9)
                o.Rmipmap r11 = (o.Rmipmap) r11
                o.asset$onWarmupCompleted r0 = o.asset.onWarmupCompleted.onExtraCallback
                r11.setValue(r0)
            Led:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.DevSupportSuperLoginViewModel.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        DevSupportSuperLoginViewModel devSupportSuperLoginViewModel = (DevSupportSuperLoginViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 7;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            devSupportSuperLoginViewModel.onWarmupCompleted.IAuthTabCallback_Parcel();
            devSupportSuperLoginViewModel.onExtraCallback.setValue(asset.onExtraCallbackWithResult.onNavigationEvent);
            int i3 = onTransact + 97;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        devSupportSuperLoginViewModel.onWarmupCompleted.IAuthTabCallback_Parcel();
        devSupportSuperLoginViewModel.onExtraCallback.setValue(asset.onExtraCallbackWithResult.onNavigationEvent);
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@NotNull Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("DevSupportSuperLogin", th);
        this.onExtraCallback.setValue(asset.onWarmupCompleted.onExtraCallback);
        int i4 = onTransact + 101;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallbackWithResult(o.access13800<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r7 instanceof viva.republica.toss.guest.DevSupportSuperLoginViewModel.onExtraCallback
            r2 = 99
            if (r1 == 0) goto L27
            r1 = r7
            viva.republica.toss.guest.DevSupportSuperLoginViewModel$onExtraCallback r1 = (viva.republica.toss.guest.DevSupportSuperLoginViewModel.onExtraCallback) r1
            int r3 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L27
            int r7 = viva.republica.toss.guest.DevSupportSuperLoginViewModel.IAuthTabCallbackStub
            int r7 = r7 + r2
            int r5 = r7 % 128
            viva.republica.toss.guest.DevSupportSuperLoginViewModel.onTransact = r5
            int r7 = r7 % r0
            if (r7 != 0) goto L23
            int r7 = r3 << r4
            r1.label = r7
            goto L2c
        L23:
            int r3 = r3 + r4
            r1.label = r3
            goto L2c
        L27:
            viva.republica.toss.guest.DevSupportSuperLoginViewModel$onExtraCallback r1 = new viva.republica.toss.guest.DevSupportSuperLoginViewModel$onExtraCallback
            r1.<init>(r7)
        L2c:
            java.lang.Object r7 = r1.result
            java.lang.Object r3 = o.access14300.onWarmupCompleted()
            int r4 = r1.label
            r5 = 1
            if (r4 == 0) goto L45
            if (r4 != r5) goto L3d
            kotlin.ResultKt.onNavigationEvent(r7)
            goto L7d
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L45:
            kotlin.ResultKt.onNavigationEvent(r7)
            o.setAdUnitIds r7 = r6.IAuthTabCallback
            boolean r7 = r7.IAuthTabCallback()
            if (r7 != 0) goto L87
            int r7 = viva.republica.toss.guest.DevSupportSuperLoginViewModel.IAuthTabCallbackStub
            int r7 = r7 + 67
            int r4 = r7 % 128
            viva.republica.toss.guest.DevSupportSuperLoginViewModel.onTransact = r4
            int r7 = r7 % r0
            if (r7 != 0) goto L66
            o.setSegmentCollection r7 = r6.onExtraCallbackWithResult
            boolean r7 = r7.onNavigationEvent()
            int r2 = r2 / 0
            if (r7 != 0) goto L7d
            goto L6e
        L66:
            o.setSegmentCollection r7 = r6.onExtraCallbackWithResult
            boolean r7 = r7.onNavigationEvent()
            if (r7 == r5) goto L7d
        L6e:
            viva.republica.toss.guest.certify.CertifyGuestViewModel$onWarmupCompleted r7 = viva.republica.toss.guest.certify.CertifyGuestViewModel.Companion
            o.writeRaw r7 = r7.onExtraCallback()
            r1.label = r5
            java.lang.Object r7 = kotlinx.coroutines.rx2.RxAwaitKt.onWarmupCompleted(r7, r1)
            if (r7 != r3) goto L7d
            return r3
        L7d:
            im.toss.state.spec.SessionState r7 = r6.onWarmupCompleted
            im.toss.state.spec.SessionState$Event$OnInitialize r0 = im.toss.state.spec.SessionState.Event.OnInitialize.onExtraCallback
            r7.onWarmupCompleted(r0)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L87:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Dev support super login is only available before login"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.DevSupportSuperLoginViewModel.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onNavigationEvent(android.net.Uri r8, o.access13800<? super o.asset> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.DevSupportSuperLoginViewModel.onNavigationEvent(android.net.Uri, o.access13800):java.lang.Object");
    }

    private final asset.onNavigationEvent onWarmupCompleted(DevSupportSuperLoginResponse devSupportSuperLoginResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
            StringsKt.isBlank((String) DevSupportSuperLoginResponse.onExtraCallback(746991343, -746991342, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{devSupportSuperLoginResponse}));
            throw null;
        }
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        if (StringsKt.isBlank((String) DevSupportSuperLoginResponse.onExtraCallback(746991343, -746991342, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{devSupportSuperLoginResponse}))) {
            throw new IllegalStateException("Dev support super login needs login password hash to save private key");
        }
        if (StringsKt.isBlank(devSupportSuperLoginResponse.onWarmupCompleted())) {
            throw new IllegalStateException("Dev support super login needs auth password hash to save private key");
        }
        if (StringsKt.isBlank(devSupportSuperLoginResponse.asInterface())) {
            throw new IllegalStateException("Dev support super login needs internal cert to save private key");
        }
        int i3 = IAuthTabCallbackStub + 107;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Long lOnExtraCallbackWithResult = devSupportSuperLoginResponse.onExtraCallbackWithResult();
        if (lOnExtraCallbackWithResult == null) {
            throw new IllegalStateException("Required value was null.");
        }
        long jLongValue = lOnExtraCallbackWithResult.longValue();
        int iIAuthTabCallback3 = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        SignInResponse signInResponse = (SignInResponse) DevSupportSuperLoginResponse.onExtraCallback(665254114, -665254114, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback3, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{devSupportSuperLoginResponse, null, 1, null});
        int iIAuthTabCallback4 = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        asset.onNavigationEvent onnavigationevent = new asset.onNavigationEvent(jLongValue, signInResponse, (String) DevSupportSuperLoginResponse.onExtraCallback(746991343, -746991342, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback4, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), new Object[]{devSupportSuperLoginResponse}), devSupportSuperLoginResponse.onWarmupCompleted());
        int i5 = onTransact + 75;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return onnavigationevent;
    }

    private final void onExtraCallbackWithResult(CheckoutResult checkoutResult) throws Throwable {
        int i = 2 % 2;
        String strOnActivityResized = checkoutResult.onActivityResized();
        Object obj = null;
        if (StringsKt.isBlank(strOnActivityResized)) {
            strOnActivityResized = null;
        }
        if (strOnActivityResized != null) {
            createPaints createpaints = createPaints.IAuthTabCallback;
            createpaints.asInterface(strOnActivityResized);
            createpaints.onExtraCallbackWithResult(strOnActivityResized);
            PlayerErrorCode.onExtraCallback(strOnActivityResized);
            int i2 = onTransact + 11;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        String strExtraCallbackWithResult = checkoutResult.extraCallbackWithResult();
        if (StringsKt.isBlank(strExtraCallbackWithResult)) {
            int i4 = onTransact + 103;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            strExtraCallbackWithResult = null;
        }
        if (strExtraCallbackWithResult != null) {
            createPaints.IAuthTabCallback.onNavigationEvent(strExtraCallbackWithResult);
        }
        String strAsInterface = checkoutResult.asInterface();
        if (strAsInterface.length() < 6) {
            strAsInterface = null;
        }
        if (strAsInterface != null) {
            int i6 = IAuthTabCallbackStub + 115;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            String strTakeLast = StringsKt.takeLast(strAsInterface, 6);
            if (strTakeLast != null) {
                createPaints.IAuthTabCallback.IAuthTabCallback(strTakeLast);
                int i8 = IAuthTabCallbackStub + 45;
                onTransact = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        Integer numValueOf = Integer.valueOf(checkoutResult.extraCallback());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            createPaints.IAuthTabCallback.onExtraCallback(String.valueOf(numValueOf.intValue()));
        }
        String strAsBinder = checkoutResult.asBinder();
        if (StringsKt.isBlank(strAsBinder)) {
            strAsBinder = null;
        }
        if (strAsBinder != null) {
            int i10 = IAuthTabCallbackStub + 93;
            onTransact = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    createPaints createpaints2 = createPaints.IAuthTabCallback;
                    Object obj2 = MobileCarrier.Companion;
                    Object[] objArr = {strAsBinder};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1901493767);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 45 - TextUtils.lastIndexOf("", '0', 0, 0), (-16770265) - Color.rgb(0, 0, 0), 1075216535, false, "onExtraCallback", new Class[]{String.class});
                    }
                    createpaints2.onNavigationEvent((MobileCarrier) ((Method) objOnExtraCallback).invoke(obj2, objArr));
                    return;
                }
                createPaints createpaints3 = createPaints.IAuthTabCallback;
                Object obj3 = MobileCarrier.Companion;
                Object[] objArr2 = {strAsBinder};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1901493767);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), ((Process.getThreadPriority(0) + 20) >> 6) + 46, 6952 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1075216535, false, "onExtraCallback", new Class[]{String.class});
                }
                createpaints3.onNavigationEvent((MobileCarrier) ((Method) objOnExtraCallback2).invoke(obj3, objArr2));
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(java.lang.String r14, o.access13800<? super viva.republica.toss.network.model.verify.guest.DevSupportSuperLoginResponse> r15) throws im.toss.network.throwable.TossApiCallException.ApiError {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.guest.DevSupportSuperLoginViewModel.IAuthTabCallback(java.lang.String, o.access13800):java.lang.Object");
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = asBinder;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - TextUtils.getCapsMode("", 0, 0)), 34 - TextUtils.lastIndexOf("", '0', 0), 14239 - TextUtils.getOffsetBefore("", 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $10 + 35;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10934), 65 - View.resolveSizeAndState(0, 0, 0), Process.getGidForName("") + 16719, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - Color.red(0), TextUtils.getOffsetAfter("", 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 49467), 69 - Process.getGidForName(""), 12486 - TextUtils.indexOf("", "", 0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            loop2: while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i12 = $11 + 79;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        break;
                    }
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(trackGroupExternalSyntheticLambda0.onNavigationEvent * i3) >>> 1];
                int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i14 = $11 + 31;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public final Rmipmap<asset> onExtraCallback() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        return (Rmipmap) IAuthTabCallback(516619973, -516619973, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    public final void onWarmupCompleted() {
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        IAuthTabCallback(636410288, -636410287, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, new Object[]{this}, TTVideoLandingPageActivity.onExtraCallbackWithResult());
    }

    static void onExtraCallbackWithResult() {
        asBinder = new char[]{27250, 27196, 27171, 27174, 27180, 27172, 27174};
    }
}
