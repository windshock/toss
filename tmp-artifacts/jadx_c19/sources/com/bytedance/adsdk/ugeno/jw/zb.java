package com.bytedance.adsdk.ugeno.jw;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zb {
    private final DataSetObservable ycx = new DataSetObservable();
    private DataSetObserver zb;

    public float ycx(int i2) {
        return 1.0f;
    }

    public abstract int ycx();

    public int ycx(Object obj) {
        return -1;
    }

    public abstract boolean ycx(View view, Object obj);

    public Parcelable zb() {
        return null;
    }

    public Object ycx(ViewGroup viewGroup, int i2) {
        return ycx((View) viewGroup, i2);
    }

    public void ycx(ViewGroup viewGroup, int i2, Object obj) {
        ycx((View) viewGroup, i2, obj);
    }

    @Deprecated
    public Object ycx(View view, int i2) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void ycx(View view, int i2, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void sya() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.zb;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.ycx.notifyChanged();
    }

    void ycx(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.zb = dataSetObserver;
        }
    }
}
