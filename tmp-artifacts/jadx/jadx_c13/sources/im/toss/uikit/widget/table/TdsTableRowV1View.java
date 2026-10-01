package im.toss.uikit.widget.table;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.uikit.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class TdsTableRowV1View extends ConstraintLayout {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTableRowV1View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsTableRowV1View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~(i7 | i5);
        int i9 = ~i;
        int i10 = ~(i9 | i5);
        int i11 = i8 | i10;
        int i12 = ~i5;
        int i13 = ~(i12 | i3);
        int i14 = (~(i | i7)) | i13 | i10;
        int i15 = (~(i9 | i3)) | (~(i12 | i9)) | i13;
        int i16 = i5 + i3 + i6 + ((-954185507) * i2) + (2055044340 * i4);
        int i17 = i16 * i16;
        int i18 = ((1110557339 * i5) - 760807424) + ((-878567756) * i3) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i6) + (1313472512 * i2) + (606601216 * i4) + ((-1232666624) * i17);
        int i19 = (i5 * 1290134917) + 267690129 + (i3 * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i6 * 1290136159) + (i2 * 826674179) + (i4 * 1594648204) + (i17 * 572063744);
        int i20 = i18 + (i19 * i19 * 607715328);
        if (i20 != 1) {
            return i20 != 2 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }
        ConstraintLayout constraintLayout = (TdsTableRowV1View) objArr[0];
        int i21 = 2 % 2;
        int i22 = onExtraCallback + 57;
        onWarmupCompleted = i22 % 128;
        int i23 = i22 % 2;
        View viewFindViewById = constraintLayout.findViewById(R.id.spaceRight);
        Intrinsics.checkNotNull(viewFindViewById);
        Space space = (Space) viewFindViewById;
        int i24 = onExtraCallback + 41;
        onWarmupCompleted = i24 % 128;
        int i25 = i24 % 2;
        return space;
    }

    public abstract int onExtraCallback();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsTableRowV1View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutInflater.from(context).inflate(onExtraCallback(), (ViewGroup) this, true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsTableRowV1, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 2 % 2;
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == im.toss.tds.view.R.styleable.TdsListRowV1View_android_paddingVertical) {
                    int i4 = onWarmupCompleted + 119;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    ViewGroup.LayoutParams layoutParams = IAuthTabCallbackStub().getLayoutParams();
                    Resources resources = getResources();
                    int i6 = im.toss.tds.view.R.dimen.list_row_padding_vertical_16;
                    layoutParams.height = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, resources.getDimensionPixelOffset(i6));
                    IAuthTabCallbackDefault().getLayoutParams().height = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(i6));
                } else if (index == im.toss.tds.view.R.styleable.TdsListRowV1View_android_paddingTop) {
                    IAuthTabCallbackStub().getLayoutParams().height = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(im.toss.tds.view.R.dimen.list_row_padding_vertical_16));
                } else {
                    Object obj = null;
                    if (index == im.toss.tds.view.R.styleable.TdsListRowV1View_android_paddingBottom) {
                        int i7 = onExtraCallback + 55;
                        onWarmupCompleted = i7 % 128;
                        if (i7 % 2 == 0) {
                            IAuthTabCallbackDefault().getLayoutParams().height = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(im.toss.tds.view.R.dimen.list_row_padding_vertical_16));
                            throw null;
                        }
                        IAuthTabCallbackDefault().getLayoutParams().height = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(im.toss.tds.view.R.dimen.list_row_padding_vertical_16));
                    } else if (index == R.styleable.TdsTableRowV1_tableRowLabel) {
                        onExtraCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1606023985, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1606023987, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this, typedArrayObtainStyledAttributes.getString(index)});
                    } else if (index == R.styleable.TdsTableRowV1_tableRowLabelColor) {
                        int i8 = onWarmupCompleted + 43;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            onWarmupCompleted(typedArrayObtainStyledAttributes.getColorStateList(index));
                            obj.hashCode();
                            throw null;
                        }
                        onWarmupCompleted(typedArrayObtainStyledAttributes.getColorStateList(index));
                    } else if (index == R.styleable.TdsTableRowV1_tableRowLabelFont) {
                        onExtraCallback(typedArrayObtainStyledAttributes.getResourceId(index, 0));
                    } else if (index == R.styleable.TdsTableRowV1_tableRowLabelPercent) {
                        onWarmupCompleted(typedArrayObtainStyledAttributes.getFloat(index, 0.4f));
                    } else if (index == R.styleable.TdsTableRowV1_tableRowContent) {
                        onNavigationEvent(typedArrayObtainStyledAttributes.getString(index));
                        int i9 = onExtraCallback + 57;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                    } else if (index == R.styleable.TdsTableRowV1_tableRowContentColor) {
                        int i11 = onExtraCallback + 47;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        onNavigationEvent(typedArrayObtainStyledAttributes.getColorStateList(index));
                    } else if (index == R.styleable.TdsTableRowV1_tableRowContentFont) {
                        onNavigationEvent(typedArrayObtainStyledAttributes.getResourceId(index, 0));
                    } else if (index == R.styleable.TdsTableRowV1_tableRowBorder) {
                        int i13 = onExtraCallback + 95;
                        onWarmupCompleted = i13 % 128;
                        if (i13 % 2 == 0) {
                            onExtraCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1425704444, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1425704444, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this, Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false))});
                        } else {
                            onExtraCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1425704444, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1425704444, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{this, Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false))});
                        }
                    }
                }
            }
        }
        super/*android.view.View*/.setPadding(0, 0, 0, 0);
        super/*android.view.View*/.setPaddingRelative(0, 0, 0, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsTableRowV1View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 17;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallback + 79;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 81;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        asInterface().getLayoutParams().width = i;
        IAuthTabCallbackStub().getLayoutParams().height = i2;
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        ((Space) onExtraCallback(iOnExtraCallback, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1536842326, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1536842327, iOnExtraCallback2, new Object[]{this})).getLayoutParams().width = i3;
        IAuthTabCallbackDefault().getLayoutParams().height = i4;
        int i8 = onWarmupCompleted + 45;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 37;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        asInterface().getLayoutParams().width = getLeft();
        IAuthTabCallbackStub().getLayoutParams().height = i2;
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        ((Space) onExtraCallback(iOnExtraCallback, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1536842326, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1536842327, iOnExtraCallback2, new Object[]{this})).getLayoutParams().width = getRight();
        IAuthTabCallbackDefault().getLayoutParams().height = i4;
        int i8 = onExtraCallback + 51;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsTableRowV1View tdsTableRowV1View = (TdsTableRowV1View) objArr[0];
        CharSequence charSequence = (CharSequence) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            tdsTableRowV1View.onExtraCallbackWithResult().setText(charSequence);
            throw null;
        }
        tdsTableRowV1View.onExtraCallbackWithResult().setText(charSequence);
        int i3 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 74 / 0;
        }
        return null;
    }

    public final void IAuthTabCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult().setTextColor(i);
        int i5 = onExtraCallback + 75;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onWarmupCompleted(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
            if (colorStateList == null) {
                return;
            }
        } else if (colorStateList == null) {
            return;
        }
        onExtraCallbackWithResult().setTextColor(colorStateList);
        int i4 = onWarmupCompleted + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i != 0) {
            int i5 = i3 + 39;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            onExtraCallbackWithResult().onWarmupCompleted(i);
            int i7 = onWarmupCompleted + 59;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public final void onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted().setGuidelinePercent(f);
            throw null;
        }
        onWarmupCompleted().setGuidelinePercent(f);
        int i3 = onExtraCallback + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onNavigationEvent(@Nullable CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent().setText(charSequence);
            int i3 = 9 / 0;
        } else {
            onNavigationEvent().setText(charSequence);
        }
        int i4 = onWarmupCompleted + 35;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onNavigationEvent().setTextColor(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        onNavigationEvent().setTextColor(i);
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (colorStateList != null) {
            onNavigationEvent().setTextColor(colorStateList);
            int i4 = onWarmupCompleted + 43;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = onWarmupCompleted + 9;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 5 / 0;
        }
    }

    public final void onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (i != 0) {
            int i5 = i4 + 111;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            onNavigationEvent().onWarmupCompleted(i);
        }
        int i7 = onWarmupCompleted + 107;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 0;
        TdsTableRowV1View tdsTableRowV1View = (TdsTableRowV1View) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        View viewIAuthTabCallback = tdsTableRowV1View.IAuthTabCallback();
        if (zBooleanValue) {
            int i5 = onWarmupCompleted + 27;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i = 8;
        }
        viewIAuthTabCallback.setVisibility(i);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Space asInterface() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.spaceLeft);
        Intrinsics.checkNotNull(viewFindViewById);
        Space space = (Space) viewFindViewById;
        int i4 = onWarmupCompleted + 9;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return space;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Space IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.spaceTop);
        Intrinsics.checkNotNull(viewFindViewById);
        Space space = (Space) viewFindViewById;
        int i4 = onWarmupCompleted + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return space;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Space IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.spaceBottom);
        if (i3 == 0) {
            Intrinsics.checkNotNull(viewFindViewById);
            return (Space) viewFindViewById;
        }
        Intrinsics.checkNotNull(viewFindViewById);
        int i4 = 64 / 0;
        return (Space) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseTextView onExtraCallbackWithResult() {
        BaseTextView baseTextView;
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            View viewFindViewById = findViewById(R.id.label);
            Intrinsics.checkNotNull(viewFindViewById);
            baseTextView = (BaseTextView) viewFindViewById;
            int i3 = 9 / 0;
        } else {
            BaseTextView baseTextViewFindViewById = findViewById(R.id.label);
            Intrinsics.checkNotNull(baseTextViewFindViewById);
            baseTextView = baseTextViewFindViewById;
        }
        int i4 = onExtraCallback + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return baseTextView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BaseTextView onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BaseTextView baseTextViewFindViewById = findViewById(R.id.content);
        Intrinsics.checkNotNull(baseTextViewFindViewById);
        BaseTextView baseTextView = baseTextViewFindViewById;
        int i4 = onExtraCallback + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return baseTextView;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.border);
        Intrinsics.checkNotNull(viewFindViewById);
        int i4 = onExtraCallback + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Guideline onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Guideline guidelineFindViewById = findViewById(R.id.labelPercent);
        Intrinsics.checkNotNull(guidelineFindViewById);
        Guideline guideline = guidelineFindViewById;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return guideline;
    }

    private final Space asBinder() {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (Space) onExtraCallback(iOnExtraCallback, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1536842326, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1536842327, iOnExtraCallback2, new Object[]{this});
    }

    public final void onExtraCallback(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        onExtraCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1425704444, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1425704444, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr);
    }

    public final void onExtraCallbackWithResult(@Nullable CharSequence charSequence) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        onExtraCallback(iOnExtraCallback, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -1606023985, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1606023987, iOnExtraCallback2, new Object[]{this, charSequence});
    }
}
