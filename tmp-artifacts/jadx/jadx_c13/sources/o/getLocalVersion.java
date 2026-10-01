package o;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getLocalVersion extends setFullPackage implements waitForLayout {
    private final boolean onExtraCallback;

    @Override // o.setFullPackage
    public boolean cp_() {
        return true;
    }

    public getLocalVersion(@Nullable getPackageType getpackagetype) {
        super(true);
        onExtraCallbackWithResult(getpackagetype);
        this.onExtraCallback = onTransact();
    }

    @Override // o.setFullPackage
    public boolean cj_() {
        return this.onExtraCallback;
    }

    @Override // o.waitForLayout
    public boolean onWarmupCompleted() {
        return IAuthTabCallbackStub(Unit.INSTANCE);
    }

    @Override // o.waitForLayout
    public boolean onExtraCallback(@NotNull Throwable th) {
        return IAuthTabCallbackStub(new ILoader(th, false, 2, null));
    }

    private final boolean onTransact() {
        setFullPackage setfullpackageIAuthTabCallback;
        resumeMyRequest resumemyrequestExtraCallbackWithResult = extraCallbackWithResult();
        setTagId settagid = resumemyrequestExtraCallbackWithResult instanceof setTagId ? (setTagId) resumemyrequestExtraCallbackWithResult : null;
        if (settagid == null || (setfullpackageIAuthTabCallback = settagid.IAuthTabCallback()) == null) {
            return false;
        }
        while (!setfullpackageIAuthTabCallback.cj_()) {
            resumeMyRequest resumemyrequestExtraCallbackWithResult2 = setfullpackageIAuthTabCallback.extraCallbackWithResult();
            setTagId settagid2 = resumemyrequestExtraCallbackWithResult2 instanceof setTagId ? (setTagId) resumemyrequestExtraCallbackWithResult2 : null;
            if (settagid2 == null || (setfullpackageIAuthTabCallback = settagid2.IAuthTabCallback()) == null) {
                return false;
            }
        }
        return true;
    }
}
