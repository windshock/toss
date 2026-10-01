package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import o.access15300;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreenStackHeaderSubview extends FabricEnabledHeaderSubviewViewGroup {
    private boolean isReactSizeSet;
    private int reactHeight;
    private int reactWidth;
    private Type type;

    public ScreenStackHeaderSubview(@Nullable ReactContext reactContext) {
        super(reactContext);
        this.type = Type.LEFT;
    }

    public final Type getType() {
        return this.type;
    }

    public final void setType(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        this.type = type;
    }

    public final ScreenStackHeaderConfig getConfig() {
        Object parent = getParent();
        CustomToolbar customToolbar = parent instanceof CustomToolbar ? (CustomToolbar) parent : null;
        if (customToolbar != null) {
            return customToolbar.getConfig();
        }
        return null;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            this.reactWidth = View.MeasureSpec.getSize(i);
            this.reactHeight = View.MeasureSpec.getSize(i2);
            this.isReactSizeSet = true;
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.reactWidth, this.reactHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && this.isReactSizeSet) {
            updateSubviewFrameState(i3 - i, i4 - i2, i, i2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type LEFT = new Type("LEFT", 0);
        public static final Type CENTER = new Type("CENTER", 1);
        public static final Type RIGHT = new Type("RIGHT", 2);
        public static final Type BACK = new Type("BACK", 3);
        public static final Type SEARCH_BAR = new Type("SEARCH_BAR", 4);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{LEFT, CENTER, RIGHT, BACK, SEARCH_BAR};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        private Type(String str, int i) {
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(typeArr$values);
        }
    }
}
