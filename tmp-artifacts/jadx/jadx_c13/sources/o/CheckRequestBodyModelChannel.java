package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class CheckRequestBodyModelChannel implements UpdatePackage {
    private final boolean IAuthTabCallback;

    @Override // o.UpdatePackage
    public UpdatePackageFileType cf_() {
        return null;
    }

    public CheckRequestBodyModelChannel(boolean z) {
        this.IAuthTabCallback = z;
    }

    @Override // o.UpdatePackage
    public boolean cg_() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(cg_() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
