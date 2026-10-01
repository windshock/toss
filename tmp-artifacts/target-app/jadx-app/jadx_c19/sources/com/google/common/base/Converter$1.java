package com.google.common.base;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [B] */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public class Converter$1<B> implements Iterable<B> {
    public static int IAuthTabCallback;
    public static int onNavigationEvent;
    final /* synthetic */ Converter this$0;
    final /* synthetic */ Iterable val$fromIterable;

    Converter$1(Converter converter, Iterable iterable) {
        this.val$fromIterable = iterable;
        this.this$0 = converter;
    }

    @Override // java.lang.Iterable
    public Iterator<B> iterator() {
        return new Iterator<B>() { // from class: com.google.common.base.Converter$1.1
            private final Iterator<? extends A> fromIterator;

            {
                this.fromIterator = Converter$1.this.val$fromIterable.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.fromIterator.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) Converter$1.this.this$0.convert(this.fromIterator.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.fromIterator.remove();
            }
        };
    }

    public static int onWarmupCompleted() {
        int i2 = IAuthTabCallback;
        int i3 = i2 % 5421094;
        IAuthTabCallback = i2 + 1;
        if (i3 != 0) {
            return onNavigationEvent;
        }
        int i4 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        onNavigationEvent = i4;
        return i4;
    }
}
