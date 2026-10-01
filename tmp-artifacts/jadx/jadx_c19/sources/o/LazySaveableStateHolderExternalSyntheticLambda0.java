package o;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LazySaveableStateHolderExternalSyntheticLambda0 {
    private static final /* synthetic */ LazySaveableStateHolderExternalSyntheticLambda0[] $VALUES;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 BOOL;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 BOOL_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 BOOL_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 BYTES;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 BYTES_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 DOUBLE;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 DOUBLE_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 ENUM;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 ENUM_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 ENUM_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 FIXED32;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 FIXED32_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 FIXED32_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 FIXED64;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 FIXED64_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 FIXED64_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 FLOAT;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 FLOAT_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 FLOAT_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 GROUP;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 GROUP_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 INT32;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 INT32_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 INT32_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 INT64;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 INT64_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 INT64_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 MAP;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 MESSAGE;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 MESSAGE_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SFIXED32;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SFIXED32_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SFIXED32_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SFIXED64;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SFIXED64_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SFIXED64_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SINT32;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SINT32_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SINT32_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SINT64;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SINT64_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 SINT64_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 STRING;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 STRING_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 UINT32;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 UINT32_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 UINT32_LIST_PACKED;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 UINT64;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 UINT64_LIST;
    public static final LazySaveableStateHolderExternalSyntheticLambda0 UINT64_LIST_PACKED;
    private static final LazySaveableStateHolderExternalSyntheticLambda0[] VALUES;
    private final IAuthTabCallback collection;
    private final Class<?> elementType;
    private final int id;
    private final shouldPause javaType;
    private final boolean primitiveScalar;

    public static LazySaveableStateHolderExternalSyntheticLambda0 valueOf(String str) {
        return (LazySaveableStateHolderExternalSyntheticLambda0) Enum.valueOf(LazySaveableStateHolderExternalSyntheticLambda0.class, str);
    }

    public static LazySaveableStateHolderExternalSyntheticLambda0[] values() {
        return (LazySaveableStateHolderExternalSyntheticLambda0[]) $VALUES.clone();
    }

    static {
        IAuthTabCallback iAuthTabCallback = IAuthTabCallback.SCALAR;
        shouldPause shouldpause = shouldPause.DOUBLE;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda0 = new LazySaveableStateHolderExternalSyntheticLambda0("DOUBLE", 0, 0, iAuthTabCallback, shouldpause);
        DOUBLE = lazySaveableStateHolderExternalSyntheticLambda0;
        shouldPause shouldpause2 = shouldPause.FLOAT;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda02 = new LazySaveableStateHolderExternalSyntheticLambda0("FLOAT", 1, 1, iAuthTabCallback, shouldpause2);
        FLOAT = lazySaveableStateHolderExternalSyntheticLambda02;
        shouldPause shouldpause3 = shouldPause.LONG;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda03 = new LazySaveableStateHolderExternalSyntheticLambda0("INT64", 2, 2, iAuthTabCallback, shouldpause3);
        INT64 = lazySaveableStateHolderExternalSyntheticLambda03;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda04 = new LazySaveableStateHolderExternalSyntheticLambda0("UINT64", 3, 3, iAuthTabCallback, shouldpause3);
        UINT64 = lazySaveableStateHolderExternalSyntheticLambda04;
        shouldPause shouldpause4 = shouldPause.INT;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda05 = new LazySaveableStateHolderExternalSyntheticLambda0("INT32", 4, 4, iAuthTabCallback, shouldpause4);
        INT32 = lazySaveableStateHolderExternalSyntheticLambda05;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda06 = new LazySaveableStateHolderExternalSyntheticLambda0("FIXED64", 5, 5, iAuthTabCallback, shouldpause3);
        FIXED64 = lazySaveableStateHolderExternalSyntheticLambda06;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda07 = new LazySaveableStateHolderExternalSyntheticLambda0("FIXED32", 6, 6, iAuthTabCallback, shouldpause4);
        FIXED32 = lazySaveableStateHolderExternalSyntheticLambda07;
        shouldPause shouldpause5 = shouldPause.BOOLEAN;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda08 = new LazySaveableStateHolderExternalSyntheticLambda0("BOOL", 7, 7, iAuthTabCallback, shouldpause5);
        BOOL = lazySaveableStateHolderExternalSyntheticLambda08;
        shouldPause shouldpause6 = shouldPause.STRING;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda09 = new LazySaveableStateHolderExternalSyntheticLambda0("STRING", 8, 8, iAuthTabCallback, shouldpause6);
        STRING = lazySaveableStateHolderExternalSyntheticLambda09;
        shouldPause shouldpause7 = shouldPause.MESSAGE;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda010 = new LazySaveableStateHolderExternalSyntheticLambda0("MESSAGE", 9, 9, iAuthTabCallback, shouldpause7);
        MESSAGE = lazySaveableStateHolderExternalSyntheticLambda010;
        shouldPause shouldpause8 = shouldPause.BYTE_STRING;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda011 = new LazySaveableStateHolderExternalSyntheticLambda0("BYTES", 10, 10, iAuthTabCallback, shouldpause8);
        BYTES = lazySaveableStateHolderExternalSyntheticLambda011;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda012 = new LazySaveableStateHolderExternalSyntheticLambda0("UINT32", 11, 11, iAuthTabCallback, shouldpause4);
        UINT32 = lazySaveableStateHolderExternalSyntheticLambda012;
        shouldPause shouldpause9 = shouldPause.ENUM;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda013 = new LazySaveableStateHolderExternalSyntheticLambda0("ENUM", 12, 12, iAuthTabCallback, shouldpause9);
        ENUM = lazySaveableStateHolderExternalSyntheticLambda013;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda014 = new LazySaveableStateHolderExternalSyntheticLambda0("SFIXED32", 13, 13, iAuthTabCallback, shouldpause4);
        SFIXED32 = lazySaveableStateHolderExternalSyntheticLambda014;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda015 = new LazySaveableStateHolderExternalSyntheticLambda0("SFIXED64", 14, 14, iAuthTabCallback, shouldpause3);
        SFIXED64 = lazySaveableStateHolderExternalSyntheticLambda015;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda016 = new LazySaveableStateHolderExternalSyntheticLambda0("SINT32", 15, 15, iAuthTabCallback, shouldpause4);
        SINT32 = lazySaveableStateHolderExternalSyntheticLambda016;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda017 = new LazySaveableStateHolderExternalSyntheticLambda0("SINT64", 16, 16, iAuthTabCallback, shouldpause3);
        SINT64 = lazySaveableStateHolderExternalSyntheticLambda017;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda018 = new LazySaveableStateHolderExternalSyntheticLambda0("GROUP", 17, 17, iAuthTabCallback, shouldpause7);
        GROUP = lazySaveableStateHolderExternalSyntheticLambda018;
        IAuthTabCallback iAuthTabCallback2 = IAuthTabCallback.VECTOR;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda019 = new LazySaveableStateHolderExternalSyntheticLambda0("DOUBLE_LIST", 18, 18, iAuthTabCallback2, shouldpause);
        DOUBLE_LIST = lazySaveableStateHolderExternalSyntheticLambda019;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda020 = new LazySaveableStateHolderExternalSyntheticLambda0("FLOAT_LIST", 19, 19, iAuthTabCallback2, shouldpause2);
        FLOAT_LIST = lazySaveableStateHolderExternalSyntheticLambda020;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda021 = new LazySaveableStateHolderExternalSyntheticLambda0("INT64_LIST", 20, 20, iAuthTabCallback2, shouldpause3);
        INT64_LIST = lazySaveableStateHolderExternalSyntheticLambda021;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda022 = new LazySaveableStateHolderExternalSyntheticLambda0("UINT64_LIST", 21, 21, iAuthTabCallback2, shouldpause3);
        UINT64_LIST = lazySaveableStateHolderExternalSyntheticLambda022;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda023 = new LazySaveableStateHolderExternalSyntheticLambda0("INT32_LIST", 22, 22, iAuthTabCallback2, shouldpause4);
        INT32_LIST = lazySaveableStateHolderExternalSyntheticLambda023;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda024 = new LazySaveableStateHolderExternalSyntheticLambda0("FIXED64_LIST", 23, 23, iAuthTabCallback2, shouldpause3);
        FIXED64_LIST = lazySaveableStateHolderExternalSyntheticLambda024;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda025 = new LazySaveableStateHolderExternalSyntheticLambda0("FIXED32_LIST", 24, 24, iAuthTabCallback2, shouldpause4);
        FIXED32_LIST = lazySaveableStateHolderExternalSyntheticLambda025;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda026 = new LazySaveableStateHolderExternalSyntheticLambda0("BOOL_LIST", 25, 25, iAuthTabCallback2, shouldpause5);
        BOOL_LIST = lazySaveableStateHolderExternalSyntheticLambda026;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda027 = new LazySaveableStateHolderExternalSyntheticLambda0("STRING_LIST", 26, 26, iAuthTabCallback2, shouldpause6);
        STRING_LIST = lazySaveableStateHolderExternalSyntheticLambda027;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda028 = new LazySaveableStateHolderExternalSyntheticLambda0("MESSAGE_LIST", 27, 27, iAuthTabCallback2, shouldpause7);
        MESSAGE_LIST = lazySaveableStateHolderExternalSyntheticLambda028;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda029 = new LazySaveableStateHolderExternalSyntheticLambda0("BYTES_LIST", 28, 28, iAuthTabCallback2, shouldpause8);
        BYTES_LIST = lazySaveableStateHolderExternalSyntheticLambda029;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda030 = new LazySaveableStateHolderExternalSyntheticLambda0("UINT32_LIST", 29, 29, iAuthTabCallback2, shouldpause4);
        UINT32_LIST = lazySaveableStateHolderExternalSyntheticLambda030;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda031 = new LazySaveableStateHolderExternalSyntheticLambda0("ENUM_LIST", 30, 30, iAuthTabCallback2, shouldpause9);
        ENUM_LIST = lazySaveableStateHolderExternalSyntheticLambda031;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda032 = new LazySaveableStateHolderExternalSyntheticLambda0("SFIXED32_LIST", 31, 31, iAuthTabCallback2, shouldpause4);
        SFIXED32_LIST = lazySaveableStateHolderExternalSyntheticLambda032;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda033 = new LazySaveableStateHolderExternalSyntheticLambda0("SFIXED64_LIST", 32, 32, iAuthTabCallback2, shouldpause3);
        SFIXED64_LIST = lazySaveableStateHolderExternalSyntheticLambda033;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda034 = new LazySaveableStateHolderExternalSyntheticLambda0("SINT32_LIST", 33, 33, iAuthTabCallback2, shouldpause4);
        SINT32_LIST = lazySaveableStateHolderExternalSyntheticLambda034;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda035 = new LazySaveableStateHolderExternalSyntheticLambda0("SINT64_LIST", 34, 34, iAuthTabCallback2, shouldpause3);
        SINT64_LIST = lazySaveableStateHolderExternalSyntheticLambda035;
        IAuthTabCallback iAuthTabCallback3 = IAuthTabCallback.PACKED_VECTOR;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda036 = new LazySaveableStateHolderExternalSyntheticLambda0("DOUBLE_LIST_PACKED", 35, 35, iAuthTabCallback3, shouldpause);
        DOUBLE_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda036;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda037 = new LazySaveableStateHolderExternalSyntheticLambda0("FLOAT_LIST_PACKED", 36, 36, iAuthTabCallback3, shouldpause2);
        FLOAT_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda037;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda038 = new LazySaveableStateHolderExternalSyntheticLambda0("INT64_LIST_PACKED", 37, 37, iAuthTabCallback3, shouldpause3);
        INT64_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda038;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda039 = new LazySaveableStateHolderExternalSyntheticLambda0("UINT64_LIST_PACKED", 38, 38, iAuthTabCallback3, shouldpause3);
        UINT64_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda039;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda040 = new LazySaveableStateHolderExternalSyntheticLambda0("INT32_LIST_PACKED", 39, 39, iAuthTabCallback3, shouldpause4);
        INT32_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda040;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda041 = new LazySaveableStateHolderExternalSyntheticLambda0("FIXED64_LIST_PACKED", 40, 40, iAuthTabCallback3, shouldpause3);
        FIXED64_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda041;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda042 = new LazySaveableStateHolderExternalSyntheticLambda0("FIXED32_LIST_PACKED", 41, 41, iAuthTabCallback3, shouldpause4);
        FIXED32_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda042;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda043 = new LazySaveableStateHolderExternalSyntheticLambda0("BOOL_LIST_PACKED", 42, 42, iAuthTabCallback3, shouldpause5);
        BOOL_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda043;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda044 = new LazySaveableStateHolderExternalSyntheticLambda0("UINT32_LIST_PACKED", 43, 43, iAuthTabCallback3, shouldpause4);
        UINT32_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda044;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda045 = new LazySaveableStateHolderExternalSyntheticLambda0("ENUM_LIST_PACKED", 44, 44, iAuthTabCallback3, shouldpause9);
        ENUM_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda045;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda046 = new LazySaveableStateHolderExternalSyntheticLambda0("SFIXED32_LIST_PACKED", 45, 45, iAuthTabCallback3, shouldpause4);
        SFIXED32_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda046;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda047 = new LazySaveableStateHolderExternalSyntheticLambda0("SFIXED64_LIST_PACKED", 46, 46, iAuthTabCallback3, shouldpause3);
        SFIXED64_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda047;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda048 = new LazySaveableStateHolderExternalSyntheticLambda0("SINT32_LIST_PACKED", 47, 47, iAuthTabCallback3, shouldpause4);
        SINT32_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda048;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda049 = new LazySaveableStateHolderExternalSyntheticLambda0("SINT64_LIST_PACKED", 48, 48, iAuthTabCallback3, shouldpause3);
        SINT64_LIST_PACKED = lazySaveableStateHolderExternalSyntheticLambda049;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda050 = new LazySaveableStateHolderExternalSyntheticLambda0("GROUP_LIST", 49, 49, iAuthTabCallback2, shouldpause7);
        GROUP_LIST = lazySaveableStateHolderExternalSyntheticLambda050;
        LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda051 = new LazySaveableStateHolderExternalSyntheticLambda0("MAP", 50, 50, IAuthTabCallback.MAP, shouldPause.VOID);
        MAP = lazySaveableStateHolderExternalSyntheticLambda051;
        $VALUES = new LazySaveableStateHolderExternalSyntheticLambda0[]{lazySaveableStateHolderExternalSyntheticLambda0, lazySaveableStateHolderExternalSyntheticLambda02, lazySaveableStateHolderExternalSyntheticLambda03, lazySaveableStateHolderExternalSyntheticLambda04, lazySaveableStateHolderExternalSyntheticLambda05, lazySaveableStateHolderExternalSyntheticLambda06, lazySaveableStateHolderExternalSyntheticLambda07, lazySaveableStateHolderExternalSyntheticLambda08, lazySaveableStateHolderExternalSyntheticLambda09, lazySaveableStateHolderExternalSyntheticLambda010, lazySaveableStateHolderExternalSyntheticLambda011, lazySaveableStateHolderExternalSyntheticLambda012, lazySaveableStateHolderExternalSyntheticLambda013, lazySaveableStateHolderExternalSyntheticLambda014, lazySaveableStateHolderExternalSyntheticLambda015, lazySaveableStateHolderExternalSyntheticLambda016, lazySaveableStateHolderExternalSyntheticLambda017, lazySaveableStateHolderExternalSyntheticLambda018, lazySaveableStateHolderExternalSyntheticLambda019, lazySaveableStateHolderExternalSyntheticLambda020, lazySaveableStateHolderExternalSyntheticLambda021, lazySaveableStateHolderExternalSyntheticLambda022, lazySaveableStateHolderExternalSyntheticLambda023, lazySaveableStateHolderExternalSyntheticLambda024, lazySaveableStateHolderExternalSyntheticLambda025, lazySaveableStateHolderExternalSyntheticLambda026, lazySaveableStateHolderExternalSyntheticLambda027, lazySaveableStateHolderExternalSyntheticLambda028, lazySaveableStateHolderExternalSyntheticLambda029, lazySaveableStateHolderExternalSyntheticLambda030, lazySaveableStateHolderExternalSyntheticLambda031, lazySaveableStateHolderExternalSyntheticLambda032, lazySaveableStateHolderExternalSyntheticLambda033, lazySaveableStateHolderExternalSyntheticLambda034, lazySaveableStateHolderExternalSyntheticLambda035, lazySaveableStateHolderExternalSyntheticLambda036, lazySaveableStateHolderExternalSyntheticLambda037, lazySaveableStateHolderExternalSyntheticLambda038, lazySaveableStateHolderExternalSyntheticLambda039, lazySaveableStateHolderExternalSyntheticLambda040, lazySaveableStateHolderExternalSyntheticLambda041, lazySaveableStateHolderExternalSyntheticLambda042, lazySaveableStateHolderExternalSyntheticLambda043, lazySaveableStateHolderExternalSyntheticLambda044, lazySaveableStateHolderExternalSyntheticLambda045, lazySaveableStateHolderExternalSyntheticLambda046, lazySaveableStateHolderExternalSyntheticLambda047, lazySaveableStateHolderExternalSyntheticLambda048, lazySaveableStateHolderExternalSyntheticLambda049, lazySaveableStateHolderExternalSyntheticLambda050, lazySaveableStateHolderExternalSyntheticLambda051};
        EMPTY_TYPES = new Type[0];
        LazySaveableStateHolderExternalSyntheticLambda0[] lazySaveableStateHolderExternalSyntheticLambda0ArrValues = values();
        VALUES = new LazySaveableStateHolderExternalSyntheticLambda0[lazySaveableStateHolderExternalSyntheticLambda0ArrValues.length];
        for (LazySaveableStateHolderExternalSyntheticLambda0 lazySaveableStateHolderExternalSyntheticLambda052 : lazySaveableStateHolderExternalSyntheticLambda0ArrValues) {
            VALUES[lazySaveableStateHolderExternalSyntheticLambda052.id] = lazySaveableStateHolderExternalSyntheticLambda052;
        }
    }

    private LazySaveableStateHolderExternalSyntheticLambda0(String str, int i2, int i3, IAuthTabCallback iAuthTabCallback, shouldPause shouldpause) {
        int i4;
        this.id = i3;
        this.collection = iAuthTabCallback;
        this.javaType = shouldpause;
        int i5 = AnonymousClass4.onExtraCallback[iAuthTabCallback.ordinal()];
        if (i5 == 1 || i5 == 2) {
            this.elementType = shouldpause.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (iAuthTabCallback != IAuthTabCallback.SCALAR || (i4 = AnonymousClass4.IAuthTabCallback[shouldpause.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : true;
    }

    /* renamed from: o.LazySaveableStateHolderExternalSyntheticLambda0$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] IAuthTabCallback;
        static final /* synthetic */ int[] onExtraCallback;

        static {
            int[] iArr = new int[shouldPause.values().length];
            IAuthTabCallback = iArr;
            try {
                iArr[shouldPause.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IAuthTabCallback[shouldPause.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IAuthTabCallback[shouldPause.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[IAuthTabCallback.values().length];
            onExtraCallback = iArr2;
            try {
                iArr2[IAuthTabCallback.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallback[IAuthTabCallback.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onExtraCallback[IAuthTabCallback.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public int id() {
        return this.id;
    }

    public shouldPause getJavaType() {
        return this.javaType;
    }

    public boolean isPacked() {
        return IAuthTabCallback.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == IAuthTabCallback.SCALAR;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == IAuthTabCallback.MAP;
    }

    public boolean isValidForField(Field field) {
        if (IAuthTabCallback.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, actualTypeArguments);
        if (listParameter instanceof Class) {
            return this.elementType.isAssignableFrom((Class) listParameter);
        }
        return true;
    }

    public static LazySaveableStateHolderExternalSyntheticLambda0 forId(int i2) {
        if (i2 < 0) {
            return null;
        }
        LazySaveableStateHolderExternalSyntheticLambda0[] lazySaveableStateHolderExternalSyntheticLambda0Arr = VALUES;
        if (i2 < lazySaveableStateHolderExternalSyntheticLambda0Arr.length) {
            return lazySaveableStateHolderExternalSyntheticLambda0Arr[i2];
        }
        return null;
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i2 = 0;
            if (cls != List.class) {
                Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i3 = 0; i3 < actualTypeArguments.length; i3++) {
                        Type type = actualTypeArguments[i3];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length != typeParameters.length) {
                                throw new RuntimeException("Type array mismatch");
                            }
                            for (int i4 = 0; i4 < typeParameters.length; i4++) {
                                if (type == typeParameters[i4]) {
                                    actualTypeArguments[i3] = typeArr[i4];
                                }
                            }
                            throw new RuntimeException("Unable to find replacement for " + type);
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i2 < length) {
                            Class<?> cls2 = interfaces[i2];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i2++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else {
                if (typeArr.length != 1) {
                    throw new RuntimeException("Unable to identify parameter type for List<T>");
                }
                return typeArr[0];
            }
        }
    }

    enum IAuthTabCallback {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        IAuthTabCallback(boolean z) {
            this.isList = z;
        }

        public boolean isList() {
            return this.isList;
        }
    }
}
