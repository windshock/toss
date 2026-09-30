package im.toss.uikit.widget.grid;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import im.toss.uikit.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.generateInviteUrl;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.matches;
import o.readIntokhttp;
import o.setHeadersokhttp;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsListGridV1View extends TdsRoundLayout {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    private TdsImageView onExtraCallback;
    private onExtraCallbackWithResult onExtraCallbackWithResult;
    private BaseTextView onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsListGridV1View(@NotNull Context context) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = onExtraCallbackWithResult.NORMAL;
        onExtraCallback();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsListGridV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = onExtraCallbackWithResult.NORMAL;
        onExtraCallback();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsListGridV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = onExtraCallbackWithResult.NORMAL;
        onExtraCallback();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback() {
        int i = 2 % 2;
        LayoutInflater.from(getContext()).inflate(R.layout.tds_list_grid_v1, (ViewGroup) this, true);
        TdsImageView tdsImageViewFindViewById = findViewById(R.id.icon);
        Intrinsics.checkNotNullExpressionValue(tdsImageViewFindViewById, "");
        this.onExtraCallback = tdsImageViewFindViewById;
        BaseTextView baseTextViewFindViewById = findViewById(R.id.name);
        Intrinsics.checkNotNullExpressionValue(baseTextViewFindViewById, "");
        this.onNavigationEvent = baseTextViewFindViewById;
        Intrinsics.checkNotNullExpressionValue(getContext().getResources().getDisplayMetrics(), "");
        setRadius(varyMatches.onNavigationEvent(Float.valueOf(10.0f), r1));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        setBackgroundColor(new getUrlokhttp(new onWarmupCompleted(configuration)).mayLaunchUrl());
        setSelected(false);
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.setSelected(z);
        if (!z) {
            setStrokeColor(0);
            setStrokeWidth(0.0f);
            int i4 = onWarmupCompleted + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        setStrokeColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new onExtraCallback(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), "");
        setStrokeWidth(varyMatches.onNavigationEvent(Float.valueOf(2.0f), r9));
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = IAuthTabCallback + 105;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 14 / 0;
                }
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult);
            throw null;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallback;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            if ((r2 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.grid.TdsListGridV1View.onWarmupCompleted.onWarmupCompleted + 69;
            im.toss.uikit.widget.grid.TdsListGridV1View.onWarmupCompleted.onExtraCallbackWithResult = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 80 / 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWarmupCompleted(@Nullable String str, @Nullable String str2) {
        TdsImageView tdsImageView;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextView textView = this.onNavigationEvent;
        String str3 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            textView = null;
        }
        textView.setText(str);
        TdsImageView tdsImageView2 = this.onExtraCallback;
        if (tdsImageView2 == null) {
            int i4 = IAuthTabCallback + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            tdsImageView = null;
        } else {
            tdsImageView = tdsImageView2;
        }
        TdsImageView.setImage$default(tdsImageView, str2, (Function1) null, (Function1) null, 6, (Object) null);
        String str4 = str2 == null ? _UrlKt.FRAGMENT_ENCODE_SET : str2;
        if (str == null) {
            int i6 = IAuthTabCallback + 27;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 5;
            }
        } else {
            str3 = str;
        }
        generateInviteUrl.onWarmupCompleted(this, str4, str3, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setSize(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnNavigationEvent;
        float f;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onWarmupCompleted = i2 % 128;
        View view = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            this.onExtraCallbackWithResult = onextracallbackwithresult;
            view.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.onExtraCallbackWithResult = onextracallbackwithresult;
        View view2 = this.onExtraCallback;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            view2 = null;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int[] iArr = onNavigationEvent.onExtraCallback;
        int i3 = iArr[onextracallbackwithresult.ordinal()];
        if (i3 != 1) {
            int i4 = IAuthTabCallback + 57;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(30.0f), displayMetrics);
        } else {
            DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(24.0f), displayMetrics2);
        }
        layoutParams.width = iOnNavigationEvent;
        layoutParams.height = iOnNavigationEvent;
        view2.setLayoutParams(layoutParams);
        View view3 = this.onNavigationEvent;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i6 = IAuthTabCallback + 99;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        } else {
            view = view3;
        }
        int i8 = iArr[onextracallbackwithresult.ordinal()];
        if (i8 == 1) {
            f = 14.0f;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 13.0f;
        }
        view.setTextSize(0, Math.min(varyMatches.onTransact(view, Float.valueOf(f)), view.onExtraCallback(f)));
    }
}
