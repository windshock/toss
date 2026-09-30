package com.swmansion.rnscreens.fragment.restoration;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNScreensFragmentFactory extends FragmentFactory {
    public Fragment instantiate(@NotNull ClassLoader classLoader, @NotNull String str) {
        Intrinsics.checkNotNullParameter(classLoader, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt.startsWith$default(str, "com.swmansion.rnscreens", false, 2, (Object) null)) {
            return new AutoRemovingFragment();
        }
        Fragment fragmentInstantiate = super.instantiate(classLoader, str);
        Intrinsics.checkNotNull(fragmentInstantiate);
        return fragmentInstantiate;
    }
}
