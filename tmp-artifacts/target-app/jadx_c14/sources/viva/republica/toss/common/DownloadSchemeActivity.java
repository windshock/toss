package viva.republica.toss.common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.base.BaseActivity;
import im.toss.utils.RxUtils;
import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import o.ConvertFloatArrayToByteArray;
import o.Cookies_clearAll;
import o.SubsamplingScaleImageViewTileLoadTask;
import o.TTAppOpenAdTransActivity;
import o.TTCeilingLandingPageActivity5;
import o.TTHistoryActivity42;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.WebResourceResponseModel;
import o.access13800;
import o.deserializeUriNullableCollection;
import o.findResAndMsg;
import o.getEnabledAmazonAdUnitIds;
import o.getIconPaddingLeft;
import o.getLastTrimMemoryLevel;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import o.writeRaw;
import o.zzag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.DownloadSchemeActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DownloadSchemeActivity extends Hilt_DownloadSchemeActivity {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int asBinder = 8;
    private final Lazy asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.DownloadSchemeActivity$$ExternalSyntheticLambda8
        public final Object invoke() {
            return DownloadSchemeActivity.onTransact(this.f$0);
        }
    });
    private final Lazy onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.DownloadSchemeActivity$$ExternalSyntheticLambda9
        public final Object invoke() {
            return Boolean.valueOf(DownloadSchemeActivity.onWarmupCompleted(this.f$0));
        }
    });

    @Inject
    public getLastTrimMemoryLevel permissionHandler;

    @Inject
    public zzag tossClock;

    public long getScreenId() {
        return -1L;
    }

    public final getLastTrimMemoryLevel onNavigationEvent() {
        getLastTrimMemoryLevel getlasttrimmemorylevel = this.permissionHandler;
        if (getlasttrimmemorylevel != null) {
            return getlasttrimmemorylevel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final zzag IAuthTabCallback() {
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    private final String ICustomTabsServiceDefault() {
        return (String) this.asInterface.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String onTransact(DownloadSchemeActivity downloadSchemeActivity) {
        String stringExtra = downloadSchemeActivity.getIntent().getStringExtra("extra.successMessage");
        if (stringExtra != null) {
            return stringExtra;
        }
        String string = downloadSchemeActivity.getString(R.string.app_common___f5f142d8a2);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final boolean setEngagementSignalsCallback() {
        return ((Boolean) this.onTransact.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean onWarmupCompleted(DownloadSchemeActivity downloadSchemeActivity) {
        return downloadSchemeActivity.getIntent().getBooleanExtra("extra.showSnackBar", false);
    }

    public String getScreenName() {
        return "DownloadSchemeActivity";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.common.Hilt_DownloadSchemeActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = getIconPaddingLeft.IAuthTabCallback.onWarmupCompleted().onWarmupCompleted(new DownloadSchemeActivity$.ExternalSyntheticLambda10()).IAuthTabCallback(new DownloadSchemeActivity$.ExternalSyntheticLambda11(this));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        addSubscription(deserializeurinullablecollectionIAuthTabCallback);
        Serializable serializableExtra = getIntent().getSerializableExtra("extra.dataFile");
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onExtraCallbackWithResult(serializableExtra instanceof File ? (File) serializableExtra : null, this, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onNavigationEvent(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (obj instanceof getLastTrimMemoryLevel.onExtraCallback) && TextUtils.equals(((getLastTrimMemoryLevel.onExtraCallback) obj).IAuthTabCallback(), "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onExtraCallbackWithResult(DownloadSchemeActivity downloadSchemeActivity, Object obj) {
        if (downloadSchemeActivity.isFinishing()) {
            return;
        }
        Toast.makeText((Context) downloadSchemeActivity, im.toss.uikit.R.string.media_not_granted_permission, 1).show();
        downloadSchemeActivity.finish();
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ File $file;
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ DownloadSchemeActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(File file, DownloadSchemeActivity downloadSchemeActivity, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$file = file;
            this.this$0 = downloadSchemeActivity;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onExtraCallbackWithResult(this.$file, this.this$0, access13800Var);
        }

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = o.access14300.onWarmupCompleted()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r0 = r4.L$0
                java.io.File r0 = (java.io.File) r0
                kotlin.ResultKt.onNavigationEvent(r5)
                goto L36
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                kotlin.ResultKt.onNavigationEvent(r5)
                java.io.File r5 = r4.$file
                if (r5 == 0) goto L39
                viva.republica.toss.common.DownloadSchemeActivity r1 = r4.this$0
                java.lang.Object r3 = o.access15400.onNavigationEvent(r5)
                r4.L$0 = r3
                r3 = 0
                r4.I$0 = r3
                r4.label = r2
                java.lang.Object r5 = viva.republica.toss.common.DownloadSchemeActivity.onExtraCallbackWithResult(r1, r5, r4)
                if (r5 != r0) goto L36
                return r0
            L36:
                java.lang.String r5 = (java.lang.String) r5
                goto L3a
            L39:
                r5 = 0
            L3a:
                if (r5 == 0) goto L42
                viva.republica.toss.common.DownloadSchemeActivity r0 = r4.this$0
                viva.republica.toss.common.DownloadSchemeActivity.IAuthTabCallback(r0, r5)
                goto L47
            L42:
                viva.republica.toss.common.DownloadSchemeActivity r5 = r4.this$0
                r5.finish()
            L47:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.DownloadSchemeActivity.onExtraCallbackWithResult.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super String>, Object> {
        final /* synthetic */ File $file;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(File file, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$file = file;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$file, access13800Var);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super String> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            String strOnRelationshipValidationResult;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            File file = this.$file;
            try {
                Result.Companion companion = Result.Companion;
                if (file.exists()) {
                    TTHistoryActivity42 tTHistoryActivity42OnWarmupCompleted = TTCeilingLandingPageActivity5.onWarmupCompleted(file);
                    try {
                        TTAppOpenAdTransActivity tTAppOpenAdTransActivityOnExtraCallback = TTCeilingLandingPageActivity5.onExtraCallback(tTHistoryActivity42OnWarmupCompleted);
                        try {
                            strOnRelationshipValidationResult = tTAppOpenAdTransActivityOnExtraCallback.onRelationshipValidationResult();
                            CloseableKt.closeFinally(tTAppOpenAdTransActivityOnExtraCallback, (Throwable) null);
                            CloseableKt.closeFinally(tTHistoryActivity42OnWarmupCompleted, (Throwable) null);
                            file.delete();
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(tTHistoryActivity42OnWarmupCompleted, th);
                            throw th2;
                        }
                    }
                } else {
                    ConvertFloatArrayToByteArray.IAuthTabCallback(-1349100608, zzgc.onExtraCallbackWithResult(), 1349100616, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "DownloadSchemeActivity", "file not found: " + file.getAbsolutePath(), null, null, false, null, 60, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                    strOnRelationshipValidationResult = null;
                }
                obj2 = Result.constructor-impl(strOnRelationshipValidationResult);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e2));
            } catch (WebResourceResponseModel e3) {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(e3));
            }
            Throwable th3 = Result.exceptionOrNull-impl(obj2);
            if (th3 != null) {
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("DownloadSchemeActivity", th3);
            }
            if (Result.onExtraCallback(obj2)) {
                return null;
            }
            return obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onExtraCallbackWithResult(File file, access13800<? super String> access13800Var) {
        return maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new onNavigationEvent(file, null), access13800Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent(String str) {
        if (!onNavigationEvent().onExtraCallbackWithResult()) {
            onNavigationEvent().onExtraCallback(this, "android.permission.WRITE_EXTERNAL_STORAGE", new DownloadSchemeActivity$.ExternalSyntheticLambda7(this, str));
            return;
        }
        String strSubstring = str.substring(StringsKt.indexOf$default(str, ",", 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        byte[] bytes = strSubstring.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDecode = Base64.decode(bytes, 0);
        String str2 = "toss_image_" + IAuthTabCallback().IAuthTabCallbackDefault() + ".jpg";
        Intrinsics.checkNotNull(bArrDecode);
        onWarmupCompleted(bArrDecode, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(DownloadSchemeActivity downloadSchemeActivity, String str) {
        downloadSchemeActivity.onNavigationEvent(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(byte[] bArr, String str) {
        Cookies_clearAll.onWarmupCompleted onwarmupcompleted = Cookies_clearAll.Companion;
        ContentResolver contentResolver = getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "");
        writeRaw writerawIAuthTabCallback = onwarmupcompleted.onExtraCallbackWithResult(contentResolver).onWarmupCompleted(str).onNavigationEvent(Bitmap.CompressFormat.JPEG).onWarmupCompleted(100).IAuthTabCallback(bArr).onExtraCallbackWithResult().IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onExtraCallback(new DownloadSchemeActivity$.ExternalSyntheticLambda1(new DownloadSchemeActivity$.ExternalSyntheticLambda0(this))).onWarmupCompleted(new DownloadSchemeActivity$.ExternalSyntheticLambda2(this)).onNavigationEvent(new DownloadSchemeActivity$.ExternalSyntheticLambda4(new DownloadSchemeActivity$.ExternalSyntheticLambda3(this)), new DownloadSchemeActivity$.ExternalSyntheticLambda6(new DownloadSchemeActivity$.ExternalSyntheticLambda5(this)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        onNavigationEvent(deserializeurinullablecollectionOnNavigationEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(DownloadSchemeActivity downloadSchemeActivity, deserializeUriNullableCollection deserializeurinullablecollection) {
        BaseActivity.IAuthTabCallback(downloadSchemeActivity, (String) null, false, 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(DownloadSchemeActivity downloadSchemeActivity) {
        downloadSchemeActivity.bo_();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallbackWithResult(DownloadSchemeActivity downloadSchemeActivity, String str) {
        if (downloadSchemeActivity.isFinishing()) {
            return Unit.INSTANCE;
        }
        Uri uri = (str == null || StringsKt.isBlank(str)) ? Uri.EMPTY : Uri.parse(str);
        if (Intrinsics.areEqual(uri, Uri.EMPTY)) {
            Toast.makeText((Context) downloadSchemeActivity, im.toss.uikit.R.string.media_save_fail, 1).show();
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            downloadSchemeActivity.grantUriPermission(downloadSchemeActivity.getPackageName(), uri, 1);
            intent.setDataAndType(uri, "image/*");
            intent.setFlags(1073741825);
            downloadSchemeActivity.startActivityForResult(intent, 3000);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(DownloadSchemeActivity downloadSchemeActivity, Throwable th) {
        downloadSchemeActivity.RatingCompatStarStyle();
        th.getMessage();
        downloadSchemeActivity.finish();
        return Unit.INSTANCE;
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (setEngagementSignalsCallback()) {
            SubsamplingScaleImageViewTileLoadTask.onNavigationEvent.onWarmupCompleted(ICustomTabsServiceDefault(), (126 & 2) != 0 ? getEnabledAmazonAdUnitIds.Companion.onNavigationEvent() : null, (126 & 4) != 0 ? null : null, (126 & 8) != 0 ? 0 : 0, (126 & 16) != 0 ? null : null, (126 & 32) != 0 ? null : null, (126 & 64) == 0 ? null : null);
        }
        finish();
        super.onActivityResult(i, i2, intent);
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent onWarmupCompleted(@NotNull Context context, @NotNull File file, @Nullable String str, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(file, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) DownloadSchemeActivity.class).putExtra("extra.dataFile", file).putExtra("extra.successMessage", str).putExtra("extra.showSnackBar", bool);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    @Override // viva.republica.toss.common.Hilt_DownloadSchemeActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.common.Hilt_DownloadSchemeActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.common.Hilt_DownloadSchemeActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.common.Hilt_DownloadSchemeActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
