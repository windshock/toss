package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import o.uh30;
import org.snakeyaml.engine.v2.resolver.ResolverTuple;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class uh30 implements uh31 {
    protected Map<Character, List<ResolverTuple>> onExtraCallback = new HashMap();
    public static final Pattern onWarmupCompleted = Pattern.compile("^$");
    public static final Pattern onNavigationEvent = Pattern.compile("^\\$\\{\\s*(?:(\\w+)(?:(:?[-?])(\\w+)?)?)\\s*\\}$");

    abstract void onExtraCallbackWithResult();

    public uh30() {
        onExtraCallbackWithResult();
    }

    public void onNavigationEvent(uh25 uh25Var, Pattern pattern, String str) {
        if (str == null) {
            this.onExtraCallback.computeIfAbsent(null, new Function() { // from class: org.snakeyaml.engine.v2.resolver.BaseScalarResolver$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return uh30.onExtraCallback((Character) obj);
                }
            }).add(new ResolverTuple(uh25Var, pattern));
            return;
        }
        for (char c : str.toCharArray()) {
            Character chValueOf = Character.valueOf(c);
            if (c == 0) {
                chValueOf = null;
            }
            List<ResolverTuple> arrayList = this.onExtraCallback.get(chValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.onExtraCallback.put(chValueOf, arrayList);
            }
            arrayList.add(new ResolverTuple(uh25Var, pattern));
        }
    }

    public static /* synthetic */ List onExtraCallback(Character ch) {
        return new ArrayList();
    }

    @Override // o.uh31
    public uh25 onExtraCallbackWithResult(String str, Boolean bool) {
        List<ResolverTuple> list;
        if (!bool.booleanValue()) {
            return uh25.getInterfaceDescriptor;
        }
        if (str.isEmpty()) {
            list = this.onExtraCallback.get((char) 0);
        } else {
            list = this.onExtraCallback.get(Character.valueOf(str.charAt(0)));
        }
        if (list != null) {
            for (ResolverTuple resolverTuple : list) {
                uh25 uh25VarOnExtraCallback = resolverTuple.onExtraCallback();
                if (resolverTuple.onExtraCallbackWithResult().matcher(str).matches()) {
                    return uh25VarOnExtraCallback;
                }
            }
        }
        if (this.onExtraCallback.containsKey(null)) {
            for (ResolverTuple resolverTuple2 : this.onExtraCallback.get(null)) {
                uh25 uh25VarOnExtraCallback2 = resolverTuple2.onExtraCallback();
                if (resolverTuple2.onExtraCallbackWithResult().matcher(str).matches()) {
                    return uh25VarOnExtraCallback2;
                }
            }
        }
        return uh25.getInterfaceDescriptor;
    }
}
