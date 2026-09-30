package com.squareup.wire;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access15300;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class Syntax {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Syntax[] $VALUES;
    public static final Companion Companion;
    public static final Syntax PROTO_2 = new Syntax("PROTO_2", 0, "proto2");
    public static final Syntax PROTO_3 = new Syntax("PROTO_3", 1, "proto3");
    private final String string;

    private static final /* synthetic */ Syntax[] $values() {
        return new Syntax[]{PROTO_2, PROTO_3};
    }

    public static EnumEntries<Syntax> getEntries() {
        return $ENTRIES;
    }

    private Syntax(String str, int i2, String str2) {
        this.string = str2;
    }

    static {
        Syntax[] syntaxArr$values = $values();
        $VALUES = syntaxArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(syntaxArr$values);
        Companion = new Companion(null);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.string;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Syntax get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            for (Syntax syntax : Syntax.values()) {
                if (Intrinsics.areEqual(syntax.string, str)) {
                    return syntax;
                }
            }
            throw new IllegalArgumentException("unexpected syntax: " + str);
        }
    }

    public static Syntax valueOf(String str) {
        return (Syntax) Enum.valueOf(Syntax.class, str);
    }

    public static Syntax[] values() {
        return (Syntax[]) $VALUES.clone();
    }
}
