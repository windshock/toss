package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ko extends lj implements ksy {
    private String onExtraCallback = "*";

    @Override // o.ksy
    public void onNavigationEvent(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.onExtraCallback = str;
    }

    @Override // o.kdr
    public String onNavigationEvent() {
        return this.onExtraCallback;
    }
}
