package o;

import java.nio.ByteBuffer;
import o.hz;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class jxj implements hz {
    private hz.onWarmupCompleted IAuthTabCallback;
    private ByteBuffer asInterface = mmq.onExtraCallbackWithResult();
    private boolean onNavigationEvent = true;
    private boolean asBinder = false;
    private boolean onExtraCallback = false;
    private boolean onExtraCallbackWithResult = false;
    private boolean onWarmupCompleted = false;

    public abstract void onExtraCallback() throws gjv;

    public jxj(hz.onWarmupCompleted onwarmupcompleted) {
        this.IAuthTabCallback = onwarmupcompleted;
    }

    @Override // o.hz
    public boolean asBinder() {
        return this.onExtraCallback;
    }

    @Override // o.hz
    public boolean asInterface() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.hz
    public boolean onTransact() {
        return this.onWarmupCompleted;
    }

    @Override // o.hz
    public boolean IAuthTabCallbackStub() {
        return this.onNavigationEvent;
    }

    @Override // o.hz
    public hz.onWarmupCompleted onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    @Override // o.hz
    public ByteBuffer IAuthTabCallback() {
        return this.asInterface;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ optcode:");
        sb.append(onNavigationEvent());
        sb.append(", fin:");
        sb.append(IAuthTabCallbackStub());
        sb.append(", rsv1:");
        sb.append(asBinder());
        sb.append(", rsv2:");
        sb.append(asInterface());
        sb.append(", rsv3:");
        sb.append(onTransact());
        sb.append(", payloadlength:[pos:");
        sb.append(this.asInterface.position());
        sb.append(", len:");
        sb.append(this.asInterface.remaining());
        sb.append("], payload:");
        sb.append(this.asInterface.remaining() > 1000 ? "(too big to display)" : new String(this.asInterface.array()));
        sb.append('}');
        return sb.toString();
    }

    public void onWarmupCompleted(ByteBuffer byteBuffer) {
        this.asInterface = byteBuffer;
    }

    public void IAuthTabCallback(boolean z) {
        this.onNavigationEvent = z;
    }

    public void onExtraCallback(boolean z) {
        this.onExtraCallback = z;
    }

    public void onWarmupCompleted(boolean z) {
        this.onExtraCallbackWithResult = z;
    }

    public void onNavigationEvent(boolean z) {
        this.onWarmupCompleted = z;
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.asBinder = z;
    }

    /* renamed from: o.jxj$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[hz.onWarmupCompleted.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[hz.onWarmupCompleted.PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[hz.onWarmupCompleted.PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onWarmupCompleted[hz.onWarmupCompleted.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onWarmupCompleted[hz.onWarmupCompleted.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onWarmupCompleted[hz.onWarmupCompleted.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onWarmupCompleted[hz.onWarmupCompleted.CONTINUOUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static jxj onWarmupCompleted(hz.onWarmupCompleted onwarmupcompleted) {
        if (onwarmupcompleted == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (AnonymousClass2.onWarmupCompleted[onwarmupcompleted.ordinal()]) {
            case 1:
                return new jvd();
            case 2:
                return new jf();
            case 3:
                return new jl();
            case 4:
                return new hh();
            case 5:
                return new ixr();
            case 6:
                return new Cif();
            default:
                throw new IllegalArgumentException("Supplied opcode is invalid");
        }
    }
}
