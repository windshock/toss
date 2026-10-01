package com.swmansion.rnscreens;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class Screen$ReplaceAnimation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Screen$ReplaceAnimation[] $VALUES;
    public static final Screen$ReplaceAnimation PUSH = new Screen$ReplaceAnimation("PUSH", 0);
    public static final Screen$ReplaceAnimation POP = new Screen$ReplaceAnimation("POP", 1);

    private static final /* synthetic */ Screen$ReplaceAnimation[] $values() {
        return new Screen$ReplaceAnimation[]{PUSH, POP};
    }

    public static EnumEntries<Screen$ReplaceAnimation> getEntries() {
        return $ENTRIES;
    }

    public static Screen$ReplaceAnimation valueOf(String str) {
        return (Screen$ReplaceAnimation) Enum.valueOf(Screen$ReplaceAnimation.class, str);
    }

    public static Screen$ReplaceAnimation[] values() {
        return (Screen$ReplaceAnimation[]) $VALUES.clone();
    }

    private Screen$ReplaceAnimation(String str, int i) {
    }

    static {
        Screen$ReplaceAnimation[] screen$ReplaceAnimationArr$values = $values();
        $VALUES = screen$ReplaceAnimationArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(screen$ReplaceAnimationArr$values);
    }
}
