package o;

import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.global.features.transfer.data.model.region.au.AuTransferInputAmountModel;
import im.toss.global.features.transfer.data.model.region.au.AuTransferInputDescriptionModel;
import im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel;
import im.toss.global.features.transfer.data.model.region.au.AuTransferInputReceiverModel;
import im.toss.global.features.transfer.data.model.region.au.AuTransferInputSenderModel;
import im.toss.global.features.transfer.data.model.region.au.AuTransferOutputModel;
import im.toss.global.features.transfer.data.model.region.au.AuTransferRefreshParamsRequest;
import im.toss.global.features.transfer.data.model.region.au.AuTransferSendRequest;
import im.toss.global.features.transfer.data.model.send.GlobalTransferSendResponse;
import im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse;
import im.toss.global.features.transfer.data.model.session.output.GlobalTransferSessionOutputBaseResponse;
import im.toss.global.features.transfer.domain.account.au.AuAccountModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class WebRenderBridge1 {
    private static int onActivityLayout = 1;
    private static int onActivityResized = 1;
    private static int onMinimized;
    private static int writeTypedObject;
    private final getCornerRadius<AuTransferInputModel> IAuthTabCallback;
    private final MiniWebView1 IAuthTabCallbackDefault;
    private final getCornerRadius<GlobalTransferSessionResponse<AuTransferInputModel, AuTransferOutputModel>> IAuthTabCallbackStub;
    private final setRubIn<AuTransferSendRequest> IAuthTabCallbackStubProxy;
    private final setRubIn<GlobalTransferSendResponse<AuAccountModel, AuTransferInputAmountModel>> IAuthTabCallback_Parcel;
    private TextLinkScopeExternalSyntheticLambda7 ICustomTabsCallback;
    private final setRubIn<AuTransferOutputModel> access000;
    private final setRubIn<AuTransferInputModel> access100;
    private final getCornerRadius<GlobalTransferSendResponse<AuAccountModel, AuTransferInputAmountModel>> asBinder;
    private final getCornerRadius<AuTransferSendRequest> asInterface;
    private final findResAndMsg extraCallback;
    private final setRubIn<GlobalTransferSessionResponse<AuTransferInputModel, AuTransferOutputModel>> extraCallbackWithResult;
    private final setRubIn<List<back>> getInterfaceDescriptor;
    private final getCornerRadius<AuTransferOutputModel> onExtraCallback;
    private String onExtraCallbackWithResult;
    private final getCornerRadius<Integer> onTransact;
    private final getCornerRadius<List<back>> onWarmupCompleted;
    private final setRubIn<Integer> readTypedObject;
    private static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    public static final int onNavigationEvent = 8;

    static {
        int i = onActivityResized + 55;
        writeTypedObject = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = ~((~i3) | i9);
        int i11 = ~(i9 | i4);
        int i12 = i10 | i11;
        int i13 = (~(i3 | i7)) | i11 | i8;
        int i14 = i + i4 + i6 + ((-168536539) * i2) + (1787681333 * i5);
        int i15 = i14 * i14;
        int i16 = ((-1349843359) * i) + 1460535296 + ((-923239215) * i4) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i6) + (1604583424 * i2) + (216268800 * i5) + (1778253824 * i15);
        int i17 = (i * (-925914073)) + 175428941 + (i4 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i6 * (-925913209)) + (i2 * 1252505731) + (i5 * 30625011) + (i15 * (-2030960640));
        return i16 + ((i17 * i17) * 899809280) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    @Inject
    public WebRenderBridge1(@NotNull MiniWebView1 miniWebView1) {
        Intrinsics.checkNotNullParameter(miniWebView1, "");
        this.IAuthTabCallbackDefault = miniWebView1;
        this.extraCallback = findRes.onWarmupCompleted(isNeedUnzip.onExtraCallbackWithResult((getPackageType) null, 1, (Object) null).plus(putChannelInfo.IAuthTabCallback()));
        getCornerRadius<Integer> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(-1);
        this.onTransact = getcornerradiusOnNavigationEvent;
        this.readTypedObject = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent);
        getCornerRadius<GlobalTransferSessionResponse<AuTransferInputModel, AuTransferOutputModel>> getcornerradiusOnNavigationEvent2 = setShine.onNavigationEvent((Object) null);
        this.IAuthTabCallbackStub = getcornerradiusOnNavigationEvent2;
        this.extraCallbackWithResult = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent2);
        getCornerRadius<AuTransferInputModel> getcornerradiusOnNavigationEvent3 = setShine.onNavigationEvent(new AuTransferInputModel((AuTransferInputSenderModel) null, (AuTransferInputReceiverModel) null, (AuTransferInputAmountModel) null, (AuTransferInputDescriptionModel) null, 15, (DefaultConstructorMarker) null));
        this.IAuthTabCallback = getcornerradiusOnNavigationEvent3;
        this.access100 = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent3);
        getCornerRadius<AuTransferOutputModel> getcornerradiusOnNavigationEvent4 = setShine.onNavigationEvent(new AuTransferOutputModel((GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, 255, (DefaultConstructorMarker) null));
        this.onExtraCallback = getcornerradiusOnNavigationEvent4;
        this.access000 = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent4);
        getCornerRadius<List<back>> getcornerradiusOnNavigationEvent5 = setShine.onNavigationEvent(CollectionsKt.emptyList());
        this.onWarmupCompleted = getcornerradiusOnNavigationEvent5;
        this.getInterfaceDescriptor = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent5);
        getCornerRadius<AuTransferSendRequest> getcornerradiusOnNavigationEvent6 = setShine.onNavigationEvent((Object) null);
        this.asInterface = getcornerradiusOnNavigationEvent6;
        this.IAuthTabCallbackStubProxy = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent6);
        getCornerRadius<GlobalTransferSendResponse<AuAccountModel, AuTransferInputAmountModel>> getcornerradiusOnNavigationEvent7 = setShine.onNavigationEvent((Object) null);
        this.asBinder = getcornerradiusOnNavigationEvent7;
        this.IAuthTabCallback_Parcel = ycxycx.onExtraCallback(getcornerradiusOnNavigationEvent7);
    }

    public static final /* synthetic */ getCornerRadius IAuthTabCallback(WebRenderBridge1 webRenderBridge1) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 35;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        getCornerRadius<AuTransferInputModel> getcornerradius = webRenderBridge1.IAuthTabCallback;
        int i5 = i2 + 65;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return getcornerradius;
    }

    public static final /* synthetic */ AuTransferRefreshParamsRequest onWarmupCompleted(WebRenderBridge1 webRenderBridge1, List list) {
        int i = 2 % 2;
        int i2 = onMinimized + 49;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return webRenderBridge1.onWarmupCompleted((List<? extends back>) list);
        }
        webRenderBridge1.onWarmupCompleted((List<? extends back>) list);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ MiniWebView1 onWarmupCompleted(WebRenderBridge1 webRenderBridge1) {
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 83;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        MiniWebView1 miniWebView1 = webRenderBridge1.IAuthTabCallbackDefault;
        int i5 = i2 + 81;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return miniWebView1;
    }

    public setRubIn<Integer> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onMinimized + 119;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        setRubIn<Integer> setrubin = this.readTypedObject;
        int i5 = i3 + 67;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return setrubin;
    }

    public setRubIn<AuTransferInputModel> onWarmupCompleted() {
        setRubIn<AuTransferInputModel> setrubin;
        int i = 2 % 2;
        int i2 = onMinimized;
        int i3 = i2 + 7;
        onActivityLayout = i3 % 128;
        if (i3 % 2 == 0) {
            setrubin = this.access100;
            int i4 = 25 / 0;
        } else {
            setrubin = this.access100;
        }
        int i5 = i2 + 71;
        onActivityLayout = i5 % 128;
        if (i5 % 2 != 0) {
            return setrubin;
        }
        throw null;
    }

    public setRubIn<AuTransferOutputModel> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 31;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        setRubIn<AuTransferOutputModel> setrubin = this.access000;
        int i4 = i2 + 103;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return setrubin;
    }

    public setRubIn<List<back>> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 87;
        onMinimized = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        setRubIn<List<back>> setrubin = this.getInterfaceDescriptor;
        int i4 = i2 + 111;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        return setrubin;
    }

    public final setRubIn<GlobalTransferSendResponse<AuAccountModel, AuTransferInputAmountModel>> onTransact() {
        int i = 2 % 2;
        int i2 = onMinimized + 109;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback_Parcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 1;
        int i3 = i2 % 128;
        onMinimized = i3;
        int i4 = i2 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i3 + 49;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void onExtraCallbackWithResult(@NotNull TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7, @Nullable String str) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(textLinkScopeExternalSyntheticLambda7, "");
        if (this.ICustomTabsCallback == null) {
            this.ICustomTabsCallback = textLinkScopeExternalSyntheticLambda7;
            this.onExtraCallbackWithResult = str;
            Integer num = (Integer) textLinkScopeExternalSyntheticLambda7.onExtraCallback("global_transfer_session_id");
            if (num != null) {
                int i2 = onMinimized + 113;
                onActivityLayout = i2 % 128;
                if (i2 % 2 == 0) {
                    num.intValue();
                    throw null;
                }
                iIntValue = num.intValue();
                int i3 = onMinimized + 107;
                onActivityLayout = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 5 / 3;
                }
            } else {
                int i5 = onMinimized + 31;
                onActivityLayout = i5 % 128;
                int i6 = i5 % 2;
                iIntValue = -1;
            }
            if (iIntValue != -1) {
                this.onTransact.onWarmupCompleted(Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel r7, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse<im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel, im.toss.global.features.transfer.data.model.region.au.AuTransferOutputModel>>> r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r8 instanceof o.WebRenderBridge1.onExtraCallback
            if (r1 == 0) goto L16
            r1 = r8
            o.WebRenderBridge1$onExtraCallback r1 = (o.WebRenderBridge1.onExtraCallback) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.label = r2
            goto L1b
        L16:
            o.WebRenderBridge1$onExtraCallback r1 = new o.WebRenderBridge1$onExtraCallback
            r1.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L4a
            int r7 = o.WebRenderBridge1.onMinimized
            int r7 = r7 + 101
            int r2 = r7 % 128
            o.WebRenderBridge1.onActivityLayout = r2
            int r7 = r7 % r0
            if (r7 != 0) goto L34
            if (r3 != r4) goto L42
            goto L36
        L34:
            if (r3 != r4) goto L42
        L36:
            java.lang.Object r7 = r1.L$1
            o.access13800 r7 = (o.access13800) r7
            java.lang.Object r7 = r1.L$0
            im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel r7 = (im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel) r7
            kotlin.ResultKt.onNavigationEvent(r8)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            goto L75
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L4a:
            kotlin.ResultKt.onNavigationEvent(r8)
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            o.GeckoHubImp r8 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            o.WebRenderBridge1$IAuthTabCallback r3 = new o.WebRenderBridge1$IAuthTabCallback     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r5 = 0
            r3.<init>(r5, r6, r7)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            java.lang.Object r7 = o.access15400.onNavigationEvent(r7)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.L$0 = r7     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            java.lang.Object r7 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.L$1 = r7     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r7 = 0
            r1.I$0 = r7     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.I$1 = r7     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.I$2 = r7     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.label = r4     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            java.lang.Object r8 = o.maybeUpdateAnimatable.onExtraCallback(r8, r3, r1)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            if (r8 != r2) goto L75
            return r2
        L75:
            java.lang.Object r7 = kotlin.Result.constructor-impl(r8)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            goto L9c
        L7a:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            goto L9c
        L86:
            r7 = move-exception
            throw r7
        L88:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            int r8 = o.WebRenderBridge1.onMinimized
            int r8 = r8 + 95
            int r1 = r8 % 128
            o.WebRenderBridge1.onActivityLayout = r1
            int r8 = r8 % r0
        L9c:
            boolean r8 = kotlin.Result.onNavigationEvent(r7)
            if (r8 == 0) goto La8
            r8 = r7
            im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse r8 = (im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse) r8
            r6.onWarmupCompleted(r8)
        La8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge1.onNavigationEvent(im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object IAuthTabCallback(int r8, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse<im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel, im.toss.global.features.transfer.data.model.region.au.AuTransferOutputModel>>> r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r9 instanceof o.WebRenderBridge1.asInterface
            if (r1 == 0) goto L16
            r1 = r9
            o.WebRenderBridge1$asInterface r1 = (o.WebRenderBridge1.asInterface) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.label = r2
            goto L1b
        L16:
            o.WebRenderBridge1$asInterface r1 = new o.WebRenderBridge1$asInterface
            r1.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L4f
            if (r3 != r4) goto L47
            int r8 = o.WebRenderBridge1.onActivityLayout
            int r8 = r8 + 45
            int r2 = r8 % 128
            o.WebRenderBridge1.onMinimized = r2
            int r8 = r8 % r0
            if (r8 == 0) goto L3f
            java.lang.Object r8 = r1.L$0
            o.access13800 r8 = (o.access13800) r8
            kotlin.ResultKt.onNavigationEvent(r9)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r8 = 61
            int r8 = r8 / r5
            goto L75
        L3f:
            java.lang.Object r8 = r1.L$0
            o.access13800 r8 = (o.access13800) r8
            kotlin.ResultKt.onNavigationEvent(r9)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            goto L75
        L47:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4f:
            kotlin.ResultKt.onNavigationEvent(r9)
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            o.GeckoHubImp r9 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            o.WebRenderBridge1$onTransact r3 = new o.WebRenderBridge1$onTransact     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r6 = 0
            r3.<init>(r6, r7, r8)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            java.lang.Object r6 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.L$0 = r6     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.I$0 = r8     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.I$1 = r5     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.I$2 = r5     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.I$3 = r5     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            r1.label = r4     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            java.lang.Object r9 = o.maybeUpdateAnimatable.onExtraCallback(r9, r3, r1)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            if (r9 != r2) goto L75
            return r2
        L75:
            java.lang.Object r8 = kotlin.Result.constructor-impl(r9)     // Catch: java.lang.Exception -> L7a java.util.concurrent.CancellationException -> L86 o.WebResourceResponseModel -> L88
            goto L9c
        L7a:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            goto L9c
        L86:
            r8 = move-exception
            throw r8
        L88:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.constructor-impl(r8)
            int r9 = o.WebRenderBridge1.onActivityLayout
            int r9 = r9 + 55
            int r1 = r9 % 128
            o.WebRenderBridge1.onMinimized = r1
            int r9 = r9 % r0
        L9c:
            boolean r9 = kotlin.Result.onNavigationEvent(r8)
            if (r9 == 0) goto Lbd
            int r9 = o.WebRenderBridge1.onMinimized
            int r9 = r9 + 3
            int r1 = r9 % 128
            o.WebRenderBridge1.onActivityLayout = r1
            int r9 = r9 % r0
            if (r9 != 0) goto Lb7
            r9 = r8
            im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse r9 = (im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse) r9
            r7.onWarmupCompleted(r9)
            r9 = 94
            int r9 = r9 / r5
            goto Lbd
        Lb7:
            r9 = r8
            im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse r9 = (im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse) r9
            r7.onWarmupCompleted(r9)
        Lbd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge1.IAuthTabCallback(int, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse<im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel, im.toss.global.features.transfer.data.model.region.au.AuTransferOutputModel>>> r9) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge1.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel r7, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse<im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel, im.toss.global.features.transfer.data.model.region.au.AuTransferOutputModel>>> r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.WebRenderBridge1.onActivityLayout
            int r1 = r1 + 69
            int r2 = r1 % 128
            o.WebRenderBridge1.onMinimized = r2
            int r1 = r1 % r0
            boolean r1 = r8 instanceof o.WebRenderBridge1.extraCallback
            if (r1 == 0) goto L28
            r1 = r8
            o.WebRenderBridge1$extraCallback r1 = (o.WebRenderBridge1.extraCallback) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L28
            int r8 = o.WebRenderBridge1.onMinimized
            int r8 = r8 + 33
            int r4 = r8 % 128
            o.WebRenderBridge1.onActivityLayout = r4
            int r8 = r8 % r0
            int r2 = r2 + r3
            r1.label = r2
            goto L2d
        L28:
            o.WebRenderBridge1$extraCallback r1 = new o.WebRenderBridge1$extraCallback
            r1.<init>(r6, r8)
        L2d:
            java.lang.Object r8 = r1.result
            java.lang.Object r0 = o.access14300.onWarmupCompleted()
            int r2 = r1.label
            r3 = 1
            if (r2 == 0) goto L4e
            if (r2 != r3) goto L46
            java.lang.Object r7 = r1.L$1
            o.access13800 r7 = (o.access13800) r7
            java.lang.Object r7 = r1.L$0
            im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel r7 = (im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel) r7
            kotlin.ResultKt.onNavigationEvent(r8)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            goto L8b
        L46:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L4e:
            kotlin.ResultKt.onNavigationEvent(r8)
            java.lang.Object r8 = r6.asBinder()
            java.lang.Throwable r2 = kotlin.Result.exceptionOrNull-impl(r8)
            if (r2 != 0) goto Lb6
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            o.GeckoHubImp r2 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            o.WebRenderBridge1$readTypedObject r4 = new o.WebRenderBridge1$readTypedObject     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            r5 = 0
            r4.<init>(r5, r6, r8, r7)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            java.lang.Object r7 = o.access15400.onNavigationEvent(r7)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            r1.L$0 = r7     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            java.lang.Object r7 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            r1.L$1 = r7     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            r1.I$0 = r8     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            r7 = 0
            r1.I$1 = r7     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            r1.I$2 = r7     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            r1.I$3 = r7     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            r1.label = r3     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            java.lang.Object r8 = o.maybeUpdateAnimatable.onExtraCallback(r2, r4, r1)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            if (r8 != r0) goto L8b
            return r0
        L8b:
            java.lang.Object r7 = kotlin.Result.constructor-impl(r8)     // Catch: java.lang.Exception -> L90 java.util.concurrent.CancellationException -> L9c o.WebResourceResponseModel -> L9e
            goto La9
        L90:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            goto La9
        L9c:
            r7 = move-exception
            throw r7
        L9e:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
        La9:
            boolean r8 = kotlin.Result.onNavigationEvent(r7)
            if (r8 == 0) goto Lb5
            r8 = r7
            im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse r8 = (im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse) r8
            r6.onWarmupCompleted(r8)
        Lb5:
            return r7
        Lb6:
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge1.onWarmupCompleted(im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel, o.access13800):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull java.util.List<? extends o.back> r9, @org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.session.GlobalTransferSessionResponse<im.toss.global.features.transfer.data.model.region.au.AuTransferInputModel, im.toss.global.features.transfer.data.model.region.au.AuTransferOutputModel>>> r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge1.onNavigationEvent(java.util.List, o.access13800):java.lang.Object");
    }

    public void onWarmupCompleted(@Nullable String str) {
        AuTransferInputDescriptionModel auTransferInputDescriptionModel;
        int i = 2 % 2;
        int i2 = onActivityLayout + 61;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        getCornerRadius<AuTransferInputModel> getcornerradius = this.IAuthTabCallback;
        AuTransferInputModel auTransferInputModel = (AuTransferInputModel) getcornerradius.IAuthTabCallback();
        if (str != null) {
            auTransferInputDescriptionModel = new AuTransferInputDescriptionModel(str);
        } else {
            int i4 = onMinimized + 29;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            auTransferInputDescriptionModel = null;
        }
        getcornerradius.onWarmupCompleted(AuTransferInputModel.onExtraCallback(auTransferInputModel, (AuTransferInputSenderModel) null, (AuTransferInputReceiverModel) null, (AuTransferInputAmountModel) null, auTransferInputDescriptionModel, 7, (Object) null));
    }

    public void asInterface() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 119;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        if (((Number) IAuthTabCallbackDefault().IAuthTabCallback()).intValue() != -1) {
            maybeUpdateAnimatable.onNavigationEvent(this.extraCallback, (CoroutineContext) null, (setRandomHost) null, new access000(this, (access13800) null), 3, (Object) null);
            return;
        }
        int i4 = onMinimized + 41;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
    }

    public void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 7;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        if (((Number) IAuthTabCallbackDefault().IAuthTabCallback()).intValue() == -1) {
            return;
        }
        maybeUpdateAnimatable.onNavigationEvent(this.extraCallback, (CoroutineContext) null, (setRandomHost) null, new getInterfaceDescriptor(this, (access13800) null), 3, (Object) null);
        int i4 = onMinimized + 29;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public List<back> onNavigationEvent(@NotNull AuTransferOutputModel auTransferOutputModel) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 23;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(auTransferOutputModel, "");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.addAll(WebBridgeResponse.onWarmupCompleted(auTransferOutputModel));
        if (!(!(auTransferOutputModel.IAuthTabCallbackStub() instanceof GlobalTransferSessionOutputBaseResponse.Fail))) {
            listCreateListBuilder.add(back.SENDER_DIRECT_DEBIT_AGREEMENT);
        }
        if (auTransferOutputModel.onTransact() instanceof GlobalTransferSessionOutputBaseResponse.Fail) {
            listCreateListBuilder.add(back.SENDER_WITHDRAWAL_SUPPORT);
        }
        List<back> listBuild = CollectionsKt.build(listCreateListBuilder);
        int i4 = onMinimized + 27;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return listBuild;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        r8.onWarmupCompleted.onWarmupCompleted(kotlin.collections.CollectionsKt.emptyList());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r9.isEmpty() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r9.isEmpty() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        o.maybeUpdateAnimatable.onNavigationEvent(r8.extraCallback, (kotlin.coroutines.CoroutineContext) null, (o.setRandomHost) null, new o.WebRenderBridge1.writeTypedObject(r8, r9, (o.access13800) null), 3, (java.lang.Object) null);
        r9 = o.WebRenderBridge1.onMinimized + 27;
        o.WebRenderBridge1.onActivityLayout = r9 % 128;
        r9 = r9 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onExtraCallbackWithResult(@org.jetbrains.annotations.NotNull java.util.List<? extends o.back> r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.WebRenderBridge1.onMinimized
            int r1 = r1 + 37
            int r2 = r1 % 128
            o.WebRenderBridge1.onActivityLayout = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 42
            int r2 = r2 / 0
            if (r1 != 0) goto L46
            goto L2d
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L46
        L2d:
            o.findResAndMsg r2 = r8.extraCallback
            r3 = 0
            r4 = 0
            o.WebRenderBridge1$writeTypedObject r5 = new o.WebRenderBridge1$writeTypedObject
            r1 = 0
            r5.<init>(r8, r9, r1)
            r6 = 3
            r7 = 0
            o.maybeUpdateAnimatable.onNavigationEvent(r2, r3, r4, r5, r6, r7)
            int r9 = o.WebRenderBridge1.onMinimized
            int r9 = r9 + 27
            int r1 = r9 % 128
            o.WebRenderBridge1.onActivityLayout = r1
            int r9 = r9 % r0
            return
        L46:
            o.getCornerRadius<java.util.List<o.back>> r9 = r8.onWarmupCompleted
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r9.onWarmupCompleted(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge1.onExtraCallbackWithResult(java.util.List):void");
    }

    public void onNavigationEvent() {
        int i = 2 % 2;
        this.onTransact.onWarmupCompleted(-1);
        this.IAuthTabCallbackStub.onWarmupCompleted((Object) null);
        this.IAuthTabCallback.onWarmupCompleted(new AuTransferInputModel((AuTransferInputSenderModel) null, (AuTransferInputReceiverModel) null, (AuTransferInputAmountModel) null, (AuTransferInputDescriptionModel) null, 15, (DefaultConstructorMarker) null));
        this.onExtraCallback.onWarmupCompleted(new AuTransferOutputModel((GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, (GlobalTransferSessionOutputBaseResponse) null, 255, (DefaultConstructorMarker) null));
        this.onWarmupCompleted.onWarmupCompleted(CollectionsKt.emptyList());
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = this.ICustomTabsCallback;
        if (textLinkScopeExternalSyntheticLambda7 != null) {
            int i2 = onActivityLayout + 9;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            int i4 = onMinimized + 113;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onExtraCallback(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.region.au.AuTransferPrepareResponse>> r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r7 instanceof o.WebRenderBridge1.IAuthTabCallbackDefault
            if (r1 == 0) goto L1f
            int r1 = o.WebRenderBridge1.onActivityLayout
            int r1 = r1 + 125
            int r2 = r1 % 128
            o.WebRenderBridge1.onMinimized = r2
            int r1 = r1 % r0
            r1 = r7
            o.WebRenderBridge1$IAuthTabCallbackDefault r1 = (o.WebRenderBridge1.IAuthTabCallbackDefault) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.label = r2
            goto L24
        L1f:
            o.WebRenderBridge1$IAuthTabCallbackDefault r1 = new o.WebRenderBridge1$IAuthTabCallbackDefault
            r1.<init>(r6, r7)
        L24:
            java.lang.Object r7 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L39
            java.lang.Object r1 = r1.L$0
            o.access13800 r1 = (o.access13800) r1
            kotlin.ResultKt.onNavigationEvent(r7)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            goto L66
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L41:
            kotlin.ResultKt.onNavigationEvent(r7)
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            o.GeckoHubImp r7 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            o.WebRenderBridge1$access100 r3 = new o.WebRenderBridge1$access100     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            r5 = 0
            r3.<init>(r5, r6)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            java.lang.Object r5 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            r1.L$0 = r5     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            r5 = 0
            r1.I$0 = r5     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            r1.I$1 = r5     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            r1.I$2 = r5     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            r1.label = r4     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            java.lang.Object r7 = o.maybeUpdateAnimatable.onExtraCallback(r7, r3, r1)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            if (r7 != r2) goto L66
            return r2
        L66:
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L80 o.WebResourceResponseModel -> L82
            goto L8d
        L6b:
            r7 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            int r1 = o.WebRenderBridge1.onActivityLayout
            int r1 = r1 + 59
            int r2 = r1 % 128
            o.WebRenderBridge1.onMinimized = r2
            int r1 = r1 % r0
            goto L8d
        L80:
            r7 = move-exception
            throw r7
        L82:
            r7 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
        L8d:
            boolean r1 = kotlin.Result.onNavigationEvent(r7)
            if (r1 == 0) goto Lae
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            im.toss.global.features.transfer.data.model.send.GlobalTransferPrepareResponse r7 = (im.toss.global.features.transfer.data.model.send.GlobalTransferPrepareResponse) r7
            im.toss.global.features.transfer.data.model.region.au.AuTransferPrepareResponse r1 = new im.toss.global.features.transfer.data.model.region.au.AuTransferPrepareResponse
            im.toss.global.features.transfer.data.model.send.GlobalTransferCertModel r2 = r7.onExtraCallbackWithResult()
            im.toss.global.features.transfer.data.model.send.GlobalTransferFramlModel r7 = r7.onNavigationEvent()
            r1.<init>(r2, r7)
            int r7 = o.WebRenderBridge1.onMinimized
            int r7 = r7 + 49
            int r2 = r7 % 128
            o.WebRenderBridge1.onActivityLayout = r2
            int r7 = r7 % r0
            r7 = r1
        Lae:
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge1.onExtraCallback(o.access13800):java.lang.Object");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        WebRenderBridge1 webRenderBridge1 = (WebRenderBridge1) objArr[0];
        AuTransferSendRequest auTransferSendRequest = (AuTransferSendRequest) objArr[1];
        int i = 2 % 2;
        int i2 = onActivityLayout + 57;
        onMinimized = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(auTransferSendRequest, "");
            webRenderBridge1.asInterface.onWarmupCompleted(auTransferSendRequest);
            TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = webRenderBridge1.ICustomTabsCallback;
            throw null;
        }
        Intrinsics.checkNotNullParameter(auTransferSendRequest, "");
        webRenderBridge1.asInterface.onWarmupCompleted(auTransferSendRequest);
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda72 = webRenderBridge1.ICustomTabsCallback;
        if (textLinkScopeExternalSyntheticLambda72 != null) {
            textLinkScopeExternalSyntheticLambda72.onWarmupCompleted("au_transfer_request", auTransferSendRequest);
            int i3 = onActivityLayout + 11;
            onMinimized = i3 % 128;
            int i4 = i3 % 2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onWarmupCompleted(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<kotlin.Unit>> r9) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge1.onWarmupCompleted(o.access13800):java.lang.Object");
    }

    private final void onWarmupCompleted(GlobalTransferSessionResponse<AuTransferInputModel, AuTransferOutputModel> globalTransferSessionResponse) {
        int i = 2 % 2;
        int i2 = onMinimized + 57;
        onActivityLayout = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(globalTransferSessionResponse.onWarmupCompleted());
            this.IAuthTabCallbackStub.onWarmupCompleted(globalTransferSessionResponse);
            this.IAuthTabCallback.onWarmupCompleted(globalTransferSessionResponse.IAuthTabCallback());
            this.onExtraCallback.onWarmupCompleted(globalTransferSessionResponse.onExtraCallbackWithResult());
            int i3 = onActivityLayout + 101;
            onMinimized = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        onExtraCallbackWithResult(globalTransferSessionResponse.onWarmupCompleted());
        this.IAuthTabCallbackStub.onWarmupCompleted(globalTransferSessionResponse);
        this.IAuthTabCallback.onWarmupCompleted(globalTransferSessionResponse.IAuthTabCallback());
        this.onExtraCallback.onWarmupCompleted(globalTransferSessionResponse.onExtraCallbackWithResult());
        throw null;
    }

    private final void onExtraCallbackWithResult(GlobalTransferSendResponse<? extends AuAccountModel, AuTransferInputAmountModel> globalTransferSendResponse) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 87;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        this.asBinder.onWarmupCompleted(globalTransferSendResponse);
        int i4 = onActivityLayout + 47;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        WebRenderBridge1 webRenderBridge1 = (WebRenderBridge1) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onMinimized + 17;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        webRenderBridge1.onTransact.onWarmupCompleted(Integer.valueOf(iIntValue));
        TextLinkScopeExternalSyntheticLambda7 textLinkScopeExternalSyntheticLambda7 = webRenderBridge1.ICustomTabsCallback;
        if (textLinkScopeExternalSyntheticLambda7 == null) {
            return null;
        }
        int i4 = onMinimized + 107;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        textLinkScopeExternalSyntheticLambda7.onWarmupCompleted("global_transfer_session_id", Integer.valueOf(iIntValue));
        return null;
    }

    private final Object asBinder() {
        int i = 2 % 2;
        Object objIAuthTabCallback = IAuthTabCallbackDefault().IAuthTabCallback();
        if (((Number) objIAuthTabCallback).intValue() == -1) {
            int i2 = onActivityLayout + 111;
            onMinimized = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            objIAuthTabCallback = null;
        }
        Integer num = (Integer) objIAuthTabCallback;
        if (num == null) {
            Result.Companion companion = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("Transfer session is not initialized.")));
        }
        int i3 = onMinimized + 107;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        int iIntValue = num.intValue();
        Result.Companion companion2 = Result.Companion;
        Object obj2 = Result.constructor-impl(Integer.valueOf(iIntValue));
        int i5 = onActivityLayout + 35;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
        return obj2;
    }

    private final AuTransferRefreshParamsRequest onWarmupCompleted(List<? extends back> list) {
        int i = 2 % 2;
        AuTransferRefreshParamsRequest auTransferRefreshParamsRequest = new AuTransferRefreshParamsRequest(list.contains(back.SENDER_ACCOUNT_META), list.contains(back.SENDER_BALANCE), list.contains(back.SENDER_DIRECT_DEBIT_AGREEMENT), list.contains(back.SENDER_WITHDRAWAL_SUPPORT), list.contains(back.RECEIVER_ACCOUNT_META), list.contains(back.RECEIVER_VERIFICATION));
        int i2 = onActivityLayout + 23;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        return auTransferRefreshParamsRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onNavigationEvent(@org.jetbrains.annotations.NotNull o.access13800<? super kotlin.Result<im.toss.global.features.transfer.data.model.account.GlobalTransferRecommendSenderResponse<im.toss.global.features.transfer.domain.account.au.AuAccountModel>>> r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r7 instanceof o.WebRenderBridge1.onNavigationEvent
            if (r1 == 0) goto L1f
            int r1 = o.WebRenderBridge1.onMinimized
            int r1 = r1 + 7
            int r2 = r1 % 128
            o.WebRenderBridge1.onActivityLayout = r2
            int r1 = r1 % r0
            r1 = r7
            o.WebRenderBridge1$onNavigationEvent r1 = (o.WebRenderBridge1.onNavigationEvent) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.label = r2
            goto L31
        L1f:
            o.WebRenderBridge1$onNavigationEvent r1 = new o.WebRenderBridge1$onNavigationEvent
            r1.<init>(r6, r7)
            int r7 = o.WebRenderBridge1.onMinimized
            int r7 = r7 + 47
            int r2 = r7 % 128
            o.WebRenderBridge1.onActivityLayout = r2
            int r7 = r7 % r0
            if (r7 != 0) goto L31
            r7 = 4
            int r7 = r7 % r0
        L31:
            java.lang.Object r7 = r1.result
            java.lang.Object r2 = o.access14300.onWarmupCompleted()
            int r3 = r1.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L65
            if (r3 != r4) goto L5d
            int r2 = o.WebRenderBridge1.onMinimized
            int r2 = r2 + 43
            int r3 = r2 % 128
            o.WebRenderBridge1.onActivityLayout = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L52
            java.lang.Object r0 = r1.L$0
            o.access13800 r0 = (o.access13800) r0
            kotlin.ResultKt.onNavigationEvent(r7)     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            goto L89
        L52:
            java.lang.Object r0 = r1.L$0
            o.access13800 r0 = (o.access13800) r0
            kotlin.ResultKt.onNavigationEvent(r7)     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            r5.hashCode()
            throw r5
        L5d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L65:
            kotlin.ResultKt.onNavigationEvent(r7)
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            o.GeckoHubImp r7 = o.putChannelInfo.IAuthTabCallback()     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            o.WebRenderBridge1$onExtraCallbackWithResult r0 = new o.WebRenderBridge1$onExtraCallbackWithResult     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            r0.<init>(r5, r6)     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            java.lang.Object r3 = o.access15400.onNavigationEvent(r1)     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            r1.L$0 = r3     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            r3 = 0
            r1.I$0 = r3     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            r1.I$1 = r3     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            r1.I$2 = r3     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            r1.label = r4     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            java.lang.Object r7 = o.maybeUpdateAnimatable.onExtraCallback(r7, r0, r1)     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            if (r7 != r2) goto L89
            return r2
        L89:
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)     // Catch: java.lang.Exception -> L8e java.util.concurrent.CancellationException -> L9a o.WebResourceResponseModel -> L9c
            return r7
        L8e:
            r7 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
            goto La7
        L9a:
            r7 = move-exception
            throw r7
        L9c:
            r7 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.constructor-impl(r7)
        La7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.WebRenderBridge1.onNavigationEvent(o.access13800):java.lang.Object");
    }

    private final void onExtraCallbackWithResult(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        onExtraCallback(1003404087, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1003404086, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), objArr);
    }

    public final void onExtraCallback(@NotNull AuTransferSendRequest auTransferSendRequest) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onExtraCallback(1540564596, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -1540564596, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, new Object[]{this, auTransferSendRequest});
    }
}
