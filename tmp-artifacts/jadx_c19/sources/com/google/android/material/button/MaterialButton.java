package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.google.android.material.button.MaterialButton$;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.CameraControllerExternalSyntheticLambda9;
import o.ITrustedWebActivityServiceStub;
import o.TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0;
import o.TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private static final float OPTICAL_CENTER_RATIO = 0.11f;
    private static final int UNSET = -1;
    private String accessibilityClassName;
    int allowedWidthDecrease;
    private boolean broadcasting;
    private boolean checked;
    private float displayedWidthDecrease;
    private float displayedWidthIncrease;
    private Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff.Mode iconTintMode;
    private int iconTop;
    private boolean isInHorizontalButtonGroup;
    private final MaterialButtonHelper materialButtonHelper;
    private final LinkedHashSet<OnCheckedChangeListener> onCheckedChangeListeners;
    private OnPressedChangeListener onPressedChangeListenerInternal;
    private boolean opticalCenterEnabled;
    private int opticalCenterShift;
    private int orientation;
    private LinearLayout.LayoutParams originalLayoutParams;
    private int originalPaddingEnd;
    private int originalPaddingStart;
    private float originalWidth;
    StateListSizeChange sizeChange;
    int widthChangeMax;
    private TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 widthIncreaseSpringAnimation;
    private static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_MaterialComponents_Button;
    private static final int MATERIAL_SIZE_OVERLAY_ATTR = com.google.android.material.R.attr.materialSizeOverlay;
    private static final FloatPropertyCompat<MaterialButton> WIDTH_INCREASE = new FloatPropertyCompat<MaterialButton>("widthIncrease") { // from class: com.google.android.material.button.MaterialButton.1
        public float getValue(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        public void setValue(MaterialButton materialButton, float f) {
            materialButton.setDisplayedWidthIncrease(f);
        }
    };

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialButton materialButton, boolean z);
    }

    interface OnPressedChangeListener {
        void onPressedChanged(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        ShapeAppearanceModel shapeAppearanceModelBuild;
        int i3 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3, new int[]{MATERIAL_SIZE_OVERLAY_ATTR}), attributeSet, i2);
        this.onCheckedChangeListeners = new LinkedHashSet<>();
        this.checked = false;
        this.broadcasting = false;
        this.orientation = -1;
        this.originalWidth = -1.0f;
        this.originalPaddingStart = -1;
        this.originalPaddingEnd = -1;
        this.allowedWidthDecrease = -1;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialButton, i2, i3, new int[0]);
        this.iconPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconPadding, 0);
        this.iconTintMode = ViewUtils.parseTintMode(typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.iconTint = MaterialResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_iconTint);
        this.icon = MaterialResources.getDrawable(getContext(), typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_icon);
        this.iconGravity = typedArrayObtainStyledAttributes.getInteger(com.google.android.material.R.styleable.MaterialButton_iconGravity, 1);
        this.iconSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.MaterialButton_iconSize, 0);
        StateListShapeAppearanceModel stateListShapeAppearanceModelCreate = StateListShapeAppearanceModel.create(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialButton_shapeAppearance);
        if (stateListShapeAppearanceModelCreate != null) {
            shapeAppearanceModelBuild = stateListShapeAppearanceModelCreate.getDefaultShape(true);
        } else {
            shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i2, i3).build();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButton_opticalCenterEnabled, false);
        MaterialButtonHelper materialButtonHelper = new MaterialButtonHelper(this, shapeAppearanceModelBuild);
        this.materialButtonHelper = materialButtonHelper;
        materialButtonHelper.loadFromAttributes(typedArrayObtainStyledAttributes);
        setCheckedInternal(typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.MaterialButton_android_checked, false));
        if (stateListShapeAppearanceModelCreate != null) {
            materialButtonHelper.setCornerSpringForce(createSpringForce());
            materialButtonHelper.setStateListShapeAppearanceModel(stateListShapeAppearanceModelCreate);
        }
        setOpticalCenterEnabled(z);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.iconPadding);
        updateIcon(this.icon != null);
    }

    private void initializeSizeAnimation() {
        TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0 transformableStateKtanimateZoomBy3ExternalSyntheticLambda0 = new TransformableStateKtanimateZoomBy3ExternalSyntheticLambda0(this, WIDTH_INCREASE);
        this.widthIncreaseSpringAnimation = transformableStateKtanimateZoomBy3ExternalSyntheticLambda0;
        transformableStateKtanimateZoomBy3ExternalSyntheticLambda0.onExtraCallbackWithResult(createSpringForce());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 createSpringForce() {
        return MotionUtils.resolveThemeSpringForce(getContext(), com.google.android.material.R.attr.motionSpringFastSpatial, com.google.android.material.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.accessibilityClassName)) {
            return (isCheckable() ? CompoundButton.class : Button.class).getName();
        }
        return this.accessibilityClassName;
    }

    public void setA11yClassName(@Nullable String str) {
        this.accessibilityClassName = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, com.google.android.material.button.MaterialButton$SavedState] */
    public Parcelable onSaveInstanceState() {
        ?? savedState = new SavedState(super/*android.view.View*/.onSaveInstanceState());
        savedState.checked = this.checked;
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.checked);
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setSupportBackgroundTintList(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getSupportBackgroundTintList();
        }
        return super.getSupportBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setSupportBackgroundTintMode(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getSupportBackgroundTintMode();
        }
        return super.getSupportBackgroundTintMode();
    }

    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundColor(int i2) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setBackgroundColor(i2);
        } else {
            super/*android.view.View*/.setBackgroundColor(i2);
        }
    }

    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? ITrustedWebActivityServiceStub.onExtraCallbackWithResult(getContext(), i2) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (isUsingOriginalBackground()) {
            if (drawable != getBackground()) {
                this.materialButtonHelper.setBackgroundOverwritten();
                super.setBackgroundDrawable(drawable);
                return;
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z, i2, i3, i4, i5);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        int i7 = getResources().getConfiguration().orientation;
        if (this.orientation != i7) {
            this.orientation = i7;
            this.originalWidth = -1.0f;
        }
        if (this.originalWidth == -1.0f) {
            this.originalWidth = getMeasuredWidth();
            if (this.originalLayoutParams == null && (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getButtonSizeChange() != null) {
                this.originalLayoutParams = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.originalLayoutParams);
                layoutParams.width = (int) this.originalWidth;
                setLayoutParams(layoutParams);
            }
        }
        if (this.allowedWidthDecrease == -1) {
            if (this.icon == null) {
                i6 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.iconSize;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.icon.getIntrinsicWidth();
                }
                i6 = iconPadding + intrinsicWidth;
            }
            this.allowedWidthDecrease = (getMeasuredWidth() - getTextLayoutWidth()) - i6;
        }
        if (this.originalPaddingStart == -1) {
            this.originalPaddingStart = getPaddingStart();
        }
        if (this.originalPaddingEnd == -1) {
            this.originalPaddingEnd = getPaddingEnd();
        }
        this.isInHorizontalButtonGroup = isInHorizontalButtonGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void recoverOriginalLayoutParams() {
        LinearLayout.LayoutParams layoutParams = this.originalLayoutParams;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.originalLayoutParams = null;
            this.originalWidth = -1.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWidth(int i2) {
        this.originalWidth = -1.0f;
        super/*android.widget.TextView*/.setWidth(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (isUsingOriginalBackground()) {
            MaterialShapeUtils.setParentAbsoluteElevation(this, this.materialButtonHelper.getMaterialShapeDrawable());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        super/*android.view.View*/.setElevation(f);
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.getMaterialShapeDrawable().setElevation(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void refreshDrawableState() {
        super/*android.view.View*/.refreshDrawableState();
        if (this.icon != null) {
            if (this.icon.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTextAlignment(int i2) {
        super/*android.view.View*/.setTextAlignment(i2);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment == 4) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateIconPosition(int i2, int i3) {
        if (this.icon == null || getLayout() == null) {
            return;
        }
        if (isIconStart() || isIconEnd()) {
            this.iconTop = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i4 = this.iconGravity;
            if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                this.iconLeft = 0;
                updateIcon(false);
                return;
            }
            int intrinsicWidth = this.iconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.icon.getIntrinsicWidth();
            }
            int textLayoutWidth = ((((i2 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.iconPadding) - getPaddingStart();
            if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                textLayoutWidth /= 2;
            }
            if (isLayoutRTL() != (this.iconGravity == 4)) {
                textLayoutWidth = -textLayoutWidth;
            }
            if (this.iconLeft != textLayoutWidth) {
                this.iconLeft = textLayoutWidth;
                updateIcon(false);
                return;
            }
            return;
        }
        if (isIconTop()) {
            this.iconLeft = 0;
            if (this.iconGravity == 16) {
                this.iconTop = 0;
                updateIcon(false);
                return;
            }
            int intrinsicHeight = this.iconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.icon.getIntrinsicHeight();
            }
            int iMax = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.iconPadding) - getPaddingBottom()) / 2);
            if (this.iconTop != iMax) {
                this.iconTop = iMax;
                updateIcon(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(fMax);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconPadding(int i2) {
        if (this.iconPadding != i2) {
            this.iconPadding = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public int getIconPadding() {
        return this.iconPadding;
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.iconSize != i2) {
            this.iconSize = i2;
            updateIcon(true);
        }
    }

    public int getIconSize() {
        return this.iconSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIcon(@Nullable Drawable drawable) {
        if (this.icon != drawable) {
            this.icon = drawable;
            updateIcon(true);
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? ITrustedWebActivityServiceStub.onExtraCallbackWithResult(getContext(), i2) : null);
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            updateIcon(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconTintResource(int i2) {
        setIconTint(ITrustedWebActivityServiceStub.IAuthTabCallback(getContext(), i2));
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            updateIcon(false);
        }
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateIcon(boolean z) {
        Drawable drawable = this.icon;
        if (drawable != null) {
            Drawable drawableMutate = CameraControllerExternalSyntheticLambda9.IAuthTabCallbackStub(drawable).mutate();
            this.icon = drawableMutate;
            drawableMutate.setTintList(this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                this.icon.setTintMode(mode);
            }
            int intrinsicWidth = this.iconSize;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.icon.getIntrinsicWidth();
            }
            int intrinsicHeight = this.iconSize;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i2 = this.iconLeft;
            int i3 = this.iconTop;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.icon.setVisible(true, z);
        }
        if (z) {
            resetIconDrawable();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!isIconStart() || drawable3 == this.icon) && ((!isIconEnd() || drawable5 == this.icon) && (!isIconTop() || drawable4 == this.icon))) {
            return;
        }
        resetIconDrawable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void resetIconDrawable() {
        if (isIconStart()) {
            setCompoundDrawablesRelative(this.icon, null, null, null);
        } else if (isIconEnd()) {
            setCompoundDrawablesRelative(null, null, this.icon, null);
        } else if (isIconTop()) {
            setCompoundDrawablesRelative(null, this.icon, null, null);
        }
    }

    private boolean isIconStart() {
        int i2 = this.iconGravity;
        return i2 == 1 || i2 == 2;
    }

    private boolean isIconEnd() {
        int i2 = this.iconGravity;
        return i2 == 3 || i2 == 4;
    }

    private boolean isIconTop() {
        int i2 = this.iconGravity;
        return i2 == 16 || i2 == 32;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setRippleColor(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRippleColorResource(int i2) {
        if (isUsingOriginalBackground()) {
            setRippleColor(ITrustedWebActivityServiceStub.IAuthTabCallback(getContext(), i2));
        }
    }

    public ColorStateList getRippleColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getRippleColor();
        }
        return null;
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setStrokeColor(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColorResource(int i2) {
        if (isUsingOriginalBackground()) {
            setStrokeColor(ITrustedWebActivityServiceStub.IAuthTabCallback(getContext(), i2));
        }
    }

    public ColorStateList getStrokeColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getStrokeColor();
        }
        return null;
    }

    public void setStrokeWidth(int i2) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setStrokeWidth(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeWidthResource(int i2) {
        if (isUsingOriginalBackground()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public int getStrokeWidth() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getStrokeWidth();
        }
        return 0;
    }

    public void setCornerRadius(int i2) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setCornerRadius(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCornerRadiusResource(int i2) {
        if (isUsingOriginalBackground()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public int getCornerRadius() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getCornerRadius();
        }
        return 0;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIconGravity(int i2) {
        if (this.iconGravity != i2) {
            this.iconGravity = i2;
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setInsetBottom(int i2) {
        this.materialButtonHelper.setInsetBottom(i2);
    }

    public int getInsetBottom() {
        return this.materialButtonHelper.getInsetBottom();
    }

    public void setInsetTop(int i2) {
        this.materialButtonHelper.setInsetTop(i2);
    }

    public int getInsetTop() {
        return this.materialButtonHelper.getInsetTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super/*android.view.View*/.onCreateDrawableState(i2 + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public void addOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListeners.add(onCheckedChangeListener);
    }

    public void removeOnCheckedChangeListener(@NonNull OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListeners.remove(onCheckedChangeListener);
    }

    public void clearOnCheckedChangeListeners() {
        this.onCheckedChangeListeners.clear();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setCheckedInternal(boolean z) {
        if (!isCheckable() || this.checked == z) {
            return;
        }
        this.checked = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).onButtonCheckedStateChanged(this, this.checked);
        }
        if (this.broadcasting) {
            return;
        }
        this.broadcasting = true;
        Iterator<OnCheckedChangeListener> it = this.onCheckedChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().onCheckedChanged(this, this.checked);
        }
        this.broadcasting = false;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean performClick() {
        if (isEnabled() && this.materialButtonHelper.isToggleCheckedStateOnClick()) {
            toggle();
        }
        return super/*android.view.View*/.performClick();
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.materialButtonHelper.isToggleCheckedStateOnClick();
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.materialButtonHelper.setToggleCheckedStateOnClick(z);
    }

    public boolean isCheckable() {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        return materialButtonHelper != null && materialButtonHelper.isCheckable();
    }

    public void setCheckable(boolean z) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setCheckable(z);
        }
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setShapeAppearanceModel(shapeAppearanceModel);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getShapeAppearanceModel();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public void setStateListShapeAppearanceModel(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        if (isUsingOriginalBackground()) {
            if (this.materialButtonHelper.getCornerSpringForce() == null && stateListShapeAppearanceModel.isStateful()) {
                this.materialButtonHelper.setCornerSpringForce(createSpringForce());
            }
            this.materialButtonHelper.setStateListShapeAppearanceModel(stateListShapeAppearanceModel);
            return;
        }
        throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public StateListShapeAppearanceModel getStateListShapeAppearanceModel() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.getStateListShapeAppearanceModel();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public void setCornerSpringForce(@NonNull TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 transformableStateKtanimateRotateBy2ExternalSyntheticLambda0) {
        this.materialButtonHelper.setCornerSpringForce(transformableStateKtanimateRotateBy2ExternalSyntheticLambda0);
    }

    public TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 getCornerSpringForce() {
        return this.materialButtonHelper.getCornerSpringForce();
    }

    void setOnPressedChangeListenerInternal(@Nullable OnPressedChangeListener onPressedChangeListener) {
        this.onPressedChangeListenerInternal = onPressedChangeListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        OnPressedChangeListener onPressedChangeListener = this.onPressedChangeListenerInternal;
        if (onPressedChangeListener != null) {
            onPressedChangeListener.onPressedChanged(this, z);
        }
        super/*android.view.View*/.setPressed(z);
        maybeAnimateSize(false);
    }

    private boolean isUsingOriginalBackground() {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        return (materialButtonHelper == null || materialButtonHelper.isBackgroundOverwritten()) ? false : true;
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.setShouldDrawSurfaceColorStroke(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void maybeAnimateSize(boolean z) {
        if (this.sizeChange != null) {
            if (this.widthIncreaseSpringAnimation == null) {
                initializeSizeAnimation();
            }
            if (this.isInHorizontalButtonGroup) {
                this.widthIncreaseSpringAnimation.asInterface(Math.min(this.widthChangeMax, this.sizeChange.getSizeChangeForState(getDrawableState()).widthChange.getChange(getWidth())));
                if (z) {
                    this.widthIncreaseSpringAnimation.IAuthTabCallbackStub();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isInHorizontalButtonGroup() {
        return (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getOrientation() == 0;
    }

    void setSizeChange(@NonNull StateListSizeChange stateListSizeChange) {
        if (this.sizeChange != stateListSizeChange) {
            this.sizeChange = stateListSizeChange;
            maybeAnimateSize(true);
        }
    }

    void setWidthChangeMax(int i2) {
        if (this.widthChangeMax != i2) {
            this.widthChangeMax = i2;
            maybeAnimateSize(true);
        }
    }

    int getAllowedWidthDecrease() {
        return this.allowedWidthDecrease;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.displayedWidthIncrease;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setDisplayedWidthIncrease(float f) {
        if (this.displayedWidthIncrease != f) {
            this.displayedWidthIncrease = f;
            updatePaddingsAndSizeForWidthAnimation();
            invalidate();
            if (getParent() instanceof MaterialButtonGroup) {
                ((MaterialButtonGroup) getParent()).onButtonWidthChanged(this, (int) this.displayedWidthIncrease);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void setDisplayedWidthDecrease(int i2) {
        this.displayedWidthDecrease = Math.min(i2, this.allowedWidthDecrease);
        updatePaddingsAndSizeForWidthAnimation();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOpticalCenterEnabled(boolean z) {
        if (this.opticalCenterEnabled != z) {
            this.opticalCenterEnabled = z;
            if (z) {
                this.materialButtonHelper.setCornerSizeChangeListener(new MaterialButton$.ExternalSyntheticLambda0(this));
            } else {
                this.materialButtonHelper.setCornerSizeChangeListener(null);
            }
            post(new MaterialButton$.ExternalSyntheticLambda1(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void $r8$lambda$yIekC4ZOwE7h3DZWcK1xG7ISabc(MaterialButton materialButton, float f) {
        int i2 = (int) (f * OPTICAL_CENTER_RATIO);
        if (materialButton.opticalCenterShift != i2) {
            materialButton.opticalCenterShift = i2;
            materialButton.updatePaddingsAndSizeForWidthAnimation();
            materialButton.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$sTDU5mTMH-dVAgylGXPenYNnUDs, reason: not valid java name */
    public static /* synthetic */ void m53$r8$lambda$sTDU5mTMHdVAgylGXPenYNnUDs(MaterialButton materialButton) {
        materialButton.opticalCenterShift = materialButton.getOpticalCenterShift();
        materialButton.updatePaddingsAndSizeForWidthAnimation();
        materialButton.invalidate();
    }

    public boolean isOpticalCenterEnabled() {
        return this.opticalCenterEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updatePaddingsAndSizeForWidthAnimation() {
        int i2 = (int) (this.displayedWidthIncrease - this.displayedWidthDecrease);
        int i3 = (i2 / 2) + this.opticalCenterShift;
        getLayoutParams().width = (int) (this.originalWidth + i2);
        setPaddingRelative(this.originalPaddingStart + i3, getPaddingTop(), (this.originalPaddingEnd + i2) - i3, getPaddingBottom());
    }

    private int getOpticalCenterShift() {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.opticalCenterEnabled && this.isInHorizontalButtonGroup && (materialShapeDrawable = this.materialButtonHelper.getMaterialShapeDrawable()) != null) {
            return (int) (materialShapeDrawable.getCornerSizeDiffX() * OPTICAL_CENTER_RATIO);
        }
        return 0;
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.button.MaterialButton.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };
        boolean checked;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.checked ? 1 : 0);
        }

        private void readFromParcel(@NonNull Parcel parcel) {
            this.checked = parcel.readInt() == 1;
        }
    }
}
