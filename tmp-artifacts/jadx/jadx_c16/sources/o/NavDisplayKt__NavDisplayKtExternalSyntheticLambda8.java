package o;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class NavDisplayKt__NavDisplayKtExternalSyntheticLambda8 extends RuntimeException {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Throwable f0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final PresentationStateExternalSyntheticLambda0 f1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f2;

    public NavDisplayKt__NavDisplayKtExternalSyntheticLambda8(String str, PresentationStateExternalSyntheticLambda0 presentationStateExternalSyntheticLambda0, Throwable th) {
        this.f2 = str;
        this.f1 = presentationStateExternalSyntheticLambda0;
        this.f0 = th;
    }

    public abstract String IAuthTabCallback();

    public final void IAuthTabCallback(String str) {
        MediaNotificationManagerExternalSyntheticLambda1.onWarmupCompleted(str, this.f2, (Throwable) null, this);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(IAuthTabCallback());
        sb.append(StringFog.decrypt("Y8w=\n", "Wey8L/O212k=\n"));
        sb.append(this.f2);
        sb.append('\n');
        sb.append(this.f1);
        if (this.f0 != null) {
            str = StringFog.decrypt("KSN6wqgJhP9BGSGX\n", "I2Abt9ts4N8=\n") + Log.getStackTraceString(this.f0);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
