package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setRandomHost {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ setRandomHost[] $VALUES;
    public static final setRandomHost DEFAULT = new setRandomHost("DEFAULT", 0);
    public static final setRandomHost LAZY = new setRandomHost("LAZY", 1);
    public static final setRandomHost ATOMIC = new setRandomHost("ATOMIC", 2);
    public static final setRandomHost UNDISPATCHED = new setRandomHost("UNDISPATCHED", 3);

    public final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[setRandomHost.values().length];
            try {
                iArr[setRandomHost.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setRandomHost.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setRandomHost.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setRandomHost.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr;
        }
    }

    private static final /* synthetic */ setRandomHost[] $values() {
        return new setRandomHost[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    public static EnumEntries<setRandomHost> getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    private setRandomHost(String str, int i) {
    }

    static {
        setRandomHost[] setrandomhostArr$values = $values();
        $VALUES = setrandomhostArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(setrandomhostArr$values);
    }

    public final <R, T> void invoke(@NotNull Function2<? super R, ? super access13800<? super T>, ? extends Object> function2, R r, @NotNull access13800<? super T> access13800Var) {
        int i = onNavigationEvent.onNavigationEvent[ordinal()];
        if (i == 1) {
            setLoop.onExtraCallbackWithResult(function2, r, access13800Var);
            return;
        }
        if (i == 2) {
            access13900.onWarmupCompleted(function2, r, access13800Var);
        } else if (i == 3) {
            fromInt.IAuthTabCallback(function2, r, access13800Var);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static setRandomHost valueOf(String str) {
        return (setRandomHost) Enum.valueOf(setRandomHost.class, str);
    }

    public static setRandomHost[] values() {
        return (setRandomHost[]) $VALUES.clone();
    }
}
