package com.tnkfactory.ad;

import android.graphics.drawable.Drawable;
import com.tnkfactory.ad.TnkAdLayoutConfig;
import com.tnkfactory.ad.basic.PlacementViewLayout;
import com.tnkfactory.ad.basic.TnkAdListItemLayout;
import com.tnkfactory.ad.basic.TnkAdListItemNormal;
import com.tnkfactory.ad.rwd.data.layout.TnkLayoutType;
import com.tnkfactory.ad.style.ITnkOffAdItem;
import com.xwray.groupie.Section;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdConfig {
    public static Drawable f;
    public static Drawable g;
    public static boolean j;
    public static boolean k;
    public static boolean l;
    public static int m;
    public static boolean n;
    public static final TnkAdConfig INSTANCE = new TnkAdConfig();
    public static final TnkAdLayoutConfig a = new TnkAdLayoutConfig();
    public static final TnkHeaderConfig b = new TnkHeaderConfig();
    public static boolean c = true;
    public static boolean d = true;
    public static int e = 10;
    public static int h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static String f24i = "";

    /* renamed from: o, reason: collision with root package name */
    public static String f25o = "tnk_popup_disable";
    public static int p = 2;

    public final String getDefaultSystemMessage() {
        return f24i;
    }

    public final int getDetailViewImageType() {
        return h;
    }

    public final TnkHeaderConfig getHeaderConfig() {
        return b;
    }

    public final TnkAdLayoutConfig getLayoutConfig() {
        return a;
    }

    public final TnkAdLayoutConfig.TnkAdListLayout getLayoutInfo(int i2) {
        TnkAdLayoutConfig.TnkAdListLayout tnkAdListLayout = a.getViewLayout().get(Integer.valueOf(i2));
        return tnkAdListLayout == null ? new TnkAdLayoutConfig.TnkAdListLayout(TnkLayoutType.INSTANCE.getAD_LIST_NORMAL(), Reflection.getOrCreateKotlinClass(TnkAdListItemNormal.class), Reflection.getOrCreateKotlinClass(TnkAdListItemLayout.class)) : tnkAdListLayout;
    }

    public final int getPointEffectType() {
        return m;
    }

    public final Drawable getPointIconDrawable() {
        return f;
    }

    public final Drawable getPointIconDrawableWhite() {
        return g;
    }

    public final String getTNK_POPUP_DISABLE() {
        return f25o;
    }

    public final int getTopScrollButtonConfig() {
        return p;
    }

    public final int getUpdateTimeMin() {
        return e;
    }

    public final boolean getUseCpsSortDialog() {
        return j;
    }

    public final boolean getUseCuration() {
        return d;
    }

    public final boolean getUsePointUnit() {
        return k;
    }

    public final boolean getUseTermsPopup() {
        return c;
    }

    public final boolean getVisibleDetailActionItemUnit() {
        return l;
    }

    public final boolean isTrackingApplication() {
        return n;
    }

    public final void setDefaultSystemMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        f24i = str;
    }

    public final void setDetailViewImageType(int i2) {
        h = i2;
    }

    public final void setLayoutInfo(int i2, @NotNull KClass<? extends ITnkOffAdItem> kClass, @NotNull KClass<? extends Section> kClass2) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass2, "");
        a.getViewLayout().put(Integer.valueOf(i2), new TnkAdLayoutConfig.TnkAdListLayout(i2, kClass, kClass2));
    }

    public final void setPlacementLayout(@NotNull String str, @NotNull KClass<? extends ITnkOffAdItem> kClass, @NotNull KClass<? extends PlacementViewLayout> kClass2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kClass2, "");
        a.getPlacementAdConfig().getPlacementLayout().put(str, new TnkAdLayoutConfig.TnkPlacementAdListLayout(str, kClass, kClass2));
    }

    public final void setPointEffectType(int i2) {
        if (i2 == 1) {
            k = true;
        } else if (i2 == 2 || i2 == 3) {
            k = false;
        } else if (i2 != 4) {
            k = false;
            m = 2;
        } else {
            k = true;
        }
        m = i2;
    }

    public final void setPointIconDrawable(@Nullable Drawable drawable) {
        f = drawable;
    }

    public final void setPointIconDrawableWhite(@Nullable Drawable drawable) {
        g = drawable;
    }

    public final void setTNK_POPUP_DISABLE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        f25o = str;
    }

    public final void setTopScrollButtonConfig(int i2) {
        p = i2;
    }

    public final void setTrackingApplication(boolean z) {
        n = z;
    }

    public final void setUpdateTimeMin(int i2) {
        e = i2;
    }

    public final void setUseCpsSortDialog(boolean z) {
        j = z;
    }

    public final void setUseCuration(boolean z) {
        d = z;
    }

    public final void setUsePointUnit(boolean z) {
        k = z;
    }

    public final void setUseTermsPopup(boolean z) {
        c = z;
    }

    public final void setVisibleDetailActionItemUnit(boolean z) {
        l = z;
    }
}
