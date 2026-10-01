package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class setClickCreativeListener extends getRenderEngineCacheType {
    private static final long serialVersionUID = -6284832275113680002L;
    private final jc6 scope;

    @Override // o.getRenderEngineCacheType
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        jc6 jc6Var = this.scope;
        jc6 jc6Var2 = ((setClickCreativeListener) obj).scope;
        return jc6Var == null ? jc6Var2 == null : jc6Var.equals(jc6Var2);
    }

    @Override // o.getRenderEngineCacheType
    public int hashCode() {
        return onExtraCallback().hashCode() ^ this.scope.hashCode();
    }
}
