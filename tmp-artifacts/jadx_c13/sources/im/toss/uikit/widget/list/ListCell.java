package im.toss.uikit.widget.list;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.uikit.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFj1wSDK;
import o.collectAnrErrorDetailsbugsnag_plugin_android_anr_release;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getSpecialFeatureOptInStatus;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ListCell extends ConstraintLayout {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private AFj1wSDK onExtraCallbackWithResult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListCell(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListCell(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListCell(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        asInterface();
        IAuthTabCallback(context, attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ListCell(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 105;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallback + 77;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            getLayoutParams();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -2));
        }
        AFj1wSDK aFj1wSDKIAuthTabCallback = AFj1wSDK.IAuthTabCallback(LayoutInflater.from(getContext()).inflate(R.layout.list_cell, (ViewGroup) this, true));
        Intrinsics.checkNotNullExpressionValue(aFj1wSDKIAuthTabCallback, "");
        this.onExtraCallbackWithResult = aFj1wSDKIAuthTabCallback;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new onExtraCallback(configuration)).onWarmupCompleted());
        int i3 = IAuthTabCallback + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void IAuthTabCallback(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ListCell, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int i3 = IAuthTabCallback + 7;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.ListCell_dividerType) {
                    int i5 = onExtraCallback + 51;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    IAuthTabCallback(typedArrayObtainStyledAttributes.getInt(index, collectAnrErrorDetailsbugsnag_plugin_android_anr_release.THIN.ordinal()));
                } else if (index == R.styleable.ListCell_topDividerLeftMargin) {
                    onWarmupCompleted(typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, 0));
                } else if (index == R.styleable.ListCell_bottomDividerLeftMargin) {
                    onNavigationEvent(typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, 0));
                } else if (index == R.styleable.ListCell_android_background) {
                    int i7 = onExtraCallback + 47;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    setBackground(typedArrayObtainStyledAttributes.getDrawable(index));
                }
            }
        }
        int i9 = IAuthTabCallback + 19;
        onExtraCallback = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onExtraCallbackWithResult(@NotNull collectAnrErrorDetailsbugsnag_plugin_android_anr_release collectanrerrordetailsbugsnag_plugin_android_anr_release, @NotNull View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(collectanrerrordetailsbugsnag_plugin_android_anr_release, "");
        Intrinsics.checkNotNullParameter(view, "");
        int i2 = onExtraCallbackWithResult.onExtraCallbackWithResult[collectanrerrordetailsbugsnag_plugin_android_anr_release.ordinal()];
        if (i2 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = getResources().getDimensionPixelSize(R.dimen.list_divider_thin_height);
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(R.drawable.list_divider_thin);
            return;
        }
        if (i2 == 2) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = getResources().getDimensionPixelSize(R.dimen.list_divider_bottom_height);
            view.setLayoutParams(layoutParams2);
            view.setBackgroundResource(R.drawable.list_divider_bottom);
            return;
        }
        int i3 = onExtraCallback + 123;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (i2 == 3) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            layoutParams3.height = getResources().getDimensionPixelSize(R.dimen.list_divider_header_height);
            view.setLayoutParams(layoutParams3);
            view.setBackgroundResource(R.drawable.list_divider_header);
            return;
        }
        if (i2 == 4) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            layoutParams4.height = getResources().getDimensionPixelSize(R.dimen.list_divider_thin_height);
            view.setLayoutParams(layoutParams4);
            view.setBackgroundResource(R.drawable.list_divider_thin);
            return;
        }
        int i6 = i4 + 31;
        int i7 = i6 % 128;
        onExtraCallback = i7;
        if (i6 % 2 == 0 ? i2 != 5 : i2 != 2) {
            int i8 = i7 + 25;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        } else {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            layoutParams5.height = getResources().getDimensionPixelSize(R.dimen.list_divider_thick_height);
            view.setLayoutParams(layoutParams5);
            view.setBackgroundResource(R.drawable.list_divider_thick);
        }
    }

    public void onExtraCallback(@NotNull collectAnrErrorDetailsbugsnag_plugin_android_anr_release collectanrerrordetailsbugsnag_plugin_android_anr_release) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(collectanrerrordetailsbugsnag_plugin_android_anr_release, "");
        AFj1wSDK aFj1wSDK = null;
        if (onExtraCallbackWithResult.onExtraCallbackWithResult[collectanrerrordetailsbugsnag_plugin_android_anr_release.ordinal()] == 6) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 63;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            AFj1wSDK aFj1wSDK2 = this.onExtraCallbackWithResult;
            if (aFj1wSDK2 == null) {
                int i7 = i4 + 55;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            } else {
                aFj1wSDK = aFj1wSDK2;
            }
            aFj1wSDK.onWarmupCompleted.setVisibility(8);
            return;
        }
        AFj1wSDK aFj1wSDK3 = this.onExtraCallbackWithResult;
        if (aFj1wSDK3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1wSDK3 = null;
        }
        aFj1wSDK3.onWarmupCompleted.setVisibility(0);
        AFj1wSDK aFj1wSDK4 = this.onExtraCallbackWithResult;
        if (aFj1wSDK4 == null) {
            int i9 = onExtraCallback + 5;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            if (i10 == 0) {
                aFj1wSDK.hashCode();
                throw null;
            }
        } else {
            aFj1wSDK = aFj1wSDK4;
        }
        View view = aFj1wSDK.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(view, "");
        onExtraCallbackWithResult(collectanrerrordetailsbugsnag_plugin_android_anr_release, view);
    }

    public void onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 113;
        onExtraCallback = i3 % 128;
        AFj1wSDK aFj1wSDK = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        AFj1wSDK aFj1wSDK2 = this.onExtraCallbackWithResult;
        if (aFj1wSDK2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = onExtraCallback + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            aFj1wSDK2 = null;
        }
        View view = aFj1wSDK2.onWarmupCompleted;
        AFj1wSDK aFj1wSDK3 = this.onExtraCallbackWithResult;
        if (aFj1wSDK3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1wSDK = aFj1wSDK3;
        }
        ConstraintLayout.onExtraCallbackWithResult layoutParams = aFj1wSDK.onWarmupCompleted.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = layoutParams;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).leftMargin = i;
        view.setLayoutParams(onextracallbackwithresult);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r7 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET);
        r7 = im.toss.uikit.widget.list.ListCell.onExtraCallback + 77;
        im.toss.uikit.widget.list.ListCell.IAuthTabCallback = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r2.IAuthTabCallback.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        r1 = r6.onExtraCallbackWithResult;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r1 = im.toss.uikit.widget.list.ListCell.IAuthTabCallback + 85;
        im.toss.uikit.widget.list.ListCell.onExtraCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if ((r1 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET);
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        r1.IAuthTabCallback.setVisibility(0);
        r1 = r6.onExtraCallbackWithResult;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r1 = im.toss.uikit.widget.list.ListCell.IAuthTabCallback + 75;
        im.toss.uikit.widget.list.ListCell.onExtraCallback = r1 % 128;
        r1 = r1 % 2;
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(okhttp3.internal.url._UrlKt.FRAGMENT_ENCODE_SET);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r1 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        r0 = 25 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        r0 = r2.IAuthTabCallback;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        onExtraCallbackWithResult(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (im.toss.uikit.widget.list.ListCell.onExtraCallbackWithResult.onExtraCallbackWithResult[r7.ordinal()] == 29) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (im.toss.uikit.widget.list.ListCell.onExtraCallbackWithResult.onExtraCallbackWithResult[r7.ordinal()] == 6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r7 = r6.onExtraCallbackWithResult;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNavigationEvent(@NotNull collectAnrErrorDetailsbugsnag_plugin_android_anr_release collectanrerrordetailsbugsnag_plugin_android_anr_release) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        AFj1wSDK aFj1wSDK = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(collectanrerrordetailsbugsnag_plugin_android_anr_release, "");
        } else {
            Intrinsics.checkNotNullParameter(collectanrerrordetailsbugsnag_plugin_android_anr_release, "");
        }
    }

    public void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 61;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        AFj1wSDK aFj1wSDK = this.onExtraCallbackWithResult;
        AFj1wSDK aFj1wSDK2 = null;
        if (aFj1wSDK == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1wSDK = null;
        }
        View view = aFj1wSDK.IAuthTabCallback;
        AFj1wSDK aFj1wSDK3 = this.onExtraCallbackWithResult;
        if (aFj1wSDK3 == null) {
            int i5 = IAuthTabCallback + 105;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1wSDK2 = aFj1wSDK3;
        }
        ConstraintLayout.onExtraCallbackWithResult layoutParams = aFj1wSDK2.IAuthTabCallback.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = layoutParams;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult).leftMargin = i;
        view.setLayoutParams(onextracallbackwithresult);
    }

    protected void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 7;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            IAuthTabCallback((collectAnrErrorDetailsbugsnag_plugin_android_anr_release) collectAnrErrorDetailsbugsnag_plugin_android_anr_release.getEntries().get(i));
            throw null;
        }
        IAuthTabCallback((collectAnrErrorDetailsbugsnag_plugin_android_anr_release) collectAnrErrorDetailsbugsnag_plugin_android_anr_release.getEntries().get(i));
        int i4 = IAuthTabCallback + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void IAuthTabCallback(@NotNull collectAnrErrorDetailsbugsnag_plugin_android_anr_release collectanrerrordetailsbugsnag_plugin_android_anr_release) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(collectanrerrordetailsbugsnag_plugin_android_anr_release, "");
            int i3 = onExtraCallbackWithResult.onExtraCallbackWithResult[collectanrerrordetailsbugsnag_plugin_android_anr_release.ordinal()];
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(collectanrerrordetailsbugsnag_plugin_android_anr_release, "");
        switch (onExtraCallbackWithResult.onExtraCallbackWithResult[collectanrerrordetailsbugsnag_plugin_android_anr_release.ordinal()]) {
            case 1:
                onNavigationEvent(collectanrerrordetailsbugsnag_plugin_android_anr_release);
                onNavigationEvent(getResources().getDimensionPixelSize(R.dimen.list_divider_left_margin_24));
                return;
            case 2:
                onNavigationEvent(collectanrerrordetailsbugsnag_plugin_android_anr_release);
                onNavigationEvent(0);
                return;
            case 3:
                onExtraCallback(collectanrerrordetailsbugsnag_plugin_android_anr_release);
                onWarmupCompleted(0);
                return;
            case 4:
                onExtraCallback(collectanrerrordetailsbugsnag_plugin_android_anr_release);
                onWarmupCompleted(0);
                int i4 = onExtraCallback + 35;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 10 / 0;
                    return;
                }
                return;
            case 5:
                onExtraCallback(collectanrerrordetailsbugsnag_plugin_android_anr_release);
                onWarmupCompleted(0);
                return;
            case 6:
                onNavigationEvent(collectanrerrordetailsbugsnag_plugin_android_anr_release);
                onExtraCallback(collectanrerrordetailsbugsnag_plugin_android_anr_release);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            return o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Light;
            r2 = im.toss.uikit.widget.list.ListCell.onExtraCallback.onWarmupCompleted + 109;
            im.toss.uikit.widget.list.ListCell.onExtraCallback.IAuthTabCallback = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            if ((r2 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            r0 = null;
            r0.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.onExtraCallback) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 51 / 0;
            }
        }
    }
}
