package o;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.naver.maps.geometry.LatLng;
import com.naver.maps.geometry.LatLngBounds;
import com.naver.maps.map.CameraPosition;
import com.naver.maps.map.NaverMap;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class findViewByPosition {
    private static final PointF onExtraCallbackWithResult = new PointF(0.5f, 0.5f);
    private PointF IAuthTabCallback;
    private onNavigationEvent IAuthTabCallbackDefault;
    private onExtraCallbackWithResult asBinder;
    private long onExtraCallback;
    private PointF onNavigationEvent;
    private int onTransact;
    private getExtraLayoutSpace onWarmupCompleted;

    static double onWarmupCompleted(double d, double d2) {
        double d3 = d2 - d;
        return d3 > 180.0d ? d2 - 360.0d : d3 < -180.0d ? d2 + 360.0d : d2;
    }

    abstract onWarmupCompleted onExtraCallback(@NonNull NaverMap naverMap);

    boolean onNavigationEvent() {
        return false;
    }

    static double onNavigationEvent(double d) {
        double dOnNavigationEvent = findFirstVisibleItemPosition.onNavigationEvent(d, -180.0d, 180.0d);
        if (dOnNavigationEvent == -180.0d) {
            return 180.0d;
        }
        return dOnNavigationEvent;
    }

    public static findViewByPosition onExtraCallback(@NonNull findReferenceChild findreferencechild) {
        return new IAuthTabCallback(findreferencechild, (AnonymousClass4) null);
    }

    public static findViewByPosition onExtraCallbackWithResult(@NonNull CameraPosition cameraPosition) {
        return new asBinder(cameraPosition, (AnonymousClass4) null);
    }

    public static findViewByPosition onWarmupCompleted(@NonNull LatLng latLng) {
        return onExtraCallback(new findReferenceChild().onExtraCallbackWithResult(latLng));
    }

    public static findViewByPosition onExtraCallback(@NonNull PointF pointF) {
        return onExtraCallback(new findReferenceChild().onNavigationEvent(pointF));
    }

    public static findViewByPosition onWarmupCompleted(double d) {
        return onExtraCallback(new findReferenceChild().asInterface(d));
    }

    public static findViewByPosition IAuthTabCallback(double d) {
        return onExtraCallback(new findReferenceChild().onExtraCallback(d));
    }

    public static findViewByPosition IAuthTabCallback() {
        return onExtraCallback(new findReferenceChild().onExtraCallbackWithResult());
    }

    public static findViewByPosition onExtraCallbackWithResult() {
        return onExtraCallback(new findReferenceChild().onExtraCallback());
    }

    public static findViewByPosition onNavigationEvent(@NonNull LatLngBounds latLngBounds, int i) {
        return onExtraCallbackWithResult(latLngBounds, i, i, i, i);
    }

    public static findViewByPosition onExtraCallbackWithResult(@NonNull LatLngBounds latLngBounds, int i, int i2, int i3, int i4) {
        return new onExtraCallback(latLngBounds, i, i2, i3, i4, (AnonymousClass4) null);
    }

    private findViewByPosition() {
        this.IAuthTabCallback = onExtraCallbackWithResult;
        this.onWarmupCompleted = getExtraLayoutSpace.None;
        this.onTransact = 0;
    }

    findViewByPosition IAuthTabCallback(@NonNull PointF pointF) {
        this.onNavigationEvent = pointF;
        this.IAuthTabCallback = null;
        return this;
    }

    public findViewByPosition onExtraCallbackWithResult(@NonNull getExtraLayoutSpace getextralayoutspace) {
        return onExtraCallback(getextralayoutspace, -1L);
    }

    public findViewByPosition onExtraCallback(@NonNull getExtraLayoutSpace getextralayoutspace, long j) {
        this.onWarmupCompleted = getextralayoutspace;
        this.onExtraCallback = j;
        return this;
    }

    public findViewByPosition onWarmupCompleted(int i) {
        this.onTransact = i;
        return this;
    }

    public findViewByPosition onExtraCallback(@Nullable onNavigationEvent onnavigationevent) {
        this.IAuthTabCallbackDefault = onnavigationevent;
        return this;
    }

    public findViewByPosition onWarmupCompleted(@Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        this.asBinder = onextracallbackwithresult;
        return this;
    }

    getExtraLayoutSpace onExtraCallback() {
        return this.onWarmupCompleted;
    }

    long onNavigationEvent(long j) {
        long j2 = this.onExtraCallback;
        return j2 == -1 ? j : j2;
    }

    int onWarmupCompleted() {
        return this.onTransact;
    }

    onNavigationEvent IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackDefault;
    }

    onExtraCallbackWithResult onTransact() {
        return this.asBinder;
    }

    PointF onExtraCallbackWithResult(@NonNull NaverMap naverMap) {
        PointF pointF = this.onNavigationEvent;
        if (pointF != null) {
            return pointF;
        }
        PointF pointF2 = this.IAuthTabCallback;
        if (pointF2 == null || onExtraCallbackWithResult.equals(pointF2)) {
            return null;
        }
        int[] iArrAccess100 = naverMap.access100();
        float fExtraCallback = (naverMap.extraCallback() - iArrAccess100[1]) - iArrAccess100[3];
        float fExtraCommand = (naverMap.extraCommand() - iArrAccess100[0]) - iArrAccess100[2];
        PointF pointF3 = this.IAuthTabCallback;
        return new PointF((fExtraCommand * pointF3.x) + iArrAccess100[0], (fExtraCallback * pointF3.y) + iArrAccess100[1]);
    }
}
