package com.squareup.wire;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.access15300;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class FieldEncoding {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FieldEncoding[] $VALUES;
    public static final Companion Companion;
    private final int value;
    public static final FieldEncoding VARINT = new FieldEncoding("VARINT", 0, 0);
    public static final FieldEncoding FIXED64 = new FieldEncoding("FIXED64", 1, 1);
    public static final FieldEncoding LENGTH_DELIMITED = new FieldEncoding("LENGTH_DELIMITED", 2, 2);
    public static final FieldEncoding FIXED32 = new FieldEncoding("FIXED32", 3, 5);

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FieldEncoding[] $values() {
        return new FieldEncoding[]{VARINT, FIXED64, LENGTH_DELIMITED, FIXED32};
    }

    public static EnumEntries<FieldEncoding> getEntries() {
        return $ENTRIES;
    }

    private FieldEncoding(String str, int i2, int i3) {
        this.value = i3;
    }

    public final int getValue$wire_runtime() {
        return this.value;
    }

    static {
        FieldEncoding[] fieldEncodingArr$values = $values();
        $VALUES = fieldEncodingArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(fieldEncodingArr$values);
        Companion = new Companion(null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final ProtoAdapter<?> rawProtoAdapter() throws NoWhenBranchMatchedException {
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i2 == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i2 == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return ProtoAdapter.BYTES;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FieldEncoding get$wire_runtime(int i2) throws IOException {
            if (i2 == 0) {
                return FieldEncoding.VARINT;
            }
            if (i2 == 1) {
                return FieldEncoding.FIXED64;
            }
            if (i2 == 2) {
                return FieldEncoding.LENGTH_DELIMITED;
            }
            if (i2 == 5) {
                return FieldEncoding.FIXED32;
            }
            throw new ProtocolException("Unexpected FieldEncoding: " + i2);
        }
    }

    public static FieldEncoding valueOf(String str) {
        return (FieldEncoding) Enum.valueOf(FieldEncoding.class, str);
    }

    public static FieldEncoding[] values() {
        return (FieldEncoding[]) $VALUES.clone();
    }
}
