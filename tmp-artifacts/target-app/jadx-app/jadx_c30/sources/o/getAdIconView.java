package o;

import io.opentelemetry.exporter.internal.marshal.MarshalerContext$;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import o.getAdIconView;
import org.apache.commons.lang3.Streams$ArrayCollector$$ExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getAdIconView {

    public static class onNavigationEvent<O> implements Collector<O, List<O>, O[]> {
        private static final Set<Collector.Characteristics> IAuthTabCallback = Collections.EMPTY_SET;
        private final Class<O> onNavigationEvent;

        @Override // java.util.stream.Collector
        public BiConsumer<List<O>, O> accumulator() {
            return new Streams$ArrayCollector$$ExternalSyntheticLambda2();
        }

        @Override // java.util.stream.Collector
        public Set<Collector.Characteristics> characteristics() {
            return IAuthTabCallback;
        }

        @Override // java.util.stream.Collector
        public BinaryOperator<List<O>> combiner() {
            return new BinaryOperator() { // from class: org.apache.commons.lang3.stream.Streams$ArrayCollector$$ExternalSyntheticLambda1
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return getAdIconView.onNavigationEvent.IAuthTabCallback((List) obj, (List) obj2);
                }
            };
        }

        public static /* synthetic */ List IAuthTabCallback(List list, List list2) {
            list.addAll(list2);
            return list;
        }

        @Override // java.util.stream.Collector
        public Function<List<O>, O[]> finisher() {
            return new Function() { // from class: org.apache.commons.lang3.stream.Streams$ArrayCollector$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    List list = (List) obj;
                    return list.toArray((Object[]) Array.newInstance((Class<?>) this.f$0.onNavigationEvent, list.size()));
                }
            };
        }

        @Override // java.util.stream.Collector
        public Supplier<List<O>> supplier() {
            return new MarshalerContext$.ExternalSyntheticLambda2();
        }
    }
}
