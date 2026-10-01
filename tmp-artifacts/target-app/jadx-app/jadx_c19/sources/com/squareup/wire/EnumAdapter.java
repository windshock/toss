package com.squareup.wire;

import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import o.clearRegisters;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    protected abstract E fromValue(int i2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected EnumAdapter(@NotNull KClass<E> kClass, @NotNull Syntax syntax, @Nullable E e) {
        super(FieldEncoding.VARINT, kClass, (String) null, syntax, e);
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(syntax, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull Class<E> cls, @NotNull Syntax syntax, @Nullable E e) {
        this(clearRegisters.IAuthTabCallback(cls), syntax, e);
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(syntax, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull Class<E> cls) {
        this((KClass<WireEnum>) clearRegisters.IAuthTabCallback(cls), Syntax.PROTO_2, Internal.getIdentityOrNull(cls));
        Intrinsics.checkNotNullParameter(cls, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull Class<E> cls, @NotNull Syntax syntax) {
        this((KClass<WireEnum>) clearRegisters.IAuthTabCallback(cls), syntax, Internal.getIdentityOrNull(cls));
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(syntax, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull KClass<E> kClass) {
        this(kClass, Syntax.PROTO_2, Internal.getIdentityOrNull(clearRegisters.onNavigationEvent(kClass)));
        Intrinsics.checkNotNullParameter(kClass, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(@NotNull KClass<E> kClass, @NotNull Syntax syntax) {
        this(kClass, syntax, Internal.getIdentityOrNull(clearRegisters.onNavigationEvent(kClass)));
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(syntax, "");
    }

    public int encodedSize(@NotNull E e) {
        Intrinsics.checkNotNullParameter(e, "");
        return ProtoWriter.Companion.varint32Size$wire_runtime(e.getValue());
    }

    public void encode(@NotNull ProtoWriter protoWriter, @NotNull E e) throws IOException {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        Intrinsics.checkNotNullParameter(e, "");
        protoWriter.writeVarint32(e.getValue());
    }

    public void encode(@NotNull ReverseProtoWriter reverseProtoWriter, @NotNull E e) throws IOException {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        Intrinsics.checkNotNullParameter(e, "");
        reverseProtoWriter.writeVarint32(e.getValue());
    }

    /* renamed from: decode, reason: merged with bridge method [inline-methods] */
    public E m78decode(@NotNull ProtoReader protoReader) throws IOException {
        Intrinsics.checkNotNullParameter(protoReader, "");
        int varint32 = protoReader.readVarint32();
        E e = (E) fromValue(varint32);
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter$EnumConstantNotFoundException(varint32, (KClass<?>) getType());
    }

    /* renamed from: decode, reason: merged with bridge method [inline-methods] */
    public E m77decode(@NotNull ProtoReader32 protoReader32) throws IOException {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        int varint32 = protoReader32.readVarint32();
        E e = (E) fromValue(varint32);
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter$EnumConstantNotFoundException(varint32, (KClass<?>) getType());
    }

    public E redact(@NotNull E e) {
        Intrinsics.checkNotNullParameter(e, "");
        throw new UnsupportedOperationException();
    }
}
