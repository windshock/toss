package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import o.sya18;
import o.sya43;
import o.uh2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class getDisplayDuration implements Iterator<uh2> {
    private final setVideoAdInteractionListener IAuthTabCallbackStub;
    private final sya14 onExtraCallback;
    protected final uh28 onExtraCallbackWithResult;
    private final sya14 onNavigationEvent;
    private final uh31 onTransact;
    private int onWarmupCompleted = 0;
    private final Map<sya18, uh2> IAuthTabCallback = new HashMap();
    private final Set<uh2> asInterface = new HashSet();

    public getDisplayDuration(setVideoAdInteractionListener setvideoadinteractionlistener, uh28 uh28Var) {
        this.onExtraCallbackWithResult = uh28Var;
        this.onTransact = setvideoadinteractionlistener.access000().onWarmupCompleted();
        this.IAuthTabCallbackStub = setvideoadinteractionlistener;
        this.onExtraCallback = new sya14(uh28Var, sya17.BLANK_LINE, sya17.BLOCK);
        this.onNavigationEvent = new sya14(uh28Var, sya17.IN_LINE);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.onExtraCallbackWithResult.onNavigationEvent(sya43.IAuthTabCallback.StreamStart)) {
            this.onExtraCallbackWithResult.onExtraCallback();
        }
        return !this.onExtraCallbackWithResult.onNavigationEvent(sya43.IAuthTabCallback.StreamEnd);
    }

    public Optional<uh2> onWarmupCompleted() {
        this.onExtraCallbackWithResult.onExtraCallback();
        Optional<uh2> optionalEmpty = Optional.empty();
        uh28 uh28Var = this.onExtraCallbackWithResult;
        sya43.IAuthTabCallback iAuthTabCallback = sya43.IAuthTabCallback.StreamEnd;
        if (!uh28Var.onNavigationEvent(iAuthTabCallback)) {
            optionalEmpty = Optional.of(next());
        }
        if (!this.onExtraCallbackWithResult.onNavigationEvent(iAuthTabCallback)) {
            throw new uh11("expected a single document in the stream", optionalEmpty.flatMap(new Function() { // from class: org.snakeyaml.engine.v2.composer.Composer$$ExternalSyntheticLambda2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((uh2) obj).onNavigationEvent();
                }
            }), "but found another document", this.onExtraCallbackWithResult.onExtraCallback().asInterface());
        }
        this.onExtraCallbackWithResult.onExtraCallback();
        return optionalEmpty;
    }

    @Override // java.util.Iterator
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public uh2 next() {
        this.onExtraCallback.onNavigationEvent();
        if (this.onExtraCallbackWithResult.onNavigationEvent(sya43.IAuthTabCallback.StreamEnd)) {
            List<sya15> listIAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
            Optional<sya8> optionalOnWarmupCompleted = listIAuthTabCallback.get(0).onWarmupCompleted();
            uh17 uh17Var = new uh17(uh25.onExtraCallback, false, Collections.EMPTY_LIST, sya19.BLOCK, optionalOnWarmupCompleted, Optional.empty());
            uh17Var.IAuthTabCallback(listIAuthTabCallback);
            return uh17Var;
        }
        this.onExtraCallbackWithResult.onExtraCallback();
        uh2 uh2VarOnExtraCallback = onExtraCallback(Optional.empty());
        this.onExtraCallback.onNavigationEvent();
        if (!this.onExtraCallback.onExtraCallbackWithResult()) {
            uh2VarOnExtraCallback.onWarmupCompleted(this.onExtraCallback.IAuthTabCallback());
        }
        this.onExtraCallbackWithResult.onExtraCallback();
        this.IAuthTabCallback.clear();
        this.asInterface.clear();
        this.onWarmupCompleted = 0;
        return uh2VarOnExtraCallback;
    }

    private uh2 onExtraCallback(Optional<uh2> optional) {
        uh2 uh2VarOnExtraCallbackWithResult;
        this.onExtraCallback.onNavigationEvent();
        final Set<uh2> set = this.asInterface;
        Objects.requireNonNull(set);
        optional.ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.composer.Composer$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                set.add((uh2) obj);
            }
        });
        if (this.onExtraCallbackWithResult.onNavigationEvent(sya43.IAuthTabCallback.Alias)) {
            sya28 sya28Var = (sya28) this.onExtraCallbackWithResult.onExtraCallback();
            sya18 sya18VarIAuthTabCallback = sya28Var.IAuthTabCallback();
            if (!this.IAuthTabCallback.containsKey(sya18VarIAuthTabCallback)) {
                throw new uh11("found undefined alias " + sya18VarIAuthTabCallback, sya28Var.asInterface());
            }
            uh2VarOnExtraCallbackWithResult = this.IAuthTabCallback.get(sya18VarIAuthTabCallback);
            if (uh2VarOnExtraCallbackWithResult.onExtraCallbackWithResult() != uh22.SCALAR) {
                int i = this.onWarmupCompleted + 1;
                this.onWarmupCompleted = i;
                if (i > this.IAuthTabCallbackStub.getInterfaceDescriptor()) {
                    throw new uh16("Number of aliases for non-scalar nodes exceeds the specified max=" + this.IAuthTabCallbackStub.getInterfaceDescriptor());
                }
            }
            if (this.asInterface.remove(uh2VarOnExtraCallbackWithResult)) {
                uh2VarOnExtraCallbackWithResult.onExtraCallbackWithResult(true);
            }
            this.onExtraCallback.IAuthTabCallback();
            this.onNavigationEvent.onNavigationEvent().IAuthTabCallback();
        } else {
            Optional<sya18> optionalOnTransact = ((sya44) this.onExtraCallbackWithResult.onNavigationEvent()).onTransact();
            if (this.onExtraCallbackWithResult.onNavigationEvent(sya43.IAuthTabCallback.Scalar)) {
                uh2VarOnExtraCallbackWithResult = onExtraCallbackWithResult(optionalOnTransact, this.onExtraCallback.IAuthTabCallback());
            } else if (this.onExtraCallbackWithResult.onNavigationEvent(sya43.IAuthTabCallback.SequenceStart)) {
                uh2VarOnExtraCallbackWithResult = onWarmupCompleted(optionalOnTransact);
            } else {
                uh2VarOnExtraCallbackWithResult = onExtraCallbackWithResult(optionalOnTransact);
            }
        }
        final Set<uh2> set2 = this.asInterface;
        Objects.requireNonNull(set2);
        optional.ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.composer.Composer$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                set2.remove((uh2) obj);
            }
        });
        return uh2VarOnExtraCallbackWithResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNavigationEvent(sya18 sya18Var, uh2 uh2Var) {
        this.IAuthTabCallback.put(sya18Var, uh2Var);
        uh2Var.onExtraCallbackWithResult(Optional.of(sya18Var));
    }

    protected uh2 onExtraCallbackWithResult(Optional<sya18> optional, List<sya15> list) {
        uh25 uh25VarOnExtraCallbackWithResult;
        boolean z;
        sya492 sya492Var = (sya492) this.onExtraCallbackWithResult.onExtraCallback();
        Optional<String> optionalIAuthTabCallback = sya492Var.IAuthTabCallback();
        if (!optionalIAuthTabCallback.isPresent() || optionalIAuthTabCallback.get().equals("!")) {
            uh25VarOnExtraCallbackWithResult = this.onTransact.onExtraCallbackWithResult(sya492Var.IAuthTabCallbackDefault(), Boolean.valueOf(sya492Var.onWarmupCompleted().onExtraCallbackWithResult()));
            z = true;
        } else {
            uh25VarOnExtraCallbackWithResult = new uh25(optionalIAuthTabCallback.get());
            z = false;
        }
        final uh23 uh23Var = new uh23(uh25VarOnExtraCallbackWithResult, z, sya492Var.IAuthTabCallbackDefault(), sya492Var.onExtraCallback(), sya492Var.asInterface(), sya492Var.IAuthTabCallbackStub());
        optional.ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.composer.Composer$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.onNavigationEvent((sya18) obj, uh23Var);
            }
        });
        uh23Var.IAuthTabCallback(list);
        uh23Var.onExtraCallbackWithResult(this.onNavigationEvent.onNavigationEvent().IAuthTabCallback());
        return uh23Var;
    }

    protected uh21 onWarmupCompleted(Optional<sya18> optional) {
        uh25 uh25Var;
        boolean z;
        sya50 sya50Var = (sya50) this.onExtraCallbackWithResult.onExtraCallback();
        Optional<String> optionalOnExtraCallbackWithResult = sya50Var.onExtraCallbackWithResult();
        if (!optionalOnExtraCallbackWithResult.isPresent() || optionalOnExtraCallbackWithResult.get().equals("!")) {
            uh25Var = uh25.IAuthTabCallbackStub;
            z = true;
        } else {
            uh25Var = new uh25(optionalOnExtraCallbackWithResult.get());
            z = false;
        }
        boolean z2 = z;
        ArrayList arrayList = new ArrayList();
        final uh21 uh21Var = new uh21(uh25Var, z2, arrayList, sya50Var.IAuthTabCallback(), sya50Var.asInterface(), Optional.empty());
        if (sya50Var.onWarmupCompleted()) {
            uh21Var.IAuthTabCallback(this.onExtraCallback.IAuthTabCallback());
        }
        optional.ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.composer.Composer$$ExternalSyntheticLambda5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.onNavigationEvent((sya18) obj, uh21Var);
            }
        });
        while (true) {
            uh28 uh28Var = this.onExtraCallbackWithResult;
            sya43.IAuthTabCallback iAuthTabCallback = sya43.IAuthTabCallback.SequenceEnd;
            if (!uh28Var.onNavigationEvent(iAuthTabCallback)) {
                this.onExtraCallback.onNavigationEvent();
                if (this.onExtraCallbackWithResult.onNavigationEvent(iAuthTabCallback)) {
                    break;
                }
                arrayList.add(onExtraCallback(Optional.of(uh21Var)));
            } else {
                break;
            }
        }
        if (sya50Var.onWarmupCompleted()) {
            uh21Var.onExtraCallbackWithResult(this.onNavigationEvent.onNavigationEvent().IAuthTabCallback());
        }
        uh21Var.onExtraCallback(this.onExtraCallbackWithResult.onExtraCallback().IAuthTabCallbackStub());
        this.onNavigationEvent.onNavigationEvent();
        if (!this.onNavigationEvent.onExtraCallbackWithResult()) {
            uh21Var.onExtraCallbackWithResult(this.onNavigationEvent.IAuthTabCallback());
        }
        return uh21Var;
    }

    protected uh2 onExtraCallbackWithResult(Optional<sya18> optional) {
        uh25 uh25Var;
        boolean z;
        sya45 sya45Var = (sya45) this.onExtraCallbackWithResult.onExtraCallback();
        Optional<String> optionalOnExtraCallbackWithResult = sya45Var.onExtraCallbackWithResult();
        if (!optionalOnExtraCallbackWithResult.isPresent() || optionalOnExtraCallbackWithResult.get().equals("!")) {
            uh25Var = uh25.asBinder;
            z = true;
        } else {
            uh25Var = new uh25(optionalOnExtraCallbackWithResult.get());
            z = false;
        }
        boolean z2 = z;
        ArrayList arrayList = new ArrayList();
        final uh17 uh17Var = new uh17(uh25Var, z2, arrayList, sya45Var.IAuthTabCallback(), sya45Var.asInterface(), Optional.empty());
        if (sya45Var.onWarmupCompleted()) {
            uh17Var.IAuthTabCallback(this.onExtraCallback.IAuthTabCallback());
        }
        optional.ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.composer.Composer$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.onNavigationEvent((sya18) obj, uh17Var);
            }
        });
        while (true) {
            uh28 uh28Var = this.onExtraCallbackWithResult;
            sya43.IAuthTabCallback iAuthTabCallback = sya43.IAuthTabCallback.MappingEnd;
            if (!uh28Var.onNavigationEvent(iAuthTabCallback)) {
                this.onExtraCallback.onNavigationEvent();
                if (this.onExtraCallbackWithResult.onNavigationEvent(iAuthTabCallback)) {
                    break;
                }
                onWarmupCompleted(arrayList, uh17Var);
            } else {
                break;
            }
        }
        if (sya45Var.onWarmupCompleted()) {
            uh17Var.onExtraCallbackWithResult(this.onNavigationEvent.onNavigationEvent().IAuthTabCallback());
        }
        uh17Var.onExtraCallback(this.onExtraCallbackWithResult.onExtraCallback().IAuthTabCallbackStub());
        this.onNavigationEvent.onNavigationEvent();
        if (!this.onNavigationEvent.onExtraCallbackWithResult()) {
            uh17Var.onExtraCallbackWithResult(this.onNavigationEvent.IAuthTabCallback());
        }
        return uh17Var;
    }

    protected void onWarmupCompleted(List<uh24> list, uh17 uh17Var) {
        list.add(new uh24(onWarmupCompleted(uh17Var), onExtraCallbackWithResult(uh17Var)));
    }

    protected uh2 onWarmupCompleted(uh17 uh17Var) {
        return onExtraCallback(Optional.of(uh17Var));
    }

    protected uh2 onExtraCallbackWithResult(uh17 uh17Var) {
        return onExtraCallback(Optional.of(uh17Var));
    }
}
