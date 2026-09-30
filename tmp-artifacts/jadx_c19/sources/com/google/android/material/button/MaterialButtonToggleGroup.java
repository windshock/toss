package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.StateListCornerSize;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.SuspendAnimationKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class MaterialButtonToggleGroup extends MaterialButtonGroup {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    private static final String LOG_TAG = "MButtonToggleGroup";
    private Set<Integer> checkedIds;
    private final int defaultCheckId;
    private final LinkedHashSet<OnButtonCheckedListener> onButtonCheckedListeners;
    private boolean selectionRequired;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z);
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        int i3 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i2, i3), attributeSet, i2);
        this.onButtonCheckedListeners = new LinkedHashSet<>();
        this.skipCheckedStateTracker = false;
        this.checkedIds = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, R.styleable.MaterialButtonToggleGroup, i2, i3, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.defaultCheckId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.selectionRequired = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        if (this.innerCornerSize == null) {
            this.innerCornerSize = StateListCornerSize.create(new AbsoluteCornerSize(0.0f));
        }
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        setImportantForAccessibility(1);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.defaultCheckId;
        if (i2 != -1) {
            updateCheckedIds(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, com.google.android.material.button.MaterialButton] */
    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(@NonNull View view, int i2, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i2, layoutParams);
            ?? r2 = (MaterialButton) view;
            setupButtonChild(r2);
            checkInternal(r2.getId(), r2.isChecked());
            ViewCompat.IAuthTabCallback((View) r2, new AccessibilityDelegateCompat() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
                /* JADX WARN: Multi-variable type inference failed */
                public void onInitializeAccessibilityNodeInfo(View view2, @NonNull SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
                    super.onInitializeAccessibilityNodeInfo(view2, suspendAnimationKtExternalSyntheticLambda4);
                    suspendAnimationKtExternalSyntheticLambda4.onExtraCallback(SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallbackStub.onNavigationEvent(0, 1, MaterialButtonToggleGroup.this.getIndexWithinVisibleButtons(view2), 1, false, ((MaterialButton) view2).isChecked()));
                }
            });
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        SuspendAnimationKtExternalSyntheticLambda4.onExtraCallbackWithResult(accessibilityNodeInfo).onWarmupCompleted(SuspendAnimationKtExternalSyntheticLambda4.onExtraCallbackWithResult.IAuthTabCallback(1, getVisibleButtonCount(), false, isSingleSelection() ? 1 : 2));
    }

    public void check(int i2) {
        checkInternal(i2, true);
    }

    public void uncheck(int i2) {
        checkInternal(i2, false);
    }

    public void clearChecked() {
        updateCheckedIds(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = getChildButton(i2).getId();
            if (this.checkedIds.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public void addOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.add(onButtonCheckedListener);
    }

    public void removeOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.remove(onButtonCheckedListener);
    }

    public void clearOnButtonCheckedListeners() {
        this.onButtonCheckedListeners.clear();
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearChecked();
        }
        updateChildrenA11yClassName();
    }

    private void updateChildrenA11yClassName() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildButton(i2).setA11yClassName(childrenA11yClassName);
        }
    }

    private String getChildrenA11yClassName() {
        return (this.singleSelection ? RadioButton.class : ToggleButton.class).getName();
    }

    public void setSelectionRequired(boolean z) {
        this.selectionRequired = z;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    private void setCheckedStateForView(int i2, boolean z) {
        Object objFindViewById = findViewById(i2);
        if (objFindViewById instanceof MaterialButton) {
            this.skipCheckedStateTracker = true;
            ((MaterialButton) objFindViewById).setChecked(z);
            this.skipCheckedStateTracker = false;
        }
    }

    private boolean isChildVisible(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && isChildVisible(i3)) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getIndexWithinVisibleButtons(@Nullable View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == view) {
                return i2;
            }
            if ((getChildAt(i3) instanceof MaterialButton) && isChildVisible(i3)) {
                i2++;
            }
        }
        return -1;
    }

    private void checkInternal(int i2, boolean z) {
        if (i2 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.checkedIds);
        if (z && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.singleSelection && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.selectionRequired || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        updateCheckedIds(hashSet);
    }

    private void updateCheckedIds(Set<Integer> set) {
        Set<Integer> set2 = this.checkedIds;
        this.checkedIds = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = getChildButton(i2).getId();
            setCheckedStateForView(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                dispatchOnButtonChecked(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void dispatchOnButtonChecked(int i2, boolean z) {
        Iterator<OnButtonCheckedListener> it = this.onButtonCheckedListeners.iterator();
        while (it.hasNext()) {
            it.next().onButtonChecked(this, i2, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    void onButtonCheckedStateChanged(@NonNull MaterialButton materialButton, boolean z) {
        if (this.skipCheckedStateTracker) {
            return;
        }
        checkInternal(materialButton.getId(), z);
    }
}
