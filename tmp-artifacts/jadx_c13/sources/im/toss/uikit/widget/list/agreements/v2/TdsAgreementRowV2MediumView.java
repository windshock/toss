package im.toss.uikit.widget.list.agreements.v2;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography6;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM;
import o.readIntokhttp;
import o.response;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsAgreementRowV2MediumView extends TdsAgreementRowV2GroupView implements r8lambdaGl6DVaADMzOQAx15SLozMvkPqKM {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV2MediumView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV2MediumView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView
    public int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 27;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV2MediumView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        boolean z = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsAgreementRowV2Medium, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int i3 = onExtraCallback + 119;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.TdsAgreementRowV2Medium_indent) {
                    z2 = typedArrayObtainStyledAttributes.getBoolean(index, z2);
                    int i5 = onExtraCallback + 67;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                }
            }
            z = z2;
        }
        setIndent(z);
        int i8 = onExtraCallback + 103;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAgreementRowV2MediumView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onWarmupCompleted + 19;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView
    public BaseTextView IAuthTabCallback() {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Typography6 typography6 = new Typography6(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        typography6.onNavigationEvent(response.Medium);
        Context context2 = typography6.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        typography6.setTextColor(new getUrlokhttp(new IAuthTabCallback(configuration)).ICustomTabsCallbackStubProxy());
        int i2 = onExtraCallback + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return typography6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView
    public int onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics);
        int i4 = onWarmupCompleted + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iOnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // im.toss.uikit.widget.list.agreements.v2.TdsAgreementRowV2GroupView
    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            return varyMatches.onNavigationEvent(Float.valueOf(48.0f), displayMetrics);
        }
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        varyMatches.onNavigationEvent(Float.valueOf(48.0f), displayMetrics2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if ((r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.onExtraCallbackWithResult) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r2 = getContext().getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "");
        r5.onMessageChannelReady = o.varyMatches.onNavigationEvent(java.lang.Float.valueOf(30.0f), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        r1.setLayoutParams(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setIndent(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        if (!z) {
            return;
        }
        int i5 = i3 + 119;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(false);
        BaseTextView baseTextViewIAuthTabCallbackStub = IAuthTabCallbackStub();
        if (baseTextViewIAuthTabCallbackStub == null) {
            return;
        }
        int i7 = onExtraCallback + 57;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        ConstraintLayout.onExtraCallbackWithResult layoutParams = baseTextViewIAuthTabCallbackStub.getLayoutParams();
        if (i8 != 0) {
            int i9 = 62 / 0;
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onNavigationEvent + 37;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i5 = onNavigationEvent + 41;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
