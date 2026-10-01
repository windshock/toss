package o;

import im.toss.splittarget.impl.fsm.AppStateImpl$$ExternalSyntheticLambda11;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class getokhttp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ getokhttp[] $VALUES;
    public static final getokhttp Bg;
    public static final getokhttp Blue;
    public static final getokhttp DarkGrey;
    public static final getokhttp Grey;
    public static final getokhttp None = new getokhttp("None", 0, new deprecated_javaName(0), 1.0f, null, 4, null);
    public static final getokhttp Red;
    public static final getokhttp Teal;
    public static final getokhttp Yellow;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final CipherSuiteCompanion color;
    private final float opacity;
    private final getSpecialFeatureOptInStatus theme;

    private static final /* synthetic */ getokhttp[] $values() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        getokhttp[] getokhttpVarArr = {None, Blue, Yellow, Red, Teal, Grey, Bg, DarkGrey};
        int i5 = i2 + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return getokhttpVarArr;
    }

    public static EnumEntries<getokhttp> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public static getokhttp valueOf(String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getokhttp getokhttpVar = (getokhttp) Enum.valueOf(getokhttp.class, str);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 81;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return getokhttpVar;
    }

    public static getokhttp[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getokhttp[] getokhttpVarArr = (getokhttp[]) $VALUES.clone();
        int i4 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return getokhttpVarArr;
    }

    private getokhttp(String str, int i, CipherSuiteCompanion cipherSuiteCompanion, float f, getSpecialFeatureOptInStatus getspecialfeatureoptinstatus) {
        this.color = cipherSuiteCompanion;
        this.opacity = f;
        this.theme = getspecialfeatureoptinstatus;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ getokhttp(String str, int i, CipherSuiteCompanion cipherSuiteCompanion, float f, getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = onNavigationEvent + 1;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 23;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            getspecialfeatureoptinstatus = null;
        }
        this(str, i, cipherSuiteCompanion, f, getspecialfeatureoptinstatus);
    }

    public final CipherSuiteCompanion getColor() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CipherSuiteCompanion cipherSuiteCompanion = this.color;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return cipherSuiteCompanion;
    }

    public final float getOpacity() {
        float f;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            f = this.opacity;
            int i4 = 52 / 0;
        } else {
            f = this.opacity;
        }
        int i5 = i3 + 63;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final getSpecialFeatureOptInStatus getTheme() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = this.theme;
        int i4 = i3 + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return getspecialfeatureoptinstatus;
    }

    static {
        charset charsetVar = charset.onExtraCallbackWithResult;
        CipherSuiteCompanion cipherSuiteCompanionAsBinder = charsetVar.asBinder();
        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
        Blue = new getokhttp("Blue", 1, cipherSuiteCompanionAsBinder, 0.15f, getspecialfeatureoptinstatus);
        Yellow = new getokhttp("Yellow", 2, new scheme(charsetVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg().IAuthTabCallback(), charsetVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM().onExtraCallbackWithResult()), 0.15f, getspecialfeatureoptinstatus);
        Red = new getokhttp("Red", 3, new scheme(charsetVar.ITrustedWebActivityService().IAuthTabCallback(), charsetVar.ITrustedWebActivityCallback_Parcel().onExtraCallbackWithResult()), 0.15f, getspecialfeatureoptinstatus);
        Teal = new getokhttp("Teal", 4, new scheme(charsetVar.MediaSessionCompatToken().IAuthTabCallback(), charsetVar.MediaSessionCompatResultReceiverWrapper().onExtraCallbackWithResult()), 0.1f, getspecialfeatureoptinstatus);
        int iIAuthTabCallback = charsetVar.prefetchWithMultipleUrls().IAuthTabCallback();
        int iOnWarmupCompleted = AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted();
        Grey = new getokhttp("Grey", 5, new scheme(iIAuthTabCallback, ((CipherSuiteCompanion) charset.onWarmupCompleted(AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), 1621030900, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), -1621030898, iOnWarmupCompleted, AppStateImpl$$ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{charsetVar})).onExtraCallbackWithResult()), 1.0f, getspecialfeatureoptinstatus);
        Bg = new getokhttp("Bg", 6, new scheme(deprecated_scheme.onExtraCallbackWithResult.onNavigationEvent(), matchesCertificate.onExtraCallback.IAuthTabCallback()), 0.5f, null, 4, null);
        DarkGrey = new getokhttp("DarkGrey", 7, charsetVar.receiveFile(), 0.54f, getspecialfeatureoptinstatus);
        getokhttp[] getokhttpVarArr$values = $values();
        $VALUES = getokhttpVarArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(getokhttpVarArr$values);
        int i = onExtraCallback + 31;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }
}
