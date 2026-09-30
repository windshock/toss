package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class kyd extends lj implements lw {
    private short IAuthTabCallback;
    private String onNavigationEvent;

    @Override // o.ln
    public String IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.lw
    public void IAuthTabCallback(String str) {
        this.onNavigationEvent = str;
    }

    @Override // o.lw
    public void onWarmupCompleted(short s) {
        this.IAuthTabCallback = s;
    }
}
