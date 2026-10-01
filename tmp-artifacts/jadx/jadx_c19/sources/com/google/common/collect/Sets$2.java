package com.google.common.collect;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: /tmp/toss_alldex/classes19.dex */
class Sets$2<E> extends Sets.SetView<E> {
    final /* synthetic */ Set val$set1;
    final /* synthetic */ Set val$set2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Sets$2(Set set, Set set2) {
        super((Sets$1) null);
        this.val$set1 = set;
        this.val$set2 = set2;
    }

    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public UnmodifiableIterator<E> m64iterator() {
        return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets$2.1
            final Iterator<E> itr;

            {
                this.itr = Sets$2.this.val$set1.iterator();
            }

            @CheckForNull
            protected E computeNext() {
                while (this.itr.hasNext()) {
                    E next = this.itr.next();
                    if (Sets$2.this.val$set2.contains(next)) {
                        return next;
                    }
                }
                return (E) endOfData();
            }
        };
    }

    public int size() {
        Iterator<E> it = this.val$set1.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.val$set2.contains(it.next())) {
                i2++;
            }
        }
        return i2;
    }

    public boolean isEmpty() {
        return Collections.disjoint(this.val$set2, this.val$set1);
    }

    public boolean contains(@CheckForNull Object obj) {
        return this.val$set1.contains(obj) && this.val$set2.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.val$set1.containsAll(collection) && this.val$set2.containsAll(collection);
    }
}
