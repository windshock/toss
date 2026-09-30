package com.squareup.wire;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class PackedProtoAdapter<E> extends ProtoAdapter<List<? extends E>> {
    private final ProtoAdapter<E> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackedProtoAdapter(@NotNull ProtoAdapter<E> protoAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(List.class), (String) null, protoAdapter.getSyntax(), CollectionsKt.emptyList(), (String) null, 32, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(protoAdapter, "");
        this.originalAdapter = protoAdapter;
    }

    public void encodeWithTag(@NotNull ProtoWriter protoWriter, int i2, @Nullable List<? extends E> list) {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(protoWriter, i2, list);
    }

    public void encodeWithTag(@NotNull ReverseProtoWriter reverseProtoWriter, int i2, @Nullable List<? extends E> list) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(reverseProtoWriter, i2, list);
    }

    public int encodedSize(@NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "");
        int size = list.size();
        int iEncodedSize = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iEncodedSize += this.originalAdapter.encodedSize(list.get(i2));
        }
        return iEncodedSize;
    }

    public int encodedSizeWithTag(int i2, @Nullable List<? extends E> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.encodedSizeWithTag(i2, list);
    }

    public void encode(@NotNull ProtoWriter protoWriter, @NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(protoWriter, "");
        Intrinsics.checkNotNullParameter(list, "");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.originalAdapter.encode(protoWriter, list.get(i2));
        }
    }

    public void encode(@NotNull ReverseProtoWriter reverseProtoWriter, @NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(reverseProtoWriter, "");
        Intrinsics.checkNotNullParameter(list, "");
        for (int size = list.size() - 1; size >= 0; size--) {
            this.originalAdapter.encode(reverseProtoWriter, list.get(size));
        }
    }

    public List<E> decode(@NotNull ProtoReader protoReader) {
        Intrinsics.checkNotNullParameter(protoReader, "");
        return CollectionsKt.listOf(this.originalAdapter.decode(protoReader));
    }

    public List<E> decode(@NotNull ProtoReader32 protoReader32) {
        Intrinsics.checkNotNullParameter(protoReader32, "");
        return CollectionsKt.listOf(this.originalAdapter.decode(protoReader32));
    }

    public List<E> redact(@NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return CollectionsKt.emptyList();
    }
}
