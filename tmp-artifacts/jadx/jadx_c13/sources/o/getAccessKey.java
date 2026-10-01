package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getAccessKey implements UpdatePackage {
    private final UpdatePackageFileType IAuthTabCallback;

    @Override // o.UpdatePackage
    public boolean cg_() {
        return false;
    }

    public getAccessKey(@NotNull UpdatePackageFileType updatePackageFileType) {
        this.IAuthTabCallback = updatePackageFileType;
    }

    @Override // o.UpdatePackage
    public UpdatePackageFileType cf_() {
        return this.IAuthTabCallback;
    }

    public String toString() {
        return super.toString();
    }
}
