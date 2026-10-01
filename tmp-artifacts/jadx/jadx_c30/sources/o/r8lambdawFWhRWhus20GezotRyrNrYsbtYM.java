package o;

import com.google.gson.annotations.SerializedName;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class r8lambdawFWhRWhus20GezotRyrNrYsbtYM {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    @SerializedName("size")
    private TdsButtonV1View.onWarmupCompleted size;

    @SerializedName("style")
    private TdsButtonV1View.IAuthTabCallbackDefault style;

    @SerializedName("type")
    private TdsButtonV1View.IAuthTabCallbackStub type;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 59;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i2 + 99;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdawFWhRWhus20GezotRyrNrYsbtYM)) {
            return false;
        }
        r8lambdawFWhRWhus20GezotRyrNrYsbtYM r8lambdawfwhrwhus20gezotryrnrysbtym = (r8lambdawFWhRWhus20GezotRyrNrYsbtYM) obj;
        if (this.type != r8lambdawfwhrwhus20gezotryrnrysbtym.type) {
            int i8 = i4 + 117;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.size != r8lambdawfwhrwhus20gezotryrnrysbtym.size) {
            return false;
        }
        if (this.style == r8lambdawfwhrwhus20gezotryrnrysbtym.style) {
            return true;
        }
        int i10 = i2 + 97;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.type.hashCode();
        return i3 == 0 ? (((iHashCode / 74) >> this.size.hashCode()) >> 13) << this.style.hashCode() : (((iHashCode * 31) + this.size.hashCode()) * 31) + this.style.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ButtonTheme(type=" + this.type + ", size=" + this.size + ", style=" + this.style + ")";
        int i2 = IAuthTabCallback + 111;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
