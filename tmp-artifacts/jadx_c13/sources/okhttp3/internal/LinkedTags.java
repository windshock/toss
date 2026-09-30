package okhttp3.internal;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import o.clearRegisters;
import o.clearSelinuxLabel;
import o.ensureCausesIsMutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class LinkedTags<K> extends Tags {
    private final KClass<K> key;
    private final Tags next;
    private final K value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedTags(@NotNull KClass<K> kClass, @NotNull K k, @NotNull Tags tags) {
        super(null);
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(k, "");
        Intrinsics.checkNotNullParameter(tags, "");
        this.key = kClass;
        this.value = k;
        this.next = tags;
    }

    @Override // okhttp3.internal.Tags
    public <T> Tags plus(@NotNull KClass<T> kClass, @Nullable T t) {
        Tags linkedTags;
        Intrinsics.checkNotNullParameter(kClass, "");
        if (Intrinsics.areEqual(kClass, this.key)) {
            linkedTags = this.next;
        } else {
            Tags tagsPlus = this.next.plus(kClass, null);
            linkedTags = tagsPlus == this.next ? this : new LinkedTags(this.key, this.value, tagsPlus);
        }
        return t != null ? new LinkedTags(kClass, t, linkedTags) : linkedTags;
    }

    @Override // okhttp3.internal.Tags
    public <T> T get(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return Intrinsics.areEqual(kClass, this.key) ? (T) clearRegisters.onNavigationEvent(kClass).cast(this.value) : (T) this.next.get(kClass);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedTags toString$lambda$0(LinkedTags linkedTags) {
        Intrinsics.checkNotNullParameter(linkedTags, "");
        Tags tags = linkedTags.next;
        if (tags instanceof LinkedTags) {
            return (LinkedTags) tags;
        }
        return null;
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.reversed(ensureCausesIsMutable.onRelationshipValidationResult(clearSelinuxLabel.onExtraCallback(this, new Function1() { // from class: okhttp3.internal.LinkedTags$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkedTags.toString$lambda$0((LinkedTags) obj);
            }
        }))), null, "{", "}", 0, null, new Function1() { // from class: okhttp3.internal.LinkedTags$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkedTags.toString$lambda$1((LinkedTags) obj);
            }
        }, 25, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$1(LinkedTags linkedTags) {
        Intrinsics.checkNotNullParameter(linkedTags, "");
        StringBuilder sb = new StringBuilder();
        sb.append(linkedTags.key);
        sb.append('=');
        sb.append(linkedTags.value);
        return sb.toString();
    }
}
