package im.toss.uikit.widget.list.agreements.v1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.R;
import im.toss.uikit.widget.list.agreements.v1.TdsAgreementRowV1T04View$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_cacheControl;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsAgreementRowV1T04View extends TdsAgreementRowV1View {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV1T04View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsAgreementRowV1T04View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(TdsAgreementRowV1T04View tdsAgreementRowV1T04View, View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(tdsAgreementRowV1T04View, view);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsAgreementRowV1T04View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        deprecated_cacheControl deprecated_cachecontrol = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TdsAgreementRowV1);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            deprecated_cacheControl deprecated_cachecontrol2 = null;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.TdsAgreementRowV1_onArrowClick) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    if (string == null) {
                        int i6 = IAuthTabCallback + 87;
                        onExtraCallback = i6 % 128;
                        if (i6 % 2 == 0) {
                            throw null;
                        }
                        string = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    deprecated_cachecontrol2 = new deprecated_cacheControl(this, string);
                }
            }
            deprecated_cachecontrol = deprecated_cachecontrol2;
        }
        ICustomTabsCallback().setOnClickListener(deprecated_cachecontrol == null ? new TdsAgreementRowV1T04View$.ExternalSyntheticLambda0() : deprecated_cachecontrol);
        extraCallbackWithResult().setClickable(false);
        setOnClickListener(new TdsAgreementRowV1T04View$.ExternalSyntheticLambda1(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsAgreementRowV1T04View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback + 89;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback + 63;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 4;
            } else {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static final void onWarmupCompleted(TdsAgreementRowV1T04View tdsAgreementRowV1T04View, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        tdsAgreementRowV1T04View.extraCallbackWithResult().setChecked(!tdsAgreementRowV1T04View.extraCallbackWithResult().isChecked());
        int i4 = IAuthTabCallback + 77;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public int writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.layout.tds_agreement_row_v1_app_04;
            throw null;
        }
        int i4 = R.layout.tds_agreement_row_v1_app_04;
        int i5 = IAuthTabCallback + 73;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public int onActivityLayout() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = im.toss.tds.view.R.dimen.list_row_padding_left_24;
            throw null;
        }
        int i4 = im.toss.tds.view.R.dimen.list_row_padding_left_24;
        int i5 = IAuthTabCallback + 95;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public int onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = im.toss.tds.view.R.dimen.list_row_padding_right_24;
        int i5 = onExtraCallback + 57;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TdsCheckBoxV2View extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(findViewById(R.id.checkbox));
            throw null;
        }
        TdsCheckBoxV2View tdsCheckBoxV2ViewFindViewById = findViewById(R.id.checkbox);
        Intrinsics.checkNotNull(tdsCheckBoxV2ViewFindViewById);
        TdsCheckBoxV2View tdsCheckBoxV2View = tdsCheckBoxV2ViewFindViewById;
        int i3 = onExtraCallback + 19;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return tdsCheckBoxV2View;
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setTitle(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onActivityResized().setText(charSequence);
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
    }

    @Override // im.toss.uikit.widget.list.TdsListRowV0View
    public void setArrow(boolean z) {
        int i;
        int i2 = 2 % 2;
        TdsImageView tdsImageViewICustomTabsCallback = ICustomTabsCallback();
        if (!(!z)) {
            int i3 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            i = 8;
        }
        tdsImageViewICustomTabsCallback.setVisibility(i);
        int i5 = IAuthTabCallback + 75;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onPostMessage() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            extraCallbackWithResult().isChecked();
            throw null;
        }
        boolean zIsChecked = extraCallbackWithResult().isChecked();
        int i3 = IAuthTabCallback + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return zIsChecked;
    }

    public final void setChecked(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (extraCallbackWithResult().isChecked() == z) {
            return;
        }
        extraCallbackWithResult().setChecked(z);
        int i4 = onExtraCallback + 125;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityEvent(@NotNull AccessibilityEvent accessibilityEvent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(accessibilityEvent, "");
        super/*android.view.View*/.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setChecked(onPostMessage());
        int i4 = onExtraCallback + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(false);
        } else {
            Intrinsics.checkNotNullParameter(accessibilityNodeInfo, "");
            super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(true);
        }
        accessibilityNodeInfo.setChecked(onPostMessage());
        int i3 = onExtraCallback + 37;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
    }
}
