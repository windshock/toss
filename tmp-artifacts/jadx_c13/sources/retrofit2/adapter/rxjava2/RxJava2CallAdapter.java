package retrofit2.adapter.rxjava2;

import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.CertEncType;
import o.MapConverter;
import o.getByteBuffer;
import o.getExtensionNames;
import o.getIvA;
import o.getSignPrikeyCCFBPHFilename;
import o.wasNull;
import retrofit2.CallAdapter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean IAuthTabCallback;
    private final boolean IAuthTabCallbackStub;

    @Nullable
    private final MapConverter asBinder;
    private final Type asInterface;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final boolean onTransact;
    private final boolean onWarmupCompleted;

    RxJava2CallAdapter(Type type, @Nullable MapConverter mapConverter, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.asInterface = type;
        this.asBinder = mapConverter;
        this.onExtraCallbackWithResult = z;
        this.IAuthTabCallbackStub = z2;
        this.onNavigationEvent = z3;
        this.onWarmupCompleted = z4;
        this.onTransact = z5;
        this.onExtraCallback = z6;
        this.IAuthTabCallback = z7;
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.asInterface;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // retrofit2.CallAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object adapt(getSignPrikeyCCFBPHFilename<R> getsignprikeyccfbphfilename) {
        CertEncType getextensionnames;
        MapConverter mapConverter;
        CertEncType certEncType = this.onExtraCallbackWithResult ? new CertEncType(getsignprikeyccfbphfilename) : new getIvA(getsignprikeyccfbphfilename);
        if (this.IAuthTabCallbackStub) {
            getextensionnames = new ResultObservable(certEncType);
        } else {
            if (this.onNavigationEvent) {
                getextensionnames = new getExtensionNames(certEncType);
            }
            mapConverter = this.asBinder;
            if (mapConverter != null) {
                certEncType = certEncType.onNavigationEvent(mapConverter);
            }
            if (!this.onWarmupCompleted) {
                return certEncType.IAuthTabCallback(wasNull.MISSING);
            }
            if (this.onTransact) {
                return certEncType.extraCallback();
            }
            if (this.onExtraCallback) {
                return certEncType.readTypedObject();
            }
            if (this.IAuthTabCallback) {
                return certEncType.access000();
            }
            return RxJavaPlugins.onExtraCallback((getByteBuffer) certEncType);
        }
        certEncType = getextensionnames;
        mapConverter = this.asBinder;
        if (mapConverter != null) {
        }
        if (!this.onWarmupCompleted) {
        }
    }
}
