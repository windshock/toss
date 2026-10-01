package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.sf.scuba.smartcards.BuildConfig;
import o.sya43;
import o.uh27;
import o.uh3;
import o.ycx41;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class uh3 implements uh28 {
    private static final Map<String, String> IAuthTabCallback;
    private final PAGLogoView<uh27> IAuthTabCallbackDefault;
    private Optional<uh27> IAuthTabCallbackStub;
    private final setVideoAdInteractionListener asInterface;
    private Map<String, String> onExtraCallback;
    protected final uh4 onExtraCallbackWithResult;
    private final PAGLogoView<Optional<sya8>> onNavigationEvent;
    private Optional<sya43> onWarmupCompleted;

    static {
        HashMap map = new HashMap();
        IAuthTabCallback = map;
        map.put("!", "!");
        map.put("!!", "tag:yaml.org,2002:");
    }

    public uh3(setVideoAdInteractionListener setvideoadinteractionlistener, lt12 lt12Var) {
        this(setvideoadinteractionlistener, new uh8(setvideoadinteractionlistener, lt12Var));
    }

    public uh3(setVideoAdInteractionListener setvideoadinteractionlistener, uh4 uh4Var) {
        this.onExtraCallbackWithResult = uh4Var;
        this.asInterface = setvideoadinteractionlistener;
        this.onWarmupCompleted = Optional.empty();
        this.onExtraCallback = new HashMap(IAuthTabCallback);
        this.IAuthTabCallbackDefault = new PAGLogoView<>(100);
        this.onNavigationEvent = new PAGLogoView<>(10);
        this.IAuthTabCallbackStub = Optional.of(new ICustomTabsCallbackDefault());
    }

    public boolean onNavigationEvent(sya43.IAuthTabCallback iAuthTabCallback) {
        onNavigationEvent();
        return this.onWarmupCompleted.isPresent() && this.onWarmupCompleted.get().onNavigationEvent() == iAuthTabCallback;
    }

    public sya43 onNavigationEvent() {
        onTransact();
        return this.onWarmupCompleted.orElseThrow(new Supplier() { // from class: org.snakeyaml.engine.v2.parser.ParserImpl$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return uh3.onExtraCallbackWithResult();
            }
        });
    }

    public static /* synthetic */ NoSuchElementException onExtraCallbackWithResult() {
        return new NoSuchElementException("No more Events found.");
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public sya43 next() {
        sya43 sya43VarOnNavigationEvent = onNavigationEvent();
        this.onWarmupCompleted = Optional.empty();
        return sya43VarOnNavigationEvent;
    }

    public boolean hasNext() {
        onTransact();
        return this.onWarmupCompleted.isPresent();
    }

    private void onTransact() {
        if (this.onWarmupCompleted.isPresent()) {
            return;
        }
        this.IAuthTabCallbackStub.ifPresent(new Consumer() { // from class: org.snakeyaml.engine.v2.parser.ParserImpl$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.onWarmupCompleted = Optional.of(((uh27) obj).onExtraCallbackWithResult());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sya40 onExtraCallbackWithResult(lt34 lt34Var) {
        return new sya40(lt34Var.IAuthTabCallback(), lt34Var.onExtraCallback(), lt34Var.onTransact(), lt34Var.asInterface());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public uh26 IAuthTabCallbackDefault() {
        Optional optionalEmpty = Optional.empty();
        HashMap map = new HashMap();
        while (this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Directive)) {
            lud23 lud23Var = (lud23) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            Optional optionalOnExtraCallback = lud23Var.onExtraCallback();
            if (optionalOnExtraCallback.isPresent()) {
                List list = (List) optionalOnExtraCallback.get();
                if (lud23Var.onWarmupCompleted().equals("YAML")) {
                    if (optionalEmpty.isPresent()) {
                        throw new uh13("found duplicate YAML directive", lud23Var.onTransact());
                    }
                    optionalEmpty = Optional.of(this.asInterface.readTypedObject().apply(new onDowngrade(((Integer) list.get(0)).intValue(), ((Integer) list.get(1)).intValue())));
                } else if (lud23Var.onWarmupCompleted().equals("TAG")) {
                    String str = (String) list.get(0);
                    String str2 = (String) list.get(1);
                    if (map.containsKey(str)) {
                        throw new uh13("duplicate tag handle " + str, lud23Var.onTransact());
                    }
                    map.put(str, str2);
                } else {
                    continue;
                }
            }
        }
        HashMap map2 = new HashMap();
        if (!map.isEmpty()) {
            map2.putAll(map);
        }
        for (Map.Entry<String, String> entry : IAuthTabCallback.entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        this.onExtraCallback = map;
        return new uh26(optionalEmpty, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sya43 IAuthTabCallbackStub() {
        return onNavigationEvent(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sya43 IAuthTabCallback() {
        return onNavigationEvent(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sya43 onNavigationEvent(boolean z, boolean z2) {
        Optional optional;
        IPBroadcastReceiver1 iPBroadcastReceiver1OnExtraCallbackWithResult;
        Optional optional2;
        Optional optionalOnTransact;
        Optional optional3;
        sya46 sya46Var;
        sya46 sya46Var2;
        Optional optionalEmpty = Optional.empty();
        Optional optionalEmpty2 = Optional.empty();
        Optional.empty();
        if (this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Alias)) {
            lt32 lt32Var = (lt32) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            sya28 sya28Var = new sya28(Optional.of(lt32Var.onExtraCallbackWithResult()), lt32Var.onTransact(), lt32Var.asInterface());
            this.IAuthTabCallbackStub = Optional.of(this.IAuthTabCallbackDefault.onNavigationEvent());
            return sya28Var;
        }
        Optional optionalEmpty3 = Optional.empty();
        uh4 uh4Var = this.onExtraCallbackWithResult;
        ycx41.IAuthTabCallback iAuthTabCallback = ycx41.IAuthTabCallback.Anchor;
        if (uh4Var.onWarmupCompleted(iAuthTabCallback)) {
            lt31 lt31Var = (lt31) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            Optional optionalOnTransact2 = lt31Var.onTransact();
            Optional optionalAsInterface = lt31Var.asInterface();
            Optional optionalOf = Optional.of(lt31Var.onWarmupCompleted());
            if (this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Tag)) {
                IPBroadcastReceiver iPBroadcastReceiver = (IPBroadcastReceiver) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                Optional optionalOnTransact3 = iPBroadcastReceiver.onTransact();
                Optional optionalAsInterface2 = iPBroadcastReceiver.asInterface();
                iPBroadcastReceiver1OnExtraCallbackWithResult = iPBroadcastReceiver.onExtraCallbackWithResult();
                optionalAsInterface = optionalAsInterface2;
                optional2 = optionalOnTransact3;
            } else {
                iPBroadcastReceiver1OnExtraCallbackWithResult = null;
                optional2 = null;
            }
            optional = optionalOf;
            optionalEmpty = optionalOnTransact2;
            optionalEmpty2 = optionalAsInterface;
        } else if (this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Tag)) {
            IPBroadcastReceiver iPBroadcastReceiver2 = (IPBroadcastReceiver) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            Optional optionalOnTransact4 = iPBroadcastReceiver2.onTransact();
            Optional optionalAsInterface3 = iPBroadcastReceiver2.asInterface();
            IPBroadcastReceiver1 iPBroadcastReceiver1OnExtraCallbackWithResult2 = iPBroadcastReceiver2.onExtraCallbackWithResult();
            if (this.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback)) {
                lt31 lt31Var2 = (lt31) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                optionalAsInterface3 = lt31Var2.asInterface();
                optionalEmpty3 = Optional.of(lt31Var2.onWarmupCompleted());
            }
            optional2 = optionalOnTransact4;
            optional = optionalEmpty3;
            optionalEmpty2 = optionalAsInterface3;
            iPBroadcastReceiver1OnExtraCallbackWithResult = iPBroadcastReceiver1OnExtraCallbackWithResult2;
            optionalEmpty = optional2;
        } else {
            optional = optionalEmpty3;
            iPBroadcastReceiver1OnExtraCallbackWithResult = null;
            optional2 = null;
        }
        Optional optionalEmpty4 = Optional.empty();
        if (iPBroadcastReceiver1OnExtraCallbackWithResult != null) {
            Optional<String> optionalOnExtraCallback = iPBroadcastReceiver1OnExtraCallbackWithResult.onExtraCallback();
            String strOnWarmupCompleted = iPBroadcastReceiver1OnExtraCallbackWithResult.onWarmupCompleted();
            if (optionalOnExtraCallback.isPresent()) {
                String str = optionalOnExtraCallback.get();
                if (!this.onExtraCallback.containsKey(str)) {
                    throw new uh13("while parsing a node", optionalEmpty, "found undefined tag handle " + str, optional2);
                }
                optionalEmpty4 = Optional.of(this.onExtraCallback.get(str) + strOnWarmupCompleted);
            } else {
                optionalEmpty4 = Optional.of(strOnWarmupCompleted);
            }
        }
        Optional optional4 = optionalEmpty4;
        if (optionalEmpty.isPresent()) {
            optionalOnTransact = optionalEmpty;
            optional3 = optionalEmpty2;
        } else {
            optionalOnTransact = this.onExtraCallbackWithResult.onExtraCallback().onTransact();
            optional3 = optionalOnTransact;
        }
        boolean z3 = !optional4.isPresent();
        if (z2 && this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.BlockEntry)) {
            sya50 sya50Var = new sya50(optional, optional4, z3, sya19.BLOCK, optionalOnTransact, this.onExtraCallbackWithResult.onExtraCallback().asInterface());
            this.IAuthTabCallbackStub = Optional.of(new onPostMessage());
            return sya50Var;
        }
        if (this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Scalar)) {
            djycx2 djycx2Var = (djycx2) this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            Optional optionalAsInterface4 = djycx2Var.asInterface();
            if (djycx2Var.onExtraCallbackWithResult() && !optional4.isPresent()) {
                sya46Var2 = new sya46(true, false);
            } else if (!optional4.isPresent()) {
                sya46Var2 = new sya46(false, true);
            } else {
                sya46Var = new sya46(false, false);
                sya492 sya492Var = new sya492(optional, optional4, sya46Var, djycx2Var.IAuthTabCallback(), djycx2Var.onWarmupCompleted(), optionalOnTransact, optionalAsInterface4);
                this.IAuthTabCallbackStub = Optional.of(this.IAuthTabCallbackDefault.onNavigationEvent());
                return sya492Var;
            }
            sya46Var = sya46Var2;
            sya492 sya492Var2 = new sya492(optional, optional4, sya46Var, djycx2Var.IAuthTabCallback(), djycx2Var.onWarmupCompleted(), optionalOnTransact, optionalAsInterface4);
            this.IAuthTabCallbackStub = Optional.of(this.IAuthTabCallbackDefault.onNavigationEvent());
            return sya492Var2;
        }
        if (this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.FlowSequenceStart)) {
            sya50 sya50Var2 = new sya50(optional, optional4, z3, sya19.FLOW, optionalOnTransact, this.onExtraCallbackWithResult.onExtraCallback().asInterface());
            this.IAuthTabCallbackStub = Optional.of(new onMessageChannelReady());
            return sya50Var2;
        }
        if (this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.FlowMappingStart)) {
            sya45 sya45Var = new sya45(optional, optional4, z3, sya19.FLOW, optionalOnTransact, this.onExtraCallbackWithResult.onExtraCallback().asInterface());
            this.IAuthTabCallbackStub = Optional.of(new access000());
            return sya45Var;
        }
        if (z && this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.BlockSequenceStart)) {
            sya50 sya50Var3 = new sya50(optional, optional4, z3, sya19.BLOCK, optionalOnTransact, this.onExtraCallbackWithResult.onExtraCallback().onTransact());
            this.IAuthTabCallbackStub = Optional.of(new asInterface());
            return sya50Var3;
        }
        if (z && this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.BlockMappingStart)) {
            sya45 sya45Var2 = new sya45(optional, optional4, z3, sya19.BLOCK, optionalOnTransact, this.onExtraCallbackWithResult.onExtraCallback().onTransact());
            this.IAuthTabCallbackStub = Optional.of(new onNavigationEvent());
            return sya45Var2;
        }
        if (optional.isPresent() || optional4.isPresent()) {
            sya492 sya492Var3 = new sya492(optional, optional4, new sya46(z3, false), BuildConfig.FLAVOR, sya6.PLAIN, optionalOnTransact, optional3);
            this.IAuthTabCallbackStub = Optional.of(this.IAuthTabCallbackDefault.onNavigationEvent());
            return sya492Var3;
        }
        ycx41 ycx41VarOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback();
        StringBuilder sb = new StringBuilder();
        sb.append("while parsing a ");
        sb.append(z ? "block" : "flow");
        sb.append(" node");
        throw new uh13(sb.toString(), optionalOnTransact, "expected the node content, but found '" + ycx41VarOnExtraCallback.onNavigationEvent() + "'", ycx41VarOnExtraCallback.onTransact());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public sya43 onExtraCallbackWithResult(Optional<sya8> optional) {
        return new sya492(Optional.empty(), Optional.empty(), new sya46(true, false), BuildConfig.FLAVOR, sya6.PLAIN, optional, optional);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Optional<sya8> onWarmupCompleted() {
        return this.onNavigationEvent.onNavigationEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback(Optional<sya8> optional) {
        this.onNavigationEvent.onExtraCallback(optional);
    }

    class ICustomTabsCallbackDefault implements uh27 {
        private ICustomTabsCallbackDefault() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            IPBroadcastReceiver11 iPBroadcastReceiver11 = (IPBroadcastReceiver11) uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            sya491 sya491Var = new sya491(iPBroadcastReceiver11.onTransact(), iPBroadcastReceiver11.asInterface());
            uh3 uh3Var = uh3.this;
            uh3Var.IAuthTabCallbackStub = Optional.of(new onMinimized());
            return sya491Var;
        }
    }

    class onMinimized implements uh27 {
        private onMinimized() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new onMinimized());
                uh3 uh3Var2 = uh3.this;
                return uh3Var2.onExtraCallbackWithResult((lt34) uh3Var2.onExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            if (!uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{ycx41.IAuthTabCallback.Directive, ycx41.IAuthTabCallback.DocumentStart, ycx41.IAuthTabCallback.StreamEnd})) {
                Optional optionalOnTransact = uh3.this.onExtraCallbackWithResult.onExtraCallback().onTransact();
                sya39 sya39Var = new sya39(false, Optional.empty(), Collections.EMPTY_MAP, optionalOnTransact, optionalOnTransact);
                uh3.this.IAuthTabCallbackDefault.onExtraCallback(new IAuthTabCallbackStubProxy());
                uh3 uh3Var3 = uh3.this;
                uh3Var3.IAuthTabCallbackStub = Optional.of(new asBinder());
                return sya39Var;
            }
            return new getInterfaceDescriptor().onExtraCallbackWithResult();
        }
    }

    class getInterfaceDescriptor implements uh27 {
        private getInterfaceDescriptor() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new getInterfaceDescriptor());
                uh3 uh3Var2 = uh3.this;
                return uh3Var2.onExtraCallbackWithResult((lt34) uh3Var2.onExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            while (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.DocumentEnd)) {
                uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            }
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var3 = uh3.this;
                uh3Var3.IAuthTabCallbackStub = Optional.of(uh3Var3.new getInterfaceDescriptor());
                uh3 uh3Var4 = uh3.this;
                return uh3Var4.onExtraCallbackWithResult((lt34) uh3Var4.onExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            if (!uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.StreamEnd)) {
                uh3.this.onExtraCallbackWithResult.onNavigationEvent();
                Optional optionalOnTransact = uh3.this.onExtraCallbackWithResult.onExtraCallback().onTransact();
                uh26 uh26VarIAuthTabCallbackDefault = uh3.this.IAuthTabCallbackDefault();
                while (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                    uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                }
                if (!uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.StreamEnd)) {
                    if (!uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.DocumentStart)) {
                        throw new uh13("expected '<document start>', but found '" + uh3.this.onExtraCallbackWithResult.onExtraCallback().onNavigationEvent() + "'", uh3.this.onExtraCallbackWithResult.onExtraCallback().onTransact());
                    }
                    sya39 sya39Var = new sya39(true, uh26VarIAuthTabCallbackDefault.onExtraCallbackWithResult(), uh26VarIAuthTabCallbackDefault.onNavigationEvent(), optionalOnTransact, uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult().asInterface());
                    uh3.this.IAuthTabCallbackDefault.onExtraCallback(new IAuthTabCallbackStubProxy());
                    uh3 uh3Var5 = uh3.this;
                    uh3Var5.IAuthTabCallbackStub = Optional.of(new onTransact());
                    return sya39Var;
                }
                throw new uh13("expected '<document start>', but found '" + uh3.this.onExtraCallbackWithResult.onExtraCallback().onNavigationEvent() + "'", uh3.this.onExtraCallbackWithResult.onExtraCallback().onTransact());
            }
            IPBroadcastReceiver2 iPBroadcastReceiver2 = (IPBroadcastReceiver2) uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            sya49 sya49Var = new sya49(iPBroadcastReceiver2.onTransact(), iPBroadcastReceiver2.asInterface());
            if (!uh3.this.IAuthTabCallbackDefault.onExtraCallbackWithResult()) {
                throw new uh16("Unexpected end of stream. States left: " + uh3.this.IAuthTabCallbackDefault);
            }
            if (!IAuthTabCallback()) {
                throw new uh16("Unexpected end of stream. Marks left: " + uh3.this.onNavigationEvent);
            }
            uh3.this.IAuthTabCallbackStub = Optional.empty();
            return sya49Var;
        }

        private boolean IAuthTabCallback() {
            return uh3.this.onNavigationEvent.onExtraCallbackWithResult();
        }
    }

    class IAuthTabCallbackStubProxy implements uh27 {
        private IAuthTabCallbackStubProxy() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            boolean z;
            Optional optionalAsInterface;
            Optional optionalOnTransact = uh3.this.onExtraCallbackWithResult.onExtraCallback().onTransact();
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.DocumentEnd)) {
                optionalAsInterface = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult().asInterface();
                z = true;
            } else {
                if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Directive)) {
                    throw new uh13("expected '<document end>' before directives, but found '" + uh3.this.onExtraCallbackWithResult.onExtraCallback().onNavigationEvent() + "'", uh3.this.onExtraCallbackWithResult.onExtraCallback().onTransact());
                }
                z = false;
                optionalAsInterface = optionalOnTransact;
            }
            uh3.this.onExtraCallback.clear();
            sya36 sya36Var = new sya36(z, optionalOnTransact, optionalAsInterface);
            uh3 uh3Var = uh3.this;
            uh3Var.IAuthTabCallbackStub = Optional.of(new getInterfaceDescriptor());
            return sya36Var;
        }
    }

    class onTransact implements uh27 {
        private onTransact() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new onTransact());
                uh3 uh3Var2 = uh3.this;
                return uh3Var2.onExtraCallbackWithResult((lt34) uh3Var2.onExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            if (uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{ycx41.IAuthTabCallback.Directive, ycx41.IAuthTabCallback.DocumentStart, ycx41.IAuthTabCallback.DocumentEnd, ycx41.IAuthTabCallback.StreamEnd})) {
                uh3 uh3Var3 = uh3.this;
                sya43 sya43VarOnExtraCallbackWithResult = uh3Var3.onExtraCallbackWithResult((Optional<sya8>) uh3Var3.onExtraCallbackWithResult.onExtraCallback().onTransact());
                uh3 uh3Var4 = uh3.this;
                uh3Var4.IAuthTabCallbackStub = Optional.of((uh27) uh3Var4.IAuthTabCallbackDefault.onNavigationEvent());
                return sya43VarOnExtraCallbackWithResult;
            }
            return new asBinder().onExtraCallbackWithResult();
        }
    }

    class asBinder implements uh27 {
        private asBinder() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            return uh3.this.onNavigationEvent(true, false);
        }
    }

    class asInterface implements uh27 {
        private asInterface() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            uh3.this.IAuthTabCallback((Optional<sya8>) uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult().onTransact());
            return new IAuthTabCallbackStub().onExtraCallbackWithResult();
        }
    }

    class IAuthTabCallbackStub implements uh27 {
        private IAuthTabCallbackStub() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new IAuthTabCallbackStub());
                uh3 uh3Var2 = uh3.this;
                return uh3Var2.onExtraCallbackWithResult((lt34) uh3Var2.onExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.BlockEntry)) {
                return uh3.this.new IAuthTabCallbackDefault((lud21) uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult()).onExtraCallbackWithResult();
            }
            if (!uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.BlockEnd)) {
                ycx41 ycx41VarOnExtraCallback = uh3.this.onExtraCallbackWithResult.onExtraCallback();
                throw new uh13("while parsing a block collection", uh3.this.onWarmupCompleted(), "expected <block end>, but found '" + ycx41VarOnExtraCallback.onNavigationEvent() + "'", ycx41VarOnExtraCallback.onTransact());
            }
            ycx41 ycx41VarOnExtraCallbackWithResult = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            sya48 sya48Var = new sya48(ycx41VarOnExtraCallbackWithResult.onTransact(), ycx41VarOnExtraCallbackWithResult.asInterface());
            uh3 uh3Var3 = uh3.this;
            uh3Var3.IAuthTabCallbackStub = Optional.of((uh27) uh3Var3.IAuthTabCallbackDefault.onNavigationEvent());
            uh3.this.onWarmupCompleted();
            return sya48Var;
        }
    }

    class IAuthTabCallbackDefault implements uh27 {
        lud21 onExtraCallbackWithResult;

        public IAuthTabCallbackDefault(lud21 lud21Var) {
            this.onExtraCallbackWithResult = lud21Var;
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new IAuthTabCallbackDefault(this.onExtraCallbackWithResult));
                uh3 uh3Var2 = uh3.this;
                return uh3Var2.onExtraCallbackWithResult((lt34) uh3Var2.onExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            if (!uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{ycx41.IAuthTabCallback.BlockEntry, ycx41.IAuthTabCallback.BlockEnd})) {
                uh3.this.IAuthTabCallbackDefault.onExtraCallback(new IAuthTabCallbackStub());
                return new asBinder().onExtraCallbackWithResult();
            }
            uh3 uh3Var3 = uh3.this;
            uh3Var3.IAuthTabCallbackStub = Optional.of(new IAuthTabCallbackStub());
            return uh3.this.onExtraCallbackWithResult((Optional<sya8>) this.onExtraCallbackWithResult.asInterface());
        }
    }

    class onPostMessage implements uh27 {
        private onPostMessage() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new onPostMessage());
                uh3 uh3Var2 = uh3.this;
                return uh3Var2.onExtraCallbackWithResult((lt34) uh3Var2.onExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.BlockEntry)) {
                return uh3.this.new onActivityResized((lud21) uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult()).onExtraCallbackWithResult();
            }
            ycx41 ycx41VarOnExtraCallback = uh3.this.onExtraCallbackWithResult.onExtraCallback();
            sya48 sya48Var = new sya48(ycx41VarOnExtraCallback.onTransact(), ycx41VarOnExtraCallback.asInterface());
            uh3 uh3Var3 = uh3.this;
            uh3Var3.IAuthTabCallbackStub = Optional.of((uh27) uh3Var3.IAuthTabCallbackDefault.onNavigationEvent());
            return sya48Var;
        }
    }

    class onActivityResized implements uh27 {
        lud21 onExtraCallbackWithResult;

        public onActivityResized(lud21 lud21Var) {
            this.onExtraCallbackWithResult = lud21Var;
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new onActivityResized(this.onExtraCallbackWithResult));
                uh3 uh3Var2 = uh3.this;
                return uh3Var2.onExtraCallbackWithResult((lt34) uh3Var2.onExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            if (!uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{ycx41.IAuthTabCallback.BlockEntry, ycx41.IAuthTabCallback.Key, ycx41.IAuthTabCallback.Value, ycx41.IAuthTabCallback.BlockEnd})) {
                uh3.this.IAuthTabCallbackDefault.onExtraCallback(new onPostMessage());
                return new asBinder().onExtraCallbackWithResult();
            }
            uh3 uh3Var3 = uh3.this;
            uh3Var3.IAuthTabCallbackStub = Optional.of(new onPostMessage());
            return uh3.this.onExtraCallbackWithResult((Optional<sya8>) this.onExtraCallbackWithResult.asInterface());
        }
    }

    class onNavigationEvent implements uh27 {
        private onNavigationEvent() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            uh3.this.IAuthTabCallback((Optional<sya8>) uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult().onTransact());
            return new onExtraCallbackWithResult().onExtraCallbackWithResult();
        }
    }

    class onExtraCallbackWithResult implements uh27 {
        private onExtraCallbackWithResult() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new onExtraCallbackWithResult());
                uh3 uh3Var2 = uh3.this;
                return uh3Var2.onExtraCallbackWithResult((lt34) uh3Var2.onExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            uh4 uh4Var = uh3.this.onExtraCallbackWithResult;
            ycx41.IAuthTabCallback iAuthTabCallback = ycx41.IAuthTabCallback.Key;
            if (uh4Var.onWarmupCompleted(iAuthTabCallback)) {
                ycx41 ycx41VarOnExtraCallbackWithResult = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                if (!uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{iAuthTabCallback, ycx41.IAuthTabCallback.Value, ycx41.IAuthTabCallback.BlockEnd})) {
                    uh3.this.IAuthTabCallbackDefault.onExtraCallback(new onExtraCallback());
                    return uh3.this.IAuthTabCallback();
                }
                uh3 uh3Var3 = uh3.this;
                uh3Var3.IAuthTabCallbackStub = Optional.of(new onExtraCallback());
                return uh3.this.onExtraCallbackWithResult((Optional<sya8>) ycx41VarOnExtraCallbackWithResult.asInterface());
            }
            if (!uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.BlockEnd)) {
                ycx41 ycx41VarOnExtraCallback = uh3.this.onExtraCallbackWithResult.onExtraCallback();
                throw new uh13("while parsing a block mapping", uh3.this.onWarmupCompleted(), "expected <block end>, but found '" + ycx41VarOnExtraCallback.onNavigationEvent() + "'", ycx41VarOnExtraCallback.onTransact());
            }
            ycx41 ycx41VarOnExtraCallbackWithResult2 = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            sya47 sya47Var = new sya47(ycx41VarOnExtraCallbackWithResult2.onTransact(), ycx41VarOnExtraCallbackWithResult2.asInterface());
            uh3 uh3Var4 = uh3.this;
            uh3Var4.IAuthTabCallbackStub = Optional.of((uh27) uh3Var4.IAuthTabCallbackDefault.onNavigationEvent());
            uh3.this.onWarmupCompleted();
            return sya47Var;
        }
    }

    class onExtraCallback implements uh27 {
        private onExtraCallback() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            uh4 uh4Var = uh3.this.onExtraCallbackWithResult;
            ycx41.IAuthTabCallback iAuthTabCallback = ycx41.IAuthTabCallback.Value;
            if (uh4Var.onWarmupCompleted(iAuthTabCallback)) {
                ycx41 ycx41VarOnExtraCallbackWithResult = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                    IAuthTabCallback iAuthTabCallback2 = new IAuthTabCallback();
                    uh3.this.IAuthTabCallbackStub = Optional.of(iAuthTabCallback2);
                    return iAuthTabCallback2.onExtraCallbackWithResult();
                }
                if (!uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{ycx41.IAuthTabCallback.Key, iAuthTabCallback, ycx41.IAuthTabCallback.BlockEnd})) {
                    uh3.this.IAuthTabCallbackDefault.onExtraCallback(new onExtraCallbackWithResult());
                    return uh3.this.IAuthTabCallback();
                }
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(new onExtraCallbackWithResult());
                return uh3.this.onExtraCallbackWithResult((Optional<sya8>) ycx41VarOnExtraCallbackWithResult.asInterface());
            }
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Scalar)) {
                uh3.this.IAuthTabCallbackDefault.onExtraCallback(new onExtraCallbackWithResult());
                return uh3.this.IAuthTabCallback();
            }
            uh3 uh3Var2 = uh3.this;
            uh3Var2.IAuthTabCallbackStub = Optional.of(new onExtraCallbackWithResult());
            return uh3.this.onExtraCallbackWithResult((Optional<sya8>) uh3.this.onExtraCallbackWithResult.onExtraCallback().onTransact());
        }
    }

    class IAuthTabCallback implements uh27 {
        List<lt34> onExtraCallback;

        private IAuthTabCallback() {
            this.onExtraCallback = new LinkedList();
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                this.onExtraCallback.add((lt34) uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult());
                return onExtraCallbackWithResult();
            }
            if (!uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{ycx41.IAuthTabCallback.Key, ycx41.IAuthTabCallback.Value, ycx41.IAuthTabCallback.BlockEnd})) {
                if (!this.onExtraCallback.isEmpty()) {
                    return uh3.this.onExtraCallbackWithResult(this.onExtraCallback.remove(0));
                }
                uh3.this.IAuthTabCallbackDefault.onExtraCallback(new onExtraCallbackWithResult());
                return uh3.this.IAuthTabCallback();
            }
            uh3 uh3Var = uh3.this;
            uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new onWarmupCompleted(this.onExtraCallback));
            uh3 uh3Var2 = uh3.this;
            return uh3Var2.onExtraCallbackWithResult((Optional<sya8>) uh3Var2.onExtraCallbackWithResult.onExtraCallback().onTransact());
        }
    }

    class onWarmupCompleted implements uh27 {
        List<lt34> onNavigationEvent;

        public onWarmupCompleted(List<lt34> list) {
            this.onNavigationEvent = list;
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (!this.onNavigationEvent.isEmpty()) {
                return uh3.this.onExtraCallbackWithResult(this.onNavigationEvent.remove(0));
            }
            return new onExtraCallbackWithResult().onExtraCallbackWithResult();
        }
    }

    class onMessageChannelReady implements uh27 {
        private onMessageChannelReady() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            uh3.this.IAuthTabCallback((Optional<sya8>) uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult().onTransact());
            return uh3.this.new readTypedObject(true).onExtraCallbackWithResult();
        }
    }

    class readTypedObject implements uh27 {
        private final boolean onWarmupCompleted;

        public readTypedObject(boolean z) {
            this.onWarmupCompleted = z;
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            uh4 uh4Var = uh3.this.onExtraCallbackWithResult;
            ycx41.IAuthTabCallback iAuthTabCallback = ycx41.IAuthTabCallback.Comment;
            if (uh4Var.onWarmupCompleted(iAuthTabCallback)) {
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new readTypedObject(this.onWarmupCompleted));
                uh3 uh3Var2 = uh3.this;
                return uh3Var2.onExtraCallbackWithResult((lt34) uh3Var2.onExtraCallbackWithResult.onExtraCallbackWithResult());
            }
            uh4 uh4Var2 = uh3.this.onExtraCallbackWithResult;
            ycx41.IAuthTabCallback iAuthTabCallback2 = ycx41.IAuthTabCallback.FlowSequenceEnd;
            if (!uh4Var2.onWarmupCompleted(iAuthTabCallback2)) {
                if (!this.onWarmupCompleted) {
                    if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.FlowEntry)) {
                        uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                        if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback)) {
                            uh3 uh3Var3 = uh3.this;
                            uh3Var3.IAuthTabCallbackStub = Optional.of(uh3Var3.new readTypedObject(true));
                            uh3 uh3Var4 = uh3.this;
                            return uh3Var4.onExtraCallbackWithResult((lt34) uh3Var4.onExtraCallbackWithResult.onExtraCallbackWithResult());
                        }
                    } else {
                        ycx41 ycx41VarOnExtraCallback = uh3.this.onExtraCallbackWithResult.onExtraCallback();
                        throw new uh13("while parsing a flow sequence", uh3.this.onWarmupCompleted(), "expected ',' or ']', but got " + ycx41VarOnExtraCallback.onNavigationEvent(), ycx41VarOnExtraCallback.onTransact());
                    }
                }
                if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Key)) {
                    ycx41 ycx41VarOnExtraCallback2 = uh3.this.onExtraCallbackWithResult.onExtraCallback();
                    sya45 sya45Var = new sya45(Optional.empty(), Optional.empty(), true, sya19.FLOW, ycx41VarOnExtraCallback2.onTransact(), ycx41VarOnExtraCallback2.asInterface());
                    uh3 uh3Var5 = uh3.this;
                    uh3Var5.IAuthTabCallbackStub = Optional.of(new extraCallbackWithResult());
                    return sya45Var;
                }
                if (!uh3.this.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback2)) {
                    uh3.this.IAuthTabCallbackDefault.onExtraCallback(uh3.this.new readTypedObject(false));
                    return uh3.this.IAuthTabCallbackStub();
                }
            }
            ycx41 ycx41VarOnExtraCallbackWithResult = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            sya48 sya48Var = new sya48(ycx41VarOnExtraCallbackWithResult.onTransact(), ycx41VarOnExtraCallbackWithResult.asInterface());
            if (!uh3.this.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback)) {
                uh3 uh3Var6 = uh3.this;
                uh3Var6.IAuthTabCallbackStub = Optional.of((uh27) uh3Var6.IAuthTabCallbackDefault.onNavigationEvent());
            } else {
                uh3 uh3Var7 = uh3.this;
                uh3Var7.IAuthTabCallbackStub = Optional.of(new access100());
            }
            uh3.this.onWarmupCompleted();
            return sya48Var;
        }
    }

    class access100 implements uh27 {
        private access100() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            uh3 uh3Var = uh3.this;
            sya40 sya40VarOnExtraCallbackWithResult = uh3Var.onExtraCallbackWithResult((lt34) uh3Var.onExtraCallbackWithResult.onExtraCallbackWithResult());
            if (!uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var2 = uh3.this;
                uh3Var2.IAuthTabCallbackStub = Optional.of((uh27) uh3Var2.IAuthTabCallbackDefault.onNavigationEvent());
            }
            return sya40VarOnExtraCallbackWithResult;
        }
    }

    class extraCallbackWithResult implements uh27 {
        private extraCallbackWithResult() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            ycx41 ycx41VarOnExtraCallbackWithResult = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            if (!uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{ycx41.IAuthTabCallback.Value, ycx41.IAuthTabCallback.FlowEntry, ycx41.IAuthTabCallback.FlowSequenceEnd})) {
                uh3.this.IAuthTabCallbackDefault.onExtraCallback(new onActivityLayout());
                return uh3.this.IAuthTabCallbackStub();
            }
            uh3 uh3Var = uh3.this;
            uh3Var.IAuthTabCallbackStub = Optional.of(new onActivityLayout());
            return uh3.this.onExtraCallbackWithResult((Optional<sya8>) ycx41VarOnExtraCallbackWithResult.asInterface());
        }
    }

    class onActivityLayout implements uh27 {
        private onActivityLayout() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Value)) {
                ycx41 ycx41VarOnExtraCallbackWithResult = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                if (!uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{ycx41.IAuthTabCallback.FlowEntry, ycx41.IAuthTabCallback.FlowSequenceEnd})) {
                    uh3.this.IAuthTabCallbackDefault.onExtraCallback(new ICustomTabsCallback());
                    return uh3.this.IAuthTabCallbackStub();
                }
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(new ICustomTabsCallback());
                return uh3.this.onExtraCallbackWithResult((Optional<sya8>) ycx41VarOnExtraCallbackWithResult.asInterface());
            }
            uh3 uh3Var2 = uh3.this;
            uh3Var2.IAuthTabCallbackStub = Optional.of(new ICustomTabsCallback());
            return uh3.this.onExtraCallbackWithResult((Optional<sya8>) uh3.this.onExtraCallbackWithResult.onExtraCallback().onTransact());
        }
    }

    class ICustomTabsCallback implements uh27 {
        private ICustomTabsCallback() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            uh3 uh3Var = uh3.this;
            uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new readTypedObject(false));
            ycx41 ycx41VarOnExtraCallback = uh3.this.onExtraCallbackWithResult.onExtraCallback();
            return new sya47(ycx41VarOnExtraCallback.onTransact(), ycx41VarOnExtraCallback.asInterface());
        }
    }

    class access000 implements uh27 {
        private access000() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            uh3.this.IAuthTabCallback((Optional<sya8>) uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult().onTransact());
            return uh3.this.new writeTypedObject(true).onExtraCallbackWithResult();
        }
    }

    class writeTypedObject implements uh27 {
        private final boolean onWarmupCompleted;

        public writeTypedObject(boolean z) {
            this.onWarmupCompleted = z;
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            uh4 uh4Var = uh3.this.onExtraCallbackWithResult;
            ycx41.IAuthTabCallback iAuthTabCallback = ycx41.IAuthTabCallback.FlowMappingEnd;
            if (!uh4Var.onWarmupCompleted(iAuthTabCallback)) {
                if (!this.onWarmupCompleted) {
                    if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.FlowEntry)) {
                        uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                    } else {
                        ycx41 ycx41VarOnExtraCallback = uh3.this.onExtraCallbackWithResult.onExtraCallback();
                        throw new uh13("while parsing a flow mapping", uh3.this.onWarmupCompleted(), "expected ',' or '}', but got " + ycx41VarOnExtraCallback.onNavigationEvent(), ycx41VarOnExtraCallback.onTransact());
                    }
                }
                if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Key)) {
                    ycx41 ycx41VarOnExtraCallbackWithResult = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                    if (!uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{ycx41.IAuthTabCallback.Value, ycx41.IAuthTabCallback.FlowEntry, iAuthTabCallback})) {
                        uh3.this.IAuthTabCallbackDefault.onExtraCallback(new extraCallback());
                        return uh3.this.IAuthTabCallbackStub();
                    }
                    uh3 uh3Var = uh3.this;
                    uh3Var.IAuthTabCallbackStub = Optional.of(new extraCallback());
                    return uh3.this.onExtraCallbackWithResult((Optional<sya8>) ycx41VarOnExtraCallbackWithResult.asInterface());
                }
                if (!uh3.this.onExtraCallbackWithResult.onWarmupCompleted(iAuthTabCallback)) {
                    uh3.this.IAuthTabCallbackDefault.onExtraCallback(new IAuthTabCallback_Parcel());
                    return uh3.this.IAuthTabCallbackStub();
                }
            }
            ycx41 ycx41VarOnExtraCallbackWithResult2 = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            sya47 sya47Var = new sya47(ycx41VarOnExtraCallbackWithResult2.onTransact(), ycx41VarOnExtraCallbackWithResult2.asInterface());
            uh3.this.onWarmupCompleted();
            if (!uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Comment)) {
                uh3 uh3Var2 = uh3.this;
                uh3Var2.IAuthTabCallbackStub = Optional.of((uh27) uh3Var2.IAuthTabCallbackDefault.onNavigationEvent());
                return sya47Var;
            }
            uh3 uh3Var3 = uh3.this;
            uh3Var3.IAuthTabCallbackStub = Optional.of(new access100());
            return sya47Var;
        }
    }

    class extraCallback implements uh27 {
        private extraCallback() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            if (uh3.this.onExtraCallbackWithResult.onWarmupCompleted(ycx41.IAuthTabCallback.Value)) {
                ycx41 ycx41VarOnExtraCallbackWithResult = uh3.this.onExtraCallbackWithResult.onExtraCallbackWithResult();
                if (!uh3.this.onExtraCallbackWithResult.onExtraCallback(new ycx41.IAuthTabCallback[]{ycx41.IAuthTabCallback.FlowEntry, ycx41.IAuthTabCallback.FlowMappingEnd})) {
                    uh3.this.IAuthTabCallbackDefault.onExtraCallback(uh3.this.new writeTypedObject(false));
                    return uh3.this.IAuthTabCallbackStub();
                }
                uh3 uh3Var = uh3.this;
                uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new writeTypedObject(false));
                return uh3.this.onExtraCallbackWithResult((Optional<sya8>) ycx41VarOnExtraCallbackWithResult.asInterface());
            }
            uh3 uh3Var2 = uh3.this;
            uh3Var2.IAuthTabCallbackStub = Optional.of(uh3Var2.new writeTypedObject(false));
            return uh3.this.onExtraCallbackWithResult((Optional<sya8>) uh3.this.onExtraCallbackWithResult.onExtraCallback().onTransact());
        }
    }

    class IAuthTabCallback_Parcel implements uh27 {
        private IAuthTabCallback_Parcel() {
        }

        @Override // o.uh27
        public sya43 onExtraCallbackWithResult() {
            uh3 uh3Var = uh3.this;
            uh3Var.IAuthTabCallbackStub = Optional.of(uh3Var.new writeTypedObject(false));
            uh3 uh3Var2 = uh3.this;
            return uh3Var2.onExtraCallbackWithResult((Optional<sya8>) uh3Var2.onExtraCallbackWithResult.onExtraCallback().onTransact());
        }
    }
}
