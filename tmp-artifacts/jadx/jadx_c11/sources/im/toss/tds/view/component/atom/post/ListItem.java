package im.toss.tds.view.component.atom.post;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.SubTypography10;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getUrlokhttp;
import o.response;
import o.setBodyokhttp;
import o.setProxySelectorokhttp;
import o.setTagsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ListItem extends ConstraintLayout {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;
    private final BaseTextView onExtraCallbackWithResult;
    private final BaseTextView onNavigationEvent;

    static {
        int i = IAuthTabCallback + 121;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItem(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [android.view.View, android.widget.TextView, im.toss.tds.view.component.atom.text.BaseTextView, im.toss.tds.view.component.atom.text.SubTypography10] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View, android.widget.TextView, im.toss.tds.view.component.atom.text.BaseTextView, im.toss.tds.view.component.atom.text.SubTypography10] */
    public ListItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        setPadding(setTagsokhttp.onExtraCallbackWithResult(this, 16), getPaddingTop(), setTagsokhttp.onExtraCallbackWithResult(this, 24), setTagsokhttp.onExtraCallbackWithResult(this, 8));
        ?? subTypography10 = new SubTypography10(context, null, 0, 6, null);
        subTypography10.setId(View.generateViewId());
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(varyMatches.onExtraCallback((View) subTypography10, (Number) 24), -2);
        int i2 = 0;
        onextracallbackwithresult.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult.setEngagementSignalsCallback = 0;
        subTypography10.setLayoutParams(onextracallbackwithresult);
        subTypography10.onNavigationEvent(response.Bold);
        Context context2 = subTypography10.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        subTypography10.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).ICustomTabsCallbackStubProxy());
        subTypography10.setGravity(8388613);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, (View) subTypography10);
        this.onNavigationEvent = subTypography10;
        ?? subTypography102 = new SubTypography10(context, null, 0, 6, null);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = new ConstraintLayout.onExtraCallbackWithResult(0, -2);
        onextracallbackwithresult2.IPostMessageServiceStubProxy = subTypography10.getId();
        onextracallbackwithresult2.receiveFile = subTypography10.getId();
        onextracallbackwithresult2.IEngagementSignalsCallbackStubProxy = 0;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).leftMargin = setTagsokhttp.onExtraCallbackWithResult((View) subTypography102, 8);
        subTypography102.setLayoutParams(onextracallbackwithresult2);
        Context context3 = subTypography102.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        subTypography102.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).ICustomTabsCallbackStubProxy());
        setProxySelectorokhttp.onExtraCallbackWithResult(this, (View) subTypography102);
        this.onExtraCallbackWithResult = subTypography102;
        String str2 = "• ";
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ListItem, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            while (i2 < indexCount) {
                int i3 = onTransact + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.ListItem_liBullet) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    if (string == null) {
                        int i5 = 2 % 2;
                    } else {
                        str2 = string;
                    }
                } else if (index == R.styleable.ListItem_liText) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    if (string2 == null) {
                        int i6 = onExtraCallback;
                        int i7 = i6 + 63;
                        onTransact = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = i6 + 75;
                        onTransact = i9 % 128;
                        int i10 = i9 % 2;
                        int i52 = 2 % 2;
                    } else {
                        str = string2;
                    }
                }
                i2++;
                int i11 = 2 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        setText(str);
        setBullet(str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ListItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 43;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = onExtraCallback + 103;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setText(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.setText(charSequence);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CharSequence onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewOnNavigationEvent = onNavigationEvent();
        if (i3 != 0) {
            return baseTextViewOnNavigationEvent.getText();
        }
        baseTextViewOnNavigationEvent.getText();
        throw null;
    }

    public final void setOrder(int i) {
        int i2 = 2 % 2;
        setBullet(i + ".");
        int i3 = onTransact + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void setBullet(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.onNavigationEvent.setText(charSequence);
            int i3 = 22 / 0;
        } else {
            this.onNavigationEvent.setText(charSequence);
        }
        int i4 = onTransact + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final BaseTextView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 113;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        BaseTextView baseTextView = this.onExtraCallbackWithResult;
        int i5 = i3 + 29;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return baseTextView;
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }
}
