package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt$minus$1$;
import kotlin.sequences.SequencesKt___SequencesKt$minus$2$;
import kotlin.sequences.SequencesKt___SequencesKt$minus$3$;
import kotlin.sequences.SequencesKt___SequencesKt$minus$4$;
import kotlin.text.StringsKt__AppendableKt;
import o.ensureCausesIsMutable;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class ensureCausesIsMutable extends clearProcessUptime {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBinder(Object obj) {
        return obj == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onNavigationEvent(Object obj) {
        return obj;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onWarmupCompleted<T> implements Iterable<T>, KMappedMarker {
        final /* synthetic */ Sequence onExtraCallbackWithResult;

        public onWarmupCompleted(Sequence sequence) {
            this.onExtraCallbackWithResult = sequence;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.onExtraCallbackWithResult.IAuthTabCallback();
        }
    }

    public static <T> boolean onExtraCallbackWithResult(@NotNull Sequence<? extends T> sequence, T t) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return onExtraCallback((Sequence) sequence, (Object) t) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onExtraCallback(int i, int i2) {
        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i + '.');
    }

    public static <T> T onNavigationEvent(@NotNull Sequence<? extends T> sequence, final int i) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return (T) IAuthTabCallback(sequence, i, new Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ensureCausesIsMutable.onExtraCallback(i, ((Integer) obj).intValue());
            }
        });
    }

    public static final <T> T IAuthTabCallback(@NotNull Sequence<? extends T> sequence, int i, @NotNull Function1<? super Integer, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (i < 0) {
            return function1.invoke(Integer.valueOf(i));
        }
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        int i2 = 0;
        while (itIAuthTabCallback.hasNext()) {
            T next = itIAuthTabCallback.next();
            if (i == i2) {
                return next;
            }
            i2++;
        }
        return function1.invoke(Integer.valueOf(i));
    }

    public static <T> T onMinimized(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        if (!itIAuthTabCallback.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        return itIAuthTabCallback.next();
    }

    public static <T> T onMessageChannelReady(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        if (itIAuthTabCallback.hasNext()) {
            return itIAuthTabCallback.next();
        }
        return null;
    }

    public static <T> int onExtraCallback(@NotNull Sequence<? extends T> sequence, T t) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        int i = 0;
        while (itIAuthTabCallback.hasNext()) {
            T next = itIAuthTabCallback.next();
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t, next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> T onActivityLayout(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        if (!itIAuthTabCallback.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = itIAuthTabCallback.next();
        while (itIAuthTabCallback.hasNext()) {
            next = itIAuthTabCallback.next();
        }
        return next;
    }

    public static <T> T onPostMessage(@NotNull Sequence<? extends T> sequence) {
        T next;
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        if (!itIAuthTabCallback.hasNext()) {
            return null;
        }
        do {
            next = itIAuthTabCallback.next();
        } while (itIAuthTabCallback.hasNext());
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Sequence<T> onExtraCallbackWithResult(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "");
        if (i >= 0) {
            return i == 0 ? sequence : sequence instanceof addMemoryMappings ? ((addMemoryMappings) sequence).onNavigationEvent(i) : new addOpenFds(sequence, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> Sequence<T> IAuthTabCallbackStubProxy(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new clearAbortMessage(sequence, function1);
    }

    public static <T> Sequence<T> access100(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new clearOpenFds(sequence, true, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IAuthTabCallback(IndexedValue indexedValue) {
        Intrinsics.checkNotNullParameter(indexedValue, "");
        return indexedValue.onExtraCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallback(Function2 function2, IndexedValue indexedValue) {
        Intrinsics.checkNotNullParameter(indexedValue, "");
        return ((Boolean) function2.invoke(Integer.valueOf(indexedValue.onNavigationEvent()), indexedValue.onExtraCallback())).booleanValue();
    }

    public static <T> Sequence<T> IAuthTabCallback_Parcel(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new clearOpenFds(sequence, false, function1);
    }

    public static <T> Sequence<T> onActivityResized(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Sequence<T> sequenceIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(sequence, new Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ensureCausesIsMutable.asBinder(obj));
            }
        });
        Intrinsics.checkNotNull(sequenceIAuthTabCallback_Parcel, "");
        return sequenceIAuthTabCallback_Parcel;
    }

    public static <T> Sequence<T> IAuthTabCallbackDefault(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "");
        if (i >= 0) {
            if (i == 0) {
                return clearSelinuxLabel.onExtraCallback();
            }
            return sequence instanceof addMemoryMappings ? ((addMemoryMappings) sequence).onWarmupCompleted(i) : new ensureOpenFdsIsMutable(sequence, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> Sequence<T> readTypedObject(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new ensureLogBuffersIsMutable(sequence, function1);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallbackStub<T> implements Sequence<T> {
        final /* synthetic */ Sequence<T> IAuthTabCallback;
        final /* synthetic */ Comparator<? super T> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackStub(Sequence<? extends T> sequence, Comparator<? super T> comparator) {
            this.IAuthTabCallback = sequence;
            this.onWarmupCompleted = comparator;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> IAuthTabCallback() {
            List listICustomTabsCallbackDefault = ensureCausesIsMutable.ICustomTabsCallbackDefault(this.IAuthTabCallback);
            CollectionsKt__MutableCollectionsJVMKt.sortWith(listICustomTabsCallbackDefault, this.onWarmupCompleted);
            return listICustomTabsCallbackDefault.iterator();
        }
    }

    public static <T> Sequence<T> onWarmupCompleted(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return new IAuthTabCallbackStub(sequence, comparator);
    }

    public static final <T, C extends Collection<? super T>> C onExtraCallback(@NotNull Sequence<? extends T> sequence, @NotNull C c) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(c, "");
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            c.add(itIAuthTabCallback.next());
        }
        return c;
    }

    public static <T> List<T> onRelationshipValidationResult(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        if (!itIAuthTabCallback.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        T next = itIAuthTabCallback.next();
        if (!itIAuthTabCallback.hasNext()) {
            return CollectionsKt__CollectionsJVMKt.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (itIAuthTabCallback.hasNext()) {
            arrayList.add(itIAuthTabCallback.next());
        }
        return arrayList;
    }

    public static <T> List<T> ICustomTabsCallbackDefault(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return (List) onExtraCallback((Sequence) sequence, new ArrayList());
    }

    public static <T> Set<T> onUnminimized(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        if (!itIAuthTabCallback.hasNext()) {
            return clearNumber.onNavigationEvent();
        }
        T next = itIAuthTabCallback.next();
        if (!itIAuthTabCallback.hasNext()) {
            return clearFaultAddress.onNavigationEvent(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (itIAuthTabCallback.hasNext()) {
            linkedHashSet.add(itIAuthTabCallback.next());
        }
        return linkedHashSet;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    static final /* synthetic */ class onNavigationEvent<R> extends FunctionReferenceImpl implements Function1<Iterable<? extends R>, Iterator<? extends R>> {
        public static final onNavigationEvent onNavigationEvent = new onNavigationEvent();

        onNavigationEvent() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(Iterable<? extends R> iterable) {
            Intrinsics.checkNotNullParameter(iterable, "");
            return iterable.iterator();
        }
    }

    public static <T, R> Sequence<R> access000(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Iterable<? extends R>> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new clearCauses(sequence, function1, onNavigationEvent.onNavigationEvent);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    static final /* synthetic */ class onExtraCallback<R> extends FunctionReferenceImpl implements Function1<Sequence<? extends R>, Iterator<? extends R>> {
        public static final onExtraCallback onWarmupCompleted = new onExtraCallback();

        onExtraCallback() {
            super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(Sequence<? extends R> sequence) {
            Intrinsics.checkNotNullParameter(sequence, "");
            return sequence.IAuthTabCallback();
        }
    }

    public static <T, R> Sequence<R> getInterfaceDescriptor(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new clearCauses(sequence, function1, onExtraCallback.onWarmupCompleted);
    }

    public static <T, R> Sequence<R> extraCallback(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new internalGetThreads(sequence, function1);
    }

    public static <T, R> Sequence<R> onNavigationEvent(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return new ensureMemoryMappingsIsMutable(sequence, function2);
    }

    public static <T, R> Sequence<R> extraCallbackWithResult(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return onActivityResized(new internalGetThreads(sequence, function1));
    }

    public static <T> Sequence<T> extraCallback(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return IAuthTabCallbackStub(sequence, new Function1() { // from class: kotlin.sequences.SequencesKt___SequencesKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ensureCausesIsMutable.onNavigationEvent(obj);
            }
        });
    }

    public static <T, K> Sequence<T> IAuthTabCallbackStub(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new clearArch(sequence, function1);
    }

    public static <T> boolean writeTypedObject(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return sequence.IAuthTabCallback().hasNext();
    }

    public static <T> int extraCallbackWithResult(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        int i = 0;
        while (itIAuthTabCallback.hasNext()) {
            itIAuthTabCallback.next();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T IAuthTabCallback(@NotNull Sequence<? extends T> sequence, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        if (!itIAuthTabCallback.hasNext()) {
            return null;
        }
        Object obj = (T) itIAuthTabCallback.next();
        while (itIAuthTabCallback.hasNext()) {
            Object obj2 = (T) itIAuthTabCallback.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onWarmupCompleted(Function1 function1, Object obj) {
        function1.invoke(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onWarmupCompleted(Function2 function2, int i, Object obj) {
        function2.invoke(Integer.valueOf(i), obj);
        return obj;
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    static final class IAuthTabCallbackDefault<R> extends RestrictedSuspendLambda implements Function2<clearCommandLine<? super R>, access13800<? super Unit>, Object> {
        final /* synthetic */ R $initial;
        final /* synthetic */ Function2<R, T, R> $operation;
        final /* synthetic */ Sequence<T> $this_runningFold;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallbackDefault(R r, Sequence<? extends T> sequence, Function2<? super R, ? super T, ? extends R> function2, access13800<? super IAuthTabCallbackDefault> access13800Var) {
            super(2, access13800Var);
            this.$initial = r;
            this.$this_runningFold = sequence;
            this.$operation = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallbackDefault iAuthTabCallbackDefault = new IAuthTabCallbackDefault(this.$initial, this.$this_runningFold, this.$operation, access13800Var);
            iAuthTabCallbackDefault.L$0 = obj;
            return iAuthTabCallbackDefault;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(clearCommandLine<? super R> clearcommandline, access13800<? super Unit> access13800Var) {
            return ((IAuthTabCallbackDefault) create(clearcommandline, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        
            if (r0.onNavigationEvent(r7, r6) != r1) goto L12;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            Iterator itIAuthTabCallback;
            clearCommandLine clearcommandline = (clearCommandLine) this.L$0;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                R r = this.$initial;
                this.L$0 = clearcommandline;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    itIAuthTabCallback = (Iterator) this.L$2;
                    objInvoke = this.L$1;
                    ResultKt.onNavigationEvent(obj);
                    while (itIAuthTabCallback.hasNext()) {
                        Object next = itIAuthTabCallback.next();
                        objInvoke = this.$operation.invoke(objInvoke, next);
                        this.L$0 = clearcommandline;
                        this.L$1 = objInvoke;
                        this.L$2 = itIAuthTabCallback;
                        this.L$3 = access15400.onNavigationEvent(next);
                        this.label = 2;
                        if (clearcommandline.onNavigationEvent(objInvoke, this) == objOnExtraCallback) {
                            return objOnExtraCallback;
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.onNavigationEvent(obj);
            }
            objInvoke = this.$initial;
            itIAuthTabCallback = this.$this_runningFold.IAuthTabCallback();
            while (itIAuthTabCallback.hasNext()) {
            }
            return Unit.INSTANCE;
        }
    }

    public static <T, R> Sequence<R> onExtraCallback(@NotNull Sequence<? extends T> sequence, R r, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return clearSignalInfo.onNavigationEvent(new IAuthTabCallbackDefault(r, sequence, function2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IAuthTabCallback(Sequence sequence, Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("null element found in " + sequence + '.');
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onExtraCallbackWithResult<T> implements Sequence<T> {
        final /* synthetic */ Sequence<T> IAuthTabCallback;
        final /* synthetic */ T onWarmupCompleted;

        @Override // kotlin.sequences.Sequence
        public Iterator<T> IAuthTabCallback() {
            return ensureCausesIsMutable.access100(this.IAuthTabCallback, new SequencesKt___SequencesKt$minus$1$.ExternalSyntheticLambda0(new Ref.BooleanRef(), this.onWarmupCompleted)).IAuthTabCallback();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onWarmupCompleted(Ref.BooleanRef booleanRef, Object obj, Object obj2) {
            if (booleanRef.element || !Intrinsics.areEqual(obj2, obj)) {
                return true;
            }
            booleanRef.element = true;
            return false;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallback<T> implements Sequence<T> {
        final /* synthetic */ Sequence<T> IAuthTabCallback;
        final /* synthetic */ T[] onNavigationEvent;

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onWarmupCompleted(Object[] objArr, Object obj) {
            return ArraysKt___ArraysKt.contains(objArr, obj);
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> IAuthTabCallback() {
            return ensureCausesIsMutable.IAuthTabCallback_Parcel(this.IAuthTabCallback, new SequencesKt___SequencesKt$minus$2$.ExternalSyntheticLambda0(this.onNavigationEvent)).IAuthTabCallback();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class onTransact<T> implements Sequence<T> {
        final /* synthetic */ Sequence<T> IAuthTabCallback;
        final /* synthetic */ Iterable<T> onExtraCallback;

        @Override // kotlin.sequences.Sequence
        public Iterator<T> IAuthTabCallback() {
            Collection collectionConvertToListIfNotCollection = CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(this.onExtraCallback);
            if (collectionConvertToListIfNotCollection.isEmpty()) {
                return this.IAuthTabCallback.IAuthTabCallback();
            }
            return ensureCausesIsMutable.IAuthTabCallback_Parcel(this.IAuthTabCallback, new SequencesKt___SequencesKt$minus$3$.ExternalSyntheticLambda0(collectionConvertToListIfNotCollection)).IAuthTabCallback();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onWarmupCompleted(Collection collection, Object obj) {
            return collection.contains(obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class asBinder<T> implements Sequence<T> {
        final /* synthetic */ Sequence<T> IAuthTabCallback;
        final /* synthetic */ Sequence<T> onExtraCallbackWithResult;

        @Override // kotlin.sequences.Sequence
        public Iterator<T> IAuthTabCallback() {
            List listOnRelationshipValidationResult = ensureCausesIsMutable.onRelationshipValidationResult(this.onExtraCallbackWithResult);
            if (listOnRelationshipValidationResult.isEmpty()) {
                return this.IAuthTabCallback.IAuthTabCallback();
            }
            return ensureCausesIsMutable.IAuthTabCallback_Parcel(this.IAuthTabCallback, new SequencesKt___SequencesKt$minus$4$.ExternalSyntheticLambda0(listOnRelationshipValidationResult)).IAuthTabCallback();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onExtraCallbackWithResult(List list, Object obj) {
            return list.contains(obj);
        }
    }

    public static <T> Sequence<T> onWarmupCompleted(@NotNull Sequence<? extends T> sequence, @NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        return clearSelinuxLabel.ICustomTabsCallback(clearSelinuxLabel.onExtraCallback((Object[]) new Sequence[]{sequence, CollectionsKt___CollectionsKt.asSequence(iterable)}));
    }

    public static <T> Sequence<T> onExtraCallback(@NotNull Sequence<? extends T> sequence, @NotNull Sequence<? extends T> sequence2) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(sequence2, "");
        return clearSelinuxLabel.ICustomTabsCallback(clearSelinuxLabel.onExtraCallback((Object[]) new Sequence[]{sequence, sequence2}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair onNavigationEvent(Object obj, Object obj2) {
        return getWrite.IAuthTabCallback(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair onExtraCallback(Object obj, Object obj2) {
        return getWrite.IAuthTabCallback(obj, obj2);
    }

    public static final <T, A extends Appendable> A onExtraCallback(@NotNull Sequence<? extends T> sequence, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(a, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a.append(charSequence2);
        Iterator<? extends T> itIAuthTabCallback = sequence.IAuthTabCallback();
        int i2 = 0;
        while (itIAuthTabCallback.hasNext()) {
            T next = itIAuthTabCallback.next();
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            StringsKt__AppendableKt.appendElement(a, next, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Sequence sequence, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        int i3 = i2 & 2;
        CharSequence charSequence5 = _UrlKt.FRAGMENT_ENCODE_SET;
        CharSequence charSequence6 = i3 != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i4 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return IAuthTabCallback(sequence, charSequence, charSequence6, charSequence5, i4, charSequence7, function1);
    }

    public static final <T> String IAuthTabCallback(@NotNull Sequence<? extends T> sequence, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((StringBuilder) onExtraCallback(sequence, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static <T> Iterable<T> readTypedObject(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return new onWarmupCompleted(sequence);
    }
}
