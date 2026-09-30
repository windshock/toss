package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import net.sf.scuba.smartcards.BuildConfig;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class readPercent extends createPAGLogoViewByMaterial {
    public readPercent(setVideoAdInteractionListener setvideoadinteractionlistener) {
        super(setvideoadinteractionlistener);
        this.onExtraCallbackWithResult.put(uh25.onTransact, new onWarmupCompleted());
        this.onExtraCallbackWithResult.put(uh25.getInterfaceDescriptor, new IAuthTabCallback());
        this.onExtraCallbackWithResult.put(uh25.IAuthTabCallbackStub, new onExtraCallback());
        this.onExtraCallbackWithResult.put(uh25.asBinder, new onExtraCallbackWithResult());
        this.onExtraCallbackWithResult.put(uh25.IAuthTabCallback, new onNavigationEvent());
        this.onExtraCallbackWithResult.putAll(setvideoadinteractionlistener.access000().onExtraCallback());
        this.onExtraCallbackWithResult.putAll(setvideoadinteractionlistener.IAuthTabCallbackStubProxy());
    }

    protected void onExtraCallbackWithResult(uh17 uh17Var) {
        asBinder(uh17Var);
    }

    protected void asBinder(uh17 uh17Var) {
        List<uh24> listOnWarmupCompleted = uh17Var.onWarmupCompleted();
        HashMap map = new HashMap(listOnWarmupCompleted.size());
        TreeSet treeSet = new TreeSet();
        int i = 0;
        for (uh24 uh24Var : listOnWarmupCompleted) {
            Object objOnNavigationEvent = onNavigationEvent(uh24Var.onExtraCallback(), uh17Var.onNavigationEvent(), uh24Var.onExtraCallback().onNavigationEvent());
            Integer num = (Integer) map.put(objOnNavigationEvent, Integer.valueOf(i));
            if (num != null) {
                if (!this.IAuthTabCallback.onNavigationEvent()) {
                    throw new uh10(uh17Var.onNavigationEvent(), objOnNavigationEvent, uh24Var.onExtraCallback().onNavigationEvent());
                }
                treeSet.add(num);
            }
            i++;
        }
        Iterator itDescendingIterator = treeSet.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            listOnWarmupCompleted.remove(((Integer) itDescendingIterator.next()).intValue());
        }
    }

    private Object onNavigationEvent(uh2 uh2Var, Optional<sya8> optional, Optional<sya8> optional2) {
        Object objIAuthTabCallback = IAuthTabCallback(uh2Var);
        if (objIAuthTabCallback == null) {
            return objIAuthTabCallback;
        }
        try {
            objIAuthTabCallback.hashCode();
            return objIAuthTabCallback;
        } catch (Exception e) {
            throw new sya9("while constructing a mapping", optional, "found unacceptable key " + objIAuthTabCallback, optional2, e);
        }
    }

    @Override // o.createPAGLogoViewByMaterial
    protected void onWarmupCompleted(uh17 uh17Var, Map<Object, Object> map) {
        onExtraCallbackWithResult(uh17Var);
        super.onWarmupCompleted(uh17Var, map);
    }

    @Override // o.createPAGLogoViewByMaterial
    protected void onWarmupCompleted(uh17 uh17Var, Set<Object> set) {
        onExtraCallbackWithResult(uh17Var);
        super.onWarmupCompleted(uh17Var, set);
    }

    public class onWarmupCompleted implements setAdCreativeClickListener {
        public onWarmupCompleted() {
        }

        @Override // o.setAdCreativeClickListener
        public Object onExtraCallbackWithResult(uh2 uh2Var) {
            if (uh2Var.IAuthTabCallbackDefault()) {
                return readPercent.this.onWarmupCompleted.containsKey(uh2Var) ? readPercent.this.onWarmupCompleted.get(uh2Var) : readPercent.this.onExtraCallback((uh17) uh2Var);
            }
            return readPercent.this.IAuthTabCallback((uh17) uh2Var);
        }

        @Override // o.setAdCreativeClickListener
        public void onExtraCallback(uh2 uh2Var, Object obj) {
            if (uh2Var.IAuthTabCallbackDefault()) {
                readPercent.this.onWarmupCompleted((uh17) uh2Var, (Set<Object>) obj);
                return;
            }
            throw new uh16("Unexpected recursive set structure. Node: " + uh2Var);
        }
    }

    public class IAuthTabCallback extends getLoadingProgressBar {
        public IAuthTabCallback() {
        }

        @Override // o.setAdCreativeClickListener
        public Object onExtraCallbackWithResult(uh2 uh2Var) {
            return onExtraCallback(uh2Var);
        }
    }

    public class onExtraCallback implements setAdCreativeClickListener {
        public onExtraCallback() {
        }

        @Override // o.setAdCreativeClickListener
        public Object onExtraCallbackWithResult(uh2 uh2Var) {
            uh21 uh21Var = (uh21) uh2Var;
            if (uh2Var.IAuthTabCallbackDefault()) {
                return readPercent.this.onExtraCallbackWithResult(uh21Var);
            }
            return readPercent.this.onNavigationEvent(uh21Var);
        }

        @Override // o.setAdCreativeClickListener
        public void onExtraCallback(uh2 uh2Var, Object obj) {
            if (uh2Var.IAuthTabCallbackDefault()) {
                readPercent.this.onWarmupCompleted((uh21) uh2Var, (List) obj);
                return;
            }
            throw new uh16("Unexpected recursive sequence structure. Node: " + uh2Var);
        }
    }

    public class onExtraCallbackWithResult implements setAdCreativeClickListener {
        public onExtraCallbackWithResult() {
        }

        @Override // o.setAdCreativeClickListener
        public Object onExtraCallbackWithResult(uh2 uh2Var) {
            uh17 uh17Var = (uh17) uh2Var;
            if (uh2Var.IAuthTabCallbackDefault()) {
                return readPercent.this.onWarmupCompleted(uh17Var);
            }
            return readPercent.this.onNavigationEvent(uh17Var);
        }

        @Override // o.setAdCreativeClickListener
        public void onExtraCallback(uh2 uh2Var, Object obj) {
            if (uh2Var.IAuthTabCallbackDefault()) {
                readPercent.this.onWarmupCompleted((uh17) uh2Var, (Map<Object, Object>) obj);
                return;
            }
            throw new uh16("Unexpected recursive mapping structure. Node: " + uh2Var);
        }
    }

    public class onNavigationEvent extends getLoadingProgressBar {
        public onNavigationEvent() {
        }

        @Override // o.setAdCreativeClickListener
        public Object onExtraCallbackWithResult(uh2 uh2Var) {
            String strOnExtraCallback = onExtraCallback(uh2Var);
            Optional<sya29> optionalIAuthTabCallbackDefault = readPercent.this.IAuthTabCallback.IAuthTabCallbackDefault();
            if (!optionalIAuthTabCallbackDefault.isPresent()) {
                return strOnExtraCallback;
            }
            sya29 sya29Var = optionalIAuthTabCallbackDefault.get();
            Matcher matcher = uh30.onNavigationEvent.matcher(strOnExtraCallback);
            matcher.matches();
            final String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(3);
            if (strGroup2 == null) {
                strGroup2 = BuildConfig.FLAVOR;
            }
            final String str = strGroup2;
            final String strGroup3 = matcher.group(2);
            final String strOnExtraCallbackWithResult = onExtraCallbackWithResult(strGroup);
            return sya29Var.onNavigationEvent(strGroup, strGroup3, str, strOnExtraCallbackWithResult).orElseGet(new Supplier() { // from class: org.snakeyaml.engine.v2.constructor.StandardConstructor$ConstructEnv$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f$0.onWarmupCompleted(strGroup, strGroup3, str, strOnExtraCallbackWithResult);
                }
            });
        }

        public String onWarmupCompleted(String str, String str2, String str3, String str4) {
            if (str4 != null && !str4.isEmpty()) {
                return str4;
            }
            if (str2 != null) {
                if (str2.equals("?") && str4 == null) {
                    throw new uh14("Missing mandatory variable " + str + ": " + str3);
                }
                if (str2.equals(":?")) {
                    if (str4 == null) {
                        throw new uh14("Missing mandatory variable " + str + ": " + str3);
                    }
                    if (str4.isEmpty()) {
                        throw new uh14("Empty mandatory variable " + str + ": " + str3);
                    }
                }
                if (str2.startsWith(":")) {
                    if (str4 != null && !str4.isEmpty()) {
                        return BuildConfig.FLAVOR;
                    }
                } else if (str4 != null) {
                    return BuildConfig.FLAVOR;
                }
                return str3;
            }
            return BuildConfig.FLAVOR;
        }

        public String onExtraCallbackWithResult(String str) {
            return System.getenv(str);
        }
    }
}
