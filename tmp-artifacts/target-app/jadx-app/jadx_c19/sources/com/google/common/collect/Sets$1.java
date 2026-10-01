package com.google.common.collect;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: /tmp/toss_alldex/classes19.dex */
class Sets$1<E> extends Sets.SetView<E> {
    final /* synthetic */ Set val$set1;
    final /* synthetic */ Set val$set2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Sets$1(Set set, Set set2) {
        super((Sets$1) null);
        this.val$set1 = set;
        this.val$set2 = set2;
    }

    public int size() {
        int size = this.val$set1.size();
        Iterator<E> it = this.val$set2.iterator();
        while (it.hasNext()) {
            if (!this.val$set1.contains(it.next())) {
                size++;
            }
        }
        return size;
    }

    public boolean isEmpty() {
        return this.val$set1.isEmpty() && this.val$set2.isEmpty();
    }

    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public UnmodifiableIterator<E> m63iterator() {
        return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets$1.1
            final Iterator<? extends E> itr1;
            final Iterator<? extends E> itr2;

            {
                this.itr1 = Sets$1.this.val$set1.iterator();
                this.itr2 = Sets$1.this.val$set2.iterator();
            }

            @CheckForNull
            protected E computeNext() {
                if (this.itr1.hasNext()) {
                    return this.itr1.next();
                }
                while (this.itr2.hasNext()) {
                    E next = this.itr2.next();
                    if (!Sets$1.this.val$set1.contains(next)) {
                        return next;
                    }
                }
                return (E) endOfData();
            }
        };
    }

    public boolean contains(@CheckForNull Object obj) {
        return this.val$set1.contains(obj) || this.val$set2.contains(obj);
    }

    public <S extends Set<E>> S copyInto(S s) {
        s.addAll(this.val$set1);
        s.addAll(this.val$set2);
        return s;
    }

    public ImmutableSet<E> immutableCopy() {
        return new ImmutableSet.Builder().addAll(this.val$set1).addAll(this.val$set2).build();
    }
}
