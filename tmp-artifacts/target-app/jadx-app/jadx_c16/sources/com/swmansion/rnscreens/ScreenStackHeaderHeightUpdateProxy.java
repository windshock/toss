package com.swmansion.rnscreens;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ScreenStackHeaderHeightUpdateProxy {
    private Integer previousHeaderHeightInPx;

    public final Integer getPreviousHeaderHeightInPx() {
        return this.previousHeaderHeightInPx;
    }

    public final void setPreviousHeaderHeightInPx(@Nullable Integer num) {
        this.previousHeaderHeightInPx = num;
    }

    public final void updateHeaderHeightIfNeeded(@NotNull ScreenStackHeaderConfig screenStackHeaderConfig, @Nullable Screen screen) {
        Intrinsics.checkNotNullParameter(screenStackHeaderConfig, "");
        int height = screenStackHeaderConfig.isHeaderHidden() ? 0 : screenStackHeaderConfig.getToolbar().getHeight();
        Integer num = this.previousHeaderHeightInPx;
        if (num == null || height != num.intValue()) {
            this.previousHeaderHeightInPx = Integer.valueOf(height);
            if (screen != null) {
                screen.notifyHeaderHeightChange$react_native_screens_release(height);
            }
        }
    }
}
