package o;

import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q {
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder;
    private final getSupportedHighSpeedResolutions IAuthTabCallback;
    private final getSupportedHighSpeedResolutions asInterface;
    private final getSupportedHighSpeedResolutionsFor onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final getSupportedHighSpeedResolutions onNavigationEvent;
    private final int onWarmupCompleted;

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i2 | i6);
        int i12 = i4 | i11;
        int i13 = (~(i4 | i6)) | (~(i7 | i8 | i9)) | i11 | (~(i2 | i4));
        int i14 = i2 + i6 + i3 + (1272450877 * i5) + ((-51365948) * i);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i2) + 922746880 + ((-1437248296) * i6) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i3) + ((-1881145344) * i5) + ((-578813952) * i) + ((-124846080) * i15);
        int i17 = (i2 * 1187242746) + 1002376400 + (i6 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i3 * 1187242569) + (i5 * (-1484311963)) + (i * 1141305060) + (i15 * 516358144);
        return i16 + ((i17 * i17) * (-861863936)) != 1 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr);
    }

    public r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q(char c, char c2, char c3, float f, float f2, float f3, boolean z, int i) {
        this.onExtraCallbackWithResult = z;
        this.onWarmupCompleted = i;
        this.onExtraCallback = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new Triple(Character.valueOf(c2), Character.valueOf(c), Character.valueOf(c3)), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
        this.asInterface = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f);
        this.IAuthTabCallback = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f2);
        this.onNavigationEvent = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(f3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q(char c, char c2, char c3, float f, float f2, float f3, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        char c4;
        char c5;
        float f4;
        boolean z2;
        if ((i2 & 2) != 0) {
            int i3 = 2 % 2;
            c4 = c;
        } else {
            c4 = c2;
        }
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallbackDefault + 7;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 2;
            } else {
                int i6 = 2 % 2;
            }
            c5 = c;
        } else {
            c5 = c3;
        }
        if ((i2 & 8) != 0) {
            int i7 = asBinder + 99;
            IAuthTabCallbackDefault = i7 % 128;
            f4 = i7 % 2 == 0 ? 1.0f : 0.0f;
        } else {
            f4 = f;
        }
        float f5 = (i2 & 32) != 0 ? 1.0f : f3;
        if ((i2 & 64) != 0) {
            int i8 = asBinder + 17;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(c, c4, c5, f4, f2, f5, z2, i);
    }

    public final boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        boolean z = this.onExtraCallbackWithResult;
        int i5 = i3 + 45;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 47;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.onWarmupCompleted;
        int i5 = i2 + 57;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q = (r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 31;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
            return (Triple) r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q.onExtraCallback.onExtraCallbackWithResult();
        }
        return (Triple) r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q.onExtraCallback.onExtraCallbackWithResult();
    }

    public final void IAuthTabCallback(@NotNull Triple<Character, Character, Character> triple) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(triple, "");
        this.onExtraCallback.IAuthTabCallback(triple);
        int i4 = asBinder + 47;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final float asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.asInterface.onNavigationEvent();
        }
        this.asInterface.onNavigationEvent();
        throw null;
    }

    public final void onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface.onNavigationEvent(f);
        int i4 = IAuthTabCallbackDefault + 115;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 71;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback.onNavigationEvent();
        }
        this.IAuthTabCallback.onNavigationEvent();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q = (r8lambdaz5cx6kKW5oVUv4HxGe5Lgpw92Q) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = asBinder + 55;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaz5cx6kkw5ovuv4hxge5lgpw92q.IAuthTabCallback.onNavigationEvent(fFloatValue);
        int i4 = IAuthTabCallbackDefault + 17;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
        int i4 = IAuthTabCallbackDefault + 67;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return fOnNavigationEvent;
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.onNavigationEvent.onNavigationEvent(f);
            int i3 = 6 / 0;
        } else {
            this.onNavigationEvent.onNavigationEvent(f);
        }
    }

    public final Triple<Character, Character, Character> onExtraCallback() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted3 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (Triple) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 211494076, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{this}, iOnWarmupCompleted3, -211494075);
    }

    public final void onWarmupCompleted(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), -279694215, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, objArr, NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 279694215);
    }
}
