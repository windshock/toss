package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.internal.ReflectionKt;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ProtoAdapter$Companion {
    public /* synthetic */ ProtoAdapter$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProtoAdapter$Companion() {
    }

    @JvmStatic
    public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return ReflectionKt.createRuntimeMessageAdapter$default(cls, (String) null, Syntax.PROTO_2, (ClassLoader) null, false, 24, (Object) null);
    }

    @JvmStatic
    public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls, @NotNull String str) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        return ReflectionKt.createRuntimeMessageAdapter$default(cls, str, Syntax.PROTO_2, (ClassLoader) null, false, 24, (Object) null);
    }

    @JvmStatic
    public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls, @NotNull String str, @NotNull Syntax syntax) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(syntax, "");
        return ReflectionKt.createRuntimeMessageAdapter$default(cls, str, syntax, (ClassLoader) null, false, 24, (Object) null);
    }

    @JvmStatic
    public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(@NotNull Class<M> cls, @NotNull String str, @NotNull Syntax syntax, @Nullable ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(syntax, "");
        return ReflectionKt.createRuntimeMessageAdapter$default(cls, str, syntax, classLoader, false, 16, (Object) null);
    }

    @JvmStatic
    public final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(@NotNull Class<E> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return new RuntimeEnumAdapter(cls);
    }

    @JvmStatic
    public final <M extends Message<?, ?>> ProtoAdapter<M> get(@NotNull M m) {
        Intrinsics.checkNotNullParameter(m, "");
        return get(m.getClass());
    }

    @JvmStatic
    public final <M> ProtoAdapter<M> get(@NotNull Class<M> cls) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(cls, "");
        try {
            Object obj = cls.getField("ADAPTER").get(null);
            Intrinsics.checkNotNull(obj, "");
            return (ProtoAdapter) obj;
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("failed to access " + cls.getName() + "#ADAPTER", e);
        } catch (NoSuchFieldException e2) {
            throw new IllegalArgumentException("failed to access " + cls.getName() + "#ADAPTER", e2);
        }
    }

    @JvmStatic
    public final ProtoAdapter<?> get(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return get(str, ProtoAdapter.class.getClassLoader());
    }

    @JvmStatic
    public final ProtoAdapter<?> get(@NotNull String str, @Nullable ClassLoader classLoader) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            int iIndexOf$default = StringsKt.indexOf$default(str, '#', 0, false, 6, (Object) null);
            String strSubstring = str.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String strSubstring2 = str.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            Object obj = Class.forName(strSubstring, true, classLoader).getField(strSubstring2).get(null);
            Intrinsics.checkNotNull(obj, "");
            return (ProtoAdapter) obj;
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("failed to access " + str, e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException("failed to access " + str, e2);
        } catch (NoSuchFieldException e3) {
            throw new IllegalArgumentException("failed to access " + str, e3);
        }
    }

    public static final class UnsupportedTypeProtoAdapter extends ProtoAdapter {
        public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
            return ((Number) encodedSize((Void) obj)).intValue();
        }

        public UnsupportedTypeProtoAdapter() {
            super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Void.class));
        }

        public Void redact(@NotNull Void r2) {
            Intrinsics.checkNotNullParameter(r2, "");
            throw new IllegalStateException("Operation not supported.");
        }

        public Void encodedSize(@NotNull Void r2) {
            Intrinsics.checkNotNullParameter(r2, "");
            throw new IllegalStateException("Operation not supported.");
        }

        public Void encode(@NotNull ProtoWriter protoWriter, @NotNull Void r3) {
            Intrinsics.checkNotNullParameter(protoWriter, "");
            Intrinsics.checkNotNullParameter(r3, "");
            throw new IllegalStateException("Operation not supported.");
        }

        public Void encode(@NotNull ReverseProtoWriter reverseProtoWriter, @NotNull Void r3) {
            Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
            Intrinsics.checkNotNullParameter(r3, "");
            throw new IllegalStateException("Operation not supported.");
        }

        public Void decode(@NotNull ProtoReader protoReader) {
            Intrinsics.checkNotNullParameter(protoReader, "");
            throw new IllegalStateException("Operation not supported.");
        }

        public Void decode(@NotNull ProtoReader32 protoReader32) {
            Intrinsics.checkNotNullParameter(protoReader32, "");
            throw new IllegalStateException("Operation not supported.");
        }
    }

    @JvmStatic
    public final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(@NotNull ProtoAdapter<K> protoAdapter, @NotNull ProtoAdapter<V> protoAdapter2) {
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        Intrinsics.checkNotNullParameter(protoAdapter2, "");
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }
}
