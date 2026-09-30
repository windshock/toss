package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import o.TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class MaterialButtonHelper {
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;
    private TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 cornerSpringForce;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    private Drawable maskDrawable;
    private final MaterialButton materialButton;
    private MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener;
    private ColorStateList rippleColor;
    private LayerDrawable rippleDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    private StateListShapeAppearanceModel stateListShapeAppearanceModel;
    private ColorStateList strokeColor;
    private int strokeWidth;
    private boolean shouldDrawSurfaceColorStroke = false;
    private boolean backgroundOverwritten = false;
    private boolean cornerRadiusSet = false;
    private boolean toggleCheckedStateOnClick = true;

    MaterialButtonHelper(MaterialButton materialButton, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.materialButton = materialButton;
        this.shapeAppearanceModel = shapeAppearanceModel;
    }

    void loadFromAttributes(@NonNull TypedArray typedArray) {
        this.insetLeft = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetLeft, 0);
        this.insetRight = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetRight, 0);
        this.insetTop = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetTop, 0);
        this.insetBottom = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetBottom, 0);
        int i2 = R.styleable.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            this.cornerRadius = dimensionPixelSize;
            setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(dimensionPixelSize));
            this.cornerRadiusSet = true;
        }
        this.strokeWidth = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_strokeWidth, 0);
        this.backgroundTintMode = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.backgroundTint = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, R.styleable.MaterialButton_backgroundTint);
        this.strokeColor = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, R.styleable.MaterialButton_strokeColor);
        this.rippleColor = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, R.styleable.MaterialButton_rippleColor);
        this.checkable = typedArray.getBoolean(R.styleable.MaterialButton_android_checkable, false);
        this.elevation = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_elevation, 0);
        this.toggleCheckedStateOnClick = typedArray.getBoolean(R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = this.materialButton.getPaddingStart();
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = this.materialButton.getPaddingEnd();
        int paddingBottom = this.materialButton.getPaddingBottom();
        if (typedArray.hasValue(R.styleable.MaterialButton_android_background)) {
            setBackgroundOverwritten();
        } else {
            updateBackground();
        }
        this.materialButton.setPaddingRelative(paddingStart + this.insetLeft, paddingTop + this.insetTop, paddingEnd + this.insetRight, paddingBottom + this.insetBottom);
    }

    private void updateBackground() {
        this.materialButton.setInternalBackground(createBackground());
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(this.elevation);
            materialShapeDrawable.setState(this.materialButton.getDrawableState());
        }
    }

    void setBackgroundOverwritten() {
        this.backgroundOverwritten = true;
        this.materialButton.setSupportBackgroundTintList(this.backgroundTint);
        this.materialButton.setSupportBackgroundTintMode(this.backgroundTintMode);
    }

    boolean isBackgroundOverwritten() {
        return this.backgroundOverwritten;
    }

    private InsetDrawable wrapDrawableWithInset(Drawable drawable) {
        return new InsetDrawable(drawable, this.insetLeft, this.insetTop, this.insetRight, this.insetBottom);
    }

    void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            if (getMaterialShapeDrawable() != null) {
                getMaterialShapeDrawable().setTintList(this.backgroundTint);
            }
        }
    }

    ColorStateList getSupportBackgroundTintList() {
        return this.backgroundTint;
    }

    void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            if (getMaterialShapeDrawable() == null || this.backgroundTintMode == null) {
                return;
            }
            getMaterialShapeDrawable().setTintMode(this.backgroundTintMode);
        }
    }

    PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        this.shouldDrawSurfaceColorStroke = z;
        updateStroke();
    }

    private Drawable createBackground() {
        Drawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.stateListShapeAppearanceModel;
        if (stateListShapeAppearanceModel != null) {
            materialShapeDrawable.setStateListShapeAppearanceModel(stateListShapeAppearanceModel);
        }
        TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 transformableStateKtanimateRotateBy2ExternalSyntheticLambda0 = this.cornerSpringForce;
        if (transformableStateKtanimateRotateBy2ExternalSyntheticLambda0 != null) {
            materialShapeDrawable.setCornerSpringForce(transformableStateKtanimateRotateBy2ExternalSyntheticLambda0);
        }
        MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener = this.onCornerSizeChangeListener;
        if (onCornerSizeChangeListener != null) {
            materialShapeDrawable.setOnCornerSizeChangeListener(onCornerSizeChangeListener);
        }
        materialShapeDrawable.initializeElevationOverlay(this.materialButton.getContext());
        materialShapeDrawable.setTintList(this.backgroundTint);
        PorterDuff.Mode mode = this.backgroundTintMode;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
        Drawable materialShapeDrawable2 = new MaterialShapeDrawable(this.shapeAppearanceModel);
        StateListShapeAppearanceModel stateListShapeAppearanceModel2 = this.stateListShapeAppearanceModel;
        if (stateListShapeAppearanceModel2 != null) {
            materialShapeDrawable2.setStateListShapeAppearanceModel(stateListShapeAppearanceModel2);
        }
        TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 transformableStateKtanimateRotateBy2ExternalSyntheticLambda02 = this.cornerSpringForce;
        if (transformableStateKtanimateRotateBy2ExternalSyntheticLambda02 != null) {
            materialShapeDrawable2.setCornerSpringForce(transformableStateKtanimateRotateBy2ExternalSyntheticLambda02);
        }
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke(this.strokeWidth, this.shouldDrawSurfaceColorStroke ? MaterialColors.getColor(this.materialButton, R.attr.colorSurface) : 0);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.shapeAppearanceModel);
        this.maskDrawable = materialShapeDrawable3;
        StateListShapeAppearanceModel stateListShapeAppearanceModel3 = this.stateListShapeAppearanceModel;
        if (stateListShapeAppearanceModel3 != null) {
            materialShapeDrawable3.setStateListShapeAppearanceModel(stateListShapeAppearanceModel3);
        }
        TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 transformableStateKtanimateRotateBy2ExternalSyntheticLambda03 = this.cornerSpringForce;
        if (transformableStateKtanimateRotateBy2ExternalSyntheticLambda03 != null) {
            this.maskDrawable.setCornerSpringForce(transformableStateKtanimateRotateBy2ExternalSyntheticLambda03);
        }
        this.maskDrawable.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.rippleColor), wrapDrawableWithInset(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.maskDrawable);
        this.rippleDrawable = rippleDrawable;
        return rippleDrawable;
    }

    void updateMaskBounds(int i2, int i3) {
        Drawable drawable = this.maskDrawable;
        if (drawable != null) {
            drawable.setBounds(this.insetLeft, this.insetTop, i3 - this.insetRight, i2 - this.insetBottom);
        }
    }

    void setBackgroundColor(int i2) {
        if (getMaterialShapeDrawable() != null) {
            getMaterialShapeDrawable().setTint(i2);
        }
    }

    void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            if (this.materialButton.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.materialButton.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            }
        }
    }

    ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.strokeColor != colorStateList) {
            this.strokeColor = colorStateList;
            updateStroke();
        }
    }

    ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    void setStrokeWidth(int i2) {
        if (this.strokeWidth != i2) {
            this.strokeWidth = i2;
            updateStroke();
        }
    }

    int getStrokeWidth() {
        return this.strokeWidth;
    }

    private void updateStroke() {
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        MaterialShapeDrawable surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
            if (surfaceColorStrokeDrawable != null) {
                surfaceColorStrokeDrawable.setStroke(this.strokeWidth, this.shouldDrawSurfaceColorStroke ? MaterialColors.getColor(this.materialButton, R.attr.colorSurface) : 0);
            }
        }
    }

    void setCornerRadius(int i2) {
        if (this.cornerRadiusSet && this.cornerRadius == i2) {
            return;
        }
        this.cornerRadius = i2;
        this.cornerRadiusSet = true;
        setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(i2));
    }

    int getCornerRadius() {
        return this.cornerRadius;
    }

    private MaterialShapeDrawable getMaterialShapeDrawable(boolean z) {
        LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return ((LayerDrawable) ((InsetDrawable) this.rippleDrawable.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    MaterialShapeDrawable getMaterialShapeDrawable() {
        return getMaterialShapeDrawable(false);
    }

    void setCheckable(boolean z) {
        this.checkable = z;
    }

    boolean isCheckable() {
        return this.checkable;
    }

    boolean isToggleCheckedStateOnClick() {
        return this.toggleCheckedStateOnClick;
    }

    void setToggleCheckedStateOnClick(boolean z) {
        this.toggleCheckedStateOnClick = z;
    }

    void setCornerSizeChangeListener(@Nullable MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener) {
        this.onCornerSizeChangeListener = onCornerSizeChangeListener;
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setOnCornerSizeChangeListener(onCornerSizeChangeListener);
        }
    }

    private MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
        return getMaterialShapeDrawable(true);
    }

    private void updateButtonShape() {
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            StateListShapeAppearanceModel stateListShapeAppearanceModel = this.stateListShapeAppearanceModel;
            if (stateListShapeAppearanceModel != null) {
                materialShapeDrawable.setStateListShapeAppearanceModel(stateListShapeAppearanceModel);
            } else {
                materialShapeDrawable.setShapeAppearanceModel(this.shapeAppearanceModel);
            }
            TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 transformableStateKtanimateRotateBy2ExternalSyntheticLambda0 = this.cornerSpringForce;
            if (transformableStateKtanimateRotateBy2ExternalSyntheticLambda0 != null) {
                materialShapeDrawable.setCornerSpringForce(transformableStateKtanimateRotateBy2ExternalSyntheticLambda0);
            }
        }
        MaterialShapeDrawable surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (surfaceColorStrokeDrawable != null) {
            StateListShapeAppearanceModel stateListShapeAppearanceModel2 = this.stateListShapeAppearanceModel;
            if (stateListShapeAppearanceModel2 != null) {
                surfaceColorStrokeDrawable.setStateListShapeAppearanceModel(stateListShapeAppearanceModel2);
            } else {
                surfaceColorStrokeDrawable.setShapeAppearanceModel(this.shapeAppearanceModel);
            }
            TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 transformableStateKtanimateRotateBy2ExternalSyntheticLambda02 = this.cornerSpringForce;
            if (transformableStateKtanimateRotateBy2ExternalSyntheticLambda02 != null) {
                surfaceColorStrokeDrawable.setCornerSpringForce(transformableStateKtanimateRotateBy2ExternalSyntheticLambda02);
            }
        }
        MaterialShapeDrawable maskDrawable = getMaskDrawable();
        if (maskDrawable != null) {
            maskDrawable.setShapeAppearanceModel(this.shapeAppearanceModel);
            if (maskDrawable instanceof MaterialShapeDrawable) {
                MaterialShapeDrawable materialShapeDrawable2 = maskDrawable;
                StateListShapeAppearanceModel stateListShapeAppearanceModel3 = this.stateListShapeAppearanceModel;
                if (stateListShapeAppearanceModel3 != null) {
                    materialShapeDrawable2.setStateListShapeAppearanceModel(stateListShapeAppearanceModel3);
                }
                TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 transformableStateKtanimateRotateBy2ExternalSyntheticLambda03 = this.cornerSpringForce;
                if (transformableStateKtanimateRotateBy2ExternalSyntheticLambda03 != null) {
                    materialShapeDrawable2.setCornerSpringForce(transformableStateKtanimateRotateBy2ExternalSyntheticLambda03);
                }
            }
        }
    }

    public Shapeable getMaskDrawable() {
        LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.rippleDrawable.getNumberOfLayers() > 2) {
            return this.rippleDrawable.getDrawable(2);
        }
        return this.rippleDrawable.getDrawable(1);
    }

    void setCornerSpringForce(@NonNull TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 transformableStateKtanimateRotateBy2ExternalSyntheticLambda0) {
        this.cornerSpringForce = transformableStateKtanimateRotateBy2ExternalSyntheticLambda0;
        if (this.stateListShapeAppearanceModel != null) {
            updateButtonShape();
        }
    }

    TransformableStateKtanimateRotateBy2ExternalSyntheticLambda0 getCornerSpringForce() {
        return this.cornerSpringForce;
    }

    void setStateListShapeAppearanceModel(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.stateListShapeAppearanceModel = stateListShapeAppearanceModel;
        updateButtonShape();
    }

    StateListShapeAppearanceModel getStateListShapeAppearanceModel() {
        return this.stateListShapeAppearanceModel;
    }

    void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        this.stateListShapeAppearanceModel = null;
        updateButtonShape();
    }

    ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public void setInsetBottom(int i2) {
        setVerticalInsets(this.insetTop, i2);
    }

    public int getInsetBottom() {
        return this.insetBottom;
    }

    public void setInsetTop(int i2) {
        setVerticalInsets(i2, this.insetBottom);
    }

    private void setVerticalInsets(int i2, int i3) {
        int paddingStart = this.materialButton.getPaddingStart();
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = this.materialButton.getPaddingEnd();
        int paddingBottom = this.materialButton.getPaddingBottom();
        int i4 = this.insetTop;
        int i5 = this.insetBottom;
        this.insetBottom = i3;
        this.insetTop = i2;
        if (!this.backgroundOverwritten) {
            updateBackground();
        }
        this.materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    public int getInsetTop() {
        return this.insetTop;
    }
}
