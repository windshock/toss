package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography3;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TossBundleLoader_startServiceSessionEvents extends PopupWindow {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 1;
    private Integer asInterface;
    private TossModule_setBreadcrumb onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private deprecated_followRedirects onNavigationEvent;
    private CharSequence onTransact;
    private CharSequence onWarmupCompleted;

    static {
        int i = IAuthTabCallbackStub + 105;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public /* synthetic */ TossBundleLoader_startServiceSessionEvents(Context context, deprecated_followRedirects deprecated_followredirects, Integer num, CharSequence charSequence, CharSequence charSequence2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, deprecated_followredirects, num, charSequence, charSequence2);
    }

    private TossBundleLoader_startServiceSessionEvents(Context context, deprecated_followRedirects deprecated_followredirects, Integer num, CharSequence charSequence, CharSequence charSequence2) {
        super(context);
        this.onExtraCallbackWithResult = context;
        this.onNavigationEvent = deprecated_followredirects;
        this.asInterface = num;
        this.onTransact = charSequence;
        this.onWarmupCompleted = charSequence2;
        setAnimationStyle(R.style.Magnifier_WindowAnimation);
        VectorConvertersKtExternalSyntheticLambda5.onExtraCallbackWithResult(this, 99);
        setBackgroundDrawable(null);
    }

    public final void onNavigationEvent(@Nullable deprecated_followRedirects deprecated_followredirects, @Nullable Integer num) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(deprecated_followredirects);
            onWarmupCompleted(num);
            onWarmupCompleted();
            int i3 = 44 / 0;
        } else {
            IAuthTabCallback(deprecated_followredirects);
            onWarmupCompleted(num);
            onWarmupCompleted();
        }
        int i4 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent implements TossModule_setBreadcrumb {
        private static int IAuthTabCallbackStub = 0;
        private static int asBinder = 1;
        final /* synthetic */ CreateHttpCallException IAuthTabCallback;
        private final ConstraintLayout onExtraCallback;
        private final TdsImageView onExtraCallbackWithResult;
        private final Barrier onNavigationEvent;
        private final BaseTextView onTransact;
        private final BaseTextView onWarmupCompleted;

        onNavigationEvent(CreateHttpCallException createHttpCallException) {
            this.IAuthTabCallback = createHttpCallException;
            ConstraintLayout constraintLayout = createHttpCallException.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            this.onExtraCallback = constraintLayout;
            Barrier barrier = createHttpCallException.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(barrier, "");
            this.onNavigationEvent = barrier;
            TdsImageView tdsImageView = createHttpCallException.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            this.onExtraCallbackWithResult = tdsImageView;
            Typography1 typography1 = createHttpCallException.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(typography1, "");
            this.onTransact = typography1;
            Typography3 typography3 = createHttpCallException.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(typography3, "");
            this.onWarmupCompleted = typography3;
        }

        @Override // o.TossModule_setBreadcrumb
        public ConstraintLayout onNavigationEvent() {
            int i = 2 % 2;
            int i2 = asBinder + 13;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            int i4 = i2 % 2;
            ConstraintLayout constraintLayout = this.onExtraCallback;
            int i5 = i3 + 83;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 58 / 0;
            }
            return constraintLayout;
        }

        @Override // o.TossModule_setBreadcrumb
        public TdsImageView onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 55;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        @Override // o.TossModule_setBreadcrumb
        public BaseTextView IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 123;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            BaseTextView baseTextView = this.onTransact;
            int i5 = i2 + 1;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 6 / 0;
            }
            return baseTextView;
        }

        @Override // o.TossModule_setBreadcrumb
        public BaseTextView onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 59;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }

        public View getRoot() {
            TdsRoundLayout tdsRoundLayoutOnExtraCallback;
            int i = 2 % 2;
            int i2 = asBinder + 9;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                tdsRoundLayoutOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(tdsRoundLayoutOnExtraCallback, "");
                int i3 = 69 / 0;
            } else {
                tdsRoundLayoutOnExtraCallback = this.IAuthTabCallback.onExtraCallback();
                Intrinsics.checkNotNullExpressionValue(tdsRoundLayoutOnExtraCallback, "");
            }
            int i4 = asBinder + 123;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return tdsRoundLayoutOnExtraCallback;
        }
    }

    public static final class onExtraCallback implements TossModule_setBreadcrumb {
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;
        private final ConstraintLayout IAuthTabCallback;
        private final BaseTextView asBinder;
        private final Barrier onExtraCallback;
        private final TdsImageView onExtraCallbackWithResult;
        final /* synthetic */ ParsingException onNavigationEvent;
        private final BaseTextView onWarmupCompleted;

        onExtraCallback(ParsingException parsingException) {
            this.onNavigationEvent = parsingException;
            ConstraintLayout constraintLayout = parsingException.onExtraCallback;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            this.IAuthTabCallback = constraintLayout;
            Barrier barrier = parsingException.IAuthTabCallback;
            Intrinsics.checkNotNullExpressionValue(barrier, "");
            this.onExtraCallback = barrier;
            TdsImageView tdsImageView = parsingException.onExtraCallbackWithResult;
            Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
            this.onExtraCallbackWithResult = tdsImageView;
            Typography1 typography1 = parsingException.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(typography1, "");
            this.asBinder = typography1;
            Typography3 typography3 = parsingException.onWarmupCompleted;
            Intrinsics.checkNotNullExpressionValue(typography3, "");
            this.onWarmupCompleted = typography3;
        }

        @Override // o.TossModule_setBreadcrumb
        public ConstraintLayout onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact + 67;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            ConstraintLayout constraintLayout = this.IAuthTabCallback;
            int i5 = i3 + 105;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return constraintLayout;
        }

        @Override // o.TossModule_setBreadcrumb
        public TdsImageView onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 45;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.TossModule_setBreadcrumb
        public BaseTextView IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 99;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            BaseTextView baseTextView = this.asBinder;
            int i5 = i3 + 105;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return baseTextView;
            }
            throw null;
        }

        @Override // o.TossModule_setBreadcrumb
        public BaseTextView onExtraCallback() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 47;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            BaseTextView baseTextView = this.onWarmupCompleted;
            int i5 = i2 + 51;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return baseTextView;
            }
            throw null;
        }

        public View getRoot() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 77;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            TdsRoundLayout tdsRoundLayoutIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback();
            Intrinsics.checkNotNullExpressionValue(tdsRoundLayoutIAuthTabCallback, "");
            int i4 = onTransact + 119;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 65 / 0;
            }
            return tdsRoundLayoutIAuthTabCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[PHI: r1
      0x003a: PHI (r1v15 android.view.LayoutInflater) = (r1v5 android.view.LayoutInflater), (r1v17 android.view.LayoutInflater) binds: [B:8:0x0025, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v6 android.view.LayoutInflater) = (r1v5 android.view.LayoutInflater), (r1v17 android.view.LayoutInflater) binds: [B:8:0x0025, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult() {
        LayoutInflater layoutInflaterFrom;
        TossModule_setBreadcrumb onnavigationevent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            layoutInflaterFrom = LayoutInflater.from(this.onExtraCallbackWithResult);
            if (Build.VERSION.SDK_INT == 28) {
                onnavigationevent = new onNavigationEvent(CreateHttpCallException.IAuthTabCallback(layoutInflaterFrom));
                int i3 = IAuthTabCallback_Parcel + 1;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
            } else {
                onnavigationevent = new onExtraCallback(ParsingException.onWarmupCompleted(layoutInflaterFrom));
            }
        } else {
            layoutInflaterFrom = LayoutInflater.from(this.onExtraCallbackWithResult);
            if (Build.VERSION.SDK_INT == 26) {
            }
        }
        this.onExtraCallback = onnavigationevent;
        setContentView(onnavigationevent.getRoot());
        int paddingLeft = onnavigationevent.onNavigationEvent().getPaddingLeft();
        int paddingRight = onnavigationevent.onNavigationEvent().getPaddingRight();
        Object[] objArr = {M_.onExtraCallback, this.onExtraCallbackWithResult};
        int iOnNavigationEvent = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iOnNavigationEvent2 = MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent();
        int iIntValue = ((Integer) M_.onNavigationEvent(-2118175014, objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 2118175019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent2)).intValue();
        DisplayMetrics displayMetrics = this.onExtraCallbackWithResult.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent3 = (iIntValue - (varyMatches.onNavigationEvent(Float.valueOf(32.0f), displayMetrics) << 1)) - (paddingLeft + paddingRight);
        onnavigationevent.IAuthTabCallback().setMaxWidth(iOnNavigationEvent3);
        onnavigationevent.onExtraCallback().setMaxWidth(iOnNavigationEvent3);
        IAuthTabCallback(this.onNavigationEvent);
        onWarmupCompleted(this.asInterface);
        onWarmupCompleted(this.onTransact);
        onWarmupCompleted();
        onnavigationevent.onExtraCallback().setText(this.onWarmupCompleted);
        showAtLocation(getContentView(), 17, 0, 0);
    }

    private final void IAuthTabCallback(deprecated_followRedirects deprecated_followredirects) {
        TdsImageView tdsImageViewOnWarmupCompleted;
        int i = 2 % 2;
        this.onNavigationEvent = deprecated_followredirects;
        if (deprecated_followredirects == null) {
            TossModule_setBreadcrumb tossModule_setBreadcrumb = this.onExtraCallback;
            if (tossModule_setBreadcrumb == null || (tdsImageViewOnWarmupCompleted = tossModule_setBreadcrumb.onWarmupCompleted()) == null) {
                return;
            }
            int i2 = IAuthTabCallback_Parcel + 83;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                tdsImageViewOnWarmupCompleted.setVisibility(23);
                return;
            } else {
                tdsImageViewOnWarmupCompleted.setVisibility(8);
                return;
            }
        }
        TossModule_setBreadcrumb tossModule_setBreadcrumb2 = this.onExtraCallback;
        if (tossModule_setBreadcrumb2 != null) {
            int i3 = IAuthTabCallbackDefault + 13;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                tossModule_setBreadcrumb2.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            TdsImageView tdsImageViewOnWarmupCompleted2 = tossModule_setBreadcrumb2.onWarmupCompleted();
            if (tdsImageViewOnWarmupCompleted2 != null) {
                tdsImageViewOnWarmupCompleted2.setImage(deprecated_followredirects);
                tdsImageViewOnWarmupCompleted2.setVisibility(0);
                int i4 = IAuthTabCallbackDefault + 27;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    private final void onWarmupCompleted(Integer num) {
        TdsImageView tdsImageViewOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 55;
        IAuthTabCallback_Parcel = i2 % 128;
        ColorStateList colorStateListValueOf = null;
        if (i2 % 2 == 0) {
            this.asInterface = num;
            throw null;
        }
        this.asInterface = num;
        TossModule_setBreadcrumb tossModule_setBreadcrumb = this.onExtraCallback;
        if (tossModule_setBreadcrumb == null || (tdsImageViewOnWarmupCompleted = tossModule_setBreadcrumb.onWarmupCompleted()) == null) {
            return;
        }
        int i3 = IAuthTabCallbackDefault + 77;
        int i4 = i3 % 128;
        IAuthTabCallback_Parcel = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (num != null) {
            int i5 = i4 + 25;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                ColorStateList.valueOf(num.intValue());
                throw null;
            }
            colorStateListValueOf = ColorStateList.valueOf(num.intValue());
            int i6 = IAuthTabCallbackDefault + 99;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
        tdsImageViewOnWarmupCompleted.setImageTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (kotlin.text.StringsKt__StringsKt.isBlank(r6) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (kotlin.text.StringsKt__StringsKt.isBlank(r6) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r1.setText(r6);
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(CharSequence charSequence) {
        BaseTextView baseTextViewIAuthTabCallback;
        int i = 2 % 2;
        this.onTransact = charSequence;
        TossModule_setBreadcrumb tossModule_setBreadcrumb = this.onExtraCallback;
        if (tossModule_setBreadcrumb == null || (baseTextViewIAuthTabCallback = tossModule_setBreadcrumb.IAuthTabCallback()) == null) {
            return;
        }
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 29;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (charSequence != null) {
            int i5 = i2 + 65;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 76 / 0;
            }
        }
        baseTextViewIAuthTabCallback.setVisibility(8);
        int i7 = IAuthTabCallbackDefault + 69;
        IAuthTabCallback_Parcel = i7 % 128;
        int i8 = i7 % 2;
    }

    public static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final TossBundleLoader_startServiceSessionEvents onExtraCallback(@NotNull Context context, int i, @Nullable Integer num, @NotNull CharSequence charSequence) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents = new TossBundleLoader_startServiceSessionEvents(context, deprecated_followSslRedirects.onWarmupCompleted(i), num, null, charSequence, null);
            int i3 = IAuthTabCallback + 47;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return tossBundleLoader_startServiceSessionEvents;
        }

        public final TossBundleLoader_startServiceSessionEvents onExtraCallback(@NotNull Context context, @NotNull String str, @Nullable Integer num, @NotNull CharSequence charSequence) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents = new TossBundleLoader_startServiceSessionEvents(context, deprecated_followSslRedirects.onExtraCallback(str), num, null, charSequence, null);
            int i2 = onWarmupCompleted + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return tossBundleLoader_startServiceSessionEvents;
        }

        public final TossBundleLoader_startServiceSessionEvents onNavigationEvent(@NotNull Context context, @NotNull CharSequence charSequence) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(charSequence, "");
            TossBundleLoader_startServiceSessionEvents tossBundleLoader_startServiceSessionEvents = new TossBundleLoader_startServiceSessionEvents(context, null, null, null, charSequence, null);
            int i2 = IAuthTabCallback + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return tossBundleLoader_startServiceSessionEvents;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted() {
        int i;
        int i2 = 2 % 2;
        TossModule_setBreadcrumb tossModule_setBreadcrumb = this.onExtraCallback;
        if (tossModule_setBreadcrumb != null) {
            int i3 = IAuthTabCallback_Parcel + 33;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            BaseTextView baseTextViewOnExtraCallback = tossModule_setBreadcrumb.onExtraCallback();
            if (baseTextViewOnExtraCallback != null) {
                if (this.onNavigationEvent == null) {
                    int i5 = IAuthTabCallback_Parcel + 15;
                    IAuthTabCallbackDefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    if (this.onTransact == null) {
                        i = 0;
                    } else {
                        DisplayMetrics displayMetrics = this.onExtraCallbackWithResult.getResources().getDisplayMetrics();
                        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics);
                        int i6 = IAuthTabCallbackDefault + 47;
                        IAuthTabCallback_Parcel = i6 % 128;
                        int i7 = i6 % 2;
                        i = iOnNavigationEvent;
                    }
                }
                baseTextViewOnExtraCallback.setPadding(baseTextViewOnExtraCallback.getPaddingLeft(), i, baseTextViewOnExtraCallback.getPaddingRight(), baseTextViewOnExtraCallback.getPaddingBottom());
            }
        }
    }
}
