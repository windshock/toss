package im.toss.core.webkit.bridge.image.crop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.pnikosis.materialishprogress.ProgressWheel;
import im.toss.core.R;
import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.webkit.bridge.image.crop.PhotoCropActivity$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.uikit.base.UIKitBaseActivity;
import im.toss.uikit.drawable.RotateTransformation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CarouselKtCarousel4ExternalSyntheticLambda0;
import o.CarouselKtExternalSyntheticLambda8;
import o.CommonModule_share;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.IPostMessageServiceStubProxy;
import o.M_;
import o.NetConverter3;
import o.RecomposerKt;
import o.RecomposerKtwithRunningRecomposer21;
import o.RecomposeraddCompositionRegistrationObserver2;
import o.RecomposerawaitIdle2;
import o.Recomposerjoin2;
import o.RecomposerrecompositionRunner2;
import o.RecordingApplier;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.access8100;
import o.auth;
import o.clearTid;
import o.downloadZip;
import o.extractFile;
import o.forceDomainCheck;
import o.getBacktraceNoteBytes;
import o.getWrite;
import o.onIconClick;
import o.setIconPaddingTop;
import o.setMessageBytes;
import o.varyMatches;
import o.writeRaw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class PhotoCropActivity extends UIKitBaseActivity {
    public static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int access000 = 1;
    private static int asBinder;
    private setIconPaddingTop asInterface;
    private extractFile onTransact = extractFile.CIRCLE;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = IAuthTabCallbackDefault + 23;
        access000 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ String IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(function1, obj);
        int i4 = asBinder + 5;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static /* synthetic */ void IAuthTabCallback(PhotoCropActivity photoCropActivity, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(photoCropActivity, view);
        int i4 = asBinder + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean IAuthTabCallback(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 53;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PhotoCropActivity photoCropActivity = (PhotoCropActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(photoCropActivity, str);
        }
        onWarmupCompleted(photoCropActivity, str);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws IOException {
        PhotoCropActivity photoCropActivity = (PhotoCropActivity) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(photoCropActivity, bitmap);
        }
        onWarmupCompleted(photoCropActivity, bitmap);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PhotoCropActivity photoCropActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(photoCropActivity, th);
        int i4 = IAuthTabCallbackStub + 105;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = (~(i6 | i4)) | i3;
        int i8 = (~((~i4) | i6)) | i3;
        int i9 = (~i3) | i6;
        int i10 = i3 + i6 + i2 + (440753341 * i) + ((-634449194) * i5);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i3) + 1075183616 + ((-1421434046) * i6) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i2) + (780402688 * i) + ((-180879360) * i5) + (353763328 * i11);
        int i13 = (i3 * 892202253) + 1676176333 + (i6 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i2 * 892200819) + (i * (-770690073)) + (i5 * 448958498) + (i11 * 1390542848);
        int i14 = i12 + (i13 * i13 * (-1042677760));
        return i14 != 1 ? i14 != 2 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(PhotoCropActivity photoCropActivity, Uri uri, Float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(photoCropActivity, uri, f);
        int i4 = IAuthTabCallbackStub + 27;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = asBinder + 105;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(view, motionEvent);
        }
        IAuthTabCallback(view, motionEvent);
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return -1L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final Intent onExtraCallbackWithResult(@NotNull Context context, @NotNull String str, @NotNull extractFile extractfile) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(extractfile, "");
            Intent intent = new Intent(context, (Class<?>) PhotoCropActivity.class);
            intent.putExtra("imageUri", str);
            intent.putExtra("cropType", extractfile);
            int i2 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return intent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final /* synthetic */ void onWarmupCompleted(PhotoCropActivity photoCropActivity, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        photoCropActivity.IAuthTabCallback(z);
        int i4 = asBinder + 13;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public String getScreenName() {
        int i = 2 % 2;
        int i2 = asBinder + 91;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return "my_profile_picture";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        Bundle extras;
        int i = 2 % 2;
        super.onCreate(bundle);
        setIconPaddingTop seticonpaddingtopOnExtraCallbackWithResult = setIconPaddingTop.onExtraCallbackWithResult(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(seticonpaddingtopOnExtraCallbackWithResult, "");
        this.asInterface = seticonpaddingtopOnExtraCallbackWithResult;
        String string = null;
        if (seticonpaddingtopOnExtraCallbackWithResult == null) {
            int i2 = asBinder + 113;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = IAuthTabCallbackStub + 125;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            seticonpaddingtopOnExtraCallbackWithResult = null;
        }
        setContentView(seticonpaddingtopOnExtraCallbackWithResult.IAuthTabCallback());
        IAuthTabCallback();
        try {
            onWarmupCompleted();
            onWarmupCompleted(forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -791746057, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 791746057, new Object[]{this});
            int i5 = IAuthTabCallbackStub + 17;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e) {
            onIconClick.onExtraCallbackWithResult(this, "사진을 불러오는 중 오류가 발생했습니다.", 0, 2, (Object) null);
            auth authVar = auth.onNavigationEvent;
            Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                int i7 = asBinder + 75;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                string = extras.getString("imageUri");
            }
            authVar.IAuthTabCallback(e, access8100.onNavigationEvent(getWrite.IAuthTabCallback("imageUri", string != null ? string : "")));
            setResult(0);
            finish();
        }
    }

    private final void IAuthTabCallback() {
        IPostMessageServiceStubProxy supportActionBar;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 91;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            supportActionBar = getSupportActionBar();
            int i3 = 53 / 0;
            if (supportActionBar == null) {
                return;
            }
        } else {
            supportActionBar = getSupportActionBar();
            if (supportActionBar == null) {
                return;
            }
        }
        supportActionBar.onNavigationEvent(true);
        supportActionBar.onWarmupCompleted(new ColorDrawable(0));
        int i4 = IAuthTabCallbackStub + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted() {
        int i = 2 % 2;
        Intent intent = getIntent();
        extractFile extractfile = null;
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("cropType") : null;
        if (serializableExtra instanceof extractFile) {
            extractfile = (extractFile) serializableExtra;
            int i2 = asBinder + 13;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 % 2;
            }
        }
        if (extractfile == null) {
            int i4 = asBinder + 17;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            extractfile = extractFile.CIRCLE;
        }
        this.onTransact = extractfile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallbackWithResult(PhotoCropActivity photoCropActivity, Uri uri, Float f) {
        int i = 2 % 2;
        CarouselKtExternalSyntheticLambda8 carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult = CarouselKtCarousel4ExternalSyntheticLambda0.onExtraCallbackWithResult(photoCropActivity);
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(photoCropActivity).onExtraCallback(uri);
        setIconPaddingTop seticonpaddingtop = photoCropActivity.asInterface;
        if (seticonpaddingtop == null) {
            int i2 = IAuthTabCallbackStub + 11;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop = null;
        }
        PinchImageView pinchImageView = seticonpaddingtop.IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(pinchImageView, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback2 = Recomposerjoin2.onExtraCallback(onnavigationeventOnExtraCallback, pinchImageView);
        Intrinsics.checkNotNull(f);
        carouselKtExternalSyntheticLambda8OnExtraCallbackWithResult.onWarmupCompleted(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback2, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new RotateTransformation(f.floatValue())}).onWarmupCompleted(RecomposerKtwithRunningRecomposer21.onWarmupCompleted.onNavigationEvent, RecomposerKtwithRunningRecomposer21.onNavigationEvent.onWarmupCompleted(RecordingApplier.onNavigationEvent(800))).onNavigationEvent(photoCropActivity.new onWarmupCompleted(photoCropActivity)).onExtraCallbackWithResult());
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        int iAsInterface;
        int iOnNavigationEvent;
        float fOnExtraCallbackWithResult;
        String string;
        Bundle extras;
        AppCompatActivity appCompatActivity = (PhotoCropActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(48.0f);
        setIconPaddingTop seticonpaddingtop = ((PhotoCropActivity) appCompatActivity).asInterface;
        Object obj = null;
        if (seticonpaddingtop == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop = null;
        }
        seticonpaddingtop.onNavigationEvent.setOnTouchListener(new PhotoCropActivity$.ExternalSyntheticLambda0());
        setIconPaddingTop seticonpaddingtop2 = ((PhotoCropActivity) appCompatActivity).asInterface;
        if (seticonpaddingtop2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop2 = null;
        }
        View view = seticonpaddingtop2.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        extractFile extractfile = ((PhotoCropActivity) appCompatActivity).onTransact;
        int[] iArr = onNavigationEvent.onExtraCallbackWithResult;
        int i4 = iArr[extractfile.ordinal()];
        if (i4 != 1) {
            int i5 = asBinder;
            int i6 = i5 + 63;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0 ? i4 != 2 : i4 != 3) {
                int i7 = i5 + 63;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            int iAsInterface2 = M_.onExtraCallback.asInterface();
            DisplayMetrics displayMetrics = appCompatActivity.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            iAsInterface = iAsInterface2 - varyMatches.onNavigationEvent(fValueOf, displayMetrics);
        } else {
            iAsInterface = M_.onExtraCallback.asInterface();
        }
        int i9 = iArr[((PhotoCropActivity) appCompatActivity).onTransact.ordinal()];
        if (i9 != 1) {
            int i10 = asBinder + 57;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            if (i9 != 2 && i9 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iOnNavigationEvent = (int) (iAsInterface * 1.016f);
        } else {
            DisplayMetrics displayMetrics2 = appCompatActivity.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(fValueOf, displayMetrics2);
        }
        int i12 = iArr[((PhotoCropActivity) appCompatActivity).onTransact.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                int i13 = IAuthTabCallbackStub + 111;
                asBinder = i13 % 128;
                if (i13 % 2 == 0 ? i12 != 3 : i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            DisplayMetrics displayMetrics3 = appCompatActivity.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
            fOnExtraCallbackWithResult = ((Float) varyMatches.onNavigationEvent(1845166571, -1845166568, new Object[]{Integer.valueOf(iAsInterface), displayMetrics3}, OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback())).floatValue();
        } else {
            fOnExtraCallbackWithResult = varyMatches.onExtraCallbackWithResult(appCompatActivity, Integer.valueOf(iOnNavigationEvent));
        }
        float f = fOnExtraCallbackWithResult / 2.0f;
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        setIconPaddingTop seticonpaddingtop3 = ((PhotoCropActivity) appCompatActivity).asInterface;
        if (seticonpaddingtop3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop3 = null;
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(seticonpaddingtop3.IAuthTabCallbackStub);
        int i14 = R.id.crop_bound;
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(i14, iAsInterface);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(i14, iAsInterface);
        setIconPaddingTop seticonpaddingtop4 = ((PhotoCropActivity) appCompatActivity).asInterface;
        if (seticonpaddingtop4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop4 = null;
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(seticonpaddingtop4.IAuthTabCallbackStub);
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk2 = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        setIconPaddingTop seticonpaddingtop5 = ((PhotoCropActivity) appCompatActivity).asInterface;
        if (seticonpaddingtop5 == null) {
            int i15 = IAuthTabCallbackStub + 79;
            asBinder = i15 % 128;
            if (i15 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop5 = null;
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk2.onNavigationEvent(seticonpaddingtop5.IAuthTabCallbackStub);
        int i16 = R.id.progress;
        deactivateEncoderSurfaceBeforeStopEncoderQuirk2.onExtraCallbackWithResult(i16, iOnNavigationEvent);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk2.onNavigationEvent(i16, iOnNavigationEvent);
        setIconPaddingTop seticonpaddingtop6 = ((PhotoCropActivity) appCompatActivity).asInterface;
        if (seticonpaddingtop6 == null) {
            int i17 = asBinder + 119;
            IAuthTabCallbackStub = i17 % 128;
            if (i17 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop6 = null;
        }
        deactivateEncoderSurfaceBeforeStopEncoderQuirk2.onExtraCallbackWithResult(seticonpaddingtop6.IAuthTabCallbackStub);
        setIconPaddingTop seticonpaddingtop7 = ((PhotoCropActivity) appCompatActivity).asInterface;
        if (seticonpaddingtop7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop7 = null;
        }
        seticonpaddingtop7.asBinder.setCircleRadius(getBacktraceNoteBytes.onExtraCallback(f));
        setIconPaddingTop seticonpaddingtop8 = ((PhotoCropActivity) appCompatActivity).asInterface;
        if (seticonpaddingtop8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop8 = null;
        }
        seticonpaddingtop8.onExtraCallbackWithResult.setTypeAndSize(((PhotoCropActivity) appCompatActivity).onTransact, iAsInterface);
        setIconPaddingTop seticonpaddingtop9 = ((PhotoCropActivity) appCompatActivity).asInterface;
        if (seticonpaddingtop9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop9 = null;
        }
        PinchImageView pinchImageView = seticonpaddingtop9.IAuthTabCallback;
        setIconPaddingTop seticonpaddingtop10 = ((PhotoCropActivity) appCompatActivity).asInterface;
        if (seticonpaddingtop10 == null) {
            int i18 = asBinder + 87;
            IAuthTabCallbackStub = i18 % 128;
            if (i18 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i19 = 22 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            seticonpaddingtop10 = null;
        }
        View view2 = seticonpaddingtop10.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        pinchImageView.setBound(view2);
        Intent intent = appCompatActivity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            string = null;
        } else {
            int i20 = asBinder + 71;
            IAuthTabCallbackStub = i20 % 128;
            int i21 = i20 % 2;
            string = extras.getString("imageUri");
        }
        if (string == null) {
            string = "";
        }
        Uri uri = Uri.parse(string);
        appCompatActivity.IAuthTabCallback(true);
        CommonModule_share commonModule_share = CommonModule_share.IAuthTabCallback;
        Intrinsics.checkNotNull(uri);
        writeRaw writerawIAuthTabCallback = commonModule_share.onExtraCallbackWithResult(appCompatActivity, uri).onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        appCompatActivity.onNavigationEvent(setMessageBytes.onNavigationEvent(writerawIAuthTabCallback, (Function1) null, new PhotoCropActivity$.ExternalSyntheticLambda1(appCompatActivity, uri), 1, (Object) null));
        setIconPaddingTop seticonpaddingtop11 = ((PhotoCropActivity) appCompatActivity).asInterface;
        if (seticonpaddingtop11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop11 = null;
        }
        seticonpaddingtop11.onWarmupCompleted.setOnClickListener(new PhotoCropActivity$.ExternalSyntheticLambda2(appCompatActivity));
        return null;
    }

    private static final String onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (String) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String onWarmupCompleted(PhotoCropActivity photoCropActivity, Bitmap bitmap) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmap, "");
        File fileCreateTempFile = File.createTempFile("Toss_profile_" + System.currentTimeMillis(), ".png", photoCropActivity.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 85, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
            String string = Uri.fromFile(fileCreateTempFile).toString();
            int i2 = IAuthTabCallbackStub + 121;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 69 / 0;
            }
            return string;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(PhotoCropActivity photoCropActivity, View view) {
        setIconPaddingTop seticonpaddingtop;
        int i = 2 % 2;
        int i2 = asBinder + 25;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            photoCropActivity.IAuthTabCallback(false);
            seticonpaddingtop = photoCropActivity.asInterface;
            if (seticonpaddingtop == null) {
                int i3 = IAuthTabCallbackStub + 75;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                seticonpaddingtop = null;
            }
        } else {
            photoCropActivity.IAuthTabCallback(true);
            seticonpaddingtop = photoCropActivity.asInterface;
            if (seticonpaddingtop == null) {
            }
        }
        Object[] objArr = {seticonpaddingtop.IAuthTabCallback, 512};
        int iOnWarmupCompleted = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        int iOnWarmupCompleted2 = PssReader$.ExternalSyntheticLambda1.onWarmupCompleted();
        writeRaw writerawIAuthTabCallback = ((writeRaw) PinchImageView.onExtraCallback(-508259950, 508259953, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), iOnWarmupCompleted2, iOnWarmupCompleted, objArr)).onNavigationEvent(clearTid.onExtraCallback()).onWarmupCompleted(new PhotoCropActivity$.ExternalSyntheticLambda4(new PhotoCropActivity$.ExternalSyntheticLambda3(photoCropActivity))).onNavigationEvent(clearTid.onExtraCallback()).IAuthTabCallback(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new PhotoCropActivity$.ExternalSyntheticLambda5(photoCropActivity), new PhotoCropActivity$.ExternalSyntheticLambda6(photoCropActivity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onWarmupCompleted(PhotoCropActivity photoCropActivity, String str) {
        int i = 2 % 2;
        photoCropActivity.IAuthTabCallback(false);
        photoCropActivity.setResult(-1, new Intent().putExtra("imageUri", str));
        Object[] objArr = {new TrackEvent.IAuthTabCallback("confirm_profile_picture").onNavigationEvent("category", "service_category").onNavigationEvent("view", "my_profile_picture").onWarmupCompleted()};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        photoCropActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallbackStub + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit IAuthTabCallback(PhotoCropActivity photoCropActivity, Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        photoCropActivity.IAuthTabCallback(false);
        photoCropActivity.setResult(0);
        photoCropActivity.finish();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 83;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(boolean z) {
        setIconPaddingTop seticonpaddingtop;
        int i = 2 % 2;
        int i2 = asBinder + 31;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        setIconPaddingTop seticonpaddingtop2 = null;
        if (z) {
            int i5 = i3 + 59;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                seticonpaddingtop = this.asInterface;
                int i6 = 30 / 0;
                if (seticonpaddingtop == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    seticonpaddingtop = null;
                }
            } else {
                seticonpaddingtop = this.asInterface;
                if (seticonpaddingtop == null) {
                }
            }
            View view = seticonpaddingtop.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(0);
            setIconPaddingTop seticonpaddingtop3 = this.asInterface;
            if (seticonpaddingtop3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                seticonpaddingtop3 = null;
            }
            ProgressWheel progressWheel = seticonpaddingtop3.asBinder;
            Intrinsics.checkNotNullExpressionValue(progressWheel, "");
            progressWheel.setVisibility(0);
            setIconPaddingTop seticonpaddingtop4 = this.asInterface;
            if (seticonpaddingtop4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                seticonpaddingtop2 = seticonpaddingtop4;
            }
            seticonpaddingtop2.onWarmupCompleted.setEnabled(false);
            return;
        }
        setIconPaddingTop seticonpaddingtop5 = this.asInterface;
        if (seticonpaddingtop5 == null) {
            int i7 = i3 + 53;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop5 = null;
        }
        View view2 = seticonpaddingtop5.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(8);
        setIconPaddingTop seticonpaddingtop6 = this.asInterface;
        if (seticonpaddingtop6 == null) {
            int i8 = asBinder + 91;
            IAuthTabCallbackStub = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                seticonpaddingtop2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            seticonpaddingtop6 = null;
        }
        ProgressWheel progressWheel2 = seticonpaddingtop6.asBinder;
        Intrinsics.checkNotNullExpressionValue(progressWheel2, "");
        progressWheel2.setVisibility(8);
        setIconPaddingTop seticonpaddingtop7 = this.asInterface;
        if (seticonpaddingtop7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            seticonpaddingtop2 = seticonpaddingtop7;
        }
        seticonpaddingtop2.onWarmupCompleted.setEnabled(true);
    }

    public static /* synthetic */ Unit IAuthTabCallback(PhotoCropActivity photoCropActivity, String str) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (Unit) onWarmupCompleted(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2, 1859421150, iIAuthTabCallback, forceDomainCheck.IAuthTabCallback(), -1859421148, new Object[]{photoCropActivity, str});
    }

    public static /* synthetic */ String onExtraCallback(PhotoCropActivity photoCropActivity, Bitmap bitmap) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (String) onWarmupCompleted(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2, 570897756, iIAuthTabCallback, forceDomainCheck.IAuthTabCallback(), -570897755, new Object[]{photoCropActivity, bitmap});
    }

    private final void onNavigationEvent() {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        onWarmupCompleted(forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2, -791746057, iIAuthTabCallback, forceDomainCheck.IAuthTabCallback(), 791746057, new Object[]{this});
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public static final class onWarmupCompleted implements RecomposerawaitIdle2.onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public void IAuthTabCallback(RecomposerawaitIdle2 recomposerawaitIdle2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onExtraCallback(RecomposerawaitIdle2 recomposerawaitIdle2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 5;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        public onWarmupCompleted(PhotoCropActivity photoCropActivity) {
        }

        public void onExtraCallback(RecomposerawaitIdle2 recomposerawaitIdle2, RecomposeraddCompositionRegistrationObserver2 recomposeraddCompositionRegistrationObserver2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                PhotoCropActivity.this.setResult(1);
            } else {
                PhotoCropActivity.this.setResult(0);
            }
            PhotoCropActivity.this.finish();
        }

        public void onNavigationEvent(RecomposerawaitIdle2 recomposerawaitIdle2, RecomposerKt recomposerKt) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            PhotoCropActivity.onWarmupCompleted(PhotoCropActivity.this, false);
            int i4 = IAuthTabCallback + 73;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
        }
    }
}
