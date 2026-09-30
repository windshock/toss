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
import im.toss.tds.view.component.atom.text.Typography7;
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
public final class ListItemSmall extends ConstraintLayout {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallback = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private final BaseTextView onExtraCallback;
    private final BaseTextView onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemSmall(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ListItemSmall(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [android.view.View, android.widget.TextView, im.toss.tds.view.component.atom.text.BaseTextView, im.toss.tds.view.component.atom.text.Typography7] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View, android.widget.TextView, im.toss.tds.view.component.atom.text.BaseTextView, im.toss.tds.view.component.atom.text.Typography7] */
    public ListItemSmall(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        setPadding(setTagsokhttp.onExtraCallbackWithResult(this, 16), getPaddingTop(), setTagsokhttp.onExtraCallbackWithResult(this, 24), setTagsokhttp.onExtraCallbackWithResult(this, 8));
        ?? typography7 = new Typography7(context, null, 0, 6, null);
        typography7.setId(View.generateViewId());
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult = new ConstraintLayout.onExtraCallbackWithResult(varyMatches.onExtraCallback((View) typography7, (Number) 24), -2);
        int i2 = 0;
        onextracallbackwithresult.IPostMessageServiceStubProxy = 0;
        onextracallbackwithresult.setEngagementSignalsCallback = 0;
        typography7.setLayoutParams(onextracallbackwithresult);
        typography7.onNavigationEvent(response.Bold);
        Context context2 = typography7.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Configuration configuration = context2.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        typography7.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).ICustomTabsCallbackStubProxy());
        typography7.setGravity(8388613);
        setProxySelectorokhttp.onExtraCallbackWithResult(this, (View) typography7);
        this.onExtraCallback = typography7;
        ?? typography72 = new Typography7(context, null, 0, 6, null);
        ConstraintLayout.onExtraCallbackWithResult onextracallbackwithresult2 = new ConstraintLayout.onExtraCallbackWithResult(0, -2);
        onextracallbackwithresult2.IPostMessageServiceStubProxy = typography7.getId();
        onextracallbackwithresult2.receiveFile = typography7.getId();
        onextracallbackwithresult2.IEngagementSignalsCallbackStubProxy = 0;
        ((ViewGroup.MarginLayoutParams) onextracallbackwithresult2).leftMargin = setTagsokhttp.onExtraCallbackWithResult((View) typography72, 8);
        typography72.setLayoutParams(onextracallbackwithresult2);
        Context context3 = typography72.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        Configuration configuration2 = context3.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "");
        typography72.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).ICustomTabsCallbackStubProxy());
        setProxySelectorokhttp.onExtraCallbackWithResult(this, (View) typography72);
        this.onWarmupCompleted = typography72;
        String str2 = "• ";
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ListItem, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.ListItem_liBullet) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    if (string == null) {
                        int i3 = asBinder + 39;
                        onNavigationEvent = i3 % 128;
                        if (i3 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        str2 = string;
                    }
                } else if (index == R.styleable.ListItem_liText) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    if (string2 == null) {
                        int i4 = asBinder + 79;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        int i6 = asBinder + 111;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        int i8 = 2 % 2;
                        str = string2;
                    }
                }
                i2++;
                int i9 = onNavigationEvent + 31;
                asBinder = i9 % 128;
                int i10 = i9 % 2;
                int i11 = 2 % 2;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        setText(str);
        setBullet(str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ListItemSmall(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        if ((i2 & 4) != 0) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 21;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 47;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setText(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.onWarmupCompleted.setText(charSequence);
        int i4 = asBinder + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
    }

    public final void setOrder(int i) {
        int i2 = 2 % 2;
        setBullet(i + ".");
        int i3 = onNavigationEvent + 31;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
    }

    public final void setBullet(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback.setText(charSequence);
        int i4 = onNavigationEvent + 39;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public final BaseTextView IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 123;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        BaseTextView baseTextView = this.onWarmupCompleted;
        int i5 = i2 + 117;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return baseTextView;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }
}
