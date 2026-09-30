package o;

import j$.time.Duration;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import o.moveToFirst;
import o.onChildViewAdded;
import org.xbill.DNS.ExtendedResolver$Resolution$;
import org.xbill.DNS.Resolver;
import org.xbill.DNS.ResolverConfig;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class moveToFirst implements Resolver {
    private final List<IAuthTabCallback> asBinder;
    private int asInterface;
    private boolean onExtraCallback;
    private final AtomicInteger onExtraCallbackWithResult;
    private Duration onTransact;
    private static final AppSetIdAndScope1 onNavigationEvent = ea10.onWarmupCompleted((Class<?>) moveToFirst.class);
    public static final Duration onWarmupCompleted = Duration.ofSeconds(10);
    public static final Duration IAuthTabCallback = Duration.ofSeconds(5);

    public static class onExtraCallbackWithResult {
        private final int[] IAuthTabCallback;
        private final int IAuthTabCallbackStub;
        private final onChildViewAdded onExtraCallback;
        private int onExtraCallbackWithResult;
        private final long onNavigationEvent;
        private List<IAuthTabCallback> onWarmupCompleted;

        onExtraCallbackWithResult(moveToFirst movetofirst, onChildViewAdded onchildviewadded) {
            this.onWarmupCompleted = new ArrayList(movetofirst.asBinder);
            this.onNavigationEvent = System.nanoTime() + movetofirst.onTransact.toNanos();
            if (movetofirst.onExtraCallback) {
                int iUpdateAndGet = movetofirst.onExtraCallbackWithResult.updateAndGet(new IntUnaryOperator() { // from class: org.xbill.DNS.ExtendedResolver$Resolution$$ExternalSyntheticLambda0
                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i) {
                        return moveToFirst.onExtraCallbackWithResult.onExtraCallbackWithResult(this.f$0, i);
                    }
                });
                if (iUpdateAndGet > 0) {
                    ArrayList arrayList = new ArrayList(this.onWarmupCompleted.size());
                    for (int i = 0; i < this.onWarmupCompleted.size(); i++) {
                        arrayList.add(this.onWarmupCompleted.get((i + iUpdateAndGet) % this.onWarmupCompleted.size()));
                    }
                    this.onWarmupCompleted = arrayList;
                }
            } else {
                this.onWarmupCompleted = (List) this.onWarmupCompleted.stream().sorted(Comparator.comparingInt(new ToIntFunction() { // from class: org.xbill.DNS.ExtendedResolver$Resolution$$ExternalSyntheticLambda1
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        return ((moveToFirst.IAuthTabCallback) obj).onExtraCallbackWithResult.get();
                    }
                })).collect(Collectors.toList());
            }
            this.IAuthTabCallback = new int[this.onWarmupCompleted.size()];
            this.IAuthTabCallbackStub = movetofirst.asInterface;
            this.onExtraCallback = onchildviewadded;
        }

        public static /* synthetic */ int onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, int i) {
            return (i + 1) % onextracallbackwithresult.onWarmupCompleted.size();
        }

        private CompletionStage<onChildViewAdded> onWarmupCompleted(Executor executor) {
            IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted.get(this.onExtraCallbackWithResult);
            AppSetIdAndScope1 unused = moveToFirst.onNavigationEvent;
            yzp2 yzp2VarAccess000 = this.onExtraCallback.onNavigationEvent().access000();
            String strOnNavigationEvent = lt54.onNavigationEvent(this.onExtraCallback.onNavigationEvent().extraCallback());
            int iOnNavigationEvent = this.onExtraCallback.IAuthTabCallback().onNavigationEvent();
            int i = this.onExtraCallbackWithResult;
            new Object[]{yzp2VarAccess000, strOnNavigationEvent, Integer.valueOf(iOnNavigationEvent), Integer.valueOf(i), iAuthTabCallback.IAuthTabCallback, Integer.valueOf(this.IAuthTabCallback[this.onExtraCallbackWithResult] + 1), Integer.valueOf(this.IAuthTabCallbackStub)};
            int[] iArr = this.IAuthTabCallback;
            int i2 = this.onExtraCallbackWithResult;
            iArr[i2] = iArr[i2] + 1;
            return iAuthTabCallback.IAuthTabCallback.onExtraCallback(this.onExtraCallback, executor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CompletionStage<onChildViewAdded> onNavigationEvent(final Executor executor) {
            return onWarmupCompleted(executor).handle(new BiFunction() { // from class: org.xbill.DNS.ExtendedResolver$Resolution$$ExternalSyntheticLambda2
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return this.f$0.onExtraCallback((onChildViewAdded) obj, (Throwable) obj2, executor);
                }
            }).thenCompose(Function.identity());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CompletionStage<onChildViewAdded> onExtraCallback(onChildViewAdded onchildviewadded, Throwable th, Executor executor) {
            AtomicInteger atomicInteger = this.onWarmupCompleted.get(this.onExtraCallbackWithResult).onExtraCallbackWithResult;
            if (th != null) {
                AppSetIdAndScope1 unused = moveToFirst.onNavigationEvent;
                yzp2 yzp2VarAccess000 = this.onExtraCallback.onNavigationEvent().access000();
                String strOnNavigationEvent = lt54.onNavigationEvent(this.onExtraCallback.onNavigationEvent().extraCallback());
                int iOnNavigationEvent = this.onExtraCallback.IAuthTabCallback().onNavigationEvent();
                int i = this.onExtraCallbackWithResult;
                new Object[]{yzp2VarAccess000, strOnNavigationEvent, Integer.valueOf(iOnNavigationEvent), Integer.valueOf(i), this.onWarmupCompleted.get(i).IAuthTabCallback, Integer.valueOf(this.IAuthTabCallback[this.onExtraCallbackWithResult]), Integer.valueOf(this.IAuthTabCallbackStub), th.getMessage()};
                atomicInteger.incrementAndGet();
                if (this.onNavigationEvent - System.nanoTime() < 0) {
                    CompletableFuture completableFuture = new CompletableFuture();
                    completableFuture.completeExceptionally(new IOException("Timed out while trying to resolve " + this.onExtraCallback.onNavigationEvent().access000() + "/" + lt54.onNavigationEvent(this.onExtraCallback.onNavigationEvent().type) + ", id=" + this.onExtraCallback.IAuthTabCallback().onNavigationEvent()));
                    return completableFuture;
                }
                int size = (this.onExtraCallbackWithResult + 1) % this.onWarmupCompleted.size();
                this.onExtraCallbackWithResult = size;
                if (this.IAuthTabCallback[size] < this.IAuthTabCallbackStub) {
                    return onWarmupCompleted(executor).handle(new ExtendedResolver$Resolution$.ExternalSyntheticLambda3(this, executor)).thenCompose(Function.identity());
                }
                CompletableFuture completableFuture2 = new CompletableFuture();
                completableFuture2.completeExceptionally(th);
                return completableFuture2;
            }
            atomicInteger.updateAndGet(new ExtendedResolver$Resolution$.ExternalSyntheticLambda4());
            return CompletableFuture.completedFuture(onchildviewadded);
        }

        public static /* synthetic */ int onExtraCallback(int i) {
            if (i > 0) {
                return (int) Math.log(i);
            }
            return 0;
        }
    }

    public static class IAuthTabCallback {
        private final Resolver IAuthTabCallback;
        private final AtomicInteger onExtraCallbackWithResult;

        public IAuthTabCallback(Resolver resolver, AtomicInteger atomicInteger) {
            this.IAuthTabCallback = resolver;
            this.onExtraCallbackWithResult = atomicInteger;
        }

        IAuthTabCallback(Resolver resolver) {
            this(resolver, new AtomicInteger(0));
        }

        public String toString() {
            return this.IAuthTabCallback.toString();
        }
    }

    public moveToFirst() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.asBinder = copyOnWriteArrayList;
        this.onExtraCallbackWithResult = new AtomicInteger();
        this.asInterface = 3;
        this.onTransact = onWarmupCompleted;
        copyOnWriteArrayList.addAll((Collection) ResolverConfig.onNavigationEvent().IAuthTabCallbackStub().stream().map(new Function() { // from class: org.xbill.DNS.ExtendedResolver$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return moveToFirst.onWarmupCompleted((InetSocketAddress) obj);
            }
        }).collect(Collectors.toList()));
    }

    public static /* synthetic */ IAuthTabCallback onWarmupCompleted(InetSocketAddress inetSocketAddress) {
        lt37 lt37Var = new lt37(inetSocketAddress);
        lt37Var.IAuthTabCallback(IAuthTabCallback);
        return new IAuthTabCallback(lt37Var);
    }

    public moveToFirst(String[] strArr) throws UnknownHostException {
        this.asBinder = new CopyOnWriteArrayList();
        this.onExtraCallbackWithResult = new AtomicInteger();
        this.asInterface = 3;
        this.onTransact = onWarmupCompleted;
        for (String str : strArr) {
            lt37 lt37Var = new lt37(str);
            lt37Var.IAuthTabCallback(IAuthTabCallback);
            this.asBinder.add(new IAuthTabCallback(lt37Var));
        }
    }

    public moveToFirst(Iterable<Resolver> iterable) {
        this.asBinder = new CopyOnWriteArrayList();
        this.onExtraCallbackWithResult = new AtomicInteger();
        this.asInterface = 3;
        this.onTransact = onWarmupCompleted;
        Iterator<Resolver> it = iterable.iterator();
        while (it.hasNext()) {
            this.asBinder.add(new IAuthTabCallback(it.next()));
        }
    }

    @Override // org.xbill.DNS.Resolver
    public Duration onExtraCallbackWithResult() {
        return this.onTransact;
    }

    @Override // org.xbill.DNS.Resolver
    public void IAuthTabCallback(Duration duration) {
        this.onTransact = duration;
    }

    @Override // org.xbill.DNS.Resolver
    public CompletionStage<onChildViewAdded> onExtraCallbackWithResult(onChildViewAdded onchildviewadded) {
        return onExtraCallback(onchildviewadded, ForkJoinPool.commonPool());
    }

    @Override // org.xbill.DNS.Resolver
    public CompletionStage<onChildViewAdded> onExtraCallback(onChildViewAdded onchildviewadded, Executor executor) {
        return new onExtraCallbackWithResult(this, onchildviewadded).onNavigationEvent(executor);
    }

    public static /* synthetic */ Resolver[] IAuthTabCallback(int i) {
        return new Resolver[i];
    }

    public static /* synthetic */ boolean onExtraCallback(Resolver resolver, IAuthTabCallback iAuthTabCallback) {
        return iAuthTabCallback.IAuthTabCallback == resolver;
    }

    public String toString() {
        return "ExtendedResolver of " + this.asBinder;
    }
}
