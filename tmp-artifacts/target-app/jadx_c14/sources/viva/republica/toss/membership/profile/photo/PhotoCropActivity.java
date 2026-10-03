package viva.republica.toss.membership.profile.photo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import com.pnikosis.materialishprogress.ProgressWheel;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.webkit.bridge.image.crop.FocusView;
import im.toss.core.webkit.bridge.image.crop.PinchImageView;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.drawable.RotateTransformation;
import im.toss.utils.RxUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AdSettingsIntegrationErrorMode;
import o.CMP_RevokeCertificate;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CommonModule_share;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.IPostMessageServiceStubProxy;
import o.MapConverter;
import o.NetConverter3;
import o.ReactNativeFeatureFlagsCxxInterop;
import o.RecomposerKt;
import o.RecomposerKtwithRunningRecomposer21;
import o.RecomposeraddCompositionRegistrationObserver2;
import o.RecomposerawaitIdle2;
import o.Recomposerjoin2;
import o.RecomposerrecompositionRunner2;
import o.RecordingApplier;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.TombstoneProtosMemoryMappingBuilder;
import o.access8100;
import o.auth;
import o.clearTid;
import o.deserializeIp;
import o.downloadZip;
import o.extractFile;
import o.getBacktraceNoteBytes;
import o.getNightColor;
import o.getWrite;
import o.onJsBridgeReady;
import o.setMessageBytes;
import o.transparentBackground;
import o.varyMatches;
import o.writeRaw;
import o.zzad;
import o.zzag;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.membership.profile.photo.PhotoCropActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PhotoCropActivity extends Hilt_PhotoCropActivity {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onTransact = 8;
    private final Lazy asBinder = LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.NONE, new onExtraCallback(this));

    @Inject
    public zzad environments;

    @Inject
    public getNightColor profileRepository;

    @Inject
    public zzag tossClock;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallbackWithResult(View view, MotionEvent motionEvent) {
        return true;
    }

    public long getScreenId() {
        return -1L;
    }

    public static final class onExtraCallback implements Function0<CMP_RevokeCertificate> {
        final /* synthetic */ Activity onNavigationEvent;

        public onExtraCallback(Activity activity) {
            this.onNavigationEvent = activity;
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final CMP_RevokeCertificate invoke() {
            LayoutInflater layoutInflater = this.onNavigationEvent.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
            return CMP_RevokeCertificate.onExtraCallback(layoutInflater);
        }
    }

    public final getNightColor IAuthTabCallback() {
        getNightColor getnightcolor = this.profileRepository;
        if (getnightcolor != null) {
            return getnightcolor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final zzag setEngagementSignalsCallback() {
        zzag zzagVar = this.tossClock;
        if (zzagVar != null) {
            return zzagVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final zzad onNavigationEvent() {
        zzad zzadVar = this.environments;
        if (zzadVar != null) {
            return zzadVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent onNavigationEvent(@NotNull Context context, @NotNull String str, long j, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intent intent = new Intent(context, (Class<?>) PhotoCropActivity.class);
            intent.putExtra("imageUri", str);
            intent.putExtra("userNo", j);
            intent.putExtra("from", str2);
            return intent;
        }
    }

    public String getScreenName() {
        return "PhotoCropActivity";
    }

    private final CMP_RevokeCertificate IEngagementSignalsCallback() {
        Object value = this.asBinder.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (CMP_RevokeCertificate) value;
    }

    private final View validateRelationship() {
        View view = IEngagementSignalsCallback().onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view, "");
        return view;
    }

    private final ConstraintLayout ICustomTabsServiceStubProxy() {
        ConstraintLayout constraintLayout = IEngagementSignalsCallback().asInterface;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    private final FocusView ICustomTabsServiceDefault() {
        FocusView focusView = IEngagementSignalsCallback().onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(focusView, "");
        return focusView;
    }

    private final PinchImageView writeTypedList() {
        PinchImageView pinchImageView = IEngagementSignalsCallback().onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(pinchImageView, "");
        return pinchImageView;
    }

    private final ProgressWheel ICustomTabsService_Parcel() {
        ProgressWheel progressWheel = IEngagementSignalsCallback().onTransact;
        Intrinsics.checkNotNullExpressionValue(progressWheel, "");
        return progressWheel;
    }

    private final View updateVisuals() {
        View view = IEngagementSignalsCallback().onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(view, "");
        return view;
    }

    private final TdsButtonV1View ICustomTabsServiceStub() {
        TdsButtonV1View tdsButtonV1View = IEngagementSignalsCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsButtonV1View, "");
        return tdsButtonV1View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.membership.profile.photo.Hilt_PhotoCropActivity
    public void onCreate(@Nullable Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(IEngagementSignalsCallback().getRoot());
        access200();
        try {
            IEngagementSignalsCallbackDefault();
        } catch (Exception e) {
            String string = null;
            onJsBridgeReady.onNavigationEvent(this, getString(R.string.app_membership_profile_photo___91d85348fc), 0, 2, (Object) null);
            auth authVar = auth.onNavigationEvent;
            Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                string = extras.getString("imageUri");
            }
            if (string == null) {
                string = "";
            }
            authVar.IAuthTabCallback(e, access8100.onNavigationEvent(getWrite.IAuthTabCallback("imageUri", string)));
            setResult(0);
            finish();
        }
    }

    private final void access200() {
        IPostMessageServiceStubProxy supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.onNavigationEvent(true);
            supportActionBar.onWarmupCompleted(new ColorDrawable(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void IEngagementSignalsCallbackDefault() {
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        validateRelationship().setOnTouchListener(new PhotoCropActivity$.ExternalSyntheticLambda4());
        validateRelationship().setVisibility(8);
        int iOnExtraCallback = ReactNativeFeatureFlagsCxxInterop.onWarmupCompleted.onExtraCallback();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = iOnExtraCallback - varyMatches.onNavigationEvent(Float.valueOf(48.0f), displayMetrics);
        float f = iOnNavigationEvent;
        int i = (int) (1.016f * f);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        float fFloatValue = ((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, new Object[]{Integer.valueOf(iOnNavigationEvent), displayMetrics2}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).floatValue() / 2.0f;
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(ICustomTabsServiceStubProxy());
        int i2 = R.id.activity_photo_crop_bound;
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(i2, iOnNavigationEvent);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(i2, iOnNavigationEvent);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(ICustomTabsServiceStubProxy());
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk2 = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk2.onNavigationEvent(ICustomTabsServiceStubProxy());
        int i3 = R.id.activity_photo_crop_progress;
        deactivateEncoderSurfaceBeforeStopEncoderQuirk2.onExtraCallbackWithResult(i3, i);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk2.onNavigationEvent(i3, i);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk2.onExtraCallbackWithResult(ICustomTabsServiceStubProxy());
        ICustomTabsService_Parcel().setCircleRadius(getBacktraceNoteBytes.onExtraCallback(fFloatValue));
        ICustomTabsServiceDefault().setTypeAndSize(extractFile.CIRCLE, f);
        writeTypedList().setBound(updateVisuals());
        Intent intent = getIntent();
        String string = (intent == null || (extras3 = intent.getExtras()) == null) ? null : extras3.getString("imageUri");
        if (string == null) {
            string = "";
        }
        Uri uri = Uri.parse(string);
        Intent intent2 = getIntent();
        long j = (intent2 == null || (extras2 = intent2.getExtras()) == null) ? -1L : extras2.getLong("userNo");
        Intent intent3 = getIntent();
        String string2 = (intent3 == null || (extras = intent3.getExtras()) == null) ? null : extras.getString("from");
        if (string2 == null) {
            string2 = "";
        }
        if (j < 0) {
            finish();
        }
        onWarmupCompleted(true);
        CommonModule_share commonModule_share = CommonModule_share.IAuthTabCallback;
        Intrinsics.checkNotNull(uri);
        writeRaw writerawIAuthTabCallback = commonModule_share.onExtraCallbackWithResult(this, uri).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        onNavigationEvent(setMessageBytes.onNavigationEvent(writerawIAuthTabCallback, (Function1) null, new PhotoCropActivity$.ExternalSyntheticLambda5(this, uri), 1, (Object) null));
        TdsButtonV1View tdsButtonV1ViewICustomTabsServiceStub = ICustomTabsServiceStub();
        if (tdsButtonV1ViewICustomTabsServiceStub != null) {
            tdsButtonV1ViewICustomTabsServiceStub.setOnClickListener(new PhotoCropActivity$.ExternalSyntheticLambda6(this, j, string2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(PhotoCropActivity photoCropActivity, long j, String str, View view) {
        photoCropActivity.onWarmupCompleted(true);
        Object[] objArr = {photoCropActivity.writeTypedList(), 512};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        writeRaw writerawOnExtraCallbackWithResult = ((writeRaw) PinchImageView.onExtraCallback(-508259950, 508259953, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, objArr)).onNavigationEvent(clearTid.onExtraCallback()).onExtraCallbackWithResult(new PhotoCropActivity$.ExternalSyntheticLambda1(new PhotoCropActivity$.ExternalSyntheticLambda0(photoCropActivity, j)));
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
        MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
        Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(new IAuthTabCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new PhotoCropActivity$.ExternalSyntheticLambda2(photoCropActivity), new PhotoCropActivity$.ExternalSyntheticLambda3(photoCropActivity, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeIp asBinder(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (deserializeIp) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final deserializeIp onNavigationEvent(PhotoCropActivity photoCropActivity, long j, Bitmap bitmap) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "");
        File fileCreateTempFile = File.createTempFile("Toss_profile_" + photoCropActivity.setEngagementSignalsCallback().IAuthTabCallbackDefault(), ".png", photoCropActivity.getCacheDir());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 85, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
            String string = FileProvider.getUriForFile(photoCropActivity, photoCropActivity.onNavigationEvent().onUnminimized(), fileCreateTempFile).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            MultipartBody.Part.Companion companion = MultipartBody.Part.Companion;
            String name = fileCreateTempFile.getName();
            RequestBody.Companion companion2 = RequestBody.Companion;
            Intrinsics.checkNotNull(fileCreateTempFile);
            return AdSettingsIntegrationErrorMode.onNavigationEvent.getInterfaceDescriptor().onExtraCallback(j, companion.createFormData("file", name, companion2.create(fileCreateTempFile, MediaType.Companion.parse(string))));
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(PhotoCropActivity photoCropActivity, String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() == 0) {
            photoCropActivity.onVerticalScrollEvent();
        } else {
            setMessageBytes.onExtraCallbackWithResult(photoCropActivity.IAuthTabCallback().IAuthTabCallback(str2, true), new PhotoCropActivity$.ExternalSyntheticLambda7(photoCropActivity), new PhotoCropActivity$.ExternalSyntheticLambda8(photoCropActivity, str, str2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onExtraCallback(PhotoCropActivity photoCropActivity, String str, String str2, Result result) {
        photoCropActivity.onWarmupCompleted(false);
        Intent intent = new Intent();
        intent.putExtra("imageUri", str2);
        Unit unit = Unit.INSTANCE;
        photoCropActivity.setResult(-1, intent);
        if (str.length() > 0) {
            Object[] objArr = {new TrackEvent.IAuthTabCallback("confirm_profile_picture").onNavigationEvent("category", "service_category").onNavigationEvent("view", "my_profile_picture").onNavigationEvent("from", str).onWarmupCompleted()};
            int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
            ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        }
        photoCropActivity.finish();
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(PhotoCropActivity photoCropActivity, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        photoCropActivity.onVerticalScrollEvent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(PhotoCropActivity photoCropActivity, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        photoCropActivity.onVerticalScrollEvent();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onVerticalScrollEvent() {
        onWarmupCompleted(false);
        onJsBridgeReady.onNavigationEvent(this, getString(R.string.app_membership_profile_photo___314ffd914e), 0, 2, (Object) null);
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted(boolean z) {
        if (z) {
            validateRelationship().setVisibility(0);
            ICustomTabsService_Parcel().setVisibility(0);
            transparentBackground.onExtraCallback(ICustomTabsServiceStub());
        }
        if (z) {
            return;
        }
        validateRelationship().setVisibility(8);
        ICustomTabsService_Parcel().setVisibility(8);
        transparentBackground.onWarmupCompleted(ICustomTabsServiceStub());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onWarmupCompleted(PhotoCropActivity photoCropActivity, Uri uri, float f) {
        CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(photoCropActivity).onWarmupCompleted(RecomposerrecompositionRunner2.IAuthTabCallback(Recomposerjoin2.onExtraCallback(new RecomposerawaitIdle2.onNavigationEvent(photoCropActivity).onExtraCallback(uri), photoCropActivity.writeTypedList()), new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new RotateTransformation(f)}).onWarmupCompleted(RecomposerKtwithRunningRecomposer21.onWarmupCompleted.onNavigationEvent, RecomposerKtwithRunningRecomposer21.onNavigationEvent.onWarmupCompleted(RecordingApplier.onNavigationEvent(800))).onNavigationEvent(photoCropActivity.new onExtraCallbackWithResult(photoCropActivity)).onExtraCallbackWithResult());
        return Unit.INSTANCE;
    }

    @Override // viva.republica.toss.membership.profile.photo.Hilt_PhotoCropActivity
    public void onStart() {
        super.onStart();
    }

    @Override // viva.republica.toss.membership.profile.photo.Hilt_PhotoCropActivity
    public void onResume() {
        super.onResume();
    }

    @Override // viva.republica.toss.membership.profile.photo.Hilt_PhotoCropActivity
    public void onPause() {
        super.onPause();
    }

    @Override // viva.republica.toss.membership.profile.photo.Hilt_PhotoCropActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public static final class onExtraCallbackWithResult implements RecomposerawaitIdle2.onExtraCallback {
        public void IAuthTabCallback(RecomposerawaitIdle2 recomposerawaitIdle2) {
        }

        public void onExtraCallback(RecomposerawaitIdle2 recomposerawaitIdle2) {
        }

        public onExtraCallbackWithResult(PhotoCropActivity photoCropActivity) {
        }

        public void onExtraCallback(RecomposerawaitIdle2 recomposerawaitIdle2, RecomposeraddCompositionRegistrationObserver2 recomposeraddCompositionRegistrationObserver2) {
            PhotoCropActivity.this.setResult(0);
            PhotoCropActivity.this.finish();
        }

        public void onNavigationEvent(RecomposerawaitIdle2 recomposerawaitIdle2, RecomposerKt recomposerKt) {
            PhotoCropActivity.this.onWarmupCompleted(false);
        }
    }
}
