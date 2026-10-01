package com.swmansion.rnscreens;

import kotlin.enums.EnumEntries;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class Screen$StackAnimation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Screen$StackAnimation[] $VALUES;
    public static final Screen$StackAnimation DEFAULT = new Screen$StackAnimation("DEFAULT", 0);
    public static final Screen$StackAnimation NONE = new Screen$StackAnimation("NONE", 1);
    public static final Screen$StackAnimation FADE = new Screen$StackAnimation("FADE", 2);
    public static final Screen$StackAnimation SLIDE_FROM_BOTTOM = new Screen$StackAnimation("SLIDE_FROM_BOTTOM", 3);
    public static final Screen$StackAnimation SLIDE_FROM_RIGHT = new Screen$StackAnimation("SLIDE_FROM_RIGHT", 4);
    public static final Screen$StackAnimation SLIDE_FROM_LEFT = new Screen$StackAnimation("SLIDE_FROM_LEFT", 5);
    public static final Screen$StackAnimation FADE_FROM_BOTTOM = new Screen$StackAnimation("FADE_FROM_BOTTOM", 6);
    public static final Screen$StackAnimation IOS_FROM_RIGHT = new Screen$StackAnimation("IOS_FROM_RIGHT", 7);
    public static final Screen$StackAnimation IOS_FROM_LEFT = new Screen$StackAnimation("IOS_FROM_LEFT", 8);

    private static final /* synthetic */ Screen$StackAnimation[] $values() {
        return new Screen$StackAnimation[]{DEFAULT, NONE, FADE, SLIDE_FROM_BOTTOM, SLIDE_FROM_RIGHT, SLIDE_FROM_LEFT, FADE_FROM_BOTTOM, IOS_FROM_RIGHT, IOS_FROM_LEFT};
    }

    public static EnumEntries<Screen$StackAnimation> getEntries() {
        return $ENTRIES;
    }

    public static Screen$StackAnimation valueOf(String str) {
        return (Screen$StackAnimation) Enum.valueOf(Screen$StackAnimation.class, str);
    }

    public static Screen$StackAnimation[] values() {
        return (Screen$StackAnimation[]) $VALUES.clone();
    }

    private Screen$StackAnimation(String str, int i) {
    }

    static {
        Screen$StackAnimation[] screen$StackAnimationArr$values = $values();
        $VALUES = screen$StackAnimationArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(screen$StackAnimationArr$values);
    }
}
